package ee.agri.alkor.xtee;

import org.apache.velocity.app.VelocityEngine;

import ee.agri.alkor.util.AppContextHelper;

public class ServiceFactory {

	private static VelocityEngine velocityEngine;

	public static IXteeServices
		getXteeServices() {
		return ((IXteeServices)AppContextHelper.getInstance("webserviceContext.xml").
        		getBean("xteeService"));
	}
	
	public static VelocityEngine getVelcityEngine() {
		if(velocityEngine == null)
			velocityEngine = ((VelocityEngine)AppContextHelper.getInstance("webserviceContext.xml").
        		getBean("velocityEngine"));
		return velocityEngine;
	}
}
