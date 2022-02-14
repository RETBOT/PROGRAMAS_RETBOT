/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_03;

import java.awt.Component;

/**
 *
 * @author admin
 */
abstract class Oficina{
   //atributos 
    private String descripcion; 
    private String precio;
    
    
    //Constructores
    public Oficina() {
        descripcion = " ";
        precio = "";
    }
    public Oficina(String descripcion, String precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // Set/get 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getPrecio() {
        return precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String mostrar(){
    return descripcion +"-"+precio;
    }

    
    //metodos abstractos 
    public abstract void dibujar(int x, Component componente);
    public abstract void mover();
}
