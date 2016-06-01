/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import neu.edu.pojo.SalesOrder;
import org.relique.jdbc.csv.CsvDriver;


public class ReadOrderSalesDAO {
    
    public List<SalesOrder> fetchData(String fileName, int records, int pageNo)
    {
        List<SalesOrder> salesOrders = new ArrayList<>();
    try
    {
      // Load the driver.
      Class.forName("org.relique.jdbc.csv.CsvDriver");

      // Create a connection. The first command line parameter is
      // the directory containing the .csv files.
      // A single connection is thread-safe for use by several threads.
      Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:");

      // Create a Statement object to execute the query with.
      // A Statement is not thread-safe.
      Statement stmt = conn.createStatement();

      // Select the ID and NAME columns from sample.csv
      ResultSet results = stmt.executeQuery("SELECT * FROM SalesOrder LIMIT "+records+" OFFSET "+(pageNo-1)*records);
      
      
      

      // Dump out the results to a CSV file with the same format
      // using CsvJdbc helper function
//      boolean append = true;
//      CsvDriver.writeToCsv(results, System.out, append);

      while(results.next()){
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.setSalesOrderID(results.getString(1));
        salesOrder.setRevisionNumber(results.getString(2));
        salesOrder.setOrderDate(results.getString(3));
        salesOrder.setDueDate(results.getString(4));
        salesOrder.setShipDate(results.getString(5));
        salesOrder.setStatus(results.getString(6));
        salesOrder.setOnlineOrderFlag(results.getString(7));
        salesOrder.setSalesOrderNumber(results.getString(8));
        salesOrder.setPurchaseOrderNumber(results.getString(9));
        salesOrder.setAccountNumber(results.getString(10));
        salesOrder.setCustomerID(results.getString(11));
        salesOrder.setSalesPersonID(results.getString(12));
        salesOrder.setTerritoryID(results.getString(13));
        salesOrder.setBillToAddressID(results.getString(14));
        salesOrder.setShipToAddressID(results.getString(15));
        salesOrder.setShipMethodID(results.getString(16));
        salesOrder.setCreditCardID(results.getString(17));
        salesOrder.setCreditCardApprovalCode(results.getString(18));
        salesOrder.setCurrencyRateID(results.getString(19));
        salesOrder.setSubTotal(results.getString(20));
        salesOrder.setTaxAmt(results.getString(21));
        salesOrder.setFreight(results.getString(22));
        salesOrder.setTotalDue(results.getString(23));
        salesOrder.setComment(results.getString(24));
        salesOrder.setModifiedDate(results.getString(25));
        
        salesOrders.add(salesOrder);
      }

      // Clean up
      conn.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    
    return salesOrders;
  }
    
    
    public int getCount(String fileName) throws SQLException, ClassNotFoundException
    {
        int countRecords = 0;
    try
    {
      // Load the driver.
      Class.forName("org.relique.jdbc.csv.CsvDriver");

      // Create a connection. The first command line parameter is
      // the directory containing the .csv files.
      // A single connection is thread-safe for use by several threads.
      Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:"+fileName+"\\");

      // Create a Statement object to execute the query with.
      // A Statement is not thread-safe.
      Statement stmt = conn.createStatement();

      // Select the ID and NAME columns from sample.csv
      ResultSet results = stmt.executeQuery("SELECT * FROM SalesOrder");
      boolean b = results.last();
      if(b){
            countRecords = results.getRow();
        }
      

      // Dump out the results to a CSV file with the same format
      // using CsvJdbc helper function
//      boolean append = true;
//      CsvDriver.writeToCsv(results, System.out, append);

       
      

      // Clean up
      conn.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    
    return countRecords;
  }
   
    
}
