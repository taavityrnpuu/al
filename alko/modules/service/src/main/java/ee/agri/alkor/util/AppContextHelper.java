package ee.agri.alkor.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
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
	private static final Logger LOGGER = Logger.getLogger(AppContextHelper.class);
	
	private static final String APP_CONTEXT_CONFIG_LOCATION = "applicationContext.xml";
	
	private static Map<String, AppContextHelper> instances = new HashMap<String, AppContextHelper>();
	
	private final ListableBeanFactory beanFactory;
	
	/**
	 * CTOR.
	 * 
	 * @param factory ListableBeanFactory
	 */
	private AppContextHelper(ListableBeanFactory factory) {
		LOGGER.info(Arrays.toString(factory.getBeanDefinitionNames()));
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
		if(!instances.containsKey(contextResource)) {
			instances.put(contextResource, new AppContextHelper(new ClassPathXmlApplicationContext(contextResource)));
			LOGGER.info("instanciated: " + contextResource);
		}
		
		LOGGER.info(instances.toString());
		return instances.get(contextResource);
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
	
	public ListableBeanFactory getFactory() {
		return this.beanFactory;
	}
}
