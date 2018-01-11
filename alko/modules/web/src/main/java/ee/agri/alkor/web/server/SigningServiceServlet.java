package ee.agri.alkor.web.server;

import static org.apache.commons.lang.StringEscapeUtils.escapeXml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.Principal;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.sql.Connection;
import java.sql.DriverManager;
import ee.agri.alkor.impl.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;


import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.httpclient.util.DateParseException;
import org.apache.log4j.Logger;
import org.digidoc4j.Container;
import org.digidoc4j.DataFile;
import org.digidoc4j.DataToSign;

import com.google.gwt.core.ext.typeinfo.ParseException;

import ee.agri.alkor.impl.FileSigner;
import ee.agri.alkor.impl.PostgreUtils;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.Digest;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.Result;
import ee.agri.alkor.model.SigningSessionData;

import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;
import ee.agri.alkor.xtee.impl.DigidocServiceImpl;
import ee.agri.alkor.xtee.impl.SigningObject;
import ee.agri.alkor.util.*;
import ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DataFileData;
import ee.agri.alkor.impl.Config;

import org.apache.commons.collections.*;
import org.apache.commons.collections4.CollectionUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class SigningServiceServlet extends HttpServlet {
	Connection c = null;
	Statement stmt = null;
	Statement stmt2 = null;
	public FileSigner signer;
	public SigningSessionData session;

	public void init() throws ServletException {
		this.signer = new FileSigner();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
	
		try{
			docName = request.getParameter("docname");
			appId = Integer.valueOf(request.getParameter("appid"));
			
			if(docName.equals("") || docName == null){
				throw new Exception("docName is empty!");
			}
			
			/**
			 * Faililaiend tuleb eemaldada p�ringu jaoks
			 */
			docName = docName.replace("Ãµ", "õ").replace(".pdf", "");
			
			String sql = "select * from reg_doc where name like '%" + docName.substring(2) + "' and doc_appl_id = " + appId;
			
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
			
		} catch (Exception ex){
			ex.printStackTrace();
			isError = true;
		}
		
		
		
		

		

		// docName = docName.replace('_', '/');

		/**
		 * docname j�rgi on vaja k�sida tee kettal, id ja k�ik muu failiga
		 * seonduv.
		 */

		

		/**
		 * PEAB OLEMA SISSELOGINUD AMETNIKUNA V�I ADMININA
		 */
		
		String template = null;

		if(!isError){
			template = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta charset=\"UTF-8\">\r\n<title>Faili digiallkirjastamine</title>\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n<script src=\"hwcrypto.js\"></script>\r\n<script src=\"hwcrypto-legacy.js\"></script>\r\n<script src=\"hex2base.js\"></script>\r\n<script src=\"app.js\"></script>\r\n<style>\r\n.loader {\r\n  border: 16px solid #333333;\r\n  border-radius: 50%;\r\n  border-top: 16px solid #4AA02C;\r\n  border-bottom: 16px solid #4AA02C;\r\n  width: 120px;\r\n  height: 120px;\r\n  -webkit-animation: spin 2s linear infinite;\r\n  animation: spin 2s linear infinite;\r\n}\r\n\r\n@-webkit-keyframes spin {\r\n  0% { -webkit-transform: rotate(0deg); }\r\n  100% { -webkit-transform: rotate(360deg); }\r\n}\r\n\r\n@keyframes spin {\r\n  0% { transform: rotate(0deg); }\r\n  100% { transform: rotate(360deg); }\r\n}\r\n\r\n.center-div\r\n{\r\n  position: absolute;\r\n  margin: auto;\r\n  top: 0;\r\n  right: 0;\r\n  bottom: 0;\r\n  left: 0;\r\n  width: 100px;\r\n  height: 100px; \r\n}\r\n</style>\r\n<script>\r\nfunction showError(errorCode){\r\n\t\t$(\"#message\").removeClass(\"alert-info\");\r\n\t\t$(\"#message\").addClass(\"alert-danger\");\r\n\t\t$(\"#message\").find(\"center\").html(\"Allkirjastamisel tekkis viga, palun sulgege veebilehitseja aken ja proovige uuesti. (Viga \" + errorCode + \")\");\r\n\t\t$(\"#loader\").hide();\r\n}\r\n\r\nfunction showSuccess(){\r\n\t$(\"#message\").removeClass(\"alert-info\");\r\n\t$(\"#message\").addClass(\"alert-success\");\r\n\t$(\"#message\").find(\"center\").html(\"Fail on allkirjastatud! Aken sulgub automaatselt!\");\r\n\t$(\"#loader\").hide();\r\n\tsetTimeout(function(){ window.top.close(); }, 3000);\t\r\n}\r\n</script>\r\n</head>\r\n<body bgcolor=\"#333333\" onload=\"sign();\">\r\n<div style=\"color:#000; height:80px;\">\r\n<div style=\"float:left; margin-left:20px;\">\r\n<img src=\"images/0_veterinaar_vapp_est_85px.png\">\r\n</div>\r\n<div style=\"float:right;color:#000;margin:33px 20px;font-size:1.0em; font-family:Arial;\">RIIKLIK ALKOHOLIREGISTER</div>\r\n</div>\r\n  <div id=\"message\" class=\"alert alert-info\">\r\n   <center>Toimub allkirjastamine, palun oota.</center>\r\n  </div>  \r\n  <div class=\"center-div\">\r\n\t<div id=\"loader\" class=\"loader\"></div>\r\n</div>\r\n</body>\r\n</html>";
		} else {
			template = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta charset=\"UTF-8\">\r\n<title>Faili digiallkirjastamine</title>\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n<script src=\"hwcrypto.js\"></script>\r\n<script src=\"hwcrypto-legacy.js\"></script>\r\n<script src=\"hex2base.js\"></script>\r\n<script src=\"app.js\"></script>\r\n<style>\r\n.loader {\r\n  border: 16px solid #333333;\r\n  border-radius: 50%;\r\n  border-top: 16px solid #4AA02C;\r\n  border-bottom: 16px solid #4AA02C;\r\n  width: 120px;\r\n  height: 120px;\r\n  -webkit-animation: spin 2s linear infinite;\r\n  animation: spin 2s linear infinite;\r\n}\r\n\r\n@-webkit-keyframes spin {\r\n  0% { -webkit-transform: rotate(0deg); }\r\n  100% { -webkit-transform: rotate(360deg); }\r\n}\r\n\r\n@keyframes spin {\r\n  0% { transform: rotate(0deg); }\r\n  100% { transform: rotate(360deg); }\r\n}\r\n\r\n.center-div\r\n{\r\n  position: absolute;\r\n  margin: auto;\r\n  top: 0;\r\n  right: 0;\r\n  bottom: 0;\r\n  left: 0;\r\n  width: 100px;\r\n  height: 100px; \r\n}\r\n</style>\r\n</head>\r\n<body bgcolor=\"#333333\" onload=\"sign();\">\r\n<div style=\"color:#000; height:80px;\">\r\n<div style=\"float:left; margin-left:20px;\">\r\n<img src=\"images/0_veterinaar_vapp_est_85px.png\">\r\n</div>\r\n<div style=\"float:right;color:#000;margin:33px 20px;font-size:1.0em; font-family:Arial;\">RIIKLIK ALKOHOLIREGISTER</div>\r\n</div>\r\n  <div class=\"alert alert-danger\">\r\n   <center>Allkirjastamisel tekkis viga, palun sulgege veebilehitseja aken ja proovige uuesti.</center>\r\n  </div>  \r\n  <div class=\"center-div\">\r\n\t\r\n</div>\r\n</body>\r\n</html>";
		}
		
		
		out.write(template.replace("DOC_ID_SIIA", ""));

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// Enumeration enAttr = request.getAttributeNames();
		// while(enAttr.hasMoreElements()){
		// String attributeName = (String)enAttr.nextElement();
		// out.write("Attribute Name - "+attributeName+", Value - "+(request.getAttribute(attributeName)).toString());
		// }

		HttpSession sess = request.getSession();

		session = (SigningSessionData) sess.getAttribute("fileSigner");

		sess.setAttribute("fileSigner", session);

		String uri = request.getRequestURI();
		uri = uri.replace("//", "/");
		Config.load();
		DigidocServiceImpl ddoc = new DigidocServiceImpl(Config.DIGIDOCSERVICE_URL);

		String docId = (String) sess.getAttribute("docId");
		String docPath = (String) sess.getAttribute("docPath");
		String docMime = (String) sess.getAttribute("docMime");
		String applId = (String) sess.getAttribute("applId");
		String docName = (String) sess.getAttribute("docName");

		if (uri.equals("/generateHash")) {
//			Container container = session.getContainer();
//			Digest digest = new Digest();
			String certInHex = (String) request.getParameter("certInHex");
//			DataToSign dataToSign = signer.getDataToSign(container, certInHex);
//			String dataToSignInHex = DatatypeConverter
//					.printHexBinary(dataToSign.getDigestToSign());

			DataFileData datafile = new DataFileData();
			datafile.setContentType("EMBEDDED_BASE64");
			
			File file = new File(docPath);
			//init array with file length
			byte[] bytesArray = new byte[(int) file.length()];

			FileInputStream fis = new FileInputStream(file);
			fis.read(bytesArray); //read file into bytes[]
			fis.close();	

			datafile.setDfData(new BASE64Encoder().encode(bytesArray));
			datafile.setFilename(docName);
			datafile.setId("1");
			datafile.setMimeType(docMime);
			datafile.setSize(3);

			SigningObject obj = ddoc.signDoc(datafile, certInHex);

			sess.setAttribute("signingObject", obj);

			sess.setAttribute("certInHex", certInHex);
			
		

			out.write("{\"result\":\"ok\",\"hex\":\"" + obj.getDigestHex()
					+ "\"}");
		} else if (uri.equals("/createContainer")) {
			try {

				String signatureInHex = (String) request
						.getParameter("signatureInHex");
			

				SigningObject obj = (SigningObject) sess
						.getAttribute("signingObject");

				String file = ddoc.finalizeSignature(obj, signatureInHex);
				
				byte[] decodeResult = new BASE64Decoder().decodeBuffer(file);
				
				docPath = docPath.replace(".pdf", "(allkirjastatud).asice");
				
				FileOutputStream stream = new FileOutputStream(docPath);
				try {
				    stream.write(decodeResult);
				} finally {
				    stream.close();
				}

				// signer.signContainer(container, dataToSign, signatureInHex);
				// session.setContainer(container);
				//
				// container.saveAsFile("/home/alkor/signed.asice");

				// Andmebaasi siin.
				
				Random rand = new Random();

				int  n = rand.nextInt(2500000) + 1;
				
				try {
					/*
					PostgreUtils.insert(
							"insert into reg_doc (id, version, modified, created, created_by, modified_by, deleted, deleted_by, name, path, mime, doc_appl_id, doc_class_id) " +
							"select id+250000000+"+n+" as id, version, NOW(), NOW(), created_by, modified_by, deleted, deleted_by, '"+docName+" (asice)' as name, '"+docPath+"' as path, 'application/vnd.etsi.asic-e+zip' as mime, doc_appl_id, doc_class_id "
							+ "from reg_doc where id = "+docId+";");
					*/
					PostgreUtils.insert(
							"insert into reg_doc (id, version, modified, created, created_by, modified_by, deleted, deleted_by, name, path, mime, doc_appl_id, doc_class_id) " +
							"select nextval('reg_doc_seq') as id, version, NOW(), NOW(), created_by, modified_by, deleted, deleted_by, '"+docName+" (asice)' as name, '"+docPath+"' as path, 'application/vnd.etsi.asic-e+zip' as mime, doc_appl_id, doc_class_id "
							+ "from reg_doc where id = "+docId+";");
				} catch (Exception e) {
					out.write(e.toString());

				}

				/**
		             *
		             */
				out.write("{\"result\":\"ok\"}");
			} catch (Exception e) {
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				e.printStackTrace(pw);

				out.write("{\"result\":\"fail\"}" + sw.toString());
			}

		}
	}

	private byte[] readContentIntoByteArray(File file) {
		FileInputStream fileInputStream = null;
		byte[] bFile = new byte[(int) file.length()];
		try {
			// convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
			for (int i = 0; i < bFile.length; i++) {
				// System.out.print((char) bFile[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bFile;
	}
}
