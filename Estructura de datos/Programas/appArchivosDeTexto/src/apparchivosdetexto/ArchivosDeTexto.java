
package apparchivosdetexto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivosDeTexto {
    
    // investigar el funcionaiento de throws
    public static void guardarArchivo(String nomArch)throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter salida = null; //escribir en archivo de texto
        try{
        salida = new PrintWriter(nomArch);
        String cad; //Cadena
        System.out.println("INTRODUCE TEXTO. Para terminar teclea . (PUNTO)");
        cad = sc.nextLine();
        while(!cad.equals(".")){
        salida.println(cad); //mandamos la cadena al arachivo 
        cad = sc.nextLine();
        }
        salida.flush(); // investigar los metodos de PrintWirter
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{ // se invoca a finally para cerrar el archivo
        salida.close(); // es obligatorio cerrar los archivos 
        } 
    }
    
        public static void agregarArchivo(String nomArch)throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter salida = null; //escribir en archivo de texto
        FileWriter archivo = null;
        try{
        archivo = new FileWriter(nomArch,true); // esto permite agregar al final del archivo 
        salida = new PrintWriter(nomArch);
        String cad; //Cadena
        System.out.println("INTRODUCE TEXTO. Para terminar teclea . (PUNTO)");
        cad = sc.nextLine();
        while(!cad.equals(".")){
        salida.println(cad); //mandamos la cadena al arachivo 
        cad = sc.nextLine();
        }
        salida.flush();
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{ // se invoca a finally para cerrar el archivo
        salida.close(); // es obligatorio cerrar los archivos 
        } 
    }
        
        public static void leerArchivo(String nomArch){
        File file = new File(nomArch);
        int cant = 0; // cantidad 
        String cad; //cadena
        Scanner sc = null;
        try{
        sc = new Scanner(file);
        while(sc.hasNext()){
        cad = sc.nextLine();
            System.out.println(cad);
            cant++;
        }
            System.out.println("Numero de lineas en el archivo : "+cant);
        }catch(FileNotFoundException e){
            System.out.println("Mensaje del compilador "+e.getMessage());
        }finally{
            sc.close();
        }
        
        }
}
