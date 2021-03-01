
package newpackage;
import java.util.*;
import javax.swing.table.*;

public class Estadisticas extends javax.swing.JDialog {
   Vector Datos;
   
   public Estadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void CalcularEstadisticas()
    {
       double PromedioGeneral=0;
       int aprob=0;
       double p_a=0;
       double p_ap=0;
       int cder=0;
       double p_cer=0;
       double p_cere=0;
       int sder=0;
       double p_ser=0;
       double p_sere=0;
       double porm=0;
       int contador=0;
        
       if (busqueda_estado.isSelected())
       {
       for(int i=0;i<Datos.size();i++)
       { 
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           contador++;
           PromedioGeneral+=dnf.promge;
           porm= (((double)Math.round((PromedioGeneral/contador)*10d))/10);
           
           switch(dnf.t_estado)
           {   case "APROBADO":  aprob++;  p_a+=dnf.promge; p_ap= ((double)Math.round((p_a/aprob)*10d)/10); break;
               case "TIENE DERECHO A EXAMEN DE RECUPERACION":  cder++;  p_cer+=dnf.promge; p_cere= ((double)Math.round((p_cer/cder)*10d)/10); break;
               case "NO TIENE DERECHO A EXAMEN DE RECUPERACION":  sder++;  p_ser+=dnf.promge; p_sere= ((double)Math.round((p_ser/sder)*10d)/10); break;
           }
       }    
           
       t_promgenes.setText(Double.toString(porm));
       t_cantiestu.setText(Integer.toString(Datos.size()));
       
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Estado de la materia");
       df.addColumn("Cantidad");
       df.addColumn("Promedio");
       
       String Aprobado[]={"Aprobado",Integer.toString(aprob),Double.toString(p_ap)};
       String Con_d_a_r[]={"Tiene derecho a examen de recuperación",Integer.toString(cder),Double.toString(p_cere)};
       String Sin_d_a_r[]={"No tiene derecho a examen de recuperación",Integer.toString(sder),Double.toString(p_sere)};
       
       df.addRow(Aprobado);
       df.addRow(Con_d_a_r);
       df.addRow(Sin_d_a_r);
       
       jTable1.setModel(df);
       }
       
       int hombre=0;
       double prom_hom=0;
       double promge_hom=0;
       int mujer=0;
       double prom_muj=0;
       double promge_muj=0;
       if (busqueda_sexo.isSelected())
       {
       for(int i=0;i<Datos.size();i++)
       { 
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           contador++;
           PromedioGeneral+=dnf.promge;
           porm= (((double)Math.round((PromedioGeneral/contador)*10d))/10);
           
           if (dnf.t_masculino==true)
           {
               hombre++;  prom_hom+=dnf.promge; promge_hom= ((double)Math.round((prom_hom/hombre)*10d)/10);
           }
           if (dnf.t_femenino==true)
           {
               mujer++;  prom_muj+=dnf.promge; promge_muj= ((double)Math.round((prom_muj/mujer)*10d)/10);
           }
           
       }    
           
       t_promgenes.setText(Double.toString(porm));
       t_cantiestu.setText(Integer.toString(Datos.size()));
       
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Sexo");
       df.addColumn("Cantidad");
       df.addColumn("Promedio");
       
       String Hombre[]={"Masculino",Integer.toString(hombre),Double.toString(promge_hom)};
       String Mujer[]={"Femenino",Integer.toString(mujer),Double.toString(promge_muj)};
       
       
       df.addRow(Hombre);
       df.addRow(Mujer);
       
       
       jTable1.setModel(df);
       }
    }
      public void cargarVectorPrincipal(Vector v)
    {
       Datos=v;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_promgenes = new javax.swing.JTextField();
        t_cantiestu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        busqueda_estado = new javax.swing.JRadioButton();
        busqueda_sexo = new javax.swing.JRadioButton();
        consulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadistica de Registro");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Promedio General de los estudiantes ingresados (sin recuperacion)");

        t_promgenes.setEditable(false);

        t_cantiestu.setEditable(false);

        jLabel2.setText("Cantidad de estudiantes ingresados");

        busqueda.add(busqueda_estado);
        busqueda_estado.setText("POR ESTADO");

        busqueda.add(busqueda_sexo);
        busqueda_sexo.setText("POR SEXO");

        consulta.setText("CONSULTA");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(busqueda_estado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(busqueda_sexo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_cantiestu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_promgenes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consulta))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_promgenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_cantiestu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busqueda_estado)
                    .addComponent(busqueda_sexo)
                    .addComponent(consulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed

       double PromedioGeneral=0;
       int aprob=0;
       double p_a=0;
       double p_ap=0;
       int cder=0;
       double p_cer=0;
       double p_cere=0;
       int sder=0;
       double p_ser=0;
       double p_sere=0;
       double porm=0;
       int contador=0;
        
       if (busqueda_estado.isSelected())
       {
       for(int i=0;i<Datos.size();i++)
       { 
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           contador++;
           PromedioGeneral+=dnf.promge;
           porm= (((double)Math.round((PromedioGeneral/contador)*10d))/10);
           
           switch(dnf.t_estado)
           {   case "APROBADO":  aprob++;  p_a+=dnf.promge; p_ap= ((double)Math.round((p_a/aprob)*10d)/10); break;
               case "TIENE DERECHO A EXAMEN DE RECUPERACION":  cder++;  p_cer+=dnf.promge; p_cere= ((double)Math.round((p_cer/cder)*10d)/10); break;
               case "NO TIENE DERECHO A EXAMEN DE RECUPERACION":  sder++;  p_ser+=dnf.promge; p_sere= ((double)Math.round((p_ser/sder)*10d)/10); break;
           }
       }    
           
       t_promgenes.setText(Double.toString(porm));
       t_cantiestu.setText(Integer.toString(Datos.size()));
       
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Estado de la materia");
       df.addColumn("Cantidad");
       df.addColumn("Promedio");
       
       String Aprobado[]={"Aprobado",Integer.toString(aprob),Double.toString(p_ap)};
       String Con_d_a_r[]={"Con derecho a examen de recuperación",Integer.toString(cder),Double.toString(p_cere)};
       String Sin_d_a_r[]={"Sin derecho a examen de recuperación",Integer.toString(sder),Double.toString(p_sere)};
       
       df.addRow(Aprobado);
       df.addRow(Con_d_a_r);
       df.addRow(Sin_d_a_r);
       
       jTable1.setModel(df);
       }
       
       int hombre=0;
       double prom_hom=0;
       double promge_hom=0;
       int mujer=0;
       double prom_muj=0;
       double promge_muj=0;
       if (busqueda_sexo.isSelected())
       {
       for(int i=0;i<Datos.size();i++)
       { 
           Datos_notas_formulario dnf=(Datos_notas_formulario)Datos.elementAt(i);
           contador++;
           PromedioGeneral+=dnf.promge;
           porm= (((double)Math.round((PromedioGeneral/contador)*10d))/10);
           
           if (dnf.t_masculino==true)
           {
               hombre++;  prom_hom+=dnf.promge; promge_hom= ((double)Math.round((prom_hom/hombre)*10d)/10);
           }
           if (dnf.t_femenino==true)
           {
               mujer++;  prom_muj+=dnf.promge; promge_muj= ((double)Math.round((prom_muj/mujer)*10d)/10);
           }
           
       }    
           
       t_promgenes.setText(Double.toString(porm));
       t_cantiestu.setText(Integer.toString(Datos.size()));
       
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Sexo");
       df.addColumn("Cantidad");
       df.addColumn("Promedio");
       
       String Hombre[]={"Masculino",Integer.toString(hombre),Double.toString(promge_hom)};
       String Mujer[]={"Femenino",Integer.toString(mujer),Double.toString(promge_muj)};
       
       
       df.addRow(Hombre);
       df.addRow(Mujer);
       
       
       jTable1.setModel(df);
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_consultaActionPerformed

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estadisticas dialog = new Estadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup busqueda;
    private javax.swing.JRadioButton busqueda_estado;
    private javax.swing.JRadioButton busqueda_sexo;
    private javax.swing.JButton consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t_cantiestu;
    private javax.swing.JTextField t_promgenes;
    // End of variables declaration//GEN-END:variables
}
