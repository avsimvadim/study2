package spring.testio.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestLoggerFilter implements Filter {
    private static final Logger LOG = Logger.getLogger(RequestLoggerFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("created RequestLoggerFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (!(servletRequest instanceof HttpServletRequest) || !(servletResponse instanceof HttpServletResponse)){

        } else {
            HttpServletRequest req = (HttpServletRequest)servletRequest;
            HttpServletResponse resp = (HttpServletResponse)servletResponse;
            LOG.info(String.format("User %s, request %s",
                    req.getSession().getAttribute("currentUserName"),
                    req.getRequestURL()));
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
