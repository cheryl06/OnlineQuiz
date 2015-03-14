/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.lang.*;



public class DBConnection {
    private String userName="cheryl";
    private String password="cheryl";

    public Connection connectDb()
{
    try
    {
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        String dbURL = "jdbc:derby://localhost:1527/cheryl_app_db";
        Connection conn = DriverManager.getConnection(dbURL, userName, password);
        return conn;
    }

    catch(Exception e)
    {
         return null;
         
    }        
 }
}
