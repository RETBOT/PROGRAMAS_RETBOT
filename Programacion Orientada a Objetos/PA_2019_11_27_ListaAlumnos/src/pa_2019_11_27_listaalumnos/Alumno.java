/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_27_listaalumnos;

/**
 *
 * @author admin
 */
public class Alumno implements Comparable{
    //atributos
    private String nombre;
    private int edad;
    private double calificacion; 
    
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

    @Override
    public String toString() {
        return nombre + " \tedad=" + edad + " \tcalificacion=" + calificacion ;
    }

    @Override
    public int compareTo(Object t) {
     Alumno a = (Alumno)t;
     
//     if(this.edad==a.edad){
//     return 0; 
//     }
//     
//     if(this.edad>a.edad){  //si queremos calificacion ordenarlo de esta forma 
//     return 1;
//     }
//     else 
//     return -1;
     
//     return edad - a.edad; //si queremos la edad ordenarlo de esta forma 
       return nombre.compareTo(a.nombre); //y si queremos ordenarlo en forma alfabetic 
       
    }
}
