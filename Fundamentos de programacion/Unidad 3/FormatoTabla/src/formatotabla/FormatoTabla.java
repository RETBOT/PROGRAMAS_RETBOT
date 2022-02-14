package formatotabla;
public class FormatoTabla {
   //Calcular la raiz cuadrada de los numeros del 0 al 10 y mostrar el resultado
    public static void main(String[] args) {
   
        //Encabezados
        System.out.println("\tNumero\tRaiz cuadrada");
        
        for (int i=0;i<10;i++)
        {
         System.out.println("\t"+i+"\t\t"+Math.sqrt(i));
        }  
        
        System.out.printf("%12s %12s\n","Numero","Raiz cuadrada");
      for (int i=0;i<10;i++)
        {
         System.out.printf("%10d\t%6.4f\n",i,Math.sqrt(i));
        }  
    }
    
}
