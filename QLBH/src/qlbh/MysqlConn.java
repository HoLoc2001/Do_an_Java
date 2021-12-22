package qlbh;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MysqlConn {
    public static Connection conn(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlbh","root","hotanloc");  
            return  conn;
        }
        catch (ClassNotFoundException | SQLException ex) { JOptionPane.showMessageDialog(null ,"Lỗi "+ ex.getMessage());}  
        return null;
    }
    public static ResultSet query(Object... params){  
        try{  
            Connection conn = MysqlConn.conn();
            PreparedStatement pre = conn.prepareStatement(params[0].toString());
            
       
            for (int i = 1; i < params.length; i++) {
                pre.setObject(i, params[i]);
            }
            ResultSet rs = pre.executeQuery();
            return  rs;
        }
        catch (SQLException ex) { JOptionPane.showMessageDialog(null ,"Lỗi "+ ex.getMessage());}  
        return null;
    }
    public static PreparedStatement nonQuery(Object... params){  
        try{  
            Connection conn = MysqlConn.conn();
            PreparedStatement pre = conn.prepareStatement(params[0].toString());
            for (int i = 1; i < params.length; i++) {
                pre.setObject(i, params[i]);
            }
            return  pre;
        }
        catch ( SQLException ex) { JOptionPane.showMessageDialog(null ,"Lỗi "+ ex.getMessage());}  
        return null;
    }  
}
