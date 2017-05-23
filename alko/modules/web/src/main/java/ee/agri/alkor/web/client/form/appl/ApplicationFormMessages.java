package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface ApplicationFormMessages extends ConstantsWithLookup{

	public static final String PROCESS_APPLICATION_TABLE_TITLE = "processApplicationTableTitle";
	public static final String ADD_APPLICATION_TABLE_TITLE = "addApplicationTableTitle";

	String searchTableTitle();
	String buttonEmptyFilter();
	String buttonSearch();
	String addApplicationTableTitle();
	String processApplicationTableTitle();
	String buttonEmpty();
	String buttonSave();
	String buttonRequiresInfo();
	String buttonProcess();
	String listTableTitle();
    String arrived();
    String nr();
    String applicant_name();
    String applicant_registrationId();
    String applicant_balance();
    String registryTax();
    String product_producer_name();
    String product_name();
    String product_code();
    String product_ethanolRate();
    String product_producer_address_country();
    String state_name();
    String type_name();
    String select();
    String cancel();
    String documents();
    String stateFee();
    String product_type_name();
    String product_packingVolume_name();
    String productExamples_count();
    String productExamples();
    String notes();
    String MTRCheck();
    String print();
    String state_code();
    String startTime();
    String endTime();
    String product_type_code();
    String product_originCountry_code();
    String decision_signer_id();
    String decision_date();
    String registryTax_code();
    String buttonExtendedApplication();
    String created();
    String createdBy();
    String amount();
    String enterpriseBindedTo();
    String registryEntry_validUntil();

    String buttonSaveExtendApplication();
    String treatExtend();
    String extendable_product();
    String extendTitle();
    String applicationSavedAndRegistryFeeTaken();
    String applicationSavedAndRegistryFeeNotTaken();
    String applicationSaved();
    String IsXTeeForm();
}
