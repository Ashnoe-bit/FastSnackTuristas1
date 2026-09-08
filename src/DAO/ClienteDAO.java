/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Cliente;
import java.util.List;
import java.util.Optional;
import utilidades.DAOException;


/**
 *
 * @author
 * noemi
 */
public interface ClienteDAO {

    // Buscar cliente por correo
    boolean existeCliente(String correo) throws DAOException;
    
    // Guardar cliente
    boolean guardarCliente(String nombres, String apellidos, String correo, 
                           String direccion) throws DAOException;
    
    // Obtener datos del cliente por correo
    String[] obtenerDatosCliente(String correo) throws DAOException;
}