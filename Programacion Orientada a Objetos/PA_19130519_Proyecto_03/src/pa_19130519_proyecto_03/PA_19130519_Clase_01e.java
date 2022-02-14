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
class Monitor extends Equipo{
    //atributos 
    private String dimensiones;
    
// constructores 
public Monitor(){
super();
dimensiones = " 32 in ";
}
public Monitor(String descripcion, String precio,String marca, String nombre, String dimensiones) {
super(descripcion,precio,marca,nombre);
this.dimensiones = dimensiones;
}

//set/get 
public String getDimensiones(){
        return dimensiones;
}
public void setDimensiones(String dimensiones){
    this.dimensiones = dimensiones;
    }
    public void setMarca() {
        super.setMarca("Dell");
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
        hoja.fillRect(x+15, 70, 130, 100);
        hoja.fillRect(x+70, 170, 20, 15);
        hoja.fillRect(x+30, 185, 105, 10);
        hoja.setColor(Color.white);
        hoja.fillRect(x+20, 75, 120, 90);
        hoja.fillOval(x+110, 166, 4, 4);
        hoja.fillOval(x+120, 166, 4, 4);
        hoja.fillOval(x+130, 166, 4, 4);
        
        hoja.setColor(Color.black);
        hoja.drawRect(x+15, 70, 130, 100);
        hoja.drawRect(x+20, 75, 120, 90);
        hoja.drawRect(x+70, 170, 20, 15);
        hoja.drawRect(x+30, 185, 105, 10);
        hoja.drawString("System.out.prinln", x+30, 100);
        hoja.drawString("(''Hola Mundo'');", x+30, 120);

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PA_19130519_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
