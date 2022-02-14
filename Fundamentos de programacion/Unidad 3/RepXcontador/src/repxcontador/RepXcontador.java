package repxcontador;

import java.util.Scanner;

public class RepXcontador 
{
    public static void main(String[] args) 
    {
   Scanner leer = new Scanner(System.in);
    final int N = 10;
    int total = 0;
    int contador =1;
    
    while (contador<=N)
    {
    System.out.println("Proporciona la calificacion "+ contador+" : ");
    int calif = leer.nextInt();
    total+=calif; // total = total+calif
    contador++; // contador = contador+1
    }   
    double prom= (double)total/N;
    System.out.println("Promedio = "+prom);
    } 
}
