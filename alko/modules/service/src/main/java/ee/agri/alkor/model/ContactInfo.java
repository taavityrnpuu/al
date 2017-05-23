package ee.agri.alkor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * Enterprise contact info.
 *
 * @author ivar
 *
 */
@Embeddable
public class ContactInfo  implements Serializable {

	private String phone;

	private String mobile;

	private String fax;

	private String email;

	@Column(name="EMAIL", length=320)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="FAX", length=20)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name="MOBILE", length=20)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name="PHONE", length=20)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
