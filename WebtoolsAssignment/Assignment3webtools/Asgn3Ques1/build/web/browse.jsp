<%-- 
    Document   : browse
    Created on : Feb 10, 2016, 4:20:40 PM
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
        <h1>Searching Movies</h1>
        <FORM ACTION="browse.htm" METHOD="post">
            Keyword <input type ='text' name ='key' 
                                    ><br /><br />
             <INPUT TYPE="radio" NAME="radios" VALUE="title" CHECKED>
             Search by Title
            <BR>
            <INPUT TYPE="radio" NAME="radios" VALUE="Actor">
             Search by Actor
            <BR>
            <INPUT TYPE="radio" NAME="radios" VALUE="Actresses">
            Search by Actress
            <BR>
            <INPUT TYPE="submit" VALUE="Submit">
            <input type="hidden" name="action" value="browseAdd" />
        </FORM>
    </body>
</html>
