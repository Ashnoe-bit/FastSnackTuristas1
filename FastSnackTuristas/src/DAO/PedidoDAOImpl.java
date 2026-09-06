/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package DAO;

import Config.Conexion;
import Modelo.ItemPedido;
import Modelo.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Utilidades.DAOException;

/**
 *
 * @author
 * noemi
 */

public class PedidoDAOImpl implements PedidoDAO {

    private static PedidoDAOImpl instance;
    private Conexion conexion;

    private PedidoDAOImpl() throws DAOException {
        conexion = Conexion.getInstance();
    }

    public static PedidoDAOImpl getInstance() throws DAOException {
        if (instance == null) {
            instance = new PedidoDAOImpl();
        }
        return instance;
    }

    @Override
    public void guardarPedido(Pedido pedido, String nombreCliente, String telefonoCliente) throws DAOException {
        
        String sqlPersona = "INSERT INTO Persona (nombre, telefono) VALUES (?, ?)";
        String sqlCliente = "INSERT INTO Cliente (id_cliente, direccion) VALUES (?, 'Dirección por defecto')";
        String sqlPedido = "INSERT INTO Pedido (id_cliente, id_estado, fecha) VALUES (?, 1, NOW())";
        String sqlBuscarProd = "SELECT id_producto FROM Producto WHERE nombre = ?";
        String sqlInsertProd = "INSERT INTO Producto (nombre, precio) VALUES (?, ?)";
        String sqlDetalle = "INSERT INTO PedidoProducto (id_pedido, id_producto, cantidad) VALUES (?, ?, ?)";

        try (Connection con = conexion.getConnection()) {
            
            // 1. Guardar Persona (Cliente)
            int idPersona = 0;
            try (PreparedStatement ps = con.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, nombreCliente);
                ps.setString(2, telefonoCliente);
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) idPersona = rs.getInt(1);
            }

            // 2. Guardar Cliente
            try (PreparedStatement ps = con.prepareStatement(sqlCliente)) {
                ps.setInt(1, idPersona);
                ps.executeUpdate();
            }

            // 3. Guardar Pedido
            int idPedido = 0;
            try (PreparedStatement ps = con.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, idPersona);
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) idPedido = rs.getInt(1);
            }

            // 4. Guardar los productos del pedido
            for (ItemPedido item : pedido.getItems()) {
                int idProd = 0;
                
                // Buscar si el producto ya existe
                try (PreparedStatement ps = con.prepareStatement(sqlBuscarProd)) {
                    ps.setString(1, item.getNombre());
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        idProd = rs.getInt("id_producto");
                    } else {
                        // Si no existe, lo creamos
                        try (PreparedStatement psInsert = con.prepareStatement(sqlInsertProd, Statement.RETURN_GENERATED_KEYS)) {
                            psInsert.setString(1, item.getNombre());
                            psInsert.setDouble(2, item.getPrecio());
                            psInsert.executeUpdate();
                            ResultSet rsGen = psInsert.getGeneratedKeys();
                            if (rsGen.next()) idProd = rsGen.getInt(1);
                        }
                    }
                }

                // Guardar el detalle (cuántos compró de ese producto)
                try (PreparedStatement psDet = con.prepareStatement(sqlDetalle)) {
                    psDet.setInt(1, idPedido);
                    psDet.setInt(2, idProd);
                    psDet.setInt(3, item.getCantidad());
                    psDet.executeUpdate();
                }
            }
            
            System.out.println("¡Pedido guardado exitosamente en la base de datos!");

        } catch (SQLException e) {
            throw new DAOException("Error al guardar el pedido en la base de datos", e);
        }
    }
}