<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books MVC Application</title>
    </head>

    <body>
        <h1>How many books do you want to add?</h1><br/>
        <form action="addbooks.htm" method="post">
            <input type="number" name="quantity" min="1" max="10" required="required">
        <input type="submit" value="Submit">
        <input type="hidden" name="action" value="quantity">
        </form>
    </body>
</html>
