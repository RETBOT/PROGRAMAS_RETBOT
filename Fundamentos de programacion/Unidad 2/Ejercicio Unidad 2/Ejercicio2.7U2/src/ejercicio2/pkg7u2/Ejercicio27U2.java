package ejercicio2.pkg7u2;

import java.util.Scanner;

public class Ejercicio27U2 {
    public static void main(String[] args) {
    int num1, num2, num3, num4, num5;
    int suma, prom, prod;
    Scanner leer = new Scanner(System.in);
   
    System.out.println("Teclea el primer numero: ");
    num1 = leer.nextInt();
    System.out.println("Teclea el segundo numero: ");
    num2 = leer.nextInt();
    System.out.println("Teclea el tercer numero: ");
    num3 = leer.nextInt();
        
   suma = num1+num2+num3; 
   prom = suma/3;
   prod= num1*num2*num3;
   
   if(num1>num2&&num1>num3){
   num4 = num1;
   }    
   else if(num2>num1&&num2>num3){
   num4 = num2; 
   }   
   else{
   num4 = num3;
   }

   if (num1<num2&&num1<num3){
   num5 = num1;
   }    
   else if (num2<num1&&num2<num3){
   num5 = num2;
   }   
   else{
   num5 = num3;
   }
        System.out.println("La suma es "+suma);
        System.out.println("El promedio es "+prom);
        System.out.println("El producto es "+prod);
        System.out.println("El numero menor es "+num5);
        System.out.println("El numero mayor es "+num4);
    }
    
}
