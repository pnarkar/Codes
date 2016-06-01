<%-- 
    Document   : add
    Created on : Feb 10, 2016, 4:20:22 PM
    Author     : pranalinarkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Please enter the detail below :</title>
    </head>
    <body>
        <form action='add.htm' method='post'>
                    Title : <input type ='text'  name ='title'
                                      ><br /><br />
                    Actor : <input type ='text' name ='actor' required 
                                      ><br /><br />
                    Actress : <input type ='text' name ='actress'required 
                                    ><br /><br />
                    Genre : <input type ='text' name ='genre' required  
                                      ><br /><br />
                    Year : <input type ='number' min="1000" max="2016" name ='year' required
                                      ><br /><br />
                    <input type="submit" value="Submit"> 
                    <input type="hidden" name="action" value="add1" />
                </form>    
    </body>
</html>

