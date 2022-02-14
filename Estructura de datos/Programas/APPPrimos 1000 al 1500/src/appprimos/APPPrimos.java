/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appprimos;

/**
 *
 * @author admin
 */
public class APPPrimos {

    /**
     * @Roberto Esquivel Troncoso 
     *  19130519
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean prim = false;
    int contador = 0, con = 0;
    int ini = 1000,fin = 1500;
    
    for(int i = ini;i<=fin;i++){
    if(prim = Matematicas.Primo(i)){
    contador++;
    }
    }
     
     System.out.println("Los numeros del 1000 al 1500 tienen "+contador+" numeros primos ");
     int numPrim [] = new int[contador];
     
     for(int i=ini;i<=fin;i++){
     prim = Matematicas.Primo(i);
     if(prim == true){
     numPrim[con] = i;
     con++;
     }
     }
     for(int i=0;i<numPrim.length;i++){
         System.out.println("Num primo "+(i+1)+" : "+numPrim[i]);
     }
    }
    
}
