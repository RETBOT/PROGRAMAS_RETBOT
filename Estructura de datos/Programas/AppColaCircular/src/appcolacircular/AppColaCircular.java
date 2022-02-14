/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacircular;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int dato, op;
        Numero numero = new Numero();
        Cola cola = new Cola(4);
//        Menu menu = new Menu(); // no se requiere el metodo menu
        Scanner leer = new Scanner(System.in);
        boolean band = true;
        
        while(band){
        op = Menu.opciones();
        switch(op){
            case 1: {
            System.out.print("\033[34m Dato: ");
            dato = leer.nextInt();
            if(!cola.estaLlena()){
            cola.insertar(dato);
            System.out.println("\033[35m Dato agregado");
            cola.mostrar();
            }else
            System.out.println("\033[31m Desvordamieno -Overflow- ");
            break;
            }
            
            case 2:{ 
                if(!cola.estaVacia()){
                cola.eliminar(numero); //usamos la referencia con el objeto numero
                    System.out.println("\n\033[31m dato eliminado = "+numero.num);
                    cola.mostrar();
                }else
                    System.out.println("\033[31m Cola vacia -UnderFlow-");
                break;
            }
            case 3: band = false;
            break;
            }  
        }
    }
}
