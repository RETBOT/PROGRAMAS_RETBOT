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
public class Pa_2019_08_30_AplicacionAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno juan = new Alumno("Juan Perez",82,79,65,91);
        System.out.println("Calificacion de "+juan.getNombre()+" es "+juan.calificacion());
    
        System.out.println(juan);
        
        Alumno maria = new Alumno();
        
        maria.setNombre("Maria Lopez");
        maria.setAsistencias(95);
        maria.setTareas(88);
        maria.setProyecto(75);
        maria.setExamen(68);
        
        System.out.println("\nCalificacion de "+maria.getNombre()+" es "+maria.calificacion());
        System.out.println(maria);

    }
    
}
