<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged In Page</title>
</head>
<body>
	<h3>Welcome to User Management</h3>
	Hello ${user.username}!<br>
	<a href="updateDetails.jsp">Update Your Details</a>
	<a href="DisplayAllDetails">Display All Users</a>
	
</body>
</html>