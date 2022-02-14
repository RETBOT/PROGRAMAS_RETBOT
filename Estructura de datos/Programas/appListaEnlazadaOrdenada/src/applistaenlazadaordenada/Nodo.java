/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaenlazadaordenada;

/**
 *
 * @author martinvaldes
 */
public class Nodo 
{

    public int clave;    // se usara para ordenar la lisra enlazada 
    public String producto;
    public double precio;
 
    public Nodo sig;
    
    public Nodo(int c, String pro, double pre, Nodo si)
    {
        clave = c;
        producto = pro;
        precio = pre;
        sig = si;
    }
}

