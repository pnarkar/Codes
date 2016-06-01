<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/tlds/custom.tld" prefix="j" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
    <c:choose>
        <c:when test="${!empty requestScope.count2}">
        <p style="color:red;"> ${requestScope.count2} records  inserted successfully!!!! </p>
        </c:when>
        <c:otherwise>
            <j:printRecord csv="SalesOrder" id="1"></j:printRecord>  
        </c:otherwise>
    </c:choose>
   
    
</body>
</html>
