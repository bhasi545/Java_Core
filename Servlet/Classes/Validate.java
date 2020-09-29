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
public class Validate extends HttpServlet {
	/* protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
            //creating a session
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            response.sendRedirect("Welcome");
        }
        
        request.getSession().invalidate();
        
        
    }
	**/
	/**
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
            Cookie ck = new Cookie("username", name);
            response.addCookie(ck);
            response.sendRedirect("Welcome");
        }
    } 
	
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        String name = request.getParameter("user");
	        String pass = request.getParameter("pass");
	        
	        if(pass.equals("1234"))
	        {
	            response.sendRedirect("Welcome?user_name="+ name);
	        }
	    }
	    
	  
	**/
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
	//getting value submitted in form from HTML file
        String user = request.getParameter("user");
        
        String lang = request.getParameter("lang");

        System.out.println("lang" + lang);
        //creating a new hidden form field
        out.println("<form action='Welcome'>");
        out.println("<input type='hidden' name='user' value='"+user+"'>");
        out.println("<input type='submit' value='submit' >");
        out.println("</form>");
    }
    
    
	 
	 
	
}
