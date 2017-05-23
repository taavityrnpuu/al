package ee.agri.alkor.web.client.dto;


public class ReportListViewMap extends ABaseDTOMap {

	public static final String REG_NR = "nr";
	public static final String RECEIVER = "receiver";
	public static final String MARKETPLACE = "marketPlace";
	public static final String MARKETPLACE_DIST = "marketDistr";
	public static final String MARKETPLACE_CITY = "marketOrgunit";
	public static final String MARKETPLACE_STREET = "marketAddr";
	public static final String PARTI_NR = "partyNr";
	public static final String AMOUNT = "amount";
	public static final String PRODUCT_ID = "aplProductId";
	public static final String APL_ID = "aplId";
	public static final String ID = "id";
	public static final String CREATED = "created";
	public static final String REPORT_ID = "reportId";
	public static final String REGENTRY_ID = "regentryId";
	public static final String REPORTING_ENT = "reportingEnt";
	public static final String REPORTING_ENT_REG_ID = "reportingEntRegId";
	public static final String NAME = "name";
	public static final String PRODUCT_CLASS_ID = "productClassId";
	public static final String PRODUCT_ORIG_CLASS_ID = "productOrigCountryClassId";
	public static final String PRODUCER_COUNTRY_CLASS_ID = "producerCountryClassId";
	public static final String PRODUCER_NAME = "producerName";
	public static final String REPORT_DATE = "reportDate";
	
	public static final String PRODUCT_CLASS_CODE = PRODUCT_CLASS_ID+"."+ClassItemMap.CODE;
	public static final String PRODUCER_COUNTRY_CLASS_CODE = PRODUCER_COUNTRY_CLASS_ID + "." + ClassItemMap.CODE;	
	public static final String PRODUCT_ORIG_CLASS_CODE = PRODUCT_ORIG_CLASS_ID + "." + ClassItemMap.CODE;

	public ReportListViewMap() {
		super();
	}

}
