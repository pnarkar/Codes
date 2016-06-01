/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.customClass;

import com.myapp.dao.DAO;
import com.neu.edu.pojo.SalesOrder;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author pranalinarkar
 */
public class PrintClass extends SimpleTagSupport {

    private String id;
    private String csv;

    public void setId(String id) {
        this.id = id;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    StringWriter sw = new StringWriter();

    public void doTag()
            throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        ArrayList<SalesOrder> retVal = new ArrayList<>();
        //  List<SalesOrder> salesOrderList = new List<>();
        try {
// Load the driver.
            Class.forName("org.relique.jdbc.csv.CsvDriver");

// Create a connection. CSV file is in D:
            Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:");

// Create a Statement object to execute the query with.
            Statement stmt = conn.createStatement();

// Select columns from SalesOrder.csv
            ResultSet rs = stmt.executeQuery("SELECT * FROM "+csv);

//loop through rs
// Clean up
            ResultSetMetaData metaData = rs.getMetaData();
            int resultColumnCount = metaData.getColumnCount();
            out.write("<form action='CSVController.htm' method='post'>");
            out.write("<input type='submit' value='Add to Database'/>");
            out.write("<input type='hidden' id='action' name='action' value='insert' />");

            out.write("<table border='1'>");
            out.write("<tr>");
            for (int i = 1; i <= 25; i++) {
                out.write("<th>" + metaData.getColumnName(i) + "</th>");
            }
            out.write("</tr>");
            while (rs.next()) {
               
                    out.write("<tr>");
                    for (int i = 1; i <= 25; i++) {
                        out.write("<td><input type='text' name='" + metaData.getColumnName(i) + "' value='" + rs.getString(i) + "'/></td>");
                    }
                    out.write("</tr>");

                } 
            
            out.write("</table>");
            out.write("</form>");

            conn.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
//       getJspBody().invoke(sw);
//       getJspContext().getOut().println(sw.toString());
    }
}
