/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjuego;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class APPJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        int opc = 0;
        
        String [] palabras = {"pato","raton","pan","pantalones","comida","lodo",
        "hospital","arriba","charco","oscuro","tripulacion","purpura","disputa",
        "punta","echar","hojas","playa","monumento","ayudar","tablero","talco",
        "jubilado","mordedura","siesta","trofeo","permanente","rayado","surcar"};
        int pal = azar.nextInt(palabras.length);
        
        StringBuilder juego = new StringBuilder(palabras[pal]);
//        System.out.println("Palabra = "+juego);
        String pal2 = juego.toString();
        
        try{
         System.out.print("Juego Adivina la palabra\nNivel\n1)Facil\n2)Medio\n3)Dificil\nOpcion: ");
         opc = leer.nextInt();
        }catch(InputMismatchException ex){
            System.out.println(" Error de tipo = "+ex.getMessage());
            leer.next();
        }
        
        switch (opc) {
            case 1:    
                StringBuilder rev = juego.reverse();
                int i=0;

                do{
                System.out.print("\nAdivina la palabra\nTienes 3 oportunidades\n"+rev+": ");
                String pal3 = leer.next();
                
                if(pal3.equals(pal2)){    
                    System.out.println("Correcto");
                break;
                }else
                        System.out.println("Error num "+(i+1));
                 System.out.println("Pista: HOLA|ALOH");
                i++;
                }while(i<3); 
                 System.out.println("Fin");
                break;
            
            case 2:
                int lon = juego.length();
                int lon2 = azar.nextInt(lon);
                StringBuilder rev2 = juego.deleteCharAt(lon2);
                int j=0;

                do{
                System.out.print("\nAdivina la palabra\nTienes 3 oportunidades\n"+rev2+": ");
                    
                String pal3 = leer.next();
                
                 if(pal3.equals(pal2)){    
                    System.out.println("Correcto");
                break;
                }else
                        System.out.println("Error num "+(j+1));
                        System.out.println("Pista: le fatla una letra");
                j++;
                }while(j<3); 
                 System.out.println("Fin");
                break;

            case 3:
                StringBuilder rev3 = juego.reverse();
                int lon3 = juego.length();
                int lon4 = azar.nextInt(lon3);
                 rev3 = juego.deleteCharAt(lon4);
                 int k=0;

                do{
                System.out.print("\nAdivina la palabra\nTienes 3 oportunidades\n"+rev3+": ");
                String pal3 = leer.next();
                
                if(pal3.equals(pal2)){    
                    System.out.println("Correcto");
                break;
                }else
                        System.out.println("Error num "+(k+1));
                 System.out.println("Pista: HOLA|ALH");
                 k++;
                }while(k<3); 
                 System.out.println("Fin");
                
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
         
    }
    
}
