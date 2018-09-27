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

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.acegisecurity.providers.x509.X509AuthenticationToken;
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
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;

/**
 * File upload, download servlet.
 * 
 * @author ivar
 * 
 */
public class DocumentServiceServlet2 extends HttpServlet {

	private static Logger LOGGER = Logger
				.getLogger(DocumentServiceServlet2.class);

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, java.io.IOException {

		String actionType = req.getParameter(ServiceConstants.DOC_ACTION_PARM);

		if (actionType != null && actionType.equals(ServiceConstants.DOC_ACTION_EXPORT_TO_EXCEL)) {
			generateExcelFile(req, resp);
		} else {
			upLoadFile(req, resp);
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, java.io.IOException {
		downLoadFile(req, resp);
	}

	// @SupressWarnings("unchecked")
	private void upLoadFile(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException {

		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(10 * 1024 * 1024);

		ServletFileUpload upload = new ServletFileUpload(factory);

		try {
			/*
			 * Pole ehk vaja if (!ServletFileUpload.isMultipartContent(req)) throw
			 * new SystemException("Not an multipart upload request");
			 */
			String docType = null;
			String docLang = null;

			String docName = null;
			Long productId = null;
			Long applicationId = null;
			String applicationNr = null;
			String avalik = null;
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
						LOGGER.debug("item.name: " + name + " item.value: "
									+ value);
					if (ServiceConstants.DOC_TYPE_PARM.equals(name))
						docType = value;
					else if (ServiceConstants.DOC_NAME_PARM.equals(name)){
						docName = URLDecoder.decode(value, "UTF-8");
					}
					else if (ServiceConstants.DOC_APPNR_PARM.equals(name))
						applicationNr = value;
					else if (ServiceConstants.DOC_APPID_PARM.equals(name))
						applicationId = Long.valueOf(value);
					else if (ServiceConstants.DOC_LANG_PARM.equals(name))
						docLang = value;
					else if (ServiceConstants.PUB.equals(name))
						avalik = value;

				} else {
					if (LOGGER.isDebugEnabled())
						LOGGER.debug("item: " + item);
					upLoadFileItem = item;
				}
			}
			if (upLoadFileItem != null) {
				IRegistryService service = ServiceFactory.getRegistryService();

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("upLoadFileItem.getName(): "
								+ upLoadFileItem.getName());

				int idx = upLoadFileItem.getName().lastIndexOf(File.separator);

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("upLoadFileItem.size: "
								+ upLoadFileItem.getSize()
								+ "upLoadFileItem.bytes.size: "
								+ upLoadFileItem.get().length);

				String fileName = (idx > 0) ? upLoadFileItem.getName()
							.substring(idx + 1) : upLoadFileItem.getName();

				if (LOGGER.isDebugEnabled())
					LOGGER.debug("fileName= " + fileName);
							
				
				String onAvalik = "0";
				if(avalik.equals("1")){
					onAvalik = "1";
				}

				Long docId = service.addDocument(upLoadFileItem.get(), docType,
							docLang, applicationNr, applicationId, docName, fileName, upLoadFileItem
										.getContentType(), false, onAvalik);

				// Write back the document id.
							
				StringBuffer respBuf = new StringBuffer(docId.toString())
							.append(";").append(ClientDataFactory
										.getDefaultDateFormat().format(new Date()));
				String response = respBuf.toString();

				resp.setContentType("text/plain");
				resp.setContentLength(response.length());
				Writer writer = resp.getWriter();
				writer.write(response);
				resp.flushBuffer();
			} else
				throw new SystemException("Invalid upload");

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void downLoadFile(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException {

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
																				// mitte-null ?
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
			if (ServiceConstants.DOC_ACTION_SAVE.equals(action)
						&& (docId != null)) {
				try {
					if (user == null) {
						//if (!publicDoc(new Long(docId), service.findPublicDocuments()))
						//	throw new RuntimeException("User has no permission to download this file!");
						//else
						//{
							doc = service
										.getDocument(new Long(docId));
						//}
					} else {
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername()))
						{
							doc = service
										.getDocument(new Long(docId), det.getRegCode());
						}
						else
						{
							doc = service
										.getDocument(new Long(docId));
						}
					}
				} catch (ClassCastException e) {
					LOGGER.error(e.getMessage(), e);
				}
				content = doc.getContent();
				contentType = doc.getContentType();

			} else if (ServiceConstants.DOC_ACTION_GENERATE.equals(action)
						&& (appNr != null || appId != null)) {
				if (appNr == null) {
					try {
						if (user == null) {
							throw new RuntimeException("User has no permission to generate this file!");
						}
						AlkoUserDetails det = geUserDetails(user);
						if (ServiceConstants.EIT_USERNAME.equals(det.getUsername()))
						{
							content = service.createApplicationDocumentByIdAndRegCode(
										ServiceConstants.DOC_TYPE_APP, new Long(appId),
										det.getRegCode());
						}
						else
						{
							content = service.createApplicationDocumentById(
										ServiceConstants.DOC_TYPE_APP, new Long(appId));
						}
					} catch (ClassCastException e) {
						LOGGER.error(e.getMessage(), e);
					}
				} else {
					content = service.createApplicationDocument(
								ServiceConstants.DOC_TYPE_APP, appNr, null);
				}
				contentType = "application/pdf";
			} else {
				String fileName = req
							.getParameter(ServiceConstants.DOC_FILE_PARM);
				if (fileName != null) {

					String requ = req.getQueryString();
					String tmp = null;
					try {
						tmp = URLDecoder.decode(requ, "UTF-8");
					} catch (UnsupportedEncodingException e) {
					}
					String fileN = tmp.substring(tmp.lastIndexOf("=") + 1);
					if (appId == null || appId == "")
						doc = (RegistryDocument) service
									.getApplicationDocuments(fileN).get(0);
					else {
						doc = (RegistryDocument) service
									.getApplicationDocumentsByNameAndApplicationId(
												fileN, new Long(appId)).get(0);
					}
				}
				content = doc.getContent();
				contentType = doc.getContentType();
			}
			resp.setContentType(contentType);
			resp.setContentLength(content.length);
			if (ServiceConstants.DOC_ACTION_SAVE.equals(action)) {
				int idx = doc.getPath().lastIndexOf(File.separator);

				String fileName = (idx > 0) ? doc.getPath().substring(idx + 1)
							: doc.getPath();
				resp.setHeader("Content-disposition", "attachment; filename=\""
							+ fileName + "\"");
			} else if (ServiceConstants.DOC_ACTION_OPEN.equals(action)) {
				int idx = doc.getPath().lastIndexOf(File.separator);

				String fileName = (idx > 0) ? doc.getPath().substring(idx + 1)
							: doc.getPath();
				resp.setHeader("Content-disposition", "inline; filename=\""
							+ fileName + "\"");
			}
			if ((doc != null && doc.getDocType() != null
						&& doc.getDocType().getCode() != null && doc.getDocType()
						.getCode().equals("PUB"))
						|| (user != null)
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
		/*if (user instanceof X509AuthenticationToken) {
			return (AlkoUserDetails) ((X509AuthenticationToken) user).getPrincipal();
		} else {*/
			return (AlkoUserDetails) ((UsernamePasswordAuthenticationToken) user).getPrincipal();
		//}
	}

	private boolean publicDoc(Long docId, List<RegistryDocument> list) {
		for (RegistryDocument doc : list) {
			if (doc.getId().equals(docId))
				return true;
		}
		return false;
	}

	private void generateExcelFile(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException {

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
}
