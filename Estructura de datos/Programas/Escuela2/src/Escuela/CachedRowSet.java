/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class CachedRowSet {
    
public CachedRowSetImpl rellena(String query) throws Exception {
  
   CachedRowSetImpl crs = null; 
   Conexion c = new Conexion();
   try{
    c.ConectarBasedeDatos("");
    c.sentencia = c.conexion.createStatement();
        c.resultado = c.sentencia.executeQuery(query);
        crs = new CachedRowSetImpl();
        crs.populate(c.resultado);

   }catch (Exception e){       
   e.printStackTrace();
   } finally {
       if(c.resultado!=null) {
           try {
               c.resultado.close();
           } catch(SQLException e) { 
               e.printStackTrace();
           }
       }if(c.conexion!=null) {
            try {
                c.conexion.close();
            }catch (SQLException e) {   
                e.printStackTrace();
            }
       }
   }
   return crs;
}
}
