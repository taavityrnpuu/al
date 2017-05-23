/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Esitatud aruannete otsingu filter.
 * SRSFilter = SubmittedReportsSearchFilter.
 *
 * @author viktorb
 */
public class SRSFilter extends SearchFilter implements IsSerializable {

   public static final String PERIOD_YEAR = "repYear";
   public static final String PERIOD_MONTH = "repMonth";
   public static final String REPORTER_NAME = ReportViewMap.NAME;
   public static final String REPORTER_BCODE = ReportViewMap.ENT_ID;
   public static final String REPORTER_REG_ID = ReportViewMap.REG_ID;

   private static final long serialVersionUID = 1L;

   public SRSFilter() {
      super();
      // The name of the class we are querying.
      setObjectClass("ReportView");
      this.setPageSize(10);
   }

   public SRSFilter(SearchFilter filter) {
      super();
      setObjectClass("ReportView");
      this.setPageSize(10);
   }

}
