package ee.agri.alkor.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

    private static ThreadLocal<HttpServletRequest> localRequest = new ThreadLocal<HttpServletRequest>();
    
    private static String test = "";


    public static HttpServletRequest getRequest() {
        return localRequest.get();
    }

    public static HttpSession getSession() {
        HttpServletRequest request = localRequest.get();
        return (request != null) ? request.getSession() : null;
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    	SessionFilter.test = Math.random() + "";
        if (servletRequest instanceof HttpServletRequest) {
            localRequest.set((HttpServletRequest) servletRequest);
        }

        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            localRequest.remove();
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
