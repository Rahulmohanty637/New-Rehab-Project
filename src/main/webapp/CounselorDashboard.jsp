<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome, <%= session.getAttribute("counselorName") %>!</h1>
    
   
    <h2>Your Information:</h2>
    <ul>
        <li><strong>Name:</strong> <%= session.getAttribute("counselorName") %></li>
        <li><strong>Email:</strong> <%= session.getAttribute("counselorEmail") %></li>
        <li><strong>Qualifications:</strong> <%= session.getAttribute("qualifications") %></li>
        <li><strong>Specializations:</strong> <%= session.getAttribute("specializations") %></li>
        
    </ul>
    

    <h2>Actions:</h2>
    <ul>
        <form action="AppointmentServlet" method="post">
        <li>View Appointments 
        Enter Your Id:<input type="text" name="consumerid"> 
        <input type="submit" value="Appointments"></li>
        </form>
        <li><a href="WriteReports.jsp">Write Reports</a></li>
      
    </ul>
    

    <h2>Your Upcoming Appointments:</h2>
    <ul>
        <li><strong>Appointment 1:</strong> Date, time, patient</li>
        <li><strong>Appointment 2:</strong> Date, time, patient</li>
    </ul>
    
</body>
</html>