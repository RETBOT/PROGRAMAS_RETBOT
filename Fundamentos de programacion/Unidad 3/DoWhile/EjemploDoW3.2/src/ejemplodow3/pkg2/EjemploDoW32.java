package ejemplodow3.pkg2;

import java.util.Scanner;

public class EjemploDoW32 {
    public static void main(String[] args) {
    int suma=0, num;
    
    Scanner leer = new Scanner(System.in);
    do {
    System.out.println("Ingresa un numero entero positivo o 0 para terminar");
        num = leer.nextInt();
        suma+=num;
    }while(num!=0);
        System.out.println("la suma es "+suma);
    }
        
}
