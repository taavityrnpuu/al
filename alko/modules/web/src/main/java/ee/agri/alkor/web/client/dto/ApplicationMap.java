package ee.agri.alkor.web.client.dto;


public class ApplicationMap extends ABaseDTOMap {

   public static final String NR = "nr";
   public static final String STATE = "state";
   public static final String TYPE = "type";
   public static final String ARRIVED = "arrived";
   public static final String APPLICANT = "applicant";
   public static final String IMPORTER = "importer";
   public static final String MARKETER = "marketer";
   public static final String PRODUCT = "product";
   public static final String PRODUCT_EXAMPLES = "productExamples";
   public static final String DECISION = "decision";
   public static final String NOTES = "notes";
   public static final String ADD_NOTE = "add_note";
   public static final String DOCUMENTS = "documents";
   public static final String STATE_FEE = "stateFee";
   public static final String MTRCHECK = "MTRCheck";
   public static final String PRINT = "print";
   public static final String PROCESSOR = "processor";
   public static final String REGISTRY_ENTRY = "registryEntry";
   public static final String REGISTRY_TAX_RATE = "registryTax";
   public static final String REGISTRY_TAX_RATE_CODE = REGISTRY_TAX_RATE + "." + ClassItemMap.CODE;
   public static final String PROCESSED = "processed";
   public static final String LATEST_PAYMENT = "latestPayment";
   public static final String RECIEVED_BY = "recievedBy";
   public static final String EXAMPL_RECIEVED_BY = "examplRecievedBy";
   public static final String EXAMPL_RETURNED = "examplReturned";
   public static final String EXAMPL_RETURNED_BY = "examplReturnedBy";

   /**
    * Nested properties
    */
   public static final String STATE_CODE = STATE + "." + ClassItemMap.CODE;
   public static final String STATE_ORDER_NR = STATE + "." + ClassItemMap.ORDER_NR;
   public static final String STATE_ORDER_NR_VTA = STATE + "." + ClassItemMap.ORDER_NR_VTA;
   public static final String STATE_NAME = STATE + "." + ClassItemMap.NAME;
   public static final String TYPE_NAME = TYPE + "." + ClassItemMap.NAME;
   public static final String TYPE_CODE = TYPE + "." + ClassItemMap.CODE;
   public static final String APPLICANT_NAME = APPLICANT + "." + EnterpriseMap.NAME;
   public static final String APPLICANT_BCODE = APPLICANT + "." + EnterpriseMap.REG_ID;
   public static final String APPLICANT_BALANCE = APPLICANT + "." + EnterpriseMap.BALANCE;
   public static final String APPLICANT_ISACTIVE = APPLICANT + "." + EnterpriseMap.ISACTIVE;
   public static final String APPLICANT_ID = APPLICANT + "." + EnterpriseMap.ID;
   public static final String PRODUCT_ID = PRODUCT + "." + ProductMap.ID;
   public static final String PRODUCT_APPLICATION_ID = PRODUCT + "." + ProductMap.APPLICATION + "." + ApplicationMap.ID;
   public static final String PRODUCT_APPLICATION = PRODUCT + "." + ProductMap.APPLICATION;
   public static final String PRODUCT_APPLICATION_APPLICANT_NAME = PRODUCT + "." + ProductMap.APPLICANT_NAME;
   public static final String PRODUCT_APPLICATION_APPLICANT = PRODUCT + "." + ProductMap.APPLICATION_APPLICANT;
   public static final String PRODUCT_APPLICATION_REG_ENTRY = PRODUCT + "." +ProductMap.REGISTRY_ENTRY;
   public static final String PRODUCT_APPLICATION_NEEDS_RENEWENING = ProductMap.APPLICATION + ".needsRenewening";
   public static final String PRODUCT_CODE = PRODUCT + "." + ProductMap.CODE;
   public static final String PRODUCT_NAME = PRODUCT + "." + ProductMap.NAME;
   public static final String PRODUCT_CREATED = PRODUCT + "." + ProductMap.CREATED;
   public static final String PRODUCT_TYPE = PRODUCT + "." + ProductMap.TYPE;
   public static final String PRODUCT_TYPE_NAME = PRODUCT + "." + ProductMap.TYPE_NAME;
   public static final String PRODUCT_TYPE_CODE = PRODUCT + "." + ProductMap.TYPE_CODE;
   public static final String PRODUCT_GRADE = PRODUCT + "." + ProductMap.GRADE;
   public static final String PRODUCT_VOLUME_CODE = PRODUCT + "." + ProductMap.VOLUME_CODE;
   public static final String PRODUCT_VOLUME_NAME = PRODUCT + "." + ProductMap.VOLUME_NAME;
   public static final String PRODUCT_EXAMPLES_RECEPTION_DATE = PRODUCT_EXAMPLES + "." + ProductExamplesMap.RECEPTION_DATE;
   public static final String PRODUCT_EXAMPLES_RETURN_DATE = PRODUCT_EXAMPLES + "." + ProductExamplesMap.RETURN_DATE;
   public static final String PRODUCT_EXAMPLES_DESTROY_DATE = PRODUCT_EXAMPLES + "." + ProductExamplesMap.DESTROY_DATE;
   public static final String PRODUCT_EXAMPLES_COUNT = PRODUCT_EXAMPLES + "." + ProductExamplesMap.COUNT;
   public static final String PRODUCT_PRODUCER_NAME = PRODUCT + "." + ProductMap.PRODUCER + "." + EnterpriseMap.NAME;
   public static final String PRODUCT_PRODUCER_COUNTRY = PRODUCT + "." + ProductMap.PRODUCER + "." + EnterpriseMap.ADDRESS_COUNTRY;
   public static final String PRODUCT_PRODUCER_COUNTRY_NAME = PRODUCT_PRODUCER_COUNTRY + "." + ClassItemMap.NAME;
   public static final String PRODUCT_PRODUCER_COUNTRY_CODE = PRODUCT + "." + ProductMap.PRODUCER + "." + EnterpriseMap.ADDRESS_COUNTRY_CODE;
   public static final String DECISION_NR = DECISION + "." + DecisionMap.NR;
   public static final String DECISION_DATE = DECISION + "." + DecisionMap.DATE;
   public static final String EXTEND_UNTIL_DECISION_DATE = DECISION + "." + DecisionMap.EXTEND_UNTIL_DATE;
   public static final String DECISION_REG_ENTRY = DECISION + "." + DecisionMap.ENTRY_DECISION;
   public static final String DECISION_EXTEND_REG_ENTRY = DECISION + "." + DecisionMap.EXTEND_DECISION;
   public static final String DECISION_REG_ENTRY_CODE = DECISION_REG_ENTRY + "." + ClassItemMap.CODE;
   public static final String DECISION_EXAMPLES = DECISION + "." + DecisionMap.EXAMPLES_DECISION;
   public static final String DECISION_EXAMPLES_CODE = DECISION_EXAMPLES + "." + ClassItemMap.CODE;
   public static final String REGISTRYENTRY_NR = REGISTRY_ENTRY + "." + RegistryEntryMap.NR;
   public static final String REGISTRYENTRY_VALID_FROM = REGISTRY_ENTRY + "." + RegistryEntryMap.VALID_FROM;
   public static final String REGISTRYENTRY_VALID_UNTIL = REGISTRY_ENTRY + "." + RegistryEntryMap.VALID_UNTIL;
   public static final String DECISION_EXPLANATION = DECISION + "." + DecisionMap.EXPLANATION;
   public static final String DECISION_EXTEND_UNTIL_EXPLANATION = DECISION + "." + DecisionMap.EXTEND_UNTIL_EXPLANATION;
   public static final String DECISION_SIGNER_ID = DECISION + "." + DecisionMap.SIGNER + "." + ABaseDTOMap.ID;
   public static final String PRODUCT_ORIGINCOUNTRY = PRODUCT + "." + ProductMap.ORIGINCOUNTRY;
   public static final String PRODUCT_ORIGINCOUNTRY_NAME =  PRODUCT + "." +ProductMap.ORIGINCOUNTRY_NAME;
   public static final String PRODUCT_ORIGINCOUNTRY_CODE = PRODUCT + "." +ProductMap.ORIGINCOUNTRY_CODE;
   public static final String APPLICATION_TYPE = PRODUCT + "." + ProductMap.APPLICATION + "." + ApplicationMap.TYPE;

   public static final String PROCESSOR_REG_ID = PROCESSOR + "." + PersonMap.REG_ID;
   public static final String PROCESSOR_FIRSTNAME = PROCESSOR + "." + "firstName";
   public static final String PROCESSOR_LASTNAME = PROCESSOR + "." + "lastName";
   public static final String PROCESSOR_USERNAME = PROCESSOR + "." + "userName";

   /** olek - tühistatud */
   public static final String STATE_CODE_CANCELED = "VOID";
   /** olek - esitatud */
   public static final String STATE_CODE_PRESENTED = "ADD";
   /** olek - pikendatud */
   public static final String STATE_CODE_EXTENDED = "REXT";
   /** olek - mitte pikendatud */
   public static final String STATE_CODE_NOT_EXTENDED = "REXTN";
   /** olek - esitamata */
   public static final String STATE_CODE_ENTERED = "ENT";
   /** olek - menetluses */
   public static final String STATE_CODE_PROCESSING = "PRO";
   /** olek - kontrollimisel */
   public static final String STATE_CODE_CHECKING = "CTL";
   /** olek - vajab täpsustamiset */
   public static final String STATE_CODE_NEEDS_CLARIFICATION = "NMO";
   /** olek - registrisse kantud */
   public static final String STATE_CODE_ENTERED_TO_REGISTRY = "RGE";
   /** olek - registrisse mittekantud */
   public static final String STATE_CODE_NOT_ENTERED_TO_REGISTRY = "RGN";
   public static final String PRODUCT_VERSION = PRODUCT + "." + ProductMap.VERSION;

   /** tüüp - taotlus registrikande pikendamiseks */
   public static final String TYPE_CODE_EXTEND = "ARP";
   /** tüüp - taotlus registrisse kandmiseks */
   public static final String TYPE_CODE_ARE = "ARE";
   
   public static final String FROM_XTEE = "fromXTee";

   public ApplicationMap() {
      super();
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public String toString() {
      String uus = "ApplicationMap[id="+this.getProperty(ABaseDTOMap.ID)+"; applicantName=" + this.getProperty(ApplicationMap.DECISION_EXTEND_REG_ENTRY) +"; productName="+ this.getProperty(ApplicationMap.DECISION_REG_ENTRY_CODE)+"; productId=" + this.getProperty(ApplicationMap.PRODUCT_ID)+"; reg_entry_nr="+this.getProperty(ApplicationMap.REGISTRYENTRY_NR)+"; state_fee="+this.getProperty(ApplicationMap.LATEST_PAYMENT)+";code=" +this.getProperty(ABaseDTOMap.CODE) +"; version="+ this.getProperty(ABaseDTOMap.VERSION)+"; EXPL=" +this.getProperty(ApplicationMap.DECISION_EXPLANATION)+ "]";
      return uus;
   }

}
