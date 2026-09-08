/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author fl1pc08
 */
public class Cliente extends Persona {

    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        super(nombre, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Dirección: " + direccion);
    }

    @Override
    public void accederCliente() {
        System.out.println("Esto es un Cliente: " + nombre);
    }
}