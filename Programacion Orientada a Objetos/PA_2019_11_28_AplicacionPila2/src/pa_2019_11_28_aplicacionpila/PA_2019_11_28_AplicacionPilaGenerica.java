/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_28_aplicacionpila;

import java.util.Random;

/**
 *
 * @author aa527
 */
public class PA_2019_11_28_AplicacionPilaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PilaGenerica<Integer> enteros = new PilaGenerica(7);
        Random azar = new Random();
        
        System.out.println(enteros);
        while(!enteros.estaLlena())
        {
            enteros.poner(azar.nextInt(100));
            System.out.println(enteros);
        }
            vaciarPila(enteros,"Pila de Enteros");
            
            String [] cosas = {"Lentes","Reloj","Mouse","Teclado","Tele","Borrador","Corrector",
                              "Laptop","CPU","Tablet","Celular","Puerta"};
                    
            PilaGenerica<String> cadenas = new PilaGenerica(6);
            
        System.out.println(cadenas);
        while(!enteros.estaLlena())
        
            cadenas.poner(cosas[azar.nextInt(cosas.length)]);
            System.out.println(cadenas);
       
        }
    
    public static void vaciarPila(PilaGenerica pila, String letrero)
    {
        System.out.println("\n"+letrero);
        System.out.println("==================================");
        while(!pila.estaVacia())
        
            System.out.println(pila+" -> "+pila.quitar());
        
        System.out.println(pila);
        
    }
}
