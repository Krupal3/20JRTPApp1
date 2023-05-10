<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is index page of website</h1>
<h2>And design by krupal tasare</h2>
<% String name=(String)request.getAttribute("name"); %>
<h2>This dyanmic input from the backend<%= name%></h2>
</body>
</html>