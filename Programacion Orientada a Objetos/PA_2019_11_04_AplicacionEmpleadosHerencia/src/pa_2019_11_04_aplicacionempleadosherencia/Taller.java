/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_04_aplicacionempleadosherencia;

/**
 *
 * @author admin
 */
public class Taller extends Empleado{
  private int piezas;
  private double precioPieza;
  
  public Taller(){
  super();
  piezas = 0;
  precioPieza = 0;
  }
  public Taller(int num, String nom, int piezas, double precioPza){
  super(num , nom);
  this.piezas = piezas;
  precioPieza = precioPza;
}
  //get y set 
  public int getPiezas(){
  return piezas;
  }
  public double getPrecioPieza(){
  return precioPieza;
  }
  
  public void setPiezas(int piezas){
  this.piezas = piezas;
  }
  public void setPrecioPiezas(double precioPza){
  precioPieza = precioPza;
  }
  
  public String toString(){
  return super.toString()+ " piezas:"+piezas+" $Pieza:"+precioPieza;
  }
  
  public double sueldo(){
  return piezas*precioPieza;
  }
  
}
