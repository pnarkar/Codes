<%-- 
    Document   : index
    Created on : Feb 11, 2016, 7:22:45 PM
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
        <h1>How many books do you want to add</h1>
          <form action='jsp1.jsp'>
                     <input type="text" name="number" required pattern="[0-9]" placeholder="Only number in here"/> 
                    
                    <input type="submit" value="Submit"/> 
                    <input type="hidden" name="action" value="index" />
                </form> 
    </body>
</html>
