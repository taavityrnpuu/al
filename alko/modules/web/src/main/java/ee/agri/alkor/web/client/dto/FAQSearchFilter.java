/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * Korduma kipuvate küsimuste otsingu filter.
 *
 * @author viktorb
 */
public class FAQSearchFilter extends SearchFilter implements IsSerializable {

   public static final String CREATED = "created";
   public static final String QUESTION = FAQMap.QUESTION;
   public static final String ANSWER = FAQMap.ANSWER;

   public FAQSearchFilter() {
      super();
      setObjectClass("Faq");
   }

   public FAQSearchFilter(SearchFilter filter) {
      super();
      setObjectClass("Faq");
   }

}
