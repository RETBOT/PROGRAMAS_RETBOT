package pa_2019_08_21_aplicacionconovisual;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Cono {
    
   //Atributos 
   private double radio;
   private double altura;
   
   //Constructores
   public Cono(){
   radio= 0;
   altura=0;
   }
   
   public Cono(double r, double h){
   radio  = r;
   altura = h;
   }
   
   //Metodos get/set
   public void setRadio(double r){
   radio = r;
   }
   public void setAltura(double h){
   altura = h;
   }
   
   public double getRadio(){
   return radio;
   }
   
   public double getAltura(){
   return altura;
   }
   
  //toString 
   public String toString(){
    return "radio: "+radio+"  Altura: "+altura;
   }
   
   //Metodos de calculo ó metodos de proceso     
   public double volumen(){
   return Math.PI * Math.pow(radio,2)*altura/3;
   }    
    
   public double generatriz(){
   return Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));
   }
    
   public double area(){
   return Math.PI*radio*(radio+generatriz());
   }
    
}
