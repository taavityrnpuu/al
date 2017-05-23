/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Kasutajate halduse otsingu filter
 *
 * @author martin
 */
public class LogSearchFilter extends SearchFilter implements IsSerializable {

   public static final String USER_NAME = AuthLogMap.USER_FULL_NAME;

   public static final String USER_AUTH_TIME = AuthLogMap.AUTH_TIME;
   private static final long serialVersionUID = 1L;

   public LogSearchFilter() {
      super();
      // The name of the class we are querying.
      setObjectClass("AuthenticationLog");
   }

   public LogSearchFilter(SearchFilter filter) {
      super();
      setObjectClass("AuthenticationLog");
   }

}
