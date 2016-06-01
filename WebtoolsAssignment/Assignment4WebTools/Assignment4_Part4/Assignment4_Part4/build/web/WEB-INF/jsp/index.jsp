<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <form action="so.htm" method="get">
          <input type="text" name="filename" />


             <input type="submit" value="Submit" />            
 
           <input type="hidden" name="action" value="next" />
        </form>
        <form action="so1.htm" method="post">
   <table border="1">
         <tr>
                <th>SalesOrderID</th>
                <th>RevisionNumber</th>
                <th>OrderDate</th>
                <th>DueDate</th>
                <th>ShipDate</th>
                <th>Status</th>
                <th>OnlineOrderFlag</th>
                <th>SalesOrderNumber</th>
                <th>PurchaseOrderNumber</th>
                <th>AccountNumber</th>
                <th>CustomerID</th>
                <th>SalesPersonID</th>
                <th>TerritoryID</th>
                <th>BillToAddressID</th>
                <th>ShipToAddressID</th>
                <th>ShipMethodID</th>
                <th>CreditCardID</th>
                <th>CreditCardApprovalCode</th>
                <th>CurrencyRateID</th>
                <th>SubTotal</th>
                <th>TaxAmt</th>
                <th>Freight</th>
                <th>TotalDue</th>
                <th>Comment</th>
                <th>ModifiedDate</th>
                
            </tr>
     
                <c:forEach var="so1" items="${sessionScope.so}" >
                
                    
                    <tr>
                        <td><c:out value="${so1.salesOrderID}" /></td>
                          <td><c:out value="${so1.revisionNumber}" /></td>
                        <td><c:out value="${so1.orderDate}" /></td>
                        <td><c:out value="${so1.dueDate}" /></td>
                        <td><c:out value="${so1.shipDate}" /></td>
                        <td><c:out value="${so1.status}" /></td>
                        <td><c:out value="${so1.onlineOrderFlag}" /></td>
                        <td><c:out value="${so1.salesOrderNumber}" /></td>
                        <td><c:out value="${so1.purchaseOrderNumber}" /></td>
                        <td><c:out value="${so1.accountNumber}" /></td>
                        <td><c:out value="${so1.customerID}" /></td>
                        <td><c:out value="${so1.shipDate}" /></td>
                        <td><c:out value="${so1.salesPersonID}" /></td>
                        <td><c:out value="${so1.territoryID}" /></td>
                        <td><c:out value="${so1.billToAddressID}" /></td>
                        <td><c:out value="${so1.shipToAddressID}" /></td>
                        <td><c:out value="${so1.shipMethodID}" /></td>
                        <td><c:out value="${so1.creditCardID}" /></td>
                        <td><c:out value="${so1.creditCardApprovalCode}" /></td>
                        <td><c:out value="${so1.currencyRateID}" /></td>
                        <td><c:out value="${so1.subTotal}" /></td>
                        <td><c:out value="${so1.taxAmt}" /></td>
                        <td><c:out value="${so1.freight}" /></td>
                        <td><c:out value="${so1.totalDue}" /></td>
                        <td><c:out value="${so1.comment}" /></td>
                        <td><c:out value="${so1.modifiedDate}" /></td>


                    </tr>
                </c:forEach>
            </table>
 <input type="submit" name="submit1" value="MySQL">
         <input type="hidden" name="action" value="next1">     
        </form>
    </body>
</html>
