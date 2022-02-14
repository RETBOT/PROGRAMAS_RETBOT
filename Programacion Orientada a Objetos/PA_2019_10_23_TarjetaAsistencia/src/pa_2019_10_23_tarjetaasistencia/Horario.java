/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_23_tarjetaasistencia;

/**
 *
 * @author admin
 */
public class Horario {
private int horas;
private int minutos;
private int segundos;

public Horario(){
horas =0;
minutos =0;
segundos =0;
}

public Horario(int h,int m, int s){
horas = h;
minutos = m;
segundos = s; 
}

public Horario(Horario h){
horas = h.horas;
minutos = h.minutos;
segundos = h.segundos;
}

//get/set
public int getHoras(){
return horas;
}
public int getMinutos(){
return minutos;
}
public int getSegundos(){
return segundos;
}

public void setHoras(int h){
horas=h;
}
public void setMinutos(int m){
minutos = m;
}
public void setSegundos(int s){
segundos =s;
}

public String toString(){
return horas+"h:"+minutos+"m:"+segundos+"s";
}


//metodos de calculo 
public int segundosTotales(){
return horas * 3600 + minutos * 60 + segundos;
}

public Horario suma(Horario h){
int sumaSeg = segundosTotales() + h.segundosTotales();

int hor = sumaSeg/3600; //div 
int restoSeg = sumaSeg% 3600; //mod 
int min = restoSeg/60; //div
int seg = restoSeg%60; //mod 

return new Horario(hor,min,seg);
}

public Horario resta(Horario h){
int restaSeg = segundosTotales() - h.segundosTotales();

int hor = restaSeg/3600; //div 
int restoSeg = restaSeg% 3600; //mod 
int min = restoSeg/60; //div
int seg = restoSeg%60; //mod 

return new Horario(hor,min,seg);
}
}