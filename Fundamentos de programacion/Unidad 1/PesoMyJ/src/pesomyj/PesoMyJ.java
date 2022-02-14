package pesomyj;
import java.io.IOException;
import java.util.Scanner;
public class PesoMyJ 
{
public static void main(String[] args) throws IOException 
{
double Gtie=9.8, Gmar=3.7, Gjup=24.8,Gsat=10.44, Gnep=11.15,Pesfin;
int opcion, peso;
Scanner leer = new Scanner(System.in);
System.out.println("¿Quieres saber tu peso en otro planeta?");
System.out.print("Primero ingresa Tu peso en Kg: ");
peso = leer.nextInt();
System.out.println("Selecciona el planeta");
System.out.println("1.Marte\n2.Jupiter");
System.out.println("3.Saturno\n4.Neptuno");
System.out.print("Opcion: ");
opcion = leer.nextInt(); 
switch (opcion) {
        case 1:
            Pesfin = peso*Gmar/Gtie;
            System.out.println("Tu peso en la tierra es de "+peso+"Kg");
            System.out.println("Tu peso en Marte es "+Pesfin+"Kg");
            break;
        case 2:
            System.out.println("Tu peso en la tierra es de "+peso+"Kg");
            Pesfin=peso*Gjup/Gtie;
            System.out.println("Tu peso en Jupiter es "+Pesfin+"Kg");
            break;
        case 3:
            System.out.println("Tu peso en la tierra es de "+peso+"Kg");
            Pesfin=peso*Gsat/Gtie;
            System.out.println("Tu peso en Saturno es "+ Pesfin+"Kg");
            break;
        case 4:
            System.out.println("Tu peso en la tierra es de "+peso+"Kg");
            Pesfin=peso*Gnep/Gtie;
            System.out.println("Tu peso en Neptuno es "+Pesfin+"Kg");
            break;
        default:
            System.out.println("Opcion no valida");
            break;
    } 
}
}

 