/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_03;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
class Equipo extends Oficina{
    // Atributos 
    private String marca;
    private String nombre;
    
    //Constructores
    public Equipo(){
    super();
    marca =" "; 
    nombre = "";
    }
    
    public Equipo(String descripcion,String precio,String marca, String nombre){
    super(descripcion,precio);
    this.marca=marca;
    this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrar(){
    return super.mostrar()+"-"+marca+"-"+nombre;
    }
    
    @Override
    public void dibujar(int x, Component componente) {
         //el metodo dibujar se hace en la siguiente clase, no se sabe cual es el 
        // producto y se se modifica desde esta clase solo va a hacer un dibujo 
    }

    @Override
    public void mover() {
Component comp;
    
    PA_19130519_Frame_01 f = new PA_19130519_Frame_01();
    f.setVisible(true);
    comp = f;
    for(int i=0; i<=880; i+=30){
    dibujar(i,comp);
    }
    
    try {
        Thread.sleep(100);
        } catch (InterruptedException ex) {
         Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    f.setVisible(false);
    }
    
}
