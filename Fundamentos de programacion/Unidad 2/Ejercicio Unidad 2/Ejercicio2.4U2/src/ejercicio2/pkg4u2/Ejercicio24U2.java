/*
* Nombre: Roberto Esquivel Troncoso
* Numero de control: 19130519
*/
package ejercicio2.pkg4u2;
import java.util.Scanner;
public class Ejercicio24U2 {
    public static void main(String[] args) {
    int a,b,c,d,e; 
    int f=0,g=0; 
Scanner leer = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
      a = leer.nextInt();
    System.out.println("Introduce el segundo numero: ");
      b = leer.nextInt();
    System.out.println("Introduce el tercer numero: ");
      c = leer.nextInt();
    System.out.println("Introduce el cuarto numero: ");
      d = leer.nextInt();
    System.out.println("Introduce el quinto numero: ");
        e = leer.nextInt();
if(a>b&&a>c&&a>d&&a>e){
f=a;
}
else if(b>a&&b>c&&b>d&&b>e){
f=b;
}
else if(c>a&&c>b&&c>d&&c>e){
f=c;
}
else if(d>a&&d>b&&d>c&&d>e){
f=d;
}
else {
f=e;
}
if(a<b&&a<c&&a<d&&a<e){
g=a;
}
else if(b<a&&b<c&&b<d&&b<e){
g=b;
}
else if(c<a&&c<b&&c<d&&c<e){
g=c;
}
else if (d<a&&d<b&&d<c&&d<e){
g=d;
}
else{
g=e;
}
System.out.println("El mayor es "+ f +"\nEl menor es "+g);
}
}


