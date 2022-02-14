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
class Impresora extends Equipo{
    //atributos 
    private String dimensiones; 
    
    //constructores
    public Impresora(){
    super();
    dimensiones = "542*386*196 mm";
    }
    public Impresora(String descripcion,String precio,String marca,String nombre, String dimensiones){
    super(descripcion,precio,marca,nombre);
    this.dimensiones = dimensiones;
    }
    
    //get/set
    public String getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(String dimensiones){
    this.dimensiones = dimensiones;
    }
     public void setMarca() {
        super.setMarca("Epson");
    }
    public String mostrar(){
    return super.mostrar()+"-"+dimensiones;
    }
    
    public void dibujar(int x, Component componente){
Graphics hoja = componente.getGraphics();
        
        // "borrando"
        hoja.setColor(componente.getBackground());
        hoja.fillRect(2, 50, componente.getWidth(), componente.getHeight());
        
        hoja.setColor(Color.darkGray);
        hoja.fillRect(x+15, 100, 120, 30);
        hoja.fillRect(x+15, 90, 120, 10);
        hoja.setColor(Color.black);
        hoja.fillRect(x+35, 110, 80, 20);
        hoja.setColor(Color.white);
        hoja.fillRect(x+40, 120, 70, 30);
        hoja.fillOval(x+110, 95, 5, 5);
        hoja.fillOval(x+120, 95, 5, 5);
        hoja.fillRect(x+40, 70, 70, 20);
        
        
        hoja.setColor(Color.black);
        hoja.drawRect(x+15, 100, 120, 30);
        hoja.drawRect(x+15, 90, 120, 10);
        hoja.drawRect(x+35, 110, 80, 20);
        hoja.drawRect(x+40, 120, 70, 30);
        hoja.drawOval(x+110, 95, 5, 5);
        hoja.drawOval(x+120, 95, 5, 5);
        hoja.drawRect(x+40, 70, 70, 20);

        
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
