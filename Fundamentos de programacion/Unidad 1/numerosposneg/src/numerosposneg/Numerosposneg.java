package numerosposneg;

import java.util.Scanner;

public class Numerosposneg 
{
public static void main(String[] args) 
{
int Num1;
Scanner leer = new Scanner(System.in);
System.out.println("Teclea el numero: ");
Num1 = leer.nextInt();   
if (Num1>0)
{
System.out.println( Num1 + " es mayor a 0");
}   
else if (Num1==0)
{
System.out.println(Num1 + " es igual a 0");
}
else 
{
System.out.println(Num1 + " es menor a 0");
}
}                       
}
    

