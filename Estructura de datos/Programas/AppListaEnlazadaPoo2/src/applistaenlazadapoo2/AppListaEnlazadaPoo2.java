/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadapoo2;

import java.util.Random;

/**
 *
 * @author admin
 */
public class AppListaEnlazadaPoo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Random numero = new Random();
        String[] nombres = { "Ana", "Juana", "Juan", "Maria", "Kevin", "Jorge", "Adrian", "Rogelio", "Alejandro", "Aldo" };

        Nodo primero = new Nodo(numero.nextInt(90)+10, numero.nextDouble()+100, nombres[numero.nextInt(nombres.length)]);
        Nodo nodo = primero;//nodo APUNTA primero
        for(int i = 0; i < 4;i++)
        {
           Nodo nuevo = new Nodo(numero.nextInt(90)+10, numero.nextDouble()+100, nombres[numero.nextInt(nombres.length)]); 
           nodo.insertaSiguienteNodo(nuevo);
           nodo = nuevo;
        } 
        primero.muestra(); 
        nodo.muestra();
    }
    
}
