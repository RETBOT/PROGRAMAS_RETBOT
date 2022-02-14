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
public class Paralelepipedo extends Rectangulo{
    protected double profundidad;
    
    public Paralelepipedo(){
    base =0;
    altura =0;
    profundidad=0;
    }
    
    public Paralelepipedo( double bas, double alt , double prof){
    base = bas; 
    altura = alt;
    profundidad = prof;
    }
     
    public String toString(){
    return "Base:"+base+" Altura:"+altura+" Profundidad:"+profundidad;
    }
    
    public double volumen(){
    return base*altura*profundidad;
    }
    
    public double area(){
    return 2*(base*altura + base*profundidad + altura*profundidad);
    }
}
