package switch2_7;

import java.util.Scanner;

public class Switch2_7 
{
    public static void main(String[] args) 
    {
   int mes;
    Scanner leer = new Scanner(System.in);
    
System.out.println("Introdice el mes que deseas saber los dias");
System.out.println("1.Enero\n2.Febrero\n3.Marzo\n4.Abril\n5.Mayo\n6.Junio");
System.out.println("7.Julio\n8.Agosto\n9.Septiembre\n10.Octubre\n11.Noviembre");
System.out.println("12.Diciembre");
System.out.print("Opcion-->");
mes = leer.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enerto tiene 31 dias");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }      
}    
}
