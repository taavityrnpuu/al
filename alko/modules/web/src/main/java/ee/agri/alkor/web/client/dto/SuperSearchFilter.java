package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SuperSearchFilter extends SearchFilter implements IsSerializable {
	
	public static final String PRODUCT_ID = "productId";
	public static final String PRODUCT_NAME = "productName";
	public static final String PRODUCT_TYPE = "productType";
	//public static final String PRODUCT_TYPE_NAME = "productType" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_TYPE_NAME = "productType" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_KN_CODE = "productKnCode";
	public static final String PRODUCT_ETHANOL_RATE = "productEthanolRate";
	public static final String PRODUCT_VOLUME = "productVolume";
	public static final String PRODUCT_VOLUME_CODE = PRODUCT_VOLUME + "." + ClassItemMap.CODE;
	//public static final String PRODUCT_VOLUME_NAME = PRODUCT_VOLUME + "." + ClassItemMap.NAME;
	public static final String PRODUCT_VOLUME_NAME = PRODUCT_VOLUME + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_ORIGIN_COUNTRY = "productOriginCountry";
	//public static final String PRODUCT_ORIGIN_COUNTRY_NAME = "productOriginCountry" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_ORIGIN_COUNTRY_NAME = "productOriginCountry" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_HAS_STOCKING = "productHasStocking";
	public static final String PRODUCT_PACKING_MATERIAL = "productPackingMaterial";
	//public static final String PRODUCT_PACKING_MATERIAL_NAME = "productPackingMaterial" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_PACKING_MATERIAL_NAME = "productPackingMaterial" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_BOTTLE_SHAPE = "productBottleShape";
	//public static final String PRODUCT_BOTTLE_SHAPE_NAME = "productBottleShape" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_BOTTLE_SHAPE_NAME = "productBottleShape" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_NUMBER_OF_LABELS = "productNumberOfLabels";
	public static final String PRODUCT_EXAMPLES_COUNT = "productExamplesCount";
	/*
	public static final String PRODUCT_BOTTLE_COLOR_NAME = "productBottleColor" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_CORK_MATERIAL_NAME = "productCorkMaterial" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_CORK_COLOR_NAME = "productCorkColor" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_CORK_SHAPE_NAME = "productCorkShape" + "." + ClassItemMap.NAME;
	public static final String PRODUCT_STOCKING_COLOR_NAME = "productStockingColor" + "." + ClassItemMap.NAME;*/
	public static final String PRODUCT_BOTTLE_COLOR_NAME = "productBottleColor" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_CORK_MATERIAL_NAME = "productCorkMaterial" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_CORK_COLOR_NAME = "productCorkColor" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_CORK_SHAPE_NAME = "productCorkShape" + ClassItemMap.CAPITAL_NAME;
	public static final String PRODUCT_STOCKING_COLOR_NAME = "productStockingColor" + ClassItemMap.CAPITAL_NAME;
	
	public static final String PRODUCT_HAS_FRONT_LABEL = "productHasFrontLabel";
	public static final String PRODUCT_HAS_REAR_LABEL = "productHasRearLabel";
	public static final String PRODUCT_HAS_NECK_LABEL = "productHasNeckLabel";
	public static final String PRODUCT_HAS_OTHER_LABEL = "productHasOtherLabel";
	public static final String PRODUCT_NOTES = "productNotes";
	public static final String PRODUCER_ID = "producerId";
	public static final String PRODUCER_NAME = "producerName";
	public static final String PRODUCER_COUNTRY = "producerCountry";
	//public static final String PRODUCER_COUNTRY_NAME = "producerCountry" + "."+ ClassItemMap.NAME;;
	public static final String PRODUCER_COUNTRY_NAME = "producerCountry" + ClassItemMap.CAPITAL_NAME;
	public static final String APPLICATION_ID = "applicationId";
	public static final String APPLICATION_NR = "applicationNr";
	public static final String APPLICATION_ARRIVED = "applicationArrived";
	public static final String APPLICATION_STATE = "applicationState";
	//public static final String APPLICATION_STATE_NAME = "applicationState" + "."+ ClassItemMap.NAME;
	public static final String APPLICATION_STATE_NAME = "applicationState" + ClassItemMap.CAPITAL_NAME;
	public static final String APPLICATION_DECISION_TYPE = "applicationDecisionType";
	public static final String APPLICATION_DECISION_TYPE_NAME = "applicationDecisionType" + ClassItemMap.CAPITAL_NAME;
	public static final String APPLICATION_DECISION_DATE = "applicationDecisionDate";
	public static final String REGISTRY_ENTRY_NR = "registryEntryNr";
	public static final String REGISTRY_ENTRY_VALID_FROM = "registryEntryValidFrom";
	public static final String REGISTRY_ENTRY_VALID_UNTIL = "registryEntryValidUntil";
	public static final String APPLICANT_ID = "applicantId";
	public static final String APPLICANT_NAME = "applicantName";
	public static final String APPLICANT_REG_NR = "applicantRegNr";
	public static final String APPLICANT_MTR_CODE = "applicantMtrCode";
	public static final String APPLICANT_EXCISE_STORE_HOUSE_NR = "applicantExciseStoreHouseNr";
	public static final String APPLICANT_ACKNOWLEDGEMENT_NR = "applicantAcknowledgementNr";
	public static final String APPLICANT_ACKNOWLEDGEMENT_DATE = "applicantAcknowledgementDate";
	public static final String MARKETER_ID = "marketerId";
	public static final String MARKETER_NAME = "marketerName";
	public static final String IMPORTER_ID = "importerId";
	public static final String IMPORTER_NAME = "importerName";
	public static final String PACKAGER_NAME = "packagerName";
	public static final String DEREGISTER_DECISION = "deregisterDecision";
	public static final String PROCESSOR = "processor";
	public static final String PROCESSOR_ID = "processorId";
	public static final String PROCESSOR_FORNAME = "processorForName";
	public static final String PROCESSOR_LASTNAME = "processorLastName";
	
	public SuperSearchFilter() {
		super();
		setObjectClass("SearchViewPrimitive");
	}

}