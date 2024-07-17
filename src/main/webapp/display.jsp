<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- DemoServlet.java & student.java -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello world
<%--
<%
String name_eg=request.getAttribute("namelabel").toString();
out.println(name_eg);
--%>
<%--${label} --%>
<%--${student.name} --%>
<!--<c:out value="Hi Roopa example for jstl add the library ${label}"  />-->
<c:forEach items="${student}" var="s">
${s} <br/>
${s.name } <br/>
</c:forEach>
${student}


</body>
</html> 