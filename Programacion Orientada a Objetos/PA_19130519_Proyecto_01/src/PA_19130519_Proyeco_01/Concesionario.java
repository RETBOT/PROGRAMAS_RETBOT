/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PA_19130519_Proyeco_01;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTable;


/**
 *
 * @author admin
 */
public class Concesionario { 
   private Vehiculo [] automoivil;
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
            
    // Constructor     
    public Concesionario(){
          automoivil = new Vehiculo[10];
          
          for(int i=0;i<automoivil.length;i++)
              automoivil[i] = new Vehiculo();
    }
    
 //Constructor 2 
    public Concesionario(int n){
          automoivil = new Vehiculo[n];
    
          for(int i=0;i<automoivil.length;i++)
          automoivil[i] = new Vehiculo();
    }

 
    //Get/Set 
    //posicion = idx 
    public void setPosicion(Vehiculo e, int idx){
    automoivil[idx] = e;
    }
    public Vehiculo getPosicion(int idx){
    return automoivil[idx];
    } 
    
    //get tamaño 
    public int getTamaño(){
    return automoivil.length;
    }
    
    //Vehiculo con mayor velocidad
    public Vehiculo mayorVelocidad(){
        Vehiculo mayor = automoivil[0];
 
        for(int i=1; i<automoivil.length;i++)
        if (automoivil[i].velocidadInicial()> mayor.velocidadInicial())
       mayor = automoivil[i];
 
        return mayor;
    }
    
  //Vehiculo con menor velocidad
    public Vehiculo menorVelocidad(){
             Vehiculo menor = automoivil[0]; 
       for(int i=1; i < automoivil.length;i++)
       if(automoivil[i].velocidadInicial() < menor.velocidadInicial())
           menor = automoivil[i];  
       
        return menor;
    }
        //ordenar de menor a mayor
        public void ordenarVelocidadInicial(){
        for(int i=0; i<automoivil.length-1;i++)
            for(int j = i+1;j<automoivil.length;j++)
                if(automoivil[i].velocidadInicial() > automoivil[j].velocidadInicial())
                   {
                   Vehiculo aux = automoivil[i];
                    automoivil[i]= automoivil[j];
                    automoivil[j] = aux;
                   }
    }
    // ordenar alfabéticamente
    public void ordenAlfabetico(){
          for(int i=0; i<automoivil.length-1;i++)
               for(int j = i+1;j<automoivil.length;j++)
                   if(automoivil[i].getNombre().compareTo(automoivil[j].getNombre())>0)
                   {
                          Vehiculo aux = automoivil[i];
                           automoivil[i]= automoivil[j];
                           automoivil[j] = aux;
                   }   
    }
    
    //mostrar en visual 
     public void mostrar(JTable jTableVehiculo, JLabel jLabTotal){
     double velocidadTotal=0;
     double promedio=0;
     
     DecimalFormat df = new DecimalFormat("###,##0");
     
     for(int r=0; r<automoivil.length; r++){
        jTableVehiculo.setValueAt(automoivil[r].getNombre(), r, 0);
        jTableVehiculo.setValueAt(automoivil[r].getDistancia(), r, 1);
        jTableVehiculo.setValueAt(automoivil[r].getAceleracion(), r, 2);
        jTableVehiculo.setValueAt(automoivil[r].getTiempo(), r, 3);
        jTableVehiculo.setValueAt(df.format(automoivil[r].velocidadInicial()), r, 4); 
        
        velocidadTotal += automoivil[r].velocidadInicial();
        promedio = velocidadTotal/automoivil.length;
        
        jLabTotal.setText(df.format(promedio));
        }
    }
}


