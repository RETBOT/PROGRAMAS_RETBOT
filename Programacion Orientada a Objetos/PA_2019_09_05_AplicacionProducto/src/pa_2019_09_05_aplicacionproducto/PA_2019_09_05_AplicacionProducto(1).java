
package pa_2019_09_05_aplicacionproducto;

import java.util.Arrays;

public class PA_2019_09_05_AplicacionProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Producto tvSamsung = new Producto();
        
        tvSamsung.setDescripcion("Pantalla curva 42 ");
        tvSamsung.setCosto(8000);

        System.out.println("Precio de "+tvSamsung.getDescripcion()+" $"+tvSamsung.precio());

        Producto tvLG = new Producto("Pantalla LG 50 HD ",8000,12,4,16);
        System.out.println("Precio de "+tvLG.getDescripcion()+" $"+tvLG.precio()); 
        
        int [] enteros = {5,8,2,9,8,1,0};
        
        
        Arrays.sort(enteros);
         
        for (int i=0; i<enteros.length; i++){
            System.out.println(enteros[i]);
        }
        
        String [] cosas = {"Pizarron","Borrador","Lentes","Mouse","Reloj","Zapatos","Tenis","LLaves"};
        
        Arrays.sort(cosas);
        System.out.println();
         for (int i=0; i<cosas.length; i++){
            System.out.println(cosas[i]);
        }
    }
    
}
