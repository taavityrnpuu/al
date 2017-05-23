package ee.agri.alkor.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@MappedSuperclass
public abstract class ABaseBean implements IEntity, Serializable {

	private Integer version;
    /**
     * Property reference.
     */
    public static final String CREATED = "created";

    /**
     * Property reference.
     */
    public static final String CREATED_BY = "createdBy";

    /**
     * Property reference.
     */
    public static final String MODIFIED = "modified";

    /**
     * Property reference.
     */
    public static final String MODIFIED_BY = "modifiedBy";

    /**
     * The timestamp of the creation.
     */
    private Date created;

    /**
     * Creator user creditientials.
     */
    private String createdBy;

    /**
     * The timestamp of the modification.
     */
    private Date modified;

    /**
     * Modifier user creditientials.
     */
    private String modifiedBy;

    private Date deleted;

    private String deletedBy;

    @Version
    @Column(name="VERSION")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

    @Column(name="CREATED")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

    @Column(name="CREATED_BY", length=16)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


    @Column(name="MODIFIED")
	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

    @Column(name="MODIFIED_BY", length=16)
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


    @Column(name="DELETED")
	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

    @Column(name="DELETED_BY", length=16)
	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

}
