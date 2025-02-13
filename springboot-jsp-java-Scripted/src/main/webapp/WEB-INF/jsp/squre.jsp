<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> <!-- declaration -->
<!DOCTYPE html>
<html>
<head>
<title>Spring Boot with JSP</title>
</head>
<body>
	<h1>Welcome to the Spring Boot JSP Hello</h1>
	
	<p>Message from client : Hello ${name}</p>
	<!-- JSP Scriptlet Tag (Executes Java Code directly in the JSP) -->
    <%
    	int number=Integer.parseInt(request.getParameter("number"));
        int numberSquared = (int)Math.pow(number, 2);
        out.print("This is demo of implecit object request para");
    %>
    <p>The square of ${number} is: <%= numberSquared %></p>
    <p>Todays date by passing parameter : ${CurrentDate}</p>
    <p>Todays date without passing parameter : <%=new java.util.Date() %></p>
</body>
</html>