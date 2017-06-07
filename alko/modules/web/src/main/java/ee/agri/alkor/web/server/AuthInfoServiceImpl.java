package ee.agri.alkor.web.server;

import java.util.HashSet;
import java.util.Set;

import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.context.SecurityContextHolder;
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
		if (curUser == null)
			return null;
		else if (curUser instanceof String) {
			return new UserInfo((String) curUser, null);
		} else {
			AlkoUserDetails userDetails = (AlkoUserDetails) curUser;
			UserInfo user = new UserInfo();

			String firstName = "";
			String lastName = "";

			if (userDetails.getRegCode() != null && !userDetails.getRegCode().equals("")) { // kui
																							// on
																							// EIT
																							// siis
																							// nime
																							// pole
																							// olemas
				try {
					ResultSet rs = PostgreUtils
							.query("SELECT * FROM enterprise WHERE reg_id = '" + userDetails.getRegCode() + "'");
					while (rs.next()) {
						firstName = rs.getString("name");
					}
				} catch (Exception x) {
					x.printStackTrace();
				}
				lastName = userDetails.getRegCode() + " (" + userDetails.getIdCode() + ")";
			} else {
				try {
					ResultSet rs = PostgreUtils
							.query("SELECT * FROM person WHERE reg_id = '" + userDetails.getIdCode() + "'");
					while (rs.next()) {
						firstName = rs.getString("first_name");
						lastName = rs.getString("last_name");
					}
				} catch (Exception x) {
					firstName = "tundmatu";
					lastName = "kasutaja";
					x.printStackTrace();
				}
			}

			user.setName(userDetails.getUsername());
			GrantedAuthority[] authRoles = userDetails.getAuthorities();
			Set roles = new HashSet();
			for (int i = 0; i < authRoles.length; i++) {
				roles.add(authRoles[i].getAuthority());
			}
			user.setRoles(roles);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setUserManageMap(ClientDataFactory.create(userDetails.getSystemUser()));
			user.setRegCode(userDetails.getRegCode());

			// PersonMap p =(PersonMap) user.getUserManageMap().get("person");
			//
			// System.out.println("UM: " + p.get("registrationId"));
			// System.out.println("SEE ON IK! " + userDetails.getFirstName() + "
			// " + userDetails.getLastName());
			return user;
		}
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
