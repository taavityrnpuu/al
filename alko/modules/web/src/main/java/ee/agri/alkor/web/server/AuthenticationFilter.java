package ee.agri.alkor.web.server;

import java.net.URLDecoder;
import java.security.cert.X509Certificate;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.acegisecurity.Authentication;
import org.acegisecurity.AuthenticationException;
import org.acegisecurity.providers.AbstractAuthenticationToken;
import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.acegisecurity.ui.webapp.AuthenticationProcessingFilter;
import org.apache.log4j.Logger;

import ee.agri.alkor.impl.PostgreUtils;

/**
 * 
 * @author ivars
 * 
 */
public class AuthenticationFilter extends AuthenticationProcessingFilter {
	private static Logger LOGGER = Logger.getLogger(AuthenticationFilter.class);

	public Authentication attemptAuthentication(HttpServletRequest request) throws AuthenticationException {
		LOGGER.info("AuthenticationFilter:attemptAuthentication started,,,");
		AbstractAuthenticationToken authRequest = null;
		
		String username = null;
		String password = null;
		String id = request.getParameter("nonce");
		LOGGER.info("id:" + id);
		try {
			username = URLDecoder.decode(obtainUsername(request), "UTF-8");
		} catch (Exception e) {
		}
		try {
			password = getMD5(URLDecoder.decode(obtainPassword(request), "UTF-8"));
		} catch (Exception e) {
		}
		
		if ((username != null) && (password != null)) {

			String idCode = "";

			ResultSet rs = PostgreUtils.query("SELECT reg_id FROM person WHERE id = (SELECT person_id FROM sys_user WHERE name = '"+username.replaceAll("'", "")+"' LIMIT 1)");
			try{
				while(rs.next()){
					idCode = rs.getString("reg_id");
				}
			}
			catch(Exception xc){
				xc.printStackTrace();
			}
			
			request.getSession().setAttribute("user_ik", idCode);
			
			/*
			if(request.getSession().getAttribute("fromCas") != null && request.getSession().getAttribute("fromCas").equals("1")){
				username = "{FROM_CAS}"+username;
			}
			*/
			
			authRequest = new UsernamePasswordAuthenticationToken(username, password);
			request.getSession().setAttribute(ACEGI_SECURITY_LAST_USERNAME_KEY, username);
		}/* else if (id != null && id.length() != 0) {// XTee login
			// kasutajanimi mida ei kasutataks
			LOGGER.debug("XTEE LOGINI ÜRITATI");
			authRequest = new UsernamePasswordAuthenticationToken("{UNIQ}" + id, getMD5("qcy3zev"));
		} */ else {
			//if (request.getSession().getAttribute("user_ik") != null && !request.getSession().getAttribute("user_ik").equals("")) {

				String idCode = (String) request.getSession().getAttribute("user_ik");
				String regCode = (String) request.getSession().getAttribute("login_reg_code");
				password = getMD5("qcy3zev"); // EIT puhul
				String name = "EIT"; boolean isVTA = false; boolean enterprise = true;
				System.out.println("regCode: "+regCode);
				
				LOGGER.info("regCode: "+regCode);
				
				if(regCode == null || regCode.equals("") || regCode.equals("null")){

					ResultSet rs = PostgreUtils.query("SELECT name, password FROM sys_user WHERE person_id = (SELECT id FROM person WHERE reg_id = '"+idCode.replaceAll("'", "")+"' LIMIT 1)");
					try{
						while(rs.next()){
							password = rs.getString("password");
							name = rs.getString("name");
							isVTA = true;
						}
					}
					catch(Exception xc){
						//xc.printStackTrace();
					}
					
					enterprise = false;
				}

				UserAuthlog ua = new UserAuthlog(idCode, name);
				ua.checkAndCreate();

				LOGGER.info("isVTA: "+isVTA+", name: "+name+", idCode: "+idCode+", enterprise: "+enterprise);
				
				if(!isVTA){
					if(request.getSession().getAttribute("fromCas") != null && request.getSession().getAttribute("fromCas").equals("1")){
						idCode = "{FROM_CAS}"+idCode;
					}
					if(enterprise){
						idCode = "{ENT}"+idCode;
					}
					authRequest = new UsernamePasswordAuthenticationToken(idCode, password);
				}
				else{
					if(request.getSession().getAttribute("fromCas") != null && request.getSession().getAttribute("fromCas").equals("1")){
						name = "{FROM_CAS}"+name;
					}

					authRequest = new UsernamePasswordAuthenticationToken(name, password);
				}

			/*} else {
				String type = request.getParameter("type");
				LOGGER.debug("attemptAuthentication:cert is  null, type:" + type);
				if (type != null && type.equals("id")) {
					throw new NoCertificateException("");
				} else {
					authRequest = new UsernamePasswordAuthenticationToken("", "");
				}
			}*/
		}
		LOGGER.info("URI:" + request.getRequestURI());

		// Allow subclasses to set the "details" property
		setDetails(request, authRequest);
		return this.getAuthenticationManager().authenticate(authRequest);
	}

	protected void setDetails(HttpServletRequest request, AbstractAuthenticationToken authRequest) {
		authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
	}

	private X509Certificate extractClientCertificate(HttpServletRequest request) {
		X509Certificate[] certs = (X509Certificate[]) request.getAttribute("javax.servlet.request.X509Certificate");

		if (certs == null || certs.length < 1) {
			try {
				X509Certificate cert = (X509Certificate) request.getSession().getAttribute("user_login_cert");
				return cert;
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}
		}

		if ((certs != null) && (certs.length > 0)) {
			return certs[0];
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("No client certificate found in request.");
		}

		return null;
	}

	private String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());

			byte byteData[] = md.digest();

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}

			return sb.toString().substring(0, 19);
		} catch (NoSuchAlgorithmException ex) {
			return input;
		}
	}

}
