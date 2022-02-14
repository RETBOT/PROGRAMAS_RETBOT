/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_11_aplicacionmatriz;

import java.util.Random;

/**
 *
 * @author admin
 */
public class PA_2019_10_11_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Matriz uno = new Matriz(3,4);
       uno.setValor(7,0,0);
       uno.setValor(9,0,1);
       uno.setValor(0,0,2);
       uno.setValor(6,0,3);
       uno.setValor(42,1,0);
       uno.setValor(5,1,1);
       uno.setValor(85,1,2);
       uno.setValor(34,1,3);
       uno.setValor(62,2,0);
       uno.setValor(1,2,1);
       uno.setValor(29,2,2);
       uno.setValor(18,2,3);
    
    uno.mostrar();
    
    Matriz dos = new Matriz(15,20);
    Random azar = new Random();
        for (int r = 0; r < dos.getRenglones(); r++) 
            for (int c = 0; c < dos.getColumnas(); c++) 
                dos.setValor(100, r, c);

      dos.mostrar();
    
    
    double [][] x= {
            {7,2,0},
            {1,4,5}
            };
    
    Matriz tres = new Matriz(x);
    tres.mostrar();
    
    System.out.println("------------------------------------------------------");
   Matriz A = new Matriz(2,3);
   A.setValor(5, 0, 0);
   A.setValor(8, 0, 1);
   A.setValor(-3, 0, 2);
   A.setValor(2, 1, 0);
   A.setValor(0, 1, 1);
   A.setValor(1, 1, 2);

   A.mostrar();
   
   double [][] b = {{4,7,0},{-5,2,6}};
   
    Matriz B = new Matriz(b);
    B.mostrar();
    
  Matriz C = A.suma(B);
  C.mostrar();
  
  C = A.resta(B);
  C.mostrar();
  
  
  Matriz D = A.multiplicacion(10);
 D.mostrar();
 
 Matriz E = uno.suma(A);
 E.mostrar();
  }
}
