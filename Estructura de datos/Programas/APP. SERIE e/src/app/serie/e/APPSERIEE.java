
package app.serie.e;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class APPSERIEE {

    /**
     * Roberto Esquivel Troncoso 
     * 19130519
     */
    
//    public static int factorial(int x){
//    int b=1;
//    while(x!=0){
//     b=b*x;
//    x--;
//    }
//    return b;
//    }
//    
//    public static double euler(int a){
//    double e=0;
//    for(int i=0 ;i<a; i++){
//    e=e+1/(double)factorial(i);
//    }
//    return e;
//    }
    
    public static void main(String[] args) {
      
        System.out.println("Euler = "+ Matematicas.serieE()); 
        System.out.println("Factoriao de 10 = "+Matematicas.factorial(10));
    }
    
}
