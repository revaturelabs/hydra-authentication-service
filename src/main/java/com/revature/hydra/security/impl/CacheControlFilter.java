package com.revature.hydra.security.impl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletResponse;

/**
 * Prevents data from being cached in the browser. Now user cannot click back
 * button and see data after the session is expired or invalidated.
 * Still not fully tested after session is expired.
 * 
 * @author Patrick Walsh
 *
 */
public class CacheControlFilter implements Filter {	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;

		resp.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); 
		resp.addHeader("Cache-Control", "post-check=0, pre-check=0");
		resp.setHeader("Pragma","no-cache"); 
		resp.setDateHeader ("Expires", 0);
		chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// unused lifecycle method
	}

	@Override
	public void destroy() {
		// unused lifecycle method		
	}
}
