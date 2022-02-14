/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppunto;

/**
 *
 * @author admin
 */
public class Punto {
    // Atributos de la clase punto 
    private int x;
    private int y;

    public Punto(){
    x = 0;
    y = 0;
    }

    public Punto(int x,int y){
    this.x = x;
    this.y = y;
    }
    
    public Punto(Punto p){ //constructor de copia 
    x = p.x;
    y = p.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double Distancia(Punto p){
    return Math.sqrt(Math.pow(p.x-x, 2)+Math.pow(p.y-y,2));
    }
}
