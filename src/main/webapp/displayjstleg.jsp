<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- Function eg -->
<!-- JDBC EG -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='yellow'>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/SeveltExampleDB" user="root" password="roopa"/>
<sql:query var="rs"  dataSource="${db}"	>select * from Persons</sql:query>
<c:out value="${rs}"></c:out>
<br/>
See using for each to print person from db 
rows <c:forEach items="${rs.rows}" var="persos">
<c:out value="${persos.PersonID}"></c:out> : <c:out value="${persos.LastName}"></c:out> : <c:out value="${persos.FirstName}"></c:out>
<c:out value="${persos}"></c:out>
</c:forEach>
<br/>
Another example for set or functions
<c:set var="str" value="Roopa is a software developer"></c:set>
Length: ${fun:length(str)}<br/>
<c:forEach  items="${fun:split(str,' ')}" var="eg">
${eg}</br>
</c:forEach>
index : ${fun:indexOf(str,"software")}
is there /contains: ${fun:contains(str,"Java")}
is there /contains: ${fun:contains(str,"dev")}
<c:if test="${fun:contains(str,'dev')}">
The metioned word is there
</c:if>
end with functo: ${fun:endsWith(str,'dev')}
${fun:toUpperCase(str)}
</body>
</html>