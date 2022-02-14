package ejercicio5_15;
public class Ejercicio5_15 {
public static void main(String[] args) {

 System.out.println("\n");
for ( int a = 1; a <= 10; a++ ){      
for ( int b = 1; b <= a; b++ )
System.out.print("*");

for ( int c = a + 1; c <= 10; c++)
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int d = 1; d <= 10 + 1 - a; d++ )
System.out.print("*");

for ( int e = 10 - 1 -a; e <= 10; e++)
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int f = 1; f < a; f++ )
System.out.print(" ");
   
for ( int g = a; g <= 10; g++ )
System.out.print("*");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int h = 1; h <= 10 - a; h++ )
System.out.print(" ");

for ( int i = 10 - a; i < 10; i++ )
System.out.print("*");

System.out.println();
}
System.out.println("\n");
}   
}
