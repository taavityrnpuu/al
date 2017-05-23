package ee.agri.alkor.web.client.dto;

public class EnterpriseMap extends ABaseDTOMap {

	public static final String NAME = "name";
	public static final String REG_ID = "registrationId";
	public static final String BUS_REG_CODE = "businessRegistrationId";
	public static final String EXCISE_STORE_NR = "exciseStoreHouseNr";
	public static final String ACK_NR = "acknowledgementNr";
	public static final String ACK_DATE = "acknowledgementDate";
	public static final String MTR_CODE = "MTRCode";
	public static final String ADDRESS = "address";
	public static final String REPRESENTATIVE = "enterpriseRepresentative";
    public static final String ENTERPRISE_ROLES = "enterpriseRoles";
	public static final String ROLE = "enterpriseRoleClass";
	public static final String CHANGE_REASON = "changeReason";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String EMAIL = "email";
   public static final String CONTACT_INFO = "contactInfo";
   public static final String BALANCE = "balance";
   public static final String ISACTIVE = "active";

    public static final String ROLE_CODE = ROLE + "." + ClassItemMap.CODE;
    public static final String ROLE_NAME = ROLE + "." + ClassItemMap.NAME;

    /* Enterprise roles */
    public static final String APPLICANT = "applicant";
    public static final String PRODUCER = "producer";
    public static final String IMPORTER = "importer";
    public static final String MARKETER = "marketer";
 	public static final String PACKAGER = "packager";

    public static final String APL = "APL";
    public static final String PRO = "PRO";
    public static final String IMP = "IMP";
    public static final String MAR = "MAR";
 	public static final String PAC = "PAC";

    /**
     * Nested properties
     */
    public static final String ENTERPRISE_ROLES_CODE = ENTERPRISE_ROLES + "." +  ClassItemMap.CODE;
    public static final String REPRESENTATIVE_NAME = REPRESENTATIVE + "." + PersonMap.NAME;
    public static final String REPRESENTATIVE_FIRSTNAME = REPRESENTATIVE + "." + PersonMap.FIRST_NAME;
    public static final String REPRESENTATIVE_LASTNAME = REPRESENTATIVE + "." + PersonMap.LAST_NAME;
    public static final String REPRESENTATIVE_REG_ID = REPRESENTATIVE + "." + PersonMap.REG_ID;
    public static final String REPRESENTATIVE_OCCUPATION = REPRESENTATIVE + "." + PersonMap.OCCUPATION;

    public static final String ADDRESS_COUNTRY = ADDRESS + "." + AddressMap.COUNTRY;
    public static final String ADDRESS_COUNTRY_CODE = ADDRESS_COUNTRY + "." + ClassItemMap.CODE;
    public static final String ADDRESS_COUNTRY_NAME = ADDRESS_COUNTRY + "." + ClassItemMap.NAME;
    public static final String ADDRESS_DISTRICT = ADDRESS + "." + AddressMap.DISTRICT;
    public static final String ADDRESS_ORG_UNIT = ADDRESS + "." + AddressMap.ORG_UNIT;
    public static final String ADDRESS_POSTAL_INDEX = ADDRESS + "." + AddressMap.POSTAL_INDEX;
    public static final String ADDRESS_TOWN = ADDRESS + "." + AddressMap.TOWN;
    public static final String ADDRESS_STREET = ADDRESS + "." + AddressMap.STREET;
    public static final String ADDRESS_HOUSE = ADDRESS + "." + AddressMap.HOUSE;
    public static final String ADDRESS_APPARTMENT_NR = ADDRESS + "." + AddressMap.APPARTMENT_NR;

    public static final String CONTACT_PHONE = CONTACT_INFO + "." + ContactInfoMap.PHONE;
    public static final String CONTACT_MOBILE = CONTACT_INFO + "." + ContactInfoMap.MOBILE;
    public static final String CONTACT_EMAIL = CONTACT_INFO + "." + ContactInfoMap.EMAIL;
    public static final String CONTACT_FAX = CONTACT_INFO + "." + ContactInfoMap.FAX;

    public EnterpriseMap() {
		super();
	}

    public EnterpriseMap(ABaseDTOMap baseMap) {
		super(baseMap);
	}

	/**
	 * Merge old map with current, preserving these old properties
	 * that are not present in the current map.
	 */
    public EnterpriseMap mergeWithOldData(EnterpriseMap oldData) {
		EnterpriseMap result = new EnterpriseMap(this);
		StringList keyList = oldData.getKeyList();
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			if (key.equals(EnterpriseMap.NAME) ||
					key.equals(EnterpriseMap.REG_ID))
					continue;
			Object oldProperty = oldData.getProperty(key);
			Object newProperty = getProperty(key);
			if (newProperty == null && oldProperty != null) {
				result.setProperty(key, oldProperty);
			}
		}
		return result;
	}
}
