	package ee.agri.alkor.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.Enterprise;

@Entity
@Table(name = "PAYMENT_MATCHING_LOG")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class PaymentMatchingLog implements Serializable  {
	
	/**
     * The id of the entity.
     */
	private Long id;
	
	/**
	 * Riigilõivu suurus
	 */
	private BigDecimal amount;
	
	/**
	 * Taotlus, millega riigilõiv seotakse
	 */
	private RegistryApplication paymentApplication;
	
	
    private Date created;

    private  String  createdBy;
    
    private BigDecimal enterprisePreviousBalance;
    
    private Long enterpriseBindedTo;
    
    
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_MATCHING_LOG_SEQ")
	@javax.persistence.SequenceGenerator(name = "PAYMENT_MATCHING_LOG_SEQ", sequenceName = "PAYMENT_MATCHING_LOG_SEQ", allocationSize = 1)
	public Long getId() {
		
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	@Column(name = "AMOUNT", scale=2)
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	
	@Column(name="CREATED")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

    @Column(name="CREATED_BY", length=16)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH})
	@JoinColumn(name="payment_application_id")
	@ForeignKey(name="fk_payment_application")
	public RegistryApplication getPaymentApplication() {
		return paymentApplication;
	}

	public void setPaymentApplication(RegistryApplication paymentApplication) {
		this.paymentApplication = paymentApplication;
	}

	@Column(name = "previous_balance", scale=2)
	public BigDecimal getEnterprisePreviousBalance() {
		return enterprisePreviousBalance;
	}
	/**
	 * Ettevõte saldo enne riigilõivu mahavõtmist
	 * Logiveerg
	 * @param enterprisePreviousBalance
	 */
	public void setEnterprisePreviousBalance(BigDecimal enterprisePreviousBalance) {
		this.enterprisePreviousBalance = enterprisePreviousBalance;
	}
	
	@Column(name = "enterprise_binded_to")
	public Long getEnterpriseBindedTo() {
		return enterpriseBindedTo;
	}
	/**
	 * Ettevõte, mille saldost riigilõiv maha võetakse
	 * Logiveerg
	 * @param enterpriseBindedTo
	 */
	public void setEnterpriseBindedTo(Long enterpriseBindedTo) {
		this.enterpriseBindedTo = enterpriseBindedTo;
	}
	

}
