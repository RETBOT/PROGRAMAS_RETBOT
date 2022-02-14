/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacirculargui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */

//hacer los cambios necesarios para hacer la clase template
public class Cola {
    int cola[];
    int p,u;
    int tam;
    
    public Cola(int n){
    tam = n;
    p = u = -1;
    cola = new int[n];
    }
    
    public boolean estaLlena(){
    //tarea realizar prueba de escritorio 
    int resul = (u+1)% tam;
    return resul == p;
    
//    return (((u+1)%tam)==p);
    }
    
    public boolean estaVacia(){
//        if(p==-1)
//            return true;
//                    
//        return false;
        return (p == -1);
    }
    
    public boolean insertar(int dato){
        //cola.length-1
    if(((u==tam-1)&&(p==0))||(u+1 == p))
      return false;
    
    else if (u==tam-1)
        u=0;
    else 
        u++;
        cola[u]=dato;
     
    if(p==-1)
       p=0;   
    return true;
      
    }
    
    public boolean eliminar(Numero dato){
        if(p==-1)
            return false;
        
         dato.num = cola[p];
         
         if(p==u)
             p=u=-1;
         
         else if(p==tam-1){
         cola[p] = -1;
         p=0;
         }else{
         cola[p]=-1;
         p++;
         }
         return true;
    }
    
    public void mostrar(){
        for(int i=0;i<cola.length;i++){
            System.out.println("\033[34m   Cola["+i+"] : "+cola[i]);
        }
    }
    
    public void mostrar(DefaultTableModel tabla) //JTable tabla)
       {
         for(int i=0;i<cola.length;i++){
         tabla.insertRow(tabla.getRowCount(), new Object[] {cola[i]});
         }
    }
}
