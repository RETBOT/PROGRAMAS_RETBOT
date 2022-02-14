package pa_2019_11_21_aplicaciondibujo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaronaj
 */
public class PA_19130519_Frame_01 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDibujo
     */
    PA_19130519_Frame_01 f;
    public PA_19130519_Frame_01() {
        initComponents();
        jRadioFrame.setSelected(true);
    }
    
    public void dibujar(int x, Component componente)
    {
        Graphics hoja = componente.getGraphics();
        
        // "borrando"
        hoja.setColor(componente.getBackground());
        hoja.fillRect(5, 70, componente.getWidth()-10, 135);
        
        hoja.setColor(Color.blue);
        hoja.drawRect(x+15, 70, 100, 50);
        hoja.drawRect(x+15, 120, 150, 40);
        hoja.setColor(Color.black);
        hoja.fillRect(x+20, 75, 90 , 40);
        hoja.setColor(Color.black);
        hoja.fillRect(x+20, 125, 140, 30);
        hoja.setColor(Color.white);
        hoja.drawString("Tec Laguna", x+30, 100);
        hoja.setColor(Color.red);
        hoja.drawLine(x+15, 130, x+165, 130);
        hoja.drawLine(x+15, 140, x+165, 140);
        hoja.drawLine(x+15, 150, x+165, 150);
        hoja.setColor(Color.black);
        hoja.fillOval(x+35, 160, 20, 20);
        hoja.fillOval(x+125, 160, 20, 20);
        
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void dibujarSillon(int x, Component componente){
       Graphics hoja = componente.getGraphics();
       
        hoja.setColor(Color.red);
        hoja.fillRect(15, 100, 30, 50); // parte lateral izquierda 
        hoja.fillRect(45, 110, 54, 20); //cojin 1
        hoja.fillRect(100, 110, 50, 20); //cojin2
        hoja.fillRect(45, 50, 105, 80); //  respaldo 
        hoja.fillRect(45, 130, 105, 20); // centro 
        hoja.fillRect(150, 100, 30, 50); // parte lateral derecha
        hoja.setColor(Color.white);
        hoja.fillRect(19, 150, 20, 10); // pata izquierda 
        hoja.fillRect(154, 150, 20, 10); // pata derecha 
       
        
        
       hoja.setColor(Color.black);
        hoja.drawRect(15, 100, 30, 50); // parte lateral izquierda 
        hoja.drawRect(19, 150, 20, 10); // pata izquierda 
        hoja.drawRect(45, 110, 54, 20); //cojin 1
        hoja.drawRect(100, 110, 50, 20); //cojin2
        hoja.drawRect(45, 50, 105, 80); //  respaldo 
        hoja.drawRect(45, 130, 105, 20); // centro 
        hoja.drawRect(150, 100, 30, 50); // parte lateral derecha
        hoja.drawRect(154, 150, 20, 10); // pata derecha
    
    }
    
    
    public void dibujarVertical(int y, Component componente)
    {
        Graphics hoja = componente.getGraphics();
        
        // "borrando"
        hoja.setColor(this.getBackground());
        hoja.fillRect(5, 70, 200, 390);
        
        hoja.setColor(Color.blue);
        hoja.drawRect(15, 70+y, 100, 50);
        hoja.drawRect(15, 120+y, 150, 40);
        hoja.setColor(Color.black);
        hoja.fillRect(20, 75+y, 90 , 40);
        hoja.setColor(Color.black);
        hoja.fillRect(20, 125+y, 140, 30);
        hoja.setColor(Color.white);
        hoja.drawString("Tec Laguna", 30, 100+y);
        hoja.setColor(Color.red);
        hoja.drawLine(15, 130+y, 165, 130+y);
        hoja.drawLine(15, 140+y, 165, 140+y);
        hoja.drawLine(15, 150+y, 165, 150+y);
        hoja.setColor(Color.black);
        hoja.fillOval(35, 160+y, 20, 20);
        hoja.fillOval(125, 160+y, 20, 20);
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void dibujarDiagonal(int x,int y, Component componente)
    {
        Graphics hoja = componente.getGraphics();
        
        // "borrando"
        hoja.setColor(componente.getBackground());
        hoja.fillRect(5, 70, componente.getWidth(), componente.getHeight());
        
        hoja.setColor(Color.blue);
        hoja.drawRect(x+15, y+70, 100, 50);
        hoja.drawRect(x+15, y+120, 150, 40);
        hoja.setColor(Color.black);
        hoja.fillRect(x+20, y+75, 90 ,40);
        hoja.setColor(Color.black);
        hoja.fillRect(x+20, y+125, 140, 30);
        hoja.setColor(Color.white);
        hoja.drawString("Tec Laguna", x+30, y+100);
        hoja.setColor(Color.red);
        hoja.drawLine(x+15, y+130, x+165, y+130);
        hoja.drawLine(x+15, y+140, x+165, y+140);
        hoja.drawLine(x+15, y+150, x+165, y+150);
        hoja.setColor(Color.black);
        hoja.fillOval(x+35, y+160, 20, 20);
        hoja.fillOval(x+125, y+160, 20, 20);
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jButDibujar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButMover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioFrame = new javax.swing.JRadioButton();
        jRadioPanel = new javax.swing.JRadioButton();
        jRadioBoton = new javax.swing.JRadioButton();
        jRadioOtro = new javax.swing.JRadioButton();
        jButVertical = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButEntrar = new javax.swing.JButton();
        jButDiagonal = new javax.swing.JButton();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButDibujar.setText("Dibujar");
        jButDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDibujarActionPerformed(evt);
            }
        });

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jButMover.setText("Mover");
        jButMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMoverActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("jButton1");

        buttonGroup1.add(jRadioFrame);
        jRadioFrame.setText("Frame");

        buttonGroup1.add(jRadioPanel);
        jRadioPanel.setText("Panel");

        buttonGroup1.add(jRadioBoton);
        jRadioBoton.setText("Boton");

        buttonGroup1.add(jRadioOtro);
        jRadioOtro.setText("Otro Frame");

        jButVertical.setText("Vertical");
        jButVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButVerticalActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Diagrama de clase ");
        jLabel1.setOpaque(true);

        jButEntrar.setText("Entrar");
        jButEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEntrarActionPerformed(evt);
            }
        });

        jButDiagonal.setText("Diagonal");
        jButDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDiagonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButDibujar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButMover)
                .addGap(34, 34, 34)
                .addComponent(jRadioFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButVertical)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButDiagonal)
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButDibujar)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButMover))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioFrame)
                            .addComponent(jRadioPanel)
                            .addComponent(jRadioBoton)
                            .addComponent(jRadioOtro)
                            .addComponent(jButVertical)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButEntrar)
                            .addComponent(jButDiagonal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDibujarActionPerformed
        // TODO add your handling code here:
        dibujarSillon(100,jPanel1);
    }//GEN-LAST:event_jButDibujarActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int x = (int)jSpinner1.getValue();
        dibujar(x,this);
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMoverActionPerformed
        // TODO add your handling code here:
        Component comp = null;
        
        if(jRadioFrame.isSelected())
            comp = this;
        
        if(jRadioOtro.isSelected())
        {
            f = new PA_19130519_Frame_01();
           f.setVisible(true);
           comp = f;
        }
        
        if(jRadioPanel.isSelected())
            comp = jPanel1;
        
        if(jRadioBoton.isSelected())
            comp = jButton1;  
                    
        for(int i=0; i<=200; i+=3){
            dibujar(i,comp);
        }
        f.setVisible(false);
    }//GEN-LAST:event_jButMoverActionPerformed

    private void jButVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButVerticalActionPerformed
        // TODO add your handling code here:
        for(int i=0; i<=200; i+=3)
            dibujarVertical(i,this);
    }//GEN-LAST:event_jButVerticalActionPerformed

    private void jButEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEntrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         PA_19130519_Frame_01a frameDiag = new  PA_19130519_Frame_01a(this);//this: para grabar en el mismo menu y no crear un nuevo registro 
        frameDiag.setVisible(true);
    }//GEN-LAST:event_jButEntrarActionPerformed

    private void jButDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDiagonalActionPerformed
        // TODO add your handling code here:
        Component comp = null;
        
        if(jRadioFrame.isSelected())
            comp = this;
        
        if(jRadioOtro.isSelected())
        {
         f = new PA_19130519_Frame_01();
           f.setVisible(true);
           comp = f;
        }
        
        if(jRadioPanel.isSelected())
            comp = jPanel1;
        
        if(jRadioBoton.isSelected())
            comp = jButton1;  
        
        int i=0,j=0;
        for(int a=0; a<=300; a++){
        i+=1;
        j+=1;
        dibujarDiagonal(i,j,comp);
        }  
        
      f.setVisible(false);
    }//GEN-LAST:event_jButDiagonalActionPerformed

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
            java.util.logging.Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_19130519_Frame_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButDiagonal;
    private javax.swing.JButton jButDibujar;
    private javax.swing.JButton jButEntrar;
    private javax.swing.JButton jButMover;
    private javax.swing.JButton jButVertical;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBoton;
    private javax.swing.JRadioButton jRadioFrame;
    private javax.swing.JRadioButton jRadioOtro;
    private javax.swing.JRadioButton jRadioPanel;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
