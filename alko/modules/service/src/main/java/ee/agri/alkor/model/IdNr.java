package ee.agri.alkor.model;

import java.io.Serializable;

/**
 * Return value for RegistryApplicaton 
 * save method.
 * 
 * @author suisalu
 *
 */
public class IdNr  implements Serializable {

	private Long id;

	private String nr;
	
	public IdNr() {
		super();
	}

	public IdNr(Long id, String nr) {
		super();
		this.id = id;
		this.nr = nr;
	}


	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
