/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_04_aplicacionempleadosherencia;

/**
 *
 * @author admin
 */
public class Empleado {
    private int numero;
    private String nombre;
    
    public Empleado(){
    numero = 0;
    nombre = "No-ID";
    }
    
    
    public Empleado(int num, String nom){
    numero = num;
    nombre = nom;
    }
    
    //get y set
    
   public int getNumero(){
   return numero;
   }
   public String getNombre(){
   return nombre;
   }
   
   public void setNumero(int num){
   numero = num;
   }
   public void setNombre(String nom){
   nombre = nom;
   }
   
   public String toString(){
   return numero+" - "+nombre;
   }
   
   public double sueldo(){
   return 0;
   }
}

