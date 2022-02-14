package unidad4_arreglos4.pkg4;

import java.util.Arrays;

public class Unidad4_Arreglos44 {
    public static void main(String[] args) {
    // declaramos y poblamos los arreglos 
    int A [] = {535, 107, 214, 619, 322, 159, 763, 662, 314, 1024};
    int B [] = { 18, 257, 968, 504, 340, 719, 222, 888, 305,   16};
    
    // obtener tamaño del 3er vector
    int tam = A.length + B.length; 
    
    // declaramos y le damos su longitud al vector C 
    int C [] = new int [tam];
    
    // ordenar los vectores A y B
    Arrays.sort(A);
    mostrarVector(A);
    Arrays.sort(B);
    mostrarVector(B);
    
    //fucionar los vectores ordenados en A y B en C    
    int i=0, j=0, k=0;
    boolean finA = false, finB = false;
    
    while(i<A.length && j<B.length){
    if(A[i]<B[j]){
    C[k] = A[i];
    i++;
    k++;
    }
    else{
    C[k] = B[j];
    j++;
    k++;
    }
    if(i>=A.length)  //banderas es 0 o 1, falso o verdadero 
    finA = true;
    if(j>=B.length)
    finB = true;
    }
    
    if (finA==false){    // tambien se puede escribir asi, if (!finA)
    for(int m = i; m < A.length;m++)
    C[k] = A[m];         // C[k++]=A[m];
    k++;
    /*
    *Las dos lineas anteriores se pueden escribir como  C[k++]=A[m];
    */
    }
    if (finB == false){
    for (int m = j; j < B.length; m++)
    C[k]=B[m];
    k++;
   }
    mostrarVector(C);
}
 public static void mostrarVector(int [] vector){
 int n = vector.length;
 for(int i = 0; i<n; i++)
         System.out.printf("%5d\t",vector[i]);
         System.out.println();
 }
}