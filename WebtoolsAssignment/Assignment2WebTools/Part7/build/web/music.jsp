<%-- 
    Document   : music.jsp
    Created on : Feb 1, 2016, 7:41:00 PM
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
        <h4>Music Shop</h4>
        
        <hr>
        <form action="controller" method="post">
        <input type="checkbox" name="music" value="Music 1|49">&nbsp;Music 1 [$49]</br></br>
        <input type="checkbox" name="music" value="Music 2|59">&nbsp;Music 2 [$59]</br></br>
        <input type="checkbox" name="music" value="Music 3|79">&nbsp;Music 3 [$79]</br></br>
        <input type="checkbox" name="music" value="Music 4|89">&nbsp;Music 4 [$89]</br></br>
        <input type="checkbox" name="music" value="Music 5|99">&nbsp;Music 5 [$99]</br></br>
        <input type="hidden" value="music" name="hidden">
        <input type="submit" value="Add to cart">
        </form>
    </body>
</html>
