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
public class AppListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo inicioLista = new Nodo(5);
        Nodo nodo = inicioLista;
        for(int i=0;i<5;i++){
        Nodo nodoAux =  new Nodo(i*i);
        nodo.insertaSiguienteNodo(nodoAux);
        nodo = nodoAux;
        }
        inicioLista.muestra();
        nodo.muestra();
    }
    
}
