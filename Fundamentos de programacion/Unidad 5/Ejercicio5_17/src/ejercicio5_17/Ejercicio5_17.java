/**
 * Nombre: Roberto Esquivel Troncoso
 * Numero de control: 19130519
 * 
 * Un almacén de pedidos por correo vende cinco productos cuyos precios de venta 
 * son los siguientes: 
 * producto1, $2.98; 
 * producto 2, $4.50; 
 * producto 3, $9.98; 
 * producto 4, $4.49 y 
 * producto 5, $6.87. 
 * Escriba una aplicación que lea una serie de pares de números, 
 * como se muestra a continuación:
 * a) número del producto.
 * b) cantidad vendida.
 * Su programa debe utilizar una instrucción switch para determinar el precio 
 * de venta de cada producto. Debe calcular y mostrar el valor total de venta 
 * de todos los productos vendidos. Use un ciclo controlado por centinela para 
 * determinar cuándo debe el programa dejar de iterar para mostrar los 
 * resultados finales.
 */

package ejercicio5_17;
import java.util.Scanner;
public class Ejercicio5_17 {

  public static void main(String[] args){
  Scanner leer = new Scanner(System.in);
  int numPro;
  int canVen;
  double venTot=0;  
   
    System.out.println("Precios de los productos"
            + "\nProducto 1 = $2.98"
            + "\nProducto 2 = $4.50"
            + "\nProducto 3 = $9.98"
            + "\nProducto 4 = $4.49"
            + "\nProducto 5 = $6.87"
            + "\nSelecciona el producto: (introduce -1 para terminar)");
    numPro= leer.nextInt();
    
    while (numPro!=-1){
    switch(numPro){
        case 1:
            System.out.println("Introduce la cantidad vendida del producto: ");
            canVen = leer.nextInt();
            System.out.println("Precio de esta venta: "+canVen*2.98);
            venTot=venTot+canVen*2.98;
            break;
        case 2:
            System.out.println("Introduce la cantidad vendida del producto: ");
            canVen=leer.nextInt();
            System.out.println("Precio de esta venta: "+canVen*4.50);
            venTot=venTot+canVen*4.50;
            break;
        case 3:   
            System.out.println("Introduce la cantidad vendida del producto: ");
            canVen=leer.nextInt();
            System.out.println("Precio de esta venta: "+canVen*9.98);
            venTot=venTot+canVen*9.98;
            break;
        case 4: 
            System.out.println("Introduce la cantidad vendida del producto: ");
            canVen=leer.nextInt();
            System.out.println("Precio de esta venta: "+canVen*4.49);
            venTot=venTot+canVen*4.49;
            break; 
        case 5:
            System.out.println("Introduce la cantidad vendida del producto: ");
            canVen=leer.nextInt();
            System.out.println("Precio de esta venta: "+canVen*6.87);
            venTot=venTot+canVen*6.87;
            break;
        default:
            System.out.println("Numero de producto invalido");
         }
        System.out.println("\nintroduce el numero de producto: (o -1 para terminar)");
        numPro= leer.nextInt();
    }    
        System.out.println("\nLas ventas todales fueron " + venTot);
    }
}
