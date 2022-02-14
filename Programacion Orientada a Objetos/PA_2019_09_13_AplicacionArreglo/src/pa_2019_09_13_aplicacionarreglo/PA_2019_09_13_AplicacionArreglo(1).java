/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_13_aplicacionarreglo;

import java.util.Random;

/**
 *
 * @author admin
 */
public class PA_2019_09_13_AplicacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arreglo uno = new Arreglo(); // Para usar constructor 1 
        
        
        Arreglo dos = new Arreglo (5); // Para usar constructor 2
        
        double [] x = { 5.4, 3.2, 1.7, 4.3}; //Para usar constructor 3 
        Arreglo tres = new Arreglo(x);
        
        
        Random azar = new Random();
        for(int i=0;i<uno.getTamaño();i++){
        uno.setValor(azar.nextInt(100), i);
        }
        
        
        dos.setValor(15, 2);
        dos.setValor(27,4);
        dos.setValor(10, 0);
        dos.setValor(50,12);
        
        
        System.out.println("uno --> "+ uno);
        System.out.println("dos --> "+ dos);
        System.out.println("tres --> "+ tres);
        
        System.out.println("");
        System.out.println(uno.getValor(2));
        System.out.println(dos.getValor(3));
        System.out.println(tres.getValor(10));
        
        
        double [] y = {6, 2, 9, 1, 8, 0, 3};
        Arreglo cuatro = new Arreglo(y);

        System.out.println("\ncuatro: "+cuatro);
        System.out.println("Suma: "+cuatro.suma());
        System.out.println("Promedio: "+cuatro.promedio());
        System.out.println("Mayor: "+cuatro.mayor());
        System.out.println("Menor: "+cuatro.menor());
        System.out.println("Rango: "+cuatro.rango());
        System.out.println("Mediana: "+cuatro.mediana());
        System.out.println("\ncuatro: "+cuatro);
        
        Arreglo cinco = new Arreglo(cuatro.datosOrdenados());
        System.out.println("\nCinco: "+cinco);

    }
    
}
