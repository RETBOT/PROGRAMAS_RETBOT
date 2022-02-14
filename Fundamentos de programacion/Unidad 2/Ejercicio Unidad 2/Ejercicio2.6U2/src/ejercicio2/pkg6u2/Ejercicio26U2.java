package ejercicio2.pkg6u2;
import java.util.Scanner;
public class Ejercicio26U2 {
    public static void main(String[] args) {
    int num1,num2;
    Scanner leer = new Scanner(System.in);
        System.out.println("Teclea el primer numero: ");
        num1 = leer.nextInt();
        
        System.out.println("Teclea el segundo numero: ");
        num2=leer.nextInt();
        
        if (num1%num2==0)
        System.out.println("Es multiplo");
        
        else 
        System.out.println("No es multiplo");
    }  
}
