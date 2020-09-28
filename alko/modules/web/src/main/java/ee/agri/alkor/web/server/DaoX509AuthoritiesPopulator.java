package ee.agri.alkor.web.server;

import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.AuthenticationException;

import org.springframework.security.core.userdetails.UserDetails;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.InitializingBean;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;

import org.springframework.util.Assert;

import ee.agri.alkor.service.IAuthenticationService;

import java.security.cert.X509Certificate;


/**
 * Populates the X509 authorities via an {@link org.springframework.security.core.userdetails.UserDetailsService}.
 *
 * @author Luke Taylor
 * @version $Id: DaoX509AuthoritiesPopulator.java,v 1.1.10.2.2.1 2017/04/20 07:30:08 karl Exp $
 */
public class DaoX509AuthoritiesPopulator implements InitializingBean, MessageSourceAware {
    //~ Static fields/initializers =====================================================================================

	   private static final Logger logger = Logger.getLogger(DaoX509AuthoritiesPopulator.class);

    //~ Instance fields ================================================================================================

    protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();
    private IAuthenticationService userDetailsService;

    //~ Methods ========================================================================================================

    public void afterPropertiesSet() throws Exception {
        Assert.notNull(userDetailsService, "An authenticationDao must be set");
        Assert.notNull(this.messages, "A message source must be set");

    }

    public UserDetails getUserDetails(X509Certificate clientCert)
        throws AuthenticationException {
        String subjectDN = clientCert.getSubjectDN().getName();
        String [] parts = subjectDN.split(",");
        parts = parts[0].split("=");
        
        String idCode = parts[1];

        
        return this.userDetailsService.loadUserByRegistrationId(idCode);
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messages = new MessageSourceAccessor(messageSource);
    }

	public IAuthenticationService getUserDetailsService() {
		return userDetailsService;
	}

	public void setUserDetailsService(IAuthenticationService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

}
