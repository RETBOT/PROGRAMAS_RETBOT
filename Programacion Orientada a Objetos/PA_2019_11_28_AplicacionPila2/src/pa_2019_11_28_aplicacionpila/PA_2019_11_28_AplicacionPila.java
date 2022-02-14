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
public class PA_2019_11_28_AplicacionPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila calif = new Pila(7);
        Random azar = new Random();
        
        System.out.println(calif);
        while(!calif.estaLlena())
        {
            calif.poner(azar.nextInt(100));
            System.out.println(calif);
        }
        
        while(!calif.estaVacia())
        
            System.out.println(calif+" -> "+calif.quitar());
        
        System.out.println(calif);
    }
    
}
