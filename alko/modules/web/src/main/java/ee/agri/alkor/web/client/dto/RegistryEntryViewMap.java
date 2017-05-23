/**
 * 
 */
package ee.agri.alkor.web.client.dto;

/**
 * @author Kaupo Parmas
 *
 */
public class RegistryEntryViewMap extends ABaseDTOMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String PRODUCT_NAME = "productName";
	
	public static final String PRODUCT_COUNTRY = "productCountry";
	
	public static final String PRODUCT_COUNTRY_CODE = "productCountry" + "." +ClassItemMap.CODE;
	
	public static final String PRODUCT_COUNTRY_NAME = "productCountry" +"." + ClassItemMap.NAME;
	
	public static final String PRODUCT_TYPE = "productType";
	
	public static final String PRODUCT_TYPE_CODE = "productType" +"." + ClassItemMap.CODE;
	
	public static final String PRODUCT_TYPE_NAME = "productType" +"." + ClassItemMap.NAME;
	
	public static final String PRODUCT_NOTES = "productNotes";
	
	public static final String PRODUCT_CAPACITY = "capacity";
	
	public static final String PRODUCT_ETHANOL_RATE = "ethanolRate";
	
	public static final String PRODUCER_NAME = "producerName";
	
	public static final String PRODUCER_COUNTRY = "country";
	
	public static final String PRODUCER_COUNTRY_CODE = "country" + "." + ClassItemMap.CODE;
	
	public static final String PRODUCER_COUNTRY_NAME = "country" + "." + ClassItemMap.NAME;
	
	public static final String ENTRY_VALID_FROM = "validFrom";
	
	public static final String ENTRY_VALID_UNTIL = "validUntil";
	
	public static final String ENTRY_NR = "nr";
	
	public static final String APPLICANT_NAME = "applicantName";
	
	public static final String DECISION_DATE = "decisionDate";
	
	public static final String PUBLIC_DOC_COUNT = "publicDocCount";
	
	
	
}
