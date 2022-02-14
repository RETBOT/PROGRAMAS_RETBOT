/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmailler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AppMailerGUI extends javax.swing.JFrame {
    
   // almacenar el nombre, correo y contraseña 
   private final String correo;
   private final String contrasena;

   // en caso de mandar un archivo se almacena la direccion y nombre
   private String arch;
   private String nom;
   
   // clase para guardar el archivo a enviar
   JFileChooser jfch = new JFileChooser(); 
   
   // seleccion de gmail o hotmail
   int seleccion;
   
   // llega el correo, la contraseña y la seleccion del login
   public AppMailerGUI(String nombre, String corr, String contra, int sele) { 
        initComponents();
        // icono para aplicacion 
        setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
      
        // se almacena el correo, contraseña y la seleccion para el correo a enviar
        correo = corr;
        contrasena = contra;
        seleccion = sele;
        
        // se muestra en el frame el nombre y el correo electronico usados
        jLabNombre.setText("Nombre: "+nombre);
        jLabCorreo.setText("Correo electronico: "+corr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextPara = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAsunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckOculto = new javax.swing.JCheckBox();
        jLabNombre = new javax.swing.JLabel();
        jLabCorreo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextTexto = new javax.swing.JTextArea();
        jButAdd = new javax.swing.JButton();
        jTextRuta = new javax.swing.JTextField();
        jButCancelar = new javax.swing.JButton();
        jButEnviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuLogin = new javax.swing.JMenuItem();
        jMenuGuardarDestinatarios = new javax.swing.JMenuItem();
        jMenuAbrirDestinatarios = new javax.swing.JMenuItem();
        jMenuGuardarAMA = new javax.swing.JMenuItem();
        jMenuAbrirAMA = new javax.swing.JMenuItem();
        jMenuBorrar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensaje nuevo");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Destinatario(s): ");

        jTextPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextParaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Asunto:");

        jTextAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAsuntoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("En caso de enviar el mensaje a varios correos separelos por ; y sin espacios");

        jCheckOculto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckOculto.setText("Mensaje oculto");
        jCheckOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckOcultoActionPerformed(evt);
            }
        });

        jLabNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabNombre.setText("Nombre:   ");

        jLabCorreo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jLabCorreo.setText("Correo electronico: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextPara, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                    .addComponent(jTextAsunto))
                                .addGap(18, 18, 18)
                                .addComponent(jCheckOculto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabCorreo)
                    .addComponent(jLabNombre))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckOculto))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jTextTexto.setColumns(20);
        jTextTexto.setRows(5);
        jScrollPane1.setViewportView(jTextTexto);

        jButAdd.setText("Archivo adjunto");
        jButAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAddActionPerformed(evt);
            }
        });

        jButCancelar.setText("Cancelar");
        jButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelarActionPerformed(evt);
            }
        });

        jButEnviar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButEnviar.setText("Enviar");
        jButEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEnviarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mensaje :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 586, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButAdd)
                    .addComponent(jTextRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuOpciones.setText("Opciones");

        jMenuLogin.setText("Cambiar correo");
        jMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoginActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuLogin);

        jMenuGuardarDestinatarios.setText("Guardar destinatario(s)");
        jMenuGuardarDestinatarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarDestinatariosActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuGuardarDestinatarios);

        jMenuAbrirDestinatarios.setText("Abrir destinatario(s)");
        jMenuAbrirDestinatarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirDestinatariosActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuAbrirDestinatarios);

        jMenuGuardarAMA.setText("Guardar asunto,mensaje y adjunto");
        jMenuGuardarAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarAMAActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuGuardarAMA);

        jMenuAbrirAMA.setText("Abrir asunto,mensaje y adjunto ");
        jMenuAbrirAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirAMAActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuAbrirAMA);

        jMenuBorrar.setText("Borrar todo");
        jMenuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBorrarActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuBorrar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuSalir);

        jMenuBar1.add(jMenuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAddActionPerformed
        // se utiliza la clase JFileChooser para buscar en la computadora el archivo a enviar y no tener que escribirlo 
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this); // se abre la ventana 
        if (option == JFileChooser.APPROVE_OPTION) { // se selecciona la opcion 
            arch = dlg.getSelectedFile().getPath(); // se almacena el archivo 
            nom = dlg.getSelectedFile().getName(); // y el nombre 
            jTextRuta.setVisible(true); // se pone visible a la jText de la ruta 
            jTextRuta.setText(arch); // se pone el archivo 
            jTextRuta.setEditable(false); // se quita lo editable al jText de la ruta 
        }
    }//GEN-LAST:event_jButAddActionPerformed

    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
       // cancelar el documento a enviar 
       jTextRuta.setText(""); // se quita el texto de la ruta 
       jTextRuta.setVisible(false); // se quita la visibilidad de la ruta 
    }//GEN-LAST:event_jButCancelarActionPerformed

    private void jButEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEnviarActionPerformed
        // en caso de enviar un correo en oculto 
        boolean oculto = jCheckOculto.isSelected(); 
        // usando la clase Envio, se asignan los datos de el destino, el ausnto, 
        // el texto de el mensaje, el correo y contraseña 
        Envio mensaje;
        if(jTextPara.getText().length()>0){ // se valida que el destinatario tenga información 
            if(jTextAsunto.getText().length()>0){ // se valida que el asunto tenga información 
        mensaje = new Envio(jTextPara.getText(),jTextAsunto.getText(),
                                  jTextTexto.getText(),correo,contrasena,seleccion);
        // se usa el if para verificar si el correo va a tener un archivo adjunto
        // o no 
        if(jTextRuta.getText().length()>0){ 
         mensaje.mensajeAdjunto(jTextRuta.getText(),oculto); // en caso de tener un archivo adjunto
                                                    // se usa el metodo de mensaje adjunto 
         }else 
          mensaje.mensaje(oculto); // si es un mensaje normal, se usa el metodo de mensaje
         }else{// si el asunto no tiene informacion se notificara al usuario
          JOptionPane.showMessageDialog(null, "Ingrese el asunto"); 
         }}else // en caso de no tener destinatario se notificara al usuario 
            JOptionPane.showMessageDialog(null, "Ingrese el destinatario");
    }//GEN-LAST:event_jButEnviarActionPerformed

    private void jMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoginActionPerformed
        // Para cambiar de contraseña  
        this.setVisible(false); // se cierra la ventana del Frame actual 
        Login l = new Login(); // se crea un nuevo Frame de Login 
        l.setVisible(true); // se pone visible 
    }//GEN-LAST:event_jMenuLoginActionPerformed

    private void jCheckOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckOcultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckOcultoActionPerformed

    private void jMenuGuardarDestinatariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarDestinatariosActionPerformed
        // guardar los correos electronicos 
        if(jfch.showSaveDialog(null)!=0) // se habre la ventana 
           return;
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
           try {
             //clase Escritura para guardar la cadena 
             fw = new FileWriter(jfch.getSelectedFile());
             pw = new PrintWriter(fw);
            //grabar los correos en un txt
            pw.println(jTextPara.getText());
            
        } catch (IOException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            //cerrar los archivos, se pueden dañar y puede que no se guarden
            if(pw!=null)
            pw.close();
            
            try {
                if(fw!=null)
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jMenuGuardarDestinatariosActionPerformed

    private void jMenuGuardarAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarAMAActionPerformed
       // guardar el asunto, el mensaje y la ruta 
        if(jfch.showSaveDialog(null)!=0)
           return;
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
           try {
             //clase Escritura para guardar la cadena  
             fw = new FileWriter(jfch.getSelectedFile());
             pw = new PrintWriter(fw);
             
//         grabar el asunto
            pw.println(jTextAsunto.getText()); 
            // se guarda el tamaño del mensaje 
            pw.println(jTextTexto.getLineCount());
            // se guarda el mensaje
            pw.println(jTextTexto.getText());
            // se guarda la ruta
            pw.println(jTextRuta.getText());

            
        } catch (IOException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            //cerrar los archivos, se pueden dañar y no se graben
            if(pw!=null)
            pw.close();
            
            try {
                if(fw!=null)
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jMenuGuardarAMAActionPerformed

    private void jMenuAbrirDestinatariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirDestinatariosActionPerformed
     // abrir correos electronicos 
     if(jfch.showOpenDialog(null)!=0)
           return;
        
        FileReader fr = null;
        BufferedReader br = null;   
        try {
            // clase para lectura de archivos de texto 
            fr = new FileReader(jfch.getSelectedFile());
            br = new BufferedReader(fr);
            
            // se leen los correos y se insertan en el jText
            jTextPara.setText(br.readLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(br!=null)
                    br.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException ex) {
                Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuAbrirDestinatariosActionPerformed

    private void jMenuAbrirAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirAMAActionPerformed
        // abrir mensajes guardados
         if(jfch.showOpenDialog(null)!=0)
           return;
        
        FileReader fr = null;
        BufferedReader br = null;   
        try {
            // clase de lectura para los archivos de texto 
            fr = new FileReader(jfch.getSelectedFile());
            br = new BufferedReader(fr);
            
//             se leen los datos y se insertan
            // se inserta el asunto 
            jTextAsunto.setText(br.readLine());
           
            // es importante tener el tamaño del mensaje guardado 
            // ya que de lo contrario solo insertamos una sola linea de todo el
            // mensaje a enviar 
            int tamaño = Integer.parseInt(br.readLine());
            System.out.println("Tamaño "+tamaño);
            
            String mensaje = "";
            for(int i=0;i<tamaño;i++){
            mensaje += br.readLine()+"\n";
            }
            // se inserta el mensaje
            jTextTexto.setText(mensaje);
            // se inserta la ruta del archivo adjunto
            jTextRuta.setText(br.readLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(br!=null)
                    br.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException ex) {
                Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuAbrirAMAActionPerformed

    private void jMenuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBorrarActionPerformed
     // borrar el correo electronico
     jTextPara.setText("");
     // borrar el asunto
     jTextAsunto.setText("");
     // borrar el mensaje
     jTextTexto.setText("");
     //borrar el archivo adjunto 
     jTextRuta.setText("");
    }//GEN-LAST:event_jMenuBorrarActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
      // salir de la app
      System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jTextParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextParaActionPerformed
        // al darle enter se selecciona el asunto
        jTextAsunto.requestFocus();
    }//GEN-LAST:event_jTextParaActionPerformed

    private void jTextAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAsuntoActionPerformed
       // al darle enter se selecciona el mensaje
       jTextTexto.requestFocus();
    }//GEN-LAST:event_jTextAsuntoActionPerformed

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
            java.util.logging.Logger.getLogger(AppMailerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMailerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMailerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMailerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMailerGUI("","","",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAdd;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JButton jButEnviar;
    private javax.swing.JCheckBox jCheckOculto;
    private javax.swing.JLabel jLabCorreo;
    private javax.swing.JLabel jLabNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuAbrirAMA;
    private javax.swing.JMenuItem jMenuAbrirDestinatarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBorrar;
    private javax.swing.JMenuItem jMenuGuardarAMA;
    private javax.swing.JMenuItem jMenuGuardarDestinatarios;
    private javax.swing.JMenuItem jMenuLogin;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAsunto;
    private javax.swing.JTextField jTextPara;
    private javax.swing.JTextField jTextRuta;
    private javax.swing.JTextArea jTextTexto;
    // End of variables declaration//GEN-END:variables
}
