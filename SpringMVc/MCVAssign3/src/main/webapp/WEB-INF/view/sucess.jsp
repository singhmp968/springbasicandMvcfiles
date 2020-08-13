<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${user.science}</h1>
<h1> ${user.maths }</h1>
<h1> ${user.english }</h1>
<h1>Total: ${user.science + user.maths  + user.english}</h1>
</body>
</html>