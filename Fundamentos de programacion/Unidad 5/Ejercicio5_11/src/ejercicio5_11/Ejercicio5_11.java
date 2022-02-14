/**
 * Nombre: Roberto Esquivel Troncoso
 * Numero de control: 19130519
 * 
 * Escriba una aplicación que encuentre el menor de varios enteros. 
 * Suponga que el primer valor leído especifica el numero de valores 
 * que el usuario introducirá. 
 */
package ejercicio5_11;
import java.util.Scanner;
public class Ejercicio5_11 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int num,num2,men; 

    System.out.print("Introduce la cantidad de valores: ");
    num = leer.nextInt();
    
    System.out.print("Por favor introduzca el numero: ");
    men = leer.nextInt();

      for( int i = 2; i <= num; i++ ){ 
      System.out.printf("Por favor introduzca el numero: ");
      num2 = leer.nextInt();
     
      if(num2<men)
          men=num2;
      } 
      System.out.printf("El menor de los %d numeros es: %d\n",num,men);
      }  
    }


