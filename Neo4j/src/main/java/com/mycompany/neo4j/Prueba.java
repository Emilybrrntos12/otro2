/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neo4j;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Emily Barrientos
 */
public class Prueba {
    
    public static void main(String[] args) {
        String codigo = "";
        
        codigo+= "CREATE (a:Cliente{nombre: 'Emily'})";
        
        Conexion c = new Conexion();
        Connection con= c.conexion();
        
        try {
            PreparedStatement pst = con.prepareStatement(codigo);
            pst.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
}
