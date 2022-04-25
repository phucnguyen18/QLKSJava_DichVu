/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duyle
 */
public class JDBCMSSQL 
{
    private static Connection conn;
    //public static TuyChinhHeThong setting = new TuyChinhHeThong();

    public static Connection getConnection() 
    {
        try 
        {
            String url = "jdbc:mysql://localhost:3306/qlks";
            String user = "root";
            String pass = "phuc1805";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(JDBCMSSQL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(JDBCMSSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void closeConnection() 
    {
        try 
        {
            conn.close();
        } 
        catch (Exception e) 
        {
        }
    }
    public static void main(String[] args) 
    {
        Connection conn = getConnection();
        if(conn !=null)
        {
            System.out.println("thanh cong");
        }
         else
        {
            System.out.println("thatbai");
        }
        
    }

}
