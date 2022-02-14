/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_12_06_leertextograbarbinario;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author admin
 */
public class PA_2019_12_06_LeerTextoGrabarBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       Scanner leer = new Scanner(System.in);
//       
//        String archivoTexto, archivoBinario; 
//        
//        System.out.println("Archivo de texto a leer: ");
//        archivoTexto = leer.next();
//        
//        System.out.println("Archivo de binario a grabar: ");
//        archivoBinario = leer.next();
//        
        JFileChooser jfch = new JFileChooser();
        
        if(jfch.showOpenDialog(jfch)!=0);
        System.exit(0);
        
        File archivoTexto = jfch.getSelectedFile();
        
        if(jfch.showSaveDialog(jfch)!=0)
            System.exit(0);
        
        
        // clases para lectura de archivos de texto 
        FileReader fr = null;
        BufferedReader br = null;
        
        // clases ára escritura de archivos binarios 
        FileOutputStream fos = null; 
        DataOutputStream dos = null;
        
        try {
            fr = new FileReader(archivoTexto);
            br = new BufferedReader(fr);
            
            fos = new FileOutputStream(jfch.getSelectedFile());
            dos = new DataOutputStream(fos);
            
            int n = Integer.parseInt(br.readLine());
            
            dos.writeInt(n);
            
            String nombre;
            char grupo;
            int edad;
            double calif;
            
            for(int i=1; i<=n;i++){
            nombre = br.readLine();
            grupo = br.readLine().charAt(0);
            edad = Integer.parseInt(br.readLine());
            calif = Double.parseDouble(br.readLine());
            
            dos.writeUTF(nombre);
            dos.writeChar(grupo);
            dos.writeInt(edad);
            dos.writeDouble(calif);
            }
                  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PA_2019_12_06_LeerTextoGrabarBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PA_2019_12_06_LeerTextoGrabarBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                try {
                    if(dos!=null)
                    dos.close();
                    
                    if(fos!=null)
                        fos.close();
                    
                    if(br!=null)
                        br.close();
                    
                    if(fr!=null)
                        fr.close();
                    
            } catch (IOException ex) {
                Logger.getLogger(PA_2019_12_06_LeerTextoGrabarBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
