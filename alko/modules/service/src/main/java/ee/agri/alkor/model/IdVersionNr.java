package ee.agri.alkor.model;
/**
 * Return value for RegistryApplicaton 
 * save method.
 * 
 * @author suisalu
 *
 */
public class IdVersionNr 
	extends IdVersion {

	public IdVersionNr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdVersionNr(Long id, Long version, String nr) {
		super(id, version);
		this.nr = nr;
	}

	private String nr;

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}
}
