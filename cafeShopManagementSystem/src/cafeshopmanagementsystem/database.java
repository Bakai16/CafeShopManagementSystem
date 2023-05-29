/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author WINDOWS 10
 */


public class database {

    public static Connection connectDB() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafe", "root", "root"); // LINK YOUR DATABASE
            System.out.println("Connected to the database!");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}





