/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_31_aplicacionparalelepipedoprivate;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextBase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAltura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextProfundidad = new javax.swing.JTextField();
        jButCrear = new javax.swing.JButton();
        jButAleatorios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabPerimetro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabArea = new javax.swing.JLabel();
        jLabVolumen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabObjeto = new javax.swing.JLabel();
        jButOtra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Base");

        jLabel2.setText("Altura");

        jLabel3.setText("Profundidad");

        jButCrear.setText("Crear objeto");
        jButCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCrearActionPerformed(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jLabel4.setText("Perimetro");

        jLabPerimetro.setBackground(new java.awt.Color(153, 255, 153));
        jLabPerimetro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabPerimetro.setOpaque(true);

        jLabel6.setText("Area");

        jLabArea.setBackground(new java.awt.Color(153, 255, 153));
        jLabArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabArea.setOpaque(true);

        jLabVolumen.setBackground(new java.awt.Color(153, 255, 153));
        jLabVolumen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabVolumen.setOpaque(true);

        jLabel9.setText("Volumen");

        jLabObjeto.setBackground(new java.awt.Color(153, 255, 153));
        jLabObjeto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabObjeto.setOpaque(true);

        jButOtra.setText("Otra validacion");
        jButOtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabArea, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextBase, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButOtra)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButAleatorios)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButOtra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();

        int n = azar.nextInt(3);

       jTextAltura.setText("");
       jTextProfundidad.setText(""); 
       if(azar.nextInt(10)>7)
            jTextBase.setText(azar.nextInt(100) + "");
        
        if (azar.nextInt(10)>6) {
            jTextAltura.setText(azar.nextInt(100) + "");
        }
        if (azar.nextInt(10)>5)
        jTextProfundidad.setText(azar.nextInt(100)+"");
           

    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCrearActionPerformed
        // TODO add your handling code here:
        jLabArea.setText("");
        jLabPerimetro.setText("");
        jLabVolumen.setText("");
        jLabObjeto.setText("");
        
        if(!jTextBase.getText().equals("")&& !jTextAltura.getText().equals("") && !jTextProfundidad.getText().equals("")){
            Paralelepipedo p = new Paralelepipedo(Double.parseDouble(jTextBase.getText()),
                                                  Double.parseDouble(jTextAltura.getText()),
                                                  Double.parseDouble(jTextProfundidad.getText()));
        
            jLabArea.setText(p.area()+"");
            jLabVolumen.setText(p.volumen()+"");
            jLabPerimetro.setText(p.perimetro()+"");
            jLabObjeto.setText(p.toString());
        }
        else 
            if(!jTextBase.getText().equals("")&& !jTextAltura.getText().equals("")){
            Rectangulo r = new Rectangulo(Double.parseDouble(jTextBase.getText()), Double.parseDouble(jTextAltura.getText()));
        
            jLabArea.setText(r.area()+"");
            jLabPerimetro.setText(r.perimetro()+"");
            jLabObjeto.setText(r.toString());
        }
        else 
            if(!jTextBase.getText().equals("")){
            Linea l = new Linea(Double.parseDouble(jTextBase.getText()));
        
            jLabObjeto.setText(l.toString());
        }
        
        
    }//GEN-LAST:event_jButCrearActionPerformed

    private void jButOtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOtraActionPerformed
        // TODO add your handling code here:
        
        double base,altura,prof;
        
        jLabArea.setText("");
        jLabPerimetro.setText("");
        jLabVolumen.setText("");
        jLabObjeto.setText("");
        
        String opciones = "";
        
        try{
        base = Double.parseDouble(jTextBase.getText());
        opciones = opciones +"1";
        
        }catch(Exception ex){
        opciones = opciones +"0";
        }
        try{
        altura = Double.parseDouble(jTextAltura.getText());
        opciones = opciones +"1";
        
        }catch(Exception ex){
        opciones = opciones +"0";
        }
        try{
        prof = Double.parseDouble(jTextProfundidad.getText());
        opciones = opciones +"1";
        
        }catch(Exception ex){
        opciones = opciones +"0";
        }
//        JOptionPane.showMessageDialog(rootPane, opciones);
        switch(opciones){
            case "100":  
                Linea l = new Linea(Double.parseDouble(jTextBase.getText()));
                jLabObjeto.setText(l.toString());
                break; 
            case "110":
                 Rectangulo r = new Rectangulo(Double.parseDouble(jTextBase.getText()), Double.parseDouble(jTextAltura.getText()));
            
            jLabArea.setText(r.area()+"");
            jLabPerimetro.setText(r.perimetro()+"");
            jLabObjeto.setText(r.toString());
            break;
            case "111":
                Paralelepipedo p = new Paralelepipedo(Double.parseDouble(jTextBase.getText()),
                                                  Double.parseDouble(jTextAltura.getText()),
                                                  Double.parseDouble(jTextProfundidad.getText()));
            jLabArea.setText(p.area()+"");
            jLabVolumen.setText(p.volumen()+"");
            jLabPerimetro.setText(p.perimetro()+"");
            jLabObjeto.setText(p.toString());
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Datos no validos....");
        }
    }//GEN-LAST:event_jButOtraActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCrear;
    private javax.swing.JButton jButOtra;
    private javax.swing.JLabel jLabArea;
    private javax.swing.JLabel jLabObjeto;
    private javax.swing.JLabel jLabPerimetro;
    private javax.swing.JLabel jLabVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextBase;
    private javax.swing.JTextField jTextProfundidad;
    // End of variables declaration//GEN-END:variables
}
