/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_30_aplicaciontriangulo;

import java.text.DecimalFormat;

/**
 *
 * @author admin
 */
public class PA_2019_09_30_AplicacionTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo bermudas = new Triangulo();
    
        Punto m = new Punto(3,-2);
        Punto n = new Punto(-5,8);
        Punto p = new Punto(6,-7);
        
        Triangulo fuentes = new Triangulo(m,n,p);
        
        System.out.println("bermudas "+bermudas);
        System.out.println("fuentes "+fuentes);
    
         n.setX(10000);
         System.out.println("fuentes "+fuentes);
    
    Punto r = bermudas.getPuntoC();
    r.setY(500);
    
        System.out.println("Bermudas: "+bermudas);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("bermudas: Area="+bermudas.area()+ " Perimetro="+bermudas.perimetro());
        System.out.println("fuentes: Area="+fuentes.area()+ " Perimetro="+fuentes.perimetro());

        
        Punto A = new Punto(5,2);
        Punto B = new Punto(5,-4);
        Punto C = new Punto(-3,-4);
        Punto D = new Punto(-3,-2);
        
        Triangulo T1 = new Triangulo(D,A,C);
        Triangulo T2 = new Triangulo(A,B,C);
        
        double areaRectangulo =+ T1.area()+ T2.area();
        
        System.out.println("Area del rectangulo: "+areaRectangulo);
        System.out.println("Lado 1:"+T1.lado1());
        System.out.println("Lado 2:"+T1.lado2());
        System.out.println("Lado 3:"+T1.lado3());
        
        
        
        System.out.println("-----------------------------");
        System.out.println("Triangulo semejante de T1:"+T1.semejante());


    }
    
}
