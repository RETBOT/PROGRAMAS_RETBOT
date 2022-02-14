
package ejemplowhile3.pkg2;

public class EjemploWhile32 {

    //Ejemplo del uso del break eb un ciclo while
    
    public static void main(String[] args) {
      int valor=0;
      while(true){
          System.out.println("Valor de interacion: "+valor);
          valor++;
         
          if (valor>50)
         break;
      }
    }
    
}
