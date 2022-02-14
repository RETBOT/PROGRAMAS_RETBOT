/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PA_19130519_Proyeco_01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PA_19130519_Proyecto_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       Vehiculo carro = new Vehiculo();
       
       System.out.println("cantidad de vehiculos: ");
       int a = leer.nextInt();
       leer.nextLine();
       
       for(int i=0;i<a;i++){
          System.out.println("Introduce el nombre del vehiculo "+(i+1)+":");
           String nombre = leer.nextLine();
            
           System.out.println("Introduce la distancia recorrida "+(i+1)+":");
           int distancia = leer.nextInt();
           
           System.out.println("Introduce la aceleracion "+(i+1)+":");
           int aceleracion = leer.nextInt();

           System.out.println("Introduce el tiempo "+(i+1)+":");
           int tiempo = leer.nextInt();
           leer.nextLine();
       
           carro.setNombre(nombre);
           carro.setDistancia(distancia);
           carro.setAceleracion(aceleracion);
           carro.setTiempo(tiempo);
           System.out.println("");
       }
       
       for(int j=0;j<a;j++){
       System.out.println("Nombre del vehiculo "+(j+1)+": "+carro.getNombre());
       System.out.println("Distancia recorrida "+(j+1)+": "+carro.getDistancia());
       System.out.println("Aceleracion "+(j+1)+": "+carro.getAceleracion());
       System.out.println("Tiempo "+(j+1)+": "+carro.getTiempo());
       System.out.println("Velocidad inicial "+(j+1)+": "+carro.velocidadInicial()+"\n");
       }
       
      

    }
    
}
