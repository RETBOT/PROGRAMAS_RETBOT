/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppunto;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Roberto Esquivel Troncoso
 * 19130519
 */
public class APPPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char opc = 's' , sel = 's';
        int x = 0, y=0, x2=0, y2=0;
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        DecimalFormat df = new DecimalFormat("##0.00");
        
        
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        
        do{
            try{
                System.out.print("Desea campurar los numeros, "
                        + "de lo contrario se daran numeros al aleatorios (s/n):");
                sel = leer.next().charAt(0);
         
                sel = Character.toLowerCase(sel);
             
                
        if(sel == 's'){     
        System.out.print("Punto 1.x: ");
        x = leer.nextInt();
       
        System.out.print("Punto 1.y: ");
        y = leer.nextInt();
        
        System.out.print("Punto 2.x: ");
        x2 = leer.nextInt();
        
        System.out.print("Punto 2.y: ");
        y2 = leer.nextInt();
        }
        else{
            x = azar.nextInt(200);
            y = azar.nextInt(200);
            x2 = azar.nextInt(200);
            y2 = azar.nextInt(200);
        }
            }catch(InputMismatchException e){
                System.out.println("Dato no valido = "+e.getMessage()+
                                   "\nSe asignaran numeros random");
              
                x = azar.nextInt(200);
                y = azar.nextInt(200);
                x2 = azar.nextInt(200);
                y2 = azar.nextInt(200);
                leer.next();
            }
           
                p1.setX(x);
                p1.setY(y);
                p2.setX(x2);
                p2.setY(y2);
            
        if(sel != 's'){        
        System.out.println("\nPuntos");
        System.out.println("Punto 1.x : "+p1.getX());
        System.out.println("Punto 1.y : "+p1.getY());
        System.out.println("Punto 2.x : "+p2.getX());
        System.out.println("Punto 2.y : "+p2.getY());
        }
        System.out.println("La distancia es = "+df.format(p1.Distancia(p2)));
        
        System.out.println("Seguir (s/n)");
        opc = leer.next().charAt(0);
       opc = Character.toLowerCase(opc);
        
        }while(opc == 's');
        }
    
}
