<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>

<h1>${heading }</h1>
<p>${desc }</p>
<hr>

<h1>UserName : ${user.name }</h1>
<h1>Email : ${user.email }</h1>
<h1>Password : ${user.password }</h1>
<%-- <h1>UserName : ${name }</h1>
<h1>Email : ${email }</h1>
<h1>Password : ${password }</h1> --%>

</body>
</html>