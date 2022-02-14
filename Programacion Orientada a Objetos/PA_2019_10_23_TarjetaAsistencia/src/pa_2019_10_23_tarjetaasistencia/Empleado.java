/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_23_tarjetaasistencia;

/**
 *
 * @author admin
 */
public class Empleado {
private String nombre; 
private Horario entrada; 
private Horario salida; 

public Empleado(){
nombre = "No-ID";
}

public Empleado(String nom, Horario ent, Horario sal){
nombre = nom;
entrada = ent; 
salida = sal;
}

public String getNombre(){
return nombre;
}

public Horario getEntrada(){
return entrada;
}

public Horario getSalida(){
return salida;
}

public void setNombre(String nom){
nombre = nom;
}
public void setEntrada(Horario ent){
entrada = ent;
}
public void setSalida(Horario sal){
salida = sal;
}

public String toString(){
return nombre+" Entrada->"+entrada+" Salida->"+salida;
}

public Horario tiempoTrabajado(){
return salida.resta(entrada);
 }
}
