<%-- 
    Document   : AddBooks
    Created on : Feb 9, 2016, 1:05:00 AM
    Author     : darsh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mycss.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="success.htm" method="post">
        <table>
            <thead>
            <td>ISBN</td>
            <td>Book Title</td>
            <td>Authors</td>
            <td>Price</td>
            </thead>
            <c:forEach var="i" begin="1" end="${requestScope.quantity}">
            <tr>
                <td><input required="required" type="text" name="isbn${i}"/></td>
                <td><input required="required" type="text" name="title${i}"/></td>
                <td><input required="required" type="text" name="author${i}"/></td>
                <td><input required="required" type="text" name="price${i}"/></td>
            </tr>
            </c:forEach>
            <tfoot>
            <td><input type="submit" name="submit" id='submit' value="Add Books"/></td>
            </tfoot>
        </table>
            <input type="hidden" name="action" value="addbooks">  
        </form>
    </body>
</html>
