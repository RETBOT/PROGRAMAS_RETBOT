
package pa_2019_08_27_aplicacionconooo;

import java.util.Random;
import java.util.Scanner;

public class PA_2019_08_27_AplicacionConoOO {

    public static void main(String[] args) {
     
    Scanner leer = new Scanner(System.in);
       
    System.out.print("Radio del cono: ");
    double rad = leer.nextDouble();
        
    System.out.print("Altura del cono: ");
    double alt = leer.nextDouble();
        
    // crear el objeto 
    Cono  nieve = new Cono(rad,alt);
        
    // Asignamos los valores a los atributos del objeto
//    nieve.setRadio(rad);
//    nieve.setAltura(alt);
        
        
        // Mostramos resultado 
    System.out.println("Area = "+nieve.area());
    System.out.println("Volumen = "+nieve.volumen());
    
    Cono barquillo = new Cono();
    Random azar = new Random();
    
    barquillo.setRadio(azar.nextInt(50));
    barquillo.setAltura(azar.nextInt(100));
    
    
    System.out.println("\nRadio del barquillo: "+barquillo.getRadio());
    System.out.println("Altura del barquillo: "+barquillo.getAltura());
    System.out.println("Area barquillo = "+barquillo.area());
    System.out.println("Volumen barquillo = "+barquillo.volumen());
  
    
    Cono mixto = new Cono();
    
    mixto.setRadio(nieve.getRadio());
    mixto.setAltura(barquillo.getAltura());
    
    System.out.println("\nRadio del mixto: "+mixto.getRadio());
    System.out.println("Altura del mixto: "+mixto.getAltura());
    System.out.println("Area mixto = "+mixto.area());
    System.out.println("Volumen mixto = "+mixto.volumen());

    System.out.println("--------------------------------------");
    
    System.out.println("Nieve: "+nieve);   
    System.out.println("Barquillo: "+barquillo);
    System.out.println("Mixto: "+mixto);
    }
}
