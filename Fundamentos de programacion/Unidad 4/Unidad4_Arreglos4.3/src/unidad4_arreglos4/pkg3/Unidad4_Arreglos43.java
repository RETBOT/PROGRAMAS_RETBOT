
package unidad4_arreglos4.pkg3;

import java.util.Arrays;

public class Unidad4_Arreglos43 {

    public static void main(String[] args) {
    int [] A = {10,7,6,1,8,9,3,4,2,5}; //Datos enteros 
    String [] B = {"Lupita", "Flor", "Marcela", "Nancy", "Julia"}; //Cadena de caracteres 
    
        System.out.println("Tamaño de A: "+ A.length + 
                          "\nTamaño de B: "+B.length);
        
        //Mostrar el contenido de A 
        for(int i = 0;i<A.length;i++)
        System.out.print(A[i]+ " ");
      
        System.out.println();
        
        //Mostrar el conenido de B 
        for(int i = 0;i<B.length;i++)
        System.out.println(B[i]+ " ");
        
        
        
        // Ordenar el arreglo tipo String 
        Arrays.sort(A);
        
       //Mostrar el arreglo 
               //Mostrar el contenido de A 
        for(int i = 0;i<A.length;i++)
        System.out.print(A[i]+ " ");
    
        int [] C = {1,2,3,4,5,6,7,8,9,10};
        int [] D = {11,12,13,14,15,16,17,18,19,20}; 
        
        boolean compara = Arrays.equals(A,C);
        System.out.println("\nResultado de comparar A y C: "+ compara);
        
        
        compara = Arrays.equals(A, D);
        System.out.println("\nResultado de comparar A y D: "+compara);
        
        
        
        //Buscar un dato en el vector A: 
        
        int dato = 5; 
         
        for (int i = 0;i<=A.length;i++){
            if(A[i]==dato){
                System.out.println("Dato encontrado en la posicion "+i);
                break; 
            }
        }
            //Busca un dato en el vector B: 
        String dato2 = "Flor"; 
        for(int i=0; i<=B.length;i++){
         if(dato2.equals(B[i])){
             System.out.println("Dato encntrado en la posicion: "+i);
             break; 
         }   
        }
        
        }
    }

