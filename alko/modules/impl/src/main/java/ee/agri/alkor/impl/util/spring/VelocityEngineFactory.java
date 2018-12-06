package ee.agri.alkor.impl.util.spring;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

public class VelocityEngineFactory {
	protected final Logger LOGGER = Logger.getLogger(VelocityEngineFactory.class);
	private Resource configLocation;
	private final Map<String, Object> velocityProperties = new HashMap<String, Object>();
	private String resourceLoaderPath;
	private ResourceLoader resourceLoader = new DefaultResourceLoader();
	private boolean preferFileSystemAccess = true;
	private boolean overrideLogging = true;
	
	public void setConfigLocation(Resource configLocation) {
		this.configLocation = configLocation;
	}
	
	public void setVelocityProperties(Properties velocityProperties) {
		CollectionUtils.mergePropertiesIntoMap(velocityProperties, this.velocityProperties);
	}
	
	public void setVelocityPropertiesMap(Map<String, Object> velocityPropertiesMap) {
		if(velocityPropertiesMap != null) {
			this.velocityProperties.putAll(velocityPropertiesMap);
		}
	}
	
	public void setResourceLoaderPath(String resourceLoaderPath) {
		this.resourceLoaderPath = resourceLoaderPath;
	}
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	protected ResourceLoader getResourceLoader() {
		return this.resourceLoader;
	}
	
	public void setPreferFileSystemAccess(boolean preferFileSystemAccess) {
		this.preferFileSystemAccess = preferFileSystemAccess;
	}
	
	protected boolean isPreferFileSystemAccess() {
		return this.preferFileSystemAccess;
	}
	
	public void setOverrideLogging(boolean overrideLogging) {
		this.overrideLogging = overrideLogging;
	}
	
	public VelocityEngine createVelocityEngine() throws IOException, VelocityException {
		this.LOGGER.info("VelocityEngineFactory createVelocityEngine()");
		VelocityEngine velocityEngine = newVelocityEngine();
		Map<String, Object> props = new HashMap<String, Object>();
		if(this.configLocation != null) {
			this.LOGGER.info("Loading Velocity config from [" + this.configLocation + "]");
			CollectionUtils.mergePropertiesIntoMap(PropertiesLoaderUtils.loadProperties(this.configLocation), props);
		}
		
		this.LOGGER.info("VelocityEngineFactory velocityProperties merging");
		if(!this.velocityProperties.isEmpty()) {
			props.putAll(this.velocityProperties);
		}
		
		props.put("runtime.log", System.getProperty("catalina.base") + "/logs/velocity.log");
		
		this.LOGGER.info("VelocityEngineFactory resourceLoaderPath: " + this.resourceLoaderPath);
		if(this.resourceLoaderPath != null) {
			initVelocityResourceLoader(velocityEngine, this.resourceLoaderPath);
		}
		
		if(this.overrideLogging) {
			velocityEngine.setProperty("runtime.log.logsystem", new CommonsLoggingLogSystem());
		}
		
		for(Map.Entry<String, Object> entry : props.entrySet()) {
			LOGGER.info((String)entry.getKey() + ": " + entry.getValue());
			velocityEngine.setProperty((String)entry.getKey(), entry.getValue());
		}
		
		this.LOGGER.info("VelocityEngineFactory postProcess");
		postProcessVelocityEngine(velocityEngine);
		try {
			this.LOGGER.info("VelocityEngineFactory velocityEngine init");
			velocityEngine.init();
		} catch(IOException ex) {
			throw ex;
		} catch(VelocityException ex) {
			throw ex;
		} catch(RuntimeException ex) {
			throw ex;
		} catch(Exception ex) {
			this.LOGGER.error("Why does VelocityEngine throw a generic checked exception, after all?", ex);
			throw new VelocityException(ex.toString());
		}
		
		LOGGER.info("returning velocityEngine");
		return velocityEngine;
	}
	
	protected VelocityEngine newVelocityEngine() throws IOException, VelocityException {
		this.LOGGER.info("VelocityEngineFactory newVelocityEngine()");
		return new VelocityEngine();
	}
	
	protected void initVelocityResourceLoader(VelocityEngine velocityEngine, String resourceLoaderPath) {
		if(isPreferFileSystemAccess()) {
			try {
				this.LOGGER.info("VelocityEngineFactory resource Loader start");
				StringBuilder resolvedPath = new StringBuilder();
				String[] paths = StringUtils.commaDelimitedListToStringArray(resourceLoaderPath);
				for(int i = 0; i < paths.length; i++) {
					String path = paths[i];
					Resource resource = getResourceLoader().getResource(path);
					File file = resource.getFile();
					this.LOGGER.debug("Resource loader path [" + path + "] resolved to file [" + file.getAbsolutePath() + "]");
					
					resolvedPath.append(file.getAbsolutePath());
					if(i < paths.length - 1) {
						resolvedPath.append(',');
					}
				}
				
				velocityEngine.setProperty("resource.loader", "file");
				velocityEngine.setProperty("file.resource.loader.cache", "true");
				velocityEngine.setProperty("file.resource.loader.path", resolvedPath.toString());
			} catch(IOException ex) {
				this.LOGGER.debug("Cannot resolve resource loader path [" + resourceLoaderPath + "] to [java.io.File]: using SpringResourceLoader", ex);
				initSpringResourceLoader(velocityEngine, resourceLoaderPath);
			}
		} else {
			this.LOGGER.debug("File system access not preferred: using SpringResourceLoader");
			initSpringResourceLoader(velocityEngine, resourceLoaderPath);
		}
		this.LOGGER.info("VelocityEngineFactory resource loader end");
	}
	
	protected void initSpringResourceLoader(VelocityEngine velocityEngine, String resourceLoaderPath) {
		this.LOGGER.info("VelocityEngineFactory setting props");
		velocityEngine.setProperty("resource.loader", "spring");
		velocityEngine.setProperty("spring.resource.loader.class", ResourceLoader.class.getName());
		velocityEngine.setProperty("spring.resource.loader.cache", "true");
		velocityEngine.setApplicationAttribute("spring.resource.loader", getResourceLoader());
		velocityEngine.setApplicationAttribute("spring.resource.loader.path", resourceLoaderPath);
		this.LOGGER.info("VelocityEngineFactory setting props done");
	}
	
	protected void postProcessVelocityEngine(VelocityEngine velocityEngine) throws IOException, VelocityException {}
}