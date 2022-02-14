/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsringbuilderystringbuffer;

/**
 *
 * @author admin
 */
public class AppSringBuilderyStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto StringBuilder
        StringBuilder cadenaSB1 = new StringBuilder("tecnologico");
       
        System.out.println("Cadena SB1 = "+cadenaSB1);
        
        String cadena = "laguna";
        
        StringBuilder cadenaSB2 = new StringBuilder(cadena);
        System.out.println("Cadena SB2 = "+cadenaSB2);
        
        char [] cadenaChar = cadena.toCharArray();
        StringBuilder cadenaSB3 = new StringBuilder(new String(cadenaChar));
        System.out.println("Cadena SB3 = "+cadenaSB3);
        
        System.out.println("Cadena SB1 + Cadena SB2 = "+cadenaSB1+" "+cadenaSB2);
    
        //cadenaSB3 = cadenaSB1.append(' ').append(cadenaSB2);
        cadenaSB3 = new StringBuilder(cadenaSB1.toString()+cadenaSB2.toString());
        System.out.println(cadenaSB3);
        
//        cadenaSB3.append('M');//agrega/añade al final 
//        System.out.println(cadenaSB3);

          cadenaSB3 = cadenaSB3.reverse();
          System.out.println(cadenaSB3);
          
          cadenaSB3 = cadenaSB3.reverse();
          System.out.println(cadenaSB3);
          
          String cad = " de la ";
          int len = cadenaSB1.toString().length();
          
          cadenaSB3.insert(len, cad);
          System.out.println(cadenaSB3);
          
          //modificar una cadena Stringbuilder caracter por caracter 
          // si es mayuscula la hacemos minuscula y visceversa 
           // cadenaSB3.setCharAt(len, 0);
          
          for(int i=0;i<cadenaSB3.length();i++){
          if(Caracter.esMinuscula(cadenaSB3.charAt(i))){
          cadenaSB3.setCharAt(i, Caracter.aMayuscula(cadenaSB3.charAt(i)));
            }
          if(Caracter.esMayuscula(cadenaSB3.charAt(i))){
          cadenaSB3.setCharAt(i, Caracter.aMinuscula(cadenaSB3.charAt(i)));  
            }
          }
          
          System.out.println("Cadena May a Min y viceversa = "+cadenaSB3);
           
           
          for(int i=0;i<cadenaSB3.length();i++)
           cadenaSB3.setCharAt(i, Caracter.aMayuscula(cadenaSB3.charAt(i)));
          System.out.println("Mayuscula = "+cadenaSB3);
           
          
          
          for(int i=0;i<cadenaSB3.length();i++)
          cadenaSB3.setCharAt(i, Caracter.aMinuscula(cadenaSB3.charAt(i)));
          System.out.println("Minuscula = "+cadenaSB3);
          
          
          
          for(int i=0;i<cadenaSB3.length();i++){
          if(i==0)
              cadenaSB3.setCharAt(i, Caracter.aMayuscula(cadenaSB3.charAt(i)));
       
          if(cadenaSB3.charAt(i)==(char)32){
              i+=1;
              cadenaSB3.setCharAt(i, Caracter.aMayuscula(cadenaSB3.charAt(i)));
          }
          }
          System.out.println("Primera letra: "+cadenaSB3);
          
          
        
    }
}