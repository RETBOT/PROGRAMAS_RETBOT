/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppila2;

/**
 *
 * @author admin
 */
public class Pila {
    private int [] datos;
    private int tope;

    
//    int tam;
    
    public Pila(int n){
    datos = new int[n];
    tope = -1;
//    tam = n;
//    tam = datos.length;
    }
    
    public boolean push(int valor){
    if(tope== datos.length -1)
        return false;
    else {
        datos[++tope] = valor;
        return true;
    }
    }
    
    public boolean pop(Numero valor){
        if(tope==1)
            return false;
        else{
            valor.num = datos[tope--];
            return true;
        }
    }
    
    public void mostrar(){
        System.out.println("Datos en la Pila ");
        for(int i=0;i<=tope;i++){
            System.out.println("Dato ["+i+"] : "+datos[i]);
        }
    }
    
    public int getTope(){
    return tope;
    }
    
}
