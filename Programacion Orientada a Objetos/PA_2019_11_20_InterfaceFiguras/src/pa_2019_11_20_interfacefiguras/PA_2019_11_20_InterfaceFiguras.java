/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_20_interfacefiguras;

/**
 *
 * @author aaronaj
 */
public class PA_2019_11_20_InterfaceFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo vicioso = new Circulo(5);
        Rectangulo puerta = new Rectangulo(90,210);
        Triangulo bermudas = new Triangulo(5,8,12);
        
        ICalculosFiguras2D virtuoso = new Circulo(11);
        
        vicioso.setRadio(26);
        
        Circulo c = (Circulo)vicioso;
        c.setRadio(1000);
        
        System.out.println(" Vicioso area ="+vicioso.area()+ " perimetro:"+vicioso.perimetro());
        System.out.println(" Puerta area ="+puerta.area()+ " perimetro:"+puerta.perimetro());
        System.out.println(" Bermudas area ="+bermudas.area()+ " perimetro:"+bermudas.perimetro());
        System.out.println(" Virtuoso area ="+virtuoso.area()+ " perimetro:"+virtuoso.perimetro());
    }
    
}
