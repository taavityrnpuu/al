package ee.agri.alkor.model;

/**
 * 
 * @author suisalu
 *
 */
public class IdVersion implements IEntity {

	private Long id;
	
	private Long version;

	public IdVersion() {
		super();
	}
	
	public IdVersion(Long id, Long version) {
		super();
		this.id = id;
		this.version = version;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}
