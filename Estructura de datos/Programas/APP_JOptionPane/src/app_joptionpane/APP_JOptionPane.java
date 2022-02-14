/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class APP_JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Probando el JOptionPane");
        
        String cadenaEnMain = "";
        for(int i = 0; i<args.length;i++)
            cadenaEnMain += args[i];
            cadenaEnMain += " ";
        
        JOptionPane.showMessageDialog(null, cadenaEnMain);
    }
    
}
