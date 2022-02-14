/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class APPMatriz {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        int ren =0, col =0, op;
        
        
        System.out.println("Matriz A");
        System.out.print("Introducir renglones y columnas\n1.Manual\n2.Automatico\nOpcion: ");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Introducce el tamaño del arreglo bidimensional ");
                System.out.print("Renglones de A: ");
                ren = leer.nextInt();
                System.out.print("Columnas de A: ");
                col = leer.nextInt();
                break;
            case 2:
                ren = azar.nextInt(3)+3;
                  col = azar.nextInt(3)+3;
                System.out.println("Renglon = "+ren+"\nColumna = "+col);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
        int mat [][] = new int[ren][col];
        
        op =0;
        
        System.out.println("-----------------"); 
        System.out.print("Introducir los valores\n1.Manual\n2.Automatico\nOpcion: ");
        op = leer.nextInt();
        
        switch(op){
            case 1:
            System.out.println("\nCapturar A");
            System.out.println("-----------------");
                for(int r=0;r<mat.length;r++){
                    for(int c=0;c<mat[0].length;c++){
                        System.out.print("Matriz ["+r+"]["+c+"]: ");
                        mat[r][c] = leer.nextInt();
                    }
            System.out.println("-----------------");
                }
            break;
            
            
            case 2:
            System.out.println("\nAleatorios A");
            System.out.println("-----------------");
                for(int r=0;r<mat.length;r++){
                    for(int c=0;c<mat[0].length;c++){
                        int num = azar.nextInt(90)+10;
                        System.out.println("Matriz ["+r+"]["+c+"]: "+num);
                        mat[r][c] = num;
                        }
                    System.out.println("-----------------");
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
         System.out.println("\nMostrar A");
         System.out.println("-----------------"); 
             for(int r=0;r<mat.length;r++){
                 for(int c=0;c<mat[0].length;c++){
                    System.out.println("Matriz A ["+r+"]["+c+"]:"+mat[r][c]);
                   
                 }
                 System.out.println("-----------------");
            }
        
             op = 0;
            System.out.print("1.Pares"
                           + "\n2.Nones"
                           + "\n3.Promedio Diagonal Principal"
                           + "\n4.Promedio Diagonal Invertida"
                           + "\n5.Matriz Transpuesta"
                           + "\n6.Multiplicar"
                           + "\nOpcion: ");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Pares por columna");
                     for(int i=0;i<Matriz.pares(mat).length;i++){
                    System.out.println("Columna "+i+": "+Matriz.pares(mat)[i]);
                     }
                    break;
                    
                case 2:
                    System.out.println("Nones por renglon");
                    for(int i=0;i<Matriz.nones(mat).length;i++){
                        System.out.println("Renglon "+i+": "+Matriz.nones(mat)[i]);
                    }
                    break;
                case 3:
                    System.out.println("Pomedio diagonal principal");
                    System.out.println("Promedio = "+Matriz.promDP(mat));
                    break;
                case 4:
                    System.out.println("Promedio diagonal invertida");
                    System.out.println("Promedio = "+Matriz.promDI(mat));
                    break;
                case 5:
                    System.out.println("Transponer A");
                    System.out.println("-----------------");
                    for(int r=0;r<Matriz.transponer(mat).length;r++){
                        for(int c=0;c<Matriz.transponer(mat)[0].length;c++){
                            System.out.println("Matriz ["+r+"]["+c+"]:"+Matriz.transponer(mat)[r][c]);
                        }
                    System.out.println("-----------------");
                    }
                    break;
                case 6:
                System.out.println("Multiplicar por MatrizA X MatrizB");
                ren = 0;
                col = 0;
  
                System.out.println("Introducce el tamaño de la matriz B ");
                System.out.print("Renglones de B: ");
                ren = leer.nextInt();
                System.out.print("Columnas de B: ");
                col = leer.nextInt();
        
                int mat2 [][] = new int[ren][col];
            
                System.out.println("-----------------");
                for(int r=0;r<mat2.length;r++){
                    for(int c=0;c<mat2[0].length;c++){
                        System.out.print("MatrizB ["+r+"]["+c+"]: ");
                        mat2[r][c] = leer.nextInt();
                    }
                     System.out.println("-----------------");
                }
         System.out.println("\nMostrar B");
         System.out.println("-----------------"); 
             for(int r=0;r<mat2.length;r++){
                 for(int c=0;c<mat2[0].length;c++){
                    System.out.println("MatrizB ["+r+"]["+c+"]:"+mat2[r][c]);
                 }
                 System.out.println("-----------------"); 
            }
             
        System.out.println("\nMultiplicar Matriz A y Matriz B");
        System.out.println("-----------------");
            for(int r=0;r<Matriz.multiplicar(mat, mat2).length;r++){
                for(int c=0;c<Matriz.multiplicar(mat, mat2)[0].length;c++){
                    System.out.println("MatrizB ["+r+"]["+c+"]: "+Matriz.multiplicar(mat, mat2)[r][c]);
                }
               System.out.println("-----------------");
            }
       
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
}
}
