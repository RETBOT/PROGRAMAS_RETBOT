/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_30_aplicacionparalelepipedo;

/**
 *
 * @author admin
 */
public class PA_2019_10_30_AplicacionParalelepipedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Linea recta = new Linea(10);
        Rectangulo puerta = new Rectangulo(95,210);
        Paralelepipedo cpu = new Paralelepipedo(10,35,40);
        
        System.out.println("Recta "+recta);
        System.out.println("Puerta "+puerta);
        System.out.println("Cpu "+cpu);
        
        Linea pizarron = new Rectangulo(500,120);
        System.out.println("Pizzarron "+pizarron);
        
        Linea borrador = new Paralelepipedo(12,6,3);
        System.out.println("Borrador"+borrador);
        
        Rectangulo caja = new Paralelepipedo(10,20,30);
        System.out.println("Caja"+caja);
        
        //Rectangulo x = new Linea(); no se puede solo se puede hacie arriba 
        
        
       
    }
    
}
