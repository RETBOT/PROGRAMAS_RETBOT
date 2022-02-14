/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_28_aplicacionpila;

/**
 *
 * @author aa524
 */
public class Pila {

    private double datos[];
    private int tope;

    public Pila() {
        datos = new double[10];
        tope = -1; // pila vacia
    }

    public Pila(int n) {
        datos = new double[n];
        tope = -1;
    }

    public boolean estaVacio() {
        return tope == -1;
        
//        if (tope == -1) 
//            return true;
//        else 
//            return false;
    }
    public boolean estaLLena(){
    return tope == datos.length-1;
    }
    
    public int getTope(){
    return tope;
    }

    public String toString() {
        String cad = "{";
        for(int i=0;i<=tope;i++)
            cad = cad + datos[i]+",";
        cad = cad +"}";
        return cad;
    }
    
    

}
