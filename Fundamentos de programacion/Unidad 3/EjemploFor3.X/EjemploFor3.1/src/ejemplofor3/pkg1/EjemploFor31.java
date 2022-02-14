package ejemplofor3.pkg1;
public class EjemploFor31 {
 
    public static void main(String[] args) {
        /*
        * 3.1 a Programa que imprime los numeros pares que hay del 200 al 100
        */
        for(int num=200;num>=100;num--){
       if (num%2==1)
        System.out.println("Número impar = "+num); 
     }
        System.out.println("--------------------------");
        
        /*
        * 3.1 b Imprime los multiplos de 4 que hay de 200 al 100 
        */
        for (int numb=200; numb>=100; numb--){
            if (numb%4==0)
        System.out.println("Números pares del 4 = "+numb);
        }
        System.out.println("--------------------------");
     
        /*
        * 3.1 c imprime los numeros primos que hay del 1000 al 100
        */
    for (int numero = 1000; numero>=100;numero--){
       boolean esPrimo=true; 
        for (int i=2;i<=9;i++){
           if (i!=numero)
            if (numero%i==0)
              esPrimo=false; 
              break; 
        }
        if (esPrimo)
            System.out.println(numero+", Es un numero primo");   
    }
    }
    }
