/* 
Nombre = Roberto Esquivel Troncoso 
Numero de control = 19130519
*/
package altuprom;
import java.util.Scanner;
public class AltuProm 
{
public static void main(String[] args) 
{
double Altura, Personas, i, Promedio=0, A;    
Scanner entrada = new Scanner(System.in);

System.out.print("Teclea la cantidad de personas para "
+ "obtener el promedio de alturas: ");
Personas = entrada.nextDouble();

for (i=1; i<=Personas; i++){
System.out.print("Teclea la altura en cm: "); 
Altura = entrada.nextDouble();
Promedio = Promedio+Altura; 
}
A = Promedio/Personas; 
System.out.println("La altura promedio es " + A + " cm");
}
}
