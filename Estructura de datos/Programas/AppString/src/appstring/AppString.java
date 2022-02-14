/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstring;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class AppString {

    /**
     * @param args the command line arguments
     */
    
    public static char [] InvertirArreglo(char [] cadena){
    
    char [] aux = new char[cadena.length];
    for(int i=0, j=cadena.length-1; i < cadena.length; i++,j--){
    aux[j] = cadena[i];
    //dibujar como funciona el codigo del for
    }
    return aux;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        char [] nombre = {'j','u','a','n'};
        String cadena1 = new String(nombre);
        System.out.println(nombre);
        //Utilizando el arreglo de char 
        for(int i=0;i<nombre.length;i++){
           //System.out.println(nombre[i]);
             System.out.printf("%c\n", nombre[i]);
        }
        //utilizando String 
        for(int i=nombre.length-1;i>=0;i--){
            //System.out.println(cadena1.charAt(i));
             System.out.printf("%c\n", nombre[i]);
        }
        
        //for - each de JAVA
        for(char letra : cadena1.toCharArray()){
            System.out.println("\n"+letra);
        }
        
        char [] nombre2 = new char[nombre.length];
        nombre2 = InvertirArreglo(nombre);
        String aux = new String(nombre2);
 
        //System.out.println("Arreglo nombre 2:"+nombre2);
        System.out.println("Arreglo nombre 2: "+aux);
        System.out.printf("Arreglo nombre 2 = %s",nombre2);
        System.out.println("\nArreglo nombre 2 = "+Arrays.toString(nombre2));
        System.out.printf("Arreglo nombre 2 = %s",Arrays.toString(nombre2));
    }
    
}
