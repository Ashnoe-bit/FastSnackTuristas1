/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Modelo.Pedido;
import javax.swing.JOptionPane;

/**
 *
 * @author Maily
 */
public final class Factura extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Factura.class.getName());

    /**
     * Constructor por defecto
     */
    public Factura() {
        initComponents();
        configurarEstadoInicial();
        

    }

    /**
     * Constructor para recibir datos directamente desde el Menú/Pedido.
     * Pasa los arreglos con la información seleccionada por el usuario.
     * @param cliente
     * @param ruc
     * @param productos
     * @param cantidades
     * @param precios
     */
    public Factura(String cliente, String ruc, String[] productos, int[] cantidades, double[] precios) {
        initComponents();
        configurarEstadoInicial();
        cargarDatosPedido(cliente, ruc, productos, cantidades, precios);
    }

    private void configurarEstadoInicial() {
        // Bloquear campos de totales y cabecera para evitar edición accidental
         jButton1.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
         
        jButton3.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    jButton2.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
        
        jTextField39.setEditable(false); // Total Sin IVA
        jTextField42.setEditable(false); // IVA
        jTextField37.setEditable(false); // Total Final
        
        // Bloquear campos de la lista de detalles
        javax.swing.JTextField[] detalles = {
            jTextField17, jTextField18, jTextField19, jTextField20, jTextField16,
            jTextField22, jTextField23, jTextField24, jTextField25, jTextField21,
            jTextField31, jTextField28, jTextField29, jTextField30, jTextField26,
            jTextField32, jTextField33, jTextField34, jTextField35, jTextField27
        };
        for (javax.swing.JTextField txt : detalles) {
            txt.setEditable(false);
        }

        // Agregar listener para recalcular automáticamente al modificar el Descuento
        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcularTotales();
            }
        });
    }

    /**
     * Carga los datos recibidos y los posiciona en las filas correspondientes.
     * @param cliente
     * @param ruc
     * @param productos
     * @param cantidades
     * @param precios
     */
    public void cargarDatosPedido(String cliente, String ruc, String[] productos, int[] cantidades, double[] precios) {
        jTextField8.setText(cliente);
        jTextField2.setText(ruc);
        
        // Asignación por filas
        javax.swing.JTextField[] txtCant = {jTextField17, jTextField18, jTextField19, jTextField20, jTextField16};
        javax.swing.JTextField[] txtDesc = {jTextField22, jTextField23, jTextField24, jTextField25, jTextField21};
        javax.swing.JTextField[] txtPUni = {jTextField31, jTextField28, jTextField29, jTextField30, jTextField26};
        javax.swing.JTextField[] txtTot  = {jTextField32, jTextField33, jTextField34, jTextField35, jTextField27};

        for (int i = 0; i < productos.length && i < 5; i++) {
            if (productos[i] != null && !productos[i].isEmpty()) {
                txtCant[i].setText(String.valueOf(cantidades[i]));
                txtDesc[i].setText(productos[i]);
                txtPUni[i].setText(String.format("%.2f", precios[i]));
                
                double totalFila = cantidades[i] * precios[i];
                txtTot[i].setText(String.format("%.2f", totalFila));
            }
        }
        
        calcularTotales();
    }

    /**
     * Realiza el cálculo del Subtotal, IVA (15%), Descuento y Total Final.
     */
    private void calcularTotales() {
        javax.swing.JTextField[] txtTot = {jTextField32, jTextField33, jTextField34, jTextField35, jTextField27};
        double subtotal = 0.0;

        for (javax.swing.JTextField txt : txtTot) {
            String val = txt.getText().replace(",", ".");
            if (!val.isEmpty()) {
                try {
                    subtotal += Double.parseDouble(val);
                } catch (NumberFormatException ignored) {}
            }
        }

        // Obtener Descuento ingresado
        double porcentajeDescuento = 0.0;
        String descTexto = jTextField44.getText().trim().replace(",", ".");
        if (!descTexto.isEmpty()) {
            try {
                porcentajeDescuento = Double.parseDouble(descTexto);
            } catch (NumberFormatException e) {
                porcentajeDescuento = 0.0;
            }
        }

        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);
        double subtotalConDescuento = subtotal - montoDescuento;
        double iva = subtotalConDescuento * 0.15; // IVA al 15%
        double totalFinal = subtotalConDescuento + iva;

        // Mostrar en la interfaz gráfica
        jTextField39.setText(String.format("%.2f", subtotal));
        jTextField42.setText(String.format("%.2f", iva));
        jTextField37.setText(String.format("%.2f", totalFinal));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Turistas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField1.setText("R.U.C");
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, -1));

        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 51, 0));
        jTextField3.setText("         FACTURA");
        jTextField3.addActionListener(this::jTextField3ActionPerformed);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 150, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setText("NO.");
        jTextField4.addActionListener(this::jTextField4ActionPerformed);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 73, 190, 10));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setText("Dirección Sucursal");
        jTextField5.addActionListener(this::jTextField5ActionPerformed);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextField6.addActionListener(this::jTextField6ActionPerformed);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 10));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setText("Cliente");
        jTextField7.addActionListener(this::jTextField7ActionPerformed);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        jTextField8.addActionListener(this::jTextField8ActionPerformed);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 260, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField9.setText("FECHA EMISIÓN");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 260, 20));

        jTextField11.setBackground(new java.awt.Color(188, 162, 135));
        jTextField11.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(102, 51, 0));
        jTextField11.setText("CANT.");
        jTextField11.addActionListener(this::jTextField11ActionPerformed);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, -1));

        jTextField13.setBackground(new java.awt.Color(209, 191, 173));
        jTextField13.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(102, 51, 0));
        jTextField13.setText("FastSnack");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        jTextField14.setBackground(new java.awt.Color(188, 162, 135));
        jTextField14.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(102, 51, 0));
        jTextField14.setText("P.UNI.");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 70, 20));

        jTextField15.setBackground(new java.awt.Color(188, 162, 135));
        jTextField15.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(102, 51, 0));
        jTextField15.setText("TOTAL");
        jTextField15.addActionListener(this::jTextField15ActionPerformed);
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 70, 20));

        jTextField16.addActionListener(this::jTextField16ActionPerformed);
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, -1));

        jTextField17.addActionListener(this::jTextField17ActionPerformed);
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        jTextField18.addActionListener(this::jTextField18ActionPerformed);
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, -1));

        jTextField19.addActionListener(this::jTextField19ActionPerformed);
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, -1));

        jTextField20.addActionListener(this::jTextField20ActionPerformed);
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, -1));
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 160, -1));
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, -1));
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, -1));
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 160, -1));
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, -1));
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 70, -1));
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, -1));
        getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 70, -1));
        getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 70, -1));
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, -1));
        getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 70, -1));
        getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 70, -1));
        getContentPane().add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, -1));
        getContentPane().add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 70, -1));

        jTextField36.setBackground(new java.awt.Color(188, 162, 135));
        jTextField36.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(102, 51, 0));
        jTextField36.setText("         DESCRIPCIÓN");
        jTextField36.addActionListener(this::jTextField36ActionPerformed);
        getContentPane().add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, -1));
        getContentPane().add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 110, 20));

        jTextField38.setBackground(new java.awt.Color(188, 162, 135));
        jTextField38.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(102, 51, 0));
        jTextField38.setText("TOTAL ");
        jTextField38.addActionListener(this::jTextField38ActionPerformed);
        getContentPane().add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, -1));

        jTextField39.addActionListener(this::jTextField39ActionPerformed);
        getContentPane().add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 20));

        jTextField40.setBackground(new java.awt.Color(188, 162, 135));
        jTextField40.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(102, 51, 0));
        jTextField40.setText("TOTAL SIN IVA");
        jTextField40.addActionListener(this::jTextField40ActionPerformed);
        getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, -1));

        jTextField41.setBackground(new java.awt.Color(188, 162, 135));
        jTextField41.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(102, 51, 0));
        jTextField41.setText(" IVA");
        jTextField41.addActionListener(this::jTextField41ActionPerformed);
        getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, -1));
        getContentPane().add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 110, 20));

        jTextField43.setBackground(new java.awt.Color(188, 162, 135));
        jTextField43.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(102, 51, 0));
        jTextField43.setText("DESCUENTO");
        jTextField43.addActionListener(this::jTextField43ActionPerformed);
        getContentPane().add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, -1));
        getContentPane().add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 110, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("Recibo");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 120, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("Otro pedido");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 51, 0));
        jButton3.setText("Cancelar pedido");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Botón "Recibo": Genera mensaje de confirmación/pantalla final
        JOptionPane.showMessageDialog(this, "Factura emitida con éxito por un total de: $" + jTextField37.getText(), "Recibo Generado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       // Botón "Otro pedido": Cierra esta ventana y permite volver a seleccionar
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       // Botón "Cancelar pedido"
      

    }//GEN-LAST:event_jTextField3ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    Recibo ventanaRecibo = new Recibo();
    ventanaRecibo.setVisible(true);
    this.dispose();
}
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                        

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "¿Está seguro de cancelar el pedido?\nSi lo hace, se perderá todo el progreso.",
        "Cancelar pedido",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        new Producto().setVisible(true);
        this.dispose();
    }
}
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "¿Está seguro de hacer otro pedido?\nSe borrará el registro actual.",
        "Otro pedido",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        new Producto().setVisible(true);
        this.dispose();
    }
}
                                            

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField43ActionPerformed
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Factura().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    void actualizarPedido(Pedido pedidoActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
