
package unidad4_arreglos4.pkg2;

import java.util.Scanner;

public class Unidad4_Arreglos42 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);    
//declara y dimensiona arreglos 
      String [] materia = {"Progra I","Mate disc","F de inv","Calc Dif","Admin","Etica"};
      
      int n = 26;
      String[]nombre  = new String[n];
      int [] materia1 = new int[n];
      int [] materia2 = new int[n];
      int [] materia3 = new int[n];
      int [] materia4 = new int[n];
      int [] materia5 = new int[n];
      int [] materia6 = new int[n];
     
      //lee por alumno su nombre y las 6 calificaciones de sus materias 

    
    for(int i=0;i<n;i++){
        System.out.println("Nombre del estudiante: "+(i+1));
        nombre[i]= in.nextLine();
        System.out.println("Calificacion para "+materia[0]+":");
        materia1[i]=in.nextInt();
        System.out.println("Calificacion para "+materia[1]+":");
        materia2[i]=in.nextInt();
        System.out.println("Calificacion para "+materia[2]+":");
        materia3[i]=in.nextInt();
        System.out.println("Calificacion para "+materia[3]+":");
        materia4[i]=in.nextInt();
        System.out.println("Calificacion para "+materia[4]+":");
        materia5[i]=in.nextInt();
        System.out.println("Calificacion para "+materia[5]+":");
        materia6[i]=in.nextInt();
        in.nextLine();
    }
    /**
     * calcular promedio por estudiante y mostrar nombre califi*materia y 
     * promedio por estudianre 
     */

// encabezado de la tabla

System.out.printf("Nombre\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\tPromedio",materia[0],
 materia[1], materia[2], materia[3], materia[4], materia[5]);
 System.out.println();
    double prom = 0;
    for(int i=0;i<n;i++){
    prom += materia1[i];
    prom += materia2[i];
    prom += materia3[i];
    prom += materia4[i];
    prom += materia5[i];
    prom += materia6[i];
    prom /= 6; 
    
    System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%5.2f\n", nombre[i],
                materia1[i],materia2[i],materia3[i],materia4[i],materia5[i],
                materia6[i],prom);
    }
    
    /*
    *Calcular el primedio por materia 
    */
    double prom1=0.0, prom2=0.0, prom3=0.0, prom4=0.0, prom5=0.0, prom6=0.0;
    for(int i = 0; i<n; i++){
    prom1+=materia1[i];
    prom2+=materia2[i];
    prom3+=materia3[i];
    prom4+=materia4[i];
    prom5+=materia5[i];
    prom6+=materia6[i];
    }
    prom1/=n;
    prom2/=n;
    prom3/=n;
    prom4/=n;
    prom5/=n;
    prom6/=n;
    System.out.printf("\t\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t%11.2f\t"
            ,prom1,prom2,prom3,prom4,prom5,prom6);
}
}