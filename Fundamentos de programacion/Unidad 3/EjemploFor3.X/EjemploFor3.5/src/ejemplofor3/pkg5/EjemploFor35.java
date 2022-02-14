package ejemplofor3.pkg5;

import java.util.Scanner;

public class EjemploFor35 {

    /**
     * Programa que lea las calificaciones de todo el grupo 
     * encontrar el promedio, la cantidad de alumnos con calificacion>70
     * con calificacion=70 y menores a 70
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int contCalMay=0;
    int contCalIg=0;
    int contCalMen=0;
    int acumCali=0;
    int n = 0;
    for(;;){
            System.out.println("Calificacion (-1 para salir): ");
           int calif = leer.nextInt(); 
           acumCali+=calif; //acumula laificacion en acumCali
           n++;

           if (calif==-1)
           {
           break;
           }

    // contador de calificacion mayor a 70
    if (calif>70){
    contCalMay++;
    }
    //contador de calificacion menor a 70
    else if(calif<70){
    contCalMen++;
    }
    //contador de calificaciones iguales a 70 
    else {
    contCalIg++;
    }    
    }
    if(n>0){
    double promedio=acumCali/n;
        System.out.printf("Promedio = %5.3f\n"
                + "Calificaciones menores a 70: %2d\n"
                + "Calificaciones iguales a 70: %2d\n"
                + "Calificaciones menores a 70: %2d\n"
                ,promedio,contCalMay,contCalIg,contCalMen);
    }
    else{
        System.out.println("No se introdujeron calificaciones");
    }
        
            }
}

