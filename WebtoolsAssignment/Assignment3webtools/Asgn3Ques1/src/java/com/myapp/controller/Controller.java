/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.controller;

import com.myapp.bean.MovieBean;
import com.myapp.dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
           
            String action = request.getParameter("action");
             String dburl = getServletContext().getInitParameter("dburl");
                String dbuser = getServletContext().getInitParameter("dbuser");
                String dbpassword = getServletContext().getInitParameter("dbpassword");
                String dbdriver = getServletContext().getInitParameter("dbdriver");
                HttpSession session = request.getSession();
                //database logic
                Connection conn = DAO.getConnectionJDBC(dburl, dbuser, dbpassword, dbdriver);
            if (action.equals("add")) {
                
                
                session.invalidate();
                response.sendRedirect("add.jsp");

            }
            else if(action.equals("browse")) {
                
                session.invalidate();
                response.sendRedirect("browse.jsp");
        }
                //if session exists then redirect to user view
               
                 
                 if (action.equals("add1")) {
                
                    Statement statement = conn.createStatement();
                String title= String.valueOf(session.getAttribute("title"));
                String actor= String.valueOf(session.getAttribute("actor"));
                String actress=String.valueOf(session.getAttribute("actress"));
                String genre=String.valueOf(session.getAttribute("genre"));
                String year= String.valueOf(session.getAttribute("year"));
//                PreparedStatement ps=conn.prepareStatement("insert into movie(title,Actor,Actress,Genere,Year) values(?,?,?,?,?)");
//                ps.setString(1, title);
//                ps.setString(2, actor);
//                ps.setString(3, actress);
//               ps.setString(4, genre);
//                ps.setString(5, year);
String queryMessage = "INSERT INTO movie values ('" + title + "','" + actor + "','" + actress + "','"
                    + genre + "'," + year + ")";

       
            int result = statement.executeUpdate(queryMessage);
            conn.close();
            if (result > 0) {
                RequestDispatcher rd = request.getRequestDispatcher("dataAdded.jsp");
                rd.forward(request, response);
            }
               
                else {
                    //for invalid credentials
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?error=true");
                    rd.forward(request, response);
                }

 
            
                 }
                       
                else if (action.equals("browseAdd")) {
                
                    Statement statement = conn.createStatement();
                    String rad= request.getParameter("radios");
                    String key= String.valueOf(session.getAttribute("key"));
                
//                PreparedStatement ps=conn.prepareStatement("insert into movie(title,Actor,Actress,Genere,Year) values(?,?,?,?,?)");
//                ps.setString(1, title);
//                ps.setString(2, actor);
//                ps.setString(3, actress);
//               ps.setString(4, genre);
//                ps.setString(5, year);

                    if(rad.equals("title")){
                        
                     String queryLogin = "select * from movie where title=? ";
                                    PreparedStatement loginstmt = conn.prepareStatement(queryLogin);
                                    loginstmt.setString(1, key);
                                    ResultSet resultSet = loginstmt.executeQuery();
                                    List<MovieBean> messageBeanList = new ArrayList<>();
                                    while(resultSet.next()){
                                       MovieBean messageBean = new MovieBean();
                        messageBean.setActor(resultSet.getString("Actor"));
                        messageBean.setActresses(resultSet.getString("Actresses"));
                        messageBean.setGenere(resultSet.getString("Genere"));
                        messageBean.setTitle(resultSet.getString("title"));
                        messageBean.setYear(Integer.parseInt(resultSet.getString("Year")));
                        messageBeanList.add(messageBean);  
                                    }


   
                                        loginstmt.close();
                                        conn.close();
                                        //session.setAttribute("title", key);
                    session.setAttribute("messageList", messageBeanList);
//                 RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
//                    rd.forward(request, response);
                    response.sendRedirect("UserView.jsp");
                    }
else if(rad.equals("Actor")){

                     String queryLogin = "select * from movie where Actor=? ";
                                    PreparedStatement loginstmt = conn.prepareStatement(queryLogin);
                                    loginstmt.setString(1, key);
                                    ResultSet resultSet = loginstmt.executeQuery();
                                    List<MovieBean> messageBeanList = new ArrayList<>();
                                    while(resultSet.next()){
                                       MovieBean messageBean = new MovieBean();
                        messageBean.setActor(resultSet.getString("Actor"));
                        messageBean.setActresses(resultSet.getString("Actresses"));
                        messageBean.setGenere(resultSet.getString("Genere"));
                        messageBean.setTitle(resultSet.getString("title"));
                        messageBean.setYear(Integer.parseInt(resultSet.getString("Year")));
                        messageBeanList.add(messageBean);  
                                    }


   
                                        loginstmt.close();
                                        conn.close();
                                        //session.setAttribute("title", key);
                    session.setAttribute("messageList", messageBeanList);
//                 RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
//                    rd.forward(request, response);
                    response.sendRedirect("UserView.jsp");
}
else if(rad.equals("Actresses")){

                     String queryLogin = "select * from movie where Actresses=? ";
                                    PreparedStatement loginstmt = conn.prepareStatement(queryLogin);
                                    loginstmt.setString(1, key);
                                    ResultSet resultSet = loginstmt.executeQuery();
                                    List<MovieBean> messageBeanList = new ArrayList<>();
                                    while(resultSet.next()){
                                       MovieBean messageBean = new MovieBean();
                        messageBean.setActor(resultSet.getString("Actor"));
                        messageBean.setActresses(resultSet.getString("Actresses"));
                        messageBean.setGenere(resultSet.getString("Genere"));
                        messageBean.setTitle(resultSet.getString("title"));
                        messageBean.setYear(Integer.parseInt(resultSet.getString("Year")));
                        messageBeanList.add(messageBean);  
                                    }


   
                                        loginstmt.close();
                                        conn.close();
                                        //session.setAttribute("title", key);
                    session.setAttribute("messageList", messageBeanList);
//                 RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
//                    rd.forward(request, response);
                    response.sendRedirect("UserView.jsp");



}
else{
 RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?error=true");
                    rd.forward(request, response);


}
       
          
             

 
            
                 }     

        
        }}
            
        
    
    
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