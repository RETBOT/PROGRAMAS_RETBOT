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
public class Empresa {
  //atributos
    private Empleado [] lista;

    //constructor
    public Empresa(int n){ 
    lista = new Empleado[n];
    
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Empleado();
        }
    }
    //set 
    //poner un objeto dentro del arreglo
    //index = posición 
    public void setEmpleado(Empleado e, int index){
    lista[index] = e;
    }
    
    public Empleado getEmpleado(int index){
    return lista[index];
    }
    
    public void ordenar(){
     for (int i = 0; i < lista.length-1; i++) 
            for (int j = i+1; j < lista.length; j++) 
                if(lista[i].tiempoTrabajado().segundosTotales() > 
                        lista[j].tiempoTrabajado().segundosTotales())
                {
                Empleado aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                }
    }
}

