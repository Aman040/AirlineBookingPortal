<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home Page</title>
<style type="text/css">
button {
	poition:relative;
}
</style>
</head>
<body>
<%@ include file="navigate.html" %>
<h1 style="color: red; text-align: center;">Welcome Admin !!</h1>
 <h2 style="text-align: center;"> <%= session.getAttribute("uname") %> </h2><br><br><br>
 <input type="button" onclick="document.location.href='source_destination_list.jsp'" value="List Source & Destination" style="color: red; width: 415px; height: 300px;">
 <input type="button" onclick="document.location.href='airline_list.jsp'" value="List Airlines" style="color: red; width: 495px; height: 300px;">
 <input type="button" onclick="document.location.href='flight_details.jsp'" value="List Flight Details" style="color: red; width: 415px; height: 300px;">
</body>
</html>