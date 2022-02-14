/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2_recursividad;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MatematicasRec {
    public static int factorial(int n){
        int f = 1;
        if(n==0||n==1)
        return 1;
        else
        f = n*factorial(n-1);
        return f;
}
    
    public static double factorial(double n){
        double f = 1;
        if(n==0||n==1)
        return 1;
        else
        f = n*factorial(n-1);
        return f;
}
    
    //Realizar prueba de escritorio para mañana 
    public static int sumatoria(int n){ //sumatoria de 5 = 1+2+3+4+5
        int s = 0;
        if(n==1) //base 
            return 1;
        else
            s = n+sumatoria(n-1); // formula recursiva
        return s;
}
    
    public static int potencia(int x,int y){
    int pot = 0;
       if(y==0)
           return 1;
       else
           pot = x*potencia(x,y-1);
       return pot;
    }
    //potencia (8,3)
    

    public static void invertirNum(int n){
        System.out.printf("%d  ",n%10);
        if(n>=10)
            invertirNum(n/10);
    }
    
    public static void invertirNumGUI(int n,JLabel jlab){
       jlab.setText("  "+n%10);
        if(n>=10)
            invertirNumGUI(n/10,jlab);  
    }
    
    //version iterativa while
//    public static void invertirNI(int n){
//        while(n>0){
//        System.out.printf("%d  ",n%10);
//        n/=10;
//     }
    
    public static void Binario(int n){
    if(n<2)
            System.out.println(n);
    else
        Binario(n/2);
        System.out.print(n%2);
    }
    
    public static int fibonacci(int n){
    int f=0;
    if(n==1||n==2)
        return 1;
    else
        f=fibonacci(n-1)+fibonacci(n-2);
    return f;
    }
    
    public static int Combinacion(int n,int r){
    int c=0;
    if(n==r||r==0||r>n)
        return 1;
    else
        c = Combinacion(n-1, r)+Combinacion(n-1, r-1);
    return c;
    //  return Combinacion(n-1, r)+Combinacion(n-1, r-1);
    }
    
    }

