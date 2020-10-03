<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conatct Application</title>
</head>
<body>
	<c:if test = "${message != null}">
         <p><c:out value = "${message}"/><p>
    </c:if>
    
	<h2>Welcome to Contact Application</h2>
	<a href="login.jsp">Click here to Login</a><br>
	<a href="register.html">Click here to Register</a>

</body>
</html>