/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_04_aplicacionempleadosherencia;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class JFrameReporte extends javax.swing.JFrame {

    /**
     * Creates new form JFrameReporte
     */
    JFrameMenu frameMenu;

    Empleado[] copia;

    DefaultTableModel modelo;

    public JFrameReporte(JFrameMenu jfMenu) {
        initComponents();

        frameMenu = jfMenu;

        jLabRegistrados.setText(frameMenu.getEmpleadosRegistrados() + "");

        modelo = (DefaultTableModel) jTableEmpleados.getModel(); //obener el modelo 

        copia = new Empleado[frameMenu.getEmpleadosRegistrados()];

        modelo.setRowCount(copia.length);

        for (int i = 0; i < copia.length; i++) {
            copia[i] = frameMenu.getEmpleado(i);
        }

        mostrar();

    }

    public void mostrar() {//recorrer y poner la copia 
        for (int r = 0; r < copia.length; r++) {
           for(int c =0; c<modelo.getColumnCount();c++)
            modelo.setValueAt(null,r,c);
            modelo.setValueAt(copia[r].getNumero(), r, 0);
            modelo.setValueAt(copia[r].getNombre(), r, 1);
          
            if (copia[r] instanceof Taller) {  //insranceof oregunta si es de la clase taller
                Taller t = (Taller) copia[r]; //acemos un cast a taller para combertirlo 
                modelo.setValueAt(t.getPiezas(),r,2);
                modelo.setValueAt(t.getPrecioPieza(),r,3); 
            }
            
            if(copia[r] instanceof Administrativo){
            Administrativo a = (Administrativo)copia[r];
            modelo.setValueAt(a.getDiasTrabajados(),r,4);
            modelo.setValueAt(a.getSueldoDiario(),r,5);
            }
            
            if(copia[r] instanceof Ventas){
            Ventas v = (Ventas)copia[r];
            modelo.setValueAt(v.getImporteVentas(),r,6);
            modelo.setValueAt(v.getComision(),r,7);
            }
            
            if(copia[r] instanceof Ejecutivo){
            Ejecutivo e = (Ejecutivo)copia[r];
            modelo.setValueAt(e.getDiasTrabajados(),r,4);
            modelo.setValueAt(e.getSueldoDiario(),r,5);
            modelo.setValueAt(e.getBono(),r,8);
            }
            
            modelo.setValueAt(copia[r].sueldo(), r, 9);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabRegistrados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jButAlfabetico = new javax.swing.JButton();
        jButSueldo = new javax.swing.JButton();
        jButOriginal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButRegresar.setText("Regresar");
        jButRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Empleados registrados");

        jLabRegistrados.setBackground(new java.awt.Color(51, 255, 153));
        jLabRegistrados.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabRegistrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabRegistrados.setOpaque(true);

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Piezas", "$Piezas", "Dias Trab", "Sueldo dia", "Ventas", "Comision", "Bono", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableEmpleados.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jButAlfabetico.setText("Alfabetico");
        jButAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAlfabeticoActionPerformed(evt);
            }
        });

        jButSueldo.setText("Por sueldo");
        jButSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSueldoActionPerformed(evt);
            }
        });

        jButOriginal.setText("Original");
        jButOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOriginalActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de empleados");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButAlfabetico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSueldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButOriginal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButRegresar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButAlfabetico)
                        .addComponent(jButSueldo)
                        .addComponent(jButOriginal))
                    .addComponent(jLabRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frameMenu.setVisible(true);
    }//GEN-LAST:event_jButRegresarActionPerformed

    private void jButAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAlfabeticoActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < copia.length; i++) {
            for (int j = i+1; j < copia.length; j++) {
                if(copia[i].getNombre().compareTo(copia[j].getNombre())>0){
                Empleado aux = copia[i];
                copia[i] = copia[j];
                copia[j]=aux;
                }
            }
        }
        mostrar();
    }//GEN-LAST:event_jButAlfabeticoActionPerformed

    private void jButSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSueldoActionPerformed
        // TODO add your handling code here:
                for (int i = 0; i < copia.length; i++) {
            for (int j = i+1; j < copia.length; j++) {
                if(copia[i].sueldo()< copia[j].sueldo()){
                Empleado aux = copia[i];
                copia[i] = copia[j];
                copia[j]=aux;
                }
            }
        }
        mostrar();
    }//GEN-LAST:event_jButSueldoActionPerformed

    private void jButOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOriginalActionPerformed
        // TODO add your handling code here:
       for (int i = 0; i < copia.length; i++) {
        copia[i] = frameMenu.getEmpleado(i);
        }
        mostrar();
    }//GEN-LAST:event_jButOriginalActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReporte(new JFrameMenu()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAlfabetico;
    private javax.swing.JButton jButOriginal;
    private javax.swing.JButton jButRegresar;
    private javax.swing.JButton jButSueldo;
    private javax.swing.JLabel jLabRegistrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    // End of variables declaration//GEN-END:variables
}