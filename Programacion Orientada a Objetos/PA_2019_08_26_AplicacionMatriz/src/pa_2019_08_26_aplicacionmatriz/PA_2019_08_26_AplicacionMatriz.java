/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_08_26_aplicacionmatriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PA_2019_08_26_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    Random azar = new Random();

        System.out.print("Renglones: ");
        int ren = leer.nextInt();
       
        System.out.print("Columnas: ");
        int col = leer.nextInt();
        
        //declaramos la matriz
        int [][] datos = new int[ren][col];
        
        
        //llenamos la matriz con datos aleatoreaos 
        for(int r=0;r<datos.length;r++)
            for(int c=0;c<datos[0].length;c++)
                datos[r][c] = 10+azar.nextInt(90);
        
        //mostramos los datos de la mateiz 
        System.out.println();
        for(int r=0;r<datos.length;r++){
            for(int c=0;c<datos[0].length;c++)
                System.out.print(datos[r][c]+" ");
            System.out.println();
        }
        
    }
    
}
