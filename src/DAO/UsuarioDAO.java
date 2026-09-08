/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.DAOException;

public class UsuarioDAO {

    private static UsuarioDAO instance;
    private final Conexion conexion;

    private UsuarioDAO() throws DAOException {
        conexion = Conexion.getInstance();
    }

    public static UsuarioDAO getInstance() throws DAOException {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    public boolean validarUsuario(String usuario, String contrasena) throws DAOException, SQLException {
        String sql = "SELECT * FROM Persona WHERE usuario = ? AND contrasena = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new DAOException("Error al validar el usuario", e);
        } finally {
            cerrarRecursos(rs, ps);
        }
    }

    public int obtenerIdUsuario(String nombre) throws DAOException {
        String sql = "SELECT id_persona FROM Persona WHERE nombre = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_persona");
            }
            return -1;
        } catch (SQLException e) {
            throw new DAOException("Error al obtener el ID del usuario", e);
        } finally {
            cerrarRecursos(rs, ps);
        }
    }

    public boolean registrarUsuario(String nombres, String apellidos, String correo,
                                    String direccion, String usuario, String contrasena) throws DAOException {
        String sql = "INSERT INTO Persona (nombres, apellidos, correo, direccion, usuario, contrasena) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setString(5, usuario);
            ps.setString(6, contrasena);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DAOException("Error al registrar el usuario", e);
        } finally {
            cerrarRecursos(null, ps);
        }
    }

    public String obtenerContrasenaPorCorreo(String correo) throws DAOException {
        String sql = "SELECT contrasena FROM Persona WHERE correo = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("contrasena");
            }
            return null;
        } catch (SQLException e) {
            throw new DAOException("Error al buscar el correo", e);
        } finally {
            cerrarRecursos(rs, ps);
        }
    }

    public void actualizarContrasena(String correo, String nuevaContrasena) throws DAOException {
        String sql = "UPDATE Persona SET contrasena = ? WHERE correo = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevaContrasena);
            ps.setString(2, correo);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("Error al actualizar la contraseña", e);
        } finally {
            cerrarRecursos(null, ps);
        }
    }

    private void cerrarRecursos(ResultSet rs, PreparedStatement ps) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {}
    }
}

