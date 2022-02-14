/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientogui;

public class Busquedas {
    public static void secuencialDatosDesordenados(int vec[], int dato, Numero pos){
     
        pos.num = -1;
        int i=0;
        
        while((pos.num == -1) && (i < vec.length)){
        if(vec[i] == dato){
        pos.num = i;
        }
        i++;
        
      }//nota: implementar un metodo con su propuesta
    }
    
    public static boolean secuencialDatosOrdenados(int vec [] , int dato, Numero pos){
       int i=0;
        while(vec[i]<dato && i < vec.length)
             i++;

        if(vec[i]==dato){
           pos.num = i;
           return true;
        }
        return false;
    }
    
    public static boolean secuencialDatosOrdenadosGUI(int vec [] , int dato, Numero pos){
       int i=0;
        while((vec[i] > dato || vec[i] < dato) && i < vec.length-1)
              i++;
        
        if(vec[i]==dato){
            pos.num = i;
            return true;
        }
        return false;
    }

    static public void busquedaBinaria(int [] vec, int x,Numero pos){
        pos.num = -1;
        int LI = 0;
        int LS = vec.length-1;
        int i;
        while((LI<=LS) && (pos.num == -1)){
            i = (LI+LS)/2;
            if(x == vec[i])
               pos.num = i;
            else if(x < vec[i])
                LS = i-1;
            else 
                LI = i+1;
        }    
    }
}
