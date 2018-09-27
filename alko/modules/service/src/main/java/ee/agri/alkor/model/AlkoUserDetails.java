package ee.agri.alkor.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class AlkoUserDetails extends org.springframework.security.core.userdetails.User {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private SystemUser systemUser;

	private String regCode;

	private String idCode;
	
	private String occupation;
	
	private boolean fromCas;
	
	public boolean isFromCas() {
		return fromCas;
	}

	public void setFromCas(boolean fromCas) {
		this.fromCas = fromCas;
	}

	public String getRegCode() {
      return regCode;
   }

   public void setRegCode(String regCode) {
      this.regCode = regCode;
   }

   public AlkoUserDetails(String username, String password, String firstName,
			String lastName, Collection<GrantedAuthority> authorities, SystemUser systemUser) {

		super(username, password, true, true,
				true, true, authorities);
		this.firstName = firstName;
		this.lastName = lastName;
		this.systemUser = systemUser;
	      this.fromCas = false;

	}
   
   public AlkoUserDetails(String username, String password, String firstName,
			String lastName, String idCode, Collection<GrantedAuthority> authorities, SystemUser systemUser) {

		super(username, password, true, true,
				true, true, authorities);
		this.firstName = firstName;
		this.lastName = lastName;
		this.systemUser = systemUser;
	      this.idCode = idCode;
	      this.fromCas = false;

	}
   
   public AlkoUserDetails(String username, String password, String firstName,
	         String lastName,String idCode, Collection<GrantedAuthority> authorities, SystemUser systemUser, 
	         String regCode, String occupation) {

	      super(username, password, true, true,
	            true, true, authorities);
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.systemUser = systemUser;
	      this.regCode = regCode;
	      this.idCode = idCode;
	      this.occupation = occupation;
	      this.fromCas = false;
	   }

	  public AlkoUserDetails(String username, String password, String firstName,
	         String lastName, Collection<GrantedAuthority> authorities, SystemUser systemUser, String regCode) {

	      super(username, password, true, true,
	            true, true, authorities);
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.systemUser = systemUser;
	      this.regCode = regCode;
	      this.fromCas = false;

	   }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public SystemUser getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String toString() {
		return "AlkoUserDetails [firstName=" + firstName + ", lastName="
				+ lastName + ", regCode=" + regCode + ", idCode=" + idCode
				+ ", occupation=" + occupation + ", fromCas="+fromCas+"]";
	}

}
