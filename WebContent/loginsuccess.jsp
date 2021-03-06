<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="navigate.html" %>
<h1 style="color: red; text-align: center;">Welcome User !!</h1> <br>
 <h2 style="text-align: center;"> <%= session.getAttribute("uname") %> </h2>
</body>
</html>