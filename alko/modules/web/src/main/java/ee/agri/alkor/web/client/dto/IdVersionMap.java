package ee.agri.alkor.web.client.dto;

public class IdVersionMap extends ABaseDTOMap {

	public IdVersionMap() {
		super();
	}

	public IdVersionMap(Long id, Long version) {
		super();
		this.put(ID, id);
		this.put(VERSION, version);
	}

}
