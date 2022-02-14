/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppila;

/**
 *
 * @author admin
 */
public class PilaGenerica <T>{
    private Object [] pila;
    int tope;
    private boolean vacia;
    private boolean llena;
    
    public PilaGenerica(int n){
        pila = new Object[n];
        tope = 0;
        vacia = true;
        llena = false;
    }
    
    public void push(T valor){
     vacia = false;
     pila[tope++] = valor;
     if(tope == pila.length)
         llena = true;
    }
    
    public T pop(){
    if(--tope == 0)
        vacia = true;
    llena = false;
    return (T)pila[tope];
    }
    
    public boolean estaVacia(){
    return vacia;
    }
    
    public boolean estaLlena(){
    return llena;
    }
}
