package par;

import java.util.Scanner;

public class Par {

    public static void main(String[] args){
   
   Scanner leer = new Scanner(System.in);
   double A,C;
   System.out.println("Escribe el primer numero: ");
   A = leer.nextDouble();
   if (0 == (A%2))
   { 
       System.out.println("El numero es par");
   } 
   else {System.out.println("El numero es impar");}
    
   
    }
    }
