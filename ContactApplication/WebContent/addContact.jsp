<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Contact</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h3>Welcome ${profile.profileName}, Add contact to your Contact Book!</h3>
	<c:if test = "${contactName != null}">
         <p>Previous contact with name <c:out value = "${contactName}"/> has been saved!<p>
    </c:if>
	<div class="container">
  <form action="AddContactServlet" method="post">
    <div class="form-group">
      <label for="contactName">Contact Name:</label>
      <input type="text" class="form-control" id="contactName" placeholder="Enter Contact Name" name="contactName" required="required">
    </div>
    <div class="form-group">
      <label for="contactPhone">Contact Phone:</label>
      <input type="text" class="form-control" id="contactPhone" placeholder="Enter Contact Phone" name="contactPhone" required="required">
    </div>


    <button type="submit" class="btn btn-default">Add Contact</button>
  </form>
</div>

	
	<a href="editProfile.jsp">Edit profile</a>
	<a href="DisplayAllContacts">View Your Contact Book</a>
	<a href="DeleteProfile">Delete Your Profile</a>
	<a href="Logout">Logout</a>

</body>
</html>