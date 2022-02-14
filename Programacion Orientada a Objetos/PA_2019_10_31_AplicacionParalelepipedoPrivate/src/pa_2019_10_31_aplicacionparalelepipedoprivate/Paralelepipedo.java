/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_31_aplicacionparalelepipedoprivate;

/**
 *
 * @author admin
 */
public class Paralelepipedo extends Rectangulo {

    protected double profundidad;

    public Paralelepipedo() {
        super();
        profundidad = 0;
    }

    public Paralelepipedo(double bas, double alt, double prof) {
        super(bas, alt);
        profundidad = prof;
    }

    public void setProfundidad(double prof) {
        profundidad = prof;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public String toString() {
        return super.toString() + " Profundidad:" + profundidad;
    }

    public double volumen() {
        return super.area() * profundidad;
    }

    public double area() {
        return 2 * (super.area() + profundidad * (getBase() + getAltura()));
    }
}
