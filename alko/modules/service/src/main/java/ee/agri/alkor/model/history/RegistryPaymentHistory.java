/**
 *
 */
package ee.agri.alkor.model.history;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * RegistryPayment History
 * @author kaupo
 *
 */
@Entity
@Table(name = "REG_PAYMENT_HISTORY")
@javax.persistence.SequenceGenerator(name = "REG_PAYMENT_HIST_SEQ", sequenceName = "REG_PAYMENT_HIST_SEQ", allocationSize = 1)
public class RegistryPaymentHistory extends ABaseBean implements IHistoryEntity {

	/**
     *
     */
	private static final long serialVersionUID = 1791759278701546849L;

	private Long histId;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Maksja nimi.
     */
	private String payerName;

	/**
     * Maksja konto.
     */
	private String payingAccNo;

	/**
     * Maksja äriregistri kood.
     */
	private String payerRegistrationNr;

	/**
     * Viitenumber.
     */
	private String referenceNr;

	private Date paymentDate;

	private BigDecimal amount;

	private Long boundEnterprise; //Enterprise

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_PAYMENT_HIST_SEQ")
	public Long getHistId() {
		return this.histId;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#setHistId(java.lang.Long)
     */
	public void setHistId(Long histId) {
		this.histId = histId;
	}

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

	@Column(name = "AMOUNT")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "PAYER_NAME", length = 64)
	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	@Column(name = "PAYER_ACCNO", length = 32)
	public String getPayingAccNo() {
		return payingAccNo;
	}

	public void setPayingAccNo(String payingAccNo) {
		this.payingAccNo = payingAccNo;
	}

	@Column(name = "PAYMENT_TIME", length = 32)
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentTime) {
		this.paymentDate = paymentTime;
	}

	@Column(name = "REF_NR", length = 64)
	public String getReferenceNr() {
		return referenceNr;
	}

	public void setReferenceNr(String referenceNr) {
		this.referenceNr = referenceNr;
	}

	@Column(name = "REG_NR", length = 20)
	public String getPayerRegistrationNr() {
		return payerRegistrationNr;
	}

	public void setPayerRegistrationNr(String payerRegistrationNr) {
		this.payerRegistrationNr = payerRegistrationNr;
	}

	@Column(name="PAYER_ENTERPRISE_ID")
	public Long getBoundEnterprise() {
		return boundEnterprise;
	}

	public void setBoundEnterprise(Long boundEnterprise) {
		this.boundEnterprise = boundEnterprise;
	}

}
