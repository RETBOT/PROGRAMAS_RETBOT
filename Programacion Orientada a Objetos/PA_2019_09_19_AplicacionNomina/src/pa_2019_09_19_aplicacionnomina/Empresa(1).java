/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_19_aplicacionnomina;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author admin
 */
public class Empresa {
    private Empleado [] nomina; 

// Constructor     
    public Empresa(){
          nomina = new Empleado[10];
          
          for(int i=0;i<nomina.length;i++)
              nomina[i] = new Empleado();
    }
    
 //Constructor 2 
    public Empresa(int n){
          nomina = new Empleado[n];
          
          for(int i=0;i<nomina.length;i++)
              nomina[i] = new Empleado();
    }

//Get/Set 
    //el set no regresa nada (void) //posicion = idx 
    public void setEmpleado(Empleado e, int idx){
    //en el proyecto tenemos que valorar 
    nomina[idx] = e;
    }
    public Empleado getEmpleado(int idx){
    return nomina[idx];
    } 
    
    //get tamaño 
    public int getTamaño(){
    return nomina.length;
    }
    
    //Empleado con mayor sueldo 
    public Empleado mayorSueldo(){
        Empleado mayor = nomina[0];
        
        for(int i=1; i<nomina.length;i++)
        if (nomina[i].sueldo()> mayor.sueldo())
        mayor = nomina[i];
 
        return mayor;
    }
    
    public Empleado menorSueldo(){
        Empleado menor = nomina[0]; 
        for(int i=1; i<nomina.length;i++)
        if(nomina[i].sueldo()<menor.sueldo())
           menor = nomina[i];        
        return menor;
    }
    
    public void ordenarSueldo(){
      for(int i=0; i<nomina.length-1;i++)
                    for(int j = i+1;j<nomina.length;j++)
                   if(nomina[i].sueldo() > nomina[j].sueldo())
                   {
                          Empleado aux = nomina[i];
                           nomina[i]= nomina[j];
                           nomina[j] = aux;
                   }
    }
    
    public void ordenarAlfabetico(){
        for(int i=0; i<nomina.length-1;i++)
               for(int j = i+1;j<nomina.length;j++)
                   if(nomina[i].getNombre().compareTo(nomina[j].getNombre())>0)
                   {
                          Empleado aux = nomina[i];
                           nomina[i]= nomina[j];
                           nomina[j] = aux;
                   }
    }
    //mostrar en visual
     public void mostrar(JTable tabla, JLabel etiqueta){
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        double sueldoTotal=0;
        for(int r=0; r<nomina.length;r++){
        tabla.setValueAt(nomina[r].getNombre(), r, 0);
        tabla.setValueAt(nomina[r].getDiasTrabajados(), r, 1);
        tabla.setValueAt(nomina[r].getSueldoDiario(), r, 2);
        tabla.setValueAt(nomina[r].getHorasExtras(), r, 3);
        tabla.setValueAt(nomina[r].getPorcentajeImpuesto(), r, 4);
        
        tabla.setValueAt(df.format(nomina[r].sueldoBruto()), r, 5);
        tabla.setValueAt(df.format(nomina[r].importeHorasExtras()), r, 6);
        tabla.setValueAt(df.format(nomina[r].ImporteImpuesto()), r, 7);
        tabla.setValueAt(df.format(nomina[r].sueldo()), r, 8);
        
        sueldoTotal += nomina[r].sueldo();
           etiqueta.setText(df.format(sueldoTotal));
        }
       
    }

}
