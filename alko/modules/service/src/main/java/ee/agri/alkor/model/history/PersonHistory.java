/**
 *
 */
package ee.agri.alkor.model.history;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.ContactInfo;

/**
 * Person History
 * @author kaupo
 *
 */
@Entity
@javax.persistence.SequenceGenerator(name = "PERSON_HIST_SEQ", sequenceName = "PERSON_HIST_SEQ", allocationSize=1)
@Table(name = "PERSON_HISTORY")
public class PersonHistory extends ABaseBean implements IHistoryEntity {

	private Long histId;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Pesooni perenimi.
     */
	private String lastName;

	/**
     * Eesnimi.
     */
	private String firstName;

	/**
     * Isikukood.
     */
	private String registrationId;

	/**
     * Ettevõtte esindaja ametikoht.
     */
	private String occupation;

	/**
     * Telefon, e-post, faks.
     */
	private ContactInfo contactInfo;

	public PersonHistory() {
		super();
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_HIST_SEQ")
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
     *
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
     * @hibernate.property column="NAME" length="128"
     */
	@Column(name = "LAST_NAME", length = 64)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	@Column(name = "FIRST_NAME", length = 32)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
     *
     * @return String
     *
     * @hibernate.property column="REG_CODE"
     *
     */
	@Column(name = "REG_ID", length = 16)
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	@Column(name = "OCCUPATION", length = 60)
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Embedded
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

}
