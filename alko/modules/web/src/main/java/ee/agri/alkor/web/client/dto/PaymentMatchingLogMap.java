package ee.agri.alkor.web.client.dto;

public class PaymentMatchingLogMap extends ABaseDTOMap {
	
	public static final String AMOUNT = "amount";
	public static final String APPLICATION = "paymentApplication";
	public static final String CREATED = "created";
	public static final String CREATEDBY ="createdBy";
	public static final String ENTERPRISE = "enterpriseBindedTo";
	
	/**
	 * Nested properties
	 */
	
	public static final String APPLICATION_ID = APPLICATION + "." +ClassItemMap.ID; 
	
	public PaymentMatchingLogMap(){
		super();
	}
	
	public int hashCode() {
		return this.toString().hashCode();
	}
	

}
