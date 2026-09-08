package Modelo;

import Presentacion.FastSnackRecibo;

public class FastSnack {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FastSnackRecibo().setVisible(true));
    }
}