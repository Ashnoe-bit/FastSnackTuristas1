/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import Modelo.Pedido;
import Modelo.Pedido;
import Presentacion.Factura;

public class ProductoConFactura extends javax.swing.JFrame {

    private final Pedido pedidoActual;
    private final Factura facturaAnterior;

    public ProductoConFactura(Pedido pedido, Factura factura) {
        this.pedidoActual = pedido;
        this.facturaAnterior = factura;
        initComponents();
        this.setLocationRelativeTo(null);
        spnHamburgesa.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnPapasFritas.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnNuggets.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnHotDog.setModel(new SpinnerNumberModel(0, 0, 20, 1));
    }


    private void initComponents() {
        spnHamburgesa = new javax.swing.JSpinner();
        spnPapasFritas = new javax.swing.JSpinner();
        spnNuggets = new javax.swing.JSpinner();
        spnHotDog = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setTitle("Agregar más productos");

        jButton1.setText("Agregar a Factura");
        jButton1.addActionListener(e -> {
            if (pedidoActual.getItems().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes agregar al menos un producto.");
                return;
            }
            facturaAnterior.actualizarPedido(pedidoActual);
            facturaAnterior.setVisible(true);
            this.dispose();
        });

        jButton2.setText("Comprar Hamburguesa");
        jButton2.addActionListener(e -> comprar("Hamburguesa", 2.50, spnHamburgesa));

        jButton3.setText("Comprar Papitas");
        jButton3.addActionListener(e -> comprar("Papas Fritas", 1.50, spnPapasFritas));

        jButton4.setText("Comprar Nuggets");
        jButton4.addActionListener(e -> comprar("Nuggets", 8.00, spnNuggets));

        jButton5.setText("Comprar Hot Dog");
        jButton5.addActionListener(e -> comprar("Hot Dog", 1.50, spnHotDog));

        jButton6.setText("Cancelar");
        jButton6.addActionListener(e -> {
            facturaAnterior.setVisible(true);
            this.dispose();
        });

        getContentPane().add(spnHamburgesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 30));
        getContentPane().add(spnPapasFritas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 50, 30));
        getContentPane().add(spnNuggets, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 50, 30));
        getContentPane().add(spnHotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 50, 30));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, 30));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 30));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 130, 30));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 130, 30));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 160, 30));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 30));

        setSize(800, 380);
    }

    private void comprar(String nombre, double precio, javax.swing.JSpinner spinner) {
        int cantidad = (Integer) spinner.getValue();
        if (cantidad > 0) {
            pedidoActual.agregarProducto(nombre, precio, cantidad);
            JOptionPane.showMessageDialog(this,
                "✅ " + cantidad + " " + nombre + " agregado(s).\nTotal acumulado: $" + pedidoActual.calcularTotal());
            spinner.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cantidad mayor a 0");
        }
    }

    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private javax.swing.JSpinner spnHamburgesa, spnPapasFritas, spnNuggets, spnHotDog;
}