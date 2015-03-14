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
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException ;




@WebServlet(name = "ValidLogin",urlPatterns = {"/ValidLogin"})
public class ValidLogin extends HttpServlet {

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
        if(conn == null)
        {
            out.println("Database Connection Failed!!!");
        }
        System.out.println ("conn") ;
        Statement s = null;
        ResultSet r = null ;
        HttpSession session=request.getSession();
        try{
            r = null;
            s = conn.createStatement();
            
        System.out.println ("after select") ;   
        
        //the parameter "up is fetched from quiz_ajax_json;js which contains the username and password string
        String str3=  request.getParameter("up").substring(1);
        
        String str2 = str3.substring(0, str3.length() - 1) ;
        
        
        //after the parameters have been fetched the two are seperated ino two different strings
        System.out.println ("After get parameter" + str2) ;
        String str1[] = str2.split(",") ;
        
        //select query is used to check for valid username and password saved in the database
        String query = "SELECT * FROM  CHERYL.users where username = '" + str1[0] + "' and pass = '" + str1[1].trim() + "'" ;
        r=s.executeQuery(query);

        
        JSONObject json = new JSONObject();
        String  U="", P="";
        int Q;
        JSONArray  addresses = new JSONArray();
        JSONObject address;
        try
        {
            System.out.println("INside Try");
            String result ;
            result = "" ;
           address = new JSONObject();
            
           //if the data from login.jsp matches or doesn't match with the data in the databse the below function is performed.
           while(r.next()){
           Q = r.getInt("uid"); 
           U = r.getString("username"); 
           P = r.getString("pass"); 
           System.out.println("ANSSS   " + U);
   
           //if values are matched then below code works
           if(str1[0].equals(U) && str1[1].trim().equals(P))
           {
               System.out.println("HELLLOOOO") ;
               
               session.setAttribute("userName",r.getString("username"));
               address.put("valid", "Y");                 
           }
           
           //if doen;t match the below code takes place
           else
           {
               System.out.println("Not Equal");
               session.setAttribute("userName","");
               address.put("Invalid", "Y");                 
           }

           addresses.put(address);
           }
           
          
        
            json.put("Addresses", addresses);

        }
        catch (JSONException jse)
        { 

        }
        
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        

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
    }

}
