//Nombre = Roberto Esquivel Troncoso 
//Numero de control = 19130519 
package calificacion;
import java.util.Scanner;
public class Calificacion 
{
public static void main(String[] args) 
{
int cal, apro=0, repro=0, i;
Scanner entrada = new Scanner(System.in);
for (i=1; i<=10; i++)
{
System.out.print("Introdusca una calificacion del 0 al 100, "
+ "alumno numero " +i+ ": ");

cal = entrada.nextInt(); 

if (cal<=100&&cal>=70)
apro++;    

else 
{
repro++;
}     
}
System.out.println("Cantidad de alumnos Aprobados " + apro);
System.out.println("Cantidad de alumnos Reprobados " + repro);
}
}
    

