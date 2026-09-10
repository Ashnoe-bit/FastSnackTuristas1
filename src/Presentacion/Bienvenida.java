/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author
 * noemi
 */
public class Bienvenida extends javax.swing.JFrame {
    
    private javax.swing.ImageIcon cargarImagen(String ruta, int ancho, int alto) {
    java.awt.Image imagen = new javax.swing.ImageIcon(
        getClass().getResource(ruta)
    ).getImage();

    imagen = imagen.getScaledInstance(
        ancho,
        alto,
        java.awt.Image.SCALE_SMOOTH
    );

    return new javax.swing.ImageIcon(imagen);
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Bienvenida.class.getName());

    /**
     * Creates
     * new
     * form
     * Registro
     */
    public Bienvenida() {
        initComponents();
        
    this.setLocationRelativeTo(null);

    logo13.setIcon(
        cargarImagen("/imagenes/logo13.png", 280, 140)
    );
    
    Usuario.setIcon(
    cargarImagen("/imagenes/usuario.png", 70, 70)
    );
    
    Regi.setIcon(
    cargarImagen("/imagenes/registro.png", 70, 70)
    );
    
    Iniciarsesion.setFocusPainted(false);
    Iniciarsesion.setBorderPainted(true);

    Registrarse.setFocusPainted(false);
    Registrarse.setBorderPainted(true);
    }

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        logo13 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Iniciarsesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Regi = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jLabel2.setText("FastSanck");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo13.jpeg"))); // NOI18N
        logo13.setText("jLabel1");
        logo13.setMaximumSize(new java.awt.Dimension(320, 200));
        logo13.setMinimumSize(new java.awt.Dimension(320, 200));
        logo13.setPreferredSize(new java.awt.Dimension(120, 80));
        getContentPane().add(logo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, 80));

        lblBienvenido.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(51, 35, 15));
        lblBienvenido.setText("¡Bienvenido!");
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, -1));

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescripcion.setText("Disfruta lo mejor, rápido y delicioso ♥");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 220, -1));

        Usuario.setText("jLabel1");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 50, 30));

        Iniciarsesion.setBackground(new java.awt.Color(255, 225, 0));
        Iniciarsesion.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        Iniciarsesion.setText("Iniciar Sesión");
        Iniciarsesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), null, null));
        Iniciarsesion.addActionListener(this::IniciarsesionActionPerformed);
        getContentPane().add(Iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, 120));

        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 50, 30));

        Regi.setText("jLabel4");
        getContentPane().add(Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 60, 30));

        Registrarse.setBackground(new java.awt.Color(255, 153, 51));
        Registrarse.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        Registrarse.setText("Registrar");
        Registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 102, 0), null, null));
        Registrarse.addActionListener(this::RegistrarseActionPerformed);
        getContentPane().add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 160, 120));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2026-09-05 at 11.01.51 PM.jpeg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarsesionActionPerformed
        // TODO add your handling code here:                
        Login ventana = new Login();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IniciarsesionActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        // TODO add your handling code here:
        Registro ventana = new Registro();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_RegistrarseActionPerformed

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Bienvenida().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciarsesion;
    private javax.swing.JLabel Regi;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel logo13;
    // End of variables declaration//GEN-END:variables

    public static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
