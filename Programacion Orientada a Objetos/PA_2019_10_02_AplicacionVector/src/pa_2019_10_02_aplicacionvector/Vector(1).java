/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_02_aplicacionvector;

/**
 *
 * @author admin
 */
public class Vector {
   private double magnitud;
   private double angulo; //en grados contados a partir del eje x positivo 
   
   //constructor 
   public Vector(){
   magnitud =0;
   angulo=0;
   }
   
   public Vector(double mag, double ang){
   magnitud = mag; 
   angulo = ang;
   }
   
   public Vector(Vector v){
   magnitud = v.magnitud;
   angulo = v.angulo;
   }
   
   //get/ set 
   public void setMagnitud(double mag){
   magnitud = mag;
   }
   
   public void setAngulo(double ang){
   angulo = ang;
   }
 
   public double getMagnitud(){
   return magnitud;
   }
   
   public double getAngulo(){
   return angulo;
   }
   
   public String toString(){
   return "Magnitud: "+magnitud+" Angulo: "+angulo+"°";
   }
 
   // metodo 
   public double getRadianes(){
   return angulo * Math.PI / 180;
   }
   
   public void setRadianes(double radianes){
   angulo = radianes * 180 / Math.PI;
   }
   
   public double getX(){
   return magnitud*Math.cos(getRadianes());
   }
   public double getY(){
   return magnitud*Math.sin(getRadianes());
   }

   public void setXY(double x, double y){
   magnitud = Math.sqrt(x*x + y*y);
   setRadianes(Math.atan2(y, x));
   }
   
   //metodos 
   //este metodo involucrea 3 objetos de la clase Vector 
   // 1. es el que manda a llamar al metodo
   // 2. es el que llega como paramtero (v)
   // 3. es el resultante de sumar this´+v (resultate);
   public Vector suma(Vector v){

   double sumaX = getX() + v.getX();
   double sumaY = getY() + v.getY();
   
   Vector resultante = new Vector();
   resultante.setXY(sumaX,sumaY);

   return resultante;
   
       }   
      public Vector resta(Vector v){
      double sumaX = getX() - v.getX();
      double sumaY = getY() - v.getY();
      Vector resultante = new Vector();
  
   resultante.setXY(sumaX,sumaY);

   return resultante;
      }
} 
