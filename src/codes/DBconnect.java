/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;


import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class DBconnect {
    
    
    
    
    public static Connection connect() 
    {
        Connection conn =null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javap","root","");
            
        }catch(ClassNotFoundException | SQLException e)
        {
                JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
