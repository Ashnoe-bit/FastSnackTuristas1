/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import utilidades.DAOException;

/**
 *
 * @author
 * noemi
 */
public class Registro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registro.class.getName());

    /**
     * Creates
     * new
     * form
     * Registro
     */
    public Registro() {
        initComponents();
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        txtConfirmarContra = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JCheckBox();
        Registrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("REGISTRO");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 20));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos:");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("Correo:");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel6.setText("Dirección:");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel7.setText("Usuario:");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 60, 20));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel8.setText("Contraseña:");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 20));

        txtNombres.setText(" ");
        txtNombres.addActionListener(this::txtNombresActionPerformed);
        jDesktopPane1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 170, -1));

        txtApellidos.setText(" ");
        jDesktopPane1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 170, -1));

        txtCorreo.setText(" ");
        jDesktopPane1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 170, -1));

        txtDireccion.setText(" ");
        txtDireccion.addActionListener(this::txtDireccionActionPerformed);
        jDesktopPane1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, -1));

        txtUsuario.setText(" ");
        jDesktopPane1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, -1));

        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);
        jDesktopPane1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 150, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel9.setText("Vuelva a escribir la contraseña:");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 20));
        jDesktopPane1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 170, -1));
        jDesktopPane1.add(txtConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 170, -1));

        txtConfirmar.setText("Mostrar contraseña");
        txtConfirmar.addActionListener(this::txtConfirmarActionPerformed);
        jDesktopPane1.add(txtConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        Registrar.setText("Registrar");
        Registrar.addActionListener(this::RegistrarActionPerformed);
        jDesktopPane1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2026-09-05 at 11.01.51 PM.jpeg"))); // NOI18N
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            // Si está marcado, muestra la contraseña (quita el carácter de ocultamiento)
            txtContra.setEchoChar((char) 0);
        } else {
            // Si no está marcado, oculta la contraseña con asteriscos
            txtContra.setEchoChar('*');
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarActionPerformed
        if (txtConfirmar.isSelected()) {
            // Si está marcado, muestra la contraseña (quita el carácter de ocultamiento)
            txtConfirmarContra.setEchoChar((char) 0);
        } else {
            // Si no está marcado, oculta la contraseña con asteriscos
            txtConfirmarContra.setEchoChar('*');
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // Obtener los datos de los campos
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String correo = txtCorreo.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String usuario = txtUsuario.getText().trim();
        String pass1 = new String(txtContra.getPassword());
        String pass2 = new String(txtConfirmarContra.getPassword());

        // Validar campos vacíos
        if (nombres.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || 
            direccion.isEmpty() || usuario.isEmpty() || pass1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llena todos los campos obligatorios.");
            return;
        }

        // Validar que nombres solo contenga letras
        if (!nombres.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El campo Nombres solo debe contener letras.");
            txtNombres.requestFocus();
            return;
        }

        // Validar que apellidos solo contenga letras
        if (!apellidos.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El campo Apellidos solo debe contener letras.");
            txtApellidos.requestFocus();
            return;
        }

        // Validar que dirección solo contenga letras y números
        if (!direccion.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "La Dirección solo debe contener letras y números.");
            txtDireccion.requestFocus();
            return;
        }

        // Validar que el correo termine en @gmail.com
        if (!correo.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this, "El correo debe terminar en @gmail.com");
            txtCorreo.requestFocus();
            return;
        }

        // Validar formato de correo más completo
        if (!correo.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            JOptionPane.showMessageDialog(this, "El correo no tiene un formato válido (ejemplo: usuario@gmail.com)");
            txtCorreo.requestFocus();
            return;
        }

        // Validar que usuario tenga al menos 4 caracteres
        if (usuario.length() < 4) {
            JOptionPane.showMessageDialog(this, "El usuario debe tener al menos 4 caracteres.");
            txtUsuario.requestFocus();
            return;
        }

        // Validar que la contraseña tenga al menos 6 caracteres
        if (pass1.length() < 6) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.");
            txtContra.requestFocus();
            return;
        }

        // Detectar qué le falta a la contraseña
        boolean tieneLetra = pass1.matches(".*[a-zA-ZáéíóúÁÉÍÓÚñÑ].*");
        boolean tieneNumero = pass1.matches(".*\\d.*");
        boolean tieneEspecial = pass1.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        // Construir mensaje de lo que falta
        StringBuilder mensajeFalta = new StringBuilder();

        if (!tieneLetra) {
            mensajeFalta.append("- Al menos una letra\n");
        }
        if (!tieneNumero) {
            mensajeFalta.append("- Al menos un número\n");
        }
        if (!tieneEspecial) {
            mensajeFalta.append("- Al menos un carácter especial (!@#$%^&* etc.)\n");
        }

        // Si le falta algo, mostrar mensaje específico
        if (!tieneLetra || !tieneNumero || !tieneEspecial) {
            JOptionPane.showMessageDialog(this, 
                "La contraseña debe contener:\n" + mensajeFalta.toString(),
                "Contraseña inválida",
                JOptionPane.WARNING_MESSAGE);
            txtContra.requestFocus();
            return;
        }

        // Validar que las contraseñas coincidan
        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas NO coinciden.");
            txtContra.setText("");
            txtConfirmarContra.setText("");
            txtContra.requestFocus();
            return;
        }

        // Intentar guardar en la base de datos
        try {
            DAO.UsuarioDAO dao = DAO.UsuarioDAO.getInstance();
            boolean guardado = dao.registrarUsuario(nombres, apellidos, correo, direccion, usuario, pass1);

            if (guardado) {
                JOptionPane.showMessageDialog(this, "¡Registro Exitoso!\nAhora puedes iniciar sesión.");

                // Limpiar campos
                txtNombres.setText("");
                txtApellidos.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtUsuario.setText("");
                txtContra.setText("");
                txtConfirmarContra.setText("");

                // Ir al Login
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error: El usuario o correo ya existen.");
            }
        } catch (HeadlessException | DAOException e) {
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JCheckBox txtConfirmar;
    private javax.swing.JPasswordField txtConfirmarContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
