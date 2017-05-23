package ee.agri.alkor.util;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Helper class for accesing and initializing
 * Spring's application context.
 * 
 * @author suisalu
 *
 */
public class AppContextHelper {
	
	private static final String APP_CONTEXT_CONFIG_LOCATION = "applicationContext.xml";
	
	private final ListableBeanFactory beanFactory;
	
	/**
	 * CTOR.
	 * 
	 * @param factory ListableBeanFactory
	 */
	private AppContextHelper(ListableBeanFactory factory) {
		this.beanFactory = factory;
	}
	/**
	 * Factory method.
	 * 
	 * @return AppContextHelper
	 */
	public static AppContextHelper getInstance() {
		return getInstance(APP_CONTEXT_CONFIG_LOCATION);
				
	}

	/**
	 * Factory method.
	 * 
	 * @param contextResource String
	 * @return AppContextHelper
	 */
	public static AppContextHelper getInstance(String contextResource) {
		return new AppContextHelper(
				new ClassPathXmlApplicationContext(contextResource));
				
	}

	/**
	 * Returns configured bean.
	 * 
	 * @param name String - bean name.
	 * @return Object - bean.
	 * 
	 */
	public Object getBean(String name) {
		return this.beanFactory.getBean(name);
	}
}
