/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.dao;

import com.neu.edu.pojo.SalesOrder;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author pranalinarkar
 */
public class SalesOrderDAO {

    public ArrayList<SalesOrder> getAllOrders() throws SQLException {

        ArrayList<SalesOrder> retVal = null;
        try {
            // Load the driver.
            Class.forName("org.relique.jdbc.csv.CsvDriver");

            // Create a connection. CSV file is in D:
            Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:");

            // Create a Statement object to execute the query with.
            Statement stmt = conn.createStatement();

            // Select columns from SalesOrder.csv
            ResultSet rs = stmt.executeQuery("SELECT * FROM SalesOrder");

            //loop through rs
            // Clean up
            ResultSetMetaData metaData = rs.getMetaData();
            int resultColumnCount = metaData.getColumnCount();

            while (rs.next()) {
                if (resultColumnCount > 1) {

                    SalesOrder so = new SalesOrder();
                    so.setSalesOrderID(rs.getString(1));
                    so.setRevisionNumber(rs.getString(2));
                    so.setOrderDate(rs.getString(3));
                    so.setDueDate(rs.getString(4));
                    so.setShipDate(rs.getString(5));
                    so.setStatus(rs.getString(6));
                    so.setOnlineOrderFlag(rs.getString(7));
                    so.setSalesOrderNumber(rs.getString(8));
                    so.setPurchaseOrderNumber(rs.getString(9));
                    so.setAccountNumber(rs.getString(10));
                    so.setCustomerID(rs.getString(11));
                    so.setSalesPersonID(rs.getString(12));
                    so.setTerritoryID(rs.getString(13));
                    so.setBillToAddressID(rs.getString(14));
                    so.setShipToAddressID(rs.getString(15));
                    so.setShipMethodID(rs.getString(16));
                    so.setCreditCardID(rs.getString(17));
                    so.setCreditCardApprovalCode(rs.getString(18));
                    so.setCurrencyRateID(rs.getString(19));
                    so.setSubTotal(rs.getString(20));
                    so.setTaxAmt(rs.getString(21));
                    so.setFreight(rs.getString(22));
                    so.setTotalDue(rs.getString(23));
                    so.setComment(rs.getString(24));
                    so.setModifiedDate(rs.getString(25));
                    retVal.add(so);
                } else {
                    Object obj = rs.getObject(1);

                }
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }

        return retVal;
    }
    
     public int addToDb(HttpServletRequest request) throws SQLException, IOException {
     String dburl = "jdbc:mysql://localhost:3306/moviedb";
            String dbuser = "root";
            String dbpassword = "Windows@123";
            String dbdriver = "com.mysql.jdbc.Driver";

            int result = 0;
            Statement statement = null;
            //  int numberOfItr = Integer.parseInt(request.getParameter("count"));

            Connection conn = DAO.getConnectionJDBC(dburl, dbuser, dbpassword, dbdriver);

            String SalesOrderIDlist[] = request.getParameterValues("SalesOrderID");
            String RevisionNumberlist[] = request.getParameterValues("RevisionNumber");
            String OrderDatelist[] = request.getParameterValues("OrderDate");
            String DueDatelist[] = request.getParameterValues("DueDate");
            String ShipDatelist[] = request.getParameterValues("ShipDate");
            String Statuslist[] = request.getParameterValues("Status");
            String OnlineOrderFlaglist[] = request.getParameterValues("OnlineOrderFlag");
            String SalesOrderNumberlist[] = request.getParameterValues("SalesOrderNumber");
            String PurchaseOrderNumberlist[] = request.getParameterValues("PurchaseOrderNumber");
            String AccountNumberlist[] = request.getParameterValues("AccountNumber");
            String CustomerIDlist[] = request.getParameterValues("CustomerID");
            String SalesPersonIDlist[] = request.getParameterValues("SalesPersonID");
            String TerritoryIDlist[] = request.getParameterValues("TerritoryID");
            String BillToAddressIDlist[] = request.getParameterValues("BillToAddressID");
            String ShipToAddressIDlist[] = request.getParameterValues("ShipToAddressID");
            String ShipMethodIDlist[] = request.getParameterValues("ShipMethodID");
            String CreditCardIDlist[] = request.getParameterValues("CreditCardID");
            String CreditCardApprovalCodelist[] = request.getParameterValues("CreditCardApprovalCode");
            String CurrencyRateIDlist[] = request.getParameterValues("CurrencyRateID");
            String SubTotallist[] = request.getParameterValues("SubTotal");
            String TaxAmtlist[] = request.getParameterValues("TaxAmt");
            String Freightlist[] = request.getParameterValues("Freight");
            String TotalDuelist[] = request.getParameterValues("TotalDue");
            String Commentlist[] = request.getParameterValues("Comment");
            String ModifiedDatelist[] = request.getParameterValues("ModifiedDate");

            for (int i = 0; i < SalesOrderIDlist.length; i++) {
                String queryMessage = "INSERT INTO SalesOrder (SalesOrderID, "
                        + "RevisionNumber, OrderDate, DueDate, ShipDate, Status,"
                        + " OnlineOrderFlag, SalesOrderNumber, PurchaseOrderNumber, "
                        + "	AccountNumber, 	CustomerID, SalesPersonID, "
                        + "TerritoryID, BillToAddressID, ShipToAddressID, ShipMethodID, "
                        + "CreditCardID, CreditCardApprovalCode, CurrencyRateID,"
                        + " SubTotal, TaxAmt, Freight, TotalDue, Comment, ModifiedDate)"
                        + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";                   // statement = conn.createStatement();
                PreparedStatement msgStmt = conn.prepareStatement(queryMessage);
                msgStmt.setString(1, SalesOrderIDlist[i]);
                msgStmt.setString(2, RevisionNumberlist[i]);
                msgStmt.setString(3, OrderDatelist[i]);
                msgStmt.setString(4, DueDatelist[i]);
                msgStmt.setString(5, ShipDatelist[i]);
                msgStmt.setString(6, Statuslist[i]);
                msgStmt.setString(7, OnlineOrderFlaglist[i]);
                msgStmt.setString(8, SalesOrderNumberlist[i]);
                msgStmt.setString(9, PurchaseOrderNumberlist[i]);
                msgStmt.setString(10, AccountNumberlist[i]);
                msgStmt.setString(11, CustomerIDlist[i]);
                msgStmt.setString(12, SalesPersonIDlist[i]);
                msgStmt.setString(13, TerritoryIDlist[i]);
                msgStmt.setString(14, BillToAddressIDlist[i]);
                msgStmt.setString(15, ShipToAddressIDlist[i]);
                msgStmt.setString(16, ShipMethodIDlist[i]);
                msgStmt.setString(17, CreditCardIDlist[i]);
                msgStmt.setString(18, CreditCardApprovalCodelist[i]);
                msgStmt.setString(19, CurrencyRateIDlist[i]);
                msgStmt.setString(20, SubTotallist[i]);
                msgStmt.setString(21, TaxAmtlist[i]);
                msgStmt.setString(22, Freightlist[i]);
                msgStmt.setString(23, TotalDuelist[i]);
                msgStmt.setString(24, Commentlist[i]);
                msgStmt.setString(25, ModifiedDatelist[i]);

                result = msgStmt.executeUpdate();

            }
            return result;
     }

}
