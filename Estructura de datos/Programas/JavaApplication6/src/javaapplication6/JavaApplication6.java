/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import appvalidarentradadeteclado.Matematicas;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner(System.in);
         
           System.out.println("Introduce un numero para elevar a Eluler: ");
           double e = leer.nextDouble();
           
           System.out.printf("e^%d = %f",(int)e,Matematicas.SerieEx(e));
           System.out.printf("\ne^%d = %f",(int)e,Matematicas.serieEx(e));
           
           System.out.println("introduce un año: ");
           int año = leer.nextInt();
           
           boolean a = Matematicas.bisiesto(año);
           if(a==true)
               System.out.println("Es bisiesto"); 
           else 
               System.out.println("No es bisiesto");
               
    }
    
}
