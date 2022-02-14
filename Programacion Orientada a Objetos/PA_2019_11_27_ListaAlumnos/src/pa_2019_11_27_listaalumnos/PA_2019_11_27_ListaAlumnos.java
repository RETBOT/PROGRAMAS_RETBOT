/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_27_listaalumnos;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class PA_2019_11_27_ListaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno grupo [] = {
                           new Alumno("Juan",20,86.5),
                           new Alumno("Maria",18,91.4),
                           new Alumno("Pedro",19,67.9),
                           new Alumno("Laura",17,87.1), 
                           new Alumno("Luis",21,47.6),
                           new Alumno("Diana",19,98.5), 
                           new Alumno("Fernando",16,71.3)
        };
        System.out.println("Lista de alumnos:");
        for(Alumno a:grupo){
            System.out.println(a);
        }
        //ordenamos el arreglo con el metodo sorte de la clase Arrays 
        Arrays.sort(grupo);
        System.out.println("Lista de alumnos:");
        for(Alumno a:grupo){
            System.out.println(a);
        }
        
    }
    
}
