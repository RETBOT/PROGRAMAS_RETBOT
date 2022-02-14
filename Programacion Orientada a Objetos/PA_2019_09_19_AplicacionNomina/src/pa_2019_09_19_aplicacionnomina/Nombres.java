/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_19_aplicacionnomina;

import java.util.Random;

/**
 *
 * @author admin
 */
public class Nombres {
    
   static Random azar = new Random();
    
    static String [] nom = {"Juan","Luis","Pedro","Laura","Diana","Patricia","Fernanda",
                     "Natalia","Ulises","Jorge","Javier","Marina","Silvia","Karla",
                      "Martha","Jose","Raul","Luis","Jesus","Roberto"};
    static String [] ape = {"Lopez","Perez","Ruiz","Rangel","Salazar","Gonzales","Martinez",
                     "Montes","Gomez","Hernandez","Mendez","Vazquez","Santoyo",
                     "Ramirez","Fernandez","Garcia","Luevanos","Palacios",
                     "Esquivel","Troncoso"};
    
    public static String nextNombre(){
    return nom[azar.nextInt(nom.length)];
    }
    
    public static String nextApellido(){
    return ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreCorto(){
        return nom[azar.nextInt(nom.length)]+" "+
                ape[azar.nextInt(ape.length)];    
    }
    
    public static String nextNombreCompleto(){
       return nom[azar.nextInt(nom.length)]+" "+
                ape[azar.nextInt(ape.length)]+" "+
                ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreFormal(){
       return ape[azar.nextInt(ape.length)]+" "+
                ape[azar.nextInt(ape.length)]+" "+
                nom[azar.nextInt(nom.length)];
    }
}
