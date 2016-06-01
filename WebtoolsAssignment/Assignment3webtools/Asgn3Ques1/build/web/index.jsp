<%-- 
    Document   : index
    Created on : Feb 10, 2016, 3:56:14 PM
    Author     : pranalinarkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome To our Movie Store</title>
    </head>
    <body>
        <h3>Please make your Selection Below</h3>
        <form action='Login.htm' method='post'>
                    <select name="action">
  
  <option  value="browse">Browse Movies</option>
  <option  value="add">Add new movie</option>
</select>
                    
                    <input type="submit" value="Submit"> 
                    <input type="hidden" name="action" value="index" />
                </form> 
    </body>
</html>
