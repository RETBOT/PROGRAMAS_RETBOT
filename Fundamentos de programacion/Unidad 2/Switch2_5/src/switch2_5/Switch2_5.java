package switch2_5;
import java.util.Scanner;
public class Switch2_5 {
    public static void main(String[] args) {
       int mon;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresa el numero de monedas: ");
    mon = leer.nextInt();
    
        switch (mon) {
            case 5:
                System.out.println("Puedes abrir la puerta 1");
                break;
            case 10:
                System.out.println("Puedes abrir la puerta 2");
                break;
            case 15:
                System.out.println("Puedes abirir la puerta 3");
                break;
            case 20:
                System.out.println("Puedes abrir la puerta 4");
                break;
            default:
                System.out.println("Te quedaste son salida");
    }
    
}}
