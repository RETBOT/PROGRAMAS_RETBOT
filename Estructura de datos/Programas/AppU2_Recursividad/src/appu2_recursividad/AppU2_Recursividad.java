/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2_recursividad;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AppU2_Recursividad {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        

//        MatematicasRec numero = new MatematicasRec(); // no twnwmoa metodos static
            
            int r = MatematicasRec.Combinacion(6, 2);
            System.out.printf("Combinacion(%d de &d) = %d",6,2,r);
//        int pot = MatematicasRec.potencia(8, 3);
//        System.out.printf("Potencia de %d a la %d = %d\n ",8,3,pot);  
//        
//        int sum = MatematicasRec.sumatoria(5);
//        System.out.printf("Sumatoria de %d = %d\n",5,sum);
//
//        int fac = MatematicasRec.factorial(4); 
//        System.out.printf("Factorial de %d = %d\n",4,fac);
//        
//        System.out.println("Invertido de 1234 = ");
//        MatematicasRec.invertirNum(1234);

        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        int op = 0,num = 0, resu=0;
        char opc = 's';
        
        do{
        System.out.print("Calucladora\n1.Factorial\n2.Sumatoria\n3.Potencia\n4.Invertir numero\n5.Convertir a binario\n6.Combinaciones\nOpcion: ");
        try{
        op = leer.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Error de tipo "+ex.getMessage());
            leer.nextLine();
        }

        switch(op){
            case 1:     
                System.out.print("Factorial\nIngrese el numero: ");
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                resu = MatematicasRec.factorial(num);
                System.out.printf("Factorial de %d = %d ",num,resu);
                break;
                
            case 2:
                System.out.print("Sumatoria\nIngrese el numero: ");
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                resu = MatematicasRec.sumatoria(num);
                System.out.printf("Sumatoria de %d = %d ",num,resu);
                break;
                
            case 3:
                int pot=0;
                System.out.print("Potencia\nIngrese el numero: ");
                
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                
                System.out.print("Ingresa la potencia: ");
                try{
                pot = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(10)+1;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    pot = ale;
                leer.nextLine();
                }
                resu = MatematicasRec.potencia(num, pot);
                System.out.printf("Potencia de %d^%d = %d ",num,pot,resu);
                break;
                
            case 4:
                System.out.print("Invertir numeros\nIngrese el numero: ");
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                System.out.print("Numero Invertido = ");
                MatematicasRec.invertirNum(num);
                break;
                
            case 5: 
                System.out.print("Numero binario\nIngrese el numero: ");
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                System.out.print("Numero binario = ");
                MatematicasRec.Binario(num);
                break;
                
            case 6:
                int num2=0;
                System.out.print("Combinacione\nIntroduce el numero 1:");
                try{
                num = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num = ale;
                leer.nextLine();
                }
                
                System.out.print("Introuduce el numero 2: ");
                try{
                num2 = leer.nextInt();
                }catch(InputMismatchException ex){
                System.out.println("Error de tipo "+ex.getMessage());
                 int ale = azar.nextInt(15)+5;
                    System.out.println("Se pondra un dato aleatorio = "+ale);
                    num2 = ale;
                leer.nextLine();
                }
                
                resu = MatematicasRec.Combinacion(num, num2);
                System.out.printf("Combinacion de %d y %d = %d",num,num2,resu); 
                break;   
            default:
                System.out.println("Error");
                break;
            
        }
            
        
           
            System.out.print("\nDesea continuar (s/n): ");
            opc = leer.next().charAt(0);
            opc = Character.toLowerCase(opc);
            
            op=0;           
        }while(opc == 's');
        

    }
    
}
