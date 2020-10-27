package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

public class RegistryPaymentSearchFilter extends SearchFilter implements IsSerializable {

	public static final String AMOUNT = RegistryPaymentMap.AMOUNT;
	public static final String CODE = RegistryPaymentMap.CODE;
	public static final String ENTERPRISE = RegistryPaymentMap.ENTERPRISE;
	public static final String HAS_ENTERPRISE = RegistryPaymentMap.HAS_ENTERPRISE;
	public static final String ID = RegistryPaymentMap.ID;
	public static final String PAYER_ACCOUNT_NR = RegistryPaymentMap.PAYER_ACCOUNT_NR;
	public static final String PAYER_NAME = RegistryPaymentMap.PAYER_NAME;
	public static final String PAYER_REGISTRATION_NR = RegistryPaymentMap.PAYER_REGISTRATION_NR;
	public static final String PAYMENT_DATE = RegistryPaymentMap.PAYMENT_DATE;
	public static final String REFERENCE_NR = RegistryPaymentMap.REFERENCE_NR;
	public static final String VERSION = RegistryPaymentMap.VERSION;
	public static final String AMOUNT_FROM = "amountFrom";
	public static final String ENTERPRISE_NAME = RegistryPaymentMap.ENTERPRISE_NAME;
	public static final String DESCRIPTION = RegistryPaymentMap.PAYMENT_DESCRIPTION;

	public RegistryPaymentSearchFilter() {
		super();
		// The name of the class we are querying.
		setObjectClass("RegistryPayment");
		this.addSortItem(HAS_ENTERPRISE, ASCENDING);
		this.addSortItem(PAYMENT_DATE, DESCENDING);
	}

	public RegistryPaymentSearchFilter(SearchFilter filter) {
		super();
		setObjectClass("RegistryPayment");
	}

	private static final long serialVersionUID = 1L;

}
