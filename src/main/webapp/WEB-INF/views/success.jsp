<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1> ${desc}</h1>
<h2 style="color:green">${msg }</h2>
<hr>
<h1>User Name is ${user.userName }</h1>
<h1>User EmailId is ${user.email }</h1>
<h1>User password is ${user.password }</h1>
<h1>Thanks for registration</h1>
</body>
</html>