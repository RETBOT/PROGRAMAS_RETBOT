package repxcentinela;

import java.util.Scanner;

public class RepXcentinela {
    public static void main(String[] args) {
    int total = 0, contador=0;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la calificacion ó -1 para terminar ");
        int cali = leer.nextInt();
        while (cali!=-1)
        {
        total+=cali;
        contador++;
         
        System.out.println("Ingrese la calificacion ó -1 para terminar ");
        cali = leer.nextInt();
        }
        if (contador!=0)
        {
        double promedio = (double)total/contador;
System.out.printf("Total de calificaciones = %d\nPromedio = %4.2f ",contador,promedio);
        }
        else 
        {
System.out.println("No se introdujeron calificaciones");
        }
      }
    
}
