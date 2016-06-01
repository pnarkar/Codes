/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.msis.Controller;

import com.books.msis.DAO.BooksDAO;
import com.books.msis.POJO.BookBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.DataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author darsh
 */
public class BooksController implements Controller {

    BooksDAO booksDAO;
    int numberOfBooks;
    public BooksController(BooksDAO booksDAO) {
        this.booksDAO = booksDAO;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       
        String action = hsr.getParameter("action");
        int counter=0;
        ModelAndView mv = new ModelAndView();       
        if (action.equals("quantity")) {
             String quantity = hsr.getParameter("quantity");
            numberOfBooks = Integer.parseInt(quantity);
            mv.addObject("quantity", numberOfBooks);
            mv.setViewName("AddBooks");
        } 
        if (action.equals("addbooks")) {
            
            BookBean book = new BookBean();
            for (int i = 1; i <= numberOfBooks; i++) {
                book.setIsbn(hsr.getParameter("isbn" + i));
                book.setTitle(hsr.getParameter("title" + i));
                book.setAuthor(hsr.getParameter("author" + i));
                String price = hsr.getParameter("price"+i);
                book.setPrice(price);
                booksDAO.addBooks(book);
                counter++;
            }
            mv.addObject("counter", counter);
            mv.setViewName("Success");

        }

        return mv;
    }

}
