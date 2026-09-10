/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import DAO.UsuarioDAO;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
        this.setLocationRelativeTo(null);
        aplicarEstiloMaterial(txtNombres, txtApellidos, txtCorreo, txtDireccion, txtUsuario, txtContra, txtConfirmarContra);
    }

private void aplicarEstiloMaterial(JTextField txtNombres1, JTextField txtApellidos1, JTextField txtCorreo1, JTextField txtDireccion1, JTextField txtUsuario1, JPasswordField txtContra1, JPasswordField txtConfirmarContra1) {
    // Aplicar estilo a todos los campos de texto
    JTextField[] camposTexto = {txtNombres, txtApellidos, txtCorreo, txtDireccion, txtUsuario};
    JPasswordField[] camposPass = {txtContra, txtConfirmarContra};
    
    // Color más suave para el fondo y bordes
    Color fondoSuave = new Color(40, 40, 40);  // Gris un poco más claro
    Color bordeSuave = new Color(100, 100, 100);  // Gris medio para el borde
    Color bordeFocus = new Color(150, 0, 255);  // Morado suave para cuando está seleccionado
    
    for (JTextField campo : camposTexto) {
        campo.setBackground(fondoSuave);
        campo.setForeground(Color.WHITE);  // Texto blanco
        campo.setCaretColor(Color.WHITE);  // Cursor blanco
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeSuave));
        
        // Efecto suave al hacer focus
        campo.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeFocus));
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeSuave));
            }
        });
    }
    
    for (JPasswordField campo : camposPass) {
        campo.setBackground(fondoSuave);
        campo.setForeground(Color.WHITE);  // Texto blanco
        campo.setCaretColor(Color.WHITE);  // Cursor blanco
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeSuave));
        
        // Efecto suave al hacer focus
        campo.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeFocus));
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, bordeSuave));
            }
        });
    }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtConfirmarContra = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtConfirmar = new javax.swing.JCheckBox();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 65, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 105, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 142, -1, -1));

        txtNombres.setToolTipText("");
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 62, 130, -1));

        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 102, 130, -1));

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 142, 130, -1));

        Registrar.setText("Registrar");
        Registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registrar.addActionListener(this::RegistrarActionPerformed);
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 70, 20));

        txtContra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 262, 130, -1));

        jButton1.setText("Iniciar sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, -1));

        txtConfirmarContra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 130, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 182, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 225, -1, -1));

        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 182, 130, -1));

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 140, -1));

        txtConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmar.setText("Mostrar contraseña");
        txtConfirmar.addActionListener(this::txtConfirmarActionPerformed);
        getContentPane().add(txtConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, -1));

        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 222, 130, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vuelva a escribir la contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
        }

    }//GEN-LAST:event_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            // Si está marcado, muestra la contraseña (quita el carácter de ocultamiento)
            txtContra.setEchoChar((char) 0);
        } else {
            // Si no está marcado, oculta la contraseña con asteriscos
            txtContra.setEchoChar('*');
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarActionPerformed
        // TODO add your handling code here:
        if (txtConfirmar.isSelected()) {
            // Si está marcado, muestra la contraseña (quita el carácter de ocultamiento)
            txtConfirmarContra.setEchoChar((char) 0);
        } else {
            // Si no está marcado, oculta la contraseña con asteriscos
            txtConfirmarContra.setEchoChar('*');
        }

    }//GEN-LAST:event_txtConfirmarActionPerformed

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
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

        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
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
