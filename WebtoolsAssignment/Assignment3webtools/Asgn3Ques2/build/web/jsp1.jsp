<%-- 
    Document   : jsp1
    Created on : Feb 11, 2016, 8:50:48 PM
    Author     : pranalinarkar
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String va = request.getParameter("number");
        session.setAttribute("number",va);
        %>
        <form action="Controller" method="get">  
        <table>
                 <tr>
                        <td>ISBN</td>
                        <td>Book Title</td>

                        <td>Authors</td>
                        <td>Price</td>
                    </tr>
                    <c:forEach begin="1" end="${param.number}">
                    <tr>
                        <td><input type = "text" name="isbn"  required pattern="(\d{3})([\-])(\d{3})([\-])(\d{3})"/></td>
                        <td><input type = "text" name="title" required  /></td>
                        <td><input type = "text" name="authors" required /></td>
                        <td><input type = "number" name="price" step="any" required/></td>
                    </tr>
                   
</c:forEach>
 </table>
               <input type = "submit" value="Submit"/>
               <input type="hidden" name="action" value="va"/>
        </form>
    </body>
</html>
