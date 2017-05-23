/**
 *
 */
package ee.agri.alkor.model.history;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * RegistryEntry History
 * @author kaupo
 *
 */
@Entity
@Table(name = "REG_ENTRY_HISTORY")
@javax.persistence.SequenceGenerator(name = "REG_ENTRY_HIST_SEQ", sequenceName = "REG_ENTRY_HIST_SEQ", allocationSize = 1)
public class RegistryEntryHistory extends ABaseBean implements IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 115037700678723785L;

	private Long histId;

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
     * Kande muutmise p�hjus (pikendamine jne.)
     */
	private String changeReason;

	private Boolean expiryNotificationSent;

	private Long application; //RegistryApplication

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_ENTRY_HIST_SEQ")
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

	/**
     * Getter for id.
     *
     * @return id
     */

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

	/**
     * @return String
     */
	@Column(name = "NR", length = 20)
	public String getNr() {
		return nr;
	}

	public void setNr(String entryNr) {
		this.nr = entryNr;
	}

	/**
     * @return Date
     */
	@Column(name = "VALID_FROM")
	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
     * @return
     */
	@Column(name = "VALID_UNTIL")
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
	@Column(name = "CHANGE_REASON", length = 10000)
	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

    @Column(name="EXPIRY_NOTIFIED")
	public Boolean getExpiryNotificationSent() {
		return expiryNotificationSent;
	}

	public void setExpiryNotificationSent(Boolean expiryNotificationSent) {
		this.expiryNotificationSent = expiryNotificationSent;
	}

	public Long getApplication() {
		return application;
	}

	public void setApplication(Long application) {
		this.application = application;
	}

}
