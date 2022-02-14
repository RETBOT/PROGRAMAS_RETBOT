/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_28_listaalumnosvariosordenamientos;

/**
 *
 * @author admin
 */
public class Alumno implements Comparable{
    //atributos
    private String nombre;
    private int edad;
    private double calificacion; 
    private static int tipoOrdenamiento; // 0 - Edad 
                                         // 1 - Calificacion 
                                         // 2 - Nombre 
    
    //constructores 
    public Alumno() {
    nombre = "No-ID";
    edad=0;
    calificacion=0;
    }
    public Alumno(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }
    
    //Set y get 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public static int getTipoOrdenamiento() {
        return tipoOrdenamiento;
    }
    public static void setTipoOrdenamiento(int tipoOrdenamiento) {
        Alumno.tipoOrdenamiento = tipoOrdenamiento;
    }

    @Override
    public String toString() {
        return nombre + " \tedad=" + edad + " \tcalificacion=" + calificacion ;
    }

    @Override
    public int compareTo(Object t) {
     Alumno a = (Alumno)t;
     int valor = 0;
     switch(tipoOrdenamiento){
         case 0: //por edad 
             valor = edad - a.edad;
             break;
             
         case 1: //por calificacion
            if(calificacion==a.calificacion){
            valor = 0;
            }
            else 
                if(calificacion>a.calificacion){
                valor = 1;
                }
                else 
                    valor = -1;
             break;
             
         case 2: //por nombre 
             valor = nombre.compareTo(a.nombre); 
             break;
             
     }
     return valor;
    }
}
