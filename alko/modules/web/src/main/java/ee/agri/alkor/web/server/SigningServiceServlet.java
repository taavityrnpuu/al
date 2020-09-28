package ee.agri.alkor.web.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import ee.agri.alkor.impl.PostgreUtils;
import ee.agri.alkor.impl.ResultSet;
import ee.agri.alkor.model.SigningSessionData;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.siga.CreateHashcodeContainerRemoteSigningResponse;
import ee.agri.alkor.siga.SigaServiceImpl;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;

@SuppressWarnings("serial")
public class SigningServiceServlet extends HttpServlet{

	private static Logger LOGGER = Logger.getLogger(SigningServiceServlet.class);
	
	public SigningSessionData session;

	public void init() throws ServletException {
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isError = false;

		PrintWriter out = response.getWriter();

		String id = null;
		String path = null;
		String mime = null;
		String applId = null;
		String name = null;

		HttpSession sess = request.getSession();
		try {
			if ((Boolean) sess.getAttribute("fileSigner")) {
				session = (SigningSessionData) sess.getAttribute("fileSigner");
			} else {
				session = new SigningSessionData();
			}
		} catch (Exception e) {
			session = new SigningSessionData();
		}

		String docName = null;
		int appId = 0;

		try {
			docName = request.getParameter("docname");
			appId = Integer.valueOf(request.getParameter("appid"));

			if (docName.equals("") || docName == null) {
				throw new Exception("docName is empty!");
			}

			/**
			 * Faililaiend tuleb eemaldada p�ringu jaoks
			 */
			docName = docName.replace("Ãµ", "õ").replace(".pdf", "");

			String sql = "select * from reg_doc where name like '%" + docName.substring(2) + "' and doc_appl_id = "
					+ appId;

			ResultSet rs = null;

			try {
				rs = PostgreUtils.query(sql);
				// RS olemas, n�itame lehte
			} catch (Exception e) {
				out.write(e.toString());
				throw e;
			}

			try {
				while (rs.next()) {
					id = rs.getString("id");
					path = rs.getString("path");
					mime = rs.getString("mime");
					applId = rs.getString("doc_appl_id");
					name = rs.getString("name");
				}
			} catch (Exception ex) {
				out.write(ex.toString());
				throw ex;
			}

			sess.setAttribute("docId", id);
			sess.setAttribute("docPath", path);
			sess.setAttribute("docMime", mime);
			sess.setAttribute("applId", applId);
			sess.setAttribute("docName", name);

		} catch (Exception ex) {
			ex.printStackTrace();
			isError = true;
		}

		// docName = docName.replace('_', '/');

		/**
		 * docname j�rgi on vaja k�sida tee kettal, id ja k�ik muu failiga seonduv.
		 */

		String teade = "Toimub allkirjastamine, palun oota.";
		String klass = "alert-info";
		if (isError) {
			teade = "Allkirjastamisel tekkis viga, palun sulgege veebilehitseja aken ja proovige uuesti.";
			klass = "alert-danger";
		}

		/**
		 * PEAB OLEMA SISSELOGINUD AMETNIKUNA V�I ADMININA
		 */

		String template = "";
		try {
			template = getTemplate("template_signing.html");
			template = template.replace("{{TEADE}}", teade);
			template = template.replace("{{KLASS}}", klass);
			template = template.replace("{{TYPE}}", (docName.contains("tsus") ? "Otsus" : "Oiend"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.write(template.replace("DOC_ID_SIIA", ""));

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession sess = request.getSession();

		session = (SigningSessionData) sess.getAttribute("fileSigner");

		sess.setAttribute("fileSigner", session);

		String uri = request.getRequestURI();
		uri = uri.replace("//", "/");
		
		SigaServiceImpl siga = new SigaServiceImpl(ServiceFactory.getRegistryService().getTrustStore(), ServiceFactory.getRegistryService().getTrustStorePassword());		
		
		String docId = (String) sess.getAttribute("docId");
		String docPath = (String) sess.getAttribute("docPath");
		String docName = (String) sess.getAttribute("docName");
		
		LOGGER.debug("URI: " + uri);
		
		try {
			if (uri.endsWith("/generateContainer")) {
	
				String certInHex = (String) request.getParameter("certInHex");

				LOGGER.debug("docPath: " + docPath);
				
				File file = new File(docPath);
				String containerId = siga.createContainer(file);
				
				LOGGER.debug("containerId: " + containerId);
				
				CreateHashcodeContainerRemoteSigningResponse hashResponse = siga.signContainer(containerId, certInHex);
	            MessageDigest messageDigest = MessageDigest.getInstance(DigestAlgorithm.valueOf(hashResponse.getDigestAlgorithm()).getJavaName());

				LOGGER.debug("digestAlgorithm: " + hashResponse.getDigestAlgorithm());
				LOGGER.debug("dataToSign: " + hashResponse.getDataToSign());
				LOGGER.debug("generatedSignatureId: " + hashResponse.getGeneratedSignatureId());
				
				StringBuilder sb = new StringBuilder();
				sb.append("{");
				sb.append(makeJsonPair("result", "ok") + ",");
				sb.append(makeJsonPair("containerId", containerId) + ",");
				sb.append(makeJsonPair("digestAlgorithm", DigestAlgorithm.valueOf(hashResponse.getDigestAlgorithm()).getJavaName()) + ",");
				sb.append(makeJsonPair("dataToSignHash", new String(Base64.getEncoder().encode(messageDigest.digest(Base64.getDecoder().decode(hashResponse.getDataToSign()))))) + ",");
				sb.append(makeJsonPair("generatedSignatureId", hashResponse.getGeneratedSignatureId()));
				sb.append("}");
				
				LOGGER.debug("RESPONSE: " + sb.toString());
	
				out.write(sb.toString());
	
			} else if (uri.endsWith("/finalizeSigning")) {
				String signatureInHex = (String) request.getParameter("signatureInHex");
				String signatureId = (String) request.getParameter("signatureId");
				String containerId = (String) request.getParameter("containerId");
				
				byte[] decodeResult = siga.finalizeSignature(containerId, signatureId, signatureInHex);

				String asiceName = docName + " (asice)";
				String asicePath = docPath.replace(".pdf", "(allkirjastatud).asice");

				// salvestame containeri
				FileOutputStream tmp_stream = new FileOutputStream(asicePath);
				tmp_stream.write(decodeResult);
				tmp_stream.close();
				
				// lisame containerisse ka algse faili
				appendFilesToAsice(new File(asicePath), new File[] {new File(docPath)});
				
				try {
					File asice = new File(asicePath);
					
					PostgreUtils.insert(
							"insert into reg_doc (id, version, modified, created, created_by, modified_by, deleted, deleted_by, name, path, mime, doc_appl_id, doc_class_id) "
							+ "select nextval('reg_doc_seq') as id, version, NOW(), NOW(), created_by, modified_by, deleted, "
							+ "		deleted_by, '"+ asiceName + "' as name, '" + asicePath+ "' as path, 'application/vnd.etsi.asic-e+zip' as mime, doc_appl_id, doc_class_id "
							+ "from reg_doc where id = " + docId + ";");
				} catch (Exception e) {
					out.write(e.toString());

				}

				StringBuilder sb = new StringBuilder();
				sb.append("{");
				sb.append(makeJsonPair("result", "ok"));
				sb.append("}");
				
				LOGGER.debug("RESPONSE: " + sb.toString());

				out.write(sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);

			StringBuilder sb = new StringBuilder();
			sb.append("{");
			sb.append(makeJsonPair("result", "fail"));
			sb.append("}");

			out.write(sb.toString());
		}
	}
	
	public static void appendFilesToAsice(File zipFile, File[] files) throws IOException {
	    File tempFile = File.createTempFile(zipFile.getName(), null);
	    tempFile.delete();

	    zipFile.renameTo(tempFile);
	    byte[] buf = new byte[1024];

	    ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
	    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));

	    // kopeerime olemasolevad
	    ZipEntry entry = zin.getNextEntry();
	    while (entry != null) {
	        String name = entry.getName();
	        boolean notInFiles = true;
	        for (File f : files) {
	            if (f.getName().equals(name)) {
	                notInFiles = false;
	                break;
	            }
	        }
	        if (notInFiles) {
	            out.putNextEntry(new ZipEntry(name));
	            int len;
	            while ((len = zin.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	        }
	        entry = zin.getNextEntry();
	    }
	    zin.close();
	    
	    // lisame uued failid
	    for (int i = 0; i < files.length; i++) {
	        InputStream in = new FileInputStream(files[i]);
	        out.putNextEntry(new ZipEntry(files[i].getName()));
	        int len;
	        while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	        }
	        out.closeEntry();
	        in.close();
	    }
	    out.close();
	    tempFile.delete();
	}

	public String getTemplate(String tmpl) throws Exception {
		URL url = this.getServletContext().getResource(tmpl);
		File file = new File(URLDecoder.decode(url.getPath(), "UTF-8")); // decode, et ka tühikutega teede peal töötaks
		FileInputStream fis = new FileInputStream(file);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		String inputLine;

		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine + "\n");
		}

		in.close();
		return response.toString();
	}

	private String makeJsonPair(String key, String value) {
		return "\"" + key + "\": \"" + value + "\"";
	}

}
