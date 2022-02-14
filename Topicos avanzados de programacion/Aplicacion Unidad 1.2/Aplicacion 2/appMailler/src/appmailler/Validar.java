
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
}
