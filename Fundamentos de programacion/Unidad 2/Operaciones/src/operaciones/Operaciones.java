package operaciones;
import java.util.Scanner;
public class Operaciones 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.print("Primer numero entero: ");
        int A = leer.nextInt();
        System.out.print("Segundo numero entero: ");
        int B = leer.nextInt();
        int suma = A+B;
        int resta = A-B;
        int multi = A*B;
        double div = (double)A/(double)B;
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La divicion es: "+div);
    }
}
