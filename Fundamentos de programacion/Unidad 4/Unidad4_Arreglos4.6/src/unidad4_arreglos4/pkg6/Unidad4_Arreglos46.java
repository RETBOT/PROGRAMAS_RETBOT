
package unidad4_arreglos4.pkg6;

import java.util.Random;

public class Unidad4_Arreglos46 {

    public static void main(String[] args) {
        
        Random num = new Random();
        
       // declaramos y dimensionamos el arreglo 
        int [] numeros = new int[10];
       
        System.out.println("Posicion\tValor\t");  
      //llebamos el arreglo con numeros enteros generados al azar 
       for (int i = 0; i<numeros.length; i++){
            numeros [i] = num.nextInt(100);
       } 
       
       //mostrar el indice (posicion) del arreglo y su contenido 
       for (int j=0; j<numeros.length; j++){
           System.out.printf("%2d\t          %2d\n", j, numeros[j]);
       }    
       
    }
    
}
