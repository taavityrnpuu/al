package ee.agri.alkor.web.client.dto;
/**
 * Product DTO.
 *
 * @author ivar
 *
 */
public class ProductMap
	extends ABaseDTOMap {

	public static final String CODE = "code";

	public static final String NAME = "name";

	public static final String TYPE = "type";

	public static final String PRODUCER = "producer";

	public static final String IMPORTER = "importer";

	public static final String MARKETER = "marketer";

	public static final String PACKAGER = "packager";
	public static final String CHANGE_REASON = "changeReason";
	/**
	 * Application associated with this product
	 */
	public static final String APPLICATION = "registryEntryApplication";

	public static final String ORIGINCOUNTRY = "originCountry";

	public static final String VOLUME = "packingVolume";

	public static final String VOLUME_UNIT = "packingVolume_unit";

	public static final String GRADE = "ethanolRate";

	public static final String GRADE_S = "ethanolRate_search";

	public static final String GRADE_A = "ethanolRate_add";

	public static final String PACKINGMATERIAL = "packingMaterial";

	public static final String NUMBEROFLABELS = "numberOfLabels";

	public static final String BOTTLESHAPE = "bottleShape";

	public static final String BOTTLECOLOR = "bottleColor";

	public static final String CORKMATERIAL = "corkMaterial";

	public static final String CORKCOLOR = "corkColor";

	public static final String CORKSHAPE = "corkShape";

	public static final String HASSTOCKING = "hasStocking";

	public static final String STOCKINGCOLOR = "stockingColor";

	public static final String HASFRONTLABEL = "hasFrontLabel";

	public static final String HASREARLABEL = "hasRearLabel";

	public static final String HASNECKLABEL = "hasNeckLabel";

	public static final String HASOTHERLABEL = "hasOtherLabel";

	public static final String DATAMODIFICATIONREASON = "dataModificationReason";

	public static final String EXAMPLES = "examples";

	public static final String NOTESADD = "notesadd";
	
	public static final String NOTES = "notes";
	
	//public static final String PAYMENT_LOGS = "paymentLogs"; // database boosting
	

	public static final String REGISTRY_ENTRY = APPLICATION + ".registryEntry";

	public static final String DECISION = APPLICATION + "." + ApplicationMap.DECISION;
	
	public static final String APPLICATION_APPLICANT = APPLICATION + "." + ApplicationMap.APPLICANT;
	
	/**
	 * Nested properties
	 */
	//type.code
	public static final String APPLICATION_ID = APPLICATION + "." + ApplicationMap.ID;
	public static final String APPLICATION_STATE_CODE = APPLICATION + "." + ApplicationMap.STATE_CODE;
	public static final String TYPE_CODE = TYPE + "." +ClassItemMap.CODE;
	public static final String TYPE_NAME = TYPE + "." +ClassItemMap.NAME;
	public static final String VOLUME_NAME = VOLUME + "." + ClassItemMap.NAME;
   public static final String ORIGINCOUNTRY_NAME = ORIGINCOUNTRY+ "." +ClassItemMap.NAME;
	public static final String ORIGINCOUNTRY_CODE = ORIGINCOUNTRY+ "." +ClassItemMap.CODE;
	public static final String APPLICANT_NAME = APPLICATION + "." + ApplicationMap.APPLICANT_NAME;
	public static final String PRODUCER_NAME = PRODUCER + "." + EnterpriseMap.NAME;
	public static final String IMPORTER_NAME = IMPORTER + "." + EnterpriseMap.NAME;
	public static final String MARKETER_NAME = MARKETER + "." + EnterpriseMap.NAME;
	public static final String PACKAGER_NAME = PACKAGER+ "." + EnterpriseMap.NAME;
	public static final String PRODUCER_COUNTRY = PRODUCER + "." + EnterpriseMap.ADDRESS + "." +AddressMap.COUNTRY;
	public static final String PRODUCER_COUNTRY_CODE = PRODUCER + "." + EnterpriseMap.ADDRESS + "." +AddressMap.COUNTRY+"."+ClassItemMap.CODE;
	public static final String PRODUCER_COUNTRY_NAME = PRODUCER_COUNTRY + "." +ClassItemMap.NAME;
	public static final String PACKINGMATERIAL_CODE = PACKINGMATERIAL+ "." +ClassItemMap.CODE;
	public static final String BOTTLESHAPE_CODE = BOTTLESHAPE + "." +ClassItemMap.CODE;
	public static final String BOTTLECOLOR_CODE = BOTTLECOLOR + "." +ClassItemMap.CODE;
	public static final String CORKMATERIAL_CODE = CORKMATERIAL + "." +ClassItemMap.CODE;
	public static final String CORKCOLOR_CODE = CORKCOLOR + "." +ClassItemMap.CODE;
	public static final String VOLUME_CODE = VOLUME + "." + ClassItemMap.CODE;
	public static final String CORKSHAPE_CODE = CORKSHAPE + "." +ClassItemMap.CODE;
	public static final String STOCKINGCOLOR_CODE = STOCKINGCOLOR + "." +ClassItemMap.CODE;
	public static final String REGISTRY_ENTRY_DECISION_TYPE = REGISTRY_ENTRY + "." + DecisionMap.ENTRY_DECISION_TYPE;
	public static final String REGISTRY_ENTRY_DECISION_TYPE_CODE = REGISTRY_ENTRY_DECISION_TYPE + "." +ClassItemMap.CODE;
	public static final String REGISTRY_ENTRY_VALID_FROM = REGISTRY_ENTRY + "." + RegistryEntryMap.VALID_FROM;
	public static final String REGISTRY_ENTRY_VALID_UNTIL = REGISTRY_ENTRY + "." + RegistryEntryMap.VALID_UNTIL;
	public static final String REGISTRY_ENTRY_CHANGE_REASON = REGISTRY_ENTRY + "." + RegistryEntryMap.CHANGE_REASON;
	public static final String REGISTRY_ENTRY_NEW_UNTIL = REGISTRY_ENTRY + "." + RegistryEntryMap.NEW_UNTIL;
	public static final String REGISTRY_ENTRY_EXTENDED_UNTIL = REGISTRY_ENTRY + "." + "extendedUntil";
	public static final String REGISTRY_ENTRY_NR = REGISTRY_ENTRY + "." + RegistryEntryMap.NR;
	public static final String DECISION_DATE = DECISION + "." + DecisionMap.DATE;

	public ProductMap() {
		super();
		/*this.put(TYPE, new ClassItemMap());
		this.put(PRODUCER, new EnterpriseMap());
		this.put(IMPORTER, new EnterpriseMap());
		this.put(MARKETER, new EnterpriseMap());
		this.put(ORIGINCOUNTRY, new ClassItemMap());
		this.put(ORIGINCOUNTRY, new ClassItemMap());
		this.put(PACKINGMATERIAL, new ClassItemMap());
		this.put(BOTTLESHAPE, new ClassItemMap());
		this.put(BOTTLECOLOR, new ClassItemMap());
		this.put(CORKMATERIAL, new ClassItemMap());
		this.put(CORKCOLOR, new ClassItemMap());
		this.put(CORKSHAPE, new ClassItemMap());
		this.put(HASREARLABEL, new ClassItemMap());	*/
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		String uus = "ProductMap[id="+this.getProperty(ABaseDTOMap.ID)+"; name=" + this.getProperty(ProductMap.NAME) +"; validFrom="+this.getProperty(ProductMap.REGISTRY_ENTRY_VALID_FROM)+"; code=" +this.getProperty(ABaseDTOMap.CODE) +"; version="+ this.getProperty(ABaseDTOMap.VERSION)+";]";
		return uus;
	}
}
