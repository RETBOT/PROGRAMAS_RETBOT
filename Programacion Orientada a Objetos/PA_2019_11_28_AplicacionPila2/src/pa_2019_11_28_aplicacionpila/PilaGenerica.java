/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_28_aplicacionpila;

/**
 *
 * @author aa527
 */
public class PilaGenerica <T>{
    private T [] datos; 
    private int tope;
    
    public PilaGenerica()
    {
        datos = (T[]) new Object[10]; // Esto es un Cast
        tope = -1; // Pila vacía
    }
    
    public PilaGenerica(int n)
    {
        datos = (T[])new Object[n];
        tope = -1; // Pila vacía 
    }
    
    public boolean estaVacia()
    {
        return tope == -1;
        
//        if(tope == -1)
//            return true;
//        else
//            return false; 
    }
    
    public boolean estaLlena()
    {
        return tope == datos.length-1;
    }
    
    public int getTope()
    {
        return tope;
    }
    
    
    public void poner(T x)
    {
        if(!estaLlena())
        {
            tope++;
            datos[tope] = x;
        }
    }
    
    public T quitar()
    {
        if(!estaVacia())
        {
            tope--;
            return datos[tope+1];
        }
        
        else
            return null;
    }
    
    public String toString()
    {
        String cad = "{";
        
        for(int i=0; i<=tope; i++)
        {    
            cad = cad + datos[i]+",";
            if(i<tope)
                cad = cad +",";
        }
        
        cad = cad + "}";
        return cad;
    }
}
