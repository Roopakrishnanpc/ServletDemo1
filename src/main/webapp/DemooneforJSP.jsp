
<%-- 
    Document   : home
    Created on : 9 Jul 2024, 9:55:01 pm
    Author     : Roopa KRISHNAN
--%>
<%--Directive--%>
<%@page import="java.util.Scanner" errorPage="error.jsp"%>

<!-- ERROR.JSP INCLUDED TOP -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%--Declrative--%>
        <%! int i=1;
      
        %>
        <% out.print("Declrative eg : "+i);%>
        <%--Expression --%>
        Expression example<%= i%>
        <%--Scriptlet--%>
        
        <%
            out.println("Hello World"+7+5);
        %>
                <%
                try
                {
            int k=18/0;
                }
                catch(Exception e)
                {
                	out.print("Exceptio is"+e.getMessage());
                }
        %>
                        <%

            int k=18/0;
 
        %>
    </body>
</html>
