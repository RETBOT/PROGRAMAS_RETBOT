/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnumprimo;

/**
 *
 * @author admin
 */
public class Matematicas {
    public static int Sumatoria(int n){
        int suma = 0;
        int i = 1;
        while(i<=n){
        suma +=i;
        i++;
        }
        return suma;
    }
    
    public static long factorial(long x){
    long b=1;
    while(x!=0){
    b=b*x;
    x--;
    }
    return b;
    }
    
    public static int factorial(int x){
    int b=1;
    while(x!=0){
    b=b*x;
    x--;
    }
    return b;
    }
    
    public static double factorial(double x){
    double b=1;
    while(x!=0){
    b=b*x;
    x--;
    }
    return b;
    }
    
    public static double serieE(){
    double i=0, e=0;
    do{
      e+= 1/factorial(i++);
    }while(e<=Math.E);
    return e;
    }
    
    //Diseñe e implemete un metodo para determinar si un numero entero es primo
 public static boolean Primo(int num){
     int div=2;
     
    while(div < num){
        if(num%div==0){
        return false; //el numero no es primo
        }
        div++;
    }
    return true;
   }
 
     //realizar prueba de escritorio a este metodo con los siguientes numero:
    //119, 1577, 2555
    
    //Metodo de la serie e^x
    // e^x = x^0/0! + x^1/1! + x^2/2! + x^3/3! + ...........
    public static double SerieEx(int x){
    double resu; 
    resu = Math.pow(serieE(),x);
    return resu;
    }
    
    public static double serieEx(double x){
        double i=0, e=0;
    do{
      e+= Math.pow(x,i)/factorial(i);
      i++;
    }while(e + 0.00001 <=Math.exp(x));

    return e;
    }
    
    public static boolean bisiesto(int x){
    if(x%4==0){
        if(x%100!=0||x%400==0)
            return true;
        else
            return false;
    }
    return false;
    }
    
}
