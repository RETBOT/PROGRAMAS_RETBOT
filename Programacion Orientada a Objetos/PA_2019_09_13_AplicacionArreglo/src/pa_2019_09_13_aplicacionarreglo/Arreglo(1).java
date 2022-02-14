/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_13_aplicacionarreglo;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Arreglo {
    private double [] datos; 
    
    //Constructores 
    // constructor 1
    public Arreglo(){
    datos = new double [10];
    }
    
    //constructor 2
    public Arreglo(int n){
    if (n<1)
       datos = new double [10];
    else 
        datos = new double[n];
    }
      
    // constructor 3
    public Arreglo(double [] d){
        datos = new double[d.length];
        
        for (int i=0;i<d.length;i++)
            datos[i] = d[i];
    }
    
    //   
    public int getTamaño(){
    return datos.length;
    }
    
    public void setValor(double valor, int posicion){
        if(posicion >= 0 && posicion < datos.length)
           datos[posicion] = valor; 
    }
    
    public double getValor(int posicion){
       if(posicion >= 0 && posicion < datos.length)
          return datos[posicion];
       else 
           return 0;
    }
         

    // mostrar elementos del arreglo //Por cadena
    public String toString(){
    String cad = "{";
    
    for(int i= 0;i<datos.length;i++){
    cad = cad+ datos[i];
    if (i<datos.length-1)
        cad = cad + ",";
    }
    
    cad = cad + "}";
    
    return cad;
    
    }
    
    //Metodos de caluclo 
   //suma
    public double suma(){
      double total =0; 
      for(int i=0; i<datos.length;i++)
          total += datos[i];
      return total;
   }
    //promedio 
   public double promedio(){
       return suma() / getTamaño();
   }
   //dato mayor
   public double mayor(){
   double may = datos[0];
   for(int i=1; i<datos.length; i++)
       if(datos[i] > may)
           may=datos[i];
   return may;
   }
   //dato menor 
   public double menor(){
   double men = datos[0];
   for(int i=1; i<datos.length; i++)
       if(datos[i] < men)
           men = datos[i];
   return men;
   }
  
   // rango de los datos 
   public double rango(){
   return mayor() - menor();
   }
   
   //para obtener la mediana
   public double mediana(){
 
   double [] copia = datosOrdenados();
       
   double med; 
   if(copia.length % 2==0) //el numero de elementos es par 
      med = (copia[copia.length/2]+copia[copia.length-1] /2);
   
   else //el numero de elemenos es non
       med = copia[(copia.length-1)/2];
 
   return med;
   }
  
   public void ordenarDatos(){
   Arrays.sort(datos);
   }
   
   public double [] datosOrdenados(){
   double [] copia = new double[datos.length];
   for(int i=0;i<copia.length;i++)
       copia[i] = datos[i];
   
   Arrays.sort(copia);
  return copia;
   }
   
 }
