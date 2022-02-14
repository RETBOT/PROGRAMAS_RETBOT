package defac;
import java.util.Scanner;
public class DeFaC {
    public static void main(String[] args) 
    {
        int opcion; 
        double C, F, K;
        System.out.println("Selecciona una opcion del 1 al 6");
        System.out.println("1. De Fahrenheit a Centigrados");
        System.out.println("2. De Fahrenheit a Kelvin");
        System.out.println("3. De Centigrados a Fahrenheit");
        System.out.println("4. De Centigrados a Kelvin");
        System.out.println("5. De Kelvin a Centigrados");
        System.out.println("6. De Kelvin a Fahrenheit");
        System.out.print("Opcion--> ");
        Scanner leer= new Scanner(System.in);
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ingresar grados Farenheit: ");
                F = leer.nextDouble();
                double DeFaC = (F-32)*(double)5/(double)9;
                System.out.print("Grados Centigrados: " + DeFaC);
                System.out.println("°");
                break;
            case 2:
                System.out.println("Ingresar grados Fahrenheit: ");
                F = leer.nextDouble();
                double DeFaK = ((F-32)/(double)5/(double)9)+273.15;
                System.out.print("Grados Farenheit: "+ DeFaK );
                System.out.println("°");
                break;            
            case 3:
                System.out.println("Ingresar grados Centigrados: ");
                C = leer.nextDouble();
                double DeCaF = (C*(double)5/(double)9)+32;
                System.out.print("Grados Farenheit: "+ DeCaF);
                System.out.println("°");
                break;
            case 4:
                System.out.println("Ingresar grados Centigrados: ");
                C = leer.nextDouble();
                double DeCaK = C+273.15;
                System.out.println("Grados Kelvin: "+ DeCaK);
                break;
            case 5:
                {
                    System.out.println("Ingresar grados Kelvin: ");
                    K = leer.nextDouble();
                    double DeKaC = K-273.15;
                    System.out.print("Grados Centigrados: "+ DeKaC);
                    System.out.println("°");
                    break;
                }
            case 6:
                {
                    System.out.println("Ingresar grados Kelvin: ");
                    K = leer.nextDouble();
                    double DeKaC = ((K-273.15)*(double)5/(double)9)+32;
                    System.out.print("Grados Farenheit: "+ DeKaC);
                    System.out.println("°");
                    break;
                }
            default:
                System.out.println("Opcion no valida");
                break;
        }    
    }    
    static 
    {
    System.out.println("Opcion no valida");
    }
}