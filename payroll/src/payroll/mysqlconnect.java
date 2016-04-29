/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author vinay
 */
public class mysqlconnect {
    
      Connection conn=null;
        public static Connection ConnectDB()
        {
            try
            {            
            Class.forName("com.mysql.jdbc.Driver");    
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/seproject","root","2938");
            //JOptionPane.showMessageDialog(null,"connected to database");
            return conn;
            }
            catch(ClassNotFoundException | SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
}
