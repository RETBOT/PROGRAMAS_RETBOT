//Nombre = Roberto Esquivel Troncoso 
//Numero de control = 19130519
package ejerciciounidad1numero1;
public class EjercicioUnidad1Numero1   
{
public static void main(String[] args) 
{
int A = 10;
int B = 4;
int C = 6;
boolean D = true;   
System.out.println("A) A+B*C --> " + (A+B*C));
System.out.println("B) (A+B)*C --> " + ((A+B)*C));
System.out.println("C) 5*A^B --> " + ((Math.pow(A,B))*5));
System.out.println("D) (A+B)*(A+C) --> " + ((A+B)*(A+C)));
System.out.println("E) A+(B*A)+C --> " + (A+(B*A)+C));
System.out.println("F) A>B&&A>C --> " + (A>B&&A>C));
System.out.println("G) A == B --> " + (A == B));
System.out.println("H) !(A>B&&A>C) --> " + (!(A>B&&A>C)));
System.out.println("I) A<=B||A<=C --> " + (A<=B||A<=C));
System.out.println("J) A<B||A>B --> " + (A<B||A>B));
System.out.println("K) B>C&&B>A --> " + (B>C&&B>A));
System.out.println("L) A/B*C^2 --> " + ((double)A/(double)B*Math.pow(C,2)));
System.out.println("M) (A/B)*C^2 --> " + ((((double)A/(double)B))*(Math.pow(C,2))));        
System.out.println("N) A^B^2 --> " + (Math.pow(A,Math.pow(B,2))));        
System.out.println("O) !A --> " + !D);
System.out.println("P) A!=B --> " + (A!=B));
System.out.println("Q) A/C+C/B-->" + 
(((double)A/(double)C)+(double)C/(double)B));
System.out.println("R) A*(B+C)^2 --> " + (A*Math.pow(B+C,2)));
System.out.println("S) !A||!0 --> " + !(A==0));
System.out.println("T) C/B --> " + ((double)C/(double)A));
/*se usa Math.pow para indicar que es una elevacion 
*
* en D es un operador unario y se tienen que modificar
*
* en O indica que es un perador booleano y tenemos que 
* agregar mas datos, D = true;
*/
}
}
