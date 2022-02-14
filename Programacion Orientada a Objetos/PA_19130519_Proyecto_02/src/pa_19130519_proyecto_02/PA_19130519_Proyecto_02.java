/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_02;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PA_19130519_Proyecto_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        
        int z = 223846/63360;
        System.out.println("milla "+z);
        int z2 = 223846%63360;
        System.out.println(z2);
        
        int y = z2/72;
        System.out.println("brazosa "+y);
        int y2 = z2%72;
        System.out.println(y2);

        int r = y2/36;
        System.out.println("yarda "+r);
        int r2 = y2%36;
        System.out.println(r2);
        
        int g = r2/12;
        System.out.println("pie "+g);
        int g2 = r2%12;
        System.out.println(g2);
        
        System.out.println("Pulgada "+g2);
        
 
    
     Distancia a = new Distancia(5,590,1,2,8);
     Distancia b = new Distancia(9,318,1,1,10);
     
     Distancia c = b.resta(a);
     
        System.out.println(c);
        
        
 
        

    }
    
}
