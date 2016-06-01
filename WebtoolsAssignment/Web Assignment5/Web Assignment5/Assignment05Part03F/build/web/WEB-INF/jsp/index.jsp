<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books MVC Application</title>
    </head>

    <body>
        <div class='container'>
            <form id='form' class='form-horizontal' action='addBook.htm' method='POST'>
                <h4>General Info:</h4>
                <% if (request.isUserInRole("admin")) { %>
                <div class='row' id='TextBoxesGroup'>

                    <div class='col-md-6'>
                        <div>
                            <div id='TextBoxDiv1'>
                                <h3>auth user</h3>
                                <label>How many books do you want to add? </label>
                                <input type='number' class='form-control' id='textbox1' required name="books" style='width:70px;'>&nbsp;<span id='errmsg'></span>
                            </div>
                        </div>
                    </div>
                    <input type='submit' class='btn btn-info' value='Submit Query' id='addButton'>
                </div>
                <% } else
                    {%>
                      <h3>Unauth user</h3>
                   <% } %>
                


            </form>
        </div>


    </body>
</html>
