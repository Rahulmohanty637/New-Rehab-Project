<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<%@ page import="Model.Appointment"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
    <thead>
        <tr>
            <th>Appointment ID</th>
            <th>Patient Name</th>
            <th>Date</th>
            <th>Time</th>
        </tr>
    </thead>
    <tbody>
        <%
        List<Appointment> appointments = (List<Appointment>) request.getAttribute("appointment");
        if (appointments != null && !appointments.isEmpty()) {
            for (Appointment apt : appointments) {
        %>
        <tr>
            <td><%= apt.getAppointment_id() %></td>
            <td><%= apt.getPatient_name() %></td>
            <td><%= apt.getDate() %></td>
            <td><%= apt.getTime() %></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="4">You have no appointments.</td>
        </tr>
        <%
        }
        %>
    </tbody>
</table>

</body>
</html>