package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface ProductsFormKeys extends ConstantsWithLookup {

	/**
	 * Methods associated with string constants by gwt on runtime
	 * @return
	 */
	String name();
	String code();
	String type_code();
	String producer_name();
	String producer_address_country_name();
	String producer_address_country_code();
	String importer_name();
	String marketer_name();
	String packager_name();
	String originCountry_code();
	String packingVolume();
    String packingVolume_code();
	String packingVolume_unit();
	String ethanolRate();
	String ethanolRate_add();
	String ethanolRate_search();
	String packingMaterial_code();
	String numberOfLabels();
	String bottleShape_code();
	String bottleColor_code();
	String corkMaterial_code();
	String corkColor_code();
	String corkShape_code();
	String hasStocking();
	String stockingColor_code();
	String hasFrontLabel();
	String hasRearLabel();
	String hasNeckLabel();
	String hasOtherLabel();
	String examples();
	String notes();
	String notesadd();
	String startTime();
	String registryEntryApplication_decision_regEntryDecision_code();
	String registryEntryApplication_applicant_name();
	String registryEntryApplication_nr();
	String endTime();
	String type_name();
	String registryEntryApplication_registryEntry_validUntil();
	String registryEntryApplication_registryEntry_extendedUntil();
	String registryEntryApplication_registryEntry_validFrom();
	String registryEntryApplication_decision_date();
	String registryEntryApplication_registryEntry_newUntil();
	String registryEntryApplication_registryEntry_changeReason();

	String searchTableTitle();
	String buttonEmptyFilter();
	String buttonSearch();
	String manageTableTitle();
	String buttonBack();
	String forward();
	String buttonInvalidate();
	String buttonProlong();
	String buttonEmpty();
	String buttonSave();
	String buttonConfirm();
   String tableApplicatntName();
   String tableProductType();
   String tableProductName();
   String tableProductGrade();
   String tableProductVolume();
   String tableProducerName();
   String tableProducerCountry();
   String tableDecisionDate();
   String tableRegistryNr();
   String select();
   String change();
   String delete();

	String listTableTitle();
	String productNoteTableTitle();
	String registryEntry_validFrom();
	String registryEntry_validUntil();
	String registryEntry_newUntil();
	String registryEntry_extendedUntil();
	String registryEntry_changeReason();
   String productSavedMsg();
   String deleteProductConfirmMsg();
   String deleteProductSucceeded();
   String deleteProductUnsucceeded();

   String invalidProduct_expired();
   String invalidProduct_excluded();
   String invalidProduct();

   String registryEntryApplication_registryEntry_validUntil_result();

}
