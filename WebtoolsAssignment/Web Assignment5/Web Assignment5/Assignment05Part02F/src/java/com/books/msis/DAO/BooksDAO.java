/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.msis.DAO;

import com.books.msis.POJO.BookBean;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pranalinarkar
 */
public class BooksDAO{
    Configuration cfg = new Configuration();
    SessionFactory sf = cfg.configure().buildSessionFactory();
   
    public void addBooks(BookBean book) throws SQLException {
        
        Session hibsession = sf.openSession();
        Transaction tx = null;
        try {
            //create a transaction window to create/update/delete
            tx = hibsession.beginTransaction();
            //to save the session
            hibsession.save(book);
           
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            hibsession.close();
        }
        
    }
}
