<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    background-image:
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }
  
  .options {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }
  
  .option {
    width: 100%;
    max-width: 300px;
    margin: 10px 0;
    padding: 15px;
    border: 2px solid #3498db;
    border-radius: 5px;
    text-align: center;
    cursor: pointer;
    transition: background-color 0.3s, color 0.3s;
  }
  
  .option:hover {
    background-color: #3498db;
    color: #fff;
  }
</style>
</head>
<body>
<div class="options">
  <div class="option"><a href="Registration.jsp">Registration</a></div>
  <div class="option"><a href="login.jsp">Login</a></div>
</div>
</body>
</html>