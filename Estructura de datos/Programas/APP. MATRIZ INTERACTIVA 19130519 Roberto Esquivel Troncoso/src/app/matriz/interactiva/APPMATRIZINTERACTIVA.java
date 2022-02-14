/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.matriz.interactiva;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class APPMATRIZINTERACTIVA {

    /**
     * Roberto Esquivel Troncoso 
     * 19130519
     */
    
    
    
    public static void main(String[] args) {
            int ren =0, col =0,contRen=0,contCol=0;
            Scanner leer = new Scanner(System.in);
            Random azar = new Random();
            
            
            System.out.print("\nIntroducce el tamaño del arreglo bidimensional");
            //se permitiran 3 intentos 
         
            do{
            System.out.print("\nNumero de renglon (de 3 a 5): ");
            ren = leer.nextInt();
            if(ren<3 || ren>5){
                contRen++;
            }
            else 
                break;
          
            }while(contRen<3);
            //tuviste 3 oportunidades, asignare 3 rebglones para la matriz
                
            if(contRen==3){
                System.out.println("Tuviste 3 oportunidades, asignare 3 renglones para la matriz");
                ren = 3;
            }
            
            do{
            System.out.print("Numero de columnas (de 3a 5): ");
            col = leer.nextInt();
            
            if(col<3 || col>5){
                contCol++;
            }
            else 
                break;
            }while(contCol<3);
            //tuviste 3 oportunidades, asignare 3 rebglones para la matriz
                
            if(contCol==3){
                System.out.println("Tuviste 3 oportunidades, asignare 3 Columnas para la matriz");
                ren = 3;
            }
            
            int [][] matriz = new int[ren][col];
            System.out.println("Capturar");
            System.out.println("-----------------");
            for(int r=0;r<matriz.length;r++){ 
                for(int c=0;c<matriz[0].length;c++){
                    System.out.print("Matriz ["+r+"]["+c+"]: ");
                  
                   try{
                    matriz[r][c] = leer.nextInt();
                   
                   }catch(InputMismatchException ex){
                       System.out.println("Dato de entrada incorrecto = "+ex.getMessage());
                       int ran = azar.nextInt(90)+10;
                       System.out.println("Se asignara un valor aleatorio = "+ran);
                       matriz[r][c] = ran;
                       leer.nextLine();
                   }
                   
                }
                  System.out.println("-----------------"); 
            }
            
            System.out.println("\nMostrar");
            System.out.println("-----------------"); 
             for(int r=0;r<matriz.length;r++){
                 for(int c=0;c<matriz[0].length;c++){
                    System.out.println("Matriz ["+r+"]["+c+"]:"+matriz[r][c]);
                   
                 }
                 System.out.println("-----------------");
            }
            int [] non = new int[matriz.length];
            int [] par = new int[matriz[0].length];           
            
            for(int r=0;r<matriz.length;r++)
            for(int c=0;c<matriz[0].length;c++)
                if(matriz[r][c]%2!=0)
                   non[r]++;
          
            for(int c=0;c<matriz[0].length;c++)
               for(int r=0;r<matriz.length;r++)

                   if(matriz[r][c]%2==0)
                      par[c]++;
              
            System.out.print("\nNon = \n");
            for(int i=0;i<non.length;i++)
                System.out.print("["+non[i]+"]");
            
            System.out.print("\nPar = \n");
            for(int i=0;i<par.length;i++)
                System.out.print("["+par[i]+"]");
           
 
           
    }
    

    
}
