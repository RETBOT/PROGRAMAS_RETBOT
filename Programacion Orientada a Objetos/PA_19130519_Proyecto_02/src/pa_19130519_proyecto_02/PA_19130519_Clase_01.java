/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_02;

/**
 *
 * @author admin
 */
 class Distancia {
  //atributos
  private int milla;
  private int braza;
  private int yarda;
  private int pie;
  private int pulgada; 
  
 //Constructor 
  //Constructor 1 
  public Distancia(){
  milla = 0;
  braza = 0;
  yarda = 0;
  pie = 0;
  pulgada = 0;
  }
  //Constructor 2
  public Distancia(int milla, int braza, int yarda, int pie, int pulgada){
  this.milla = milla;
  this.braza = braza;
  this.yarda = yarda;
  this.pie = pie;
  this.pulgada = pulgada;
  }
  
  //Constructor de copia
  public Distancia(Distancia d){
  this.milla = d.milla;
  this.braza = d.braza;
  this.yarda = d.yarda;
  this.pie = d.pie;
  this.pulgada = d.pulgada;
  }
  
  //metodos getter y setter
  // getter 
  public int getMilla(){
  return milla;
  }
  public int getBraza(){
  return braza;
  }
  public int getYarda(){
  return yarda;
  }
  public int getPie(){
  return pie;
  }
  public int getPulgada(){
  return pulgada;
  }
  
  // setter
  public void setMilla(int milla){
  this.milla = milla;
  }
  public void setBraza(int braza){
  this.braza = braza;
  }
  public void setYarda(int yarda){
  this.yarda = yarda;
  }
  public void setPie(int pie){
  this.pie = pie;
  }
  public void setPulgada(int pulgada){
  this.pulgada = pulgada;
  }
  
 // toString 
  public String toString(){
  return milla+"mi "+braza+"fm "+yarda+"yd "+pie+"ft "+pulgada+"in ";
  }
  
  // Conversión a pulgadas
  public int pulgadasTotales(){
  return (milla*63360)+(braza*72)+(yarda*36)+(pie*12)+pulgada;
  }
  
  // Suma de pulgadas y conversión a milla, yarda, pie y pulgada 
  public Distancia suma (Distancia d){
  int sumaPulg = pulgadasTotales() + d.pulgadasTotales();
  int mill = sumaPulg/63360; //div
  int restoMill = sumaPulg%63360; //mod
  
  int braz = restoMill/72; //div
  int restoBrazo = restoMill%72; //mod
  
  int yard = restoBrazo/36; //div 
  int restoYarda = restoBrazo%36; //mod 
  
  int pi = restoYarda/12; //div
  int pulg = restoYarda%12; //mod 
  
  return new Distancia(mill, braz, yard, pi, pulg);
  }

  
  // Resta de pulgadas y conversión a milla, yarda, pie y pulgada 
  public Distancia resta(Distancia d){
  int restaPulg = pulgadasTotales() - d.pulgadasTotales();
  
  int mill = restaPulg/63360; //div 
  int restoMilla = restaPulg % 63360; //mod
  
  int braz = restoMilla/72; //div
  int restoBrazo = restoMilla%72; //mod
  
  int yard = restoBrazo/36; //div 
  int restoYarda = restoBrazo%36;  //mod
  
  int pi = restoYarda/12; //div
  int pulg = restoYarda%12; //mod 
  
  return new Distancia(mill,braz,yard,pi,pulg);
  }
  
  
}
