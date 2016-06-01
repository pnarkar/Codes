<%-- 
    Document   : booksform
    Created on : Feb 17, 2016, 9:03:25 PM
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
      
        <form action="success.htm" method="post">  
        <table>
                 <tr>
                        <td>ISBN</td>
                        <td>Book Title</td>

                        <td>Authors</td>
                        <td>Price</td>
                    </tr>
                    <c:forEach begin="1" end="${requestScope.bc}">
                    <tr>
                        <td><input type = "text" name="isbn"/></td>
                        <td><input type = "text" name="title"/></td>
                        <td><input type = "text" name="authors"/></td>
                        <td><input type = "number" name="price"/></td>
                    </tr>
                   
</c:forEach>
 </table>
       <input type = "submit" value="Submit"/>
   <input type="hidden" name="action" value="multiple" />
        </form>
        
        
        
    </body>
</html>
