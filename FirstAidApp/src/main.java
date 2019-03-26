package firstaidapp;

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
    
    public static Database db;
    public static boolean firstTime = true;
    public static void main(String[] args) {
        String value;
        db = new Database();
//        if (firstTime){
//            db.init();
//        }
        ResultSet rs = db.getQueryResults("select * from firstAid.Users;");
        try{
            rs.first();
            value = rs.getString(2);
            System.out.println(value);
        }catch (SQLException e) {
                throw new Error(e.toString());
            }
        }
    } 
