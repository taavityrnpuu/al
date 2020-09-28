package ee.agri.alkor.service;

import ee.agri.alkor.util.AppContextHelper;

public class ServiceFactory {
	private static AppContextHelper appContext;
	
	public static IClassificatorService	getClassificatorService() {
		return ((ClassificatorServiceDelegate) getAppContext().getBean("classServiceDelegate")).getService();
	}
	
	public static IUserManagerService getUserManagerService() {
		return ((UserManagerServiceDelegate) getAppContext().getBean("userServiceDelegate")).getService();		 
	}
	
	public static IRegistryService getRegistryService() {
		return ((RegistryServiceDelegate) getAppContext().getBean("registryServiceDelegate")).getService();		 
	}
	
	public static IExternalService getExternalService() {
		return ((IExternalService) getAppContext().getBean("erService"));		 
	}
	
	private static AppContextHelper getAppContext() {
		if(appContext == null) {
			appContext = AppContextHelper.getInstance();
		}
		
		return appContext;
	}
}
