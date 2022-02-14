/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmanejodecadenasycaracteres;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppManejodeCadenasyCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mostrar el codigo ASCII o lo que puede visualizarse actualmente, ya 
        // que los compiladores utilizan el codigo UTF8
//        
//        for(int i=0; i<256;i++){
//            System.out.printf("\nCaracter : %d  = %c",i,(char)(i));
//        }
       

        Scanner leer = new Scanner(System.in);
        System.out.println("Teclear una cadena");
          String cadena = leer.nextLine();// = "123 ?tecnológico máximo"; 
//        // cadena = cet; // un string no se puede modificar caracter por caracter,
//        // solo se puede asignar un String por otro String 
//        System.out.println(cadena);
//        
//        char [] cadChar1 =  cadena.toCharArray();
//        System.out.println(cadChar1);
//        
//        char [] cadChar2 = "tecnológico".toCharArray();
//        System.out.println(cadChar2);
//       
//        System.out.println("CadChar 2 "+Arrays.toString(cadChar2));
// 
//        
//        for(int i=0;i<cadena.length();i++){
//            System.out.println(cadena.charAt(i));//Invertir la cadena caracter por caracter
//        }     
//  
//        
//        char [] cadChar3 = new char[cadena.length()];
//        for(int i=0;i<cadChar3.length;i++){
//            if(Character.isLetter(cadena.charAt(i)))
//               cadChar3[i] = Character.toUpperCase(cadena.charAt(i));
//            else 
//                System.out.println("Este caracter no es letra: "+cadena.charAt(i));
//        }
//        System.out.println(cadChar3);
//        
//        
//        
//        int conLetras=0;
//        for(int i=0;i<cadChar3.length;i++){
//        if(Caracter.esLetra(cadena.charAt(i)))
//            conLetras++;
//        }
//        System.out.println("Cantidad de letras = " +conLetras);
//        
//        cadena = "123 ?tecnológico máximo";
//        
//        int contVocales=0;
//        for(int i =0;i<cadena.length();i++){
//        if(Caracter.esVocal(cadena.charAt(i)))
//            contVocales++;
//        }
//        System.out.println("Cantidad de Vocales = "+contVocales);
//        
//        int contDigitos=0;
//        for(int i =0;i<cadena.length();i++){
//        if(Caracter.esDigito(cadena.charAt(i)))
//            contDigitos++;
//        }
//        System.out.println("Cantidad de Digitos = "+contDigitos);
//        

        char [] cadChar = new char[cadena.length()];
        for(int i=0;i<cadChar.length;i++)
            if(Caracter.esMayuscula(cadena.charAt(i)))
               cadChar[i] = Caracter.aMinuscula(cadena.charAt(i));
    
//        System.out.println("Cadena : "+Arrays.toString(cadChar));
        System.out.println(cadChar);

        //agregar un metodo para convertir de minuscula a mayuscula       
        
        //agregar un metodo para convertir de minuscula a mayuscula
            
            
        //Agregar: leer una cadena que contenga digitos y letras 
        // convertir las letras a Mayusculas o minusculas 
        //si son digitos contar cuantos hay en la cadena 
        // ej: RFC o Curp 
        
//        Scanner leer = new Scanner(System.in);
//                        
//        System.out.println("Introduce la cadena: "); 
//        String cad = leer.nextLine();
//        
//        char [] cadChar4 = new char[cad.length()];
//        int contador = 0;
//        for(int i=0;i<cadChar4.length;i++){
//        
//        if(Character.isDigit(cad.charAt(i)))            
//            contador++; 
//            cadChar4[i] = cad.charAt(i);
//        if(Character.isLetter(cad.charAt(i))){
//            if(Character.isUpperCase(cad.charAt(i))){
//            cadChar4[i] = Character.toLowerCase(cad.charAt(i));
//        }else 
//           if(Character.isLowerCase(cad.charAt(i)))
//            cadChar4[i] = Character.toUpperCase(cad.charAt(i));
//        }
//        
//        }
//        System.out.print("Convertir letras Mayusculas o minusculas ");
//        System.out.println(cadChar4);
//        System.out.println("Cantidad de digitos: "+contador);
//       
    }
    
}
