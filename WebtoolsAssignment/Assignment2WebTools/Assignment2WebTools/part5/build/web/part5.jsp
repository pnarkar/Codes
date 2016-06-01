<%-- 
    Document   : part5
    Created on : Feb 2, 2016, 8:22:28 PM
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
        <h3>Your Information</h3>
        <% String firstName=request.getParameter("name");
            String information=request.getParameter("Information");
            String address=request.getParameter("address");
            String City=request.getParameter("City,State,Zip");
            String phone=request.getParameter("phone");
            String Email=request.getParameter("Email");
            String AccountNumber=request.getParameter("AccountNumber");
            String Name1=request.getParameter("Name1");
            String Breed=request.getParameter("Breed");
            String Age=request.getParameter("Age");
            String Gender=request.getParameter("Gender");
            String describe=request.getParameter("describe");
            String type=request.getParameter("type");
            String futuretreatment=request.getParameter("futuretreatment");
            String amountclaim=request.getParameter("amountclaim");
            String injury=request.getParameter("illness/injury");
            String paymentto=request.getParameter("paymentto");
            String Sign=request.getParameter("Sign");
            String Date=request.getParameter("Date");
                                    %>
                                    
                                    
        <h1> <%=firstName%> </br></h1>
            <%=information%> </br>
            <%=City%> </br>
             <%=phone%></br>
              <%=address%></br>
               <%=AccountNumber%></br>
                <%=Name1%></br>
                 <%=Breed%></br>
                  <%=Gender%></br>
                   <%=Age%></br>
                    <%=describe%></br>
                     <%=type%></br>
                      <%=futuretreatment%></br>
                       <%=amountclaim%></br>
                       <%=injury%></br>
                       <%=paymentto%></br>
                       <%=Sign%></br>
                        <%=Date%>
                    
    </body>
</html>
