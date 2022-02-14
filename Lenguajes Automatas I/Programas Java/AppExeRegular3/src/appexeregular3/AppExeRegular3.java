/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexeregular3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class AppExeRegular3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "aaaabc";
        System.out.println("1.- Comprobar si la cadena contiene exactamente el patron \"abc\" ");
        Pattern patron = Pattern.compile("abc");
        Matcher matcher = patron.matcher(cadena);
        
        if(matcher.matches())
            System.out.println("Coincide");
        else 
            System.out.println("No coincide");
        
        
        String cadena1 = "aaaabcedario";
        System.out.println("2.- Comprobar si la cadena contiene exactamente el patron \"abc\" ");
        Pattern patron1 = Pattern.compile(".*abc.*");
        Matcher matcher1 = patron1.matcher(cadena1);
        
        if(matcher1.matches())
            System.out.println("Coincide");
        else 
            System.out.println("No coincide");
        
        
        String cadena2 = "abcedario";
        System.out.println("3.- Comprobar si la cadena inicia con las letras \"abc\" ");
        String cadenaPatron = "^abc.*";
        Pattern patron2 = Pattern.compile(cadenaPatron);
        Matcher matcher2 = patron2.matcher(cadena2);
        
        if(matcher2.matches())
            System.out.println("Coincide");
        else 
            System.out.println("No coincide");
        
        String cadena3 = "Abcedario";
        System.out.println("4.- Comprobar si la cadena inicia con las letras \"a o A y sigue con bc\" y cualquier cantidad de cadenas");
        String cadenaPatron2 = "^a|Abc.*";
        Pattern patron3 = Pattern.compile(cadenaPatron2);
        Matcher matcher3 = patron3.matcher(cadena3);
        
        if(matcher3.matches())
            System.out.println("Coincide");
        else 
            System.out.println("No coincide");
        
        
        
        //String cadena4 = "Acde o abcde"; // cadenas validas 
        String cadena4 = "abbbbbbbbbbbbbbcde"; // cadenas validas 
        System.out.println("4. Cadenas validas : Acde o abcde");
        String cadenaPatron3 = "^a|Ab?c.*";
        Pattern patron4 = Pattern.compile(cadenaPatron3);
        Matcher matcher4 = patron4.matcher(cadena4);
        /*
        if(matcher4.matches())
            System.out.println("Coincide");
        else 
            System.out.println("No coincide");
         */
       if(matcher4.find())
            System.out.println("Coincide "+matcher4.group(0));
        else 
            System.out.println("No coincide "+matcher4.group(0));
       
       
    }
    
}
