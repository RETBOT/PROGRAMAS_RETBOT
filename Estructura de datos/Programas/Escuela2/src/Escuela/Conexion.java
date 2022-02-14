/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executor;
import javax.swing.JOptionPane;

/**
 *
 * @author aRoberto Esquivel Troncoso 
 */
public class Conexion {
    public Connection conexion=null;
    public Statement sentencia;
    public ResultSet resultado;
          
    public void ConectarBasedeDatos(String bd){
    try {
        String Controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(Controlador);
        String url = "jdbc:sqlserver://localhost:1433;"; 
        String url2 = "jdbc:sqlserver://localhost:1433;"+bd;
        if(bd.equals("")){
        conexion = DriverManager.getConnection(url,"usuarioSQL","123"); //url, usuario, contraseña
        }else{
        conexion = DriverManager.getConnection(url2,"usuarioSQL","123"); //url, usuario, contraseña
        }
        sentencia = conexion.createStatement();
        
        
         }catch (ClassNotFoundException | SQLException ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    
   
    public void DesconectarBasedeDatos() {
    try {
    if (conexion != null ) {
    if(sentencia != null) {
    sentencia.close();
    }
    conexion.close();
    }
    }
    catch (SQLException ex) {
    JOptionPane.showMessageDialog(null,ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
    System.exit(1);
   }
  }     
}
    
    

