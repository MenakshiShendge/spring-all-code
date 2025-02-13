<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Failure</title>
</head>
<body>
    <h1>Login Failed</h1>
    <p style="color:red;">${error}</p>
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    </body>
    </html>