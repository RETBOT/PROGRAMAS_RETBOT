/**
 * Nombre: Roberto Esquivel Troncoso
 * Numero de control: 19130519
 * 
 * Los factoriales se utilizan frecuentemente en los problemas de probabilidad.
 * El factorial de un entero positivo n (se escribe como n!) 
 * es igual al producto de los enteros positivos del 1 a n. 
 * Escriba una aplicación que evalúe los factoriales de los enteros del 1 al 5.
 * Muestre los resultados en formato tabular
 */
package ejercicio5.pkg13;
public class Ejercicio513 {
    public static void main(String[] args) {
        
  System.out.println("\tNumero\tFactorial");
  for ( int i = 1; i <= 5; i++ ){   
  int factor = 1;
  int numero = i;
  while ( 0 < numero )
  {       
  factor=factor*numero;
  numero--;
  }       
  System.out.printf("\t"+i+"\t"+factor+"\n");
  }
  long num=1;
  num=1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18*19*20;
  System.out.println("Factorial de 20 = "+num);
  }             
 }
    

