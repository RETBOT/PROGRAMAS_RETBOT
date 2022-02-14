/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_15_numerocompuesto;

/**
 *
 * @author admin
 */
public class PA_2019_11_15_NumeroCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
//        NumeroCompuesto nc = new NumeroCompuesto();  no sepuede crear un objeto de una clase abstracta 

       Complejo c1 = new Complejo(5,-7);
       Complejo c2 = new Complejo();
       c2.setReal(3);
       c2.setImaginario(4);
       
       
       
        System.out.println("c1--> "+c1.mostrar()+" "+c1.desplegar());
        System.out.println("c2--> "+c2.mostrar()+" "+c2.desplegar());
     
        Punto p1 = new Punto(-5, 2);
        Fraccion f1 = new Fraccion();
        f1.setNumerador(7);
        f1.setDenominador(4);
       
        
        System.out.println("p1 ---> "+p1.mostrar()+" "+p1.desplegar());
        System.out.println("f1 ----> "+f1.mostrar()+" "+f1.desplegar());
     
        
        
        NumeroCompuesto [] numeros = new NumeroCompuesto[5];
        
        
        numeros[0] = p1;
        numeros[1] = c1;
        numeros[2] = f1;
        numeros[3] = c2;
        numeros[4] = new Punto(9,-1);
        
        System.out.println("----------------------------------------------");
        for (NumeroCompuesto n : numeros) {
            System.out.println(n.mostrar()+" "+n.desplegar());          
        }  
        System.out.println("----------------------------------------------");
         for (int i = 0; i < numeros.length; i++) {
            verNumero(numeros[i]);
        }
    }
   public static void verNumero(NumeroCompuesto nc){
       System.out.println(nc.mostrar()+"   "+nc.desplegar());
   }
}
