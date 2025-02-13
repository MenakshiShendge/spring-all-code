<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
<form action="/employeepage" method="Post">
    <h1>Welcome, ${username}!</h1>
    <h1>Welcome, <%=session.getAttribute("username") %>!</h1>
    <p>You have successfully logged in.</p>
     <input type="submit" value="Employee Page">
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    </form>
    </body>
    </html>