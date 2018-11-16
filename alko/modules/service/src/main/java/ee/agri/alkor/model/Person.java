package ee.agri.alkor.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name="PERSON")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Person extends ABaseBean implements IHistorical  {
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


	public Person() {
		super();
	}
    /**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSON_SEQ")
	@SequenceGenerator(
    name="PERSON_SEQ",
    sequenceName="PERSON_SEQ",
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
	 * @hibernate.property  column="NAME" length="128"
	 */
    @Column(name="LAST_NAME", length=64)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}

	@Column(name="FIRST_NAME", length=32)
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
	 * @hibernate.property  column="REG_CODE"
	 *
	 */
	@Column(name="REG_ID", length=16, unique=true)
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	@Column(name="OCCUPATION", length=60)
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
	
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName="
			+ firstName + ", registrationId=" + registrationId
			+ ", occupation=" + occupation + "]";
	}
}