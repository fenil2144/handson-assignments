<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body>
	<form action="UpdateServlet" method="post">
	Password	<input type="text" name="password" value=${user.password}><br>
	Phone	<input type="text" name="phone" value=${user.phone}><br>
	<input type="submit" value="Update"><br>
	</form>
	
	<a href="DisplayAllDetails">Display All Users</a>
</body>
</html>