/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_19_aplicacionnomina;

/**
 *
 * @author admin
 */
public class Empleado {
    // atributos
    //son pribados por diseño 
    private String nombre;
    private int diasTrabajados;
    private double sueldoDiario;
    private int horasExtras;
    private double porcentajeImpuesto;
    
    // constructores 
    //son publicos por que son metodos y no recive parametros
    
    public Empleado(){
    nombre = "No-Id";
    diasTrabajados = 0;
    sueldoDiario = 0;
    horasExtras = 0;
    porcentajeImpuesto = 0;
    }
    
    //contructor 2
    public Empleado(String nom, int diasT, double sueDia, int horExt, double porcImp){
    nombre = nom;
    diasTrabajados = diasT;
    sueldoDiario= sueDia;
    horasExtras = horExt;
    porcentajeImpuesto = porcImp; 
    }
    
    //constructor de copia
    public Empleado(Empleado e){
    nombre  = e.nombre;
    diasTrabajados = e.diasTrabajados;
    sueldoDiario = e.sueldoDiario;
    horasExtras = e.horasExtras;
    porcentajeImpuesto = e.porcentajeImpuesto;
    }
    
    // metodo get/set
    public void setNombre(String nom){
    nombre = nom; 
    }
    
    public void setDiasTrabajados(int diasT){
    diasTrabajados = diasT; 
    }
    
    public void setSueldoDiario(double sueDia){
    sueldoDiario = sueDia;
    }
    
    public void setHorasExtrass(int horExt){
    horasExtras = horExt;
    }
    
    public void setPorcentajeImpuesto(double porcImp){
    porcentajeImpuesto = porcImp;
    }
    
   public String getNombre(){
   return nombre; 
   }
   
   public int getDiasTrabajados(){
   return diasTrabajados;
   }
   
   public double getSueldoDiario(){
   return sueldoDiario;
   }
   
   public int getHorasExtras(){
   return horasExtras; 
   }
   
   public double getPorcentajeImpuesto(){
   return porcentajeImpuesto;
   }
  
  public String toString(){
  return nombre+"  DiasTrab: "+diasTrabajados
               +"  SueldoDia: "+sueldoDiario
               +"  HorasExtras: "+horasExtras
               +"  %Impuesto: "+porcentajeImpuesto;
  
  }
    // metodos de calculo 
  public double sueldoBruto(){
  return diasTrabajados*sueldoDiario; 
  }  
  public double importeHorasExtras(){
  return sueldoDiario / 8*2*horasExtras; 
  }
  public double ImporteImpuesto(){
  return (sueldoBruto()+ importeHorasExtras()*porcentajeImpuesto/100);
  } 
  public double sueldo(){
  return sueldoBruto()+importeHorasExtras()-ImporteImpuesto();
  } 
}
