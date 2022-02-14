/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_08_30_aplicacionalumno;

/**
 *
 * @author aa530
 */
public class Alumno {
    //atributos 
    private String nombre;
    private int asistencias;
    private int tareas;
    private int proyecto;
    private int examen; 
    
    //constructores 
    public Alumno(){
    nombre = "No-Id";
    asistencias = 0;
    tareas =0;
    proyecto=0;
    examen =0;
    }
    
    public Alumno (String nom, int asist, int tarea, int proy, int exam){
    nombre = nom;
    asistencias = asist;
    tareas = tarea;
    proyecto = proy;
    examen=exam;
    }
    
    //metodos get/set
    public void setNombre(String nom){
    nombre = nom;
    }
    
    public void setAsistencias(int asist){
    asistencias = asist;
    } 
    
    public void setTareas(int tarea){
    tareas = tarea;
    }
    
    public void setProyecto(int proy)
    {
    proyecto = proy;
    }
    
    public void setExamen(int exam)
    {
    examen = exam;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public int getAsistencias(){
    return asistencias;
    }
    
    public int getTareas(){
    return tareas;
    }
    
    public int getProyecto(){
    return proyecto;
    }
    
    public int getExamen(){
    return examen;
    } 
   
    public String toString(){
    return nombre+"  Asistencias: "+asistencias+
                  "  Tareas: "+tareas+
                  "  Proyecto: "+proyecto+
                  "  Examen: "+examen;
                  
    }
            
    //metodos de calculo
    public double calificacion(){
    return asistencias * 0.10+
            tareas     * 0.12+
            proyecto   * 0.18+
            examen     * 0.60;
    }
    
    
    
    
    
}
