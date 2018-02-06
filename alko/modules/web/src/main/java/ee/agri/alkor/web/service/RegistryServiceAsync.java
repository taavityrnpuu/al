package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.ReasonMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import java.util.HashMap;

/**
 *
 * @author ivar
 *
 */
public interface RegistryServiceAsync {

   void toDay(AsyncCallback callback);
   void getLoginBackURL(AsyncCallback callback);

   void processApplication(Long applicationId, AsyncCallback callback);

   void saveApplicationDecision(ApplicationMap appl, AsyncCallback callback);
   void isSigned(int applId, String docName, AsyncCallback callback);
   void isReportOK(AsyncCallback callback);
   void getCanEditEnterprise(AsyncCallback callback);
   void saveDeleteConfirmation(String title, String note, String id, int mode, AsyncCallback callback);
   void saveConfigValue(String key, String value, AsyncCallback callback);
   
   void saveEnterpriseReference(String firstname, String lastName, String idCode, String occupation, String toDate, String regCode, AsyncCallback callback);
   void getAllDeleteConfirmations(AsyncCallback callback);
   void getAllConfigValues(AsyncCallback callback);
   
   void getConfigFromDatabase(AsyncCallback callback);
   
   void getAllEnterpriseReferences(String regCode, AsyncCallback callback);
   
   void deleteEnterpriseReference(String id, AsyncCallback callback);
   
   void redoDocument(ApplicationMap appl, AsyncCallback callback);

   void saveExtendApplicationDecision(ApplicationMap appl, AsyncCallback callback);

   void saveNewSigner(ApplicationMap appl, AsyncCallback callback);

   void reprocessApplication(ApplicationMap appl, String reasonToDelete, AsyncCallback callback);

   void saveOrUpdate(EnterpriseMap data, AsyncCallback callback);

   void saveOrUpdate(ApplicationMap data, AsyncCallback callback);

   void saveOrUpdate(ApplicationMap data, boolean set, AsyncCallback callback);

   void saveOrUpdateApplication(ApplicationMap data, AsyncCallback callback);
   void saveOrUpdateApplicationA(ApplicationMap data, AsyncCallback callback);
   void saveOrUpdateJustApplication(ApplicationMap data, AsyncCallback callback);

   void saveOrUpdate(ProductMap data, AsyncCallback callback);

   void saveOrUpdateProduct(ProductMap data, AsyncCallback callback);

   void saveOrUpdate(RegistryPaymentMap data, AsyncCallback callback);

   void saveOrUpdate(NewsMap data, AsyncCallback callback);

   void saveOrUpdate(RegistryEntryMap entry, AsyncCallback callback);

   void updateRegistryEntryNr(ApplicationMap applicationMap, AsyncCallback callback);

   void saveOrUpdate(FAQMap data, AsyncCallback callback);

   void search(SearchFilter filter, AsyncCallback callback);
   void searchApplications(String regCode, SearchFilter filter, AsyncCallback callback);

   void findApplicationDocuments(Long applicationId, AsyncCallback callback);
   void findApplicationDocumentsPublic(Long applicationId, AsyncCallback callback);
   void findApplicationDocumentsArchived(Long applicationId, AsyncCallback callback);

   void findApplicationDocumentsFromUser(Long applicationId, AsyncCallback callback);

   void findProductDocuments(Long productId, AsyncCallback callback);
   
   void findProductDocumentsPublic(Long productId, AsyncCallback callback);
   
   void findProductDocumentsArchived(Long productId, AsyncCallback callback);

   void findProduct(Long productId, AsyncCallback callback);

   void findEnterprise(Long enterpriseId, AsyncCallback callback);

   void findEnterpriseByRegNr(String regCode, AsyncCallback callback);

   void getEnterpriseByActivity(String registrationNr, AsyncCallback callback);

   void findApplication(Long applicationId, AsyncCallback callback);

   void findPublicDocuments(AsyncCallback callback);

   void findPublicDocuments(String langId, AsyncCallback callback);

   void findProductMovementRecords(Long reportId, AsyncCallback callback);

   void deleteDocument(Long docId, AsyncCallback callback);
   
   void deleteDocumentWithReason(Long docId, String text, AsyncCallback callback);

   void deleteEnterprise(Long subjectId, AsyncCallback callback);

   void deleteProduct(Long subjectId, AsyncCallback callback);

   void deleteNews(Long newsId, AsyncCallback callback);

   void deleteFaq(Long faqId, AsyncCallback callback);

   void isDecisionDocumentPresent(String applicationNr, AsyncCallback callback);

   void isExtendDocumentPresent( String applicationNr,  String docType, AsyncCallback callback);

   void  createNewExtendDocument( String applicationNr, String docType, AsyncCallback callback);

   void isCorrectionDocumentPresent(String applicationNr, AsyncCallback callback);

   void isDeclineDocumentPresent(String applicationNr, AsyncCallback callback);

   void createNewDeclineDocument(String applicationNr, AsyncCallback callback);

   void createNewDecisionDocument(String applicationNr, AsyncCallback callback);

   void createNewCorrectionDocument(String applicationNr, AsyncCallback callback);

   void bindPaymentToEnterprise(String registrationId, Long paymentId, AsyncCallback callback);

   void bindPaymentToEnterpriseById(Long enterpriseId, Long paymentId, AsyncCallback callback);

   void unbindPaymentFromEnterprise(Long enterpriseId, Long paymentId, AsyncCallback callback);

   void processPaymentMatching(ApplicationMap registryApplication,
         String tax, AsyncCallback asyncCallback);
   
   void processPaymentMatching2(ApplicationMap registryApplication,
	         String tax, AsyncCallback asyncCallback);
   
   void takeBackPaymentMatching(ApplicationMap registryApplication,
	         String tax, AsyncCallback asyncCallback);

   void saveNewExtendApplication(ApplicationMap registryApplication,AsyncCallback asyncCallback);
   void checkCanExtend(long id,AsyncCallback asyncCallback);
   void checkCanExtendByProduct(long id,AsyncCallback asyncCallback);
   
   

   void findPaymentMatchingLogsByproduct(
         Long productId,AsyncCallback asyncCallback);

   void findPaymentMatchingLogsByApplicationId(Long applicationId, AsyncCallback asyncCallback);

   void excludeProductFromregistry(ProductMap product,AsyncCallback asyncCallback);
   
   void enterpriseChanged(Long taotlejaId, Long applId, AsyncCallback asyncCallback);

   void isExtendingAllowed(String applicationNr, AsyncCallback<Boolean> asyncCallback);
}
