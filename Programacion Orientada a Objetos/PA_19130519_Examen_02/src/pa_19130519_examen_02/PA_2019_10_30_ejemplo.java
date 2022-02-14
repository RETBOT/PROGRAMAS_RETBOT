/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_examen_02;

/**
 *
 * @author admin
 */
public class PA_2019_10_30_ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pintura casa = new Pintura(5,12);
       Pintura casa2 = new Pintura(2,10);
       
       Pintura fin = casa2.resta(casa);
       
        System.out.println(fin);
       
        
       int a,b;
       
       a = 5;
       b = 12;
       
      int convertirLitros = (a*19)+b;
        System.out.println(convertirLitros+"convertir 1");
     
     int tinas = convertirLitros/19;
     int litros = convertirLitros%19;
     
        System.out.println(tinas+"Tinas "+litros+"Litros");
     
        int c,d;
        c = 2;
        d = 10;
        int convertirLitros2 = (c*19)+d;
        System.out.println(convertirLitros2+"convertir 2");
        int tinas2 = convertirLitros2/19; 
        int litros2 = convertirLitros2%19;
       
        System.out.println(tinas2+"Tinas "+litros2+"Litros");
        
        
        int resta = convertirLitros2 + convertirLitros;
        int tinas3 = resta/19;
        int litros3 = resta%19;
        
        System.out.println(tinas3+"Tinas "+litros3+"Litros");
        
        
    }
    
}
