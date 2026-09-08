/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import utilidades.DAOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/FastSnackBD?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "130223domi.";

    private static Conexion instance;
    private Connection connection;

    // Constructor privado: evita que se creen instancias fuera de la clase
    private Conexion() throws DAOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("✅ Conexión establecida a FastSnackBD");
        } catch (ClassNotFoundException | SQLException e) {
            throw new DAOException("Error de conexión: " + e.getMessage(), e);
        }
    }

    // Devuelve la única instancia (patrón Singleton)
    public static Conexion getInstance() throws DAOException {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    // Devuelve la conexión activa
    public Connection getConnection() {
        return connection;
    }
}

