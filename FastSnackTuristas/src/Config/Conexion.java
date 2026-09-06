/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:mysql://HOST:PUERTO/BASE_DE_DATOS";
    private static final String USUARIO = "USUARIO";
    private static final String PASSWORD = "CONTRASEÑA";

    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    PASSWORD
            );

            System.out.println("Conexión exitosa");

            return cn;

        } catch (SQLException e) {

            System.out.println("Error de conexión: " + e.getMessage());

            return null;
        }
    }
}