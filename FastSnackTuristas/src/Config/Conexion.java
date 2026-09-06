/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import Utilidades.DAOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 * noemi
 */
public class Conexion {
    
    private static Conexion instance;
    private Connection connection;
 
    private final String url = "";
    private final String user = "root";
    private final String password = ""; 

    // Constructor privado
    private Conexion() throws DAOException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexión establecida a FastSnackbd");
        } catch (ClassNotFoundException | SQLException e) {
            throw new DAOException("Error de conexión: " + e.getMessage(), e);
        }
    }

    public static Conexion getInstance() throws DAOException {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}