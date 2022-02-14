package ejemplodow3.pkg3;
import java.util.Scanner;
public class EjemploDoW33 {
    public static void main(String[] args) {
    int N;
    Scanner leer = new Scanner(System.in);
        
    do{
    System.out.println("Ingrese un numero(N)");
    N = leer.nextInt();
   if (N>=1&&N<=10)
   { int i=1;
   do{
       System.out.printf("%2dX%2d = %3d\n",i,N,i*N);
       i++;
   }while(i<=10);
   
   }     
 }while (N!=-1);
    
}
}