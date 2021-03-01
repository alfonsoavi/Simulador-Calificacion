
package newpackage;
import java.util.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;

public class Consultar_datos extends javax.swing.JDialog {
   Vector Datos;
   java.awt.Frame principal;
    
    public Consultar_datos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        principal = parent;
    }

    public void PresentarDatosenTabla()
    {
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Cedula");
       df.addColumn("Nombre");
       df.addColumn("Sexo");
       df.addColumn("Nivel");
       df.addColumn("Gestión P1");
       df.addColumn("Examen P1");
       df.addColumn("Gestión P2");
       df.addColumn("Examen P2");
       df.addColumn("Promedio");
       df.addColumn("Estado");
       df.addColumn("Recuperación");
     
       for(int i=0;i<Datos.size();i++)
       { 
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           String sex="Masculino";
           if (dnf.t_femenino==true)
               sex="Femenino";

           String registro[]={dnf.cedula, dnf.nombre, sex,dnf.t_nivel, Double.toString(dnf.num1), Double.toString(dnf.exa1),
                              Double.toString(dnf.num2),Double.toString(dnf.exa2),Double.toString(dnf.promge),
                              dnf.t_estado,Double.toString(dnf.supletorio) };   
            df.addRow(registro);
       }    

       TablaDatos.setModel(df);
    }
    
    public void cargarVectorPrincipal(Vector v)
    {
       Datos=v;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcombo_estado = new javax.swing.JComboBox<>();
        combo_nivel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de registro");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        jLabel1.setText("ESTADO:");

        jcombo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "APROBADO", "TIENE DERECHO A EXAMEN DE RECUPERACION", "NO TIENE DERECHO A EXAMEN DE RECUPERACION" }));

        combo_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jLabel2.setText("NIVEL");

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcombo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btn_modificar)
                        .addGap(142, 142, 142)
                        .addComponent(btn_eliminar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jcombo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     String combo = jcombo_estado.getSelectedItem().toString();  
     String nivelestudiante = combo_nivel.getSelectedItem().toString();  
        
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Cedula");
       df.addColumn("Nombre");
       df.addColumn("Sexo");
       df.addColumn("Nivel");
       df.addColumn("Gestión P1");
       df.addColumn("Examen P1");
       df.addColumn("Gestión P2");
       df.addColumn("Examen P2");
       df.addColumn("Promedio");
       df.addColumn("Estado");
       df.addColumn("Recuperación");
     
       for(int i=0;i<Datos.size();i++)
       {
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           String sex="Masculino";
           if (dnf.t_femenino==true)
               sex="Femenino";
           
           if ((dnf.t_nivel.equals (nivelestudiante) && dnf.t_estado.equals(combo))||(dnf.t_estado.equals(combo) && nivelestudiante.equals("SELECCIONE..."))||(dnf.t_nivel.equals (nivelestudiante) && combo.equals("SELECCIONE...")))
           {      
             String registro[]={dnf.cedula, dnf.nombre, sex,dnf.t_nivel, Double.toString(dnf.num1), Double.toString(dnf.exa1),
                              Double.toString(dnf.num2),Double.toString(dnf.exa2),Double.toString(dnf.promge),
                              dnf.t_estado,Double.toString(dnf.supletorio)  };
           
            df.addRow(registro); 
           }else
           {
           if (combo.equals("SELECCIONE...") && nivelestudiante.equals("SELECCIONE..."))
           {      
             String registro[]={dnf.cedula, dnf.nombre, sex,dnf.t_nivel, Double.toString(dnf.num1), Double.toString(dnf.exa1),
                              Double.toString(dnf.num2),Double.toString(dnf.exa2),Double.toString(dnf.promge),
                              dnf.t_estado,Double.toString(dnf.supletorio)  };
           
            df.addRow(registro);
           }
           }
           
       }

       TablaDatos.setModel(df);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       int indice = TablaDatos.getSelectedRow();
       if (indice>=0){
       Datos_notas_formulario dnf = (Datos_notas_formulario)Datos.elementAt(indice);
       Calcular_notas cn=new Calcular_notas(principal,true,dnf,indice);
       cn.cargarVectorPrincipal(Datos);
       cn.show();
        }
       else 
           JOptionPane.showMessageDialog(null,"Seleccione el dato que desea modificar"); 
          
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int indice = TablaDatos.getSelectedRow();
       if (indice>=0){
        Datos_notas_formulario dnf = (Datos_notas_formulario)Datos.elementAt(indice);
           Datos.removeElementAt(indice);
           JOptionPane.showMessageDialog(null,"Se elimino correctamente");
           hide();
           }
       else 
           JOptionPane.showMessageDialog(null,"Seleccione el dato que desea eliminar"); 
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consultar_datos dialog = new Consultar_datos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> combo_nivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcombo_estado;
    // End of variables declaration//GEN-END:variables
}
