/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neo4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author Emily Barrientos
 */
public class Conexion {
    
    private final String USER = "neo4j";
    private final String PASSWORD = "barrientos";
    
        public Connection conexion(){
        
        Connection c = null;
        
        try {
            c = DriverManager.getConnection("jdbc:neo4j:http://localhost:7474", USER, PASSWORD);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return c;
    }

}
