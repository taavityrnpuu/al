package ee.agri.alkor.service;

import java.util.List;

import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.classes.SystemGroup;
/**
 * User management business interface.
 * 
 * @author ivar
 *
 */
public interface IUserManagerService extends IBaseService{
	
	/*
	 * Ettevotte portaalist taotluse esitamisel kasutatav kasutajanimi.
	 */
	String EIT_USER = "EIT";
	/**
	 * 
	 * @param user
	 * @return SystemUser saved user data
	 * @throws ConstraintViolationException in case userName already exists
	 */
	SystemUser saveUser(SystemUser user) throws ConstraintViolationException;
	SystemUser saveUser2(SystemUser user) throws ConstraintViolationException;
	/**
	 * 
	 * @param userName
	 * @return SystemUser
	 */
	SystemUser findUser(String userName) ;
	/**
	 * 
	 * @param registrationId
	 * @return SystemUser
	 */
	SystemUser findUserByPerson(String registrationId) ;
	
	
	/**
	 * 
	 * @param userName
	 * @return SystemUser
	 */
	SystemUser findUserWithGroups(String userName) ;
	/**
	 * 
	 * @param userName
	 */
	void deleteUser(Long userId) ;
	/**
	 * 
	 * @return List<SystemGroup>
	 */
	List<SystemGroup> findSystemGroups() ;
	
	/**
	 * 
	 * @param groupCode String SystemGroup classificator code
	 * @return List<SystemUser> 
	 */
	List<SystemUser> findUsersInGroup(String groupCode) ;
   
   /**
    * @return all found systemusers
    */
   List<SystemUser> findUsers() ;
	
}
