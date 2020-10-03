<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Profile</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:if test = "${message != null}">
         <p><c:out value = "${message}"/><p>
    </c:if>
<div class="container">

  <form action="DeleteProfileServlet" method="post">
    <div class="form-group">
      <label for="delete">Write delete in textbox to delete your profile & related data</label>
      <input type="text" class="form-control" id="delete" placeholder="Enter delete" name="delete" required="required">
    </div>


    <button type="submit" class="btn btn-default">Delete</button>
  </form>
 </div>
</body>
</html>