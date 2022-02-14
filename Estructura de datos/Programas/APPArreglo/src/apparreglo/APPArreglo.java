/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparreglo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class APPArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        * Calcular el promedio de 5 calificaciones 
        * Asignacion de valores por Default
        */
        Scanner leer = new Scanner(System.in);
        
     
       double promedio; 
       
       int num = 0,suma = 0,suma2=0;
        System.out.println("Introduce el numero de calificaciones: ");
        int datos = leer.nextInt();
        int arre [] = new int[datos];
        
        for(int i=0;i<arre.length;i++){
            System.out.printf("intoduce las calificacion [%d]:",(i+1));
            num = leer.nextInt();
            arre[i] = num;
        }
        for(int i=0; i<arre.length;i++){
        suma+=arre[i];
        }
        
        promedio = suma/arre.length;
        System.out.println("promedio = "+promedio);
        
        promedio = 0.0;
        int vec1 [] = {70,80,90,70,60};
        for(int i =0; i<vec1.length;i++){
            System.out.println("Calif ["+vec1[i]+"] = "+vec1[i]);
            suma2+=vec1[i];
        }
       
          promedio = suma2/vec1.length;
        System.out.printf("promedio = %.2f\n",promedio);
        
        
        //asignar datos aleatorios 
        System.out.println("Asignando datos aleatorios");
        Random azar = new Random();
        //definir el tamaño entre 5 y 10
        // 5 <= n <=10 
        int[] vec2 = new int[azar.nextInt(6)+5];
        promedio = 0.0;
        System.out.println("\nCalificaciones en el arreglo\n");
        for(int i=0;i<vec2.length;i++){
        vec2[i] = azar.nextInt(90)+10;
            System.out.printf("Calificacion [%d] = %d\n",i,vec2[i]);
        promedio += vec2[i];
        }
        System.out.println("\nPromeido = "+promedio/vec2.length);
        
    }
    
}
