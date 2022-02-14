//Nombre = Roberto Esquivel Troncoso 
//Numero de control = 19130519
package robot;
import java.util.Scanner;
public class Robot 
{
public static void main(String[] args) 
{
int valor, i, cantidad, linBlan=0, linNeg=0;
Scanner leer = new Scanner(System.in);
System.out.println("Ingresa la cantidad de valores a leer: ");
valor = leer.nextInt();

for (i=1; i<=valor; i++)
{
System.out.println("Introduce la cantidad: ");
cantidad = leer.nextInt();

if(cantidad<=30)
{
System.out.println("");
System.out.println("Color Blanco");    
System.out.println("");
linBlan++;
}

else if (cantidad>30)
{
System.out.println("");
System.out.println("Color negro");
System.out.println("");
linNeg++;
}

}
System.out.println("Cantidad de veces ingresada el color blanco " + linBlan);
System.out.println("Cantidad de veces ingresasa el color negro " +linNeg);
}
}

