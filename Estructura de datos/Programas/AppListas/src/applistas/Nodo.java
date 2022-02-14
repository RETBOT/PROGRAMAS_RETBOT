/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistas;

/**
 *
 * @author admin
 */
public class Nodo {
    
    int dato;
    Nodo sig;
    
    
    public Nodo(int d){
    dato = d;
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
        System.out.print("| "+p1ista.dato+" -> ");
        p1ista = p1ista.sig;
        }
        System.out.println("Null");
        System.out.println();
    }
}
