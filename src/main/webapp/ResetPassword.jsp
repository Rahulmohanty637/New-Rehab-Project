<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- reset_password.jsp -->
<form action="PasswordResetConfirmationServlet" method="post">
 <label for="usernameOrEmail">Email:</label>
    <input type="text" id="usernameOrEmail" name="usernameOrEmail" required>
    <label for="newPassword">New Password:</label>
    <input type="password" id="newPassword" name="newPassword" required>
    <input type="hidden" name="token" value="<%= request.getParameter("token") %>">
    <input type="submit" value="Reset Password">
</form>

</body>
</html>