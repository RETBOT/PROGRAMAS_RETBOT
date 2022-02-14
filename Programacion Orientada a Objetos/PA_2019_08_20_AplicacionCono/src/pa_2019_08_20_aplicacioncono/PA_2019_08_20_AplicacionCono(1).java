package pa_2019_08_20_aplicacioncono;

import java.util.Scanner;

public class PA_2019_08_20_AplicacionCono {

    public static void main(String[] args) {

        //Declaración de variable
        double radio, altura, volumen, area, generatriz;
   
       //Entrada de datos
        Scanner leer = new Scanner(System.in); 
     
        System.out.print("Radio del cono: ");
        radio = leer.nextDouble();
        
        System.out.print("Altura del cono: ");
        altura = leer.nextDouble();
        
        //proceso de datos
        volumen = Math.PI*Math.pow(radio,2)*altura/3;
        generatriz = Math.sqrt(Math.pow(radio,2)+Math.pow(altura, 2));
        area = Math.PI * radio *(radio+generatriz);
        
        //salida 
        System.out.println("Area = "+area);
        System.out.println("Volumen = "+volumen);
           
    }

}
