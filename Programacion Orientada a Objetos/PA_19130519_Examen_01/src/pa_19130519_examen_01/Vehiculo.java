/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_examen_01;

/**
 *
 * @author Roberto
 */
public class Vehiculo {
    // Atributos
    private String nombre;
    private int velocidad;
    private int tiempo;

    // Constructores 
    // Constructor 1
    public Vehiculo(){
    nombre = "No-ID";
    velocidad = 0;
    tiempo = 0;
   }
    // Constructor 2
    public Vehiculo(String nom, int vel, int tiem){
    nombre = nom;
    velocidad = vel;
    tiempo = tiem;
   }
  
   // Metodos set/get
    //Setter
    public void setNombre(String nom){
    nombre = nom;
    }
    public void setVelocidad(int vel){
    velocidad = vel;
    }
    public void setTiempo(int tiem){
    tiempo = tiem;
    }

    //Getter
    public String getNombre(){
    return nombre;
    }
    public double getVelocidad(){
    return velocidad;
    }
    public int getTiempo(){
    return tiempo;
    }
    
    // toString 
    public String toString(){
    return    nombre+"  Velocidad:" +velocidad
               +"  Tiempo: "+tiempo;
    }
    
   // Metodos de caluclo 
    public double aceleracion(){
    return (double)velocidad/(double)tiempo;
    }
}
