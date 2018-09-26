/**
 *
 */
package ee.agri.alkor.model.history;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.ContactInfo;

/**
 * Enterprise History
 * @author kaupo
 *
 */
@Entity
@javax.persistence.SequenceGenerator(name = "ENTERPRISE_HIST_SEQ", sequenceName = "ENTERPRISE_HIST_SEQ", allocationSize=1)
@Table(name = "ENTERPRISE_HISTORY")
public class EnterpriseHistory extends ABaseBean implements IHistoryEntity {

	/**
     *
     */
	private static final long serialVersionUID = 1L;

	/**
     * Ettevõtte nimi.
     */
	private String name;

	/**
     * Äriregistri reg. kood.
     */
	private String registrationId;

	/**
     * MTR registreeringu number.
     */
	private String MTRCode;

	/**
     * Aktsiisilao number.
     */
	private String exciseStoreHouseNr;

	/**
     * Füüsilisel isikulelukoht ja juriidilisel isikul asukoht.
     */
	private AddressHistory address;

	/**
     * Telefon, e-post, faks.
     */
	private ContactInfo contactInfo;

	/**
     * Käitlemisettevõtte tunnustamise otsuse number.
     */
	private String acknowledgementNr;

	/**
     * Käitlemisettevõtte tunnustamise kuupäev.
     */
	private Date acknowledgementDate;

	/**
     * Ettevõtte esindaja.
     */
	private Long enterpriseRepresentative;

	/**
     * Isikuga seotud lisainfo.
     */
	private String notes;

	/**
     * Ettevõtte andmete muutmise põhjus
     */
	private String changeReason;

	private Long histId;

	private Long id;

	private BigDecimal balance;
	
	/**
	 * Kas ettevõte on aktiivne
	 */
	private Boolean active;

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.IEntity#getId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENTERPRISE_HIST_SEQ")
	public Long getHistId() {
		return this.histId;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.IEntity#setId(java.lang.Long)
     */
	public void setHistId(Long histId) {
		this.histId = histId;

	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnterpriseHistory() {
		super();
	}

	/**
     * @return String
     * @hibernate.property column="NAME" length="128"
     */
	@Column(name = "NAME", length = 128)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
     *
     * @return String
     *
     * @hibernate.property column="REG_CODE"
     *
     */
	@Column(name = "REG_ID", length = 40)
	@Length(max = 40)
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	@Embedded
	public AddressHistory getAddress() {
		return address;
	}

	public void setAddress(AddressHistory address) {
		this.address = address;
	}

	@Embedded
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Column(name = "MTR_CODE", length = 64)
	public String getMTRCode() {
		return MTRCode;
	}

	public void setMTRCode(String code) {
		MTRCode = code;
	}

	@Column(name = "EXCISE_STORE_NR", length = 64)
	public String getExciseStoreHouseNr() {
		return exciseStoreHouseNr;
	}

	public void setExciseStoreHouseNr(String nr) {
		this.exciseStoreHouseNr = nr;
	}

	@Column(name = "ACK_DATE", length = 30)
	public Date getAcknowledgementDate() {
		return acknowledgementDate;
	}

	public void setAcknowledgementDate(Date acknowledgementDate) {
		this.acknowledgementDate = acknowledgementDate;
	}

	@Column(name = "ACK_NR", length = 30)
	public String getAcknowledgementNr() {
		return acknowledgementNr;
	}

	public void setAcknowledgementNr(String acknowledgementNr) {
		this.acknowledgementNr = acknowledgementNr;
	}

	@Column(name="ENT_REPR_SUBJ_ID")
	public Long getEnterpriseRepresentative() {
		return enterpriseRepresentative;
	}

	public void setEnterpriseRepresentative(Long enterpriseRepresentative) {
		this.enterpriseRepresentative = enterpriseRepresentative;
	}

	@Column(name = "NOTES", length = 1000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "CHANGE_REASON", length = 1000)
	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	/**
	 * @return the balance
	 */
	
	public BigDecimal getBalance() {
		return balance;
	}

	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Column(name="ACTIVE", columnDefinition = "boolean default true")
	public Boolean getActive() {
		return active;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
	}
	


}
