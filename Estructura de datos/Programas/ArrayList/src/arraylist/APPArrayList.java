/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class APPArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arregloInts = new ArrayList<>();
         
        char cad[] = {'H','o','l','a'};
        String cadenaS = new String(cad);
        
        ArrayList<String> arregloL = new ArrayList<>();
        arregloL.add(cadenaS);
        
        /*
        System.out.println(cadenaS);
        arregloL.add("Tecnologico");
        arregloL.add("de");
        arregloL.add("la laguna");
        */
        arregloL.add("h");
        arregloL.add("o");
        arregloL.add("l");
        arregloL.add("a");
        System.out.println(arregloL);
        
        System.out.println("Valor de size "+arregloL.size());
        
        for(int i=0;i<arregloL.size();i++)
            System.out.println(arregloL.get(i));
 
        }
    
}
