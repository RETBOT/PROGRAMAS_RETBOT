/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientos_;

/**
 *
 * @author admin
 */
public class Busquedas {
     static public void SecuencialDatosDesordenados(int []vec, int X, Numero pos)
    {
        pos.num = -1;
        int i = 0;
        while((pos.num == -1)  && (i < vec.length))
        {
             if(vec[i] == X )
             {
                 pos.num = i;
                 break;
             }
             i++;
        }
    }//NOTA: IMPLEMENTAR UN METODO CON SU PROPUESTA
    
//    for(int i=0;i<vec.length-1;i++){
//       if(vec[i] == dato){
//       band = true;
//       pos.num = i;
//       }       
//    } 
//    }
    
    
    public static boolean secuencialDatosOrdenados(int vec [] , int dato, Numero pos){
       int i=0;
        while(vec[i] < dato && i < vec.length)
        i++;

        if(vec[i]==dato){
        pos.num = i;
        return true;
        }
        return false;
    }
}
