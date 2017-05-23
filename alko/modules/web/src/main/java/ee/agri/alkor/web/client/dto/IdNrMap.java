package ee.agri.alkor.web.client.dto;

public class IdNrMap 
	extends ABaseDTOMap {

	public static final String NR = "nr";

	public IdNrMap() {
		super();
	}


	public IdNrMap(Long id, String nr) {
		super();
		this.put(ID, id);
		this.put(NR, nr);
	}

}
