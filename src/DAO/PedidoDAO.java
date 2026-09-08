/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Pedido;
import utilidades.DAOException;

/**
 *
 * @author
 * noemi
 */
public interface PedidoDAO {
    void guardarPedido(Pedido pedido, String nombreCliente, String telefonoCliente) throws DAOException;
}
