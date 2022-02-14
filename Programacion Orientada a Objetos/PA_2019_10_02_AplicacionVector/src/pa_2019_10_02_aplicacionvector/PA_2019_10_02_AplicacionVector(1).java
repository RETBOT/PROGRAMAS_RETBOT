/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_02_aplicacionvector;

/**
 *
 * @author admin
 */
public class PA_2019_10_02_AplicacionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector f1 = new Vector(90,20);
        Vector f2 = new Vector();
        f2.setMagnitud(120);
        f2.setAngulo(55);
        
       Vector fr = f1.suma(f2);
       
        System.out.println("f1 "+f1+" x= "+f1.getX()+" y= "+f1.getY());
        System.out.println("f2 "+f2+" x= "+f2.getX()+" y= "+f2.getY());
        System.out.println("fr "+fr);
     
    Vector f3 = new Vector();
       f3.setXY(84.57, 30.78);

    System.out.println("f3 "+f3);
    System.out.println("fix "+f1.getX());
    System.out.println("fiy "+f1.getY());
    
    
    Vector f4 = new Vector(90,200);
    Vector f5 = f1.suma(f4);
    
        System.out.println("-----------------------------------------");
        
        System.out.println("f5 "+f5);
        
        
    Vector f6 = new Vector(50,20);
    f5 = f1.suma(f6);
        System.out.println("f5"+f5);
    
    
    
    }
    
}
