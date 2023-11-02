<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="Model.Program"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Available Programs</h1>
    <ul>
        <%
        List<Program> enrolledPrograms = (List<Program>) request.getAttribute("programs");
        if (enrolledPrograms != null && !enrolledPrograms.isEmpty()) {
            for (Program program : enrolledPrograms) {
        %>
        <li><%= program.getProgram_id() %> - <%= program.getProgram_name() %>
            <form action="EnrollInProgramServlet" method="post">
                <input type="hidden" name="programId" value="<%= program.getProgram_id() %>">
                <label for="patientId">Patient ID:</label>
                <input type="text" id="patientId" name="patientId" required>
                <input type="submit" value="Enroll">
            </form>
        </li>
        <%
            }
        } else {
        %>
        <li>You are not enrolled in any programs.</li>
        <%
        }
        %>
    </ul>
</body>
</html>