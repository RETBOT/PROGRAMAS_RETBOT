
package unidad4_arreglos4.pkg7;

import java.util.Random;

public class Unidad4_Arreglos47 {

    public static void main(String[] args) {
       int n = 10; 
       
       //declarar los arreglos 
       int [] A  = new int [n]; 
       int [] AA = new int [n];
       
       // declara generador de numeros al azar 
       Random num = new Random(); 
       
       //llenar los dos arreglos 
       for(int k = 0; k<n; k++){
          A[k]  = num.nextInt(100);
          AA[k] = (int)Math.pow(A[k] ,2);
       }
       
        System.out.println("Posicion\tValor\t       Valor2");
       //mostrar el contenido de los arreglos 
       for(int m = 0; m<n; m++){
        System.out.printf("%2d\t\t%2d\t\t%2d\n",m,A[m],AA[m]);
       }
    }
    
}
