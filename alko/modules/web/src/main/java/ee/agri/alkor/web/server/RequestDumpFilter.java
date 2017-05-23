package ee.agri.alkor.web.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * ServletFilter for dumping request attributes.
 *
 * @author ivar suisalu
 *
 */
public class RequestDumpFilter implements Filter {

 
    /**
     * The filter method of defined filter. (see web.xml)
     *
     * @param request The servlet request to be processed
     * @param response The servlet response to be created
     * @param chain The filter chain to be processed
     *
     * @throws IOException if an input/output error occurs
     * @throws ServletException if a servlet error occurs
     */
    public void doFilter(
            final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

            Enumeration reqs = request.getParameterNames();
            while (reqs.hasMoreElements()) {
                String parName = (String) reqs.nextElement();
                System.out.println("param: " + parName + " value: " + request.getParameter(parName));
            }
            reqs = request.getAttributeNames();
             
              while (reqs.hasMoreElements()) {
                String parName = (String) reqs.nextElement();
                System.out.println("attr: " + parName + " value: " + request.getAttribute(parName));
              }
              /*
              InputStream is = request.getInputStream();
              
              InputStreamReader isr = new InputStreamReader(is);
              int c = 0;
              StringBuffer sb = new StringBuffer();
              while((c = isr.read()) > 0) {
            	  sb.append((char)c);
              }
              System.out.println("stream: " + sb.toString());*/
              
        chain.doFilter(request, response);
    }

    /**
     * Overridden method.
     */
    public void destroy() {
    }

    /**
     * Overridden method.
     *
     * @param filterConfig the filter config
     * @throws ServletException the servlet exception to be thrown
     */
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}