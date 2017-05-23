package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserManageMap;

/**
 *
 * @author ivar
 *
 */
public interface UserManagerServiceAsync {

	void search(SearchFilter filter, AsyncCallback callback) ;
   
   void deleteUser(Long userId, AsyncCallback callback);
   
   void saveUser(UserManageMap user, AsyncCallback callback);
   void saveUser2(UserManageMap user, AsyncCallback callback);
   
   void findUserWithGroups(String userName, AsyncCallback callback);
   
   void findSystemGroups(AsyncCallback callback);
   
   void findUsersInGroup(String groupCode, AsyncCallback callback);
   
   void findUsers(AsyncCallback callback);

}
