/**
 *
 */
package ee.agri.alkor.model.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * SystemUser History
 * @author kaupo
 *
 */
@Entity
@Table(name = "SYS_USER_HISTORY")
@javax.persistence.SequenceGenerator(name = "USER_HIST_SEQ", sequenceName = "USER_HIST_SEQ", allocationSize = 1)
public class SystemUserHistory extends ABaseBean implements IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -4768853451373067431L;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Kasutaja nimi.
     */
	private String name;

	/**
     * Parool.
     */
	private String password;

	private Long person; //Person

	private Long histId;

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_HIST_SEQ")
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

	public void setId(Long id) {
		this.id = id;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.ISystemUser#getName()
     */
	@Column(name = "NAME", length = 28)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PASSWORD", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.ISystemUser#getSubject()
     */
	@Column(name="PERSON_ID")
	public Long getPerson() {
		return person;
	}

	public void setPerson(Long subject) {
		this.person = subject;
	}

}
