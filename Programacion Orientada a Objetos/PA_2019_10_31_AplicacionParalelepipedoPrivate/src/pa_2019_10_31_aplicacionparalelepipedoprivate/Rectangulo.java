/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_31_aplicacionparalelepipedoprivate;

/**
 *
 * @author admin
 */
public class Rectangulo extends Linea{
   private double altura;
    
    public Rectangulo(){
        super(); //palabra reservada, mandamos a llamar al constructor de linea 
                 //siempre tiene que ser la primera palabra en el constructor 
        altura =0;
    }
    public Rectangulo(double bas,double alt){
        super(bas); // se manda a llamar a la clase padre con la palabra super 
        altura = alt;
    }
    
    //get y set
    public void setAltura(double alt){
    altura = alt;
    }    
    
    public double getAltura(){
    return altura;
    }
    
    public String toString(){
    return super.toString()+ " Altura: "+altura;
    }
    
    public double area(){
    return getBase() *altura;
    }
    
    public double perimetro(){
    return (getBase()+altura)*2;
    }
}
