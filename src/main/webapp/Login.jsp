<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="LoginServlet" method="post">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" required><br>
		<br> <label for="password">Password:</label> <input
			type="password" id="password" name="password" required><br>
		<br> <label for="role">Role:</label> <select id="role"
			name="role" required onchange="toggleCounselorFields()">
			<option value="Patient">Patient</option>
			<option value="Counselor">Counselor</option>
		</select> <input type="submit" value="Login">
		<div ><a href="ResetPassword.jsp">Forgot Password</a></div>
	</form>
</body>
</html>