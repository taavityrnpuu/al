package ee.agri.alkor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



/**
 * Class that wraps the view reg_payment_view
 * @author Roland Vares
 *
 */

@Entity
@Table(name="reg_payment_view",schema="public")
public class RegistryPaymentView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String TYPE_PAYMENT_NAME = "Laekumine";
	public static final String TYPE_REGISTRY_NAME = "Registreerimise taotlus";
	public static final String TYPE_EXTEND_NAME = "Pikendamise taotlus";
	
	private Long id;
	
	private Long applicationId;
	
	private Long enterpriseId;
	
	private Date paymentDate;
	
	private BigDecimal amount;
	
	private String enterpriseName;
	
	private String enterpriseRegNr;
	
	private String applicationNr;
	
	private String payerName;
	
	private String type;
	
	private String typeName;

	@Column(name="APP_ID")
	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	@Column(name="PAYMENT_TIME")
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	@Column(name="AMOUNT")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name="ENTERPRISE_NAME")
	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	@Column(name="ENTERPRISE_REG_ID")
	public String getEnterpriseRegNr() {
		return enterpriseRegNr;
	}

	public void setEnterpriseRegNr(String enterpriseRegNr) {
		this.enterpriseRegNr = enterpriseRegNr;
	}
	
	@Column(name="APPLICATION_NR")
	public String getApplicationNr() {
		return applicationNr;
	}

	public void setApplicationNr(String applicationNr) {
		this.applicationNr = applicationNr;
	}
	
	@Column(name="PAYER_NAME")
	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	@Column(name="TYPE")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="enterprise_id")
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	/**
	 * 
	 * @return Name of given type
	 */
	@Transient
	public String getTypeName() {
		if("payment".equals(this.getType()))
			return TYPE_PAYMENT_NAME;
		else if("ARE".equals(this.getType()))
			return TYPE_REGISTRY_NAME;
		else if("ARP".equals(this.getType()))
			return TYPE_EXTEND_NAME;
		else 
			return "[NO MESSAGE]";
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
