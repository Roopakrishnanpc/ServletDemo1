package com.Learning;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//Linked with add.jsp, Addservlet.java, web.xml, index.html
//http://localhost:8081/ServletDemo/index.html then comes to addservlet to sqservlet
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
//this method is executed
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//shortcutOfRedirectUsingSession(req,resp);
		shortcutOfRedirectUsingCookie(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	int i=Integer.parseInt(req.getParameter("num1"));
	//	int j=Integer.parseInt(req.getParameter("num1"));
		
	    //int k=i+j;
		int k=(int)req.getAttribute("k");
		//java.lang is default
		int result =(int)Math.sqrt(k);
		resp.getWriter().println("The result for SQ Request dispatcher" +result);		
	}
	public void shortcutOfReqDispatcher(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			
		    //int k=i+j;
			int k=(int)arg0.getAttribute("k");
			//java.lang is default
			int result =(int)Math.sqrt(k);
			res.getWriter().println("The result for SQ Request dispatcher" +result);
	}
	public void shortcutOfRedirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			//	int k=i+j;
			int k=(int)req.getAttribute("k");
			//java.lang is default
			int result =(int)Math.sqrt(k);
			resp.getWriter().println("The result for SQ " +result);
	}
	public void shortcutOfReqDispatcherUsingSession(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			
		    //int k=i+j;
			//int k=(int)arg0.getAttribute("k");
			//java.lang is default
			HttpSession session=arg0.getSession();
			int k=(int) (session.getAttribute("k"));
			int result =(int)Math.sqrt(k);
			res.getWriter().println("The result for SQ Request dispatcher using session" +result);
	}
	public void shortcutOfRedirectUsingSession(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			//	int k=i+j;
			//int k=(int)req.getAttribute("k");
			//java.lang is default
			//int result =(int)Math.sqrt(k);
			//resp.getWriter().println("The result for SQ " +result);
			HttpSession session=arg0.getSession();
			int k=(int) (session.getAttribute("k"));
			int result =(int)Math.sqrt(k);
			res.getWriter().println("The result for SQ for redirect using session " +result);
			session.removeAttribute("k");
	}
	public void shortcutOfReqDispatcherUsingCookie(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			
		    //int k=i+j;
			//int k=(int)arg0.getAttribute("k");
			//java.lang is default
			//HttpSession session=arg0.getSession();
			//int k=(int) (session.getAttribute("k"));
			int k=0;
			Cookie[] cookie=arg0.getCookies();
			for(Cookie i:cookie)
			{
				if(i.getName().equals("k"));
					k=Integer.parseInt(i.getValue());
			}
			int result =(int)Math.sqrt(k);
			res.getWriter().println("The result for SQ Request dispatcher using Cookie" +result);
	}
	public void shortcutOfRedirectUsingCookie(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		//	int i=Integer.parseInt(req.getParameter("num1"));
		//	int j=Integer.parseInt(req.getParameter("num1"));
			//	int k=i+j;
			//int k=(int)req.getAttribute("k");
			//java.lang is default
			//int result =(int)Math.sqrt(k);
			//resp.getWriter().println("The result for SQ " +result);
			int k=0;
			Cookie cookie[]=arg0.getCookies();
			Cookie cookie[] = arg0.getCookies(); // Retrieves an array of cookies from the HTTP request
			for (Cookie i : cookie) { // Iterates over each cookie in the array
			    if (i.getName().equals("k")) // Checks if the name of the cookie is "k"
			        k = Integer.parseInt(i.getValue()); // Converts the value of the cookie to an integer and assigns it to the variable 'k'
			}

			int result =(int)Math.sqrt(k);
			res.getWriter().println("<html><body bgcolor='red'>");
			res.getWriter().println("The result for SQ for redirect using Cookie " +result);
			//session.removeAttribute("k");
	}

	
}
