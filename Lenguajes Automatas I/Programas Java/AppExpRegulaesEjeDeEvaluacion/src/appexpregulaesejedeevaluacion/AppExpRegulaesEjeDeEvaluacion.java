/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexpregulaesejedeevaluacion;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author admin
 */
public class AppExpRegulaesEjeDeEvaluacion {

    /**
     * Implementar un metodo para validar con una expresion regular
     * si una cadena que se recibe como parametro contiene un numero entero
     * positivo o negativo 
     */
   public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m"; 

    
    public static boolean validarNumeroEntero(String cadena){
       
        //boolean resul = cadena.matches("^-?[0-9]+$");
        //boolean resul = cadena.matches("[+|-]?\\d+$");
        boolean resul = cadena.matches("\\d+$");
        return resul;
        /*Pattern patron = Pattern.compile("-?+[0-9]");
        Matcher matcher = patron.matcher(cadena);
        
        if(matcher.matches())
            return true;
        else 
            return false;
   */
    }
    public static boolean validarNumeroEnteroNegativo(String cadena){ 
       
        boolean resul = cadena.matches("^-[0-9]+$");
        return resul;
    }
    
    //Diseñe un metodo para validad un numero de control que consta de 8 digitos
    
    public static boolean validarNumControl(String cadena){
        boolean resul = cadena.matches("[0-9]{8}$");
        return resul;
    }
    
    //Diseñe un metodo para validar un numero de control de tec laguna 
    // para los estudiantes que ingresaron en enero del 2021
    // 21130125
    // 2021
     public static boolean validarNumControl2021(String cadena){
        boolean resul = cadena.matches("^2113[0-9]{4}$");
        return resul;
    }
     // 2020
     public static boolean validarNumControl2020(String cadena){
        boolean resul = cadena.matches("^2013[0-9]{4}$");
        return resul;
    }
     
     // 2020 y 2021
//     Para estudiantes que ingresarn en: 2020 y 2021
     public static boolean validarNumControl20y21(String cadena){
        boolean resul = cadena.matches("^(2113|2013)[0-9]{4}$");
        return resul;
    }
     // diseñe un metodo para validar nombres de personas que inicien con letra mayuscula seguido de minusculas  seguido de minusculas
    public static boolean validarNombres(String cadena){
        boolean resul = cadena.matches("^([A-Z][a-z]*)\\s?([A-Z][a-z]*)$"); 
        boolean resul2 = cadena.matches("^([A-Z][a-z]*)$"); 
        return resul||resul2;
        
//        
//        Pattern patron = Pattern.compile("^[A-Z][a-z]\\s?[A-Z][a-z]$");
//        Matcher matcher = patron.matcher(cadena);
//  
//        if(matcher.matches())
//            return true;
//        else 
//            return false;
    }
    
    public static boolean validarCadena(String cadena){
        boolean resul = cadena.matches("([A-Z]|[a-z]|[0-9]){5,10}");
        return resul; 
    }
    public static boolean validarHexadecimal(String cadena){
        boolean resul = cadena.matches("^([A-F]|[0-9])?([A-F]|[0-9])");
        return resul; 
    }
    public static boolean validarBinario(String cadena){
        boolean resul = cadena.matches("[01]{8}");
        return resul; 
    }
    public static boolean validarClaves(String cadena){
        boolean resul = cadena.matches("([[A-Z]|[a-z]]{2})([0-9]{3})");
        return resul; 
    }
    public static boolean validarCURP(String cadena){
                                // 4 iniciales  // 6 Fecha  //1 Hombre  // 2 Entidad // 3 consonante // 2 Homoclave 
                                  // nombre    // Nacimiento//Mujer //Federativa // nombre
        boolean resul = cadena.matches("^([A-Z]{4})([0-9]{6})([HM])([A-Z]{2})([A-Z]{3})([0-9]{2})");
        return resul; 
    }
    
     public static boolean validarRFC(String cadena){ //MELM8305281HO
                                // 2 Letras // 1 letra // 1 letra  //Fecha nacimiento // 3 Homoclave   
                                // Apellido // Apellido // Nombre // Año //Mes // Dia // letras y numeros 
                                // Paterno // MAterno  
        boolean resul = cadena.matches("^([A-Z]{4})([0-9]{6})(([A-Z]|[0-9]){3})");
        return resul; 
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        char opcDWPrincipal = 's';
        
        do{
        System.out.println(ANSI_PURPLE+"Menu");
        System.out.print(ANSI_PURPLE+"1.Validar numero entero"
                       +ANSI_PURPLE+ "\n2.Validar numero negativo"
                       +ANSI_PURPLE+ "\n3.Validar numero de control"
                       +ANSI_PURPLE+ "\n4.Validar numero de control 2020 y 2021"
                       +ANSI_PURPLE+ "\n5.Nombre y nombre con apellido"
                       +ANSI_PURPLE+ "\n6.Cadenas de 5 a 10 caracteres"
                       +ANSI_PURPLE+ "\n7.Hexadecimales"
                       +ANSI_PURPLE+ "\n8.Binarios"
                       +ANSI_PURPLE+ "\n9.Claves iniciando con dos letras, seguido de 3 numeros"
                       +ANSI_PURPLE+ "\n10.CURP"
                       +ANSI_PURPLE+ "\n11.RFC"
                       +ANSI_PURPLE+"\nOpcion->");
        int opcMenu = leer.nextInt();
        
        switch(opcMenu){
            case 1: { // 1.Validar numero entero
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa una Numero entero: ");
                    String n = leer.next();

                    if (validarNumeroEntero(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero entero\n",n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero entero\n",n);
                    }

                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 2:{ // 2.Validar numero negativo
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE+ "Ingresa un Numero entero negativo: ");
                    String n = leer.next();

                    if (validarNumeroEnteroNegativo(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero entero negativo\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero entero negativo\n", n);
                    }

                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 3:{ // 3.Validar numero de control
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa un Numero de control (max 8 numeros): ");
                    String n = leer.next();

                    if (validarNumControl(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero de control\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero de control\n", n);
                    }

                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 4:{ // 4.Validar numero de control 2020 y 2021
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa un Numero de control (Solo alumnos del año 2020 y 2021): ");
                    String n = leer.next();

                    if (validarNumControl20y21(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero de control valido\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero de control valido\n", n);
                    }
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 5:{ // 5.Nombre y nombre con apellido
                char opc = 's';
                do {
                    leer.nextLine();
                    System.out.print(ANSI_BLUE + "Ingresa un nombre (Nombre y Nombre con Apellido): ");
                    String n = leer.nextLine();
  
                    if (validarNombres(n)) {
                        System.out.printf(ANSI_GREEN + "El Nombre %s ingresado es un nombre valido\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El Nombre %s ingresado no es un nombre valido\n", n);
                    }
                   
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 6:{ // 6.Cadenas de 5 a 10 caracteres
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa una cadena entre 5 y 10 caracteres: ");
                    String n = leer.next();

                    if (validarCadena(n)) {
                        System.out.printf(ANSI_GREEN + "La cadena %s ingresada es una cadena valida\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "La cadena %s ingresada no es una cadena valida\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            
            }break;
            case 7:{ // 7.Hexadecimales
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa Numero Hexadecimal: ");
                    String n = leer.next();

                    if (validarHexadecimal(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero hexadecimal valido\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero hexadecimal valido\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 8:{ // 8.Binarios
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa un Numero Binario: ");
                    String n = leer.next();

                    if (validarBinario(n)) {
                        System.out.printf(ANSI_GREEN + "El numero %s ingresado es un numero binario valido\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El numero %s ingresado no es un numero binario valido\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            }break;
            case 9:{ // 9.Claves iniciando con dos letras, seguido de 3 numeros
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa una Clave formada por dos letras, seguida de 3 numeros: ");
                    String n = leer.next();

                    if (validarClaves(n)) {
                        System.out.printf(ANSI_GREEN + "La clave %s ingresada es una clave valida\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "La clave %s ingresada no es una clave valida\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            
            }break;
            case 10:{ // 10.CURP
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa una CURP: ");
                    String n = leer.next();

                    if (validarCURP(n)) {
                        System.out.printf(ANSI_GREEN + "La CURP %s ingresada es una CURP valida\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "La CURP %s ingresada no es una CURP valida\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            
            }break;
            case 11:{ //  11.RFC
                char opc = 's';
                do {
                    System.out.print(ANSI_BLUE + "Ingresa un RFC: ");
                    String n = leer.next();

                    if (validarRFC(n)) {
                        System.out.printf(ANSI_GREEN + "El RFC %s ingresado es un RFC valido\n", n);
                    } else {
                        System.out.printf(ANSI_RED + "El RFC %s ingresado no es un RFC valido\n", n);
                    }
                    
                    System.out.print(ANSI_BLACK + "Desea continuar(s/n):");
                    opc = leer.next().charAt(0);

                    opc = Character.toLowerCase(opc);
                } while (opc == 's');
            
            }break;
            default:{
                System.out.println(ANSI_RED +"Opcion no valida");
            }
        }
            System.out.print(ANSI_BLACK + "Desea regresar a menu principal(s/n):");
            opcDWPrincipal = leer.next().charAt(0);

            opcDWPrincipal = Character.toLowerCase(opcDWPrincipal);
      }while(opcDWPrincipal=='s');
        System.out.println(ANSI_CYAN+"ADIOS.......");
    }
}
