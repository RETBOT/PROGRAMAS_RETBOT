package appmailler;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Envio {
    // atributos de la clase
    private String destinatario; // guardar la cadena de los destinatarios 
                                 // para despues separarla 
    private String []vect;// en caso de ser mas de un correo a enviar 
                          // se crea una matriz para almacenar todos los correos 
    private String asunto,mensaje; // asunto y mensaje a enviar 
    private String correo, contrasena; // correo y contraseña 
    
    // separador de correos electronicos, la funcion de este separador es dividir
    // los correos electronicos para almacenarlos en una matriz, esto ayuda a enviar 
    // de uno en uno los mensajes a los diferentes correos electronicos 
    private String separador = ";";  
    
    // constructores de la clase 
    public Envio(){ // contrsuctror vacio 
    destinatario = null;
    asunto = null;
    mensaje = null; 
    correo = "No-ID";
    contrasena = "No-ID";
    }
    
    // contrsuctor para el llenado de la informacion 
    public Envio(String destinatario,String asunto,String mensaje, String mail,String passs){
    this.destinatario = destinatario;
    this.asunto = asunto;    
    this.mensaje = mensaje;
    this.correo = mail;
    this.contrasena = passs;
    }
    
    //metodo para envio de correo sin adjunto 
    public void mensaje(boolean oculto){ // llega un booleano para verificar si es un mensaje oculto o no
    // separa los correos electronicos mediante el split (";") 
    String[] vect = destinatario.split(separador);     
        
    // se prepara la pagina de gmail 
    Properties propiedad = new Properties();
          propiedad.setProperty("mail.smtp.auth","true");
          propiedad.setProperty("mail.smtp.starttls.enable","true");
          propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
          propiedad.setProperty("mail.smtp.port", "587");
    // se prepara la sesion para el gmail
          Session sesion = Session.getDefaultInstance(propiedad, new Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication(){ 
                 return new PasswordAuthentication(correo,contrasena);
                }
             });          
          Message mail = new MimeMessage(sesion);
          
        try {
         for(int i=0;i<vect.length;i++){ // enviamos los correos electronicos ya sea 1 o n correos 
            // correo electronico del usuario 
            mail.setFrom(new InternetAddress(correo));
            // correo electronico a enviar el mensaje, si oculto es verdadero el mensaje se envia
            // en modo oculto
            if(oculto)
               mail.addRecipient(Message.RecipientType.BCC,new InternetAddress(vect[i])); // oculta el correo
            else
               mail.addRecipient(Message.RecipientType.TO,new InternetAddress(vect[i])); // sin ocultar el correo 
            
            
            // asunto del correo 
            mail.setSubject(asunto);
            // mensaje deo correo 
            mail.setText(mensaje);
           
            // se prepara el envio del mensaje 
            Transport transporte = sesion.getTransport("smtp");
            // se conecta con la cuenta de gmail 
            transporte.connect(correo,contrasena);
            // se envia el correo
            if(oculto)
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.BCC)); // oculta el correo 
            else
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO)); // sin ocultar el correo           
            
            // se cierra el envio del mensaje 
            transporte.close();
            // notifica que el correo se envio exitosamente 
            JOptionPane.showMessageDialog(null, "Correo enviado a "+vect[i]);
        }
            
        } catch (AddressException ex) {
            // se captura el error en caso de tener un error de acceso 
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            // se notifica el error
            JOptionPane.showMessageDialog(null, "Error, verifique el correo y contraseña.");
        } catch (MessagingException ex) {
            // se captura el error en caso de tener un mensaje con errores
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            //se notifica el error
            JOptionPane.showMessageDialog(null, "Error, ocurrio un problema al enviar el correo.");
        }
    }
    
    
    //envio con archivo adjunto
    public void mensajeAdjunto(String ruta, boolean oculto){ // llega la ruta y un booleano que verifica
                                                            // si se enviara un correo oculto o no
    // separa los correos electronicos mediante el split (";") 
    String[] vect = destinatario.split(separador);        
    
    // se prepara la pagina del gmail 
    Properties propiedad = new Properties();
    propiedad.setProperty("mail.smtp.auth","true");
    propiedad.setProperty("mail.smtp.starttls.enable","true");
    propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
    propiedad.setProperty("mail.smtp.port", "587");
    // se prepara el inicio de sesion 
    Session sesion = Session.getDefaultInstance(propiedad, new Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication(){ 
                 return new PasswordAuthentication(correo,contrasena);
                }
             });
          
    // Se compone la parte del texto
    BodyPart texto = new MimeBodyPart();
        try {
        for(int i=0;i<vect.length;i++){  // enviamos los correos electronicos ya sea 1 o n correos 
            texto.setText(mensaje);
            // Se compone el adjunto con la imagen
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
                new DataHandler(new FileDataSource(ruta)));
            String nom = JOptionPane.showInputDialog("Introduce el nombre del documento: ");
            adjunto.setFileName(nom);
            JOptionPane.showMessageDialog(null, "Espere un momento, subiendo el archivo. Clic en aceptar para continuar.");
            // Clase MultiParte para agrupar texto e imagen.
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            
            // Utilizando la clase MimeMessage para el mensaje a enviar
            MimeMessage message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(vect[i])); // correos electornicos 
            
            if(oculto)
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(vect[i]));
            else
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
            
            message.setSubject(asunto); // se agrega el asunto 
            message.setContent(multiParte); // y el archivo adjunto
            
            // Se envia el correo.
            Transport t = sesion.getTransport("smtp");
            // se verifica el correo y contraseña 
            t.connect(correo,contrasena);
            // se envia el mensaje y el archivo adjunto 
            t.sendMessage(message, message.getAllRecipients());
            // se cierra el envio 
            t.close();
            // se notifica si el correo se envio correctamente 
            JOptionPane.showMessageDialog(null, "Correo enviado a "+vect[i]);
            }
          } catch (MessagingException ex) {
            // se captura el error en caso de tener un error en el mensaje 
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
            //se notifica el error
            JOptionPane.showMessageDialog(null, "Error, ocurrio un problema al enviar el correo.");
            }
        }
    }
   

