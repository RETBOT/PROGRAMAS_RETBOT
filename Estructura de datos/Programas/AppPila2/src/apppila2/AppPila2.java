/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppila2;

import java.util.Random;

/**
 *
 * @author admin
 */
public class AppPila2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random = new Random();
        //agregar el menu a esta aplicacion 
        int cantDatos = 5;//random.nextInt(6)+5;
        Pila stack = new Pila(cantDatos);
         System.out.println("INSERTANDO DATOS EN LA PILA");
        for(int i = 0; i < cantDatos;i++)
            if(stack.push(random.nextInt(10)))
                  stack.mostrar();

        System.out.println("\n\n");
        Numero dato = new Numero();
        dato.num= -1;

        while(stack.pop(dato))
        {
            System.out.println("Dato Extraido : " + dato.num);
        }
        System.out.println("underflow, ya no hay datos en la Pila");
    }
    
}
