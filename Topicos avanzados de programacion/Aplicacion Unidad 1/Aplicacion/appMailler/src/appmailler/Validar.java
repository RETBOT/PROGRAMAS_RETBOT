
package appmailler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar{ // clase para la validacion del correo y contraseña
    
     public static boolean correoValido(String email){ 
        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
        "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        
        Pattern pattern = Pattern.compile(emailPattern);
        
        if(email != null){ // verifica que la cadena enviada no sea nula
           Matcher matcher = pattern.matcher(email);  // verifica que el correo sea valido 
            if(matcher.matches()) 
                return true;  // si es valido retorna un verdadero 
            else
                return false; // si no es valido retorna un falso 
        }
        return false;  // si la cadena ees nula se envia un falso 
    }
    
        /*  ^ espesifica el inicio de la entrada 
        [_a-z0-9-]) primer grupo. Se refiere a la aparición de uno o más caracteres 
        compuestos por guión bajo, letras, números y guiones.

        (\.[_a-z0-9-]) segundo grupo. Puede ser opcional y repetible, se refiere a la 
        aparición de un punto seguido de uno o más caracteres compuestos por guión bajo, 
        letras, números y guiones.

        *@ carácter arroba.

        ([a-z0-9-]) tercer grupo. Especifica la aparición de uno o más caracteres 
        compuestos por letras, números y guiones.

        (\.[a-z0-9-]) cuarto grupo. Especifica un punto seguido de uno o más caracteres 
        compuestos por letras, números y guiones.

        (\.[a-z]{2,4}) quinto grupo. Especifica un punto seguido de entre 2 y 4 letras, 
        con el fin de considerar dominios terminados, por ejemplo, en .com y .info 
        (puedes modificar el numero de caracteres segun tus necesidades).

        $ especifica el fin de la entrada.
       */
       
    
    /*        
    // Clase para verificar el correo electronico entrando a gmail y verificando
    // que el correo y la contraseña se valido
    
    // atributos de la clase 
    private JTextField correo; // entrada del correo por el jText
    private JPasswordField contrasena; // entrada del correo por el JPassword
    private String mail, passs; // variables para guardar la informacion 
    private boolean valido = false; // variable para verificar si el correo y 
                                    // contraseña son validos o no 
    
    // constructores para la clase
    public Validar(){ // constructor vacío
        this.correo = null;
        this.contrasena = null;
        mail = "No-ID";
        passs = "No-ID";
    }
    
    public Validar(JTextField corr, JPasswordField cont){ // constructor con la infromacion del usuario 
        this.correo = corr;
        this.contrasena = cont;
        mail = correo.getText();
        passs = contrasena.getText();
    }
    
    // metodo para validar el correo y contraseña 
    public void valida() {
      // inicializa los paquetes de gmail 
      Properties propiedad = new Properties(); 
          propiedad.setProperty("mail.smtp.auth","true");  
          propiedad.setProperty("mail.smtp.starttls.enable","true"); 
          propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
          propiedad.setProperty("mail.smtp.port", "587");
          
          //inicializa la session de gmail 
          Session sesion = Session.getDefaultInstance(propiedad, new Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication(){ 
                 return new PasswordAuthentication(mail,passs);
                }
             });

        try {
            // verifica si el correo de la session es valido
            valido = true;
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(mail,passs); // conecta con gmail y si el correo dado no es correcto manda al error
            transporte.close(); // se cierra la session 
            
        } catch (AddressException ex) {
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            // si la contraseña o el correo estan mal, valido se hace falso 
            valido = false;
            // la contraseña se borra 
             contrasena.setText("");
             // y notifica el error 
            Logger.getLogger(AppMailerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    // metodo que verifica si el correo y la contraseña son validos 
    public boolean correoValido(){
    return valido; // retorna, verdadero si el correo y contraseña son validos
                   // y si estan mal retorna falso 
    }
    */
}
