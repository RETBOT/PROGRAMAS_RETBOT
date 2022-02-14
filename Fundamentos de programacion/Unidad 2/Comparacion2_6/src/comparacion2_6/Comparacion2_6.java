package comparacion2_6;

import java.util.Scanner;

public class Comparacion2_6 
{
    public static void main(String[] args) 
    {
    double Peso, Altu, IMC;
  
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa tu peso en Kg: ");
        Peso = leer.nextDouble();
        
        System.out.println("Ingresa tu altura en Metros: ");
        Altu = leer.nextDouble();
     
   IMC = Peso/Math.pow(Altu,2); 
   
   if (IMC<16)
   {
   System.out.println("Ingresa al hospital");
   }
   else if (IMC>=16&&IMC<17)
   {
   System.out.println("Infra Peso");
   }
   else if (IMC>=17&&IMC<18)
   {
   System.out.println("Bajo peso");
   }
   else if (IMC>=18&&IMC<25)
   {
   System.out.println("Peso normal");    
   }
   else if (IMC>=25&&IMC<30)
   {
   System.out.println("Sobre peso");
   }
   else if (IMC>=30&&IMC<35)
   {
   System.out.println("Sobre peso cronico");
   }
   else if (IMC>=35&&IMC<40)
   {
   System.out.println("Obesidad premorbida");
   }
   else if (IMC>40)
   {
   System.out.println("Obesidad morbida");
   }
   System.out.println("Indice de masa corporal " +IMC);
 }
}
