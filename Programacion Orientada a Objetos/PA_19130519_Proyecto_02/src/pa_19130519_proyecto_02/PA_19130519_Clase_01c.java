/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_02;

import java.util.Random;

/**
 *
 * @author admin
 */
 class Destino {
    //Destinos en Torreón 
    static Random azar = new Random();
  
    static String [] destinos = {"Trabajo","Escuela","Coca-Cola","WalMart","Soriana"
                                ,"HEB","Abastos","Tec Laguna","4 Caminos","Sal si puedes",
                                "Cimaco","Galerias","Feria de torreón","Cristo de las Noas"
                                ,"Museo Arocena","Plaza Mayor","Bosque Venustiano",
                                 "Museo de la Revolución","Casa del Cerro","Wet-Laguna"
                                ,"Plaza del Eco","Bosque Urbano","Parque Morelos",
                                "Parque Fundadores","Plaza de la Tortuga","Planetario"
                                ,"Plaza de armas","La alameda","Dunas de Bilbao"};
    
    public static String nextDestinos(){
    return destinos[azar.nextInt(destinos.length)];
    }
}
