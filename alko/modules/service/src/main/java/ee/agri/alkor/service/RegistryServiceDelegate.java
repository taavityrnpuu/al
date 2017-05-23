package ee.agri.alkor.service;

public class RegistryServiceDelegate {

	private IRegistryService service;

	public IRegistryService getService() {
		return service;
	}

	public void setService(IRegistryService service) {
		this.service = service;
	}
	
}
