/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_27_aplicacionpunto;

/**
 *
 * @author admin
 */
public class PA_2019_09_27_AplicacionPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto A = new Punto(5,-3);
        Punto B = new Punto();
        
        B.setX(7);
        B.setY(2);
        
        Punto C = new Punto(B);
        
        System.out.println("Punto A"+A);
        System.out.println("Punto B"+B);
        System.out.println("Punto C"+C);

        Punto F = new Punto(2,5);
        Punto G = new Punto(-4,-3); 
        
        System.out.println("la distancia entre "+F+" y "+G+" es "+F.distancia(G));
     
        Punto H = F.medio(G);
        
        System.out.println(" y el punto medio es: "+H);
    }
    
}
