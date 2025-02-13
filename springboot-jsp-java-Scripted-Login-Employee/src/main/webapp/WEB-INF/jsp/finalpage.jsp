<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
table,
th,td{
border: 1px solid black;
        border-collapse: collapse;
}
</style>
    <title>Final Page</title>
</head>
<body>
<form action="/employeepage" method="POST">
<h1>Welcome ${username}</h1>
<h1>Welcome <%=session.getAttribute("username") %></h1>
    <h2>Employee Details</h2>

    <table style="width:20%">
    <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Salary</th>
        </tr>
        <tr>
            <td>${empid}</td>
            <td>${empname}</td>
            <td>${empsalary}</td>
        </tr>
    
    </table>

    <br>
    <jsp:useBean id="employee" class="com.cg.model.Employee" scope="request"/>
 
    <!-- Access the properties of 'employee' bean using jsp:getProperty -->
    <p>ID: <jsp:getProperty name="employee" property="id" /></p>
    <p>Name: <jsp:getProperty name="employee" property="name" /></p>
    <p>salary: <jsp:getProperty name="employee" property="salary" /></p>
    
    <p>New ID : ${employee.id}</p>
    <p>New Name : ${employee.name}</p>
    <p>New Salary : ${employee.salary}</p>
    
    <c:out value="List of Employees"/>
    <c:if test="${not empty employees}">
        <table style="width:20%">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
				
                <c:forEach var="employee" items="${employees}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.salary}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:if test="${empty employees}">
        <p>No employees found.</p>
    </c:if>
    <br>
    
     <input type="submit" value="Employee Details">
     
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    </form>
    </body>
    </html>