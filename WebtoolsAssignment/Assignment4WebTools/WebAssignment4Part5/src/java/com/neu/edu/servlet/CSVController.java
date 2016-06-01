/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.myapp.dao.DAO;
import com.myapp.dao.SalesOrderDAO;
import com.neu.edu.pojo.SalesOrder;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author pranalinarkar
 */
public class CSVController implements Controller {

     SalesOrderDAO salesorderDAO;
      public CSVController(SalesOrderDAO salesorderDAO) {
        this.salesorderDAO = salesorderDAO;
       
    }
     
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        String action = request.getParameter("action");
        if (action.equals("insert")) {

            int result = salesorderDAO.addToDb(request);

            if (result > 0) {
                // RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/addBooksSuccess.jsp");
                //rd.forward(request, response);
                String SalesOrderIDlist[] = request.getParameterValues("SalesOrderID");
                
                HttpSession session = request.getSession();
                session.setAttribute("count2", SalesOrderIDlist.length);
                mv.addObject("count2", SalesOrderIDlist.length);
                mv.setViewName("index");
            }

        } else {

           
            ArrayList<SalesOrder> retVal = salesorderDAO.getAllOrders();
            
            mv.addObject("retVal", retVal);
            mv.setViewName("index");

        }
        return mv;
    }
}
