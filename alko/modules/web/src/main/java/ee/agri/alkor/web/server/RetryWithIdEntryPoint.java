package ee.agri.alkor.web.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.access.channel.RetryWithHttpsEntryPoint;
import org.apache.log4j.Logger;

public class RetryWithIdEntryPoint extends RetryWithHttpsEntryPoint {

	   private static final Logger logger = Logger.getLogger(RetryWithIdEntryPoint.class);

    public void commence(ServletRequest request, ServletResponse response)
    throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;

    String pathInfo = req.getPathInfo();
    String queryString = req.getQueryString();
    String contextPath = req.getContextPath();

    String redirectUrl = contextPath;

    Integer httpPort = new Integer(getPortResolver().getServerPort(req));
    if (logger.isDebugEnabled())
        logger.debug("requestPort: " + httpPort);
    Integer httpsPort = getPortMapper().lookupHttpsPort(httpPort);

    if (logger.isDebugEnabled())
        logger.debug("lookupHttpsPort is: " + httpsPort);

    if (httpsPort != null) {
        boolean includePort = true;

        if (httpsPort.intValue() == 443) {
            includePort = false;
        }

        redirectUrl = "https://" + req.getServerName() + ((includePort) ? (":" + httpsPort) : "") + contextPath + "/login?type=id";
    }

    if (logger.isDebugEnabled()) {
        logger.debug("Redirecting to: " + redirectUrl);
    }

    ((HttpServletResponse) response).sendRedirect(((HttpServletResponse) response).encodeRedirectURL(redirectUrl));
}

}
