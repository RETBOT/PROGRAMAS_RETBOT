/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparreglobidimensional_matriz;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppArregloBidimensional_Matriz {

        public static void main(String[] args) {
            
            
                                // Datos asignados por default
            int [][] matriz1 = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        
            for(int ren=0;ren<matriz1.length;ren++){
                               // Proporcionan la cantidad de columnas 
            for(int col=0;col<matriz1[0].length;col++)
                    System.out.print(matriz1[ren][col] +",");
                    System.out.println();
            }
            
            
            //contar nones y pares dejando cada uno en un vector independiente 
            int [] nones = new int[matriz1.length];
            int [] pares = new int[matriz1[0].length];
            
            for(int r=0;r<matriz1.length;r++)
            for(int c=0;c<matriz1[0].length;c++)
                if(matriz1[r][c]%2!=0)
                   nones[r]++;
          
            for(int c=0;c<matriz1[0].length;c++)
               for(int r=0;r<matriz1.length;r++)
                   if(matriz1[r][c]%2==0)
                      pares[c]++;
              
            System.out.print("\nNon = \n");
            for(int i=0;i<nones.length;i++)
                System.out.print("["+nones[i]+"] \n");
            
            System.out.print("\nPar = \n");
            for(int i=0;i<pares.length;i++)
                System.out.print("["+pares[i]+"]");
            
            
            int ren =0, col =0;
            Scanner leer = new Scanner(System.in);
            System.out.print("\nIntroducce el tamaño del arreglo bidimensional");
            System.out.print("\nRenglon: ");
            ren = leer.nextInt();
            System.out.print("Columnas: ");
            col = leer.nextInt();
            
            if(ren>=3 && col<=5){    
                
            int [][] matriz2 = new int[ren][col];
            
            for(int r=0;r<matriz2.length;r++){ 
                for(int c=0;c<matriz2[0].length;c++){
                    System.out.print("Introducce el dato del renglon: "+r+" Columna: "+c+" :");
                    matriz2[r][c] = leer.nextInt();
                }
            }
            
             for(int r=0;r<matriz2.length;r++){
                 for(int c=0;c<matriz2[0].length;c++)
                    System.out.print("["+matriz2[r][c] +"]");
                    System.out.println();
            }
            int [] non = new int[matriz2.length];
            int [] par = new int[matriz2[0].length];
            
            for(int r=0;r<matriz2.length;r++)
            for(int c=0;c<matriz2[0].length;c++)
                if(matriz2[r][c]%2!=0)
                   non[r]++;
          
            for(int c=0;c<matriz1[0].length;c++)
               for(int r=0;r<matriz2.length;r++)
                   if(matriz2[r][c]%2==0)
                      par[c]++;
              
            System.out.print("\nNon = \n");
            for(int i=0;i<non.length;i++)
                System.out.print("["+non[i]+"] \n");
            
            System.out.print("\nPar = \n");
            for(int i=0;i<par.length;i++)
                System.out.print("["+par[i]+"]");
            
             
           } else 
                System.out.println("Datos fuera de rango\nRenglon >= 3 y Columna <=5");
   }
    
}
