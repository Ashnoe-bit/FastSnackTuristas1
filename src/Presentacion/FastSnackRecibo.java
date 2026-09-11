/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Modelo.Pedido;
import Modelo.ItemPedido;
import DAO.ClienteDAOImpl;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import utilidades.DAOException;


/**
 *
 * @author usuario
 */
public class FastSnackRecibo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FastSnackRecibo.class.getName());

    private Pedido pedido;
    private ClienteDAOImpl clienteDAO;

    /**
     * Creates new form FastSnackRecibo
     */
    
        public FastSnackRecibo() {
        initComponents();
        this.setLocationRelativeTo(null);
        configurarTabla();
        try {
            clienteDAO = new ClienteDAOImpl();
        } catch (DAOException ex) {
            logger.severe(() -> "Error al crear ClienteDAO: " + ex.getMessage());
        }
    }

    public FastSnackRecibo(Pedido pedido, String cliente, String cedula, String totalSinIva, String iva, String descuento, String total) {
        this.pedido = pedido;
        initComponents();
        this.setLocationRelativeTo(null);
        configurarTabla();
        cargarProductosEnTabla();
        verificarCliente();
        try {
            clienteDAO = new ClienteDAOImpl();
        } catch (DAOException ex) {
            logger.severe(() -> "Error al crear ClienteDAO: " + ex.getMessage());
        }
    }

    private void configurarTabla() {
        jTable1.getModel().addTableModelListener((TableModelEvent e) -> {
            if (e.getColumn() == 3) {
                int fila = e.getFirstRow();
                try {
                    String precioStr = jTable1.getValueAt(fila, 2).toString().replace("$","").trim();
                    double precio = Double.parseDouble(precioStr);
                    double cant = Double.parseDouble(jTable1.getValueAt(fila, 3).toString());
                    double subtotal = precio * cant;
                    jTable1.setValueAt(subtotal, fila, 4);
                    calcularTotales();
                } catch (NumberFormatException ex) {}
            }
        });
         jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyReleased(java.awt.event.KeyEvent evt) {
            calcularTotales();
        }
      
    });
         
    }

    private void cargarProductosEnTabla() {
        if (pedido == null || pedido.getItems().isEmpty()) return;

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        int numero = 1;
        for (ItemPedido item : pedido.getItems()) {
            double subtotal = item.getPrecio() * item.getCantidad();
            modelo.addRow(new Object[]{
                numero++,
                item.getNombre(),
                String.format("$%.2f", item.getPrecio()),
                item.getCantidad(),
                subtotal
            });
        }
        calcularTotales();
    }
    
        private void verificarCliente() {
        jTextField4.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { buscarCliente(); }
            @Override
            public void removeUpdate(DocumentEvent e) { buscarCliente(); }
            @Override
            public void changedUpdate(DocumentEvent e) { buscarCliente(); }

            private void buscarCliente() {
                String correo = jTextField4.getText().trim();
                if (correo.contains("@") && correo.contains(".") && clienteDAO != null) {
                    try {
                        if (clienteDAO.existeCliente(correo)) {
                            String[] datos = clienteDAO.obtenerDatosCliente(correo);
                            if (datos != null) {
                                jTextField6.setText(datos[0]); // Nombre
                                jTextField5.setText(datos[1]); // Direccion
                            }
                        }
                    } catch (DAOException ex) {
                        System.out.println("Error al buscar cliente: " + ex.getMessage());
                    }
                }
            }
        });
    }

 private void calcularTotales() {
    double subtotal = 0;
    for (int i = 0; i < jTable1.getRowCount(); i++) {
        Object v = jTable1.getValueAt(i, 4);
        if (v != null) {
            try { subtotal += Double.parseDouble(v.toString()); } catch (NumberFormatException e) {}
        }
    }
    double iva = subtotal * 0.15;
    double descuento = 0;
    try {
        String txt = jTextField8.getText().trim();
        if (!txt.isEmpty()) {
            descuento = subtotal * (Double.parseDouble(txt) / 100);
        }
    } catch (NumberFormatException e) {}

    double total = subtotal + iva - descuento;

    jLabel21.setText(String.format("$%.2f", subtotal));
    jLabel22.setText(String.format("$%.2f", iva));
    jLabel23.setText(String.format("$%.2f", total));
}
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(209, 191, 173));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null}
            },
            new String [] {
                "#", "Producto", "P.Unitario", "Cantidad", "Sub Total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 330, 130));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 312, 30));

        jLabel24.setText("Recibido");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 56, -1));

        jButton1.setText("Imprimir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 90, 20));

        jButton2.setText("otro pedido \n");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 120, 20));

        jButton3.setText("Guardar datos");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 100, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 200, 50));
        jLabel6.setText("FAST SNACK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 255));
        jLabel2.setText("Turistas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 153, 255));
        jLabel5.setText("RUC: 1234567890001 ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 200, 50));
        jLabel7.setText("N Factura:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 200, 50));
        jLabel8.setText("Fecha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 200, 50));
        jLabel10.setText("Hora:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 200, 50));
        jLabel9.setText("Pago:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Credito", "Tarjeta Debito", "Transferencia" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 90, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 20));

        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField3.addActionListener(this::jTextField3ActionPerformed);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 200, 50));
        jLabel3.setText("Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        jLabel11.setForeground(new java.awt.Color(204, 153, 255));
        jLabel11.setText("Cliente");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 128, -1));

        jLabel13.setForeground(new java.awt.Color(204, 153, 255));
        jLabel13.setText("Direccion:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel12.setForeground(new java.awt.Color(204, 153, 255));
        jLabel12.setText("RUC / Cedula:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField6.addActionListener(this::jTextField6ActionPerformed);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 160, -1));

        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField5.addActionListener(this::jTextField5ActionPerformed);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, -1));

        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField4.addActionListener(this::jTextField4ActionPerformed);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 160, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 153, 255));
        jLabel20.setText("Descuentos:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 153, 255));
        jLabel16.setText("Total A Pagar:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 153, 255));
        jLabel18.setText("IVA(15%):");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 153, 255));
        jLabel17.setText("SubTotal:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel21.setText("$0.00");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 43, -1));

        jLabel22.setText("$0.00");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 43, -1));

        jLabel23.setText("$0.00");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 43, -1));

        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField8.addActionListener(this::jTextField8ActionPerformed);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 110, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "🖨️ Imprimiendo...\n\nTotal: " + jLabel23.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        m.setRowCount(0);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField8.setText("");

        jLabel21.setText("$0.00");
        jLabel22.setText("$0.00");
        jLabel23.setText("$0.00");

        Producto producto = new Producto();
        producto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String correo = jTextField4.getText().trim();
        String nombre = jTextField6.getText().trim();
        String direccion = jTextField5.getText().trim();

        if (correo.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese al menos Correo y Nombre del cliente",
                "Datos faltantes",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!correo.contains("@") || !correo.contains(".")) {
            JOptionPane.showMessageDialog(this,
                "El correo no tiene un formato válido (ejemplo: usuario@gmail.com)",
                "Correo inválido",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (clienteDAO != null && !clienteDAO.existeCliente(correo)) {
                String[] partes = nombre.split(" ");
                String nombres = partes[0];
                String apellidos = partes.length > 1 ? partes[1] : "Cliente";

                clienteDAO.guardarCliente(nombres, apellidos, correo, direccion);
                JOptionPane.showMessageDialog(this,
                    """
                    \u2705 Cliente guardado exitosamente
                    
                    \ud83d\udce7 Correo: """ + correo + "\n" +
                    "👤 Nombre: " + nombre + "\n" +
                    "📍 Dirección: " + direccion);
            } else {
                JOptionPane.showMessageDialog(this, """
                                                    \u2139\ufe0f El cliente ya existe en la base de datos
                                                    Los datos fueron cargados autom\u00e1ticamente.""");
            }
        } catch (HeadlessException | DAOException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FastSnackRecibo().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
