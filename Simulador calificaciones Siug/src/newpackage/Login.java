package newpackage;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public boolean mostrar = true;
    
    public Login() 
     {
        initComponents();
        
        t_clave_oculto.setVisible(true);
        t_clave_visible.setVisible(false);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t_clave_visible = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        t_clave_oculto = new javax.swing.JPasswordField();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingrese usuario y contraseña");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(t_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 30));

        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, 20));
        jPanel1.add(t_clave_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, 30));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 20));

        btnIniciar.setText("INGRESAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));
        jPanel1.add(t_clave_oculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, 30));

        btnMostrar.setText("ver");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       
        String usuario = "alfaniur";
        String clave = "12345";
        
        
        if (t_usuario.getText().equals(usuario)&&(t_clave_oculto.getText().equals(clave) || t_clave_visible.getText().equals(clave))) 
         {
            hide();  
             Ventana_Principal vp=new Ventana_Principal();
            vp.show();
         }else{
            JOptionPane.showMessageDialog(null,"El usuario/contraseña incorrecta, Intentelo nuevamente");
              }
            
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        if (mostrar)
         {
            t_clave_visible.setVisible(true);
            t_clave_oculto.setVisible(false);
            t_clave_visible.setText(t_clave_oculto.getText());
            mostrar = false;
         }else{
                t_clave_visible.setVisible(false);
                t_clave_oculto.setVisible(true);
                t_clave_oculto.setText(t_clave_visible.getText());
                mostrar = true;
              }
        
    }//GEN-LAST:event_btnMostrarActionPerformed
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField t_clave_oculto;
    private javax.swing.JTextField t_clave_visible;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
