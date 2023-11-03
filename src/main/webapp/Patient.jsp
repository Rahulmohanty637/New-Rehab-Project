<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style>
        /* CSS for card layout */
        .cards-container {
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .card {
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 20px;
            margin: 10px;
            width: 250px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            position: relative; /* Position relative for the circular logo */
            cursor: pointer;
        }
        .circular-logo {
            position: absolute; /* Position absolute for the circular logo */
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 100px;
            height: 100px;
            border-radius: 50%;
            background-color: #007bff;
            color: #fff;
            line-height: 100px;
            text-align: center;
        }
    </style>
</head>
<body>
	<h1>
		Welcome,
		<%=session.getAttribute("patientName")%>!
	</h1>


	<h2>Your Information:</h2>
	<ul>
		<li><strong>Name:</strong> <%=session.getAttribute("patientName")%></li>
		<li><strong>Email:</strong> <%=session.getAttribute("patientEmail")%></li>
		<li><strong>Medical History:</strong> <%=session.getAttribute("medicalHistory")%></li>

	</ul>


	<h2>Actions:</h2>
	<ul>
		<li>
		<form action="ProgramServlet" method="post">
		Enroll in a Program <input type="submit" value="Program">
		</form>
		</li>
		<li>
		<form action="LoginServlet" method="post">
		<a href="BookCounselingSession.jsp">Book a Counseling
				Session</a></form>
				
				</li>

	</ul>


	 <h2>Your Enrolled Programs and Appointments</h2>
     <div class="cards-container">
        <!-- Enrolled Programs Card -->
        <form action="EnrollInProgramServlet" method="post">
            <div class="card">
                <h3>Your Enrolled Programs</h3>
                <div class="circular-logo">
                    <!-- Add logo or text for the button -->
                    Button
                    <input type="submit">
                </div>
            </div>
        </form>

        <!-- Upcoming Appointments Card -->
        <a href="YourServletPageURL">
            <div class="card">
                <h3>Your Upcoming Appointments</h3>
                <div class="circular-logo">
                    <!-- Add logo or text for the button -->
                    Button
                </div>
            </div>
        </a>
    </div>

</body>
</html>