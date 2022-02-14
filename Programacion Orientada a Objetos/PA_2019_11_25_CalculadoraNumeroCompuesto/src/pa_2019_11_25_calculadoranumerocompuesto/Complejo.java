/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_25_calculadoranumerocompuesto;

import pa_2019_11_25_calculadoranumerocompuesto.NumeroCompuesto;

/**
 *
 * @author admin
 */
public class Complejo extends NumeroCompuesto implements IOperacionesBasicas{

    public Complejo(){
    super();
    }
    
    public Complejo(int real, int imag){
    super(real,imag);
    }
    
    //get y set
    public void setReal(int real){
    setParte1(real);
    }
    public void setImaginario(int imag){
    setParte2(imag);
    }
    
    public int getReal(){
    return getParte1();
    }
    public int getImaginario(){
    return getParte2();
    }
    
    @Override
    public String mostrar() {
        
     String cad = getReal() +" ";
     if(getImaginario()>=0)
     cad = cad +"+";
     
     cad = cad + getImaginario()+"i";
     
     return cad; 
     
     }

    @Override
    public Object suma(Object o) {
    Complejo c = (Complejo)o;
    
    return new Complejo(getReal()+c.getReal(),getImaginario()+c.getImaginario());
    }

    @Override
    public Object resta(Object o) {
    Complejo c = (Complejo)o;
    
    return new Complejo(getReal()-c.getReal(),getImaginario()-c.getImaginario());
    }
    }

   

