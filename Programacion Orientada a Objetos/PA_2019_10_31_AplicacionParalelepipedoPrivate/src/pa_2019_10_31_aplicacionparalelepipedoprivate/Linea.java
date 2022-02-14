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
public class Linea {
 //atributos 
    private double base;
 
 //constructores 
    public Linea(){
    base =0;
    }
    
    public Linea(double base){
    this.base = base;
    }
  
    //metodos get y set 
    public void setBase(double bas){
    base = bas;
    }
    public double getBase(){
    return base;
    }
    
    public String toString(){
    return "Base: "+base;
    }
}
