package ee.agri.alkor.service;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.springframework.context.ApplicationEvent;
import org.springframework.dao.DataAccessException;

import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.util.AppContextHelper;

public class AuthenticationServiceDelegate
	implements IAuthenticationService  {

	private static AppContextHelper appContext;

	public static SystemUser loadUserByNameStat(String arg0) throws UsernameNotFoundException, DataAccessException {
		return  getImpl().loadUserByName(arg0);

	}
	public UserDetails loadUserByRegistrationId(String idCode) {
		return getImpl().loadUserByRegistrationId(idCode);
	}

	public void onApplicationEvent(ApplicationEvent arg0) {
		getImpl().onApplicationEvent(arg0);
	}

	public static Object getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth == null)
			return null;
		return auth.getPrincipal();
	}

	public static String getCurrentUserName() {
      if (getCurrentUser() instanceof String) {
         return ""+getCurrentUser(); // anonymous User?
      } else {
         UserDetails userInfo = (UserDetails) getCurrentUser();
         if (userInfo == null)
            return null;

         return userInfo.getUsername();
      }
	}

	private static IAuthenticationService getImpl() {
		return (IAuthenticationService)getAppContext().
		getBean("userDetailsServiceDao");
	}
	 private static AppContextHelper getAppContext() {
		 if(appContext == null) {
			 appContext = AppContextHelper.getInstance();
		 }
		 return appContext;
	 }
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException, DataAccessException {
		return getImpl().loadUserByUsername(arg0);
	}
	public SystemUser loadUserByName(String arg0) {
		return  getImpl().loadUserByName(arg0);
	}
}
