/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadaordenada;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author martinvaldes
 */
public class AppListaEnlazadaOrdenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ListaEnlazadaO lista = new ListaEnlazadaO();
            Scanner leer = new Scanner(System.in);
            int opc=0, clave=0;
            String producto;
            double precio = 0;
            char op = 's';
            
            System.out.println("Tiendita");
            do{
            System.out.print("1)Agregar producto\n2)Borrar producto\n3)Mostrar productos\nOpciones: ");
            try{
            opc = leer.nextInt();
            }catch(InputMismatchException ex){
                leer.nextLine();
            }
            
            switch(opc){
                case 1: System.out.print("Clave del producto: ");
                        try{
                        clave = leer.nextInt();
                        }catch(InputMismatchException ex){
                            System.out.println("Clave incorrecta");
                            break;
                        }
                        System.out.print("Nombre del producto: ");
                        leer.nextLine();
                        producto = leer.nextLine();
                        System.out.print("Precio del producto: ");
                        try{
                        precio = leer.nextDouble();
                        }catch(InputMismatchException ex){
                          System.out.println("Clave incorrecta");
                            break;
                        }
                        lista.Insertar(clave, producto, precio);
                        break;
                        
                case 2: System.out.print("Clave de producto: ");
                        clave = leer.nextInt();
                        lista.Borrar(clave);
                        break;
                case 3: lista.Mostrar();
                        break;
                default:
                    System.out.println("Error, opcion invalida");
                    break;
            }
                System.out.print("Desea continuar (s/n): ");
                op = leer.next().charAt(0);
                op = Character.toLowerCase(op);
                
            }while(op=='s');

    }
    
}
