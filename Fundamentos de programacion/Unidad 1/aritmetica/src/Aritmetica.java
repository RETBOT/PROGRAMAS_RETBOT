import java.util.Scanner;
public class Aritmetica{
public static void main(String[] args)
{       
Scanner leer = new Scanner(System.in);
System.out.print("Primer numero entero: ");
int i = leer.nextInt();
System.out.print("Segundo numero entero: ");
int j = leer.nextInt();
        
int mod = i % j;
System.out.print("Modulo :");
System.out.println(mod);	
	
	}
		
}