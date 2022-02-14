package ejemplowhile3.pkg1;

import java.util.Scanner;

public class EjemploWhile31 {

    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);

int ini, fin, inc;
System.out.println("Proporcione el valor inicial: ");
ini = leer.nextInt();

System.out.println("Proporcione el valor final: ");
fin = leer.nextInt();

System.out.println("Proporcione el incremento: ");
inc = leer.nextInt(); 

System.out.println(" ");//salto de linea para que no se pege con el while

while(ini<=fin){
    System.out.printf("%4d  ",ini);
    ini+=inc; //ini=ini+inc; 
}
    }
    
}
