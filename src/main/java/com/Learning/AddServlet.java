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

//Linked with sqservlet.java, index.html, web.xml
//http://localhost:8081/ServletDemo/index.html
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	//HTTPServlet has two more additional methods doGet and doPost
	//public void service(HttpServletRequest arg0, HttpServletResponse res) throws ServletException, IOException {
	public void doPost(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//shortcutOfRedirect(arg0, res);
		//shortcutOfRedirectUsingSession(arg0,res);
		shortcutOfRedirectUsingCookie(arg0,res);
	}
	public void doGet(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException{
		// TODO Auto-generated method stub
		shortcutOfReqDispatcher(arg0, res);
	}
	public void shortcutOfNormal(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		res.getWriter().println("result is:" +k);


	}
	public void shortcutOfReqDispatcher(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		arg0.setAttribute("k", k);
		//sq given in web.xml
		RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		rd.forward(arg0, res);
	}
	public void shortcutOfRedirect(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		//arg0.setAttribute("k", k);
		//sq given in web.xml
		//RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		//rd.forward(arg0, res);
		//?k => given data
		//URL Rewriting
		//res.sendRedirect("sq"+k);
		res.sendRedirect("sq?k="+k);
	}
	public void shortcutOfReqDispatcherUsingSession(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		HttpSession session=arg0.getSession();
		session.setAttribute("k", k);
		//sq given in web.xml
		RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		rd.forward(arg0, res);
	}
	public void shortcutOfRedirectUsingSession(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		//arg0.setAttribute("k", k);
		//sq given in web.xml
		//RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		//rd.forward(arg0, res);
		//?k => given data
		//URL Rewriting
		HttpSession session=arg0.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
	}
	public void shortcutOfReqDispatcherUsingCookie(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		//sq given in web.xml
		RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		rd.forward(arg0, res);
	}
	public void shortcutOfRedirectUsingCookie(HttpServletRequest arg0, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(arg0.getParameter("num1"));
		int j=Integer.parseInt(arg0.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is: " +k);
		//res.getWriter().println("result is:" +k);
		//arg0.setAttribute("k", k);
		//sq given in web.xml
		//RequestDispatcher rd=arg0.getRequestDispatcher("sq");
		//rd.forward(arg0, res);
		//?k => given data
		//URL Rewriting
		//"" is because Cookie key value, value is string
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		
		//session.setAttribute("k", k);
		res.sendRedirect("sq");
	}

	
	
}
