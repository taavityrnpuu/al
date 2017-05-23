package ee.agri.alkor.web.server;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;

import org.acegisecurity.ConfigAttribute;
import org.acegisecurity.ConfigAttributeDefinition;
import org.acegisecurity.intercept.web.FilterInvocation;
import org.acegisecurity.securechannel.SecureChannelProcessor;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class IdSecureChannelProcessor extends SecureChannelProcessor {

   private static final Logger logger = Logger.getLogger(IdSecureChannelProcessor.class);

   public void decide(FilterInvocation invocation, ConfigAttributeDefinition config) throws IOException, ServletException {
      Assert.isTrue((invocation!=null)&&(config!=null), "Nulls cannot be provided");

      Iterator iter=config.getConfigAttributes();
      while (iter.hasNext()) {
         ConfigAttribute attribute=(ConfigAttribute) iter.next();
         if (supports(attribute)) {
            getEntryPoint().commence(invocation.getRequest(), invocation.getResponse());
         }
      }
   }

   public boolean supports(ConfigAttribute attribute) {
      if ((attribute!=null)&&(attribute.getAttribute()!=null)&&attribute.getAttribute().equals(this.getSecureKeyword())) {
         return true;
      } else {
         return false;
      }
   }

}
