<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
	 <form action="/employeepage" method="POST">
    <h1>Welcome ${username} to Employee page</h1>
    <h1>Welcome <%=session.getAttribute("username") %> to Employee page</h1>
    <label for="empid">Employee Id:</label>
    <input type="text" id="empid" name="empid" required ><br><br>
    
    <label for="empname">Employee Name:</label>
    <input type="text" id="empname" name="empname" required><br><br>
    
    <label for="empsalary">Employee Salary:</label>
    <input type="text" id="empsalary" name="empsalary" required><br><br>
    
    <input type="submit" value="Information Page">
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    </form>
    </body>
    </html>