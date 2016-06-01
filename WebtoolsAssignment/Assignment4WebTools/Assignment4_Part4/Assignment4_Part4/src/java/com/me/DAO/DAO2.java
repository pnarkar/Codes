/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.DAO;

import com.me.bean.SalesOrder;
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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

/**
 *
 * @author pranalinarkar
 */
public class DAO2 extends DAO1{
        PreparedStatement ps;
    Connection conn;
    ResultSet rs;

    public void checkout(HttpServletRequest request) {

        try {
           // int orderId = 0;
            conn = getConnection();
           // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           // Date date = new Date();
            //String orderDate = dateFormat.format(date);
           // String query = "insert into orders (customerId, orderDate) values(?,?)";
           // ps = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
          //  ps.setInt(1, customerId);
           // ps.setString(2, orderDate);
             HttpSession session = request.getSession();
            //SalesOrder user =  (SalesOrder) session.getAttribute("so");
            
            List<SalesOrder> user = (List<SalesOrder>) session.getAttribute("so");
           
            String query2 = "insert into SalesOrder  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            for (SalesOrder p : user) {
                ps = conn.prepareStatement(query2);
                   ps.setString(1, p.getSalesOrderID());
               ps.setString(2, p.getRevisionNumber());
               ps.setString(3, p.getOrderDate());
               ps.setString(4, p.getDueDate());
               ps.setString(5, p.getShipDate());
               ps.setString(6, p.getStatus());
               ps.setString(7, p.getOnlineOrderFlag());
               ps.setString(8, p.getSalesOrderNumber());
               ps.setString(9, p.getPurchaseOrderNumber());
               ps.setString(10, p.getAccountNumber());
               ps.setString(11, p.getCustomerID());
               ps.setString(12, p.getSalesPersonID());
               ps.setString(13, p.getTerritoryID());
               ps.setString(14, p.getBillToAddressID());
               ps.setString(15, p.getShipToAddressID());
               ps.setString(16, p.getShipMethodID());
               ps.setString(17, p.getCreditCardID());
               ps.setString(18, p.getCreditCardApprovalCode());
               ps.setString(19, p.getCurrencyRateID());
               ps.setString(20, p.getSubTotal());
               ps.setString(21, p.getTaxAmt());
               ps.setString(22, p.getFreight());
               ps.setString(23, p.getTotalDue());
               ps.setString(24, p.getComment());
               ps.setString(25, p.getModifiedDate());
                  
                              
               

               
               ps.executeUpdate();

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            close(conn);
        }
    }
}
