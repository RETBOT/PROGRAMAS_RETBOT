/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadaordenada;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martinvaldes
 */
public class ListaEnlazadaO 
{
       Nodo primero;
       Nodo actual;
       public ListaEnlazadaO() 
       { 
       }
       
       // Realizar prueba de escritorio a este metodo con los datos de main 
       public void Insertar(int c, String pro, double pre)
       {
          Nodo anterior;
          if(ListaVacia() || primero.clave > c)
          {
            primero = new Nodo(c, pro, pre, primero);
          }
          else
          {
            anterior = primero;
            while(anterior.sig != null && anterior.sig.clave <= c)
               anterior = anterior.sig;
            anterior.sig = new Nodo(c, pro, pre, anterior.sig);
         }
       } 
       
       public void Mostrar()
       {
           Nodo aux;
           aux = primero;
           while (aux!=null)
           {
               System.out.print("Clave:"+aux.clave+", Producto: "+aux.producto+", Precio: "+aux.precio+" -> \n");
               aux = aux.sig;
           }
           System.out.print("  null ");
           System.out.println();
        }
       
       public void Mostrar(DefaultTableModel tabla) //JTable tabla)
       {
           Nodo aux;
           aux = primero;
           while (aux!=null)
           {
               tabla.insertRow(tabla.getRowCount(), new Object[] {aux.clave,aux.producto,aux.precio} );
               aux = aux.sig;
           }
//           System.out.print("  null ");
//           System.out.println();
        }
       
        public void Siguiente() 
        { 
           if(actual != null) 
             actual = actual.sig; 
        }
        public void Primero() 
        { 
           actual = primero; 
        }
        
        // miercoles 23/Dic/2020
        // realizar la prueba de escritorio al metodo borrar 
        //subir la captura
        public void Borrar(int c)
        {
          Nodo anterior, nodo;
          nodo = primero;
          anterior = null;
          while(nodo !=null && nodo.clave < c)
          {
            anterior = nodo;
            nodo = nodo.sig;
          }
          if(nodo == null || nodo.clave != c){
            JOptionPane.showMessageDialog(null, "Clave invalida");
              return;
          }
          else
          {
            if(anterior ==null)
               primero = nodo.sig;
            else 
               anterior.sig = nodo.sig;
          }
       
         }
        public boolean ListaVacia()
        { 
           if(primero == null)
            return true; 
           return false;
        }
        public void Ultimo() 
        { 
           Primero();
           if(!ListaVacia())
              while(actual.sig != null) 
                  Siguiente();
        }
        public boolean Actual() 
        { 
           if(actual != null)
             return true;
           return false;
        }
        public int ValorActual() 
        { 
           return actual.clave; 
        }      
 }  //FIN CLASE ListaEnlazada)
    
