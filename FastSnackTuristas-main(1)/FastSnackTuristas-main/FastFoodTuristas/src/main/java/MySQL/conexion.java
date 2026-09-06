/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MySQL;

import java.sql.Connection;

public class conexion {

    public static void main(String[] args) {

        Connection cn = conexion.conectar();

        if (cn != null) {
            System.out.println("TODO CORRECTO");
        } else {
            System.out.println("NO SE PUDO CONECTAR");
        }
    }

    private static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}