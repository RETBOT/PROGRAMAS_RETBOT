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
public class Pila {
    int [] pila;
    int tope;
    private boolean vacia;
    private boolean llena;
    
    public Pila(int n){
        pila = new int[n];
        tope = 0;
        vacia = true;
        llena = false;
    }
    
    public void push(int valor){
     vacia = false;
     pila[tope++] = valor;
     if(tope == pila.length)
         llena = true;
    }
    
    public int pop(){
    if(--tope == 0)
        vacia = true;
    llena = false;
    return pila[tope];
    }
    
    public boolean estaVacia(){
    return vacia;
    }
    
    public boolean estaLlena(){
    return llena;
    }
}
