
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
        <link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" type="text/css"/>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <title>Sales Orders</title>
    </head>
    <script>
        
        
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
            
            
            
            xmlHttp.onreadystatechange = function stateChanged()
            {
                if (xmlHttp.readyState == 4)
                {
                    var json = JSON.parse(xmlHttp.responseText);
                    document.getElementByID("success").innerHTML = json.successmsg;
                    
                }
                
            };
            
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
        <script>
                $(document).ready(function() { 
                    var i = parseInt($("#next-btn1").val().substring(5));
                    var f = $("#next-btn1").attr("name");
                    
                    $("#currentPage").val("Page#"+(i-1));
                    
                    $("#next-btn2").val("Page#"+(i+1));
                    $("#form2").attr("action", "fetchData.htm?action=nextPage&page="+(i+1)+"&records=10&fileName="+f);
                    $("#next-btn3").val("Previous");
                    $("#form3").attr("action", "fetchData.htm?action=nextPage&page="+(i-2)+"&records=10&fileName="+f);
                });
            
        </script>
              
              
                  
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
                    <tbody>
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
        
                 
                  <span style="display: inline;">
                  <form style="float: left;" id="form3" name="choice-form" action="fetchData.htm?action=nextPage&page=${requestScope.pageNo}&records=10&fileName=${requestScope.fileName}" method="post">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="next-btn3" value="Page#${requestScope.pageNo}">
                      </div>
                          
                  </form>
                  <form style="float: left;" name="choice-form" action="fetchData.htm?action=nextPage&page=${requestScope.pageNo}&records=10&fileName=${requestScope.fileName}" method="post">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="currentPage" disabled>
                  </div>
                          
                  </form>
                  <form style="float: left;" name="choice-form" action="fetchData.htm?action=nextPage&page=${requestScope.pageNo}&records=10&fileName=${requestScope.fileName}" method="post">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="next-btn1" name="${requestScope.fileName}" value="Page#${requestScope.pageNo}">
                  </div>
                          
                  </form>
                  <form style="float: left;" id="form2" name="choice-form" action="fetchData.htm?action=nextPage&page=${requestScope.pageNo}&records=10&fileName=${requestScope.fileName}" method="post">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="next-btn2" value="Page#${requestScope.pageNo}">
                      </div>
                          
                  </form>
                  
                  <form name="choice-form" action="fetchData.htm?action=nextPage&page=${requestScope.pageNo}&records=10&fileName=${requestScope.fileName}" method="post">    
                  <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="next-btn" value="Next">
                      </div>
                          
                  </form>
                  </span>
        
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
