package ee.agri.alkor.web.service;

import java.util.List;

import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserManageMap;


public interface UserManagerService extends BaseService {

	SearchFilter search(SearchFilter filter) ;
	
   void deleteUser(Long userId);
   
   UserManageMap saveUser(UserManageMap user) throws ConstraintViolationException;
   
   UserManageMap saveUser2(UserManageMap user) throws ConstraintViolationException;
   
   UserManageMap findUserWithGroups(String userName);
      
   List findSystemGroups();
   
   List findUsersInGroup(String groupCode);
   
   List findUsers();
   
}
