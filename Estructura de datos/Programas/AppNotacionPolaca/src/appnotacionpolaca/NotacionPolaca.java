/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotacionpolaca;

/**
 *
 * @author admin
 */

//El enumerado es similar a una clase, permite definir ibjetos y
        // permite darle nombre a los enteros, por lo tanto, lo podemos 
        // utilizar tambien para autodocumentar un programa
enum Simbolo{
    // por default inicia en cero
    OPERANDO, //valor inicial 0(Cero), si se modifica, los demas son consecutivos
    PIZQ,
    PDER,
    SUMRES,
    MULTDIV,
    POW;
    
    //Los enumerados tienen un constructor, el cual debe ser privado
    //sino lo escribimos nosotros el compilador usa el que tiene definido
    //por default
    
    public int getValue(){
    return this.ordinal();
    }
    //investigar sobre los enumerados(enum) en java
}
        
 // Clase para convertir una exprecion Infija en postija
public class NotacionPolaca {
   
    
      public int numCaracteresSinParentesis(String exp){
        int con = 0;        
        for(int i=0; i<exp.length();i++){
        char car = exp.charAt(i);
        Simbolo actual = TipoyPrecedencia(car);
        
        switch(actual){
            case OPERANDO: con++;
            break;
            case SUMRES: con++;
            break;
            case MULTDIV: con++;
            break;
            case POW: con++;
            break; 
            }       
        }
      return con;  
      }
          
     public int numDeOperadorezMasPizq(String exp){
        int con = 0;        
        for(int i=0; i<exp.length();i++){
        char car = exp.charAt(i);
        Simbolo actual = TipoyPrecedencia(car);
        
        switch(actual){
            case OPERANDO: con++;
            break;
            case PIZQ: con++;
            break; 
            }       
        }
      return con;  
      }

    
    public final StringBuilder convertirA_NotacionPosFija(String expInfija){ // con StringBuilder
//    public final char[] convertirA_NotacionPosFija(String expInfija){  // con Char
        // no debe contener los parentecis que aparezcan en la exprecion infija
//        se requiere analizar de izq a derecha la exprecion infija y no considerar
//        los parentesis, para que la longitud o tamaño 
//        de la expresion posfija sea sin considerar los parentesis 
//        implementar el metodo que me devuelva la cantidad de caracteres sin 
//        tomar en cuenta los parentesis;    ((parentesis)) = 14 caracteres - 4 por los parentesis = 10 
//        para mañana 
                
        char [] Epos = new char[numCaracteresSinParentesis(expInfija)];
//        char [] Epos = new char[expInfija.length()];

                            
                          // La dimension de la pila solo debe considerar los operadores
                          // +, -, *, /, ^, ( 
        //en la app del proyecto en GUI ya debe de estar validado todo
        Pila pila = new Pila(numDeOperadorezMasPizq(expInfija));
       
        int i; // indice para recorrer la cadena expInfija
        int pos=0; // indice para ir insertando los caracteres en la EposFija
        
        for(i=0; i<expInfija.length();i++){
        char car = expInfija.charAt(i);
       
        Simbolo actual = TipoyPrecedencia(car);
        
        
        switch(actual){
            case OPERANDO: Epos[pos++] = car;
            break;
            
            case SUMRES: {
             while(!pila.estaVacia() && TipoyPrecedencia((char)pila.getTope()).getValue()>=
                   actual.getValue()){
             Epos[pos++] = (char)pila.pop();
             }
             pila.push(car);
            }
            break;
            
            case MULTDIV: {
             while(!pila.estaVacia() && TipoyPrecedencia((char)pila.getTope()).getValue()>=
                   actual.getValue()){
             Epos[pos++] = (char)pila.pop();
             }
             pila.push(car);
            }
            break;
            
            case POW: {
             while(!pila.estaVacia() && TipoyPrecedencia((char)pila.getTope()).getValue()>=
                   actual.getValue()){
             Epos[pos++] = (char)pila.pop();
             }
             pila.push(car);
            }
            break; 
            case PIZQ:
                pila.push(car);
                break;
            case PDER:{
                char x = (char)pila.pop();
                while(TipoyPrecedencia(x) != Simbolo.PIZQ){
                Epos[pos++] = x;
                x = (char)pila.pop();
                }
              }
                break;
            }//fin switch       
        }//fin for
        
        while(!pila.estaVacia()){
            if(pos < Epos.length){
                Epos[pos++] = (char)pila.pop();
            }
            else
                break;
        }
        //con Char
//        return Epos;
        StringBuilder salida = new StringBuilder(numCaracteresSinParentesis(expInfija));
        for(int r=0;r<Epos.length;r++){
            salida.append(Epos[r]);
//            salida.setCharAt(r, Epos[r]);
        }
         
        return salida;
    }

    public Simbolo TipoyPrecedencia(char s){
    Simbolo simbolo;
    switch(s){
        case '+':
        case '-': simbolo = Simbolo.SUMRES;
        break;
        case '*':
        case '/': simbolo = Simbolo.MULTDIV;
        break;
        case '^': simbolo = Simbolo.POW;
        break;
        case '(': simbolo = Simbolo.PIZQ;
        break;
        case ')': simbolo = Simbolo.PDER;
        break;
        default: simbolo = Simbolo.OPERANDO;
        break;    
    }
    return simbolo;
    }
    
    public double resolver(StringBuilder expInfija){    
    double res = 0;
    Pila pila = new Pila(expInfija.length());
 
    for(int i=0; i<expInfija.length();i++){
     char car = expInfija.charAt(i);
     
      switch(car){
            case '+':{  
                if(!pila.estaVacia()||!pila.estaLlena()){
             int ulti = pila.pop();
             int pen = pila.pop();
             int suma = pen+ulti;
             pila.push(suma);
            }
            }
            break;
            
            case '-':{
             if(!pila.estaVacia()||!pila.estaLlena()){
             int ulti = pila.pop();
             int pen = pila.pop();
             int resta = pen-ulti;
             pila.push(resta);
                }
            }
            break;
            
            case '*':{
            if(!pila.estaVacia()||!pila.estaLlena()){
             int ulti = pila.pop();
             int pen = pila.pop();
             int multi = pen*ulti;
             pila.push(multi);
                }
            }
            break;
             
            case '/':{
             if(!pila.estaVacia()||!pila.estaLlena()){
             int ulti = pila.pop();
             int pen = pila.pop();
             int multi = pen/ulti;
             pila.push(multi);
                }
            }
            break;
            case '^': {
              if(!pila.estaVacia()||!pila.estaLlena()){
             int ulti = pila.pop();
             int pen = pila.pop();
             int pow = pen^ulti;
             pila.push(pow);
            }
           }
            default: int num = car - 48;
            pila.push(num);
            break;
          }//fin switch
        }//fin for
        res = pila.pop();
      return res;
    }//fin resolver
}

       
