/**
 * Escriba una aplicación que imprima la siguiente fi gura de rombo. 
 * Puede utilizar instrucciones de salida que impriman un solo asterisco 
 * un solo espacio o un solo carácter de nueva línea. 
 * Maximice el uso de la repetición (con instrucciones for anidadas), 
 * y minimice el número de instrucciones de salida.
 */
package ejercicio5_24;
public class Ejercicio5_24 {
public static void main(String[] args) {
int tamaño=9;

   for(int a = 1; a<=((tamaño/2)+1); a++){
   for(int b = 1; b<=tamaño/2-a+1; b++ )
   System.out.printf(" ");
             
   // Este ciclo imprime el triangulo superior       
   for(int c = (tamaño/2)-a+2; c<=(tamaño/2)+a; c++ )  
   System.out.printf("*");
   System.out.printf("\n"); 
   } 

   // imprime el triangulo de abajo
   for ( int d = 1; d <= tamaño / 2; d++ ){    
 
   // Abre for que imprime el segundo triangulo
   for( int e = 1; e <= d; e++ ){ 
   System.out.printf(" "); 
   } 
   for (int f = d + 1; f <= tamaño- d  ; f++)
   System.out.printf("*");
   System.out.println();
   } 
}    
}
