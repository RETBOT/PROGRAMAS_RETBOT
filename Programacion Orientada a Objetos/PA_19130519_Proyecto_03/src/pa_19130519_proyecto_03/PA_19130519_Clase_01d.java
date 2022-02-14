/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
class Gabinete extends Mueble{
    //atributos 
    private String dimensiones; 
    
    // Constructores 
    public Gabinete() {
        super();
        this.dimensiones = "87*180*39 cm";
    }
    public Gabinete(String descripcion,String precio,String color, String nombre, String dimensiones) {
        super(descripcion,precio,color,nombre);
        this.dimensiones = dimensiones;
    }
    
    //get/set
     public void setColor(){
    super.setColor("Gris");
    }
     public String getDimensiones() {
        return dimensiones;
    }
     public void setDimensiones(String dimensiones){
    this.dimensiones = dimensiones;
    }
    public String mostrar(){
    return super.mostrar()+"-"+dimensiones;
    }
    
    
    
     //metodo dibujar
    public void dibujar(int x, Component componente) {
    Graphics hoja = componente.getGraphics();
        
        // "borrando"
        hoja.setColor(componente.getBackground());
        hoja.fillRect(2, 50, componente.getWidth(), componente.getHeight());
        
        hoja.setColor(Color.gray);
        hoja.fillRect(x+15, 50, 120, 180);
        hoja.fillRect(x+20, 55, 110, 170);
        hoja.fillRect(x+20, 55 , 55, 170);
        
        hoja.setColor(Color.black);
        hoja.drawRect(x+15, 50, 120, 180);
        hoja.drawRect(x+20, 55, 110, 170);
        hoja.drawRect(x+20, 55 , 55, 170);
        hoja.fillOval(x+60, 130, 10, 10);
        hoja.fillOval(x+80, 130, 10, 10);
    
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
