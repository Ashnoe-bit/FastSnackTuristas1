/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author fl1pc08
 */
public class Empleado extends Persona {

    public Empleado(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public void accederCliente() {
        System.out.println("Hola, nuevo empleado: " + nombre);
    }
}
