package ee.agri.alkor.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.context.ApplicationListener;

import ee.agri.alkor.model.SystemUser;

public interface IAuthenticationService 
	extends UserDetailsService, ApplicationListener {

	/**
	 * Method needed for ID card authentication.
	 * 
	 * @param idCode
	 * @return UserDetails
	 */
	UserDetails loadUserByRegistrationId(String idCode) ;

	SystemUser loadUserByName(String arg0);
}
