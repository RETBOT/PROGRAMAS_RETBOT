package do_while_3.pkg5;

import java.util.Scanner;

public class Do_While_35 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int suma=0, n=0, edad, prom=0;
   
    do{
        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();
        
        suma = suma+edad;
        n++;
        
        prom=suma/n;
        
        System.out.println("El promedio es: "+ prom+"\n");
    
    }while(prom<=25);
    
    }
    
}
