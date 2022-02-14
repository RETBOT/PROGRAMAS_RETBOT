package unidad4_arreglos_ejercicios.pkg1;
import java.io.IOException;
import java.util.Scanner;
public class Unidad4_Arreglos_Ejercicios1 {
    public static void main(String[] args) throws IOException {
       
       Scanner leer = new Scanner(System.in);
       
       int alu = 24; 
       String[] Nombre  = new String[alu];
       int   [] Edad = new int[alu];
       double[] Estatura = new double[alu];
       char  [] Sexo = new char[alu];
       
    for(int n=0;n<alu;n++){
        System.out.println("Ingresar nombre del alumno :");
        Nombre [n]=leer.nextLine();
        System.out.println("Ingresar edad del alumno: ");
        Edad [n] = leer.nextInt();
        System.out.println("Ingresar altura del alumno: ");
        Estatura [n] = leer.nextDouble();       
        System.out.println("Ingresar sexo del alumno: (M-Mujer, H-Hombre)");
        Sexo[n] = (char) System.in.read();
        System.in.read();
        leer.nextLine();
        
    }  
     System.out.println("Nombre\tEdad\tEstatura\tSexo\t");
     for(int a=0;a<alu;a++){
         System.out.printf("%s\t%8d\t%5.2f\t%s\t\n",Nombre[a],Edad[a],Estatura[a],Sexo[a]);
    }    
    }
}
