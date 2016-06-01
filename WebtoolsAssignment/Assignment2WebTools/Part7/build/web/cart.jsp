<%-- 
    Document   : cart.jsp
    Created on : Feb 1, 2016, 5:51:00 PM
    Author     : pranalinarkar
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Items in cart</h1>
        <hr/>
        <form  action="controller" method="post">
        <table cellpadding ="15">
            <tr>
            <th>Name</th>
            <th>Cost</th>
            </tr>
        <c:forEach items="${sessionScope}" var="attr">
            <tr>
            <td>${attr.value.name}</td>
            <td>$ ${attr.value.price}</td>
            <td><a href="controller?name=${attr.value.name}">[Remove this Item]</a></td>
               
            </tr>
                   
        </c:forEach>
            
            <tr>
                <th>Total</th>
                <td>$ ${requestScope.price}</td>
            </tr>
           
        </table>
            
            <input type="hidden" value="remove"  name="hidden">
                
        </form>
    </body>
</html>
