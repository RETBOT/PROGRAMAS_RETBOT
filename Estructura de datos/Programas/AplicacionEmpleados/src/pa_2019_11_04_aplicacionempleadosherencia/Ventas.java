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
public class Ventas extends Empleado{
    private double importeVentas;
    private double comision;
    
    public Ventas(){
    super();
    importeVentas = 0;
    comision = 0;
    }
    public Ventas(int num, String nom, double impVentas, double comision){
    super(num,nom);
    importeVentas = impVentas;
    this.comision = comision;
    }
    
    public double getImporteVentas(){
    return importeVentas;
    }
    public double getComision(){
    return comision;
    }
    
    public void setImporteVentas(double impVentas){
    importeVentas = impVentas;
    }
    public void setComision(double comision){
    this.comision = comision;
    }
    
    public String toString(){
    return super.toString()+" Ventas $"+importeVentas+" %Comisión"+comision;
    }
    
    public double sueldo(){
    return importeVentas*comision / 100;
    }
}
