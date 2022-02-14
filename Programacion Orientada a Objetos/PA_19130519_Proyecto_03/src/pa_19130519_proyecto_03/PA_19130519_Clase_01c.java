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
class Sillon extends Mueble{
    // atributos 
    private String dimensiones;
    
    public Sillon(){
    super();
    dimensiones = "206*147*87 cm";
    }

    public Sillon(String descripcion,String precio,String color, String nombre, String dimensiones) {
        super(descripcion,precio,color,nombre);
        this.dimensiones = dimensiones;
    }
    //set/get
    public void setDimensiones(String dimensiones){
    this.dimensiones = dimensiones;
    }
    public String getDimensiones() {
        return dimensiones;
    }
    public void setColor(){
    super.setColor("Rojo");
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
        
        hoja.setColor(Color.red);
        hoja.fillRect(x+15, 110, 30, 50); // parte lateral izquierda 
        hoja.fillRect(x+45, 120, 54, 20); //cojin 1
        hoja.fillRect(x+100, 120, 50, 20); //cojin2
        hoja.fillRect(x+45, 60, 105, 80); //  respaldo 
        hoja.fillRect(x+45, 140, 105, 20); // centro 
        hoja.fillRect(x+150, 110,30, 50); // parte lateral derecha
        hoja.setColor(Color.white);
        hoja.fillRect(x+19, 160, 20, 10); // pata izquierda 
        hoja.fillRect(x+154, 160, 20, 10); // pata derecha 
       
       hoja.setColor(Color.black);
        hoja.drawRect(x+15, 110, 30, 50); // parte lateral izquierda
        hoja.drawRect(x+45, 120, 54, 20); //cojin 1
        hoja.drawRect(x+100, 120, 50, 20); //cojin2
        hoja.drawRect(x+45, 60, 105, 80); //  respaldo 
        hoja.drawRect(x+45, 140, 105, 20); // centro 
        hoja.drawRect(x+150, 110, 30, 50); // parte lateral derecha
        hoja.drawRect(x+19, 160, 20, 10); // pata izquierda 
        hoja.drawRect(x+154, 160, 20, 10); // pata derecha
    
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
