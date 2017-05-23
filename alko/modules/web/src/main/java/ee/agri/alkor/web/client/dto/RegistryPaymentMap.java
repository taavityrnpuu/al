package ee.agri.alkor.web.client.dto;


public class RegistryPaymentMap extends ABaseDTOMap {

   public static final String PAYER_NAME = "payerName";
   public static final String PAYER_ACCOUNT_NR = "payingAccNo";
   public static final String PAYER_REGISTRATION_NR = "payerRegistrationNr";
   public static final String REFERENCE_NR = "referenceNr";
   public static final String PAYMENT_DATE = "paymentDate";
   public static final String PAYMENT_DESCRIPTION = "paymentDesc"; // hiljem lisatud
   public static final String AMOUNT = "amount";
   public static final String ENTERPRISE = "boundEnterprise";
   public static final String ENTERPRISE_NAME = "boundEnterprise"+"."+ClassItemMap.NAME;
   public static final String ENTERPRISE_ID = "boundEnterprise"+"."+ClassItemMap.ID;
   public static final String HAS_ENTERPRISE = "has_enterprise";

   public RegistryPaymentMap() {
      super();
   }

}