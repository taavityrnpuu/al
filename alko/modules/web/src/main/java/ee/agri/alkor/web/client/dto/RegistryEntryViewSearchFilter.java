/**
 * 
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Kaupo Parmas
 *
 */
public class RegistryEntryViewSearchFilter extends SearchFilter implements
		IsSerializable {
	
	private static final long serialVersionUID = 1L;
	
public static final String PRODUCT_NAME = RegistryEntryViewMap.PRODUCT_NAME;
	
	public static final String PRODUCT_COUNTRY = RegistryEntryViewMap.PRODUCT_COUNTRY;
	
	public static final String PRODUCT_COUNTRY_CODE = RegistryEntryViewMap.PRODUCT_COUNTRY + "." + ClassItemMap.CODE;
	
	public static final String PRODUCT_COUNTRY_NAME = RegistryEntryViewMap.PRODUCT_COUNTRY_NAME;
	
	public static final String PRODUCT_TYPE = RegistryEntryViewMap.PRODUCT_TYPE;
	
	public static final String PRODUCT_TYPE_CODE = RegistryEntryViewMap.PRODUCT_TYPE_CODE;
	
	public static final String PRODUCT_TYPE_NAME = RegistryEntryViewMap.PRODUCT_TYPE_NAME;
	
	public static final String PRODUCT_NOTES = RegistryEntryViewMap.PRODUCT_NOTES;
	
	public static final String PRODUCT_CAPACITY = RegistryEntryViewMap.PRODUCT_CAPACITY;
	
	public static final String PRODUCT_ETHANOL_RATE = RegistryEntryViewMap.PRODUCT_ETHANOL_RATE;
	
	public static final String PRODUCER_NAME = RegistryEntryViewMap.PRODUCER_NAME;
	
	public static final String PRODUCER_COUNTRY = RegistryEntryViewMap.PRODUCER_COUNTRY;
	
	public static final String PRODUCER_COUNTRY_CODE = RegistryEntryViewMap.PRODUCER_COUNTRY_CODE;
	
	public static final String PRODUCER_COUNTRY_NAME = RegistryEntryViewMap.PRODUCER_COUNTRY_NAME;
	
	public static final String ENTRY_VALID_FROM = RegistryEntryViewMap.ENTRY_VALID_FROM;
	
	public static final String ENTRY_VALID_UNTIL = RegistryEntryViewMap.ENTRY_VALID_UNTIL;
	
	public static final String ENTRY_NR = RegistryEntryViewMap.ENTRY_NR;
	
	public static final String APPLICANT_NAME = RegistryEntryViewMap.APPLICANT_NAME;
	
	public static final String DECISION_DATE = RegistryEntryViewMap.DECISION_DATE;
	
	public RegistryEntryViewSearchFilter() {
		super();
		this.setObjectClass("RegistryEntryView");
		this.setPageSize(40);
		this.addSortItem(RegistryEntryViewMap.ENTRY_VALID_FROM, SearchFilter.DESCENDING);
	}
	
	public RegistryEntryViewSearchFilter(SearchFilter filter) {
		super();
		this.setObjectClass("RegistryEntryView");
	}

}
