package do_while3_4;

import java.util.Scanner;

public class Do_while3_4 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int mayor=0, menor=0, igual=0, calif;

do{
    System.out.println("Ingresa calificaciones: ");
    calif = leer.nextInt();
   System.out.println("Ingresa -1 para terminar\n"); 
   if (calif>70&&calif<=100)
    {
    mayor++;
    }
    else if (calif==70)
    {
    igual++;
    }
    else if(calif<70&&calif>=0)
    {
    menor++;
    }
}while(calif!=-1);
System.out.printf("Mayor a 70: %d\nIgual a 70: %d\nMenor a 70: %d\n"
,mayor,igual,menor);
}
    
}
