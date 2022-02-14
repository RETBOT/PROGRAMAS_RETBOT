/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparchivosdetexto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        // app 1 para el receso navideño 
        //subir el domingo 20/dic/2020
        // diseñar e implementar una aplicacion que utilice un menu para
        // permitir al usuario trabajacon archivos de texto 
        
        Scanner leer = new Scanner(System.in); 
        String nomArch;
        int opc = 0;
        char op = 's';
        int oport = 0;
        do{
        System.out.print("Menu Archivos de texto\n"
                + "1) Escribir en archivo \n"
                + "2) Agregar texto a archivo \n"
                + "3) Leer archivo \n"
                + "Opcion -> ");
        try{
        opc = leer.nextInt();
        }catch(InputMismatchException ex ){
            ex.getMessage();
            leer.nextLine();
        }
        switch(opc){
            case 1: System.out.print("Escribiendo en archivo\n"
                    + "Nombre del archivo: ");         
            nomArch = leer.next();
            
            ArchivosDeTexto.guardarArchivo(nomArch);
            break;
            
            case 2: System.out.print("Agregar texto a archivo\n"
                    + "Nombre del archivo: ");
            nomArch = leer.next();   
            ArchivosDeTexto.agregarArchivo(nomArch);
            break;
         
            case 3: System.out.print("Leyendo desde el archivo\n"
                    + "Nombre del archivo: ");
            nomArch = leer.next();
            ArchivosDeTexto.leerArchivo(nomArch);
            break;
            
            default: System.out.println("Opcion invalida ");
            System.out.printf("Oportunidad %d de %d ",oport+1,3);
            oport++;
            break;
            }
        
        if(oport<3){
        System.out.print("\nDesea continuar (s/n): ");
        op = leer.next().charAt(0);
        op = Character.toLowerCase(op);
        }
        
        }while(op=='s' && oport<3);
        System.out.println("\nFin");
      
          

           
    }
    
}
