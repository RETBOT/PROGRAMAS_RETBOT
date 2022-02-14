package ejemplodowhile1;
import java.util.Scanner;
public class EjemploDoWhile1 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int num1, num2;
 int op;
 do{   
// mostrar el menu de operaciones. validas las opciones 1-5
    
    do {
        System.out.println("1.Suma\n2.Resta\n3.Multiplicacion\n4.Divicion");
        System.out.println("5.Salir\nElige una opcion: ");
        op = leer.nextInt();
        
    }while(op<1||op>5);
    //Realiza operacion y mostrar resultados
    if (op!=5)
    {
        System.out.println("Ingresa un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = leer.nextInt();
        switch(op){
    case 1: System.out.printf("%d + %d = %d  ", num1,num2,num1+num2);
    break;
    case 2: System.out.printf("%d - %d = %d  ", num1,num2,num1-num2);
    break;
    case 3: System.out.printf("%d * %d = %d  ", num1,num2,num1*num2);
    break;
    case 4: System.out.printf("%d / %d = %8.4f ",num1,num2,(double)num1/num2);
    break;
    }
    }else { 
    System.out.println("<----ADIOS---->");
    }
 }while(op!=5); 
 }
}
    
 
    

