package com.Servlet.Classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 * Servlet implementation class AddServlet
 */
//@WebServlet("/AddServlet")
public class Welcome extends HttpServlet {
	 /** protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();
	        String user = (String)session.getAttribute("user");
	        
	        if( user != null)
	        	out.println("Hello "+user);
	        else 
	        	out.println("Sorry Logout due to Inctivity " );
	        
	    } **/
	 
	/** protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        Cookie[] cks = request.getCookies();
	        out.println("Welcome "+ cks[0].getValue());
	    }
	    
	 
	
	
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user_name");
        out.println("Welcome "+user);
    }
    
    
	**/ 
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //getting parameter from the hidden field
        String user = request.getParameter("user");
        out.println("Welcome "+user);
    }
    
    
	  
	  
	 
	 
	 
}
