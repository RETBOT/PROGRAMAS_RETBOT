package comparacion2_2;

import java.util.Scanner;

public class Comparacion2_2 
{
public static void main(String[] args) 
{
int Num;

Scanner leer = new Scanner(System.in);
System.out.println("Teclea un numero del 1 al 10,000");
Num = leer.nextInt();
        
if (Num>=1&&Num<=10000)
{
if (Num%10==1)
System.out.println("El numero "+Num+" termina en 1");
else 
System.out.println("El numero "+Num+" no termina en 1");
}
else 
{
System.out.println("Error");
}
}   
}
