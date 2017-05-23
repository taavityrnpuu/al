package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Application search form
 * parameters.
 *
 * @author ivar
 *
 */
public class ApplicationSearchFilter
extends SearchFilter
implements IsSerializable {

   public static final String NR = ApplicationMap.NR;
   public static final String STATE_CODE = ApplicationMap.STATE_CODE;
   public static final String APPLICANT_NAME = ApplicationMap.APPLICANT_NAME;
   public static final String PRODUCER_NAME = ApplicationMap.PRODUCT_PRODUCER_NAME;
   public static final String PRODUCT_NAME = ApplicationMap.PRODUCT_NAME;
   //public static final String START_TIME ="startTime";
   //public static final String END_TIME ="endTime";
   public static final String PRODUCT_TYPE_NAME = ApplicationMap.PRODUCT_TYPE_NAME;
   public static final String PRODUCT_ORIGINCOUNTRY_CODE = ApplicationMap.PRODUCT_ORIGINCOUNTRY_CODE;
   public static final String PRODUCT_PRODUCER_COUNTRY_CODE = ApplicationMap.PRODUCT_PRODUCER_COUNTRY_CODE;
   public static final String PRODUCT_PRODUCER_COUNTRY = ApplicationMap.PRODUCT_PRODUCER_COUNTRY;
   public static final String PRODUCT_TYPE_CODE = ApplicationMap.PRODUCT_TYPE_CODE;
   public static final String DECISION_DATE = ApplicationMap.DECISION_DATE;
   public static final String ARRIVED = ApplicationMap.ARRIVED;
   public static final String TYPE_CODE = ApplicationMap.TYPE_CODE;
   public static final String TYPE_NAME = ApplicationMap.TYPE_NAME;
   public static final String PRODUCT_VOLUME_NAME = ApplicationMap.PRODUCT_VOLUME_NAME;
   public static final String PRODUCT_VOLUME_CODE = ApplicationMap.PRODUCT_VOLUME_CODE;
   public static final String VALID_FROM = ApplicationMap.REGISTRYENTRY_VALID_FROM;
   public static final String VALID_UNTIL = ApplicationMap.REGISTRYENTRY_VALID_UNTIL;
   public static final String EXTEND = ApplicationMap.PRODUCT_APPLICATION_NEEDS_RENEWENING;
   public static final String GRADE = ApplicationMap.PRODUCT_GRADE;
   public static final String GRADE_FROM = ApplicationMap.PRODUCT_GRADE + "From";
   public static final String GRADE_TO = ApplicationMap.PRODUCT_GRADE + "To";
   public static final String IS_XTEE_FORM = "IsXTeeForm";
   public static final String REGISTRYENTRY_NR = ApplicationMap.REGISTRYENTRY_NR;



   public ApplicationSearchFilter() {
      super();
      // The name of the class we are querying.
      this.setObjectClass("RegistryApplication");
      //		this.addSortItem(ApplicationMap.STATE_ORDER_NR, SearchFilter.ASCENDING);
      //		this.addSortItem(ApplicationMap.ARRIVED, SearchFilter.DESCENDING);

      this.setOrderBy(ApplicationMap.STATE_ORDER_NR_VTA + " asc, s." + ApplicationMap.ARRIVED+" desc");
      //this.setOrderBy("created ASC");
      this.setPageSize(40);
   }

   public ApplicationSearchFilter(SearchFilter filter) {
      super();
      setObjectClass("RegistryApplication");
      //		this.addSortItem(ApplicationMap.STATE_ORDER_NR, SearchFilter.ASCENDING);
      //		this.addSortItem(ApplicationMap.ARRIVED, SearchFilter.DESCENDING);

      this.setOrderBy(ApplicationMap.STATE_ORDER_NR_VTA + " asc, s." + ApplicationMap.ARRIVED+" desc");
      this.setPageSize(40);
   }

   private static final long serialVersionUID = 1L;

}