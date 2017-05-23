package ee.agri.alkor.model;

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



@Entity
@Table(name = "REG_PAYMENT_LOG")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class RegistryPaymentLog {
	/**
     * The id of the entity.
     */
	private Long id;


	private Date created;
	
	private String createdBy;

	private BigDecimal amount;

	private Enterprise boundEnterprise;
	
	private BigDecimal enterprisePreviousBalance;
	


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_PAYMENT_LOG_SEQ")
	@javax.persistence.SequenceGenerator(name = "REG_PAYMENT_LOG_SEQ", sequenceName = "REG_PAYMENT_LOG_SEQ", allocationSize = 1)
	public Long getId() {
		return id;
	}

	/**
     * Setter for id.
     *
     * @param aId
     *            id
     */
	public void setId(Long aId) {
		this.id = aId;
	}

	@Column(name = "AMOUNT", scale=2)
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

	@ManyToOne(cascade = {CascadeType.REFRESH})
	@JoinColumn(name = "PAYER_ENTERPRISE_ID")
	@ForeignKey(name = "fk_paying_enterprise_log")
	public Enterprise getBoundEnterprise() {
		return boundEnterprise;
	}

	public void setBoundEnterprise(Enterprise boundEnterprise) {
		this.boundEnterprise = boundEnterprise;
	}

	@Column(name="created_by")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name="created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name="previous_balance")	
	public BigDecimal getEnterprisePreviousBalance() {
		return enterprisePreviousBalance;
	}

	public void setEnterprisePreviousBalance(BigDecimal enterprisePreviousBalance) {
		this.enterprisePreviousBalance = enterprisePreviousBalance;
	}
	
		
	

}
