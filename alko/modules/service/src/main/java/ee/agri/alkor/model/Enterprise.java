package ee.agri.alkor.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.validator.Length;

import ee.agri.alkor.model.history.IHistorical;

/**
 * @hibernate.class table="SUBJECT"
 *
 * @author suisalu
 *
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
		optimisticLock = OptimisticLockType.DIRTY)
@Table(name="ENTERPRISE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Enterprise extends ABaseBean
	implements IClassificatorAware, IHistorical {
	/**
     * The id of the entity.
     */
    private Long id;
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
	private Address address;
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
	private Person enterpriseRepresentative;
	/**
	 * Isikuga seotud lisainfo.
	 */
	private String notes;
	/**
	 * Ettevõtte kui subjekti rollid toote suhtes.
	 */
	private Set<ProductEnterpriseRole> enterpriseRoles = new HashSet<ProductEnterpriseRole>();
	/**
	 * Riigilõivu maksed.
	 */
	private Set<RegistryPayment> payments = new HashSet<RegistryPayment>();
	/**
	 * Konto seis(uuendtatakse maksete sidumisel).
	 */
	private BigDecimal balance;

	/**
	 * Ettevõtte andmete muutmise põhjus
	 */
	private String changeReason;
	
	/**
	 * Kas ettevõte on aktiivne
	 */
	private Boolean active;

    public Enterprise() {
		super();
	}
    /**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENTERPRISE_SEQ")
	@javax.persistence.SequenceGenerator(
    name="ENTERPRISE_SEQ",
    sequenceName="ENTERPRISE_SEQ",
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
	/**
	 * @return String
	 * @hibernate.property  column="NAME" length="128"
	 */
    @Column(name="NAME", length=128, unique=false)
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
	 * @hibernate.property  column="REG_CODE"
	 *
	 */
	@Column(name="REG_ID", length=40, unique=false)
	@Length(max=40)
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Embedded
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Column(name="MTR_CODE", length=64)
	public String getMTRCode() {
		return MTRCode;
	}

	public void setMTRCode(String code) {
		MTRCode = code;
	}
	@Column(name="EXCISE_STORE_NR", length=64)
	public String getExciseStoreHouseNr() {
		return exciseStoreHouseNr;
	}

	public void setExciseStoreHouseNr(String nr) {
		this.exciseStoreHouseNr = nr;
	}

	@Column(name="ACK_DATE", length=30)
	public Date getAcknowledgementDate() {
		return acknowledgementDate;
	}

	public void setAcknowledgementDate(Date acknowledgementDate) {
		this.acknowledgementDate = acknowledgementDate;
	}

	@Column(name="ACK_NR", length=30)
	public String getAcknowledgementNr() {
		return acknowledgementNr;
	}

	public void setAcknowledgementNr(String acknowledgementNr) {
		this.acknowledgementNr = acknowledgementNr;
	}
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="ENT_REPR_SUBJ_ID")
	@ForeignKey(name="FK_ENT_REPR_SUBJECT")
	public Person getEnterpriseRepresentative() {
		return enterpriseRepresentative;
	}

	public void setEnterpriseRepresentative(Person enterpriseRepresentative) {
		this.enterpriseRepresentative = enterpriseRepresentative;
	}

	@OneToMany(mappedBy="enterprise", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	public Set<ProductEnterpriseRole> getEnterpriseRoles() {
		return enterpriseRoles;
	}

	public void setEnterpriseRoles(Set<ProductEnterpriseRole> enterpriseRoles) {
		this.enterpriseRoles = enterpriseRoles;
	}

	@Column(name="NOTES", length=1000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name="CHANGE_REASON", length=1000)
	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	@OneToMany(mappedBy="boundEnterprise", cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
	//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	public Set<RegistryPayment> getPayments() {
		return payments;
	}
	public void setPayments(Set<RegistryPayment> payments) {
		this.payments = payments;
	}

	public void addEnterpriseRole(ProductEnterpriseRole role) {
		getEnterpriseRoles().add(role);
		role.setEnterprise(this);

	}
	public void removeEnterpriseRole(ProductEnterpriseRole role) {
		ProductEnterpriseRole roleToRemove = null;
		for(ProductEnterpriseRole existingRole: getEnterpriseRoles()) {
			if(role.getEnterpriseRoleClass().getCode()
					.equals(existingRole.getEnterpriseRoleClass().getCode()))
					roleToRemove = 	existingRole;
		}
		if(roleToRemove != null)
			getEnterpriseRoles().remove(roleToRemove);
	}

	public void addPayment(RegistryPayment payment) {
		payment.setBoundEnterprise(this);
		this.getPayments().add(payment);
	}

	@Column(name="BALANCE", scale=2, columnDefinition = "numeric(19,2) default 0")
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
