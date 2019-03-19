/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felixmayo
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
    public static Connection mariaDBConn(){
        Connection Conn=null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/DB?user=root&password=root");
            JOptionPane.showMessageDialog(null, "Success Login ..");
            return Conn;
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null, E);
            return null;
        }
    }
}
