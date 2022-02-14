/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor.y.menor;

import java.util.Random;

/**
 *
 * @author admin
 */
public class MayorYMenor {

    /**
     * @param args the command line arguments
     */
    
    public static int menor(int [] v){
    int m = v[0];
    for(int i=1;i<v.length;i++)
        if( v[i] < m){
          m = v[i];
          }
    return m;
    }
    
    public static int mayor(int [] v){
    int m = v[0];
    for(int i=1;i<v.length;i++)
        if( v[i] > m){
          m = v[i];
          }
    return m;
    }
    
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++){
            System.out.println("Argumentos "+(i+1)+" = "+args[i]);
        }
        
        // Arreglo unidimensional 
        // Inicializacion con valores por default
      int [] vec = {5,88,92,10,14,21,45,32,99,10};
      
      for(int i=0;i<vec.length;i++){
          System.out.println("Vec ["+i+"] = "+vec[i]);
      }
        
        System.out.println("Mayor = "+mayor(vec)+"\nMenor = "+menor(vec));
        
        System.out.println("Inverso");
        for(int i=vec.length-1;i>0;i--){
            System.out.println("vec["+i+"] = "+vec[i]);
        }
        System.out.println(" ");
        
         // Random
        Random azar = new Random();
        
        // 5 < n <=10
        int vec2[] = new int[azar.nextInt(6)+5];
  
        
        for(int i=0; i<vec2.length; i++){
        vec2[i] = azar.nextInt(90)+10;
            System.out.println("Vec 2 ["+i+"] = "+vec2[i]);
        }
        
        System.out.println("Mayor = "+mayor(vec2)+"\nMenor = "+menor(vec2));
 
        for(int i=vec2.length-1;i>0;i--){
            System.out.println("vec 2["+i+"] = "+vec2[i]);
        }
    }
    
}
