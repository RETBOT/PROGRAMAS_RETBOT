/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcaracter;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce un caracter: ");
        char c = leer.next().charAt(0); 
        
        System.out.println("caracter = "+c);
        System.out.println("\nEs letra = "+ Caracter.esLetra(c));
        System.out.println("Es mayuscula = "+Caracter.esMayuscula(c));
        System.out.println("Es minuscula = "+Caracter.esMinuscula(c));
        System.out.println("Es vocal = "+Caracter.esVocal(c));
        System.out.println("Es letra con acento = "+Caracter.esAcento(c));
        
        
    }
    
}
