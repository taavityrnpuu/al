/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.agri.alkor.web.server;

import org.acegisecurity.AcegiMessageSource;
import org.acegisecurity.AuthenticationException;

import org.acegisecurity.providers.x509.X509AuthoritiesPopulator;

import org.acegisecurity.userdetails.UserDetails;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.InitializingBean;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;

import org.springframework.util.Assert;

import ee.agri.alkor.service.IAuthenticationService;

import java.security.cert.X509Certificate;


/**
 * Populates the X509 authorities via an {@link org.acegisecurity.userdetails.UserDetailsService}.
 *
 * @author Luke Taylor
 * @version $Id: DaoX509AuthoritiesPopulator.java,v 1.1.10.2.2.1 2017/04/20 07:30:08 karl Exp $
 */
public class DaoX509AuthoritiesPopulator implements X509AuthoritiesPopulator, InitializingBean, MessageSourceAware {
    //~ Static fields/initializers =====================================================================================

	   private static final Logger logger = Logger.getLogger(DaoX509AuthoritiesPopulator.class);

    //~ Instance fields ================================================================================================

    protected MessageSourceAccessor messages = AcegiMessageSource.getAccessor();
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
