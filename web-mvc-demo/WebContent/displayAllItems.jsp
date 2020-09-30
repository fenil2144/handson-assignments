<%@ page import="java.util.*" %>
<%@ page import="com.hsbc.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Users</title>
</head>
<body>
<h3>User Management System</h3>
	<table border="1px solid black" style="border-collapse: collapse;">
	<tr>
		<th>Id</th>
		<th>User Name</th>
		<th>Phone</th>
	</tr>
      <% 
      List<User> userList = (List<User>)session.getAttribute("userList");
      
      for(User user : userList){
    	  
    	  out.println("<tr><td>"+user.getUserId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPhone()+"</td></tr>");
      }
    	  
    	%>
    	</table><br>
    <a href="login.html">Click here to Login</a><br>
	<a href="register.html">Click here to Register</a><br>
	<a href="updateDetails.jsp">Update Your Details</a>
</body>
</html>