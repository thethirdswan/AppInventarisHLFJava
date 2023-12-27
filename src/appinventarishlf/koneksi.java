/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appinventarishlf;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author aryas
 */
public class koneksi {
    Connection con; 
    
    Connection GetConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hlf","root","");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal :pensive:");
        }
        return con;
    }
}