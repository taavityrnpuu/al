package ee.agri.alkor.web.server;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.service.RegistryService;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.attachments.AttachmentPart;
import org.apache.axis.attachments.Attachments;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.types.URI;
import org.apache.log4j.Logger;

import com.lowagie.text.pdf.codec.Base64;

import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.ContactInfo;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductMoveReportView;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.ApplicationType;
import ee.agri.alkor.model.classes.BottleColor;
import ee.agri.alkor.model.classes.BottleShape;
import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.classes.CorkColor;
import ee.agri.alkor.model.classes.CorkMaterial;
import ee.agri.alkor.model.classes.CorkShape;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.PackingMaterial;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.model.classes.StockingColor;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.IUserManagerService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;

import ee.agri.alkor.xtee.Messages;
import ee.agri.alkor.xtee.impl.XteeHeaderMap;
import ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddEnterpriseResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AppFollowResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ExtendResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder;

import java.util.Enumeration;
import java.io.PrintWriter;

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
		try {
			
			if(req.getParameter("do") == null || !req.getParameter("do").equals("excel")){
				
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
					
					ResultSet rs = PostgreUtils.query("SELECT 1 FROM enterprise WHERE reg_id = '"+regNr.replaceAll("'","\"")+"'");
					if(!rs.next()){
						throw new SystemException("Vigane esitaja äriregistrikood");
					}
					
					processUploadedReport(upLoadFileItem, regNr, periodYear, periodMonth, "EE" + req.getSession().getAttribute("user_ik"));
					resp.setContentType("text/html");
					PrintWriter out = resp.getWriter();
					out.println("1");
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
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
		downLoadFile(req, resp);
	}

	// @SupressWarnings("unchecked")
	private void upLoadFile(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(10 * 1024 * 1024);

		ServletFileUpload upload = new ServletFileUpload(factory);

		String aval = req.getParameter("pub");

		try {
			/*
			 * Pole ehk vaja if (!ServletFileUpload.isMultipartContent(req))
			 * throw new SystemException("Not an multipart upload request");
			 */
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
			} else
				throw new SystemException("Fail puudu või vigane fail");

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void downLoadFile(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

		Principal user = req.getUserPrincipal();
		String action = req.getParameter(ServiceConstants.DOC_ACTION_PARM);

		try {
			if (action == null) {
				LOGGER.info("downLoadFile action parameter is null");
			}
			if (user == null) {
				LOGGER.info("downLoadFile user is null");

				try { // RK: äkki siit kaudu saab andmed alati kätte?
					user = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
					LOGGER.debug("Katsetuse tulemus = " + user); // null või
																	// mitte-null
																	// ?
				} catch (Exception e) {
					LOGGER.debug("Katsetus ebaõnnestus!", e);
				}

			}
			String docId = req.getParameter(ServiceConstants.DOCUMENT_ID);
			String appNrTmp = req.getParameter(ServiceConstants.DOC_APPNR_PARM);
			String appId = req.getParameter(ServiceConstants.DOC_APPID_PARM);
			String appNr = appNrTmp != null ? appNrTmp : null;
			appNrTmp = null;
			IRegistryService service = ServiceFactory.getRegistryService();
			RegistryDocument doc = null;
			String contentType = null;
			byte[] content = null;
			if (ServiceConstants.DOC_ACTION_SAVE.equals(action) && (docId != null)) {
				try {
					if (user == null) {
						// if (!publicDoc(new Long(docId),
						// service.findPublicDocuments()))
						// throw new
						// RuntimeException("User has no permission to download this file!");
						// else
						// {
						doc = service.getDocument(new Long(docId));
						// }
					} else {
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername())) {
							doc = service.getDocument(new Long(docId), det.getRegCode());
						} else {
							doc = service.getDocument(new Long(docId));
						}
					}
				} catch (ClassCastException e) {
					LOGGER.error(e.getMessage(), e);
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
							throw new RuntimeException("User has no permission to generate this file!");
						}
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername())) {
							content = service.createApplicationDocumentByIdAndRegCode(type, new Long(appId), det.getRegCode());
						} else {
							content = service.createApplicationDocumentById(type, new Long(appId));
						}
					} catch (ClassCastException e) {
						LOGGER.error(e.getMessage(), e);
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
					}
					String fileN = tmp.substring(tmp.lastIndexOf("=") + 1);
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
				resp.setHeader("Content-disposition", "attachment; filename=\"" + fileName + "\"");
			} else if (ServiceConstants.DOC_ACTION_OPEN.equals(action)) {
				int idx = doc.getPath().lastIndexOf(File.separator);

				String fileName = (idx > 0) ? doc.getPath().substring(idx + 1) : doc.getPath();
				resp.setHeader("Content-disposition", "inline; filename=\"" + fileName + "\"");
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
					LOGGER.error(e.getMessage(), e);
				}
			} else {
				try {
					resp.sendError(401);
				} catch (IOException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

	}

	private AlkoUserDetails geUserDetails(Principal user) {
		if (user instanceof X509AuthenticationToken) {
			return (AlkoUserDetails) ((X509AuthenticationToken) user).getPrincipal();
		} else {
			return (AlkoUserDetails) ((UsernamePasswordAuthenticationToken) user).getPrincipal();
		}
	}

	private boolean publicDoc(Long docId, List<RegistryDocument> list) {
		for (RegistryDocument doc : list) {
			if (doc.getId().equals(docId))
				return true;
		}
		return false;
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
		} catch (UnsupportedEncodingException uee) {

		}

		SearchFilter searchFilter = new SearchFilter();
		searchFilter.setStartIndex(0);
		searchFilter.setPageSize(0);
		searchFilter.setObjectClass(objectClass);
		searchFilter.setQueryParametersFromString(queryParams);
		searchFilter.setQueryTextParametersFromString(queryTextValues);
		searchFilter.setQueryLabelsFromString(queryTextLabels);
		searchFilter.setQueryColumnsFromString(columnList);
		searchFilter.setSortMapFromString(sortMapString);
		searchFilter.setOrderBy(orderByString);
		searchFilter.setLimited(limited);
		resp.setContentType(ServiceConstants.CONTENT_TYPE_EXCEL);
		resp.setHeader("Content-disposition", "attachment; filename=\"Tulemused.xls\"");

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
		

		/*ProductMovementReport report = new ProductMovementReport();
		report.setCreated(new Date());
		report.setLoadingEnterpriseRegNr(regCode);
		report.setLoadingUserId(ik);
		report.setReportingEnterprise(registryService.getEnterpriseByActivity(regCode));
		 */
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, Integer.parseInt(periodYear));

		cal.set(Calendar.MONTH, Integer.parseInt(periodMonth) - 1);

		cal.set(Calendar.DAY_OF_MONTH, 1);
		//report.setRepDate(cal.getTime());

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String created = format1.format(cal.getTime());

		
		String sql = "INSERT INTO product_move_report (id, created, load_enterprise_id, load_person_id, rep_year, month_class_id, report_ent_id, report_date) " +
				"VALUES ((select max(id) + 1 from product_move_report), NOW(), '"+regCode+"', '"+ik+"', '"+periodYear+"', (select id from classificator where category = 'Month' and code = '"+periodMonth+"' limit 1), (select id from enterprise where reg_id = '"+regCode+"' limit 1), '"+created+"')";		
		long reportId = PostgreUtils.insert(sql, "id");
		
		List added = new ArrayList();

		try {
			BufferedReader fReader = new BufferedReader(new StringReader(new String(file.getString())));
			String line = null;
			HashMap<String, RegistryEntry> entrys = new HashMap<String, RegistryEntry>();
			int rowNr = 0;
			String vead = "";
			
			while ((line = fReader.readLine()) != null) {
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
					cols[i] = cols[i].replaceAll("'", "\"");
				}
				
				/*String registryEntryNr = cols[0].trim().toLowerCase();
				if (registryEntryNr.indexOf(' ') > 0) {
					String[] regNrParts = registryEntryNr.split(" ");
					registryEntryNr = regNrParts[0];
				}
				RegistryEntry entry = null;
				if (entrys.containsKey(registryEntryNr)) {
					entry = entrys.get(registryEntryNr);
				} else {
					try {

						entry = registryService.findRegistryEntry(registryEntryNr);
						entrys.put(registryEntryNr, entry);

					} catch (Exception e) {

						continue;
					}
				}*/
				String registryEntryNr = cols[0].replaceAll(" ","");
				
				String entryID = "";
				ResultSet rst = PostgreUtils.query("SELECT id FROM reg_entry WHERE nr = '"+registryEntryNr.replaceAll("'","\"")+"' LIMIT 1");
				if(rst.next()){
					entryID = rst.getString("id");
				}
				else{
					vead += "ei leitud rea "+rowNr+" registrikande numbrit: "+registryEntryNr+"<br>";
					vigane = true;
					//throw new Exception("Vigane sisend, ei leitud rea "+rowNr+" registrikande numbrit");
				}

				// LOGGER.debug("5");
				/*ProductMovementReportRecord record = new ProductMovementReportRecord();
				record.setCreated(new Date());
				record.setRegistryEntry(entry);
				record.setReceiverName(cols[1]);
				record.setMarketingPlaceName(cols[2]);
				record.setMarketingPlaceDistrict(cols[3]);
				record.setMarketingPlaceOrgUnit(cols[4]);
				record.setMarketingPlaceAddress(cols[5]);
				record.setPartyNr(cols[6]);*/
				Integer amount = null;
				try {
					amount = new Integer(cols[7]);
				} catch (Exception e) {
					vead += "rea "+rowNr+" kogus pole numbriline väärtus või täisarv: "+cols[7]+"<br>";
					vigane = true;
					//throw new Exception("Vigane sisend, rea "+rowNr+" kogus pole numbriline väärtus");
				}
				//record.setAmount(amount);
				
				if(!vigane){
					try{
						sql = "INSERT INTO product_move_report_record (id, amount, created, receiver, party_nr, market_place, market_addr, market_distr, market_orgunit, regentry_id, report_id) VALUES ((select max(id) + 1 from product_move_report_record)," +
								"'"+amount+"','"+created+"','"+cols[1]+"','"+cols[6]+"','"+cols[2]+"','"+cols[5]+"','"+cols[3]+"','"+cols[4]+"','"+entryID+"','"+reportId+"')";		
	
						added.add(PostgreUtils.insert(sql, "id"));
						//report.addRecord(record);	
					}catch(Exception xx){
						vead += "ei suutnud lisada rida "+rowNr+": "+xx.getMessage()+"<br>";
						vigane = true;
						//throw xx;
					}
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
		}

		try {
			//registryService.saveOrUpdate(report);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
