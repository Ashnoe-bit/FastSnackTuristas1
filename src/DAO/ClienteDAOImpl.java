/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import utilidades.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 * noemi
 */


public class ClienteDAOImpl implements ClienteDAO {
    
    private Conexion conexion;

    public ClienteDAOImpl() throws DAOException {
        conexion = conexion.getInstance();
    }

    @Override
    public boolean existeCliente(String correo) throws DAOException {
        String sql = "SELECT COUNT(*) FROM Persona WHERE correo = ?";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;
        } catch (SQLException e) {
            throw new DAOException("Error al buscar cliente", e);
        }
    }

    @Override
    public boolean guardarCliente(String nombres, String apellidos, String correo, 
                                   String direccion) throws DAOException {
        String sql = "INSERT INTO Persona (nombres, apellidos, correo, direccion, usuario, contrasena) " +
                     "VALUES (?, ?, ?, ?, ?, '1234')";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setString(5, correo); // Usamos el correo como usuario temporal
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DAOException("Error al guardar cliente", e);
        }
    }

    @Override
    public String[] obtenerDatosCliente(String correo) throws DAOException {
        String sql = "SELECT nombres, apellidos, direccion FROM Persona WHERE correo = ?";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new String[]{
                    rs.getString("nombres") + " " + rs.getString("apellidos"),
                    rs.getString("direccion")
                };
            }
            return null;
        } catch (SQLException e) {
            throw new DAOException("Error al obtener datos del cliente", e);
        }
    }
}