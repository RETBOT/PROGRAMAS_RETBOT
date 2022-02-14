/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcola;

/**
 *
 * @author admin
 */
public class Cola {
    int cola[];
    int p,u;
    
    public Cola(int n){
    p = u = -1;
    cola = new int[n];
    }
    
    public boolean estaLlena(){
    if(u >= cola.length-1)
        return true;
    
    return false;
    }
    
    public boolean estaVacia(){
    if(p == -1)
        return true;
    
    return false;
    }
    
    public boolean agregar(int dato){
    if(!estaLlena()){
     cola[++u]=dato;
        if(u==0)
            p=0;
    return true;
    }
    return false;
    }
    
    public boolean extraer(Numero dato){
    if(!estaVacia()){
    dato.num = cola[p];
    cola[p] = -1;
    if(p==u){
    p=-1;
    u=p;
    }else
       p++;
    return true;   
    }
    return false;
    }
    
    public void mostrar(){
        System.out.println("Datos en la cola: ");
        for(int i=0;i<cola.length;i++){
            System.out.println("\033[34m   Cola["+i+"] : "+cola[i]);
        }
    }
}
