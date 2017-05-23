package ee.agri.alkor.web.server;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.service.ConstraintViolationException;
import ee.agri.alkor.web.service.SystemException;
import ee.agri.alkor.web.service.UserManagerService;

public class UserManagerServiceImpl implements UserManagerService {

   public UserManagerServiceImpl() {
      super();
   }

   public SearchFilter search(SearchFilter filter) {
      return ClientDataFactory.create(ServiceFactory.getUserManagerService().search(ClientDataFactory.create(filter)));
   }

   private static final long serialVersionUID = 1L;

   public void deleteUser(Long userId) {
      ServiceFactory.getUserManagerService().deleteUser(userId);
   }
   
   public UserManageMap saveUser(UserManageMap user) throws ConstraintViolationException {
      try{
    	  return ClientDataFactory.create(
      ServiceFactory.getUserManagerService().saveUser(ClientDataFactory.create(user)));
   } catch(Exception cve) {
      cve.printStackTrace();
      throw new SystemException(cve.getMessage());
   }
   }
   
   public UserManageMap saveUser2(UserManageMap user) throws ConstraintViolationException {
	      try{
	    	  return ClientDataFactory.create(
	      ServiceFactory.getUserManagerService().saveUser2(ClientDataFactory.create(user)));
	   } catch(Exception cve) {
	      cve.printStackTrace();
	      throw new SystemException(cve.getMessage());
	   }
	   }
   
   public UserManageMap findUserWithGroups(String userName) {
      return ClientDataFactory.create(ServiceFactory.getUserManagerService().findUserWithGroups(userName));
   }
   
   public List findSystemGroups() {
      return ClientDataFactory.create(ServiceFactory.getUserManagerService().findSystemGroups(),null);
   }

   public List findUsersInGroup(String groupCode)  {
	   List users = ServiceFactory.getUserManagerService().findUsersInGroup(groupCode);
	   List mapList = new ArrayList();
	   for(Iterator it = users.iterator();it.hasNext();) {
		   mapList.add(ClientDataFactory.create((SystemUser)it.next()));
	   }
	   return mapList;
   }
   
   public List findUsers(){
      List users = ServiceFactory.getUserManagerService().findUsers();
      List mapList = new ArrayList();
      for(Iterator it = users.iterator();it.hasNext();) {
         mapList.add(ClientDataFactory.create((SystemUser)it.next()));
      }
      return mapList;
   }
   
   
}
