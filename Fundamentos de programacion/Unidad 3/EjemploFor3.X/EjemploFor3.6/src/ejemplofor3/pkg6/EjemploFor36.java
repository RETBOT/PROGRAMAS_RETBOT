package ejemplofor3.pkg6;

import java.util.Scanner;

/**
 * Se desea encontrar los factores primos para un numero 
 * t dado donde t sea mayor o igual a 1 
 * y t sea menor o igual a 100
 */
public class EjemploFor36 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
  
    System.out.println("Ingresa un numero: ");
    int t = leer.nextInt();
    
    for(t=1;t<=100;t++){
    if(t%2==0||t%t==1)
    System.out.println(t);   
        }
    }
    
}
