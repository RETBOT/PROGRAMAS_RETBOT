package switch2_6;

import java.util.Scanner;

public class Switch2_6 
{
    public static void main(String[] args)
    {
        int Peso, Altu, IMC;
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa tu peso en Kg: ");
        Peso = leer.nextInt();
        
        System.out.println("Ingresa tu altura en metros: ");
        Altu = leer.nextInt();
     
   IMC = Peso/Altu*Altu; 
        
             switch (IMC) {
            case 16:
                System.out.println("Ingresa al hospital");
                System.out.println("Indice de masa corporal "+IMC);
                break;
            case 17:
                System.out.println("Infra Peso");
                System.out.println("Indice de masa corporal "+IMC);
                break;
            case 18:
                System.out.println("Bajo peso");
                break;
            case 4:
                System.out.println("Peso normal");
                break;
            case 5:
                System.out.println("");
            break;
            case 6:
                System.out.println("");
            break;
            case 7:
                System.out.println("");
            break;
            default:
                System.out.println("Te quedaste son salida");
                break;
    }
    
}
}
