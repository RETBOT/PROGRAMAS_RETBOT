package pa_2019_09_30_aplicaciontriangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Triangulo {
    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;
    
public Triangulo(){
puntoA= new Punto();
puntoB = new Punto();
puntoC = new Punto();
}

public Triangulo(Punto a, Punto b, Punto c){
puntoA= new Punto(a);
puntoB = new Punto(b);
puntoC = new Punto(c);
}

public void setPuntoA(Punto a){
puntoA = new Punto(a);
}

public void setPuntoB(Punto b){
puntoB = new Punto(b);
}

public void setPuntoC(Punto c){
puntoC = new Punto(c);
}

public Punto getPuntoA(){
 return new Punto (puntoA);
}

public Punto getPuntoB(){
return new Punto(puntoB);
}

public Punto getPuntoC(){
return new Punto(puntoC);
}


public String toString(){
return "A"+puntoA.toString()+" B"+puntoB.toString()+" C"+puntoC.toString();
}

public double lado1(){
return puntoA.distancia(puntoB);
}

public double lado2(){
return puntoB.distancia(puntoC);
}

public double lado3(){
return puntoC.distancia(puntoA);
}

public double perimetro(){
return lado1()+ lado2() + lado3();
}

public double area(){
double s = perimetro()/2;
return Math.sqrt(s* (s - lado1()) * (s - lado2()) * (s - lado3()));
}

public Triangulo semejante(){
Punto mAB = puntoA.medio(puntoB);
Punto mBC = puntoB.medio(puntoC);
Punto mAC = puntoA.medio(puntoC);
return new Triangulo(mAB,mBC,mAC);
}

}
