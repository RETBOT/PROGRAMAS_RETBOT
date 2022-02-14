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
class Mueble extends Oficina{
    //Atributo color de mueble 
    private String color; 
    private String nombre;

    //Constructores
    public Mueble() {
        super();
        color = " ";
        nombre = " ";
    }
    public Mueble(String descripcion, String precio,String color,String nombre) {
        super(descripcion, precio);
        this.color = color;
        this.nombre = nombre;
    }
    
   //Set/get
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String mostrar(){
    return super.mostrar()+"-"+color+"-"+nombre;
    }

    @Override
    public void dibujar(int x, Component componente) {
        //el metodo dibujar se hace en la siguiente clase, no se sabe cual es el 
        // producto y se se modifica desde esta clase solo va a hacer un dibujo 
    }
   
    // El metodo mover se puede hacer desde esta clase porque las clases herederas 
    // porque todas hacen el mismo movimiento 
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
   

