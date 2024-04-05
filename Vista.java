/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AP-SE105-01
 */
public class Vista extends javax.swing.JFrame {
      equipo[] inventario = new equipo[30];
    DefaultTableModel modelo = new DefaultTableModel();
    int contador = 0;
    
    public Vista() {
        initComponents();
        String[] encabezados = {"Código","Descripción","Marca","Procesador","RAM","Almacenamiento","Cantidad"};
        modelo.setColumnIdentifiers(encabezados);
        tblinventario.setModel(modelo);
        setSize(750,800);
    }

    public void agregar(int codigo, String descripcion, String procesador, String marca, int cantidad, int ram, int almacenamiento){
     
        equipo equipo1 = new equipo( codigo, descripcion, procesador, marca, cantidad, ram, almacenamiento);
        inventario[contador]= equipo1;
        contador++;
        JOptionPane.showMessageDialog(rootPane, marca);
    }
    
    public void mostrar(){
    modelo.setRowCount(0);
        for (int i = 0; i < contador; i++) {
            modelo.addRow(new Object[]{inventario[i].getCodigo(),
                                        inventario[i].getDescripcion(),
                                        inventario[i].getMarca(),
                                        inventario[i].getProcesador(),
                                        inventario[i].getRam(),
                                        inventario[i].getAlmacenamiento(),
                                        inventario[i].getCantidad()
            });                           
        }

      public void redimensionar(int x){
    
        equipo[] aux = new equipo[inventario.length+x];
        
        if (x==1) {
            for (int i = 0; i < inventario.length; i++) {
                aux[i]=inventario[i];
            }
        }
    }
          
    }
    
    public void limpiar(){
    
        txtcodigo.setText("");
        txtcodigo.requestFocus();
        txtdescripcion.setText("");
        txtmarca.setText("");
        txtprocesador.setText("");
        txtram.setText("");  
        txtalmacenamiento.setText("");
        txtcantidad.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprocesador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtram = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtalmacenamiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Registro inventario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Código:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 30));

        txtdescripcion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 190, 70));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtmarca.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Procesador:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        txtprocesador.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprocesadorActionPerformed(evt);
            }
        });
        getContentPane().add(txtprocesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 190, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("RAM(GB):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtram.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtramActionPerformed(evt);
            }
        });
        getContentPane().add(txtram, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Almacenamiento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        txtalmacenamiento.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtalmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalmacenamientoActionPerformed(evt);
            }
        });
        getContentPane().add(txtalmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 40, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Cantidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        txtcantidad.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 40, 30));

        btneliminar.setBackground(new java.awt.Color(255, 51, 0));
        btneliminar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        btnagregar.setBackground(new java.awt.Color(0, 153, 255));
        btnagregar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarMouseClicked(evt);
            }
        });
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        btnactualizar.setBackground(new java.awt.Color(51, 204, 0));
        btnactualizar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("Actualizar");
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        tblinventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblinventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 560, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprocesadorActionPerformed

    private void txtramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtramActionPerformed

    private void txtalmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalmacenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalmacenamientoActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseClicked
       
        int codigo,cantidad,ram,almacenamiento;
        String descripcion, procesador,marca;
        
        descripcion = txtdescripcion.getText();
        procesador = txtprocesador.getText();
        marca = txtmarca.getText();
        
        codigo = Integer.parseInt(txtcodigo.getText());
        cantidad = Integer.parseInt(txtcantidad.getText());
        ram = Integer.parseInt(txtram.getText());
        almacenamiento = Integer.parseInt(txtalmacenamiento.getText());
        
        agregar( codigo, descripcion, procesador, marca, cantidad, ram, almacenamiento);
        mostrar();
        limpiar();
    }//GEN-LAST:event_btnagregarMouseClicked

      
    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         
       modelo.removeRow(tblinventario.getSelectedRow());
    }

      
    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    /**
     * @param args the command line arguments
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblinventario;
    private javax.swing.JTextField txtalmacenamiento;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtprocesador;
    private javax.swing.JTextField txtram;
    // End of variables declaration//GEN-END:variables
}
