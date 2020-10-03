<%@ page import="java.util.*" %>
<%@ page import="com.hsbc.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Users</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h3>User Management System</h3>
	<table class="table table-hover">
	<tr>
		<th>Id</th>
		<th>Contact Name</th>
		<th>Contact Phone</th>
		<th>Edit </th>
		<th> Delete </th>
	</tr>
	<c:forEach items="${contactList}" var="c">
		<tr>
			<td>${c.contactId}</td>
			<td>${c.contactName}</td>
			<td>${c.contactPhone}</td>
			<td><a href="EditContactServlet?editId=${c.contactId }">Edit</a>
			<td><a href="DeleteContactServlet?deleteId=${c.contactId }">Delete</a>
		</tr>
	</c:forEach>

    	</table><br>
	<a href="editProfile.jsp">Edit profile</a>
	<a href="addContact.jsp">Add New Contacts</a>
	<a href="DeleteProfile">Delete Your Profile</a>
	<a href="Logout">Logout</a>
</body>
</html>