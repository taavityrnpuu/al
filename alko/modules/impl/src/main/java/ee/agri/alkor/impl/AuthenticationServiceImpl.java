package ee.agri.alkor.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateCallback;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.AuthenticationLog;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.UserGroup;
import ee.agri.alkor.model.classes.AuthenticationType;
import ee.agri.alkor.service.IAuthenticationService;
import ee.agri.alkor.service.IClassificatorService;


/**
 * Implements necessary methods for Spring security framework.
 * 
 * @author ivar
 * 
 */
public class AuthenticationServiceImpl extends BaseBO implements IAuthenticationService {
	private static Logger LOGGER = Logger.getLogger(AuthenticationServiceImpl.class);
    
	public SystemUser loadUserByName(String userName) throws UsernameNotFoundException, DataAccessException {
		SystemUser user = null;
		try {
			user = findUser(userName);
			return user;
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new UsernameNotFoundException(userName);
		}
	}

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, InsufficientAuthenticationException {
		boolean onIsikukood = false;
		boolean fromCas = false;
		
		if(userName.startsWith("{ENT}")){
			onIsikukood = true;
			userName = userName.replace("{ENT}", "");
		}
		
		if(userName.indexOf("{FROM_CAS}") > -1){
			fromCas = true;
			userName = userName.replace("{FROM_CAS}", "");
		}
		
		LOGGER.info("fromCas: " + fromCas+", username: "+userName+", onIsikukood: "+onIsikukood);
		
		if(onIsikukood){
			if(fromCas){
				userName = "{FROM_CAS}"+userName;
			}
			return loadUserByRegistrationId(userName);
		}
		
		SystemUser user = null;
		User details;
		LOGGER.info("loadUserByUsername");
		String regCode = null;
		try {
				
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
				
				LOGGER.info("USER: " + details.getUsername() + ", " + details.getPassword() + ", " + details.getAuthorities().toString());
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
			SystemUser user = (SystemUser) getHibernateTemplate().find("from SystemUser u where u.name = ?0 and u.active = true", username).get(0);
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
		
		if(idCode.startsWith("{ENT}")){
			idCode = idCode.replace("{ENT}", "");
		}
		
		if(idCode.indexOf("{FROM_CAS}") > -1){
			fromCas = true;
			idCode = idCode.replace("{FROM_CAS}", "");
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

				user = (SystemUser) getHibernateTemplate().find("from SystemUser u where u.person.registrationId = ?0 and u.active = true", idCode).get(0);

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
		
		// autentimise ajaaken +/- 2 sekundit
		final Calendar authTimeStart = Calendar.getInstance();
		authTimeStart.add(Calendar.SECOND, -2);
		final Calendar authTimeEnd = Calendar.getInstance();
		authTimeEnd.add(Calendar.SECOND, 2);

		// autentimise tüüp
		AuthenticationType authObject;
		
		String code;
		if (!((AlkoUserDetails)principal).isFromCas()) { // vormi kaudu sisenemine
			code = IClassificatorService.AUTH_TYPE_FORM;
		} else { // id-kaardiga
			code = IClassificatorService.AUTH_TYPE_CERT;
		}
		
		@SuppressWarnings("unchecked")
		List<AuthenticationType> authTypeQuery = (List<AuthenticationType>)getHibernateTemplate().find("from AuthenticationType c where c.code = ?0", code);
		if(!authTypeQuery.isEmpty()) {
			authObject = authTypeQuery.get(0);
			System.out.println(authObject.toString());
		} else {
			authObject = new AuthenticationType();
			authObject.setCode(code);
		}
		
		LOGGER.debug("authType: " + authObject.toString());

		// IP-aadress
		/*
		 * Fallback, et ip kogu aeg olemas oleks (tekitab logides probleeme)
		 */
		String remoteAddress = "";
	    RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
	    if(RequestContextHolder.getRequestAttributes() != null) {
	        HttpServletRequest req = ((ServletRequestAttributes) attributes).getRequest();
	        if(req != null) {
	        	remoteAddress = req.getHeader("X-Forwarded-For");
	    		if (remoteAddress == null || "".equals(remoteAddress)) {
	    			remoteAddress = req.getRemoteAddr();
	    		}
	    	}
	    }
		
		remoteAddress = remoteAddress != null && remoteAddress.contains(",") ? remoteAddress.split(",")[0] : remoteAddress;
		if(remoteAddress == null && details instanceof WebAuthenticationDetails) {
			WebAuthenticationDetails webAuthDetails = (WebAuthenticationDetails) details;
			remoteAddress = webAuthDetails.getRemoteAddress();
		}
		if(remoteAddress == null || "".equals(remoteAddress)) {
			remoteAddress = "127.0.0.1";
		}
		
		LOGGER.info("remoteAddress: " + remoteAddress);
		final String clientAddress = remoteAddress;
		
		// kasutajaandmete objekt
		AlkoUserDetails userObject = null;
		if (principal instanceof AlkoUserDetails) {
			userObject = (AlkoUserDetails) principal;
		}
		
		final AuthenticationType auhtType = authObject;
		final AlkoUserDetails userDetails = userObject;

		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					AuthenticationLog authLogEntry = new AuthenticationLog();
					
					if ("EIT".equals(userName) && userDetails != null) { // kui kasutaja tuleb läbi EITi
						LOGGER.debug("EIT kasutaja!");
						authLogEntry.setUserFullName(getEnterpriseName(userDetails.getRegCode(), // registrikoodi järgi ettevõtte nimi
								userDetails.getFirstName() + " " + userDetails.getLastName())); // fallback isiku nimele
						authLogEntry.setRegistrationId(userDetails.getIdCode());

					} else {
						Iterator it = session
								.createQuery("select u.person.firstName, u.person.lastName, u.person.registrationId from SystemUser u where u.name = ?0")
								.setString(0, userName).iterate();

						if (it.hasNext()) {
							do {
								Object[] row = (Object[]) it.next();
								authLogEntry.setUserFullName(((String) row[0]) + " " + ((String) row[1]));
								authLogEntry.setRegistrationId((String) row[2]);
							} while (it.hasNext());
						}
					}
					
					// Check for existing log entry.
					Iterator matchList = session
							.createQuery("select count(*) from AuthenticationLog l where l.userFullName like ?0 and l.time > ?1 and l.time < ?2")
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
					} else {
						System.out.println("return out");
						return null;
					}

					if(authLogEntry.getUserFullName() == null || authLogEntry.getUserFullName().replaceAll(" ", "").length() == 0){
						return null;
					}
					
					authLogEntry.setClientIP(clientAddress);
					authLogEntry.setTime(new Date());
					if (auhtType.getCode() != null) {
						authLogEntry.setType(auhtType);
						session.saveOrUpdate(auhtType);
					}
					
					System.out.println("Saving authlog entry for " + authLogEntry.getUserFullName());
					session.saveOrUpdate(authLogEntry);
					Transaction tx = session.beginTransaction();
					session.flush();
					tx.commit();
					
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
			ResultSet rs = PostgreUtils.query("SELECT name FROM enterprise WHERE reg_id = '"+regNr.replaceAll("'","\"")+"' ORDER BY COALESCE(active, false) DESC LIMIT 1");
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

	private Collection<GrantedAuthority> makeAuthorities(SystemUser user) {
		ArrayList<GrantedAuthority> roles = null;
		if (user.getName().equals(IClassificatorService.EIT_USERNAME)) {
			roles = new ArrayList<GrantedAuthority>();
			roles.add(new SimpleGrantedAuthority("ROLE_EIT_GRP"));
		} else if (user.getGroups().size() == 0) {
			// throw new InsufficientAuthenticationException("");
			// Lisame ANONYMOUS rolli et spring oleks happy
			roles = new ArrayList<GrantedAuthority>();
			roles.add(new SimpleGrantedAuthority("ROLE_ANONYMOUS"));
		} else {
			roles = new ArrayList<GrantedAuthority>();
			int i = 0;
			for (UserGroup group : user.getGroups()) {
				roles.add(new SimpleGrantedAuthority("ROLE_" + group.getGroupClass().getCode()));
			}
		}
		return roles;
	}
}
