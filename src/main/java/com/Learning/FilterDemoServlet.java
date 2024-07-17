package com.Learning;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addAlien")
public class FilterDemoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("aid"));
		String name=req.getParameter("aname");
		resp.getWriter().println("welcome"+name+" Your id is "+id);
	}
	//http://localhost:8080/ServletDemo/Filterdemohome.jsp
	//validation i the IDFilter.java & NameFilter.java
	//In this class it comes and print if no error with validation
	//go to id filter and name filter and validate flterjsp runs first then comes to servlet now using thi/addalien everything happens

}
