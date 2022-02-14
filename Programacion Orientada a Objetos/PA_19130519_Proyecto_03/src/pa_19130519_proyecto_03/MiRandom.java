/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_03;

import java.util.Random;

/**
 *
 * @author admin
 */
public class MiRandom extends Random {

    private String[] desc = {}; 

    public MiRandom() {
        super(); //manda a llamar al constructor del random 
    }

    public MiRandom(int semilla) {
        super(semilla);
    }

    public String nextNombre() {
        return desc[nextInt(desc.length)];
    }

    
    public int nextInt(int ini, int fin){
    return ini+ nextInt(fin-ini+1);
    }
    
    public int nextInt(int ini, int fin,int multiplo){
    return nextInt(ini/multiplo,fin/multiplo)*5;
    }
    
    public double nextInt(int ini, int fin,double multiplo){
    return nextInt((int) (ini/multiplo), (int)(fin/multiplo))*5;
    }    
}
