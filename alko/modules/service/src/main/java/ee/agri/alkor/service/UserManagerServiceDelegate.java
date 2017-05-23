package ee.agri.alkor.service;

public class UserManagerServiceDelegate {

	private IUserManagerService service;

	public IUserManagerService getService() {
		return service;
	}

	public void setService(IUserManagerService service) {
		this.service = service;
	}
	
}
