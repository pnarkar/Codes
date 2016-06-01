/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.controller;

import com.myapp.dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pranalinarkar
 */
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("number");
             String dburl = getServletContext().getInitParameter("dburl");
                String dbuser = getServletContext().getInitParameter("dbuser");
                String dbpassword = getServletContext().getInitParameter("dbpassword");
                String dbdriver = getServletContext().getInitParameter("dbdriver");
                 HttpSession session = request.getSession();
                //database logic
                Connection conn = DAO.getConnectionJDBC(dburl, dbuser, dbpassword, dbdriver);
                 String str = request.getParameter("action");
                  if(str.equalsIgnoreCase("va"))
          {
              
          int x=Integer.parseInt((String) session.getAttribute("number"));
              System.out.println("-----------------"+x);
               
                //logic for checking the user exists in db
          
              
                         String[] isbn = request.getParameterValues("isbn");
                
              String[] title = (String[]) session.getAttribute("title");
         
         String[] authors = (String[]) session.getAttribute("authors");
          String[] price = request.getParameterValues("price");
                         for(int i=0;i<x;i++){
                         
                String queryLogin = "insert into books values (?,?,?,?)";
                       
                
                PreparedStatement loginstmt = conn.prepareStatement(queryLogin);
                    loginstmt.setString(1, isbn[i]);
                loginstmt.setString(2, title[i]);
                loginstmt.setString(3, authors[i]);
                loginstmt.setString(4, price[i]);
              
                         


                int resultSet = loginstmt.executeUpdate();
       
                         if (resultSet > 0) {
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/Success.jsp");
                rd.forward(request, response);
            }
    
                                   
                         }
          }
               
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
