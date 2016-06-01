/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.DAO.BooksDAO;
import com.me.DAO.DAO;
import com.me.bean.Books;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author pranalinarkar
 */
public class BooksServlet implements Controller {
    
  BooksDAO booksDAO;
  
  public BooksServlet(BooksDAO booksDAO){
   this.booksDAO=booksDAO;   
  }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       
        HttpSession session = hsr.getSession();
        String action = hsr.getParameter("action");
     //   int res=0;
        ModelAndView mv = new ModelAndView();
     
        if(action.equalsIgnoreCase("books")){
            String bc=hsr.getParameter("bookscount");
            session.setAttribute("bc", bc);
            mv.addObject("bc",bc);
            mv.setViewName("booksform");
        }
        else if (action.equalsIgnoreCase("multiple")){
          int x=Integer.parseInt((String)session.getAttribute("bc"));
    String[] isbn = hsr.getParameterValues("isbn");

            String[] title = hsr.getParameterValues("title");

            String[] authors = hsr.getParameterValues("authors");
            String[] price = hsr.getParameterValues("price");
           
              Books b=new Books();
            for(int i=0; i<x; i++){
                           
                 
                b.setIsbn(isbn[i]);
                b.setTitle(title[i]);
                b.setAuthors(authors[i]);
                b.setPrice(price[i]);
       
                    booksDAO.addBooks(b);
                    
            }
         
           
              mv.setViewName("Success");
      
//            session.setAttribute("result", result);
        
            
            }
              
            
            
            
        
       
        return mv;
        
        
    }
    
}
