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
 * UserGroup History
 * @author kaupo
 *
 */
@Entity
@Table(name = "USER_GROUP_HISTORY")
@javax.persistence.SequenceGenerator(name = "USER_GRP_HIST_SEQ", sequenceName = "USER_GRP_HIST_SEQ", allocationSize = 1)
public class UserGroupHistory extends ABaseBean implements IHistoryEntity {

	/**
     *
     */
	private static final long serialVersionUID = 5508041170782008633L;

	private Long histId;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Reference to user.
     */
	private Long user; //SystemUser

	/**
     * Rference to group classificator.
     */
	private String groupClass; //SystemGroup

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_GRP_HIST_SEQ")
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

	@Column(name="USER_ID")
	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public String getGroupClass() {
		return groupClass;
	}

	public void setGroupClass(String groupClass) {
		this.groupClass = groupClass;
	}

}
