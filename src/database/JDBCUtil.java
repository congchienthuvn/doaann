/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author cong1
 */
import java.sql.*;

import javax.swing.JOptionPane;
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c= null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver())
                  ;
            String url ="cj:mySQL://localhost:3306/quanlikho";
            String username = "root";
            String password ="";
            c = DriverManager.getConnection(url, url, password);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Không thể kết nối dữ liệu");
        }
        return c;
    }
    public static void closeConnection(Connection c){
        try {
            if(c!= null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
