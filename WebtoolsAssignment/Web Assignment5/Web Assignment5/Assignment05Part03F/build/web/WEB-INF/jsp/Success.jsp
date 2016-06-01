<%-- 
    Document   : Success
    Created on : Feb 11, 2016, 6:00:28 PM
    Author     : darsh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> <c:out value="${requestScope.counter}"></c:out> <p>Books added successfully!</p></h1>
        <a href='redirect.jsp'>Click here to go to main page</a>
    </body>
</html>
