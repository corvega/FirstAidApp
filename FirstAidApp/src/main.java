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
import java.util.Properties;

public class main {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mariadb://localhost:3306/firstAid";
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        database();
    } 
    
    public static void database(){ // Driver issue 
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            Statement stmt = (Statement) conn.createStatement();
            String insert =  "INSERT INTO USERS (fName,lName) VALUES ('Test','Tester')";
            stmt.executeUpdate(insert);
            String sql;
            sql = "SELECT * FROM Users";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs);
        }catch (SQLException e){
            System.err.println(e);
        }
    }
}
