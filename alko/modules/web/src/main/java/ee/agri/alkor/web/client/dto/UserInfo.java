package ee.agri.alkor.web.client.dto;

import java.util.HashMap;
import java.util.Set;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Autoriseerimise info.
 *
 * @author ivars
 */
public class UserInfo
	implements IsSerializable {

	private String firstName;

	private String lastName;

	private String name;

	private HashMap userManageMap;

	private String regCode;

	public String getRegCode() {
      return regCode;
   }


   public void setRegCode(String regCode) {
      this.regCode = regCode;
   }

   private Set roles;

	 public UserInfo() {
		super();
	}


	public UserInfo(String name, Set roles) {
		super();
		this.name = name;
		this.roles = roles;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getRoles() {
		return roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public HashMap getUserManageMap() {
		return userManageMap;
	}

	public void setUserManageMap(HashMap userManageMap) {
		this.userManageMap = userManageMap;
	}

}