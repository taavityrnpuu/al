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
public class UserManageSearchFilter extends SearchFilter implements IsSerializable {
   
   public static final String FIRST_NAME = UserManageMap.FIRST_NAME;
   public static final String FAMILY_NAME = UserManageMap.FAMILY_NAME;
   public static final String ACTIVE = UserManageMap.ACTIVE;
//   public static final String USER_NAME = UserManageMap.USER_NAME;
   
   private static final long serialVersionUID = 1L;
   
   public UserManageSearchFilter() {
      super();
      // The name of the class we are querying.
      setObjectClass("SystemUser");
   }
   
   public UserManageSearchFilter(SearchFilter filter) {
      super();
      setObjectClass("SystemUser");
   }

}
