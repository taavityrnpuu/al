package ee.agri.alkor.web.client.dto;

public class StateFeeFilter extends SearchFilter {
	
	public StateFeeFilter(){
		super();
		setObjectClass("RegistryPaymentView");
		this.addSortItem(PAYMENT_DATE, "asc");
	}
	
	private static final long serialVersionUID = 1L;
	
	public static final String TYPE_PAYMENT = "type_payment";
	public static final String TYPE_REGISTRY = "type_registry";
	public static final String TYPE_EXTEND = "type_extend";
	
	public static final String TYPE_PAYMENT_CODE = "payment";
	public static final String TYPE_REGISTRY_CODE = "ARE";
	public static final String TYPE_EXTEND_CODE = "ARP";
	
	public static final String PAYMENT_DATE = StateFeeMap.PAYMENT_DATE;
	public static final String AMOUNT = StateFeeMap.AMOUNT;
	public static final String ENTERPRISE_NAME = StateFeeMap.ENTERPRISE_NAME;
	public static final String ENTERPRISE_REG_NR = StateFeeMap.ENTERPRISE_REG_NR;
	public static final String TYPE = StateFeeMap.TYPE;
	public static final String APPLICATION_NR  = StateFeeMap.APPLICATION_NR;
	public static final String PAYER_NAME  = StateFeeMap.PAYER_NAME;
	public static final String ENTERPRISE_ID  = StateFeeMap.ENTERPRISE_ID;

}
