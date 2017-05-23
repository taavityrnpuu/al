package ee.agri.alkor.service;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Faq;
import ee.agri.alkor.model.News;
import ee.agri.alkor.model.PaymentMatchingLog;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.model.classes.ApplicationState;
import java.sql.ResultSet;
import java.util.HashMap;

public interface IRegistryService extends IBaseService {
   /**
    * Changes the state of application
    * into "processing"('menetluses').
    *
    * @param applicationId
    * @return ApplicationState processing state from classificator.
    */
   ApplicationState processApplication(Long applicationId) ;
   /**
    * Saves the application decision according to
    * use case KL10.
    *
    * @param appl
    * @return
    */
   RegistryApplication saveApplicationDecision(RegistryApplication appl) ;
   
   boolean isSigned(int applId, String docName);
   boolean isReportOK();
   boolean getCanEditEnterprise();
   
   
   String[] getLoginBackURL();
   
   ArrayList<String[]> getAllDeleteConfirmations();
   ArrayList<String[]> getAllConfigValues();
   
   HashMap<String, String> getConfigFromDatabase();
   
   
   
   ArrayList<String[]> getAllEnterpriseReferences(String regCode);
   
   long saveDeleteConfirmation(String title, String note, String id, int mode);
   boolean saveConfigValue(String key, String value);
   
   
   long deleteEnterpriseReference(String id);   
   
   long saveEnterpriseReference(String name, String idCode, String toDate, String regCode);
   
   RegistryApplication redoDocument(RegistryApplication appl) ;

   /**
    * Saves extend application decision and creates documents
    * @param registryApplication
    * @return
    */

   RegistryApplication saveExtendApplicationDecision(RegistryApplication registryApplication);

   /**
    * Updates {@link Product#getCode()} part of {@link RegistryEntry#getNr()},
    * based on value in current {@link RegistryApplication} object
    * Old registry nr is expected to be in form .../old_product_code
    * @param savedAppl
    * @return updated registry entry or null
    */
   RegistryEntry updateRegistryEntryNr(RegistryApplication savedAppl)
         throws ConstraintViolationException;

   /**
    *  Updates signer for application decision
    * @param appl
    * @return
    */

   RegistryApplication saveNewSigner(RegistryApplication appl) ;

   /**
    * Deletes the decision and registry entry associated with the application and sets the status
    * of the application to processing
    * @param appl The application model object from which to delete
    * @return appl The same application model with the changes applied to it
    */
   RegistryApplication reprocessApplication(RegistryApplication appl, String reasonToDelete);

   /**
    *
    * @param application
    * @return IdNr application Id and Nr.
    */
   RegistryApplication saveOrUpdate(RegistryApplication application) ;

   /**
    * Used to save only application object and it's processor
    * For saveOrUpdate of {@link Product} or {@link Enterprise} objects aswell,
    * use {@link IRegistryService#saveOrUpdate(RegistryApplication)} instead
    * @param application
    * @return
    */
   
   boolean enterpriseChanged(Long taotlejaId, Long applId);
   
   RegistryApplication saveOrUpdateApplication(RegistryApplication application);
   RegistryApplication saveOrUpdateApplicationA(RegistryApplication application);

   /** Used to save only application object and it's processor
    * saveOrUpdateApplication saves product too, this one doesn't
    * @param application to be saved
    * @return
    */
   RegistryApplication saveOrUpdateJustApplication(RegistryApplication application);

   /**
    * Used to save applications by EIT users.
    * Saves enterprise representative, on whose behalf application is inserted
    * @param application
    * @return
    */
   RegistryApplication saveOrUpdateEITApplication(RegistryApplication application);

   /**
    * Used to update registry entries
    * @param entry the entry object that you want to update
    * @return the updated entry
    */
   RegistryEntry saveOrUpdate(RegistryEntry entry)throws ConstraintViolationException;

   /**
    *
    * @param enterprise
    * @return Enterprise
    */
   Enterprise saveOrUpdate(Enterprise enterprise) throws ConstraintViolationException;

   News saveOrUpdate(News news) throws ConstraintViolationException;

   Faq saveOrUpdate(Faq faq) throws ConstraintViolationException;

   Product saveOrUpdate(Product product) throws ConstraintViolationException;
   /**
    * Refreshes producer's Address attribute and calls {@link IRegistryService#saveOrUpdate(Product)}
    * @param product
    * @return
    * @throws ConstraintViolationException
    */
   Product saveOrUpdateWithProducerAddressRefresh(Product product) throws ConstraintViolationException;

   Product saveOrUpdateProduct(Product product) throws ConstraintViolationException;
   /**
    * Associates received payment information
    * with enterprise.
    *
    * @param registrationId String eneterprise reg. nr.
    * @param paymentId Long
    */
   Boolean bindPaymentToEnterprise(String registrationId, Long paymentId) ;

   /**
    * Get subjects full data(together with
    * associations).
    *
    * @param enterpriseId
    * @return Enterprise
    */
   Enterprise getEnterprise(final Long enterpriseId) ;
   /**
    *
    * @param registrationNr String
    * @return Enterprise
    */
   Enterprise getEnterprise(String registrationNr) ;

   Enterprise getEnterpriseByActivity(String registrationNr);
   /**
    *
    * @param id
    */
   String deleteEnterprise(Long subjectId) ;
   /**
    * Method for adding documents.
    *
    * @param content byte []
    * @param docType String - from classificator.
    * @param docLangCode String - from classificator.
    * @param docName String
    * @param applicationNr String - related RegistryApplication.nr if
    * 		relevant.
    * @param mayRepeat boolean if the file name may already exist
    * @return Long document id.
    */
   Long addDocument(byte [] content, String docType, String docLangCode, String applicationNr,
         Long applId, String docName, String fileName, String contentType, boolean mayRepeat, String isPublic)  throws ConstraintViolationException;
   /**
    *
    * @param applicationNr
    * @return
    */
   RegistryApplication findRegistryApplication(String applicationNr) ;
   /**
    *
    * @param id
    * @return
    */
   RegistryApplication findRegistryApplicationById(Long id) ;
   /**
    * Tagastab ettev�tte taotlused, milledega seotud kanded vajavad pikendamist
    * aga pikendamise taotlust pole veel esitatud.
    *
    * @param registrationNr
    * @return List<RegistryApplication>
    */
   List<RegistryApplication> findEnterpriseExpiringEntryApplications(
         String registrationNr) ;

   /**
    * Tagastab ettev�tte taotlused, mis on aegumas 60 päeva pärast
    *
    * @param registrationNr
    * @return List<RegistryApplication>
    */
   List<RegistryApplication> findEnterpriseExpiringIn60(
         String registrationNr) ;
   /**
    *
    * @param registrationNr
    * @return
    */
   List<RegistryApplication> findWaitingEnterpriseApplications (
         String registrationNr) ;
   /**
    *
    * @param applicationNr String
    * @return List<RegistryDocument>
    */
   List<RegistryDocument> findApplicationDocuments(String applicationNr);
   List<RegistryDocument> findApplicationDocumentsPublic(String applicationNr);
   List<RegistryDocument> findApplicationDocumentsArchived(String applicationNr);

   /**
    *
    * @param name
    * @return Enterprise or null if not found
    */
   List<Enterprise> findEnterpriseByNameorRegNr(String name, String regNr) ;

   /**
    * Generates PDF document, if applicant of the application has specified regCode
    *
    * @param docTypeCode
    * @param applicationId
    * @return byte [] content of document
    */
   byte []  createApplicationDocumentByIdAndRegCode(String docTypeCode,
         Long applicationID, String regCode) ;

   /**
    * Generates PDF document
    * @param docTypeCode
    * @param id application ID
    * @return
    */
   public byte[] createApplicationDocumentById(String docTypeCode, Long id);

   /**
    *
    * @param applicationId
    * @return
    */
   List<RegistryDocument> findApplicationDocuments(Long applicationId);
   List<RegistryDocument> findApplicationDocumentsPublic(Long applicationId);
   List<RegistryDocument> findApplicationDocumentsArchived(Long applicationId);
   List<RegistryDocument> findApplicationDocumentsFromUser(Long applicationId);
   /**
    *
    * @param productId Long
    * @return List<RegistryDocument>
    */
   List<RegistryDocument> findProductDocuments(Long productId);
   List<RegistryDocument> findProductDocumentsPublic(Long productId);
   List<RegistryDocument> findProductDocumentsArchived(Long productId);
   /**
    *
    * @return List<RegistryDocument>
    */
   List<RegistryDocument> findPublicDocuments();
   /**
    *
    * @return List<RegistryDocument>
    */
   List<RegistryDocument> findPublicDocuments(String langCode);
   /**
    *
    * @return
    */
   List<News> findNews();
   /**
    *
    * @return
    */
   List<Faq> findFaqs();

   RegistryEntry findRegistryEntry(String entryNr) ;

   /**
    *
    * @param entryNr
    * @return RegistryEntry
    */
   RegistryEntry findRegistryEntryByApplication(String applNr) ;
   /**
    *
    * @param applicationId
    * @return
    */
   RegistryEntry findRegistryEntryByApplicationId(Long applicationId) ;
   /**
    *
    * @param productId
    * @return
    */
   Product findProduct(Long productId);


   /**
    *
    * @param enterpriseId
    * @return
    */
   Enterprise findEnterprise(Long enterpriseId);

   /**
    *
    * @param applicationId
    * @return
    */
   RegistryApplication findApplication(Long applicationId);

   /**
    *
    * @param name
    * @return Enterprise or null if not found
    */
   Enterprise findEnterpriseByName(String name) ;
   /**
    *
    * @param regNr
    * @return Enterprise or null if not found
    */
   Enterprise findEnterpriseByRegNr(String regNr) ;
   /**
    *
    * @param enterpriseRegNr
    * @return
    */
   Enterprise findProductMovementReportingEnterprise(String enterpriseRegNr) ;

   Enterprise findProductMovementReportingEnterprise(long reportId) ;

   /**
    * Tagastab alkohooli liikumise kirjete listi.
    *
    * @param reportId -
    *           alkohooli liikumise arunne id.
    */
   List<ProductMovementReportRecord> findProductMovementRecords(Long reportId);


   Person findPerson(String personalCode);

   /**
   * Sisekasutaja jaoks
   * @param docoumentId Long
   * @return RegistryDocument with content property.
   */
  RegistryDocument getDocument(Long docoumentId);

   /**
    * Väliskasutaja jaoks
    * @param docoumentId Long
    * @return RegistryDocument with content property.
    */
   RegistryDocument getDocument(Long docoumentId, String regCode);

   /**
    * Returns unique application document
    * (decision or correction) by document name.
    *
    * @param fileName String document file name(substring)
    * @return RegistryDocument
    */
   List getApplicationDocuments(String fileName);

   /**
    * Returns application document(s) by name and application id
    * @param fileName
    * @param applicationId
    * @return
    */
   List getApplicationDocumentsByNameAndApplicationId(String fileName,Long applicationId);

   /**
    *
    * @param docoumentId Long
    */
   void deleteDocument(Long documentId);
   
   void deleteDocumentWithReason(Long documentId, String text);
   /**
    *
    * @param applicationNr
    * @param name
    */
   void deleteDocument(String applicationNr, String name) ;

   /**
    *
    * @param applicationId
    * @param name
    */
   void deleteDocument(Long applicationId, String name) ;

   /**
    *
    * @param newsId
    */
   void deleteNews(Long newsId);
   /**
    *
    * @param faqId
    */
   void deleteFaq(Long faqId);

   /**
    *
    * @param productId
    */
   boolean deleteProduct(Long productId);

   /**
    * Generates PDF document.
    *
    * @param docTypeCode
    * @param applicationNr
    * @param signerUserName
    * @return byte [] content of document
    */
   byte []  createApplicationDocument(String docTypeCode,
         String applicationNr, String regCode) ;


   /**
    * Gets the data with the searchFilter and generates an excel document with the data
    *
    * @param searchFilter
    * @return
    */
   void createExcelExportDocument(SearchFilter searchFilter, OutputStream output);

   /**
    * SuperSearch
    * @param searchFilter
    * @param output
    * @return
    */
   SearchFilter superSearch(SearchFilter searchFilter);

   /**
    * check if decision document is present for application with given number
    * @param applicationId the registry application nr
    * @return true if a decision document exists otherwise false
    */
   Boolean isDecisionDocumentPresent(String applicationNr);

   /**
    * Check if extend application document of given type exists
    * @param applicationNr
    * @param docType
    * @return
    */
   Boolean isExtendDocumentPresent(String applicationNr,String docType);

   /**
    * Create new extend document of given type
    * @param applicationNr
    * @param docType
    * @return
    */
   Boolean createNewExtendDocument( String applicationNr, String docType);

   /**
    * check if correction document is present for application with given number
    * @param applicationId the registry application nr
    * @return true is a correction documents exists otherwise false
    */
   Boolean isCorrectionDocumentPresent(String applicationNr);

   /**
    * check if decline document is present for application with given number
    * @param applicationNr the application number of the document
    * @return
    */
   Boolean isDeclineDocumentPresent(String applicationNr);

   /**
    * Used to create a new Decline document when the old one has been deleted
    * @param applicationNr
    * @return
    */
   Boolean createNewDeclineDocument(String applicationNr);

   /**
    * Used to create a new Decision document when the old one has been deleted
    * @param applicationNr
    * @return
    */
   Boolean createNewDecisionDocument(String applicationNr);

   /**
    * Used to create a new Correction document when the old one has been deleted
    * @param appl
    * @return
    */
   Boolean createNewCorrectionDocument(String applicationNr);

   /**
    * Binds a payment to an enterprise
    * @param enterpriseId
    * @param paymentId
    * @return
    */
   Boolean bindPaymentToEnterpriseById(Long enterpriseId, Long paymentId);

   /**
    * Unbinds payment from enterprise and substracts amount from enterprise's account
    * @param registryPayment
    * @return
    */
   Boolean unbindPaymentFromEnterprise(final Long enterpriseId, final Long paymentId);

   RegistryApplication processPaymentMatching(RegistryApplication registryApplication,
         String tax, PaymentMatchingLog paymentMatchingLog) throws ConstraintViolationException;
   
   RegistryApplication processPaymentMatching2(RegistryApplication registryApplication,
	         String tax, PaymentMatchingLog paymentMatchingLog) throws ConstraintViolationException;

   RegistryApplication saveNewExtendApplication(RegistryApplication registryApplication);
   
   boolean checkCanExtend(long id) throws SystemException;
   boolean checkCanExtendByProduct(long id) throws SystemException;
   
   

   List<PaymentMatchingLog> findPaymentMatchingLogsByproduct(Long productId);

   /**
    * Statefee's by application
    * @param applicationId
    * @return
    */
   List<PaymentMatchingLog> findPaymentMatchingLogsByApplicationId(Long applicationId);

   /**
    * Update's product's application state and registry entry's validUntilField
    * @param product
    * @return
    */
   Product excludeProductFromregistry(final Product product) throws ConstraintViolationException;

   /**
    *
    * @return document savepoint specified in build.properties
    */
   String getDocRoot();

   /**
    * 
    * @return base URI of application, specified in build.properties
    */
   String getBaseURI();


   void saveXid(XTeeId xid);


   /**
    * Checks whether there already exists payment with given order number
    * @param orderNum
    * @return
    */
   boolean isPaymentUnique(String orderNumber);

   /**
    * Returns new or modified person
    * @param representative
    * @param firstName
    * @param lastName
    * @param idCode
    * @param occupation
    * @return
    */
   public Person createOrUpdateRepresentative(Person representative, String firstName, String lastName,
         String idCode, String occupation);

   boolean isExtendingAllowed(String applicationNr);

}
