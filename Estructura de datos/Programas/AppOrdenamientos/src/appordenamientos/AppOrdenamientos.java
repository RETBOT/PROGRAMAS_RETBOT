/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientos;

import java.util.Random;

/**
 *
 * @author admin
 */
public class AppOrdenamientos {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        Ordenamientos o = new Ordenamientos();
         int [] vec = {0,6,3,10,1,5};
        
  
        
        // TODO code application logic here
//        int  [] vec = {60,70,50,30,100,80,90};
//        int [] vec = {0,6,3,10,1,5};
//        Random azar = new Random();
////         int [] vec = new int[500];
//         
//        Ordenamientos o = new Ordenamientos();
//        
//        System.out.println("Datos desordenados ");
//        for(int r=0;r<vec.length;r++){
////            vec[r] = azar.nextInt(900)+100;
//            System.out.println(vec[r]);
//        }

//        Burbuja simple
//       System.out.print("\nDatos ordenados Descendente");
//        o.burbujaDsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//        
//        /*
//        Datos ordenados Descendente
//        Numero de comparaciones = 124750
//        Numero de intercambios = 61555
//        */
//        
//        System.out.print("\nDatos ordenados Ascendente");
//        o.burbujaAsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//                
//        /*
//        Datos ordenados Ascendente
//        Numero de comparaciones = 124750
//        Numero de intercambios = 124635
//        */
        
//        //burbuja con señal
//        System.out.print("\nDatos ordenados Descendente");
//        o.burbujaConSeñalDsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//        
//        /*
//        Datos ordenados Descendente
//        Numero de comparaciones = 123265
//        Numero de intercambios = 620303
//        */
//        
//        System.out.print("\nDatos ordenados Ascendente");
//        o.burbujaConSeñalAsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//                
//        /*
//        Datos ordenados Ascendente
//        Numero de comparaciones = 124750
//        Numero de intercambios = 124601
//        */
//        
        
//        System.out.println("Shaker sort");
//        System.out.print("\nDatos ordenados Descendente");
//        o.SacudidaDsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
        
        /*
        Datos ordenados Descendente
        Numero de comparaciones = 21
        Numero de intercambios = 14
        */
        
//        System.out.print("\nDatos ordenados Ascendente");
//        o.SacudidaAsc(vec);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
                
        /*
        Datos ordenados Ascendente
        Numero de comparaciones = 21
        Numero de intercambios = 21
        */
//        int[] v = { 9,6,3,10,1,5};
////            int[] v = { 16,70,4,18,46,25,11,34,58};//TAREA }       
//            
//       Random r = new Random();
//            //int []v= new int[500];  //15000
//            System.out.println("DATOS DESORDENADOS");
//            for (int ren = 0; ren < v.length; ren++)
//            {   // NUMEROS DE 3 DIGITOS
//               // v[ren]= r.nextInt(900)+100;
//
//                System.out.println(v[ren]);
//
//            }
//            Ordenamientos numeros = new Ordenamientos();
//                   //quick    ->    quicksort
//                   
//            Numero compp = new Numero();
//            Numero intercp = new Numero();
//            numeros.quickSort(v, 0, v.length-1, compp, intercp);
//           // numeros.quicksortAsc(v, 0, v.length-1); 
//                             // izq    der
//            System.out.println("\nDATOS ORDENADOS CON EL METODO QUICK SORT");
//            for (int ren = 0; ren < v.length; ren++)
//                System.out.println(v[ren]);
//
//            System.out.printf("\nNo. de Comparaciones : %d",compp.num);
//            System.out.printf("\nNo. de intercambios  : %d", intercp.num);

       
//        System.out.println("Orenamiento shell\nDatos:");
//        System.out.println("Datos desordenados ");
//        
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//        
//        System.out.println("\nDatos ordenados acendentes");
//        o.shellAsc(vec,vec.length-1);
//        
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }
//        
//        System.out.println("\nDatos ordenados descendentes");
//        
//        o.shellDsc(vec,vec.length-1);
//        for(int r=0;r<vec.length;r++){
//            System.out.println(vec[r]);
//        }

    Numero inter = new Numero();
    Numero comp = new Numero();
        
    int v [] ={5,10,8,4,1,9};
        System.out.println("Orenamiento examen\n");
        System.out.println("Datos desordenados ");
        
        for(int r=0;r<v.length;r++){
            System.out.println(v[r]);
        }
        
        System.out.println("\nDatos ordenados acendentes");
        o.OrdenamientoP2OP1Asc(v,0,v.length-1);
        
        for(int r=0;r<v.length;r++){
            System.out.println(v[r]);
        }
        
        System.out.println("\nDatos ordenados descendentes");
        o.OrdenamientoP2OP1Dsc(v,0,v.length-1);
        
        for(int r=0;r<v.length;r++){
            System.out.println(v[r]);
        }
    }
    
}
