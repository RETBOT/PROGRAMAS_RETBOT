/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientos_;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppBusquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
         int [] vec = {14,21,7,19,88,3};
         
         for(int i=0;i<vec.length;i++){
         //generar numeros aleatorios 
             System.out.println(vec[i]);
         }
        
         System.out.println("\n\tBusqueda Secuencial sobre datos desordenados");
         char resp;
         do{
             System.out.println("Dato a buscar: ");
             int dato = leer.nextInt();
             Numero pos = new Numero();
             Busquedas.secuencialDatosDesordenados(vec,dato,pos);
             if(pos.num != -1)
                 System.out.println("Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
             else
                 System.out.println("Dato no encontrado");
             
             System.out.println("Desea buscar otro dato(s/n): ");
             resp = leer.next().charAt(0);
             
             resp = Character.toUpperCase(resp);
         }while(resp=='s');
         
         
          System.out.println("\n\tBusqueda Secuencial sobre datos ordenados");
          Ordenamiento.burbuja(vec);
         do{
             System.out.println("Dato a buscar: ");
             int dato = leer.nextInt();
             Numero pos = new Numero();
             if(Busquedas.secuencialDatosOrdenados(vec,dato,pos))
                 System.out.println("Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
             else
                 System.out.println("Dato no encontrado");
             
             System.out.println("Desea buscar otro dato(s/n): ");
             resp = leer.next().charAt(0);
             
             resp = Character.toUpperCase(resp);
         }while(resp=='s');
    }
    
}
