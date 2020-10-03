<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged In Page</title>
</head>
<body>
	<h3>Welcome to User Management</h3>
	Hello ${profile.profileName}!<br>
	<c:if test = "${message != null}">
         <p><c:out value = "${message}"/><p>
    </c:if>

	<a href="editProfile.jsp">Edit profile</a>
	<a href="addContact.jsp">Add New Contacts</a>
	<a href="DisplayAllContacts">View Your Contact Book</a>
	<a href="DeleteProfile">Delete Your Profile</a>
	<a href="Logout">Logout</a>
</body>
</html>