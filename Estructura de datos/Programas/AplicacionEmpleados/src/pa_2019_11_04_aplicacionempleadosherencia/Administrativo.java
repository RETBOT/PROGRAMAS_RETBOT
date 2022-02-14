/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_11_04_aplicacionempleadosherencia;

/**
 *
 * @author admin
 */
public class Administrativo extends Empleado{
    private int diasTrabajados;
    private double sueldoDiario;
    
    public Administrativo(){
    super();
    diasTrabajados = 0;
    sueldoDiario = 0;
    }
    public Administrativo(int num, String nom, int diasT, double sueldoD){
    super(num,nom);
    diasTrabajados = diasT;
    sueldoDiario = sueldoD;
    }
    
    // set y get
    public int getDiasTrabajados(){
    return diasTrabajados;
    }
    public double getSueldoDiario(){
    return sueldoDiario;
    }
    
    public void setDiasTrabajados(int diasT){
    diasTrabajados = diasT;
    }
    public void setSueldoDiario(double sueldoD){
    sueldoDiario = sueldoD;
    }
    
    public String toString(){
    return super.toString()+" Dias Trabajados:"+diasTrabajados+" Sueldo Diario:"+sueldoDiario;
    }
    
    public double sueldo(){
    return diasTrabajados*sueldoDiario;
    }
}
