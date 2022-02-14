/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PA_19130519_Proyeco_01;

/**
 *
 * @author Roberto Esquivel Troncoso
 */
public class Vehiculo {
   // atributos
    private String nombre;
    private double distancia; 
    private int tiempo; 
    private int aceleracion;   

    
    //constructores
    //constructor 1
    public Vehiculo(){
    nombre = "No-ID";
    distancia = 0; 
    tiempo = 0; 
    aceleracion = 0; 
    }
    //constructor 2
    public Vehiculo(String nom, double distancia, int tiempo, int aceleracion){
    this.nombre = nom; 
    this.distancia = distancia;
    this.tiempo = tiempo;
    this.aceleracion = aceleracion;
    }

   //metodos set/get
    //Setter
    public void setNombre(String nom){
    this.nombre = nom;
    }
    public void setDistancia(double distancia){
    this.distancia = distancia;
    }
    public void setTiempo(int tiempo){
    this.tiempo = tiempo;
    }
    public void setAceleracion(int aceleracion){
    this.aceleracion = aceleracion;
    }
 
    
    //Getter
    public String getNombre(){
    return nombre;
    }
    public double getDistancia(){
    return distancia;
    }
    public int getTiempo(){
    return tiempo;
    }
    public int getAceleracion(){
    return aceleracion; 
    }
    
  // mostrar elementos del arreglo 
    public String toString(){
    return    nombre+"  Distancia:" +distancia
               +"  Tiempo: "+tiempo
               +"  Aceleracion: "+aceleracion;
    }
    
   //metodos de caluclo de la velocidad inicial
    public double velocidadInicial(){
    return(distancia/tiempo)-((aceleracion*tiempo)/2);
    }
}
