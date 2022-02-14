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
public class Fraccion extends NumeroCompuesto implements IOperacionesBasicas{
    
    public Fraccion(){
    super();
    }
    
    public Fraccion(int num, int den){
    super(num,den);
    }
    
    //get/set
    public void setNumerador(int num){
    setParte1(num);
    }
    public void setDenominador(int den){
    setParte2(den);
    }
    
    public int getNumerador(){
    return getParte1();
    }
    public int getDenominador(){
    return getParte2();
    }
    
    public String desplegar(){
    return "{"+getNumerador()+","+getDenominador()+"}";
    }
    
    @Override
    public String mostrar() {
    return getNumerador()+"/"+getDenominador(); 
    }

    @Override
    public Object suma(Object o) {
        Fraccion f = (Fraccion)o;
        
        return new Fraccion((getNumerador()*f.getDenominador())+(f.getNumerador()*getDenominador()),getDenominador()*f.getDenominador());
    }

    @Override
    public Object resta(Object o) {
        Fraccion f = (Fraccion)o;
        
        return new Fraccion((getNumerador()*f.getDenominador())-(f.getNumerador()*getDenominador()),getDenominador()*f.getDenominador());
    }
}
