<%-- 
    Document   : UserView
    Created on : 6 Feb, 2016, 3:17:06 PM
    Author     : Kiran
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User View</title>
    </head>
    <body>
        
        <table>
            <tr>
                <th>Title</th>
                <th>Actor</th>
                <th>Actress</th>
                <th>Year</th>
                <th>Genre</th>
            </tr>
            
        <c:forEach var="message" items="${sessionScope.messageList}">
            <tr>
                <td><c:out value="${message.title}"></c:out></td>
                <td><c:out value="${message.actor}"></c:out></td>
                
                <td><c:out value="${message.actresses}"></c:out></td>
                <td><c:out value="${message.year}"></c:out></td>
                <td><c:out value="${message.genere}"></c:out></td>
                
            </tr>
        </c:forEach>
        </table>
     <a href="index.jsp" >Click here to go back to main page</a></br></br>
    </h1>

</body>
</html>
