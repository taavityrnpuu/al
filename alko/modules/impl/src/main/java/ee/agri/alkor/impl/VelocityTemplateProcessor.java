package ee.agri.alkor.impl;

import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.VelocityContext;

public class VelocityTemplateProcessor {

	public VelocityTemplateProcessor() {
		super();
	}

	public static VelocityTemplateProcessor getInstance() 
	{
		Properties props = new Properties();
		props.put(RuntimeConstants.ENCODING_DEFAULT, "UTF-8");
		props.put("runtime.log", System.getProperty("catalina.base") + "/logs/velocity.log");
		props.put("resource.loader", "class");
		props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		try {
		   Velocity.init(props);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		   VelocityTemplateProcessor processor = new VelocityTemplateProcessor();
		   return processor;
	}
	
	String merge(String template, Map params) {
        VelocityContext context = new VelocityContext();

        for(Iterator it = params.keySet().iterator();it.hasNext();) {
        	String key = (String)it.next(); 
        	 context.put(key, params.get(key));
        }

        StringWriter w = new StringWriter();

        try {
        	Velocity.mergeTemplate(template, "UTF-8", context, w );
        } catch(Exception e) {
        	throw new RuntimeException(e);
        }
		return w.toString();
	}
	
	public String evaluate(Reader is, Map params) {
        VelocityContext context = new VelocityContext();

        for(Iterator it = params.keySet().iterator();it.hasNext();) {
        	String key = (String)it.next(); 
        	 context.put(key, params.get(key));
        }

        StringWriter w = new StringWriter();

        try {
        	Velocity.evaluate(context, w, "velocity",  is);
        } catch(Exception e) {
        	throw new RuntimeException(e);
        }
		return w.toString();
	}

}
