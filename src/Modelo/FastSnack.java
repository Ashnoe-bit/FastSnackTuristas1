package Modelo;

import Presentacion.Recibo;

public class FastSnack {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Recibo().setVisible(true));
    }
}
