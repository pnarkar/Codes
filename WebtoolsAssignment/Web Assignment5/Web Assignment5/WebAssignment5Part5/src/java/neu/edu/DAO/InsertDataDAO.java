/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.edu.pojo.SalesOrder;

/**
 *
 * @author pranalinarkar
 */
public class InsertDataDAO extends DAO{
    PreparedStatement ps;
    Connection conn;
    ResultSet rs;
    
    public void checkout(SalesOrder s) throws SQLException {
        
        try {
            conn = getConnection();
            String query = "insert into SalesOrder values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
                            
                ps.setString(1, s.getSalesOrderID());
                ps.setString(2, s.getRevisionNumber());
                ps.setString(3, s.getOrderDate());
                ps.setString(4, s.getDueDate());
                ps.setString(5, s.getShipDate());
                ps.setString(6, s.getStatus());
                ps.setString(7, s.getOnlineOrderFlag());
                ps.setString(8, s.getSalesOrderNumber());
                ps.setString(9, s.getPurchaseOrderNumber());
                ps.setString(10, s.getAccountNumber());
                ps.setString(11, s.getCustomerID());
                ps.setString(12, s.getSalesPersonID());
                ps.setString(13, s.getTerritoryID());
                ps.setString(14, s.getBillToAddressID());
                ps.setString(15, s.getShipToAddressID());
                ps.setString(16, s.getShipMethodID());
                ps.setString(17, s.getCreditCardID());
                ps.setString(18, s.getCreditCardApprovalCode());
                ps.setString(19, s.getCurrencyRateID());
                ps.setString(20, s.getSubTotal());
                ps.setString(21, s.getTaxAmt());
                ps.setString(22, s.getFreight());
                ps.setString(23, s.getTotalDue());
                ps.setString(24, s.getComment());
                ps.setString(25, s.getModifiedDate());
                
                


            
                ps.execute();
            
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(InsertDataDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            close(conn);
        }
        
    }
    
}
