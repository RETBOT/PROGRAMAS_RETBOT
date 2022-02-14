/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppila;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
        Random azar = new Random();
//        Scanner leer = new Scanner(System.in);
//        
//        System.out.print("Tamaño de la pila: ");
//        int tam = leer.nextInt();
//        Pila stack = new Pila(tam);
//        
////       System.out.println("Introducciendo datos a la pila :");
//////        for (int i=0;!stack.estaLlena();i++) 
////          while(!stack.estaLlena()){
////          int dato = azar.nextInt(90)+10;
////              System.out.println("Dato insertado en la pila :"+dato);
////              stack.push(dato);
////          }
////        System.out.println("\t Extrayendo datos de la pila");
////        while(!stack.estaVacia()){
////        int dato = stack.pop();
////            System.out.println("Dato eliminado = "+dato);
////        }
//////           
//        
//        String cadena = "hola";
//        PilaChar pilaLetras = new PilaChar(cadena.length());
//        System.out.println("Introduccioendo Letras en la Pila");
//      
//        System.out.println("Cadena a insertar: "+cadena);
//        int i=0;
//        while(!pilaLetras.estaLlena()){
//        pilaLetras.push(cadena.charAt(i++));
//            System.out.println("Extraer letras de la pila");
//        }
//        while(!pilaLetras.estaVacia()){
//            System.out.print(pilaLetras.pop());
//            System.out.println();
//        }
//
//
//        int opc,dato;
//        boolean op1 = true;
//        
//        System.out.print("Trabajando con una pila");
//
//        while(op1!=false){
//        System.out.print("\nQue deseas hacer\n1)Insertar Dato\n2)Extraer Dato\n3)Salir\nOpcion: ");
//        opc = leer.nextInt();
//       
//        switch(opc){
//            case 1: 
//                System.out.print("Dato: ");
//                dato = leer.nextInt();
//                if(!stack.estaLlena()){
//                  System.out.print("Dato agregado: "+dato);
//                    stack.push(dato);
//                   
//                }else
//                    System.out.print("Desbordamiento(Overflow)\n");
//                break;
//            case 2:
//                if(!stack.estaVacia()){
//                dato = stack.pop();
//                    System.out.print("Dato eliminado "+dato);
//                }else
//                    System.out.print("Pila vacia(Underflow)\n");
//                break;
//            case 3:
//                op1 = false;
////                System.exit(0);
//        }  
//        opc=0;
//        }
//    }
        String cadena = "hola";
        PilaGenerica<Character> pilaLetras = new PilaGenerica<Character>(cadena.length());
        System.out.println("Introduccioendo Letras en la Pila");
      
        System.out.println("Cadena a insertar: "+cadena);
        int i=0;
        while(!pilaLetras.estaLlena())
        pilaLetras.push(cadena.charAt(i++));
            System.out.println("Extraer letras de la pila");
        
        while(!pilaLetras.estaVacia())
            System.out.print(pilaLetras.pop());
            System.out.println();
        
            PilaGenerica<Double> pilaDoubles = new PilaGenerica<Double>(azar.nextInt(6)+5);
            //Asignar valores aleatorios
            
           // Tarea Domingo 6 Dic.  
           // Utilizar la App. GUI del arreglo unidimensional 
           // Para manejar pilas de diferentes tipos - Character, Integer, Double-
            
    }
}
