/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingcart.cart;

import shoppingcart.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.StringTokenizer;
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String hidden = request.getParameter("hidden");
            String name = request.getParameter("name");
            
            if(name != null){
                HttpSession session = request.getSession();
                session.removeAttribute(name);
                int price=0;
                Enumeration<String> e = session.getAttributeNames();
                while(e.hasMoreElements()){
                    String key = e.nextElement();
                    Item id = (Item)session.getAttribute(key);
                    if(id.getPrice()!= 0)
                       price=price+id.getPrice();
                }
                request.setAttribute("price",price);
                RequestDispatcher reqDis = getServletContext().getRequestDispatcher("/cart.jsp");
                reqDis.forward(request, response);
            }
            if(hidden.equals("book")){
                String[] books = request.getParameterValues("book");
                
                HttpSession session = request.getSession();
                for(int i=0 ; i<books.length ;i++){
                    StringTokenizer tk = new StringTokenizer(books[i], "|");
                    String a = tk.nextToken();
                    String b=tk.nextToken();
                    Item a12 = new Item();
                    a12.setName(a);
                    a12.setPrice(Integer.parseInt(b));
                    session.setAttribute(a.toString(), a12);
                }
                int price=0;
                Enumeration<String> e = session.getAttributeNames();
                while(e.hasMoreElements()){
                    String key = e.nextElement();
                    Item i = (Item)session.getAttribute(key);
                    if(i.getPrice()!= 0)
                       price=price+i.getPrice();
                }
                request.setAttribute("price",price);
                
                
                
            RequestDispatcher reqDis = getServletContext().getRequestDispatcher("/cart.jsp");
            reqDis.forward(request, response);
            }
            else if(hidden.equals("music")){
                String[]  music = request.getParameterValues("music");
                
                HttpSession session = request.getSession();
                
                for(int i = 0 ; i<music.length ;i++){
                    StringTokenizer tk = new StringTokenizer(music[i], "|");
                    String a = tk.nextToken();
                    String b=tk.nextToken();
                    Item a1 = new Item();
                    a1.setName(a);
                    a1.setPrice(Integer.parseInt(b));
                    session.setAttribute(a.toString(), a1);
                }
                int price=0;
                Enumeration<String> er = session.getAttributeNames();
                while(er.hasMoreElements()){
                    String key = er.nextElement();
                    Item i = (Item)session.getAttribute(key);
                    if(i.getPrice()!= 0)
                       price=price+i.getPrice();
                }
                request.setAttribute("price",price);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/cart.jsp");
            rd.forward(request, response);
            }
            else if(hidden.equals("computer")){
                String[]  computer = request.getParameterValues("computer");
                
                HttpSession session = request.getSession();
                
                for(int i = 0 ; i<computer.length ;i++){
                    StringTokenizer tk = new StringTokenizer(computer[i], "|");
                    String a = tk.nextToken();
                    String b=tk.nextToken();
                    Item a1 = new Item();
                    a1.setName(a);
                    a1.setPrice(Integer.parseInt(b));
                    session.setAttribute(a.toString(), a1);
                }
                int price=0;
                Enumeration<String> e = session.getAttributeNames();
                while(e.hasMoreElements()){
                    String key = e.nextElement();
                    Item it = (Item)session.getAttribute(key);
                    if(it.getPrice()!= 0)
                       price=price+it.getPrice();
                }
                request.setAttribute("price",price);
                
            RequestDispatcher reqDis = getServletContext().getRequestDispatcher("/cart.jsp");
            reqDis.forward(request, response);
            }
            else if(hidden.equals("remove")){
                String key = request.getParameter("remove");
                
                HttpSession session = request.getSession();
                session.removeAttribute(key);
            RequestDispatcher rd= getServletContext().getRequestDispatcher("/cart.jsp");
            rd.forward(request, response);    
                
            }
        } finally {
            out.close();
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
        processRequest(request, response);
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
