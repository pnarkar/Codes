/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pranalinarkar
 */
public class MyFilter implements Filter {
    
    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
   
    public MyFilter() {
    }    
    
    

        // Write code here to process the request and/or response before
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log items on the request object,
        // such as the parameters.
        /*
	for (Enumeration en = request.getParameterNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    String values[] = request.getParameterValues(name);
	    int n = values.length;
	    StringBuffer buf = new StringBuffer();
	    buf.append(name);
	    buf.append("=");
	    for(int i=0; i < n; i++) {
	        buf.append(values[i]);
	        if (i < n-1)
	            buf.append(",");
	    }
	    log(buf.toString());
	}
         */
      
    
   
        // Write code here to process the request and/or response after
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log the attributes on the
        // request object after the request has been processed. 
        /*
	for (Enumeration en = request.getAttributeNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    Object value = request.getAttribute(name);
	    log("attribute: " + name + "=" + value.toString());

	}
         */
        // For example, a filter might append something to the response.
        /*
	PrintWriter respOut = new PrintWriter(response.getWriter());
	respOut.println("<P><B>This has been appended by an intrusive filter.</B>");
         */
    

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
             HttpServletRequest rq=(HttpServletRequest) request;
        HttpServletResponse rs=(HttpServletResponse) response;
         HttpSession session = rq.getSession();
        String ac=rq.getParameter("action");
       
          if(ac.equals("va")){
        String []title1=rq.getParameterValues("title");
        String []authors1=rq.getParameterValues("authors");
        
        int count = title1.length;
  
    String[] title = new String[count];
     int count1 = authors1.length;
  
    String[] authors = new String[count1];
     
    for (int i=0; i<count; i++) 
    {
      
      title[i] = title1[i].replaceAll("[^\\dA-Za-z]","").trim();
       authors[i] = authors1[i].replaceAll("[^\\dA-Za-z]","").trim();
      
    }
//     for (int i=0; i<count1; i++) 
//    {
//      
//     
//      
//    }
   
        
        session.setAttribute("title", title);
        session.setAttribute("authors", authors);
       
        
        
        }
       chain.doFilter(rq, rs);
       
      
    }

    /**
     * Return the filter configuration object for this filter.
     */
    

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    @Override
    public void init(FilterConfig filterConfig) {        
      
    }

    /**
     * Return a String representation of this object.
     */
   
}
