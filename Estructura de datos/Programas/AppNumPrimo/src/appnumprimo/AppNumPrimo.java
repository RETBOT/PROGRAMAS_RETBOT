/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnumprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AppNumPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String numero = " ", opc;
          boolean prim = false;
//        Scanner leer = new Scanner(System.in);
        
        do{
//        System.out.println("Numero:");   
           numero = JOptionPane.showInputDialog("Introduce el numero");
        try{
//         num = leer.nextInt();
        prim = Matematicas.Primo(Integer.parseInt(numero));
          }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error entrada no valida, Mensaje del compilador = "+e.getMessage()
                    +"\nSe asignara un valor por default = 10 ");
                  numero = "10";
        }
        if(prim == true){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es primo");
//            System.out.println("El numero "+numero+" es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es primo");
//            System.out.println("El numero "+numero+" no es primo");
        }
          opc = JOptionPane.showInputDialog(null, "Desea continuar (s/n)");
            //System.out.println("Desea continuar (s/n)");
            //opc = leer.next().charAt(0);
            
         
        }while("s".equals(opc)); 
    }
    
}
