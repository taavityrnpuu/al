package ee.agri.alkor.web.service;
/**
 * Document upload, download service interface.
 *
 * @author ivar
 *
 */
public interface ServiceConstants {

	/**
	 *
	 */
	
	String EIT_USERNAME = "EIT";
	
	String DOC_SERVICE_URL = "app/doc";
	
	String DOC_SERVICE_URL_2 = "app/docc";

	String DECISION_DOC_NAME ="Otsus nr. ";

	String COR_DOC_NAME ="Õiend nr. ";

	String NDEC_DOC_NAME = "Ärakiri nr. ";

	String EX_DECISION_DOC_NAME ="Pikendamise otsus nr. ";

	String EX_COR_DOC_NAME ="Pikendamise õiend nr. ";

	String EX_NDEC_DOC_NAME = "Pikendamise ärakiri nr. ";

	String EX_DECISION_DOC_NAME_NULL ="Pikendamise otsus";

	String EX_COR_DOC_NAME_NULL ="Pikendamise õiend";

	String EX_NDEC_DOC_NAME_NULL = "Pikendamise ärakiri";

	String EXPIRED_REASON = "Registrikanne on aegunud";
	/**
	 *
	 */
	String REGISTRY_SERVICE_URL = "app/registry.rpc";

	String CLASS_SERVICE_URL = "app/class.rpc";

	String AUTH_SERVICE_URL = "app/auth.rpc";
   String USER_MAN_SERVICE_URL = "app/user.rpc";

   String EXTERNAL_SERVICE_URL = "app/external.rpc";

   String SEARCH_FILTER_OBJECT_CLASS = "searchFilterObjectClass";

   String SEARCH_FILTER_QUERY_PARAMS = "searchFilterQueryParams";

   String SEARCH_FILTER_COLUMN_LIST = "searchFilterColumnList";

   String SEARCH_FILTER_SORT_MAP = "searchFilterSortMap";

   String SEARCH_FILTER_ORDER_BY = "searchFilterOrderBy";

   String SEARCH_FILTER_QUERY_LABELS = "searchFilterQueryLabels";

   String CONTENT_TYPE = "Content-type";

   String X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";

   /**
    * Excel content type
    */
   String CONTENT_TYPE_EXCEL = "application/vnd.ms-excel";
   /**
    * excelParams
    */
   String DOC_EXCEL_EXPORT_PARAM = "excelParams";
   /**
    * HTTP request parameter specifyinng document
    * action.
    */
   String DOC_ACTION_PARM = "do";
   /**
    * Save action, opens file save dialog.
    */
   String DOC_ACTION_SAVE = "save";
   /**
    * Opens document in other window.
    */
   String DOC_ACTION_OPEN = "open";
   /**
    * Generate action, opens document in other window.
    */
   String DOC_ACTION_GENERATE = "gen";
   /**
    * Export to excel, opens document in other window.
    */
   String DOC_ACTION_EXPORT_TO_EXCEL = "excel";
	/**
	 * Document type request parameter name.
	 */
	String DOC_LANG_PARM = "lang";

	/**
	 * Document type request parameter name.
	 */
	String DOC_TYPE_PARM = "docType";
	/**
	 * Application nr parameter name.
	 */
	String DOC_APPNR_PARM = "appNr";
	/**
	 * Application or product reference id
	 * parameter name.
	 */
	String DOC_PRODID_PARM = "productId";
	String DOC_APPID_PARM = "appId";
	/**
	 * Document reference number.
	 * If type is DER or COR then decision.nr.
	 * When docType is ARE, then application nr.
	 */
	String DOC_REFNR_PARM = "nr";
	/**
	 * Document type request parameter name.
	 */
	String DOC_NAME_PARM = "docName";
	/**
	 * Document type request parameter name.
	 */
	String DOC_FILE_PARM = "file";

	/**
	 * Application "applyed" (esitatud menetluseks)state code.
	 */
	String APPL_STATE_PRE = "ADD";

	/**
	 * Application "processing" (menetluses)state code.
	 */
	String APPL_STATE_PRO = "PRO";
	/**
	 * Application state "entered into register"
	 * state code.
	 */
	String APPL_STATE_RGE = "RGE";

	/**
	 * Application state "extended" state code
	 */
	String APPL_STATE_REXT = "REXT";


	/**
	 * Application product example return state - return (Toote näidis tagastada)
	 */
	String APPL_PROD_EXMP_PER = "PER";

	/**
	 * Application product example return state - don't return (Toote näidis säilitada)
	 */
	String APPL_PROD_EXMP_PEK = "PEK";

	/**
	 * Application product example return state - not needed (Toote näidist ei pea esitama)
	 */
	String APPL_PROD_EXMP_PEN = "PEN";

	/**
	 * Application state "not entered into register"
	 * state code.
	 */
	String APPL_STATE_RGN = "RGN";
	/**
	 * Application state "cancelled"
	 * state code.
	 */
	String APPL_STATE_CAN = "VOID";
	/**
	 * Application type "application"
	 * classificator code.
	 */
	String APPL_TYPE_ARE = "ARE";

	/**
	 * Application type "extend application" classificator code
	 */
	String APPL_TYPE_ARP = "ARP";

	/**
	 * Positive RegistryEntryDecision class code.
	 */
	String REGENTRY_DECISION = "RGE";
	/**
	 * Negative RegistryEntryDecision class code
	 */
	String REGENTRY_DECISION_N = "RGN";
	/**
	 * Positive extend RegistryEntryDecision class code
	 */
	String REGENTRY_DECISION_EXTENDED = "REXT";

	/**
	 * Application 'mitte pikendatud' state code.
	 */
	String APPL_STATE_REXT_NOT = "REXTN";

	/**
	 * Negative extend RegistryEntryDecision class code
	 */
	String REGENTRY_DECISION_NOT_EXTENDED = "REXTN";

	/**
	 * Value of public document type
	 * classificator code.
	 */
	String DOC_TYPE_PUBLIC = "PUB";
	/**
	 * Value of application document type
	 * classificator code.
	 */
	String DOC_TYPE_APP = "ARE";
	/**
	 * Value of product document type
	 * classificator code.
	 */
	String DOC_TYPE_PRO = "PRO";
	/**
	 * Value of decision document type
	 * classificator code.
	 */
	String DOC_TYPE_DEC = "DEC";

	/**
	 * Value of decline document type
	 * classificator code.
	 */
	String DOC_TYPE_NDEC = "NDEC";
	/**
	 * Value of correction(õiend) document type
	 * classificator code.
	 */
	String DOC_TYPE_COR = "COR";

	/**
	 * Registry entry extend decision
	 * document type classificator code value.
	 */
	String DOC_TYPE_EX_DEC = "EX_DEC";

	/**
	 * Registry entry extend decline (ärakiri)
	 * document type classificator code value.
	 */
	String DOC_TYPE_EX_NDEC = "EX_NDEC";

	/**
	 * Registry entry extend correction(õiend)
	 * document type classificator code value.
	 */
	String DOC_TYPE_EX_COR = "EX_COR";

	/**
	 * User role for document signers.
	 */
	String ROLE_TYPE_SIG = "DOC_SIG";

   /**
    * Avalik kasutaja.
    */
   String ROLE_PUBLIC = "ROLE_PUB";

   /**
    * Käitleja.
    */
   String ROLE_ENT_REP = "ROLE_ENT_REP";

   /**
    * Registri töötaja.
    */
   String ROLE_REG_WRK = "ROLE_REG_WRK";

   /**
    * Järelevalvetöötaja.
    */
   String ROLE_AUDIT = "ROLE_AUDIT";


   /**
    * Läbi EIT'i tulnud kasutaja.
    */
   String ROLE_EIT_GRP = "ROLE_EIT_GRP";

   /**
    * Haldus administraator.
    */
   String ROLE_CLASS_ADM = "ROLE_CLASS_ADM";

   /**
    * Tehniline administraator.
    */
   String ROLE_USR_ADM = "ROLE_USR_ADM";

	/**
	 * Document id response parameter.
	 */
	String DOCUMENT_ID = "docId";

	String SEARCH_FILTER_TEXT_PARAMS = "filterTextValues";

	/**
	 * Extend application decision types
	 */
	String EXTEND_DECISION = "extended";
	String NOTEXTENDED_DECISION = "notExtended";
	String EXTENDED_UNTIL = "extendedUntil";

	/** väliskasutaja jaoks */
	String LIMITED_SEARCH = "l";
	
	String PUB = "pub";

}
