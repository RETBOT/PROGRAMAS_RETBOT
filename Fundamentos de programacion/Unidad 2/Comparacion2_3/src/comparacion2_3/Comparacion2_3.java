package comparacion2_3;

import java.util.Scanner;

public class Comparacion2_3 {
    public static void main(String[] args) 
    {
     double Num;
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Teclea un numero: ");
        Num = leer.nextDouble();
        
        if (Num%3==0)
        {
        System.out.println("El numero "+Num+", es multiplo de 3");
        }
        else 
        {
        System.out.println("El numero "+Num+", no es multiplo de 3");
        }    
    }
    
}
