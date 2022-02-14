/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_examen_01;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTable;


/**
 *
 * @author Roberto
 */
public class Concesionario { 
   private Vehiculo [] automovil;
   static Random azar = new Random();
   //nombres de los vehiculos
   static String [] marcas = {"Porsche Carrera","Bugatti Veyron","Chevrolet Corvette"
                             ,"Dodge Viper","Lamborghini Countach","Shelby Cobra"
                             ,"Ferrari Testarrosa","Ford Mustang","Nissan Versa"
                             ,"Chevrolet Aveo","Volkswagen Vento","Volkswagen Jetta"
                             ,"Nissan Tsuru","Nissan March","Chevrolet Sonic","Nissan Sentra"
                             ,"Nissan X-Trail","Chevrolet Trax","Nissan Tiida","Honda CR-V"
                             ,"Volskwagen Gol","KIA Sportage","Dodge Attitude","Honda HR-V"
                             ,"Nissan Frontier","Mazda 3 Sedan","Chevrolet Equinox"
                             ,"Renault Duster","Toyota Corolla","Volkswagen Gol Sedan"
                             ,"Toyota Hilux","Mazda CX-5"};
        
    public static String marcaVehiculo(){
    return marcas[azar.nextInt(marcas.length)];
    }
            
    // Constructores 
    // Constructor 1
    public Concesionario(){
          automovil = new Vehiculo[10];
          
          for(int i=0;i<automovil.length;i++)
              automovil[i] = new Vehiculo();
    }
    
 //Constructor 2 
    public Concesionario(int n){
          automovil = new Vehiculo[n];
    
          for(int i=0;i<automovil.length;i++)
          automovil[i] = new Vehiculo();
    }

    // Posicion = idx 
    public void setPosicion(Vehiculo e, int idx){
    automovil[idx] = e;
    }
    public Vehiculo getPosicion(int idx){
    return automovil[idx];
    } 
    
    // Tamaño  
    public int getTamaño(){
    return automovil.length;
    }
    
    // Ordenar de menor a mayor aceleración 
    public void ordenarAceleracion(){
        for(int i=0; i<automovil.length-1;i++)
            for(int j = i+1;j<automovil.length;j++)
                if(automovil[i].aceleracion()> automovil[j].aceleracion())
                   {
                   Vehiculo aux = automovil[i];
                    automovil[i]= automovil[j];
                    automovil[j] = aux;
                   }
    }
    
    // Mostrar en visual 
     public void mostrar(JTable jTableVehiculo, JLabel jLabPromedio){
     double aceleracionTotal=0;
     double promedio=0;
     
     DecimalFormat df = new DecimalFormat("###,##0");
     
     for(int r=0; r<automovil.length; r++){
        jTableVehiculo.setValueAt(automovil[r].getNombre(), r, 0);
        jTableVehiculo.setValueAt(automovil[r].getVelocidad(), r, 1);
        jTableVehiculo.setValueAt(automovil[r].getTiempo(), r, 2);
        jTableVehiculo.setValueAt(df.format(automovil[r].aceleracion()), r, 3); 
       
        aceleracionTotal += automovil[r].aceleracion();
        promedio = aceleracionTotal/automovil.length;
        jLabPromedio.setText(df.format(promedio));
        }
    }
}


