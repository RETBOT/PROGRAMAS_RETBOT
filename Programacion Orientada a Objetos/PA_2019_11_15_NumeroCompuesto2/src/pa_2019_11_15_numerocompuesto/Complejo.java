/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_15_numerocompuesto;

/**
 *
 * @author admin
 */
public class Complejo extends NumeroCompuesto{

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
    }

   

