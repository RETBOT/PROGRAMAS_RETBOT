package do_while_3.pkg6;

import java.util.Scanner;

public class Do_While_36 {

    public static void main(String[] args) {   
     
    
    Scanner leer = new Scanner(System.in);
    
    int num;
 do{
            System.out.println("Ingrese un numero (0-999)");
            num = leer.nextInt();
            if (num>=100)
                System.out.println("Tiene 3 digitos\n");
            else if (num>=10)
                System.out.println("Tiene 2 digitos\n");
            else 
                System.out.println("Tiene 1 digito\n");
 }while(num!=0);
 }
}
