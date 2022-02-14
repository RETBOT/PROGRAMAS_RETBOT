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
public class AppNotacionPolaca {

    /**
     * @param args the command line arguments
     */
     public static boolean ConPar(String exp){
     int parDer=0,parIz=0;
     boolean corr=true;
          
          for(int i=0;i<exp.length();i++){
          if(exp.charAt(i)=='('){
          parDer++;
          }
          if(exp.charAt(i)==')'){
          parIz++;
          }
          }
          if(parDer<parIz){
              System.out.println("Te falta un paréntesis derecho");
              corr = false;
          }
          else if(parIz<parDer){
              System.out.println("Te falta un paréntesis izquierdo");
              corr = false;
          }
          else 
              System.out.println("Expresion correcta");
           return corr;
     }
     
    
    
    public static void main(String[] args) {
        // TODO code application logic here


//        String expInfija = "(a+b)*c";
//        String expInfija = "(1+2)*3";
        String expInfija = "(3+3)*(9+2)";

//          String expInfija = "a+b*((C-D)+e/(f*g-h))^5";
//        String expInfija = "(1+2*(3-4)+5/(6*7-8)^5)";
        
        if(ConPar(expInfija)==true){
        System.out.println("Exprecion infija = "+expInfija);
//        
//        //Utilizando arreglo de char (char[])
//        char [] exPosfija = new char[expInfija.length()];
//        
//        NotacionPolaca exprecion = new NotacionPolaca();
//        exPosfija = exprecion.convertirA_NotacionPosFija(expInfija);
//        System.out.print("Expresion Posfija = \n");
//        for(int i=0;i<exPosfija.length;i++)
//        System.out.print(exPosfija[i]);
//        System.out.println("");
       
          //Utilizando un StrinBuilder
        StringBuilder exPosfija = new StringBuilder(expInfija);
        
        NotacionPolaca exprecion = new NotacionPolaca();
        exPosfija = exprecion.convertirA_NotacionPosFija(expInfija);
        System.out.println("Expresion Posfija = "+exPosfija);



        //si se pudo convertir a postfija, es decir no hay error y si la expresion 
//        esta formada por digitos 
//        entonces resolver la exp. con el metodo visto al inicio del tema
        
        double resultEPos = exprecion.resolver(exPosfija);
        System.out.println("Resultado = "+resultEPos);
//            
 
        }
  
        
        // El lunes presentar una propuesta del metodo para resolver la expresion posfija cuando haya solo numeros
          
       // lunes 07 de diciembre
        // anaizar la cadena y verificar que los parentesis esten aprareados 
        // que haya el mismo numero de pizq y pder
        
        //clase notacionPolaca
        // 1+2*3 como convertir el caracter 1 a el numero 1
    }
    
}


