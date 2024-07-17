<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<!-- JDBC Example-->
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String url="jdbc:mysql://localhost:3306/SeveltExampleDB";
String username="root";
String password="roopa";
String sql="select * from Persons where PersonID=1";
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection(url,username, password);
Statement s=conn.createStatement();
ResultSet rs=s.executeQuery(sql);
rs.next();


%>

PersonID: <%= rs.getString(1) %>
LastName: <%= rs.getString(2) %>
FirstName: <%= rs.getString(3) %>
</body>
</html>