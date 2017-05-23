/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Registrisse kantud alkoholi otsingu filter.
 *
 * @author viktorb
 */
public class RegSearchFilter extends SearchFilter implements IsSerializable {

   public static final String REGISTRY_ENTRY_NR = RegistryEntryMap.NR;
   public static final String PRODUCT_NAME = RegistryEntryMap.PRODUCT_NAME;
   public static final String PRODUCT_TYPE = RegistryEntryMap.PRODUCT_TYPE_CODE;
   public static final String APPLICANT_NAME = RegistryEntryMap.APPLICANT_NAME;
   public static final String PRODUCER_NAME = RegistryEntryMap.PRODUCER_NAME;
   public static final String PRODUCER_COUNTRY = RegistryEntryMap.PRODUCER_COUNTRY_CODE;
   public static final String ORIGIN_COUNTRY = RegistryEntryMap.ORIGIN_COUNTRY_CODE;
   public static final String REGISTRY_ENTRY_VALID_UNTIL = RegistryEntryMap.VALID_UNTIL;
   public static final String DECISION_DATE = RegistryEntryMap.APPLICATION_DECISION_DATE;

   private static final long serialVersionUID = 1L;

   public RegSearchFilter() {
      super();
      //The name of the class we are querying.
      this.setObjectClass("RegistryEntry");
      this.setPageSize(40);
      this.addSortItem(RegistryEntryMap.VALID_FROM, this.DESCENDING);
   }

   public RegSearchFilter(SearchFilter filter) {
      super();
      this.setObjectClass("RegistryEntry");
      this.setPageSize(40);
   }

}
