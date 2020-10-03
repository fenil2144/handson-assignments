<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<h2>Welcome to Login Page!</h2>
	<c:if test = "${profileId != null}">
         <p>Profile registered successfully with profile id : <c:out value = "${profileId}"/><p>
    </c:if>
<div class="container">
  <form action="LoginServlet" method="post">
    <div class="form-group">
      <label for="id">Profile Id:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter Profile Id" name="id" required="required">
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password" required="required">
    </div>

    <button type="submit" class="btn btn-default">Login</button>
  </form>
</div>
	
	
	<a href="register.html">Click here to Register</a>
</body>
</html>