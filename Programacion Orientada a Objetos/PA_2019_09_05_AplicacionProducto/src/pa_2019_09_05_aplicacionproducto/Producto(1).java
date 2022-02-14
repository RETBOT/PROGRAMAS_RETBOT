/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_05_aplicacionproducto;

/**
 *
 * @author admin
 */
public class Producto {
    // Atributos
    private String descripcion;
    private double costo;
    private double porcUtilidad;
    private double porcDescuento;
    private double porcImpuesto;
    
    // Constructores
    public Producto(){
    descripcion = "No-Id";
    costo = 0;
    porcUtilidad = 0;
    porcDescuento =0;
    porcImpuesto=0;
    }
    public Producto (String desc, double cto, double porcUti, double porcDesc, double porcImp){
    descripcion = desc;
    costo = cto;
    porcUtilidad = porcUti;
    porcDescuento = porcDesc;
    porcImpuesto = porcImp;
    }
    

    // Metodos get/set
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    public void setCosto(double cto) {
        costo = cto;
    }
    public void setPorcUtilidad(double porcUti) {
       porcUtilidad = porcUti;
    }
    public void setPorcDescuento(double porcDesc) {
       porcDescuento = porcDesc;
    }
    public void setPorcImpuesto(double porcImp) {
       porcImpuesto = porcImp;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public double getCosto() {
        return costo;
    }
    public double getPorcUtilidad() {
        return porcUtilidad;
    }
    public double getPorcDescuento() {
        return porcDescuento;
    }
    public double getPorcImpuesto() {
        return porcImpuesto;
    }

    
    // Metodos de calculo 
    public double importeUtilidad(){
    return costo * porcUtilidad / 100;
    }
    
    public double subTotal1(){
    return costo + importeUtilidad();
    }
    
    public double importeDescuento(){
    return subTotal1() * porcDescuento /100;
    }
    
    public double subTotal2(){
        return subTotal1() - importeDescuento();
}
    public double importeImpuesto(){
    return subTotal2() * porcImpuesto/100;
    }
    
    public double precio(){
    return subTotal2() + importeImpuesto();
    }
}