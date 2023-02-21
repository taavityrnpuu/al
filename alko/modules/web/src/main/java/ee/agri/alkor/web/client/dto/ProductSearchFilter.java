package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Product search form
 * parameters.
 *
 * @author ivar
 *
 */
public class ProductSearchFilter
	extends SearchFilter
	implements IsSerializable {

	public static final String CREATED = ProductMap.CREATED;
	public static final String CODE = ProductMap.CODE;
	public static final String NAME = ProductMap.NAME;
	public static final String TYPE_CODE = ProductMap.TYPE + "." + ClassItemMap.CODE;
	public static final String VOLUME = ProductMap.VOLUME;
	public static final String VOLUME_CODE = VOLUME + "." + ClassItemMap.CODE;
	public static final String GRADE = ProductMap.GRADE;
	public static final String GRADE_S = ProductMap.GRADE_S;
	public static final String APPLICANT_NAME = ProductMap.APPLICANT_NAME; //+ "." + ApplicationMap.APPLICANT_NAME;
	public static final String APPLICATION_NR = ProductMap.APPLICATION + "." + ApplicationMap.NR;
	public static final String IMPORTER_NAME = ProductMap.IMPORTER_NAME;
	public static final String PACKAGER_NAME = ProductMap.PACKAGER_NAME;
	public static final String PRODUCER_NAME = ProductMap.PRODUCER_NAME;
	public static final String PRODUCER_COUNTRY_CODE = ProductMap.PRODUCER_COUNTRY  + "." + ClassItemMap.CODE;
	public static final String DECISION_REG_ENTRY_CODE = ProductMap.APPLICATION + "." + ApplicationMap.DECISION_REG_ENTRY_CODE;//ApplicationMap.DECISION_REG_ENTRY  + "." +ClassItemMap.CODE;
	public static final String REGISTRY_ENTRY_DECISION_TYPE_CODE = ProductMap.REGISTRY_ENTRY_DECISION_TYPE_CODE;
	public static final String REGISTRY_ENTRY_CHANGE_REASON = ProductMap.APPLICATION + "." + ApplicationMap.REGISTRY_ENTRY+ "." + RegistryEntryMap.CHANGE_REASON;
	public static final String REGISTRY_ENTRY_CHANGE_REASON_NOT_LIKE = SearchFilter.NOT_LIKE + ProductMap.APPLICATION + "." + ApplicationMap.REGISTRY_ENTRY+ "." + RegistryEntryMap.CHANGE_REASON;
	public static final String REGISTRY_ENTRY_CHANGE_REASON_NOT_LIKE_COALESCE = SearchFilter.NOT_LIKE + "coalesce(" + ProductMap.APPLICATION + "." + ApplicationMap.REGISTRY_ENTRY+ "." + RegistryEntryMap.CHANGE_REASON + ", '')";
	public static final String DECISION_DATE = ProductMap.DECISION_DATE;
//	public static final String START_TIME ="startTime";
//	public static final String END_TIME ="endTime";
	public static final String ORIGINCOUNTRY_CODE = ProductMap.ORIGINCOUNTRY + "." + ClassItemMap.CODE;
	public static final String REGISTRY_ENTRY_VALID_UNTIL = ProductMap.REGISTRY_ENTRY_VALID_UNTIL;
	public static final String INVALID_PRODUCT = "invalidProduct"; //search for excluded and expired products
	public static final String APPLICATION_STATE_CODE = ProductMap.APPLICATION_STATE_CODE;
	public static final String APPLICATION_STATE_CODE_NOT_LIKE = SearchFilter.NOT_LIKE + APPLICATION_STATE_CODE;

	public ProductSearchFilter() {
		super();
		this.addSortItem(ProductMap.CREATED, SearchFilter.DESCENDING);
		// The name of the class we are querying.
		setObjectClass("Product");
	}

	public ProductSearchFilter(SearchFilter filter) {
		super();
		this.addSortItem(ProductMap.CREATED, SearchFilter.DESCENDING);
		setObjectClass("Product");
	}

	private static final long serialVersionUID = 1L;

}
