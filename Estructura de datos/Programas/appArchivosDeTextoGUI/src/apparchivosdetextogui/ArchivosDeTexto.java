
package apparchivosdetextogui;
import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArchivosDeTexto {
    
    // investigar el funcionaiento de throws
    public static void guardarArchivo(String nomArch,JTextArea jt)throws IOException{

        PrintWriter salida = null; //escribir en archivo de texto
        try{
        salida = new PrintWriter(nomArch);
        salida.println(jt.getText());
        salida.flush(); // investigar los metodos de PrintWirter
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{ // se invoca a finally para cerrar el archivo
        salida.close(); // es obligatorio cerrar los archivos 
        }      
    }
    
        public static void agregarArchivo(String nomArch,JTextArea jt)throws IOException{
       
        PrintWriter salida = null; //escribir en archivo de texto
        FileWriter archivo = null;
        try{
        archivo = new FileWriter(nomArch,true); // esto permite agregar al final del archivo 
        salida = new PrintWriter(nomArch);
       
        salida.println(jt.getText());
        
        salida.flush();
        
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{ // se invoca a finally para cerrar el archivo
        salida.close(); // es obligatorio cerrar los archivos  
            }
        }
        
        public static void leerArchivo(String nomArch,JTextArea jt){
        File file = new File(nomArch);
        int cant = 0; // cantidad 
        String cad; //cadena
        Scanner sc = null;
        try{
        sc = new Scanner(file);
        while(sc.hasNext()){
        cad = sc.nextLine();
        jt.setText(cad);
            cant++;
        }
            System.out.println("Numero de lineas en el archivo : "+cant);
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Mensaje del compilador "+e.getMessage());
        }finally{
            sc.close();
        }
        
        }
}
