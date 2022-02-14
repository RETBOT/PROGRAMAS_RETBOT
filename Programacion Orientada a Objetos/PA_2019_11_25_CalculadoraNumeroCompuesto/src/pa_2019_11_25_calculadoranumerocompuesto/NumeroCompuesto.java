/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_25_calculadoranumerocompuesto;

/**
 *
 * @author admin
 */
public abstract class NumeroCompuesto {
    private int parte1;
    private int parte2;
   
    //constructores 
   protected NumeroCompuesto(){
    parte1 = 0;
    parte2 = 0;
    }
    
   protected NumeroCompuesto(int parte1, int parte2){
   this.parte1 = parte1;
   this.parte2 = parte2;
   }
   
   //get/set
   protected void setParte1(int parte1){
   this.parte1 = parte1;
   }
   protected void setParte2(int parte2){
   this.parte2 = parte2;
   }
   
   protected int getParte1(){
   return parte1;
   }
   protected int getParte2(){
   return parte2;
   }
   
   public String desplegar(){
   return "Parte 1:"+parte1+" Parte 2:"+parte2;
   }
   
   //metodo abstracto 
   public abstract String mostrar(); // un metodo abstracto obliga a las clases hijas 
                                     // a implementarlo (codificarlo)
}
