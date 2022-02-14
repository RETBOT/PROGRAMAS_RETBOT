/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;


import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;

public class Escuela {

    Statement st = null;
    
    
    public static void verAlumnos(){
    Conexion c = new Conexion();
    String texto = "";
        try {
            c.ConectarBasedeDatos("");
            String sql = "use colegio "
            + "Select * from infoEstudiantes";
            c.resultado = c.sentencia.executeQuery(sql);
         
            while(c.resultado.next()){
                texto += "Nombre = " + c.resultado.getString("name")
                      +", Email = "+c.resultado.getString("email")
                      +", Asesor = "+c.resultado.getString("asesor");
                }
        } catch (SQLException ex) {  
        Logger.getLogger(Escuela.class.getName()).log(Level.SEVERE, null, ex);
     }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void agregarAlumnos(){
        Conexion c = new Conexion();
        Scanner leer = new Scanner(System.in);
 
     try{
        c.ConectarBasedeDatos("");

         String sql="";
       
         System.out.println("Nombre alumno: ");
         String alu = leer.nextLine();
         System.out.println("Correo electronico: ");
         String corr = leer.nextLine();
         System.out.println("Asesor: ");
         String ase = leer.nextLine();
         
         
        sql = "use colegio "
                + "insert into infoEstudiantes values("
                +"'"+alu+"'"
                +",'"+corr+"'"
                +",'"+ase+"');";
        
        c.sentencia.execute(sql);
        
        JOptionPane.showMessageDialog(null, "El alumno se agregó correctamente");
        c.DesconectarBasedeDatos();
        } catch (SQLException ex) { 
        
        Logger.getLogger(Escuela.class.getName()).log(Level.SEVERE, null, ex);
      } 
    }
    
    
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
        
    public static void main(String[] args) {
     String query = "SELECT * FROM infoAlumnos";
     try {   
    CachedRowSet crs = rellena;  
    while (crs.next()) {
    String nombre = crs.getString(1);
    int edad = crs.getInt(2);
    System.out.println("Nombre->"+nombre+" Edad->"+edad);      
   }       
  } catch (Exception e){          
    e.printStackTrace();
    }   
     
     int op=0;
     Scanner leer = new Scanner(System.in);
     System.out.print("1)Agregar alumno\n2)Ver alumnos\nOpcion=");
     op = leer.nextInt();
     if(op==1){
     agregarAlumnos();
     }else if(op==2){
     verAlumnos();
     }else
            System.out.println("Opcion invalida");

    }
}