/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.DAO;

import com.me.bean.SalesOrder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import org.relique.jdbc.csv.CsvDriver;


/**
 *
 * @author pranalinarkar
 */
public class DAO {

 private static final String CSV_JDBC_DRIVER = "org.relique.jdbc.csv.CsvDriver";
     private static final String CSV_JDBC_HEADER = "jdbc:relique:csv:";
       public List<SalesOrder> parse(final String csvDirectory) throws ClassNotFoundException, SQLException {
         List<SalesOrder> so = new ArrayList<>();

           Class.forName(CSV_JDBC_DRIVER);

             final Connection conn = DriverManager.getConnection(CSV_JDBC_HEADER
                                        + csvDirectory);
  final Statement stmt = conn.createStatement();

     final ResultSet results =
                                stmt.executeQuery("SELECT * from SalesOrder");
                                              
           
                        while (results.next()) {
    SalesOrder salesorder=new SalesOrder();
    salesorder.setSalesOrderID(results.getString("SalesOrderID"));
    salesorder.setRevisionNumber(results.getString("RevisionNumber"));
    salesorder.setOrderDate(results.getString("OrderDate"));
    salesorder.setDueDate(results.getString("DueDate"));
    salesorder.setShipDate(results.getString("ShipDate"));
    salesorder.setStatus(results.getString("Status"));
    salesorder.setOnlineOrderFlag(results.getString("OnlineOrderFlag"));
    salesorder.setSalesOrderNumber(results.getString("SalesOrderNumber"));
    salesorder.setPurchaseOrderNumber(results.getString("PurchaseOrderNumber"));
    salesorder.setAccountNumber(results.getString("AccountNumber"));
    salesorder.setCustomerID(results.getString("CustomerID"));
    salesorder.setSalesPersonID(results.getString("SalesPersonID"));
    salesorder.setTerritoryID(results.getString("TerritoryID"));
    salesorder.setBillToAddressID(results.getString("BillToAddressID"));
    salesorder.setShipToAddressID(results.getString("ShipToAddressID"));
    salesorder.setShipMethodID(results.getString("ShipMethodID"));
    salesorder.setCreditCardID(results.getString("CreditCardID"));
    salesorder.setCreditCardApprovalCode(results.getString("CreditCardApprovalCode"));
    salesorder.setCurrencyRateID(results.getString("CurrencyRateID"));
    salesorder.setSubTotal(results.getString("SubTotal"));
    salesorder.setTaxAmt(results.getString("TaxAmt"));
    salesorder.setFreight(results.getString("Freight"));
    salesorder.setTotalDue(results.getString("TotalDue"));
    salesorder.setComment(results.getString("Comment"));
    salesorder.setModifiedDate(results.getString("ModifiedDate"));
    so.add(salesorder);
                        }
       


 
return so; 
 
}
}