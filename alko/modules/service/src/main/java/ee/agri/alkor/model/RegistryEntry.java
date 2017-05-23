package ee.agri.alkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.history.IHistorical;
/**
 *
 * @author suisalu
 *
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="REG_ENTRY")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class RegistryEntry extends ABaseBean implements IHistorical {
    /**
     * The id of the entity.
     */
    private Long id;
    


	/**
	 * Toote registreerimise number.
	 */
	private String nr;
	/**
	 * Kande kehtivuse alguse kuup�ev
	 */
	private Date validFrom;

	/**
	 * Kehtivuse lopp
	 */
	private Date validUntil;
	/**
	 * Kande toode.
	 */
	//private Product product;
	/**
	 * Kande muutmise pohjus (pikendamine jne.)
	 */
	private String changeReason;
	/**
	 * Kehtivuse lopu email on saadetud?
	 */
	private Boolean expiryNotificationSent;

	/**
	 *
	 */
	private RegistryApplication application;

	/**
     * Getter for id.
     * @return id
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REG_ENTRY_SEQ")
	@javax.persistence.SequenceGenerator(
    name="REG_ENTRY_SEQ",
    sequenceName="REG_ENTRY_SEQ",
    allocationSize=50
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
	 */
    @Column(name="NR", length=20)
	public String getNr() {
		return nr;
	}
	public void setNr(String entryNr) {
		this.nr = entryNr;
	}
	/**
	 * @return Date
	 */
    @Column(name="VALID_FROM")
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	/**
	 * @return
	 */
    @Column(name="VALID_UNTIL")
	public Date getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	/**
	 *
	 * @return
	 */
    @Column(name="CHANGE_REASON", length=10000)
	public String getChangeReason() {
		return changeReason;
	}
	public void setChangeReason(String changeReason) {
		if(changeReason != null && changeReason.length() > 10000) {
			changeReason = changeReason.substring(0, 10000);
		}
		this.changeReason = changeReason;
	}

    @Column(name="EXPIRY_NOTIFIED")
	public Boolean getExpiryNotificationSent() {
		return expiryNotificationSent;
	}

	public void setExpiryNotificationSent(Boolean expiryNotificationSent) {
		this.expiryNotificationSent = expiryNotificationSent;
	}

	@OneToOne(mappedBy="registryEntry", fetch=FetchType.EAGER)
	public RegistryApplication getApplication() {
		return application;
	}

	public void setApplication(RegistryApplication application) {
		this.application = application;
	}


}
