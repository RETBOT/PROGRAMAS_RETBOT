/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadapoo2;

/**
 *
 * @author admin
 */
public class Nodo {
    
    private int dato;
    private double datoD;
    private String nombre;
    
    Nodo sig;
    
    
    public Nodo(int d, double dd, String nom){
    dato = d;
    datoD = dd;
    nombre = nom;
    sig = null;
    }
    
    public void inserta(Nodo nodo){
    if(this.sig == null){
    sig = nodo;
    nodo.sig = null;
    }
    }
     
   public void insertaSiguienteNodo(Nodo nodo){
    if(this.sig == null){
        sig = nodo;
        nodo.sig = null;
    }
   }
    
    public void muestra(){
    Nodo p1ista;
    p1ista = this; //apunta al inicio de la lista 
    
    while(p1ista != null){
        System.out.println("| "+p1ista.dato +" , "+ p1ista.datoD + " , "+p1ista.nombre+" | "+ "-> ");
        p1ista = p1ista.sig;
        }
        System.out.println("Null");
        System.out.println();
    }
}
