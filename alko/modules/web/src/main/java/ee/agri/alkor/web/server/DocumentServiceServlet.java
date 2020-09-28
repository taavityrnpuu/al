package ee.agri.alkor.web.server;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.Principal;
import java.sql.Connection;
import ee.agri.alkor.impl.ResultSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;

import java.io.BufferedReader;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import java.io.PrintWriter;

import org.springframework.http.HttpHeaders;

import ee.agri.alkor.impl.PostgreUtils;
/**
 * File upload, download servlet.
 * 
 * @author ivar
 * 
 */
public class DocumentServiceServlet extends HttpServlet {

	private static Logger LOGGER = Logger.getLogger(DocumentServiceServlet.class);

	private IRegistryService registryService;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
		boolean isUpload = false;
		try {
			
			if(req.getParameter("do") == null || !req.getParameter("do").equals("excel")){
				
				if(req.getSession().getAttribute("is_uploading_report") != null){
					PrintWriter out = resp.getWriter();
					out.print("Eelmist aruannet veel laetakse... Aruannet saab vaadata seda otsides ning sellega kuvatakse ka mitu rida on juba laetud");
				}
				else{
					DiskFileItemFactory factory = new DiskFileItemFactory();
					factory.setSizeThreshold(10 * 1024 * 1024);
		
					ServletFileUpload upload = new ServletFileUpload(factory);
		
					String regNr = null;
					String periodYear = null;
					String periodMonth = null;
					
					FileItem upLoadFileItem = null;
					List items = upload.parseRequest(req);
					Iterator iter = items.iterator();
					
					boolean reg_nr_olemas = false;
		
					while (iter.hasNext()) {
						FileItem item = (FileItem) iter.next();
		
						if (item.isFormField()) {
							String name = item.getFieldName();
							String value = item.getString();
							
							if(name.equals("uploadPeriodYear")){
								periodYear = value;
							} else if(name.equals("uploadPeriodMonth")) {
								periodMonth = value;
							} else if(name.equals("reg_nr") && !reg_nr_olemas) {
								regNr = value;
							} else if(name.equals("reg_nr_vta")) {
								regNr = value;
								reg_nr_olemas = true;
							}
							
						} else {
							upLoadFileItem = item;
						}
					}

					if (regNr != null && periodYear != null && periodMonth != null && !regNr.equals("") && !periodYear.equals("") && !periodMonth.equals("")) {	
						
						ResultSet rs = PostgreUtils.query("SELECT 1 FROM enterprise WHERE reg_id = '"+regNr.replaceAll("'","''")+"'");
						if(!rs.next()){
							throw new SystemException("Vigane esitaja äriregistrikood");
						}
						
						isUpload = true;
						req.getSession().setAttribute("is_uploading_report", true);
						
						processUploadedReport(upLoadFileItem, regNr, periodYear, periodMonth, "EE" + req.getSession().getAttribute("user_ik"));
						resp.setContentType("text/html");
						PrintWriter out = resp.getWriter();
						out.print("1");
					} 
				}
			}
			else {
				String actionType = req.getParameter(ServiceConstants.DOC_ACTION_PARM);

				if (actionType != null && actionType.equals(ServiceConstants.DOC_ACTION_EXPORT_TO_EXCEL)) {
					generateExcelFile(req, resp);
				} else {
					upLoadFile(req, resp);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println(ex.getMessage());
		}
		finally {
			if(isUpload){
				req.getSession().setAttribute("is_uploading_report", null);
			}
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		downLoadFile(req, resp);
	}
	
	private void upLoadFile(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(10 * 1024 * 1024);

		ServletFileUpload upload = new ServletFileUpload(factory);

		String aval = req.getParameter("pub");

		try {
			String docType = null;
			String docLang = null;

			String docName = null;
			Long productId = null;
			Long applicationId = null;
			String applicationNr = null;
			FileItem upLoadFileItem = null;
			List items = upload.parseRequest(req);
			Iterator iter = items.iterator();
			
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("item: " + item);

				if (item.isFormField()) {
					String name = item.getFieldName();
					String value = item.getString();

					if (LOGGER.isDebugEnabled())
						LOGGER.debug("item.name: " + name + " item.value: " + value);
					if (ServiceConstants.DOC_TYPE_PARM.equals(name))
						docType = value;
					else if (ServiceConstants.DOC_NAME_PARM.equals(name))
						docName = URLDecoder.decode(value, "UTF-8");
					else if (ServiceConstants.DOC_APPNR_PARM.equals(name))
						applicationNr = value;
					else if (ServiceConstants.DOC_APPID_PARM.equals(name))
						applicationId = Long.valueOf(value);
					else if (ServiceConstants.DOC_LANG_PARM.equals(name))
						docLang = value;

				} else {
					if (LOGGER.isDebugEnabled())
						LOGGER.debug("item: " + item);
					upLoadFileItem = item;
				}
			}
			if (upLoadFileItem != null) {
				IRegistryService service = ServiceFactory.getRegistryService();

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("upLoadFileItem.getName(): " + upLoadFileItem.getName());

				int idx = upLoadFileItem.getName().lastIndexOf(File.separator);

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("upLoadFileItem.size: " + upLoadFileItem.getSize() + "upLoadFileItem.bytes.size: " + upLoadFileItem.get().length);

				String fileName = (idx > 0) ? upLoadFileItem.getName().substring(idx + 1) : upLoadFileItem.getName();

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("fileName= " + fileName);

				Long docId = service.addDocument(upLoadFileItem.get(), docType, docLang, applicationNr, applicationId, docName, fileName,
						upLoadFileItem.getContentType(), false, "0");

				StringBuffer respBuf = new StringBuffer(docId.toString()).append(";").append(ClientDataFactory.getDefaultDateFormat().format(new Date()));
				String response = respBuf.toString();

				resp.setContentType("text/plain");
				resp.setContentLength(response.length());
				Writer writer = resp.getWriter();
				writer.write(response);
				resp.flushBuffer();
			} else {
				System.out.println("Fail puudu või vigane fail");
				throw new SystemException("Fail puudu või vigane fail");
			}

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	private void downLoadFile(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Principal user = req.getUserPrincipal();
		String action = req.getParameter(ServiceConstants.DOC_ACTION_PARM);
		
		try {
			if(user == null) {
				try { // RK: äkki siit kaudu saab andmed alati kätte?
					user = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			
			String docId = req.getParameter(ServiceConstants.DOCUMENT_ID);
			String appNrTmp = req.getParameter(ServiceConstants.DOC_APPNR_PARM);
			String appId = req.getParameter(ServiceConstants.DOC_APPID_PARM);
			String appNr = appNrTmp != null ? appNrTmp : null;
			
			IRegistryService service = ServiceFactory.getRegistryService();
			RegistryDocument doc = null;
			String contentType = null;
			byte[] content = null;
			
			if(ServiceConstants.DOC_ACTION_SAVE.equals(action) && (docId != null)) {
				try {
					if (user == null) {
						doc = service.getDocument(new Long(docId));
					} else {
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername())) {
							doc = service.getDocument(new Long(docId), det.getRegCode());
						} else {
							doc = service.getDocument(new Long(docId));
						}
					}
				} catch(RuntimeException e) {
					if(e.getCause().getClass() == FileNotFoundException.class) {
						resp.sendError(HttpServletResponse.SC_NOT_FOUND);
					}
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				content = doc.getContent();
				contentType = doc.getContentType();
			} else if (ServiceConstants.DOC_ACTION_GENERATE.equals(action) && (appNr != null || appId != null)) {
				String type = ServiceConstants.DOC_TYPE_APP;
				if (appNr == null) {
					ResultSet rs = PostgreUtils.query("SELECT 1 FROM reg_application WHERE nr like '%P%' AND id = "+appId);
					while(rs.next()){
						type = ServiceConstants.DOC_TYPE_APP_EXTEND;
					}
					
					try {
						if (user == null) {
							resp.sendError(HttpServletResponse.SC_FORBIDDEN, "User has no permission to generate this file!");
						}
						
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername())) {
							content = service.createApplicationDocumentByIdAndRegCode(type, new Long(appId), det.getRegCode());
						} else {
							content = service.createApplicationDocumentById(type, new Long(appId));
						}
					} catch (ClassCastException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
				} else {
					if(appNr.contains("P")){
						type = ServiceConstants.DOC_TYPE_APP_EXTEND;
					}
					
					content = service.createApplicationDocument(type, appNr, null);
				}
				
				contentType = "application/pdf";
			} else {
				String fileName = req.getParameter(ServiceConstants.DOC_FILE_PARM);
				if (fileName != null) {
					String requ = req.getQueryString();
					String tmp = null;
					
					try {
						tmp = URLDecoder.decode(requ, "UTF-8");
					} catch (UnsupportedEncodingException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					
					String fileN = tmp.substring(tmp.lastIndexOf('=') + 1);
					if (appId == null || appId == "")
						doc = (RegistryDocument) service.getApplicationDocuments(fileN).get(0);
					else {
						doc = (RegistryDocument) service.getApplicationDocumentsByNameAndApplicationId(fileN, new Long(appId)).get(0);
					}
				}
				
				content = doc.getContent();
				contentType = doc.getContentType();
			}
			
			resp.setContentType(contentType);
			resp.setContentLength(content.length);
			if (ServiceConstants.DOC_ACTION_SAVE.equals(action)) {
				int idx = doc.getPath().lastIndexOf(File.separator);

				String fileName = (idx > 0) ? doc.getPath().substring(idx + 1) : doc.getPath();
				resp.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"");
			} else if (ServiceConstants.DOC_ACTION_OPEN.equals(action)) {
				int idx = doc.getPath().lastIndexOf(File.separator);

				String fileName = (idx > 0) ? doc.getPath().substring(idx + 1) : doc.getPath();
				resp.setHeader(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + fileName + "\"");
			}
			if ((doc != null && doc.getDocType() != null && doc.getDocType().getCode() != null && doc.getDocType().getCode().equals("PUB")) || (user != null)
					|| (ServiceConstants.DOC_ACTION_GENERATE.equals(action) && (appNr != null))) {
				try {
					ServletOutputStream outStream = resp.getOutputStream();
					ByteArrayInputStream bin = new ByteArrayInputStream(content);
					int c = 0;

					while ((c = bin.read()) >= 0) {
						outStream.write(c);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			} else {
				try {
					resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Document is not public");
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private AlkoUserDetails geUserDetails(Principal user) {
		return (AlkoUserDetails) ((UsernamePasswordAuthenticationToken) user).getPrincipal();
	}

	private void generateExcelFile(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		String objectClass = null;
		String queryParams = null;
		String columnList = null;
		String sortMapString = null;
		String orderByString = null;
		String queryTextValues = null;
		String queryTextLabels = null;
		boolean limited = false;
		boolean isExcelPrimitive = false;

		try {
			objectClass = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_OBJECT_CLASS), "UTF-8");
			queryParams = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_QUERY_PARAMS), "UTF-8");
			columnList = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_COLUMN_LIST), "UTF-8");
			sortMapString = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_SORT_MAP), "UTF-8");
			if (req.getParameter(ServiceConstants.SEARCH_FILTER_TEXT_PARAMS) != null) {
				queryTextValues = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_TEXT_PARAMS), "UTF-8");
				queryTextLabels = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_QUERY_LABELS), "UTF-8");
			}
			if (req.getParameter(ServiceConstants.SEARCH_FILTER_ORDER_BY) != null) {
				orderByString = URLDecoder.decode(req.getParameter(ServiceConstants.SEARCH_FILTER_ORDER_BY), "UTF-8");
			}
			if (req.getParameter(ServiceConstants.LIMITED_SEARCH) != null) {
				limited = URLDecoder.decode(req.getParameter(ServiceConstants.LIMITED_SEARCH), "UTF-8").equals("1");
			}
			if(req.getParameter("isExcelPrimitive") != null){
				isExcelPrimitive = (URLDecoder.decode(req.getParameter("isExcelPrimitive"), "UTF-8").equals("1") ? true : false);
			}
		} catch (UnsupportedEncodingException uee) {

		}

		SearchFilter searchFilter = new SearchFilter();
		searchFilter.setStartIndex(0);
		searchFilter.setPageSize(0);
		searchFilter.setObjectClass(objectClass);
		searchFilter.setQueryParametersFromString(queryParams, isExcelPrimitive);
		searchFilter.setQueryTextParametersFromString(queryTextValues);
		searchFilter.setQueryLabelsFromString(queryTextLabels);
		searchFilter.setQueryColumnsFromString(columnList);
		searchFilter.setSortMapFromString(sortMapString, isExcelPrimitive);
		searchFilter.setOrderBy(orderByString, isExcelPrimitive);
		searchFilter.setLimited(limited);
		resp.setContentType(ServiceConstants.CONTENT_TYPE_EXCEL);
		resp.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"Tulemused.xls\"");

		OutputStream output;
		try {
			output = resp.getOutputStream();
			ServiceFactory.getRegistryService().createExcelExportDocument(searchFilter, output);
			resp.getOutputStream().flush();
		} catch (SocketException e) {
			LOGGER.warn("Client disconnected before response was ready!");
		} catch (IOException e) {
			throw new ServletException();
		}

	}

	private void processUploadedReport(FileItem file, String regCode, String periodYear, String periodMonth, String ik) throws Exception {
		registryService = ServiceFactory.getRegistryService();

		File f = new File("/data/"+regCode+"_tmp.csv");

		file.write(f);
		
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, Integer.parseInt(periodYear));

		cal.set(Calendar.MONTH, Integer.parseInt(periodMonth) - 1);

		cal.set(Calendar.DAY_OF_MONTH, 1);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String created = format1.format(cal.getTime());

		List<Long> added = new ArrayList<Long>();
		
		long startTime = System.currentTimeMillis();
		long subStart = System.currentTimeMillis();
		int rowNr = 0;
		Connection con = null;

		String sql = "INSERT INTO product_move_report (id, created, load_enterprise_id, load_person_id, rep_year, month_class_id, report_ent_id, report_date) " +
				"VALUES (nextval('product_move_report_seq'), NOW(), '"+regCode+"', '"+ik+"', '"+periodYear+"', (select id from classificator where category = 'Month' and code = '"+periodMonth+"' limit 1), (select id from enterprise where reg_id = '"+regCode+"' limit 1), '"+created+"')";		
		long reportId = PostgreUtils.insert(sql, "id");
		
		try {
			con = PostgreUtils.getLongConnection();
				
			BufferedReader fReader = new BufferedReader(new StringReader(new String(file.getString())));
			String lineFirst = null;
			List<String> lines = new ArrayList<String>();
			Map<String, Long> entries = new HashMap<String, Long>();
			String vead = "";
			String regentries = "";
			
			long beforeRead = System.currentTimeMillis();
			
			// loeme read massiivi
			while ((lineFirst = fReader.readLine()) != null) {
				lines.add(lineFirst);
				try{
					String[] cols = lineFirst.split(";");
					
					String registryEntryNr = cols[0].replaceAll(" ","").replaceAll("\"", "");
					entries.put(registryEntryNr, null);
				} catch(Exception x){
					
				}
			}
			
			// loeme unikaalsed regentry numbrid stringiks
			Iterator it = entries.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry<String, Long> pair = (Map.Entry<String, Long>)it.next();
		        if(regentries.length() != 0){
					regentries += ", ";
				}
				regentries += "'"+pair.getKey().replaceAll("'","''")+"'";
		    }
			
			long afterRead = System.currentTimeMillis();
			System.out.println("----- processUploadedReport "+reportId+" after file read ("+lines.size()+" rows): "+((float)(afterRead - beforeRead) / 1000.0)+" seconds");

			
			long beforeSelect = System.currentTimeMillis();
			
			// küsime kõikide regentryde id'd
			if(regentries.length() != 0){
				ResultSet rst = PostgreUtils.query("SELECT id, nr FROM reg_entry WHERE nr IN ("+regentries+")", con);
				while(rst.next()){
					entries.put(rst.getString("nr"), rst.getLong("id"));
				}
			}
			
			long afterSelect = System.currentTimeMillis();
			System.out.println("----- processUploadedReport "+reportId+" after select ("+lines.size()+" rows): "+((float)(afterSelect - beforeSelect) / 1000.0)+" seconds");

			for(String line : lines){
				
				boolean vigane = false;
				rowNr++;

				String[] cols = line.split(";");
				if (cols.length != 8) {
					vead += "real "+rowNr+" pole 8 veergu <br>";
					vigane = true;
					continue;
				}
				
				for(int i = 0; i < cols.length ;i++){
					cols[i] = cols[i].replaceAll("^\"|\"$", ""); // eemaldame jutumärgid algusest ja lõpust
				}
				
				boolean colError = false;
				for (int i = 0; i < 8; i++) {
					if (cols[i].trim().length() == 0) {
						colError = true;
					}
				}
				if (colError){
					vead += "real "+rowNr+" on tühi veerg <br>";
					vigane = true;
					continue;
				}
				
				for(int i = 0; i < cols.length ;i++){ // escapeme veerud
					cols[i] = cols[i].replaceAll("'", "''");
				}
				
				String registryEntryNr = cols[0].replaceAll(" ","");
				
				Long entryID = entries.get(registryEntryNr);
				
				if(entryID == null || entryID == 0l){
					vead += "ei leitud rea "+rowNr+" registrikande numbrit: "+registryEntryNr+"<br>";
					vigane = true;
				}
				
				Integer amount = null;
				try {
					amount = new Integer(cols[7]);
				} catch (Exception e) {
					vead += "rea "+rowNr+" kogus pole numbriline väärtus või täisarv: "+cols[7]+"<br>";
					vigane = true;
				}
				
				if(!vigane){
					try{
						sql = "INSERT INTO product_move_report_record (id, amount, created, receiver, party_nr, market_place, market_addr, market_distr, market_orgunit, regentry_id, report_id) VALUES (nextval('product_move_report_record_seq')," +
								""+amount+",NOW(),'"+cols[1]+"','"+cols[6]+"','"+cols[2]+"','"+cols[5]+"','"+cols[3]+"','"+cols[4]+"',"+entryID+","+reportId+")";		

						added.add(PostgreUtils.insert(sql, "id", con));
					}catch(Exception xx){
						vead += "ei suutnud lisada rida "+rowNr+": "+xx.getMessage()+"<br>";
						vigane = true;
					}
				}
				
				if(rowNr % 100 == 0){
					long subStop = System.currentTimeMillis();
					System.out.println("----- processUploadedReport "+reportId+" subtime (next 100 rows): "+((float)(subStop - subStart) / 1000.0)+" seconds");
					subStart = System.currentTimeMillis();
				}
			}
			
			if(vead.length() > 0){
				throw new Exception("Vigane sisend:<br>"+vead);
			}
			else if(added.size() < rowNr){
				throw new Exception("Vigane sisend");
			}
			
		} catch (Exception ioe) {
			PostgreUtils.delete("DELETE FROM product_move_report_record where report_id = '" +  reportId + "'");
			PostgreUtils.delete("DELETE FROM product_move_report where id = '" +  reportId + "'");
			
			ioe.printStackTrace();
			throw ioe;
		} finally{
			long stopTime = System.currentTimeMillis();
		    System.out.println("----- processUploadedReport "+reportId+" time taken ("+rowNr+" rows): "+((float)(stopTime - startTime) / 1000.0)+" seconds");
		    PostgreUtils.closeConnection(con);
		}
	}
}
