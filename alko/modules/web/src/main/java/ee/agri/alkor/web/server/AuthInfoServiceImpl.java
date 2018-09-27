package ee.agri.alkor.web.server;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import ee.agri.alkor.impl.ResultSet;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.apache.log4j.Logger;
import org.gwtwidgets.server.spring.GWTSpringController;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.service.AuthenticationServiceDelegate;
import ee.agri.alkor.web.client.dto.PersonMap;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.service.AuthInfoService;
import ee.agri.alkor.impl.PostgreUtils;

public class AuthInfoServiceImpl implements AuthInfoService {

	private static Logger LOGGER = Logger.getLogger(AuthInfoServiceImpl.class);

	public UserInfo getUserInfo() {
		Object curUser = AuthenticationServiceDelegate.getCurrentUser();
		
		try{
			if (curUser == null){
				LOGGER.debug("curUser is NULL");
				//throw new Exception("curUser is NULL");
			}
			else if (curUser instanceof String) {
				return new UserInfo((String) curUser, null);
			}
			else if(curUser instanceof AlkoUserDetails){
				AlkoUserDetails userDetails = (AlkoUserDetails) curUser;
				UserInfo user = new UserInfo();

				String firstName = "tundmatu";
				String lastName = "kasutaja";
				
				String regCode = userDetails.getRegCode();
				String idCode = userDetails.getIdCode();

				if (regCode != null && !regCode.equals("")) { // ettevõtja
					try {
						ResultSet rs = PostgreUtils.query("SELECT * FROM enterprise WHERE reg_id = '" + regCode.replaceAll("'", "") + "'");
						while (rs.next()) {
							firstName = rs.getString("name");
						}
					} catch (Exception x) {
						x.printStackTrace();
					}
					lastName = regCode + " (" + idCode + ")";
				} else {
					try {
						ResultSet rs = PostgreUtils.query(""
								+ "SELECT * "
								+ "FROM person p "
								+ "JOIN sys_user u ON u.person_id = p.id "
								+ "WHERE p.reg_id IN ('" + idCode.replaceAll("'", "") + "', 'EE" + idCode.replaceAll("'", "") + "')");
						while (rs.next()) {
							firstName = rs.getString("first_name");
							lastName = rs.getString("last_name");
						}
					} catch (Exception x) {
						x.printStackTrace();
					}
				}

				user.setName((userDetails.getUsername() != null && !userDetails.getUsername().equals("") ? userDetails.getUsername() : "anonymousUser"));
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setRegCode(regCode);
				
				try{
					user.setUserManageMap(ClientDataFactory.create(userDetails.getSystemUser()));
				}catch(Exception x){
					x.printStackTrace();
				}
				
				Set roles = new HashSet();
				try{
					Collection<GrantedAuthority> authRoles = userDetails.getAuthorities();
					if(authRoles != null){
						for(GrantedAuthority auth : authRoles) {
							roles.add(auth.getAuthority());
						}
					}
				}catch(Exception x){
					x.printStackTrace();
				}
				user.setRoles(roles);

				// PersonMap p =(PersonMap) user.getUserManageMap().get("person");
				//
				// System.out.println("UM: " + p.get("registrationId"));
				// System.out.println("SEE ON IK! " + userDetails.getFirstName() + "
				// " + userDetails.getLastName());
				return user;
			}
			else{
				throw new Exception("curUser is unknown instance");
			}
		}
		catch(Exception x){
			x.printStackTrace();
		}
		
		return null;
	}

	public UserInfo invalidateSession(boolean keepUser) {
		String ik = "";String fromCas = null;
		if (keepUser) {
			ik = (String) GWTSpringController.getRequest().getSession().getAttribute("user_ik");
			fromCas = (String) GWTSpringController.getRequest().getSession().getAttribute("fromCas");
		}
		GWTSpringController.getRequest().getSession().invalidate();
		SecurityContextHolder.clearContext();

		if (keepUser) {
			GWTSpringController.getRequest().getSession().setAttribute("user_ik", ik);
			GWTSpringController.getRequest().getSession().setAttribute("fromCas", fromCas);
		}
		

		GWTSpringController.getRequest().getSession().setAttribute("login_reg_code", null);

		return getUserInfo();
	}

	public UserInfo isSessionValid() {

		HttpSession session = GWTSpringController.getRequest().getSession(false);
		UserInfo userInfo = getUserInfo();
		if (session == null && GWTSpringController.getRequest().getRequestedSessionId() != null
				&& !GWTSpringController.getRequest().isRequestedSessionIdValid()) {

			userInfo = invalidateSession(false);
			LOGGER.info("SESSION NOT VALID - " + (userInfo == null ? "null" : userInfo.getName()));
			return null;
		}
		// LOGGER.info("result isSessionValid true - " + (userInfo == null ?
		// "null" : userInfo.getName()));
		return userInfo;
	}

}
