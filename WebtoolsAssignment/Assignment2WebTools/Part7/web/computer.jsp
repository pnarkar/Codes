<%-- 
    Document   : computer.jsp
    Created on : Feb 1, 2016, 6:21:00 PM
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
        <h4>Shop for Computer</h4>
        
        <hr>
        <form action="controller" method="post">
        <input type="checkbox" name="computer" value="Mac Book Pro 13|1299">&nbsp;Mac Book pro with 13 [$1299]</br></br>
        <input type="checkbox" name="computer" value="Mac Book Pro 15|1599">&nbsp;Mac Book pro with 15 [$1599]</br></br>
        <input type="checkbox" name="computer" value="Dell Inspiron 13|799">&nbsp;Dell Inspiron 13 [$799] </br></br>
        <input type="checkbox" name="computer" value="Dell Inspiron 15|899">&nbsp;Dell Inspiron 15 [$899] </br></br>
        <input type="checkbox" name="computer" value="Sony Vaio E series|999">&nbsp; Sony Vaio E series [$999]</br></br>
        <input type="hidden" value="computer" name="hidden">
        <input type="submit" value="Add to cart">
        </form>
        
    </body>
</html>
