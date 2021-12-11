package com.filter;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Setfilter
 */
@WebFilter("/Setfilter")
public class SetFilter implements Filter {

    public SetFilter() {
        // TODO Auto-generated constructor stub
    } 
	public void destroy() {
		// TODO Auto-generated method stub
	} 
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
				final HttpServletRequest request=(HttpServletRequest)req;
				 
				HttpServletRequest hsr=(HttpServletRequest)Proxy.newProxyInstance(
						request.getClass().getClassLoader(), 
						request.getClass().getInterfaces(),
						new InvocationHandler() {
							@Override
							public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
								
								if("getParameter".equals(method.getName()))
								{
									String m = request.getMethod();
									if("get".equalsIgnoreCase(m))
									{
										String s =(String)method.invoke(request, args);
										s=new String(s.getBytes("iso8859-1"),"utf-8");
										return s;
									}
									
									if("post".equalsIgnoreCase(m))
									{
										request.setCharacterEncoding("utf-8");
										
									}
								}
								
								return method.invoke(request, args);
							}
						});
				
				chain.doFilter(hsr, response);
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
