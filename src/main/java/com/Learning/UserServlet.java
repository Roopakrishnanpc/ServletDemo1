package com.Learning;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//@WebServlet("/home")
//link to home.jsp, web.xml
//http://localhost:8081/ServletDemo/home
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("UserServlet Hi ");
		ServletContext servcontext=getServletContext();
		//ServletConfig servconfig=getServletConfig();
		String str=servcontext.getInitParameter("name");
		//String str=servconfig.getInitParameter("name");
		resp.getWriter().print(str);
		String valuename=servcontext.getInitParameter("Phone");
		//String valuename=servconfig.getInitParameter("phone");
		resp.getWriter().print(" "+valuename);
		//context-param for ServletContext - if differnt configuration there all shpuld be seperately mentioned in the servletconfig
		//init-param for ServletConfig -> Differnt servlet share differnt configuration, so u have to specify in the servlet itself inside init-param
		
	}

	
}
