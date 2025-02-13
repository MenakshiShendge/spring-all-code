<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
    <h1>Welcome, ${username}!</h1>
    <p>You have successfully logged in.</p>
    <jsp:forward page="welcome.jsp" />
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    </body>
    </html>