
package pa_2019_08_23_aplicacionarreglo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PA_2019_08_23_AplicacionArreglo {

    public static void main(String[] args) {
    
     Scanner leer = new Scanner(System.in);   
     
     System.out.print("¿Cuantos numeros serán?: ");
     int n = leer.nextInt();
        
     //declaramos el arreglo 
     double [] datos = new double[n];
     
     //llenamos el arreglo 
     Random azar = new Random();
     
     for (int i=0;i<n;i++)
     {
         datos[i] = azar.nextInt(1000)/10.0;
         System.out.println("Valor "+(i+1)+": "+datos[i]);
//         datos [i] = leer.nextDouble();
     }  
     //Suma y promedio 
    double suma = 0; 
     for(int i=0;i<datos.length;i++)
     suma = suma+datos[i];
     
     double promedio = suma/ datos.length;
     
     System.out.println("Suma: "+suma);
     System.out.println("Promedio: "+promedio);
     
     //Mayor y menor 
     double mayor = datos[0];
     double menor = datos[0];
     
     for(int i=1;i<datos.length;i++){
         if(datos[i]>mayor)
             mayor = datos[i];
         if(datos[i]<menor)
             menor=datos[i];
     }
    
      System.out.println("El mayor es el "+mayor);
      System.out.println("El menor es el "+menor);
      System.out.println("El intervalo es "+(mayor-menor));
  
      //ordenamiento 
      
      Arrays.sort(datos);
      
      //mostramos los datos en orden asendente 
        System.out.println("\nOrden ascendete:");
       for (int i=0;i<n;i++)
         System.out.println("Valor "+(i+1)+": "+datos[i]);
     
    
       //mostramos los datos en orden decendente
        System.out.println("\nOrden ascendete:");
       for (int i=n-1;i>=0;i--)
        System.out.println("Valor "+(i+1)+": "+datos[i]);
       
       
}
}
