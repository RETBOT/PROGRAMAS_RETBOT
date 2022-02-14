package comparacion2_5;

import java.util.Scanner;

public class Comparacion2_5 {
    public static void main(String[] args) 
    {
    int mon1;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresa el numero de monedas: ");
    mon1 = leer.nextInt();
    
    if (mon1==5) 
    {
    System.out.println("Puedes abrir la puerta 1");
    }
    else if (mon1==10)
    {
    System.out.println("Puedes abrir la puerta 2");
    }
    else if (mon1==15)
    {
    System.out.println("Puedes abirir la puerta 3");
    }
    else if (mon1==20)
    {
    System.out.println("Puedes abrir la puerta 4");
    } 
    else 
    {
    System.out.println("Te quedaste son salida");
    }
    }
}
