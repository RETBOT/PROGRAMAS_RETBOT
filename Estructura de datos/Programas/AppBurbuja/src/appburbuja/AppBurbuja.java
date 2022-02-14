/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appburbuja;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordenamientos b = new Ordenamientos();
        Scanner leer = new Scanner(System.in);
           
        System.out.println("Metodo burbuja"); 
        System.out.print("Tamaño de la burbuja: ");
        int tamaño = leer.nextInt();
        int [] vec = new int [tamaño];
        
        int dato =0;
        for(int i=0;i<vec.length;i++){
            System.out.print("Insertar dato: ");
            dato = leer.nextInt();
            vec[i] = dato;
        }
        
        
        
        b.burbuja(vec);
        System.out.println("Datos ordenados");
        for(int i=0;i<vec.length;i++){
            System.out.println(vec[i]);
        }
        
    }
    
}
