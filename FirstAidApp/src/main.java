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

public class main {
    public static final String USERNAME = "";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:derby://localhost:1527/firstAidAppDB";
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            Statement stmt = (Statement) conn.createStatement();
            String insert =  "INSERT INTO USERS (ID,FName,LName) VALUES (1,'Test','Tester')";
            stmt.executeUpdate(insert);
        }catch (SQLException e){
            System.err.println(e);
        }
        // TODO code application logic here
    } 
}
