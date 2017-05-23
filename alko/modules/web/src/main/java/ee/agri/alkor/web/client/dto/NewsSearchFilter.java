/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Uudiste otsingu filter.
 *
 * @author viktorb
 */
public class NewsSearchFilter extends SearchFilter implements IsSerializable {

   public static final String DATE = NewsMap.DATE;
   public static final String TITLE = NewsMap.TITLE;

   private static final long serialVersionUID = 1L;

   public NewsSearchFilter() {
      super();
      setObjectClass("News");
      setOrderBy(DATE + " DESC ");
   }

   public NewsSearchFilter(SearchFilter filter) {
      super();
      setObjectClass("News");
      setOrderBy(DATE + " DESC ");
   }

}
