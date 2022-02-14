package ejemplofor3.pkg2;

import java.util.Scanner;
/*
 * Programa que despliega las tablas de multiplicar desde un valor inicial 
 * hasta un valor final 
 */
public class EjemploFor32 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int valorInicial, valorFinal; 
        System.out.println("Valor inicial: ");
        valorInicial = leer.nextInt();
        
        System.out.println("Valor Final: ");
        valorFinal = leer.nextInt();
        System.out.println("");
        //for que establece la tabla
        for(int tabla = valorInicial; tabla <= valorFinal;tabla++)
        {
        //for para desplegar los renglones de cada tabla
            for (int ren = 1;ren<=10;ren++)
                System.out.printf("%3d X %3d = %3d\n",tabla,ren,tabla*ren);
          System.out.println("");//deja una linea en blanco despues de la tabla
        } 
        
        //for que establece la tabla a la inversa 
        for(int tabla2 = valorInicial; tabla2 >= valorFinal;tabla2--)
        {
        //for para desplegar los renglones de cada tabla
            for (int ren = 1;ren<=10;ren++)
            System.out.printf("%3d X %3d = %3d\n",tabla2,ren,tabla2*ren);
           System.out.println("");//deja una linea en blanco despues de la tabla
        
        }
    }
    }

