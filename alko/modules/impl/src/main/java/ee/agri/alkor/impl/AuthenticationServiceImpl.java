package ee.agri.alkor.impl;

import java.awt.image.renderable.RenderableImage;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.GrantedAuthorityImpl;
import org.acegisecurity.InsufficientAuthenticationException;
import org.acegisecurity.event.authentication.AbstractAuthenticationEvent;
import org.acegisecurity.event.authentication.AbstractAuthenticationFailureEvent;
import org.acegisecurity.ui.WebAuthenticationDetails;
import org.acegisecurity.userdetails.User;
import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.context.ApplicationEvent;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.util.ClassUtils;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.AuthenticationLog;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.UserGroup;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.model.classes.AuthenticationType;
import ee.agri.alkor.service.IAuthenticationService;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.SessionFilter;

import ee.agri.alkor.impl.PostgreUtils;

/**
 * Implements necessary methods for Acegi security framework.
 * 
 * @author ivar
 * 
 */
public class AuthenticationServiceImpl extends BaseBO implements IAuthenticationService {

	private static Logger LOGGER = Logger.getLogger(AuthenticationServiceImpl.class);

	public SystemUser loadUserByName(String userName) throws UsernameNotFoundException, DataAccessException {
		SystemUser user = null;
		try {
			if (userName.startsWith("{UNIQ}")) {
				String id = userName.substring(userName.indexOf("}") + 1);
				XTeeId xteeId = (XTeeId) getHibernateTemplate().find("from XTeeId x where x.id=?", id).get(0);
				if (xteeId != null) {
					userName = IClassificatorService.EIT_USERNAME;
					user = findUser(userName);

					return user;
				}
			} else {
				user = findUser(userName);
				return user;
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new UsernameNotFoundException(userName);
		}
		return null;

	}

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, InsufficientAuthenticationException {
		boolean onIsikukood = false;
		boolean fromCas = false;
		
		if(userName.startsWith("{CAS}")){
			fromCas = true;
			userName = userName.replace("{CAS}", "");
		}

		ResultSet rs = PostgreUtils.query("SELECT 1 FROM person WHERE reg_id = '"+userName.replaceAll("'", "")+"'");
		try{
			while(rs.next()){
				onIsikukood = true;
			}
		}
		catch(Exception xc){
			xc.printStackTrace();
		}

		if(onIsikukood){
			if(fromCas){
				userName = "{CAS}"+userName;
			}
			return loadUserByRegistrationId(userName);
		}
		
		SystemUser user = null;
		User details;
		LOGGER.info("loadUserByUsername");
		String regCode = null;
		try {
			/*if (userName.startsWith("{UNIQ}")) {
				String id = userName.substring(userName.indexOf("}") + 1);
				LOGGER.info("id: " + id);
				XTeeId xteeId = (XTeeId) getHibernateTemplate().find("from XTeeId x where x.id=?", id).get(0);
				if (xteeId != null) {
					userName = IClassificatorService.EIT_USERNAME;
					regCode = xteeId.getRegistryCode();

					// getHibernateTemplate().delete(xteeId); // miks?
					user = findUser(userName);

					String headerName = xteeId.getRepresentativeName();
					int index = headerName != null ? headerName.indexOf(' ') : -1;
					String firstName = index != -1 ? headerName.substring(0, index) : (headerName == null || headerName.length() < 1) ? null : headerName;
					String lastName = index != -1 ? headerName.substring(index + 1, headerName.length()) : null;

					details = new AlkoUserDetails(userName, user.getPassword(), firstName, lastName, xteeId.getRepresentativePersonalCode(),
							makeAuthorities(user), user, regCode, xteeId.getrepresentativeOccupation());
					LOGGER.debug("user details : " + details);
					return details;

				}
			} else {*/
				
				String idCode = "";
				ResultSet rs2 = PostgreUtils.query("SELECT reg_id FROM person WHERE id = (SELECT person_id FROM sys_user WHERE name = '"+userName.replaceAll("'", "")+"' LIMIT 1)");
				try{
					while(rs2.next()){
						idCode = rs2.getString("reg_id");
					}
				}
				catch(Exception xc){
					xc.printStackTrace();
				}
				
				user = findUser(userName);
				details = new AlkoUserDetails(userName, user.getPassword(), user.getPerson().getFirstName(), user.getPerson().getLastName(),
						idCode, makeAuthorities(user), user);
				((AlkoUserDetails)details).setFromCas(fromCas);
				return details;
			//}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new UsernameNotFoundException(userName);
		}
		//return null;
	}

	private SystemUser findUser(String username) throws UsernameNotFoundException {
		try {
			SystemUser user = (SystemUser) getHibernateTemplate().find("from SystemUser u where u.name = ? and u.active = true", username).get(0);
			return user;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			throw new UsernameNotFoundException(username);
		}
	}

	public UserDetails loadUserByRegistrationId(String idCode) throws UsernameNotFoundException {
		SystemUser user = null;
		User details = null;
		boolean fromCas = false;
		
		if(idCode.startsWith("{CAS}")){
			fromCas = true;
			idCode = idCode.replace("{CAS}", "");
		}

		// AlkoUserDetails ad = new AlkoUserDetails("aaa", "bbb",
		// "CCC", "ddd", makeAuthorities(new SystemUser()), new SystemUser());
		//
		LOGGER.debug("loadUserByRegistrationId");

		try {

			try {
				String sql = "select * from user_session where valid_until > now() order by id desc limit 1";
				String regNr = null;
				String id = null;

				try {
					ResultSet rs = PostgreUtils.query(sql);
					while (rs.next()) {
						regNr = rs.getString("reg_nr");
						id = rs.getString("id");
					}			
				} catch (Exception ex) {
					ex.printStackTrace();
				}	
							
				if(regNr != null && regNr.length() > 6){
					throw new Exception();
				}
				
				sql = "DELETE FROM user_session where id = " + id;
				PostgreUtils.delete(sql);

				user = (SystemUser) getHibernateTemplate().find("from SystemUser u where u.person.registrationId = ? and u.active = true", idCode).get(0);

				details = new AlkoUserDetails(user.getName(), user.getPassword(), user.getPerson().getFirstName(), user.getPerson().getLastName(),
						idCode, makeAuthorities(user), user);			
				((AlkoUserDetails)details).setFromCas(fromCas);	
			} catch (Exception exeption) {
				String occupation = "";
				String firstname = "";
				String lastname = "";
				String regNr = null;
				String id = null;

				String sql = "select * from user_session where valid_until > now() order by id desc limit 1";
				try {
					ResultSet rs = PostgreUtils.query(sql);
					while (rs.next()) {
						id = rs.getString("id");
						regNr = rs.getString("reg_nr");
					}
					sql = "DELETE FROM user_session where id = " + id;
					PostgreUtils.delete(sql);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				user = findUser(IClassificatorService.EIT_USERNAME);
				//user = (SystemUser) getHibernateTemplate().find("from SystemUser u where u.person.registrationId = ? and u.active = true", idCode).get(0);
				sql = "select person_role, person_name from user_arireg where id_code = '" + idCode + "' and reg_nr = '" + regNr + "'";

				try {
					ResultSet rs = PostgreUtils.query(sql);
					while (rs.next()) {
						occupation = rs.getString("person_role");
						if(rs.getString("person_name") != null && rs.getString("person_name") .length() > 0){
							try{
								String[] splt = rs.getString("person_name").split(" ");
								lastname = splt[splt.length-1];
								firstname = rs.getString("person_name").substring(0, rs.getString("person_name").indexOf(lastname));
							} catch (Exception ex) {
								ex.printStackTrace();
							}
						}
						
						occupation = (occupation != null && !occupation.equals("") ? occupation: "JUHATAJA");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				if (occupation.equals("")) {
					try {
						ResultSet rs = PostgreUtils.query("SELECT COALESCE(occupation, '') AS occupation, COALESCE(name, '') AS name, "
									+ "COALESCE(lastname, '') AS lastname "
								+ "FROM enterprise_person_ref "
								+ "WHERE id_code = '"+idCode+"' "
									+ "AND enterprise_id = (SELECT id FROM enterprise WHERE reg_id = '"+regNr+"' AND active = true) AND valid = true");
						
						while (rs.next()) {
							occupation = rs.getString("occupation");
							firstname = rs.getString("name");
							lastname = rs.getString("lastname");
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					occupation = (occupation != null && !occupation.equals("") ? occupation: "VOLITATU");
				}
				
				details = new AlkoUserDetails(IClassificatorService.EIT_USERNAME, 
						user.getPassword(), 
						(firstname != "" ? firstname : user.getPerson().getFirstName()), 
						(lastname != "" ? lastname : user.getPerson().getLastName()), 
						idCode, 
						makeAuthorities(user), 
						user,
						regNr, 
						occupation);
				((AlkoUserDetails)details).setFromCas(fromCas);
			}
			// details = new User(user.getName(), user.getPassword(), true,
			// true,
			// true, true, makeAuthorities(user));
		} catch (IndexOutOfBoundsException ioe) {
			ioe.printStackTrace();
			throw new UsernameNotFoundException(idCode);
		}
		
		return details;
	}

	public void onApplicationEvent(ApplicationEvent event) {
		if (!(event instanceof AbstractAuthenticationEvent))
			return;

		final AbstractAuthenticationEvent authEvent = (AbstractAuthenticationEvent) event;
		final String userName = authEvent.getAuthentication().getName();
		Object details = authEvent.getAuthentication().getDetails();
		Object principal = authEvent.getAuthentication().getPrincipal();

		if(!(principal instanceof AlkoUserDetails) || userName == null || userName.replaceAll(" ", "").length() == 0){
			return;
		}
		
		
		String message = null;
		if (LOGGER.isDebugEnabled()) {
			message = "Authentication event:[" + ClassUtils.getShortName(authEvent.getClass()) + "] " + userName + " details:[" + details + "] principal: ["
					+ principal + "]";
		}
		
		//System.out.println(message);
		
//		if (event instanceof AbstractAuthenticationFailureEvent) {
//			message = message + " exception:[" + ((AbstractAuthenticationFailureEvent) event).getException().getMessage() + "]";
//			LOGGER.info(message);
//			return;
//		} else if (LOGGER.isDebugEnabled())
//			LOGGER.debug(message);

		// autentimise ajaaken +/- 2 sekundit
		final Calendar authTimeStart = Calendar.getInstance();
		authTimeStart.add(Calendar.SECOND, -2);
		final Calendar authTimeEnd = Calendar.getInstance();
		authTimeEnd.add(Calendar.SECOND, 2);

		// autentimise tüüp
		final AuthenticationType auhtType = new AuthenticationType();
		Object authenticationSrc = authEvent.getSource();
//		if ("EIT".equals(userName)) { // EIT-kasutaja
//			auhtType.setCode(IClassificatorService.AUTH_TYPE_EIT);
//		} else 
		
		//System.out.println("Authentication event:[" + ClassUtils.getShortName(authEvent.getClass()) + "] " + userName + " details:[" + details + "] principal: ["+ principal + "]");
		
		/*
		if (authenticationSrc.getClass().getName().indexOf("Username") >= 0) { // vormi kaudu sisenemine
			auhtType.setCode(IClassificatorService.AUTH_TYPE_FORM);
		} else { // id-kaardiga
			auhtType.setCode(IClassificatorService.AUTH_TYPE_CERT);
		}
		*/

		if (!((AlkoUserDetails)principal).isFromCas()) { // vormi kaudu sisenemine
			auhtType.setCode(IClassificatorService.AUTH_TYPE_FORM);
		} else { // id-kaardiga
			auhtType.setCode(IClassificatorService.AUTH_TYPE_CERT);
		}
		
		LOGGER.debug("authType: " + auhtType.getCode());

		// IP-aadress
		/*
		 * Fallback, et ip kogu aeg olemas oleks (tekitab logides probleeme)
		 */
		String remoteAddress = "127.0.0.1";
		if (details instanceof WebAuthenticationDetails) {
			WebAuthenticationDetails webAuthDetails = (WebAuthenticationDetails) details;
			remoteAddress = webAuthDetails.getRemoteAddress();
			LOGGER.debug("remoteAddress: " + remoteAddress);
		}
		final String clientAddress = remoteAddress;

		// kasutajaandmete objekt
		AlkoUserDetails userObject = null;
		if (principal instanceof AlkoUserDetails) {
			userObject = (AlkoUserDetails) principal;
		}
		final AlkoUserDetails userDetails = userObject;

		try {
			// getHibernateTemplate().setEntityInterceptor(new
			// AuditInterceptor());
			getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {

					AuthenticationLog authLogEntry = new AuthenticationLog();

					if ("EIT".equals(userName) && userDetails != null) { // kui
																			// kasutaja
																			// tuleb
																			// läbi
																			// EITi
						LOGGER.debug("EIT kasutaja!");
						authLogEntry.setUserFullName(getEnterpriseName(userDetails.getRegCode(), // registrikoodi
																									// järgi
																									// ettevõtte
																									// nimi
								userDetails.getFirstName() + " " + userDetails.getLastName())); // fallback
																								// isiku
																								// nimele
						authLogEntry.setRegistrationId(userDetails.getIdCode());

					} else {
						Iterator it = session
								.createQuery("select u.person.firstName, u.person.lastName, u.person.registrationId from SystemUser u where u.name = ?")
								.setString(0, userName).iterate();

						if (it.hasNext()) {
							do {
								Object[] row = (Object[]) it.next();
								authLogEntry.setUserFullName(((String) row[0]) + " " + ((String) row[1]));
								authLogEntry.setRegistrationId((String) row[2]);
							} while (it.hasNext());
						}
					}

//					LOGGER.debug("authLogEntry fullName:[" + authLogEntry.getUserFullName() + "] registrationId:[" + userDetails.getIdCode() + "]");
					// Check for existing log entry.
					Iterator matchList = session
							.createQuery("select count(*) from AuthenticationLog l where l.userFullName like ? and l.time > ? and l.time < ?")
							.setString(0, authLogEntry.getUserFullName()).setTimestamp(1, authTimeStart.getTime()).setTimestamp(2, authTimeEnd.getTime())
							.list().iterator();
					// AuthEvent already saved.
					if (matchList.hasNext()) {
						Long count = (Long) matchList.next();
						LOGGER.debug("Check result:" + count + " start:" + authTimeStart.getTime() + " end:" + authTimeEnd.getTime() + " user:"
								+ authLogEntry.getUserFullName());

						if (count.intValue() != 0)
							return null;
						else {
							if (LOGGER.isDebugEnabled())
								LOGGER.debug("AuthlogEntry for " + userName + " already saved");
						}
					} else
						return null;
					// AuthenticationLog authLogPre = new AuthenticationLog();
					//
					// authLogPre.setClientIP("127.0.0.1");
					// authLogPre.setRegistrationId("PSEUDO");
					// authLogPre.setTime(new Date());
					// authLogPre.setType(auhtType);
					// authLogPre.setUserFullName("PSEUDO LOGIMINE ALGUS");
					// session.save(authLogPre);
					//
					// AuthenticationLog authLogPre2 = new AuthenticationLog();
					//
					// // authLogPre2.setClientIP("127.0.0.1");
					// authLogPre2.setRegistrationId("PSEUDO");
					// authLogPre2.setTime(new Date());
					// authLogPre2.setType(auhtType);
					// authLogPre2.setUserFullName("PSEUDO LOGIMINE tyhi");
					// session.save(authLogPre2);

					if(authLogEntry.getUserFullName() == null || authLogEntry.getUserFullName().replaceAll(" ", "").length() == 0){
						return null;
					}
					
					authLogEntry.setClientIP(clientAddress);
					authLogEntry.setTime(new Date());
					if (auhtType.getCode() != null)
						authLogEntry.setType(auhtType);
					LOGGER.debug("Saving authlog entry for " + authLogEntry.getUserFullName());
					session.save(authLogEntry);
					// AuthenticationLog authLogPre3 = new AuthenticationLog();
					//
					// authLogPre3.setClientIP("127.0.0.1");
					// authLogPre3.setRegistrationId("PSEUDO");
					// authLogPre3.setTime(new Date());
					// authLogPre3.setType(auhtType);
					// authLogPre3.setUserFullName("PSEUDO LOGIMINE LOPP");
					// session.save(authLogPre3);

					session.flush();
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e, e);
		}
	}

	private String getEnterpriseName(String regNr, String nullValue) {
		try {
			ResultSet rs = PostgreUtils.query("SELECT name FROM enterprise WHERE reg_id = '"+regNr.replaceAll("'","\"")+"'");
			if(rs.next()){
				nullValue = rs.getString("name");
			}
			
			// see tekkitas massiivse ajalise bloki miskipärast, viidud meie enda kujule
			/*
			 nullValue = ((Enterprise) getHibernateTemplate().find("from Enterprise e where e.registrationId = ? and e.active = true order by e.modified desc",
					regNr).get(0)).getName();
			 */
			
		} catch (Exception e) {
		}
		return nullValue;
	}

	private GrantedAuthority[] makeAuthorities(SystemUser user) {
		GrantedAuthority[] roles = null;
		if (user.getName().equals(IClassificatorService.EIT_USERNAME)) {
			roles = new GrantedAuthority[1];
			roles[0] = new GrantedAuthorityImpl("ROLE_EIT_GRP");
		} else if (user.getGroups().size() == 0) {
			// throw new InsufficientAuthenticationException("");
			// Lisame ANONYMOUS rolli et acegi oleks happy
			roles = new GrantedAuthority[1];
			roles[0] = new GrantedAuthorityImpl("ROLE_ANONYMOUS");
		} else {
			roles = new GrantedAuthority[user.getGroups().size()];
			int i = 0;
			for (UserGroup group : user.getGroups()) {
				roles[i++] = new GrantedAuthorityImpl("ROLE_" + group.getGroupClass().getCode());
			}
		}
		return roles;
	}
}
