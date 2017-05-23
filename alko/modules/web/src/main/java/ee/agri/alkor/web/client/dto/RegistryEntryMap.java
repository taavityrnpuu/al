/**
 *
 */
package ee.agri.alkor.web.client.dto;

/**
 * @author kaupo
 *
 */
public class RegistryEntryMap extends ABaseDTOMap {

   public static final String NR = "nr";
	public static final String VALID_FROM = "validFrom";
	public static final String VALID_UNTIL = "validUntil";
	public static final String CHANGE_REASON = "changeReason";
   public static final String APPLICATION = "application";


   //Nested
   public static final String PRODUCT_ID = APPLICATION + "." + ApplicationMap.PRODUCT_ID;
   public static final String PRODUCT_NAME = APPLICATION + "." + ApplicationMap.PRODUCT_NAME;
   public static final String PRODUCT_TYPE = APPLICATION + "."  + ApplicationMap.PRODUCT_TYPE_NAME;
   public static final String PRODUCT_TYPE_CODE = APPLICATION + "."  + ApplicationMap.PRODUCT_TYPE_CODE;
   public static final String APPLICANT_NAME = APPLICATION + "." + ApplicationMap.APPLICANT_NAME;
   public static final String APPLICANT_BCODE = APPLICATION + "." + ApplicationMap.APPLICANT_BCODE;
   public static final String PRODUCER_NAME = APPLICATION + "." + ApplicationMap.PRODUCT_PRODUCER_NAME;
   //public static final String PRODUCER_COUNTRY = APPLICATION + "." + ApplicationMap.PRODUCT_PRODUCER_COUNTRY;
   public static final String PRODUCER_COUNTRY = APPLICATION + "." + ApplicationMap.PRODUCT_PRODUCER_COUNTRY_NAME;
   public static final String PRODUCER_COUNTRY_CODE = APPLICATION + "." + ApplicationMap.PRODUCT_PRODUCER_COUNTRY_CODE;
   public static final String ORIGIN_COUNTRY = APPLICATION + "."  + ApplicationMap.PRODUCT_ORIGINCOUNTRY_NAME;
   public static final String ORIGIN_COUNTRY_CODE = APPLICATION + "."  + ApplicationMap.PRODUCT_ORIGINCOUNTRY_CODE;
   //public static final String PRODUCT_VOLUME = APPLICATION + "."  + ApplicationMap.PRODUCT_VOLUME;
   public static final String PRODUCT_VOLUME = APPLICATION + "."  + ApplicationMap.PRODUCT_VOLUME_NAME;
   public static final String PRODUCT_GRADE = APPLICATION + "."  + ApplicationMap.PRODUCT_GRADE;
   public static final String PRODUCT_NOTES = APPLICATION + "." + ApplicationMap.PRODUCT + "." + ProductMap.NOTES;
   public static final String REGISTERED_PRODUCT = APPLICATION + "." + ApplicationMap.PRODUCT;
   public static final String NEW_UNTIL = "newUntil";
   
   public static final String APPLICATION_DECISION_DATE = APPLICATION + "." + ApplicationMap.DECISION_DATE;

   private static final long serialVersionUID = 1L;

   public RegistryEntryMap() {
      super();
   }

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		String uus = "RegistryEntryMap[id="+this.getProperty(ABaseDTOMap.ID)+"; productId=" + this.getProperty(RegistryEntryMap.PRODUCT_ID) +"; productName="+ this.getProperty(RegistryEntryMap.PRODUCT_NAME)+"; code=" +this.getProperty(ABaseDTOMap.CODE) +"; version="+ this.getProperty(ABaseDTOMap.VERSION)+";]";
		return uus;
	}
}
