package ee.agri.alkor.xtee;

import org.apache.axis.utils.XMLUtils;
import org.apache.log4j.Logger;

public class Util {
	
	private static Logger LOGGER = Logger.getLogger(Util.class);
	
	 public static void LogMessage(String msgName, org.apache.axis.Message msg) {
	        try {
	            if (msg ==null ){           
	                return;
	            }else {
	                String s = XMLUtils.DocumentToString(
	                        msg.getSOAPEnvelope().getAsDocument());            
	                String hs = java.text.MessageFormat.format("{0} Message: Length={1}",
	                        new Object[] {msgName, new Integer(s.length())}
	                );         
	                LOGGER.info("LogMessage : " + hs);
	                LOGGER.info(hs);
	                LOGGER.info(s);
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	            LOGGER.info( msgName + " failed to log SOAP message.");
	        }
	    }

}
