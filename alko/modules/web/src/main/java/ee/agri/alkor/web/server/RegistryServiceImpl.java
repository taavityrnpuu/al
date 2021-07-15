package ee.agri.alkor.web.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.ResultSet;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.gwtwidgets.server.spring.GWTSpringController;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.model.PaymentMatchingLog;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.ApplicationType;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.ReasonMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.SRSFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.service.ConstraintViolationException;
import ee.agri.alkor.web.service.RegistryService;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SessionExpiredException;
import ee.agri.alkor.web.service.SystemException;

@Service
public class RegistryServiceImpl implements RegistryService {
	private static Logger LOGGER = Logger.getLogger(RegistryServiceImpl.class);

	private static final long serialVersionUID = 1L;

	private IRegistryService service;

	public RegistryServiceImpl() {
		super();
		LOGGER.debug("RegistryServiceImpl.ctor");
	}

	public String toDay() {
		return ClientDataFactory.getDefaultDateFormat().format(new Date());
	}
	
	public String[] getLoginBackURL() {
		return ServiceFactory.getRegistryService().getLoginBackURL();
	}

	public ClassItemMap processApplication(Long applicationId) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().processApplication(applicationId));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}

	}

	public ApplicationMap saveApplicationDecision(ApplicationMap appl) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveApplicationDecision(ClientDataFactory.create(appl)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}

	}

	public boolean isSigned(int applId, String docName) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().isSigned(applId, docName));

	}
	
	public boolean isReportOK() {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().isReportOK());

	}

	public boolean getCanEditEnterprise() {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().getCanEditEnterprise());
	}

	public ArrayList<String[]> getAllEnterpriseReferences(String regCode) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().getAllEnterpriseReferences(regCode));
	}

	public ArrayList<String[]> getAllDeleteConfirmations() {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().getAllDeleteConfirmations());
	}
	
	public ArrayList<String[]> getAllConfigValues() {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().getAllConfigValues());
	}
	
	public HashMap<String, String> getConfigFromDatabase() {
		return ServiceFactory.getRegistryService().getConfigFromDatabase();
	}

	public long saveEnterpriseReference(String firstname, String lastName, String idCode, String occupation, String toDate, String regCode) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().saveEnterpriseReference(firstname, lastName, idCode, occupation, toDate, regCode));
	}

	public long saveDeleteConfirmation(String title, String note, String id, int mode) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().saveDeleteConfirmation(title, note, id, mode));
	}
	
	public boolean saveConfigValue(String key, String value) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().saveConfigValue(key, value));
	}


	public long deleteEnterpriseReference(String id) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().deleteEnterpriseReference(id));

	}

	public ApplicationMap redoDocument(ApplicationMap appl) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().redoDocument(ClientDataFactory.create(appl)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}

	}

	public ApplicationMap saveExtendApplicationDecision(ApplicationMap appl) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveExtendApplicationDecision(ClientDataFactory.create(appl)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}

	}

	public RegistryEntryMap updateRegistryEntryNr(ApplicationMap appl) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().updateRegistryEntryNr(ClientDataFactory.create(appl)));
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
	}

	public ApplicationMap saveNewSigner(ApplicationMap appl) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveNewSigner(ClientDataFactory.create(appl)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}

	}

	public ApplicationMap reprocessApplication(ApplicationMap applDTO, String reasonToDelete) {
		try {

			/* Creates a new model object from the web-tier dto object */
			RegistryApplication applModel = ClientDataFactory.create(applDTO);

			/* reprocesses the application */
			applModel = ServiceFactory.getRegistryService().reprocessApplication(applModel, reasonToDelete);

			/* Converts the application model back into the web-tier dto object */
			return ClientDataFactory.create(applModel);

		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public EnterpriseMap saveOrUpdate(EnterpriseMap data) throws ConstraintViolationException {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ApplicationMap saveOrUpdate(ApplicationMap data) throws ConstraintViolationException, SessionExpiredException {
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");
			RegistryApplication appl = ClientDataFactory.create(data);
			if (appl.getId() == null) {
				// new application
				ApplicationState state = new ApplicationState();
				state.setCode(ServiceConstants.APPL_STATE_PRO);
				appl.setState(state);
				ApplicationType type = new ApplicationType();
				type.setCode(ServiceConstants.APPL_TYPE_ARE);
				appl.setType(type);
			}

			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(appl));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ApplicationMap saveOrUpdate(ApplicationMap data, boolean set) throws ConstraintViolationException, SessionExpiredException {
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");
			RegistryApplication appl = ClientDataFactory.create(data);
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateEITApplication(appl));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ApplicationMap saveOrUpdateApplication(ApplicationMap data) // XXX
																		// EIT
																		// kasutaja
																		// ApplicationNoteForm
																		// salvestamine
			throws ConstraintViolationException, SessionExpiredException { // ja
																			// enamus
																			// tegevused
																			// ApplicationFormil
																			// ka!

		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			RegistryApplication appl = ClientDataFactory.create(data);
			if (appl.getId() == null) {
				// new application
				ApplicationState state = new ApplicationState();
				state.setCode(ServiceConstants.APPL_STATE_PRO);
				appl.setState(state);
				ApplicationType type = new ApplicationType();
				type.setCode(ServiceConstants.APPL_TYPE_ARE);
				appl.setType(type);
			}
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateApplication(appl));
		} catch (Exception cve) {
			throw new SystemException(cve.getMessage());
		}

	}

	public ApplicationMap saveOrUpdateApplicationA(ApplicationMap data) // XXX
																		// EIT
																		// kasutaja
																		// ApplicationNoteForm
																		// salvestamine
			throws ConstraintViolationException, SessionExpiredException { // ja
																			// enamus
																			// tegevused
																			// ApplicationFormil
																			// ka!

		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			RegistryApplication appl = ClientDataFactory.create(data);
			if (appl.getId() == null) {
				// new application
				ApplicationState state = new ApplicationState();
				state.setCode(ServiceConstants.APPL_STATE_PRO);
				appl.setState(state);
				ApplicationType type = new ApplicationType();
				type.setCode(ServiceConstants.APPL_TYPE_ARE);
				appl.setType(type);
			}
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateApplicationA(appl));
		} catch (Exception cve) {
			throw new SystemException(cve.getMessage());
		}

	}

	public ApplicationMap saveOrUpdateJustApplication(ApplicationMap data) { // XXX
																				// EIT
																				// otsusta
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			RegistryApplication appl = ClientDataFactory.create(data);
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateJustApplication(appl));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ProductMap saveOrUpdate(ProductMap data) {
		try {
			String originCountryCode = (String) data.getProperty(ProductMap.ORIGINCOUNTRY_CODE);
			if (originCountryCode != null && originCountryCode.equals(data.getProperty(ProductMap.PRODUCER_COUNTRY_CODE))) {
				return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateWithProducerAddressRefresh(ClientDataFactory.create(data)));
			}
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ProductMap saveOrUpdateProduct(ProductMap data) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdateProduct(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public RegistryPaymentMap saveOrUpdate(RegistryPaymentMap data) {
		try {
			return ClientDataFactory.create((RegistryPayment) ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public NewsMap saveOrUpdate(NewsMap data) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public FAQMap saveOrUpdate(FAQMap data) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(data)));
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public SearchFilter search(SearchFilter filter) {
		filter = ClientDataFactory.create(ServiceFactory.getRegistryService().search(ClientDataFactory.create(filter)));

		LOGGER.debug(" results:" + filter.getResultsList().size());
		return filter;
	}

	public SearchFilter searchApplications(String regCode, SearchFilter filter) {
		filter.getQueryParams().put("IsXTeeForm", regCode); // et olla kindel, et väliskasutaja kogu registrit ei näeks
		return ClientDataFactory.create(ServiceFactory.getRegistryService().searchApplications(ClientDataFactory.create(filter)));
	}

	public void deleteDocument(Long docId) {
		ServiceFactory.getRegistryService().deleteDocument(docId);
	}

	public void deleteDocumentWithReason(Long docId, String text) {
		ServiceFactory.getRegistryService().deleteDocumentWithReason(docId, text);
	}

	public List findPublicDocuments() {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findPublicDocuments());

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findPublicDocuments(String langId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(
		/* Fixed by Sven - kas see on �ige??? */
		service.findPublicDocuments(langId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findApplicationDocuments(Long applicationId) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("findApplicationDocuments: applicationId=" + applicationId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findApplicationDocuments(applicationId));

		if (LOGGER.isDebugEnabled())
			LOGGER.info("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findApplicationDocumentsPublic(Long applicationId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findApplicationDocuments: applicationId=" + applicationId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findApplicationDocumentsPublic(applicationId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findApplicationDocumentsArchived(Long applicationId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findApplicationDocuments: applicationId=" + applicationId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findApplicationDocumentsArchived(applicationId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findApplicationDocumentsFromUser(Long applicationId) {
		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findApplicationDocumentsFromUser(applicationId));
		return docList;
	}

	public List findProductDocuments(Long productId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments: productId=" + productId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findProductDocuments(productId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findProductDocumentsPublic(Long productId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments: productId=" + productId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findProductDocumentsPublic(productId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findProductDocumentsArchived(Long productId) {
		/*
		 * Principal princ = getThreadLocalRequest().getUserPrincipal();
		 * LOGGER.debug("principal: " + princ);
		 */
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments: productId=" + productId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List docList = ClientDataFactory.create(service.findProductDocumentsArchived(productId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findPublicDocuments, docList: " + docList);

		return docList;
	}

	public List findProductMovementRecords(Long reportId) {
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findProductMovementRecords: reportId=" + reportId);

		IRegistryService service = ServiceFactory.getRegistryService();
		List reportRecords = service.findProductMovementRecords(reportId);

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findProductMovementRecords, reportRecords: " + reportRecords);

		return reportRecords;
	}

	public ProductMap findProduct(Long productId) {
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findProduct: productId=" + productId);

		IRegistryService service = ServiceFactory.getRegistryService();
		ProductMap productMap = ClientDataFactory.create(service.findProduct(productId));

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("findProduct, docList: " + productMap);

		return productMap;
	}

	public EnterpriseMap findEnterprise(Long enterpriseId) {

		IRegistryService service = ServiceFactory.getRegistryService();
		EnterpriseMap enterpriseMap = ClientDataFactory.create(service.findEnterprise(enterpriseId));

		return enterpriseMap;
	}

	public ApplicationMap findApplication(Long applicationId) {

		IRegistryService service = ServiceFactory.getRegistryService();
		ApplicationMap applicationMap = ClientDataFactory.create(service.findApplication(applicationId));

		return applicationMap;
	}

	public String deleteEnterprise(Long enterpriseId) {
		return ServiceFactory.getRegistryService().deleteEnterprise(enterpriseId);

	}

	public boolean deleteProduct(Long productId) {

		return ServiceFactory.getRegistryService().deleteProduct(productId);

	}

	public void deleteNews(Long newsId) {
		ServiceFactory.getRegistryService().deleteNews(newsId);
	}

	public void deleteFaq(Long faqId) {
		ServiceFactory.getRegistryService().deleteFaq(faqId);
	}

	public RegistryEntryMap saveOrUpdate(RegistryEntryMap entry) {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().saveOrUpdate(ClientDataFactory.create(entry)));
		} catch (ee.agri.alkor.service.ConstraintViolationException e) {
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
	}

	public Boolean isExtendDocumentPresent(String applicationNr, String docType) {
		return ServiceFactory.getRegistryService().isExtendDocumentPresent(applicationNr, docType);
	}

	public Boolean createNewExtendDocument(String applicationNr, String docType) {
		return ServiceFactory.getRegistryService().createNewExtendDocument(applicationNr, docType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#isCorrectionDocumentPresent
	 * (java.lang.Long)
	 */
	public Boolean isCorrectionDocumentPresent(String applicationNr) {
		return ServiceFactory.getRegistryService().isCorrectionDocumentPresent(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#isDecisionDocumentPresent(java
	 * .lang.Long)
	 */
	public Boolean isDecisionDocumentPresent(String applicationNr) {
		return ServiceFactory.getRegistryService().isDecisionDocumentPresent(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#isDecisionDocumentPresent(java
	 * .lang.Long)
	 */
	public Boolean isDeclineDocumentPresent(String applicationNr) {
		return ServiceFactory.getRegistryService().isDeclineDocumentPresent(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#createNewCorrectionDocument
	 * (java.lang.String)
	 */
	public Boolean createNewCorrectionDocument(String applicationNr) {
		// loogika uue õiendi tegemiseks
		return ServiceFactory.getRegistryService().createNewCorrectionDocument(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#createNewDecisionDocument(java
	 * .lang.String)
	 */
	public Boolean createNewDecisionDocument(String applicationNr) {
		// loogika uue otsuse tegemiseks
		return ServiceFactory.getRegistryService().createNewDecisionDocument(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#createNewDecisionDocument(java
	 * .lang.String)
	 */
	public Boolean createNewDeclineDocument(String applicationNr) {
		// loogika uue otsuse tegemiseks
		return ServiceFactory.getRegistryService().createNewDeclineDocument(applicationNr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#bindPaymentToEnterprise(java
	 * .lang.String, java.lang.Long)
	 */
	public Boolean bindPaymentToEnterprise(String registrationId, Long paymentId) {
		return ServiceFactory.getRegistryService().bindPaymentToEnterprise(registrationId, paymentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.web.service.RegistryService#bindPaymentToEnterpriseById
	 * (java.lang.Long, java.lang.Long)
	 */
	public Boolean bindPaymentToEnterpriseById(Long enterpriseId, Long paymentId) {
		return ServiceFactory.getRegistryService().bindPaymentToEnterpriseById(enterpriseId, paymentId);
	}

	public Boolean unbindPaymentFromEnterprise(Long enterpriseId, Long paymentId) {
		return ServiceFactory.getRegistryService().unbindPaymentFromEnterprise(enterpriseId, paymentId);
	}

	public ApplicationMap processPaymentMatching(ApplicationMap registryApplication, String tax) throws ConstraintViolationException, SessionExpiredException, SystemException {
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			return ClientDataFactory.create(ServiceFactory.getRegistryService().processPaymentMatching(ClientDataFactory.create(registryApplication), tax,
					new PaymentMatchingLog()));

		} catch (IllegalArgumentException cve) {
			LOGGER.info("processPaymentMatching: " + cve.getMessage());
			throw new SystemException(cve.getMessage());
		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}

	public ApplicationMap processPaymentMatching2(ApplicationMap registryApplication, String tax) throws ConstraintViolationException, SessionExpiredException {
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			return ClientDataFactory.create(ServiceFactory.getRegistryService().processPaymentMatching2(ClientDataFactory.create(registryApplication), tax,
					new PaymentMatchingLog()));

		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}
	
	public String takeBackPaymentMatching(ApplicationMap registryApplication, String tax) throws SessionExpiredException {
		try {

			if (!isSessionValid())
				throw new SessionExpiredException("Seanss on aegunud!");

			return ServiceFactory.getRegistryService().takeBackPaymentMatching(ClientDataFactory.create(registryApplication), tax);

		} catch (Exception cve) {
			cve.printStackTrace();
			throw new SystemException(cve.getMessage());
		}
	}
	

	public ApplicationMap saveNewExtendApplication(ApplicationMap applicationMap) throws SessionExpiredException {

		if (!isSessionValid())
			throw new SessionExpiredException("Seanss on aegunud!");

		return ClientDataFactory.create(ServiceFactory.getRegistryService().saveNewExtendApplication(ClientDataFactory.create(applicationMap)));
	}
	
	public boolean checkCanExtend(long id) throws SystemException {
		return ServiceFactory.getRegistryService().checkCanExtend(id);
	}
	
	public boolean checkCanExtendByProduct(long id) throws SystemException {
		return ServiceFactory.getRegistryService().checkCanExtendByProduct(id);
	}

	public List findPaymentMatchingLogsByproduct(Long productId) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().findPaymentMatchingLogsByproduct(productId));
	}

	public List findPaymentMatchingLogsByApplicationId(Long applicationId) {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().findPaymentMatchingLogsByApplicationId(applicationId));
	}

	public ProductMap excludeProductFromregistry(ProductMap product) throws ConstraintViolationException {
		try {
			return ClientDataFactory.create(ServiceFactory.getRegistryService().excludeProductFromregistry(ClientDataFactory.create(product)));
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
	}

	public boolean isSessionValid() {

		HttpSession session = GWTSpringController.getRequest().getSession(false);

		if (session == null && GWTSpringController.getRequest().getRequestedSessionId() != null
				&& !GWTSpringController.getRequest().isRequestedSessionIdValid()) {

			// System.out.println("result isSessionValid false - "+ (userInfo ==
			// null ? "null" : userInfo.getName()));
			return false;
		}
		// System.out.println("result isSessionValid true - "+(userInfo == null
		// ? "null" : userInfo.getName()));
		return true;
	}

	public EnterpriseMap findEnterpriseByRegNr(String regCode) throws ConstraintViolationException {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().findEnterpriseByRegNr(regCode));
	}

	public EnterpriseMap getEnterpriseByActivity(String registrationNr) throws ConstraintViolationException {
		return ClientDataFactory.create(ServiceFactory.getRegistryService().getEnterpriseByActivity(registrationNr));
	}

	public boolean isExtendingAllowed(String applicationNr) {
		return ServiceFactory.getRegistryService().isExtendingAllowed(applicationNr);
	}

	public boolean enterpriseChanged(Long taotlejaId, Long applId) {

		return ServiceFactory.getRegistryService().enterpriseChanged(taotlejaId, applId);
	}

}
