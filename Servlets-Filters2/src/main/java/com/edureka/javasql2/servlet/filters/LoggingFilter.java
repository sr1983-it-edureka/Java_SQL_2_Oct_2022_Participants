package com.edureka.javasql2.servlet.filters;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter("/LoggingFilter")
public class LoggingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Logging Filter -> Called...");
		String localAddrr = request.getLocalAddr();
		
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		
		Enumeration<String> headerNames = httpRequest.getHeaderNames();
		
		while (headerNames.hasMoreElements()) {
			
			String headerName  = headerNames.nextElement();
			
			String headerValue = httpRequest.getHeader(headerName);

//			System.out.println(headerName + "-" + headerValue);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
