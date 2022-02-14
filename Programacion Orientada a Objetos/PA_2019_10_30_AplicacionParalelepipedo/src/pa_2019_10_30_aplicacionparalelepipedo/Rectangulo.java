/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_30_aplicacionparalelepipedo;

/**
 *
 * @author admin
 */
public class Rectangulo extends Linea{
   protected double altura;
    
    public Rectangulo(){
        base = 0;
        altura =0;
    }
    public Rectangulo(double bas,double alt){
        base = bas;
        altura = alt;
    }
    
    public String toString(){
    return "Base: "+base+" Altura: "+altura;
    }
    
    public double area(){
    return base*altura;
    }
    
    public double perimetro(){
    return (base+altura)*2;
    }
}
