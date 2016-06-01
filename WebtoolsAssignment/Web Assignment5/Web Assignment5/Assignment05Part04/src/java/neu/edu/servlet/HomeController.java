/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.servlet;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import neu.edu.DAO.InsertDataDAO;
import neu.edu.DAO.ReadOrderSalesDAO;
import neu.edu.pojo.SalesOrder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class HomeController extends AbstractController {
    
    ReadOrderSalesDAO readOrderSalesDAO;
    InsertDataDAO insertDataDAO;

    public HomeController(ReadOrderSalesDAO readOrderSalesDAO, InsertDataDAO insertDataDAO) {
        this.readOrderSalesDAO = readOrderSalesDAO;
        this.insertDataDAO = insertDataDAO;
    }
    
    
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        
        String fileName = request.getParameter("choice");
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        ModelAndView mv = new ModelAndView();
        int totalCount;
        
//        if (action.equals("display")) {
//            List<SalesOrder> salesOrders = new ArrayList<>();
//            totalCount = readOrderSalesDAO.getCount(fileName);
//
////            mv.addObject("salesOrders",salesOrders);
////            mv.setViewName("displaySalesOrders");
//        }
//        else 
        if (action.equals("display")) {
            
            List<SalesOrder> salesOrders = new ArrayList<>();
            
            int pageNo = Integer.parseInt(request.getParameter("page"));
            int records = Integer.parseInt(request.getParameter("records"));
            salesOrders = readOrderSalesDAO.fetchData(fileName,records,pageNo);

            mv.addObject("salesOrders",salesOrders);
            mv.addObject("fileName",fileName);
            mv.addObject("pageNo",++pageNo);
            mv.setViewName("displaySalesOrders");
        }
            else if (action.equals("nextPage")) {
            
            List<SalesOrder> salesOrders = new ArrayList<>();
            String fileName1 = request.getParameter("fileName");
            int pageNo = Integer.parseInt(request.getParameter("page"));
            int records = Integer.parseInt(request.getParameter("records"));
            salesOrders = readOrderSalesDAO.fetchData(fileName1,records,pageNo);

            mv.addObject("salesOrders",salesOrders);
            mv.addObject("fileName",fileName1);
            mv.addObject("pageNo",++pageNo);
            mv.setViewName("displaySalesOrders");
        }
        else if (action.equals("checkout")) {

                SalesOrder salesOrder = new SalesOrder();
                salesOrder.setSalesOrderID(request.getParameter("SalesOrderID"));
                salesOrder.setRevisionNumber(request.getParameter("RevisionNumber"));
                salesOrder.setOrderDate(request.getParameter("OrderDate"));
                salesOrder.setDueDate(request.getParameter("DueDate"));
                salesOrder.setShipDate(request.getParameter("ShipDate"));
                salesOrder.setStatus(request.getParameter("Status"));
                salesOrder.setOnlineOrderFlag(request.getParameter("OnlineOrderFlag"));
                salesOrder.setSalesOrderNumber(request.getParameter("SalesOrderNumber"));
                salesOrder.setPurchaseOrderNumber(request.getParameter("PurchaseOrderNumber"));
                salesOrder.setAccountNumber(request.getParameter("AccountNumber"));
                salesOrder.setCustomerID(request.getParameter("CustomerID"));
                salesOrder.setSalesPersonID(request.getParameter("SalesPersonID"));
                salesOrder.setTerritoryID(request.getParameter("TerritoryID"));
                salesOrder.setBillToAddressID(request.getParameter("BillToAddressID"));
                salesOrder.setShipToAddressID(request.getParameter("ShipToAddressID"));
                salesOrder.setShipMethodID(request.getParameter("ShipMethodID"));
                salesOrder.setCreditCardID(request.getParameter("CreditCardID"));
                salesOrder.setCreditCardApprovalCode(request.getParameter("CreditCardApprovalCode"));
                salesOrder.setCurrencyRateID(request.getParameter("CurrencyRateID"));
                salesOrder.setSubTotal(request.getParameter("SubTotal"));
                salesOrder.setTaxAmt(request.getParameter("TaxAmt"));
                salesOrder.setFreight(request.getParameter("Freight"));
                salesOrder.setTotalDue(request.getParameter("TotalDue"));
                salesOrder.setComment(request.getParameter("Comment"));
                salesOrder.setModifiedDate(request.getParameter("ModifiedDate"));
            
            insertDataDAO.checkout(salesOrder);
            
            
        }
        return mv;
    
    }
}
