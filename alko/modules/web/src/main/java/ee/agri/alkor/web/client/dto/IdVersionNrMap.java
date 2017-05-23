package ee.agri.alkor.web.client.dto;

public class IdVersionNrMap 
	extends IdVersionMap {

	public static final String NR = "nr";

	public IdVersionNrMap() {
		super();
	}


	public IdVersionNrMap(Long id, Long version, String nr) {
		super(id, version);
		this.put(NR, nr);
	}

}
