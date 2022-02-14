/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvalidarentradadeteclado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppValidarEntradaDeTeclado {

    /**
     * @param args the command line arguments
     */
    
//        public static long factorial(long x){
//    long b=1;
//    while(x!=0){
//    b=b*x;
//    x--;
//    }
//    return b;
//    }
//    
//    public static int factorial(int x){
//    int b=1;
//    while(x!=0){
//    b=b*x;
//    x--;
//    }
//    return b;
//    }
//    
//    public static double factorial(double x){
//    double b=1;
//    while(x!=0){
//    b=b*x;
//    x--;
//    }
//    return b;
//    }
 
    
    public static void main(String[] args) {
        // TODO code application logic here
            
        int num = 0;
        Scanner leer = new Scanner(System.in);
      
       
             
        //null Se utiliza para terminar las cadenas /0
        
        char opc = 's';
//        
//        while(opc == 's'){
        
//        }
        System.out.print("Teclea un numero entero: ");
 
  do{
        try{
        num = leer.nextInt();
       
        
        //num = Integer.parseInt(leer.next()); // usar con NumberformatException
        }
        //catch(Exception e){//NumberFormatException e){
        catch(InputMismatchException e){
        System.out.println("ERROR, ENTRADA NO VALIDA, MENSAJE DEL COMPILADOR"+ e.getMessage());
            System.out.println("Se asignara un valor por default = 5");
            num = 5;
            leer.nextLine();
        }
        //System.out.println("Numero = "+num); 
      
        System.out.print("Numero Binario = "+ Integer.toBinaryString(num));
        System.out.print("\nNumero Hexadecimal = "+Integer.toHexString(num));
        System.out.print("\nNumero Octal = "+Integer.toOctalString(num));
        System.out.printf("\n Numero : %d",num);
        System.out.printf("\n Letra : %c",80);  // decimal
        System.out.printf("\n Letra : %c",0x50); // Hexadecimal
         System.out.printf("\n Letra : %c",0120); // Octal
        System.out.println("");
        
        if(num >= 0 && num<=12){
       System.out.printf("\nFactorial de : %d = %d",num,Matematicas.factorial(num));
        
       int n2= 10;
            System.out.printf("\nLa sumatoria del 1 al %d = %d",n2,Matematicas.Sumatoria(n2));
      //  System.out.print("Factorial de "+ num+" = "+Matematicas.factorial(num));
        
        }else if(num>12 && num <= 30){
             long a = (long)num;
            System.out.print("Factorial de "+num+" = "+ Matematicas.factorial(a));
        }else if(num>30 && num<=170){
           double b = (double)num;
            System.out.print("Factorial de "+num+" = "+ Matematicas.factorial(b));
        }
        
        
        System.out.print("\nOtrs (s/n): ");
      
        opc = leer.next().charAt(0);
        
        opc = Character.toLowerCase(opc); //Convierte todos los caracteres de la cadena a minúsculas.
        // toUppercase se usa para convertir todos los caracteres de una cadena dada a mayúsculas.
        // toTitleCase Este método devuelve el equivalente de mayúsculas y minúsculas del carácter,
     
        
        
        System.out.println("Teclea un numero entero: ");
  }while(opc == 's' ); //|| opc == 'S');

    
}
}
