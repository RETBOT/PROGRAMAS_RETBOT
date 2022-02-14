package operaciones.pkg02;
/*
Nombre: Roberto Esquivel Troncoso
Numero de control: 19130519
*/
import java.util.Scanner;

public class Operaciones02 
{
    public static void main(String[] args)
    {
     int opcion=0;
     int res = 0;
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
     Scanner leer = new Scanner(System.in);
    
     while (opcion<1||opcion>5)
    {  
     System.out.println("Opcion-->");
     opcion=leer.nextInt();
    } 
 if (opcion!=5)
 {
     System.out.println("Primer numero entero: ");
     int A = leer.nextInt();
     System.out.println("Segundo numero entero");
     int B = leer.nextInt(); 
 if (opcion==1)
 { 
     res= A+B;
     System.out.println("la suma es " + res);    
 }
 else if (opcion==2)
 { 
     res= A-B;
     System.out.println("la resta es " + res);   
 }
 else if (opcion==3)
 { 
     res= A*B;
     System.out.println("la multiplicacion es " + res);    
 }
 else if (opcion==4)
 { 
double div = (double)A/(double)B;
 System.out.println("la division es " + div); 
 }
 else if (opcion!=5)
     System.out.println("opcion no valida");
 }   
}
}
