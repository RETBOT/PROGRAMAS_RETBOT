package unidad4_arreglos4.pkg5;
import java.util.Scanner;
public class Unidad4_Arreglos45 {
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);       
        /**
        *  Empleando una matriz de enteros para almacenar las 6 calificaciones de n alumnos 
        * suponga que n = 3
        */
        int n = 3;//24; 
        int m =  6;
        String [] materia = {"Progra I","Mate disc","F de inv","Calc Dif",
        "Admin","Etica"};
        
        String [] nombre = new String[n]; 
        int [][] califMaterias = new int[n][materia.length];
      
    for (int i=0; i<n; i++){
        System.out.println("Nombre del estudiante: "+(i+1));
        nombre[i]=in.nextLine();
        for(int j=0; j< materia.length; j++){
        System.out.println("Calificacion para "+materia[j]+" :");
        califMaterias[i][j] = in.nextInt();
        }
        in.nextLine();
        }
       System.out.printf("Nombre\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\tPromedio",
        materia[0],materia[1], materia[2], materia[3], materia[4], materia[5]);
       System.out.println();
       double prom;
    for(int i=0;i<n;i++){
       prom=0;
    for(int j=0; j<materia.length;j++)
         prom+=califMaterias[i][j];
         prom/=materia.length;
     
         System.out.printf("%s\t%8d\t%8d\t%8d\t%8d\t%8d\t%8d\t%5.2f\n", nombre[i],
                califMaterias[i][0], califMaterias[i][1], califMaterias[i][2],
                califMaterias[i][3], califMaterias[i][4], califMaterias[i][5],
                prom);
    }
    
    double prom1=0.0, prom2=0.0, prom3=0.0, prom4=0.0, prom5=0.0, prom6=0.0;
    for(int i = 0; i<n; i++){
    prom1+=califMaterias[i][0];
    prom2+=califMaterias[i][1];
    prom3+=califMaterias[i][2];
    prom4+=califMaterias[i][3];
    prom5+=califMaterias[i][4];
    prom6+=califMaterias[i][5];
    }
    prom1/=n;
    prom2/=n;
    prom3/=n;
    prom4/=n;
    prom5/=n;
    prom6/=n;
    System.out.printf("\t\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t"
            ,prom1,prom2,prom3,prom4,prom5,prom6);
        System.out.println("");
    
    
}
}
       
       
    
    


