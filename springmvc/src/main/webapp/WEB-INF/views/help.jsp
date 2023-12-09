<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
	<h1>This is help page</h1>
	<%-- <% String name = (String)request.getAttribute("name"); %>

	<h1>My name is <%=name %></h1> --%>
	<h1>My name is ${name }</h1>

	<hr>
	<%-- <c:forEach var="mark" items="${marks }">
		<h1>${mark }</h1>
	</c:forEach> --%>
</body>
</html>