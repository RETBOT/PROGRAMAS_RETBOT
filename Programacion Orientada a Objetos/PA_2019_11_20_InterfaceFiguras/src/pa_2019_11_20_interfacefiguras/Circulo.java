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
public class Circulo implements ICalculosFiguras2D{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
        return PII * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return PII * radio * 2;
    }  
}
