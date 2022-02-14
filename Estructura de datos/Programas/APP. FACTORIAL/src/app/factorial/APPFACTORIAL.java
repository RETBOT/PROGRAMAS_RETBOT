package app.factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APPFACTORIAL {

    /**
     * Roberto Esquivel Troncoso 
     * 19130519
     */
    
//    Ejemplo de un metodo sin static
//    public int factorial(int x){
//    int b=1;
//    while(x!=0){
//     b=b*x;
//    x--;
//    }
//    return b;
//    }
    
//    public static long factorial(long x){
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
//      Scanner leer = new Scanner(System.in);
 //       APPFACTORIAL fact = new APPFACTORIAL();
// con static        System.out.println("El factorial de "+a+" es: "+fact.factorial(a));

//        System.out.println("Numero: ");
        
//        if(n >= 0 && n<=12){
////        for(long i=0; i<=30;i++)
//        System.out.println("El factorial de "+n+" es: "+factorial(n));
//        }else{ 
//            System.out.println("Valor fuera de rango");
//        }
//        double n; 
//        char opc = 's';
//        
//        do{
//        try{
//        n = leer.nextInt();
//        
//         if(n >= 0 && n<=30){
//             System.out.println("El factorial de "+(int)n+" es = "+(int)factorial(n));
//        }else if(30>=12&&n<=170){
//             System.out.println("El factorial de "+n+" es = "+factorial(n));  
//        }else 
//                System.out.println("Valor fuera de rango, valor Maximo 170");
//        }
//        catch(InputMismatchException e){
//            System.out.println("ERROR, ENTRADA NO VALIDA, MENSAJE DEL COMPILADOR"+ e.getMessage());  
//            System.out.println("Se asignara un valor por default = 5");
//            n = 5;
//           leer.next();
//        }  
//        
//        System.out.println("Otro (s/n)");
//        opc = leer.next().charAt(0);
//        System.out.println("Numero :");
//        }while(opc == 's');

   double valorExp = Math.exp(2.1);
        System.out.println("Valor de e^"+1.1+" = "+valorExp);
    }
    
}
