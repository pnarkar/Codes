/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

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
public class part4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet part4</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet part4 at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

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
      //  processRequest(request, response);
      response.setContentType("text/html");
	PrintWriter out=response.getWriter();
        out.println("<html>");
out.println("<head><title>part4</title>");
out.println("<script>");
out.println("function vform() {\n" +
"    var x = document.forms[\"mform\"][\"name\"].value;\n" +
        "    var phone = document.forms[\"mform\"][\"phone\"].value;\n" +
    "    if (x == null || x == \"\") {\n" +
"        alert(\"fields should not be empty\");\n" +
"        return false;\n" +
"    }\n" +
"} \n" +
"\n" +
        
"</script> ");
out.println("</head> ");
out.println("<body>");
out.println("<div class='container-fluid'>");
out.println("<form name='mform' action='part4' onsubmit='return vform()' method='post'>");

out.println("<div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("<div class='form-group' style='border:1px solid'>");
out.println("<h3>Claim Form&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <i>PLEASE INCLUDE YOUR PET'S MEDICAL RECORDS TO HELP EXPEDITE PROCESSING</i></h3></div>");
out.println("<h3>&nbsp&nbsp1:General Information &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<i>Please fill out this form completely.Incomplete form will delay processing.</i></h3>");
out.println("<hr>");
out.println("</div>");
out.println("</div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-6'>");
out.println("<div class='form-group'>");
out.println("<div style='border:1px solid'> <label for='Your Information'>Your Information:</label>");
out.println("<input type='checkbox' name='Information' value='yes'/> <i>Check here if this is a new address</i></br></div>");
out.println("<div class='col-sm-2'><label for='Name'>Name:</label></div>");
out.println("<div class='col-sm-10'><input type='text' name='name'/></div>");
out.println("<div class='col-sm-2'><label for='Address'>Address:</label></div>");
out.println("<div class='col-sm-10'><input type='text' name='address'/></div>");
out.println("<div class='col-sm-2'><label for='City,State,Zip'>City,State,Zip:</label></div>");
out.println(" <div class='col-sm-10'><input type='text' name='City,State,Zip'/></div>");
out.println("<div class='col-sm-2'><label for='Phone'>Phone:</label></div>&nbsp&nbsp&nbsp");
out.println("<input type='text' name='Phone'/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
out.println("<label for='Email'>Email:</label>");
out.println("<input type='text' name='Email'/>");
out.println(" </div> </div>");
out.println("<div class='col-sm-6' >");
out.println("<div class='form-group' >");
out.println("<div style='border:1px solid'> <label for='Your Information'>Pet Information</label></br></div>");
out.println("<div class='col-sm-3'><label for='Account Number'>Account Number:</label></div>");
out.println("<div class='col-sm-9'><input type='text' name='AccountNumber'/></div>");
out.println("<div class='col-sm-3'><label for='Name'>Name:</label></div>");
out.println("<div class='col-sm-9'><input type='text' name='Name1'/></div>");
out.println("<div class='col-sm-3'><label for='Breed'>Breed:</label></div>");
out.println("<div class='col-sm-9'><input type='text' name='Breed'/></div>");
out.println("<div class='col-sm-3'><label for='Age'>Age:</label></div>&nbsp&nbsp&nbsp");
out.println("<input type='text' name='Age'/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
out.println("<label for='Gender'>Gender:</label>");
out.println(" <input type='text' name='Gender'/>");
out.println("</div></div></div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("<div class='col-sm-6'>");
out.println("<h3>2:Diagnosis/Symptom Information </h3></div>  <div class='col-sm-6' style='margin-top:20px'><i>Help us! By proving the story of Occurence/Diagnosys. you will help us avoid delay in processing your claim</i></div>");
out.println("</div></div>");
out.println("<hr>");
out.println("<div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("<textarea rows='4' cols='188' name='describe'> Story of Occurrence/Diagnosis - Please describe this incident, including dates, details and symptoms leading up to it </textarea>");
out.println("</div></div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-6'>");
out.println("<div class='form-group' >");
out.println("<div> <label for='This claim is related to:'></i>This claim is related to:</i><input type='radio' name='type' value='accident'/>accident<input type='radio' name='type' value='illness'/>illness<input type='radio' name='type' value='wellness'/>wellness</label></br></div>");
out.println("<label for='FT'>Is this claim an estimate for future treatment?<input type='radio' name='futuretreatment' value='yes'/>yes<input type='radio' name='futuretreatment' value='no'/>no</label>");
out.println("<label for='claim'>Total amount claimed:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type='text' name='amountclaim' /></label>");
out.println("<label for='illness/injury'>Date illness/injury first occurred:<input type='Date' name='illness/injury'/></label></br>");
out.println("<label for='Send payment to'>Send payment to:<input type='radio' name='paymentto' value='me'/>me<input type='radio' name='paymentto' value='Veterinarian'/>Veterinarian</label>");
out.println("</div></div>");
out.println("<div class='col-sm-6' >");
out.println("<form role='form'>");
out.println("<div class='form-group' >");
out.println("<label for='Veterinarian'>Veterinarian:<input type='text' name='Veterinarian'/></label></br>");
out.println("<label for='Clinic Name:'>Clinic Name:<input type='text' name='Clinic Name:'/></label></br>");
out.println("<label for='phone'>Phone:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
out.println("<input type='text' name='phone'/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
out.println("<label for='Fax'>Fax:</label>");
out.println("<input type='text' id='Fax'/>");
out.println("<label for='other veterinarian'>Did any other veterinarian treat your pet?:<input type='radio' name='other veterinarian' value='yes'/>yes<input type='radio' name='other veterinarian' value='no'/>no</label></br>");
out.println("<label for='new condition'>Is this a new condition?:<input type='radio' name='new condition' value='yes'/>yes<input type='radio' name='new condition' value='no'/>no</label>");
out.println("</div></div></div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("<h3>&nbsp&nbsp3:Pet Owner Declaration</h3>");
out.println("</div></div>");
out.println("<hr>");
out.println(" <div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("I confirm to the best of my knowledge the above statements are true in every respect. I understand that the fees listed may not be covered or may exceed my plan benefit. I understand that I am financially responsible to my veterinarian for the entire treatment. I understand that this claimcannot be adjusted without itemized receipts. I also understand that the deliberate misrepresentation of the animal's condition or the omission of any material facts may result in the denial of the claim and/or the cancellation of coverage. I authorize United States Fire Insurance Company andits business partners to review and obtain a copy of ALL RECORDS including the insurance claim records and medical records as to examination, history, diagnosis, treatment and prognosis with respect to any condition. I further authorize these entities to disclose identifying information about me and my pet, as well as information about my claim experience, to my veterinarian.</div></div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-6'>");
out.println("<div class='form-group'>");
out.println("<label for='Sign'>Signature of Pet Owner:<input type='text' name='Sign'/></label></br>");
out.println("</div></div>");
out.println("<div class='col-sm-6' >");
out.println("<div class='form-group' >");
out.println("<label for='Date'>Date:<input type='Date' name='Date'/></label></br>");
out.println("</div></div></div>");
out.println("<hr>");
out.println("<div class='row'>");
out.println("<div class='col-sm-12'  style='margin-left:320px'>");
out.println("<h4>Please read IMPORTANT NOTICE document that follows for additional information</h4>");
out.println("</div></div>");
out.println("<div class='row'>");
out.println("<div class='col-sm-12'>");
out.println("<h3>&nbsp&nbsp4:3 Easy Ways to Submit a Claim Form-<i>You must submit an itemized invoice with this claim form</i></h3>");
out.println("</div></div>");
out.println("<hr>");
out.println("<div class='col-sm-12'style='margin-left:180px'><div class='col-sm-3' style='border:1px solid;margin-right:20px'><h5>E-Mail:</h5> <div>claims@aspcapetinsurance.com</div> <i>scan and attach your receipts</i> </br></br></div><div class='col-sm-3' style='border:1px solid;margin-right:20px'><h5>FAX:</h5> <div>1-866-888-2495</div> <i>no cover sheet necessary</i> </br></br></div><div class='col-sm-3' style='border:1px solid'>  <h5>MAIL</h5> ASPCA Pet Health Insurance</br>3840 Greentree Ave SW</br>Canton, Ohio 44706</br></div></div> <div style='margin-left:650px'><input type='submit' name='submit'/>");

out.println("</div></form> </div>");

out.println("</body> </html>");
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
        //processRequest(request, response);
        try{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
out.println("<html>");
out.println("<head><title>post</title></head>");
out.println("<body>");
out.println("<h3>Your Information</h3>");
out.println("new address:"+request.getParameter("Information")+"</br>");
String name=request.getParameter("name");
name = name.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Name:"+name+"</br>");
//out.println("address:"+request.getParameter("address")+"</br>");
String address=request.getParameter("address");
address = address.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("address:"+address+"</br>");
//out.println("City,State,Zip:"+request.getParameter("City,State,Zip")+"</br>");
String Zip=request.getParameter("City,State,Zip");
Zip = Zip.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Zip:"+Zip+"</br>");
//out.println("Phone:"+request.getParameter("phone")+"</br>");
String phone=request.getParameter("phone");
phone = phone.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Phone:"+phone+"</br>");
//out.println("Email:"+request.getParameter("Email")+"</br>");
String Email=request.getParameter("Email");
Email = Email.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Email:"+Email+"</br>");
out.println("<h3>Pet Information</h3>");
//out.println("AccountNumber:"+request.getParameter("AccountNumber")+"</br>");
String AccountNumber=request.getParameter("AccountNumber");
AccountNumber = AccountNumber.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("AccountNumber:"+AccountNumber+"</br>");
//out.println("Pet Name:"+request.getParameter("Name1")+"</br>");
String Name1=request.getParameter("Name1");
Name1 = Name1.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Name1:"+Name1+"</br>");
//out.println("Breed:"+request.getParameter("Breed")+"</br>");
String Breed=request.getParameter("Breed");
Breed = Breed.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Breed:"+Breed+"</br>");
//out.println("Age:"+request.getParameter("Age")+"</br>");
String Age=request.getParameter("Age");
Age = Age.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Age:"+Age+"</br>");
//out.println("Gender:"+request.getParameter("Gender")+"</br>");
String Gender=request.getParameter("Gender");
Gender = Gender.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Gender:"+Gender+"</br>");
//out.println("describe:"+request.getParameter("describe")+"</br>");
String describe=request.getParameter("describe");
describe = describe.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("describe:"+describe+"</br>");
out.println("<h3>Diagnosis/Symptom Information</h3>");
//out.println("This claim is related to:"+request.getParameter("type")+"</br>");
String type=request.getParameter("type");
type = type.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("type:"+type+"</br>");
//out.println("Is this claim an estimate for future treatment?:"+request.getParameter("futuretreatment")+"</br>");
String futuretreatment=request.getParameter("futuretreatment");
futuretreatment = futuretreatment.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("futuretreatment:"+futuretreatment+"</br>");
//out.println("Total amount claimed:"+request.getParameter("amountclaim")+"</br>");
String amountclaim=request.getParameter("amountclaim");
amountclaim = amountclaim.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("amountclaim:"+amountclaim+"</br>");
//out.println("Date illness/injury first occurred:"+request.getParameter("illness/injury")+"</br>");
String injury=request.getParameter("illness/injury");
injury = injury.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("illness/injury:"+injury+"</br>");
//out.println("Send payment to:"+request.getParameter("paymentto")+"</br>");

String paymentto=request.getParameter("paymentto");
paymentto = paymentto.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("paymentto:"+paymentto+"</br>");
out.println("<h3>Pet Owner Declaration</h3>");
//out.println("Signature of Pet Owner:"+request.getParameter("Sign")+"</br>");
String Sign=request.getParameter("Sign");
Sign = Sign.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Sign:"+Sign+"</br>");
//out.println("Date:"+request.getParameter("Date")+"</br>");
String Date=request.getParameter("Date");
Date = Date.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
out.println("Date:"+Date+"</br>");
out.println("</body>");	
out.println("</html>");			
	
	
	
	
}	
catch(Exception e){
	
	
	System.out.println(e);
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
