/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbasesnumericas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class APPBasesNumericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int a,b,suma,resta,opcion;
        char opc = 's';
        
  
         do{
         System.out.print("Selecciona la opcion\n1.Binario\n2.Octal\n3.Decimal\n4.Hexadecimal\nOpcion: ");
             try{
             opcion = leer.nextInt();
             
             }catch(InputMismatchException e){
             System.out.println("ERROR, ENTRADA NO VALIDA, MENSAJE DEL COMPILADOR = "+ e.getMessage());
            System.out.println("Se asignara un valor por default = decimal");
            opcion = 3;
             leer.nextLine();
            }
             
        switch(opcion){
        case 1:
        System.out.print("Introduce el primer numero Binario: ");
        a = leer.nextInt(2);
        System.out.print("Introduce el siguiente numero Binario: ");
        b = leer.nextInt(2);
        suma = a+b;
        resta = a-b;
        System.out.printf("La suma = %s\nla resta = %s"
                           ,Integer.toBinaryString(suma)
                           ,Integer.toBinaryString(resta));    
        break;
        
        case 2:
        System.out.print("Introduce el primer numero Octal: ");
        a = leer.nextInt(8);
        System.out.print("Introduce el siguiente numero Octal: ");
        b = leer.nextInt(8);
        suma = a+b;
        resta = a-b;
        System.out.printf("La suma = %s\nla resta = %s"
                           ,Integer.toOctalString(suma)
                           ,Integer.toOctalString(resta));
        break;
         
        case 3:
        System.out.print("Introduce el primer numero Decimal: ");
        a = leer.nextInt();
        System.out.print("Introduce el siguiente numero Decimal: ");
        b = leer.nextInt();
        suma = a+b;
        resta = a-b;
        System.out.printf("La suma = %s\nla resta = %s",suma,resta);  
            

        break;
         
        case 4: 
        System.out.print("Introduce el primer numero Hexadecimal: ");
        a = leer.nextInt(16);
        System.out.print("Introduce el siguiente numero Hexadecimal: ");
        b = leer.nextInt(16);
        suma = a+b;
        resta = a-b;
        System.out.printf("La suma = %s\nla resta = %s"
                           ,Integer.toHexString(suma)
                           ,Integer.toHexString(resta));
        break;
        default: 
        System.out.println("Opcion no valida");
        break;
        }       

        System.out.print("\nSeguir (s/n): ");
        opc = leer.next().charAt(0);
        
        opc = Character.toLowerCase(opc);
        }while(opc == 's' );
}
}
  
    
    

