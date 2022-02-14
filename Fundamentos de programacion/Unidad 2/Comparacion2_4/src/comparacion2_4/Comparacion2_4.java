package comparacion2_4;
import java.util.Scanner;
public class Comparacion2_4 {
    public static void main(String[] args) 
    {
    double A, B, C, D;
    double X1, X2; 
    Scanner leer = new Scanner(System.in);

    System.out.println("Teclea los coeficientes ");
    System.out.println("Coeficiente A: ");
    A = leer.nextDouble();
        
    System.out.println("Coeficiente B: ");
    B = leer.nextDouble();
        
    System.out.println("Coeficiente C: ");
    C = leer.nextDouble();
        
    D = (B*B)-4*A*C;    
    if (D>0)
    {
    X1 = (-B+Math.sqrt(D))/(2*A);
    X2 = (-B-Math.sqrt(D))/(2*A);
    
    System.out.println("Las raices son "+X1+" y "+X2);
    }
    else 
    {
    System.out.println("Raices son imaginarias");
    }
    }
    
}
