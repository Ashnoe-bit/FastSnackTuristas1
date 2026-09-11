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
    
    lblBienvenido.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblBienvenido.setForeground(new java.awt.Color(255, 140, 0));
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        lblBienvenido.setForeground(new java.awt.Color(51, 35, 15));
    }
});
    
   logo13.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        logo13.setBounds(165, 35, 150, 130);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        logo13.setBounds(170, 40, 140, 120);
    }
});
    
    Iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        Iniciarsesion.setBounds(
            Iniciarsesion.getX() - 5,
            Iniciarsesion.getY() - 5,
            Iniciarsesion.getWidth() + 10,
            Iniciarsesion.getHeight() + 10
        );
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Iniciarsesion.setBounds(
            Iniciarsesion.getX() + 5,
            Iniciarsesion.getY() + 5,
            Iniciarsesion.getWidth() - 10,
            Iniciarsesion.getHeight() - 10
        );
    }
});
    Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        Registrarse.setBounds(
            Registrarse.getX() - 5,
            Registrarse.getY() - 5,
            Registrarse.getWidth() + 10,
            Registrarse.getHeight() + 10
        );
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Registrarse.setBounds(
            Registrarse.getX() + 5,
            Registrarse.getY() + 5,
            Registrarse.getWidth() - 10,
            Registrarse.getHeight() - 10
        );
    }
});
    
    Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        Empleado.setBounds(
            Empleado.getX() - 5,
            Empleado.getY() - 5,
            Empleado.getWidth() + 10,
            Empleado.getHeight() + 10
        );
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Empleado.setBounds(
            Empleado.getX() + 5,
            Empleado.getY() + 5,
            Empleado.getWidth() - 10,
            Empleado.getHeight() - 10
        );
    }
});
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
        jLabel5 = new javax.swing.JLabel();
        logo13 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Regi = new javax.swing.JLabel();
        Iniciarsesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        Empleado = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jLabel2.setText("FastSanck");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2026-09-10 at 18.51.51 (1)_isnet-general-use.png"))); // NOI18N
        logo13.setMaximumSize(new java.awt.Dimension(320, 200));
        logo13.setMinimumSize(new java.awt.Dimension(320, 200));
        logo13.setPreferredSize(new java.awt.Dimension(120, 80));
        getContentPane().add(logo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 140, 120));

        lblBienvenido.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(51, 35, 15));
        lblBienvenido.setText("¡Bienvenido!");
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, -1));

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescripcion.setText("Disfruta lo mejor, rápido y delicioso ♥");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/per_isnet-general-use.png"))); // NOI18N
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel3.setText("¡Qué bueno verte de nuevo!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 170, 30));

        Regi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/registre.png"))); // NOI18N
        getContentPane().add(Regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 60, 60));

        Iniciarsesion.setBackground(new java.awt.Color(255, 225, 0));
        Iniciarsesion.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        Iniciarsesion.setText("Iniciar Sesión");
        Iniciarsesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));
        Iniciarsesion.addActionListener(this::IniciarsesionActionPerformed);
        getContentPane().add(Iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 120));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 102, 0));
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 150, 10));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, -1));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("¡Crea tu cuenta y disfruta!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 160, -1));

        Registrarse.setBackground(new java.awt.Color(255, 153, 51));
        Registrarse.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        Registrarse.setText("Registrar");
        Registrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));
        Registrarse.addActionListener(this::RegistrarseActionPerformed);
        getContentPane().add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 120));

        Empleado.setBackground(new java.awt.Color(255, 51, 51));
        Empleado.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        Empleado.setText("Registro de Empleado");
        Empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));
        Empleado.addActionListener(this::EmpleadoActionPerformed);
        getContentPane().add(Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 280, 70));

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

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EmpleadoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
    Bienvenida ventana = new Bienvenida();
    ventana.setVisible(true);
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Empleado;
    private javax.swing.JButton Iniciarsesion;
    private javax.swing.JLabel Regi;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel logo13;
    // End of variables declaration//GEN-END:variables
}
