<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <form action="EditProfileServlet" method="post">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" required="required" value=${profile.profileName}>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter password" name="password" required="required" value=${profile.password}>
    </div>
    <div class="form-group">
      <label for="phone">Phone:</label>
      <input type="text" class="form-control" id="phone" placeholder="Enter Phone" name="phone" required="required"  value=${profile.phone}>
    </div>
    <div class="form-group">
      <label for="dob">Date of Birth:</label>
      <input type="text" class="form-control" id="dob" placeholder="Enter Date of Birth" name="dob" required="required" value=${profile.dob}>
    </div>

    <button type="submit" class="btn btn-default">Update</button>
  </form>
</div>
	
	<a href="AddContacts">Add New Contacts</a>
	<a href="ViewContacts">View Your ContactBook</a>
	<a href="DeleteProfile">Delete Your profile</a>
	<a href="Logout">Logout</a>
</body>
</html>