/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pranalinarkar
 */
public class p3 extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet question 3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form>");
            out.println("<p>How many children do you have? </p>"
                    + "<input type='text' id='c' name='c' ><br/><br/>");
            out.println("<input type='button' value='Submit' onclick='DisplayFunction()'>");
            out.println("</form>");
            out.println("<script>");
            out.println(" function DisplayFunction(){\n"
                    + "var c = document.getElementById('c').value;\n"
                    + "document.write(\"<html><head>Insert names</head><form action='p3' method='post'>\");\n"
                    + "for(var i=1;i<=c;i++){\n"
                    + "document.write(\"Enter the name of child \" + i +\":\"  );\n"
                    + "document.write(\"<input type='value' name='child\"+i+\"'>\");\n"
                    + "document.write(\"<br/><br/>\");\n"
                    + "}\n"
                    + "document.write(\"<input type='submit' value='Submit'>\");\n"
                    + "document.write(\"</form></html>\")\n"
                    + "}");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
       // processRequest(request, response);

        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");

        Enumeration enumeration = request.getParameterNames();
       printWriter.println("Your Children Names are </br>");
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            String p = (String) object;
            String v = request.getParameter(p);
            
            printWriter.println( v  + "</br>");
        }
        printWriter.close();

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