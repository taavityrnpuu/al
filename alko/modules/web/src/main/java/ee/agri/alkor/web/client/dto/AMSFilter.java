/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Alkoholi liikumise otsingu filter.
 * AMSFilter = AlcoMovementSearchFilter
 *
 * @author viktorb
 */
public class AMSFilter extends SearchFilter implements IsSerializable {

   public static final String REG_NR = ReportListViewMap.REG_NR;
   public static final String PRODUCT_NAME = ReportListViewMap.NAME;
   public static final String PRODUCT_TYPE = ReportListViewMap.PRODUCT_CLASS_ID;
   public static final String PRODUCER_COUNTRY = ReportListViewMap.PRODUCER_COUNTRY_CLASS_ID;
   public static final String PRODUCER_NAME = ReportListViewMap.PRODUCER_NAME;
   public static final String PRODUCT_ORIGINCOUNTRY = ReportListViewMap.PRODUCT_ORIG_CLASS_ID;

   public static final String APPLICANT_BCODE = ReportListViewMap.REPORTING_ENT_REG_ID;
   public static final String APPLICANT_NAME = ReportListViewMap.REPORTING_ENT;

   public static final String RECEIVER_NAME = ReportListViewMap.RECEIVER;

   public static final String MPLACE_NAME = ReportListViewMap.MARKETPLACE;
   public static final String MPLACE_DISTRICT = ReportListViewMap.MARKETPLACE_DIST;
   public static final String MPLACE_CITY = ReportListViewMap.MARKETPLACE_CITY;
   public static final String MPLACE_STREET = ReportListViewMap.MARKETPLACE_STREET;

   public static final String PARTI_NR = ReportListViewMap.PARTI_NR;
   public static final String AMOUNT = ReportListViewMap.AMOUNT;
   public static final String REPORT_PERIOD_YEAR = "repYear";
   public static final String REPORT_PERIOD_MONTH = "repMonth";
   
   public static final String PRODUCER_COUNTRY_CODE = ReportListViewMap.PRODUCER_COUNTRY_CLASS_CODE;
   public static final String PRODUCT_ORIGINCOUNTRY_CODE = ReportListViewMap.PRODUCT_ORIG_CLASS_CODE;
   public static final String PRODUCT_TYPE_CODE = ReportListViewMap.PRODUCT_CLASS_CODE;

   public static final String REPORT_ID = ReportListViewMap.REPORT_ID;

   private static final long serialVersionUID = 1L;

   public AMSFilter() {
      super();
      // The name of the class we are querying.
      setObjectClass("ReportListView");
      this.setPageSize(10);
   }

   public AMSFilter(SearchFilter filter) {
      super();
      setObjectClass("ReportListView");
      this.setPageSize(10);
   }

}
