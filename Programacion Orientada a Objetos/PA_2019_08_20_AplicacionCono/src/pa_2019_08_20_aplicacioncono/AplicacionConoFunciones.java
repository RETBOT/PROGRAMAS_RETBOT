package pa_2019_08_20_aplicacioncono;

import java.util.Scanner;

public class AplicacionConoFunciones {
     public static void main(String[] args) {

        //Declaración de variable
        double radio, altura, volumen, area, generatriz;
   
       //Entrada de datos
        Scanner leer = new Scanner(System.in); 
         System.out.println("Funciones");
        System.out.print("Radio del cono: ");
        radio = leer.nextDouble();
        
        System.out.print("Altura del cono: ");
        altura = leer.nextDouble();
        
        //proceso de datos
        volumen = volumenCono(radio,altura);
        generatriz = areaCono(radio,altura);
        area = Math.PI * radio *(radio+generatriz);
        
        //salida 
        System.out.println("Area = "+area);
        System.out.println("Volumen = "+volumen);
           
    }
     // definición de funciones
    public static double volumenCono(double r, double h)  
    {
//       double v;
//       v = Math.PI * Math.pow(r,2)*h/3;
//       return v;
    return Math.PI*Math.pow (r,2)+h/3;
    }
    
    public static double generatriz(double r, double h)
    {
    return Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
    }
    
    public static double areaCono(double r, double h)
    {
    return Math.PI*r*(r+generatriz(r,h));
    }
 }
