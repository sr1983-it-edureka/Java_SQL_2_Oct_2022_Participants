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
@WebFilter("/DataCompressionFilter")
public class DataCompressionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DataCompressionFilter() {
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

		System.out.println("Data Compression Filter -> Called");
		
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		
		String username = httpRequest.getParameter("username");
		String password = httpRequest.getParameter("password");
		
		// Compression logic 

		String allParameters
			= "FNLFLDFKDFD:FJDFEFJ:EJE:J:ER:ERJEJRE:RJER:ER";
		
		httpRequest.setAttribute("ALL_PARAMS", allParameters);
		
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
