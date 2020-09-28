package ee.agri.alkor.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.classes.AuthenticationType;
/**
 * 
 * @author suisalu
 *
 */
@Entity
@Table(name="AUTHLOG")
public class AuthenticationLog 
	implements IClassificatorAware, IEntity, Serializable {
	/**
     * The id of the entity.
     */
    private Long id;
    	
	private String userFullName;
	
	private String registrationId;
	
	private Date time;
	
	private AuthenticationType type;

	private String clientIP;
	
    /**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUTHLOG_SEQ")
	@javax.persistence.SequenceGenerator(
    name="AUTHLOG_SEQ",
    sequenceName="AUTHLOG_SEQ",
    allocationSize=1
	)
     public Long getId() {
        return id;
    }
    /**
     * Setter for id.
     * @param aId id
     */
    public void setId(Long aId) {
        this.id = aId;
    }
    

    @Column(name="CLIENT_IP", length=20)	
	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

    @Column(name="REG_NR", length=20)	
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

    @Column(name="TIME", length=20)	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="AUTH_TYPE_ID")
	@ForeignKey(name="FK_AUTH_TYPE_CLASS")
	public AuthenticationType getType() {
		return type;
	}

	public void setType(AuthenticationType type) {
		this.type = type;
	}

    @Column(name="USER_NAME", length=200)	
	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	
	public String toString() {
		return "Person [id=" + id + ", name=" + userFullName + ", regId="
			+ registrationId + ", time=" + time + ", ip=" + clientIP
			+ ", type=" + type.toString() + "]";
	}
}
