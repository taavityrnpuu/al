package ee.agri.alkor.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.springframework.beans.factory.InitializingBean;

import ee.agri.alkor.model.history.IHistorical;

@Entity
@Table(name="SYS_USER")
public class SystemUser extends ABaseBean
	implements InitializingBean, IHistorical {
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

	private Person person;

	private Boolean active;
	
	private Set<UserGroup> groups = new HashSet();

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	@javax.persistence.SequenceGenerator(
    name="USER_SEQ",
    sequenceName="USER_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    /* (non-Javadoc)
	 * @see ee.agri.alkor.model.ISystemUser#getName()
	 */
    @Column(name="NAME", length=28, unique=true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Column(name="PASSWORD", length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.model.ISystemUser#getGroups()
	 */
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	public Set<UserGroup> getGroups() {
		return groups;
	}

	public void setGroups(Set<UserGroup> groups) {
		this.groups = groups;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.model.ISystemUser#getSubject()
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="PERSON_ID")
	@ForeignKey(name="FK_USER_PERSON")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person subject) {
		this.person = subject;
	}
	public void addGroup(UserGroup g) {
		this.getGroups().add(g);
		g.setUser(this);
	}
	public void removeGroup(UserGroup g) {
		this.getGroups().remove(g);
	}
	/**
	 * Checks if user belongs to group.
	 *
	 * @param systemGroupCode
	 * @return boolean
	 */
	public boolean hasGroup(String systemGroupCode) {
		boolean has = false;
		for(UserGroup g: this.getGroups()) {
			if(systemGroupCode.equals(g.getGroupClass().getCode()))
				has = true;
		}
		return has;
	}
    public void afterPropertiesSet() throws Exception {
		for(UserGroup g: this.getGroups()) {
			g.setUser(this);
		}

	}
	/**
	 * @return the active
	 */
    @Column(name="ACTIVE")
	public Boolean getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", person="
			+ person + ", active=" + active + ", pwdhash=" + password
			+ ", groups=" + Arrays.toString(groups.toArray()) + "]";
	}
    
}
