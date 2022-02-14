/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcola;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Menu {
    
    public static int opciones(){
    Scanner leer = new Scanner(System.in);
     int opcion;
        System.out.println("\033[31m Cola simple");
        System.out.print("\033[32m 1) Insertar Dato\n\033[32m 2) Extraer Dato\n\033[32m 3) Salir\n\033[32m Opcion: ");
        opcion = leer.nextInt();
        return opcion;
    }
}
