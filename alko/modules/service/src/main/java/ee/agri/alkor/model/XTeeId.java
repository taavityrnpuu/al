package ee.agri.alkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xtee_id")
public class XTeeId {
	/**
	 * The id of the entity.
	 */
	private String id;

	private String registryCode;
	private String representativeName;
	private String representativePersonalCode;
	private Date created;
	private String representativeOccupation;

	@Id
	@Column(name = "ID", length = 40)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CODE")
	public String getRegistryCode() {
		return registryCode;
	}

	public void setRegistryCode(String registryCode) {
		this.registryCode = registryCode;
	}

	@Column(name = "REPR_CODE")
	public String getRepresentativePersonalCode() {
		return representativePersonalCode;
	}

	public void setRepresentativePersonalCode(String representativePersonalCode) {
		this.representativePersonalCode = representativePersonalCode;
	}

	@Column(name = "REPR_NAME")
	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "CREATED")
	public Date getCreated() {
		return created;
	}
	
	@Column(name = "REPR_OCCUPATION")
	public String getrepresentativeOccupation()
	{
		return representativeOccupation;
	}
	
	public void setrepresentativeOccupation(String representativeOccupation)
	{
		this.representativeOccupation = representativeOccupation;
	}

	public String toString() {
		return "XTeeId [registryCode=" + registryCode + ", representativeName="
				+ representativeName + ", representativePersonalCode="
				+ representativePersonalCode + ", created=" + created
				+ ", representativeOccupation=" + representativeOccupation
				+ "]";
	}
}
