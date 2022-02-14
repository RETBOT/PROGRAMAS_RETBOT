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
public interface ICalculosFiguras2D {
    public final double PII = 3.141592654; // una interface puede tener atributos pero estos seran automaticamente 
                                           // publicos y constantes aunque no se declaren asi
    
    public abstract double area(); // todos los metodos de una interface son automaticamente
    double perimetro();            // publicos y abstractos, aunque no se declaran asi   
}
