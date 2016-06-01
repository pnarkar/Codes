/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.DAO;


import com.me.bean.Books;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pranalinarkar
 */
public class BooksDAO extends DAO {
 
     Connection conn;
    PreparedStatement ps;
    
    
     public void addBooks(Books b) throws SQLException {
   
   
      

 try {
            conn = getConnection();
            System.out.println(conn);
            String query ="insert into books values(?,?,?,?)";
            System.out.println("" +query);
            ps = conn.prepareStatement(query);
            ps.setString(1, b.getIsbn());
            ps.setString(2, b.getTitle());
            ps.setString(3, b.getAuthors());
            ps.setString(4, b.getPrice());
            
            
         ps.executeUpdate();
//      if(result>0){
//       return result;       
//       }
//            
//            
        } catch (SQLException ex) {
            Logger.getLogger(BooksDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(conn);
            ps.close();
          
        }

     
    }
    

    
    
    
    
}
