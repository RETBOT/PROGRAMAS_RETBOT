/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmanejodecadenasycaracteres;

/**
 *
 * @author admin
 */
public class Caracter {
    
    public static boolean esLetra(char c){
//    if((c >= 'A' && c<='Z')||(c>='a'&&c<='z'))
//      if((c >= 65 && c<=90)||(c>=97&&c<=122))
//      return true;
//    
//    return false;

//      boolean resul1 = c >= 65 && c<=90;
//      boolean resul2 = c>=97&&c<=122;
//      return resul1||resul2;

      return ((c >= 65 && c<=90)||(c>=97&&c<=122)) || ((c >='á'&& c<='ź')||(c >= 'Á'&&c<='Ź'));
     }
    
    // tarea para el domingo 25/oct
    // Implementar los metodos para determinar 
    // si es mayuscula 
    // si es minuscula 
    // si es vocal
    // si es letra con acento
    
    public static boolean esMayuscula(char c){
    return (c>='A'&&c<='Z');
    }
    
    public static boolean esMinuscula(char c){
    return (c>='a'&&c<='z');
    }
    
    public static boolean esVocal(char c){
//    char [] vocales={'A','E','I','O','U','a','e','i','o','u'};
//    for(int i=0;i<vocales.length;i++)
//    if(c==vocales[i])
//        return true;
//    return false;

     return (c=='a'||c=='A'||c=='á'||c=='Á'||
            c=='e'||c=='E'||c=='é'||c=='É'||
            c=='i'||c=='I'||c=='í'||c=='Í'||
            c=='o'||c=='O'||c=='ó'||c=='Ó'||
            c=='u'||c=='U'||c=='ú'||c=='Ú');
    }
    
    public static boolean esAcento(char c){
    //return (c >='á'&& c<='ź')||(c >= 'Á'&&c<='Ź');
    return (c=='á'&&c=='Á')||(c=='é'&&c=='É')||(c=='í'&&c=='Í')||(c=='ó'&&c=='Ó')||(c=='ú'&&c=='Ú');
    }
    
    public static boolean esDigito(char c){
//    return (c>='0'&&c<='9');
    return (c>=48&&c<=57);
    }
    //agregar un metodo para convertir de minuscula a mayuscula  
    public static char aMinuscula(char c){
//    if(esLetra(c)){
    if(esMayuscula(c)){
        c=(char)(c+32);
    return c;
    }
    return c;
//    }return c;
    }
    
    //agregar un metodo para convertir de minuscula a mayuscula
    public static char aMayuscula(char c){
//    if(esLetra(c)){
    if(esMinuscula(c)){
        c=(char)(c-32);
    return c;
    }
    return c;
//    }return c;
    }
}

