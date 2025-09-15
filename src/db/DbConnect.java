/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
           c = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/spendingdb"+"?useSSL=false&allowPublicKeyRetrieval=true",
                    "root","root@1234");
           st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
