package unidad4_arreglos_ejercicios.pkg2;
import java.util.Scanner;
public class Unidad4_Arreglos_Ejercicios2 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingresar cantidad de alumnos: ");
       int n = leer.nextInt();
       
       String [] Nombre= new String[n]; 
       double [] calificacion = new double[n];
       String [] equivalencia = new String[n];
       
       for(int i = 0; i < n; i++){
            System.out.println("Introduzca un nombre: ");
            Nombre [i] = leer.next();
            leer.nextLine();
            System.out.println("Calificacion (0 al 10): ");
            calificacion [i] = leer.nextDouble();
            
            if (calificacion[i] >= 0 && calificacion[i] <= 4.99){
                equivalencia[i] = "Suspenso";
            }
            else if(calificacion[i] >= 5 && calificacion[i] <= 6.99){
                equivalencia[i] = "Bien";
            }else if(calificacion[i] >= 7 && calificacion[i] <= 8.99){
                equivalencia[i] = "Notable";
            }else if(calificacion[i] >= 9 && calificacion[i] <= 10){
                equivalencia [i] = "Sobresaliente";
            }
        }
            System.out.printf("Nombre\tCalificación\tNota");
            for(int a = 0; a < n; a++){
                System.out.printf("\n%s\t %5.2f\t        %s\t",Nombre[a],calificacion[a],equivalencia[a]);
        }
      }  
    }
    

