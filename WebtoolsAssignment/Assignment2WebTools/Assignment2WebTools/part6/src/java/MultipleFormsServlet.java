/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pranalinarkar
 */
public class MultipleFormsServlet extends HttpServlet {
String x;
    String y;

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
            out.println("<title>Servlet MainServlet</title>");
            out.println("</head>");
            out.println("<body>");

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
        sendPage1(response);
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
        String page = request.getParameter("page");
        x = request.getParameter("gn");
        y = request.getParameter("b");

        if (page == null) {
            sendPage1(response);
            return;
        }
        if (page.equals("one")) {
            sendPage2(response);
        } else if (page.equals("two")) {
            displayValues(response);
        }

    }

    void sendPage1(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Page 1</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Page 1</H2>");
        out.println("Which is ur favourite month :<BR><BR>");
        out.println("<FORM METHOD=POST action=page2>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=one>");

        out.println("<input type=\"radio\" name=\"gn\" value=\"Jan\" checked> Jan<br>");
        out.println("<input type=\"radio\" name=\"gn\" value=\"Feb\" checked> Feb<br>");
        out.println("<input type=\"radio\" name=\"gn\" value=\"March\" checked> March<br>");
        out.println("<input type=\"radio\" name=\"gn\" value=\"March\" checked> April<br>");

        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Submit></TD>");
        out.println("<FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    void sendPage2(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Page two</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<CENTER><H2>Page two</H2>");
        out.println("Which is ur favourite Food :<BR><BR>");
        out.println("<FORM METHOD=POST action=page2>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=two>");
        out.println("<INPUT TYPE=HIDDEN NAME=gn VALUE=\"" + x + "\">");

        out.println("<input type=\"radio\" name=\"b\" value=\"Chinese\" checked> Chinese<br>");
        out.println("<input type=\"radio\" name=\"b\" value=\"Indian\" checked> Indian<br>");
        out.println("<input type=\"radio\" name=\"b\" value=\"American\" checked> American<br>");
        out.println("<input type=\"radio\" name=\"b\" value=\"Mexican\" checked> Mexican<br>");

        out.println("<TD><INPUT TYPE=SUBMIT VALUE=Submit></TD>");

        out.println("</FORM></CENTER>");
        out.println("</BODY></HTML>");
    }

    void displayValues(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Page three</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<H2>Page 3 (End)</H2>");
        out.println("Your Entered Values.<BR><BR>");
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>Month: &nbsp;</TD>");
        out.println("<TD>" + x + "</TD>");
        out.println("</TR>");
        out.println("<TR><TD>Food: &nbsp;</TD>");
        out.println("<TD>" + y + "</TD>");
        out.println("</TR>");

        out.println("</TABLE></CENTER>");
        out.println("</BODY></HTML>");
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