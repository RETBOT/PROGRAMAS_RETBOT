/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptablas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int t = 0;
        char opc = 's';
        do{
        try{
        System.out.print("Intresa la Tabla : ");
        t = leer.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error, dato de entrada invalido = "+e.getMessage()+"\n"
                    + "Se pondra un valor por default = 5");
            t = 5;
        }
        int n=t;
            System.out.println(t+"x"+1+" = "+(t*1)+"  \t --> \t"+ 1+" vez "+t);
        for(int i=2;i<=10;i++){
             n+=t;
            System.out.println(t+"x"+i+" = "+(t*i)+"  \t --> \t"+ i+" veces "+t+ "\t --> sumar "+i+" veces a "+t+" = "+n);   
        }
        
            System.out.print("Desea seguir(s/n):");
            opc = leer.next().charAt(0);
            
            opc = Character.toLowerCase(opc);
        }while(opc == 's');
        
    }
    
}
