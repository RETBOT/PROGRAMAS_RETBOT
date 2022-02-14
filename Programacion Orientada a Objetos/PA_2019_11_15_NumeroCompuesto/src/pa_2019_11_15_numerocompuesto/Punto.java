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
public class Punto extends NumeroCompuesto{

    public Punto(){
    super();
    }
    
    public Punto(int x, int y){
    super(x,y);
    }
    
    //Set/get
    public void setX(int x){
    setParte1(x);
    }
    public void setY(int y){
    setParte2(y);
    }
    
    public int getX(){
    return getParte1();
    }
    public int getY(){
    return getParte2();
    }
    
    @Override
    public String mostrar() {
    return "("+getX()+","+getY()+")";
    }   
}
