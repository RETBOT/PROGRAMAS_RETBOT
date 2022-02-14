/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracautomoviles;

/**
 *
 * @author admin
 */
public class Automovil {
// Atributos
private String marca;
private String modelo; 
private float presionLlanta;
private int costo;

// Contructores
public Automovil(){
marca = "";
modelo = "";
presionLlanta = 0;
costo = 0;
}
public Automovil(String marca, String modelo, float presionLlanta, int costo){
this.marca = marca;
this.modelo = modelo;
this.presionLlanta = presionLlanta;
this.costo =  costo;
}

//Getter and Setter 
public String getMarca(){
return marca;
}
public String getModelo(){
return modelo; 
}
public float getPresionLlanta(){
return presionLlanta;
}
public int getCosto(){
return costo;
}
public void setMarca(String marca){
this.marca = marca;
}
public void setModelo(String modelo){
this.modelo = modelo;
}
public void setPresionLlanta(float presionLLanta){
this.presionLlanta  = presionLLanta;
}
public void setCosto(int costo){
this.costo = costo; 
}

public String toString() {
return "Marca=" + marca + ", Modelo=" + modelo + ", Presion Llanta=" + presionLlanta + ", Costo=" + costo;
}
}
