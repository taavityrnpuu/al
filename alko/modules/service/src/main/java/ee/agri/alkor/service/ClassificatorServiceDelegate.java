package ee.agri.alkor.service;

public class ClassificatorServiceDelegate {

	private IClassificatorService service;

	public IClassificatorService getService() {
		return service;
	}

	public void setService(IClassificatorService service) {
		this.service = service;
	}
	
}
