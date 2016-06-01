<%-- 
    Document   : book.jsp
    Created on : Feb 1, 2016, 5:21:00 PM
    Author     : pranalinarkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4>Book Shop</h4>
        
        <hr>
        
        <form action="controller" method="post">
         </br>
        <input type="checkbox" name="book" value="Java EE|49" >Java EE [$49]</br></br>
        <input type="checkbox" name="book" value="Java SE|59" >Java SE [$59]</br></br>
        <input type="checkbox" name="book" value="Java Servlet|79" >Java Servlet [$79] </br></br>
        <input type="checkbox" name="book" value="Algorithms and Data Structure|89" >Algorithms and Data Structure [$89] </br></br>
        <input type="checkbox" name="book" value="Database Systems|99" >Database Systems [$99]</br></br>
        <input type="hidden" value="book" name="hidden">
        <input type="submit" value="Add to cart">
        </form>
    </body>
</html>
