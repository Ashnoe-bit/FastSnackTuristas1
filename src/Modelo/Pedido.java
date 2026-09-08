/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author noemi
 */

public class Pedido {
private ArrayList<ItemPedido> items = new ArrayList<>();

    public void agregarProducto(String nombre, double precio, int cantidad) {
        items.add(new ItemPedido(nombre, precio, cantidad));
    }

    public ArrayList<ItemPedido> getItems() {
        return items;
    }

    public double calcularSubtotal() {
        return items.stream().mapToDouble(ItemPedido::calcularSubtotal).sum();
    }

    public double calcularIVA() {
        return calcularSubtotal() * 0.16;   // Cambia el 0.16 si tu IVA es diferente
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }
}