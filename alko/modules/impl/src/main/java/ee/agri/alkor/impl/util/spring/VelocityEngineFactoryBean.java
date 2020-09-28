package ee.agri.alkor.impl.util.spring;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ResourceLoaderAware;

public class VelocityEngineFactoryBean extends VelocityEngineFactory
	implements FactoryBean<VelocityEngine>, InitializingBean, ResourceLoaderAware {
	protected final Logger LOGGER = Logger.getLogger(VelocityEngineFactoryBean.class);
	
	private VelocityEngine velocityEngine;
	
	public void afterPropertiesSet() throws IOException, VelocityException {
		LOGGER.info("before createVelocityEngine");
		this.velocityEngine = createVelocityEngine();
		LOGGER.info("after createVelocityEngine");
	}
	
	public VelocityEngine getObject() {
		LOGGER.info("returning engine");
		return this.velocityEngine;
	}
	
	public Class<? extends VelocityEngine> getObjectType() {
		LOGGER.info("returning engine class");
		return VelocityEngine.class;
	}
	
	public boolean isSingleton() {
		LOGGER.info("isSingleton");
		return true;
	}
}
