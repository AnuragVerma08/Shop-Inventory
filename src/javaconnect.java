/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Astarexz
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ShopNew","#rockstar08");  
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
}
