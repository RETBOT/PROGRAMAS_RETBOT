/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int x){
    int b=1;
    while(x!=0){
     b=b*x;
    x--;
    }
    return b;
    }
    
    public static double euler(int a){
    double e=0;
    for(int i=0 ;i<a; i++){
    e=e+1/(double)factorial(i);
    }
    return e;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanta precisión desea: ");
        int a = leer.nextInt();
        
       System.out.println(""+ euler(a));
    }
}
