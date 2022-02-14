/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_12_05_archivobinario;

/**
 *
 * @author admin
 */
public class Alumno implements Comparable {
private String nombre;
private char grupo;
private int edad; 
private double calificacion;

    public Alumno(String nombre, char grupo, int edad, double calificacion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.edad = edad;
        this.calificacion = calificacion;
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
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


    //to String

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", grupo=" + grupo + ", edad=" + edad + ", calificacion=" + calificacion + '}';
    }

    @Override
    public int compareTo(Object t) {
    Alumno a = (Alumno)t;
    if(calificacion == a.calificacion)
        return 0;
    else if (calificacion > a.calificacion)
        return 1;
    else 
        return -1;
    }
    
    
    
    
}
