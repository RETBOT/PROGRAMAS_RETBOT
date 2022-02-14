/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_19_aplicacionnomina;

/**
 *
 * @author admin
 */
public class PA_2019_09_19_AplicacionNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado uno = new Empleado();
        Empleado dos = new Empleado("Juan Perez",15,300,6,7);
        Empleado tres = new Empleado(dos);
        
        System.out.println("uno --> "+uno);
        System.out.println("dos --> "+dos);
        System.out.println("tres --> "+tres);
        
        tres.setNombre("Maria Lopez");
        
        System.out.println("\n\tSueldo de "+uno.getNombre()+"  \t$"+uno.sueldo());
        System.out.println("\tSueldo de "+dos.getNombre()+"  \t$"+dos.sueldo());
        System.out.println("\tSueldo de "+tres.getNombre()+"  \t$"+tres.sueldo());

        
    }
    
}
