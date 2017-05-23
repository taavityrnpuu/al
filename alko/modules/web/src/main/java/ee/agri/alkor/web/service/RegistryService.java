package ee.agri.alkor.web.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.ReasonMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.SearchFilter;

import java.util.HashMap;


public interface RegistryService extends BaseService {
   /**
    * Changes the state of application
    * into "processing"('menetluses').
    *
    * @param applicationId
    * @return ClassItemMap processing state classificator.
    */
   ClassItemMap processApplication(Long applicationId) ;
   /**
    * Saves the application decision according to
    * use case KL10.
    *
    * @param appl
    * @return
    */
   ApplicationMap saveApplicationDecision(ApplicationMap appl) ;
   boolean isSigned(int applId, String docName);
   boolean isReportOK();
   boolean getCanEditEnterprise();
   

   String[] getLoginBackURL();
   
   long saveDeleteConfirmation(String title, String note, String id, int mode);
   boolean saveConfigValue(String key, String value);
   
   long saveEnterpriseReference(String name, String idCode, String toDate, String regCode);
   List<String[]> getAllDeleteConfirmations();
   List<String[]> getAllConfigValues();
   
   HashMap<String, String> getConfigFromDatabase();
   
   
   List<String[]> getAllEnterpriseReferences(String regCode);
   
   long deleteEnterpriseReference(String id);
   
   ApplicationMap redoDocument(ApplicationMap appl) ;


   /**
    * Saves extend application decision and creates documents if neccesary
    * @param appl
    * @return
    */
   ApplicationMap saveExtendApplicationDecision(ApplicationMap appl);

   /**
    *  Updates signer for application decision
    * @param appl
    * @return
    */
   ApplicationMap saveNewSigner(ApplicationMap appl) ;

   /**
    * Deletes the decision and registry entry associated with the application and takes the application
    * back to processing (changes the application status);
    *
    * @param appl
    * @return
    */
   ApplicationMap reprocessApplication(ApplicationMap appl, String reasonToDelete);

   /**
    * Updates {@link Product#getCode()} part of {@link RegistryEntry#getNr()},
    * based on value in current {RegistryApplication} object
    * Old registry nr is expected to be in form .../old_product_code
    * @param savedAppl
    * @return updated registry entry or null
    */
   RegistryEntryMap updateRegistryEntryNr(ApplicationMap applicationMap);

   /**
    *
    * @return String todays date in default format.
    */
   String toDay();
   
   
   
   /**
    *
    * @param data
    * @return Long - id of data object instance
    */
   EnterpriseMap saveOrUpdate(EnterpriseMap data) throws ConstraintViolationException;

   ApplicationMap saveOrUpdate(ApplicationMap data) throws ConstraintViolationException, SessionExpiredException;

   ApplicationMap saveOrUpdate(ApplicationMap data, boolean set) throws ConstraintViolationException, SessionExpiredException;

   ApplicationMap saveOrUpdateApplication(ApplicationMap data) throws ConstraintViolationException, SessionExpiredException;
   ApplicationMap saveOrUpdateApplicationA(ApplicationMap data) throws ConstraintViolationException, SessionExpiredException;
   ApplicationMap saveOrUpdateJustApplication(ApplicationMap data);

   ProductMap saveOrUpdate(ProductMap data) ;

   ProductMap saveOrUpdateProduct(ProductMap data);

   RegistryPaymentMap saveOrUpdate(RegistryPaymentMap data) ;

   /**
    * Used to update registry entries
    * @param entry the entry object that you want to update
    * @return the updated entry
    */
   RegistryEntryMap saveOrUpdate(RegistryEntryMap entry) throws ConstraintViolationException;

   NewsMap saveOrUpdate(NewsMap data) ;

   FAQMap saveOrUpdate(FAQMap data) ;

   SearchFilter search(SearchFilter filter) ;
   SearchFilter searchApplications(String regCode, SearchFilter filter);
   /**
    *
    * @return List RegistryDocument
    *
    */
   List findApplicationDocuments(Long applicationId);
   List findApplicationDocumentsPublic(Long applicationId);
   List findApplicationDocumentsArchived(Long applicationId);
   
   List findApplicationDocumentsFromUser(Long applicationId);


   /**
    * Finds all documents added to all applications
    * of specified product.
    *
    * @param productId Long
    * @return List of RegistryDocumentMap
    */
   List findProductDocuments(Long productId);
   List findProductDocumentsPublic(Long productId);
   List findProductDocumentsArchived(Long productId);

   /**
    * Finds product, specified by id.
    *
    * @param productId Long
    */
   ProductMap findProduct(Long productId);

   /**
    * Finds enterprise, specified by id
    * @param enterpriseId
    * @return
    */
   EnterpriseMap findEnterprise(Long enterpriseId);

   /**
    * Finds apllication, specified by id
    * @param applicationId
    * @return
    */
   ApplicationMap findApplication(Long applicationId);

   /**
    *
    * @return List of RegistryDocumentMap
    */
   List  findPublicDocuments();

   /**
    *
    * @return List of RegistryDocumentMap
    */
   List  findPublicDocuments(String langId);

   /**
    * @param reportId Long
    * @return List of ProductMoveReportRecords
    */
   List findProductMovementRecords(Long reportId);

   /**
    *
    * @param docId RegistryDocument.id
    */
   void deleteDocument(Long docId) ;
   
   void deleteDocumentWithReason(Long docId, String text) ;
   /**
    *
    * @param subjectId Long
    */
   String deleteEnterprise(Long subjectId) ;

   /**
    *
    * @param productId
    */
   boolean deleteProduct(Long productId) ;

   void deleteNews(Long newsId);

   void deleteFaq(Long faqId);

   /**
    * Check if the decision document is present for the given application
    * @param applicationNr the registry application nr
    * @return true if a decision document exists otherwise false
    */
   Boolean isDecisionDocumentPresent(String applicationNr);

   /**
    * Check if extend application document of given type exists
    * @param applicationNr
    * @param docType
    * @return
    */
   Boolean isExtendDocumentPresent( String applicationNr,  String docType);

   /**
    * Create new extend document of given type
    * @param applicationNr
    * @param docType
    * @return
    */
   Boolean createNewExtendDocument( String applicationNr, String docType);

   /**
    * Check if the corretion document is present for the give application
    * @param applicationNr the registry application nr
    * @return true is a correction documents exists otherwise false
    */
   Boolean isCorrectionDocumentPresent(String applicationNr);

   /**
    * Check if the decline document is present for the given application
    * @param applicationNr
    * @return
    */
   Boolean isDeclineDocumentPresent(String applicationNr);
   
   boolean enterpriseChanged(Long taotlejaId, Long applId);

   Boolean createNewDeclineDocument(String applicationNr);

   Boolean createNewDecisionDocument(String applicationNr);

   Boolean createNewCorrectionDocument(String applicationNr);

   Boolean bindPaymentToEnterprise(String registrationId, Long paymentId);

   Boolean bindPaymentToEnterpriseById(Long enterpriseId,Long paymentId);

   Boolean unbindPaymentFromEnterprise(Long enterpriseId,Long paymentId);

   ApplicationMap processPaymentMatching(ApplicationMap registryApplication,
         String tax) throws ConstraintViolationException, SessionExpiredException ;
   
   ApplicationMap processPaymentMatching2(ApplicationMap registryApplication,
	         String tax) throws ConstraintViolationException, SessionExpiredException ;

   ApplicationMap saveNewExtendApplication(ApplicationMap registryApplication) throws SessionExpiredException;
   boolean checkCanExtend(long id) throws SystemException;
   boolean checkCanExtendByProduct(long id) throws SystemException;
   
   
   
   List findPaymentMatchingLogsByproduct(Long productId);

   List findPaymentMatchingLogsByApplicationId(Long applicationId);

   ProductMap excludeProductFromregistry(ProductMap product) throws ConstraintViolationException;

   EnterpriseMap findEnterpriseByRegNr(String regCode) throws ConstraintViolationException;

   EnterpriseMap getEnterpriseByActivity(String registrationNr) throws ConstraintViolationException;

   boolean isExtendingAllowed(String applicationNr);

}
