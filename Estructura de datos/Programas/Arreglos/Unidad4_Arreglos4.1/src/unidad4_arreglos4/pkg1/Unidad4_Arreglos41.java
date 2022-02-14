package unidad4_arreglos4.pkg1;
public class Unidad4_Arreglos41 {

    /**
     * Declara y dimensiona arreglos:
     * @param args
     */
    public static void main(String [] args) {
       int numerosPares [] = new int [60];
       int cuentaPares=0; 
       // almacenar en el arreglo los numeros pares 
       for(int i=0;i<=10;i++)
           if(i%2==0){
           numerosPares[cuentaPares]=i;
           cuentaPares++;
           }
        //Mostrar los numeros pares almacenados 
        for(int i=0;i<cuentaPares;i++)
            System.out.println(numerosPares[i]); 
          
    }
}

