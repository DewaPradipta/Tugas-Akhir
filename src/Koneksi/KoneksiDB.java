/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Dewa Pradipta Putra
 */
public class KoneksiDB {

    public static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if(koneksi==null){
            new Driver();
            koneksi =DriverManager.getConnection("jdbc:mysql://localhost:3306/datalogin","root","");
        }
        return koneksi;
    }
    public static void main(String[] args){
        try{
            getConnection();
 JOptionPane.showMessageDialog(null,"koneksi berhasil","report koneksi",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException ex){
            System.err.println("Koneksi GAGAL");
        }
    }
}
