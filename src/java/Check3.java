/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException ;




@WebServlet(name = "Check3",urlPatterns = {"/Check3"})
public class Check3 extends HttpServlet {

    DBConnection dc = new DBConnection();
    Connection conn = dc.connectDb();

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
            out.println("<title>Servlet Check3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Check3 at " + request.getContextPath() + "</h1>");
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
        System.out.println("In serveet");
        PrintWriter out=(PrintWriter) response.getWriter();
        
        //Checking for database connection
        if(conn == null)
        {    //when not connected the below message is displayed
            out.println("Database Connection Failed!!!");
        }
        System.out.println ("conn") ;
        Statement s = null;
        ResultSet r = null ;
        try{
            r = null;
            s = conn.createStatement();
           //Getting answers from the CHERYL.answer_tbl table 
            String query = "SELECT * FROM  CHERYL.answer_tbl";
            //executing the above query
            r=s.executeQuery(query);
            
        System.out.println ("after select") ;   
        String x = "YYYYY" ;
        
        String str3=  request.getParameter("ans").substring(1);
        
        String str2 = str3.substring(0, str3.length() - 1) ;
        
       
        System.out.println ("After get parameter" + str2) ;
        
        String str1[] = str2.split(",") ;
       
        JSONObject json = new JSONObject();
        String  A="";
        int Q;
        JSONArray  addresses = new JSONArray();
        JSONObject address;
        try
        {
            String result ;
            result = "" ;
            
           while(r.next()){
           //fetching the ID from the database    
           Q = r.getInt("id"); 
           //fetching the answer for the corressponding id.
           A = r.getString("ans"); 
           System.out.println("ANSSS" + A);
           if (str1[Q-1].equals("u")) {
               //if no answer is selcted for a particular question then the id for this question is checked and the below message is displayed
                result = "Not answered" ;
                System.out.println("NOT ANSWERED : " + Q);
                
           }
           //for a particular id if the answer matched with the content in the databse the below message is displayed
           else if(str1[Q-1].equals(A)) {
                result = "Correct" ;
                System.out.println(Q + " ANSWERED : " + A);
           }
           else{
               //or else the answer is wrong and the below message is displayed
               System.out.println(Q + " Wrong ANSWERED : " + A);
                result = "Incorrect" ;
           }

           address = new JSONObject();
           address.put("Question", Q);  
           address.put("Answer", result);  
           addresses.put(address);
           }
           
         
        
            json.put("Addresses", addresses);

        }
        catch (JSONException jse)
        { 

        }
        //processRequest(request, response);
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        //System.out.println("after json");

        if (!s.isClosed())
                s.close();
            
            if (!r.isClosed())
                r.close()  ;
            
        }catch (SQLException ex) {
           String message = "ERROR 1 : " + ex.getMessage();
            
           ex.printStackTrace();
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
