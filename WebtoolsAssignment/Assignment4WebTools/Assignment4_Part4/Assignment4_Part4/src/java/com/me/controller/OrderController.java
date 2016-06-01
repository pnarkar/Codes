/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.DAO.DAO;
import com.me.DAO.DAO2;
import com.me.bean.SalesOrder;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author pranalinarkar
 */
public class OrderController implements Controller {
    DAO dao;
    DAO2 dao2;
    public OrderController(DAO dao,DAO2 dao2) {
    this.dao=dao;
    this.dao2=dao2;
    }
    
  
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
     
         HttpSession session=hsr.getSession();
        
        String ac=hsr.getParameter("action");
        ModelAndView mv= new ModelAndView();
        
        if(ac.equalsIgnoreCase("next")){
        String csvFilename="C:\\Users\\pranalinarkar\\Desktop\\";
        
       List<SalesOrder> so=dao.parse(csvFilename);
       if(so!=null){
           
       
     session.setAttribute("so", so);
      mv.addObject("so",so);
        mv.setViewName("index");
       
        }
       
//        Scanner scanner=new Scanner(new File(csvFilename));
//        while(scanner.hasNext()){
//            System.out.println(scanner.next()+ "");
//        }
     //  
  //  }
        }
        
        
        else if(ac.equalsIgnoreCase("next1")){
           dao2.checkout(hsr);
            mv.setViewName("Success");
           
       }
        return mv;
    
    
}
}