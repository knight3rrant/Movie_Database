/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author knight
 */
public class Database {

    private String Host;
    private String User;
    private String Password;
    private String DBName;
    private Statement stmt = null;
    private Connection con = null;
    private String query;

    Database() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            User = "root";
            Password = "root";
            DBName = "movie_review";
            Host = "jdbc:mysql://localhost:3306/" + DBName;
            con = DriverManager.getConnection(Host, User, Password);
            System.out.println("Connected");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

  

    public void AddUser(String name, String country, String language) {
        try {
            query = "INSERT INTO `users` ( `name`, `country`, `language`) VALUES (?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, name);
            preparedStmt.setString (2, country);
            preparedStmt.setString (3, language);
            preparedStmt.execute();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AddMovie(String title, String story, String country, int year, int length) {
        try {
            query = "INSERT INTO `movies` ( `title`, `story`, `country`,`year`,`length`) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, title);
            preparedStmt.setString (2, story);
            preparedStmt.setString (3, country);
            preparedStmt.setInt (4, year);
            preparedStmt.setInt (5, length);
            preparedStmt.execute();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
