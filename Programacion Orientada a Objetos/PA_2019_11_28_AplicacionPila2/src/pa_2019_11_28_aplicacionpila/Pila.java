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
public class Pila {
    private double [] datos; 
    private int tope;
    
    public Pila()
    {
        datos = new double[10];
        tope = -1; // Pila vacía
    }
    
    public Pila(int n)
    {
        datos = new double[n];
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
    
    
    public void poner(double x)
    {
        if(!estaLlena())
        {
            tope++;
            datos[tope] = x;
        }
    }
    
    public double quitar()
    {
        if(!estaVacia())
        {
            tope--;
            return datos[tope+1];
        }
        
        else
            return 0;
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
