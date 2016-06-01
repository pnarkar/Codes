<%-- 
    Document   : displaySalesOrders
    Created on : Feb 20, 2016, 12:25:00 AM
    Author     : pranalinarkar
--%>
Access-Control-Allow-Origin: *
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <title>Sales Orders</title>
    </head>
    <script>
        var countButton = 1;
        function getResults() {
            
            ++countButton;
            var f = $("#next-btn").attr("name");
            var xmlHttp;
            xmlHttp = GetXmlHttpObject();
            var abc = xmlHttp.readyState;
            alert(abc);
            if (xmlHttp == null)
            {
                alert("Your browser does not support AJAX!");
                return;
            }
            
            xmlHttp.onreadystatechange = function stateChanged()
            {
                if (xmlHttp.readyState == 4)
                {
                    var json = JSON.parse(xmlHttp.responseText);
                    if (json.salesOrders.length > 0) {
                        
                        for (var count = 0; count < json.salesOrders.length; count++) {
                            var x = document.createElement("tr");
                            x.setAttribute("id", "myTr"+countButton+"-" + count);
                            document.getElementById("tableBody").appendChild(x);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd1"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "SalesOrderID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "SalesOrderID");
                            z.setAttribute("value", json.salesOrders[count].salesOrderID);
                            document.getElementById("myTd1"+countButton+"-" + count).appendChild(z);
                            

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd2"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "RevisionNumber");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "RevisionNumber");
                            z.setAttribute("value", json.salesOrders[count].revisionNumber);
                            document.getElementById("myTd2"+countButton+"-" + count).appendChild(z);
                            
                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd3"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "OrderDate");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "OrderDate");
                            z.setAttribute("value", json.salesOrders[count].orderDate);
                            document.getElementById("myTd3"+countButton+"-" + count).appendChild(z);
                            
                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd4"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "DueDate");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "DueDate");
                            z.setAttribute("value", json.salesOrders[count].dueDate);
                            document.getElementById("myTd4"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd5"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "ShipDate");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "ShipDate");
                            z.setAttribute("value", json.salesOrders[count].shipDate);
                            document.getElementById("myTd5"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd6"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "Status");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "Status");
                            z.setAttribute("value", json.salesOrders[count].status);
                            document.getElementById("myTd6"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd7"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "OnlineOrderFlag");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "OnlineOrderFlag");
                            z.setAttribute("value", json.salesOrders[count].onlineOrderFlag);
                            document.getElementById("myTd7"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd8"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "SalesOrderNumber");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "SalesOrderNumber");
                            z.setAttribute("value", json.salesOrders[count].salesOrderNumber);
                            document.getElementById("myTd8"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd9"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "PurchaseOrderNumber");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "PurchaseOrderNumber");
                            z.setAttribute("value", json.salesOrders[count].purchaseOrderNumber);
                            document.getElementById("myTd9"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd10"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "AccountNumber");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "AccountNumber");
                            z.setAttribute("value", json.salesOrders[count].accountNumber);
                            document.getElementById("myTd10"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd11"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "CustomerID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "CustomerID");
                            z.setAttribute("value", json.salesOrders[count].customerID);
                            document.getElementById("myTd11"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd12"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "SalesPersonID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "SalesPersonID");
                            z.setAttribute("value", json.salesOrders[count].salesPersonID);
                            document.getElementById("myTd12"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd13"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "TerritoryID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "TerritoryID");
                            z.setAttribute("value", json.salesOrders[count].territoryID);
                            document.getElementById("myTd13"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd14"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "BillToAddressID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "BillToAddressID");
                            z.setAttribute("value", json.salesOrders[count].billToAddressID);
                            document.getElementById("myTd14"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd15"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "ShipToAddressID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "ShipToAddressID");
                            z.setAttribute("value", json.salesOrders[count].shipToAddressID);
                            document.getElementById("myTd15"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd16"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "ShipMethodID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "ShipMethodID");
                            z.setAttribute("value", json.salesOrders[count].shipMethodID);
                            document.getElementById("myTd16"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd17"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "CreditCardID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "CreditCardID");
                            z.setAttribute("value", json.salesOrders[count].creditCardID);
                            document.getElementById("myTd17"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd18"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "CreditCardApprovalCode");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "CreditCardApprovalCode");
                            z.setAttribute("value", json.salesOrders[count].creditCardApprovalCode);
                            document.getElementById("myTd18"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd19"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "CurrencyRateID");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "CurrencyRateID");
                            z.setAttribute("value", json.salesOrders[count].currencyRateID);
                            document.getElementById("myTd19"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd20"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "SubTotal");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "SubTotal");
                            z.setAttribute("value", json.salesOrders[count].subTotal);
                            document.getElementById("myTd20"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd21"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "TaxAmt");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "TaxAmt");
                            z.setAttribute("value", json.salesOrders[count].taxAmt);
                            document.getElementById("myTd21"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd22"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "Freight");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "Freight");
                            z.setAttribute("value", json.salesOrders[count].freight);
                            document.getElementById("myTd22"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd23"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "TotalDue");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "TotalDue");
                            z.setAttribute("value", json.salesOrders[count].totalDue);
                            document.getElementById("myTd23"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd24"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "Comment");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "Comment");
                            z.setAttribute("value", json.salesOrders[count].comment);
                            document.getElementById("myTd24"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd25"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "ModifiedDate");
                            z.setAttribute("type", "text");
                            z.setAttribute("class", "form-control");
                            z.setAttribute("name", "ModifiedDate");
                            z.setAttribute("value", json.salesOrders[count].modifiedDate);
                            document.getElementById("myTd25"+countButton+"-" + count).appendChild(z);
                            
                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd26"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "DueDate");
                            z.setAttribute("type", "button");
                            z.setAttribute("class", "btn btn-success save");
                            z.setAttribute("value", "Save");
                            document.getElementById("myTd26"+countButton+"-" + count).appendChild(z);

                            var y = document.createElement("td");
                            y.setAttribute("id", "myTd27"+countButton+"-" + count);
                            document.getElementById("myTr"+countButton+"-" + count).appendChild(y);
                            var z = document.createElement("input");
                            z.setAttribute("id", "ShipDate");
                            z.setAttribute("type", "button");
                            z.setAttribute("class", "btn btn-danger delete");
                            z.setAttribute("value", "Delete");
                            document.getElementById("myTd27"+countButton+"-" + count).appendChild(z);


                        }
                    }
                }
            };
            
            xmlHttp.open("POST", "fetchData.htm?action=nextPage&page="+countButton+"&records=10&fileName="+f, true);
            xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xmlHttp.send();
            return false;
        }
        
        function saveRecord(i) {
            
            var xmlHttp;
            xmlHttp = GetXmlHttpObject();
            alert(i.parentNode.parentNode.getElementsByTagName("td")[0].getElementsByTagName("input")[0].value);
            if (xmlHttp == null)
            {
                alert("Your browser does not support AJAX!");
                return;
            }
            
            var SalesOrderID = i.parentNode.parentNode.getElementsByTagName("td")[0].getElementsByTagName("input")[0].value;
            var RevisionNumber = i.parentNode.parentNode.getElementsByTagName("td")[1].getElementsByTagName("input")[0].value;
            var OrderDate = i.parentNode.parentNode.getElementsByTagName("td")[2].getElementsByTagName("input")[0].value;
            var DueDate = i.parentNode.parentNode.getElementsByTagName("td")[3].getElementsByTagName("input")[0].value;
            var ShipDate = i.parentNode.parentNode.getElementsByTagName("td")[4].getElementsByTagName("input")[0].value;
            var Status = i.parentNode.parentNode.getElementsByTagName("td")[5].getElementsByTagName("input")[0].value;
            var OnlineOrderFlag = i.parentNode.parentNode.getElementsByTagName("td")[6].getElementsByTagName("input")[0].value;
            var SalesOrderNumber = i.parentNode.parentNode.getElementsByTagName("td")[7].getElementsByTagName("input")[0].value;
            var PurchaseOrderNumber = i.parentNode.parentNode.getElementsByTagName("td")[8].getElementsByTagName("input")[0].value;
            var AccountNumber = i.parentNode.parentNode.getElementsByTagName("td")[9].getElementsByTagName("input")[0].value;
            var CustomerID = i.parentNode.parentNode.getElementsByTagName("td")[10].getElementsByTagName("input")[0].value;
            var SalesPersonID = i.parentNode.parentNode.getElementsByTagName("td")[11].getElementsByTagName("input")[0].value;
            var TerritoryID = i.parentNode.parentNode.getElementsByTagName("td")[12].getElementsByTagName("input")[0].value;
            var BillToAddressID = i.parentNode.parentNode.getElementsByTagName("td")[13].getElementsByTagName("input")[0].value;
            var ShipToAddressID = i.parentNode.parentNode.getElementsByTagName("td")[14].getElementsByTagName("input")[0].value;
            var ShipMethodID = i.parentNode.parentNode.getElementsByTagName("td")[15].getElementsByTagName("input")[0].value;
            var CreditCardID = i.parentNode.parentNode.getElementsByTagName("td")[16].getElementsByTagName("input")[0].value;
            var CreditCardApprovalCode = i.parentNode.parentNode.getElementsByTagName("td")[17].getElementsByTagName("input")[0].value;
            var CurrencyRateID = i.parentNode.parentNode.getElementsByTagName("td")[18].getElementsByTagName("input")[0].value;
            var SubTotal = i.parentNode.parentNode.getElementsByTagName("td")[19].getElementsByTagName("input")[0].value;
            var TaxAmt = i.parentNode.parentNode.getElementsByTagName("td")[20].getElementsByTagName("input")[0].value;
            var Freight = i.parentNode.parentNode.getElementsByTagName("td")[21].getElementsByTagName("input")[0].value;
            var TotalDue = i.parentNode.parentNode.getElementsByTagName("td")[22].getElementsByTagName("input")[0].value;
            var Comment = i.parentNode.parentNode.getElementsByTagName("td")[23].getElementsByTagName("input")[0].value;
            var ModifiedDate = i.parentNode.parentNode.getElementsByTagName("td")[24].getElementsByTagName("input")[0].value;
            
//            
//            
//            xmlHttp.onreadystatechange = function stateChanged()
//            {
//                if (xmlHttp.readyState == 4)
//                {
//                    var json = JSON.parse(xmlHttp.responseText);
//                    document.getElementByID("success").innerHTML = json.successmsg;
//                    
//                }
//                
//            };
            
            xmlHttp.open("POST", "insertData.htm?action=checkout&SalesOrderID="+SalesOrderID+"&RevisionNumber="+RevisionNumber+"&OrderDate="+OrderDate+"&DueDate="+DueDate+"&ShipDate="+ShipDate+"&Status="+Status+"&OnlineOrderFlag="+OnlineOrderFlag+"&SalesOrderNumber="+SalesOrderNumber+"&PurchaseOrderNumber="+PurchaseOrderNumber+"&AccountNumber="+AccountNumber+"&CustomerID="+CustomerID+"&SalesPersonID="+SalesPersonID+"&TerritoryID="+TerritoryID+"&BillToAddressID="+BillToAddressID+"&ShipToAddressID="+ShipToAddressID+"&ShipMethodID="+ShipMethodID+"&CreditCardID="+CreditCardID+"&CreditCardApprovalCode="+CreditCardApprovalCode+"&CurrencyRateID="+CurrencyRateID+"&SubTotal="+SubTotal+"&TaxAmt="+TaxAmt+"&Freight="+Freight+"&TotalDue="+TotalDue+"&Comment="+Comment+"&ModifiedDate="+ModifiedDate, true);
            xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xmlHttp.send();
            return false;
            
        }
        
        function GetXmlHttpObject()
        {
            var xmlHttp = null;
            try
            {
                // Firefox, Opera 8.0+, Safari
                xmlHttp = new XMLHttpRequest();
            } catch (e)
            {
                // Internet Explorer
                try
                {
                    xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e)
                {
                    xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                }
            }
            return xmlHttp;
        }
        
        
    </script>
    <body>
          
              
                  
        <h4 style="color: #285E8D"><b>Below is the data from the Sales Order table.</b></h4>
                  
                  <table class="table table-bordered">
                    <thead>
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
                        <th>Save</th>
                        <th>Delete</th>
                      </tr>
                    </thead>
                    <tbody id="tableBody">
                        <c:forEach var="salesOrder" items="${requestScope.salesOrders}" varStatus="loopCounter">
                        <tr id="rowNo${loopCounter.index}">
                        <td><input id="SalesOrderID" type="text" class="form-control" name="SalesOrderID" value="${salesOrder.salesOrderID}"/></td>
                        <td><input type="text" class="form-control" name="RevisionNumber" value="${salesOrder.revisionNumber}"/></td>
                        <td><input type="text" class="form-control" name="OrderDate" value="${salesOrder.orderDate}"/></td>
                        <td><input type="text" class="form-control" name="DueDate" value="${salesOrder.dueDate}"/></td>
                        <td><input type="text" class="form-control" name="ShipDate" value="${salesOrder.shipDate}"/></td>
                        <td><input type="text" class="form-control" name="Status" value="${salesOrder.status}"/></td>
                        <td><input type="text" class="form-control" name="OnlineOrderFlag" value="${salesOrder.onlineOrderFlag}"/></td>
                        <td><input type="text" class="form-control" name="SalesOrderNumber" value="${salesOrder.salesOrderNumber}"/></td>
                        <td><input type="text" class="form-control" name="PurchaseOrderNumber" value="${salesOrder.purchaseOrderNumber}"/></td>
                        <td><input type="text" class="form-control" name="AccountNumber" value="${salesOrder.accountNumber}"/></td>
                        <td><input type="text" class="form-control" name="CustomerID" value="${salesOrder.customerID}"/></td>
                        <td><input type="text" class="form-control" name="SalesPersonID" value="${salesOrder.salesPersonID}"/></td>
                        <td><input type="text" class="form-control" name="TerritoryID" value="${salesOrder.territoryID}"/></td>
                        <td><input type="text" class="form-control" name="BillToAddressID" value="${salesOrder.billToAddressID}"/></td>
                        <td><input type="text" class="form-control" name="ShipToAddressID" value="${salesOrder.shipToAddressID}"/></td>
                        <td><input type="text" class="form-control" name="ShipMethodID" value="${salesOrder.shipMethodID}"/></td>
                        <td><input type="text" class="form-control" name="CreditCardID" value="${salesOrder.creditCardID}"/></td>
                        <td><input type="text" class="form-control" name="CreditCardApprovalCode" value="${salesOrder.creditCardApprovalCode}"/></td>
                        <td><input type="text" class="form-control" name="CurrencyRateID" value="${salesOrder.currencyRateID}"/></td>
                        <td><input type="text" class="form-control" name="SubTotal" value="${salesOrder.subTotal}"/></td>
                        <td><input type="text" class="form-control" name="TaxAmt" value="${salesOrder.taxAmt}"/></td>
                        <td><input type="text" class="form-control" name="Freight" value="${salesOrder.freight}"/></td>
                        <td><input type="text" class="form-control" name="TotalDue" value="${salesOrder.totalDue}"/></td>
                        <td><input type="text" class="form-control" name="Comment" value="${salesOrder.comment}"/></td>
                        <td><input type="text" class="form-control" name="ModifiedDate" value="${salesOrder.modifiedDate}"/></td>
                        <td><input type="button" class="btn btn-success save"  value="Save"></td>
                        <td><input type="button" class="btn btn-danger delete"  value="Delete"></td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>
        
                  
                  <form name="choice-form" form id="search" onsubmit="return getResults();">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" name="${requestScope.fileName}" type="submit" id="next-btn" value="Load  More">
                      </div>
                          
                  </form>
                         
    </body>
    <script>
    $(".delete").click(function(){
        $(this).parent().parent().hide(); // this is the link element that was clicked
    });
    
    $(".save").click(function(){
        $(this).parent().parent().css("background-color", "#D4E075");
        $(this).parent().next().hide();// this is the link element that was clicked
        $(this).val("Saved");
        $(this).prop('disabled', true);
        $(this).parent().siblings().children().prop('disabled', true);
        saveRecord(this);
        //alert($(this).parent().parent().getElementByTagName('td').length);
    });
    
    
        
    
    </script>
</html>
