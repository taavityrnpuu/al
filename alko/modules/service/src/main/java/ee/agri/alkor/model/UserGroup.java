package ee.agri.alkor.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.SystemGroup;
import ee.agri.alkor.model.history.IHistorical;

@Entity
@Table(name="USER_GROUP")
public class UserGroup extends ABaseBean
	implements IClassificatorAware, IHistorical {
    /**
     * The id of the entity.
     */
    private Long id;
    /**
     * Reference to  user.
     */
    private SystemUser user;
    /**
     * Rference to group classificator.
     */
    private SystemGroup groupClass;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_GRP_SEQ")
	@javax.persistence.SequenceGenerator(
    name="USER_GRP_SEQ",
    sequenceName="USER_GRP_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="USER_ID")
	@ForeignKey(name="FK_GROUP_USER")
	public SystemUser getUser() {
		return user;
	}
	public void setUser(SystemUser user) {
		this.user = user;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="GRP_CLASS_ID")
	@ForeignKey(name="FK_GROUP_CLASS")
	public SystemGroup getGroupClass() {
		return groupClass;
	}
	public void setGroupClass(SystemGroup groupClass) {
		this.groupClass = groupClass;
	}

}
