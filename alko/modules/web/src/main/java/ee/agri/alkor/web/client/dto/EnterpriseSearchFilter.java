package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * EnterpriseList search form
 * parameters.
 *
 * @author ivar
 *
 */
public class EnterpriseSearchFilter
	extends SearchFilter
	implements IsSerializable {

	public static final String NAME = EnterpriseMap.NAME;
	public static final String REG_NR = EnterpriseMap.REG_ID;
	public static final String ENTERPRISE_ROLE = EnterpriseMap.ENTERPRISE_ROLES +
	".enterpriseRoleClass." + ClassItemMap.CODE;

	public static final String ADDRESS = EnterpriseMap.ADDRESS;
	public static final String ISACTIVE = EnterpriseMap.ISACTIVE;

	public EnterpriseSearchFilter() {
		super();
		// The name of the class we are querying.
		setObjectClass("Enterprise");
		setOrderBy("name asc");
	}


	private static final long serialVersionUID = 1L;

}