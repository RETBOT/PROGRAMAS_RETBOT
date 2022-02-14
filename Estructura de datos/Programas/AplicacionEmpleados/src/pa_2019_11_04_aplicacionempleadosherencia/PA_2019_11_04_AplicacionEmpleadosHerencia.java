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
public class PA_2019_11_04_AplicacionEmpleadosHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado uno = new Empleado(1, "Juan");
        Taller dos = new Taller(2, "Pedro", 500, 3.50);
        Administrativo tres = new Administrativo(3, "Maria", 15, 400);
        Ejecutivo cuatro = new Ejecutivo(4, "Diana", 30, 1000, 5000);
        Ventas cinco = new Ventas(5, "Jose", 80000, 4.5);

        System.out.println(uno);
        System.out.println(dos + " Sueldo$ " + dos.sueldo());
        System.out.println(tres + " Sueldo$ " + tres.sueldo());
        System.out.println(cuatro + " Sueldo$ " + cuatro.sueldo());
        System.out.println(cinco + " Sueldo$ " + cinco.sueldo());
        
        Empleado [] lista = new Empleado[6];
        lista[0] = uno;
        lista[1] = dos;
        lista[2] = tres;
        lista[3] = cuatro;
        lista[4] = cinco;
        lista[5] = new Taller(6,"Javier",1000,4);
        
        System.out.println("-------------------------------------------------");
        for(int i=0;i<lista.length;i++){
        System.out.println(lista[i].getNombre()+" $"+lista[i].sueldo());
        }
        System.out.println("-------------------------------------------------");
        for(Empleado e:lista){
        System.out.println(e.getNombre()+" $"+e.sueldo());
        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = i+1; j < lista.length; j++) {
                if(lista[i].sueldo() < lista[j].sueldo()){
                Empleado aux = lista[i];
                 lista[i] = lista[j]; 
                 lista[j]= aux;
            }
        }
    }
   
     System.out.println("-------------------------------------------------");
        for(Empleado e:lista){
        System.out.println(e.getNombre()+" $"+e.sueldo());
        }
    
    }    
}
