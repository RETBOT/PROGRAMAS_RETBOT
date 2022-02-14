/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_proyecto_02;

/**
 *
 * @author admin
 */
class Ordenar {

    //atributo
    Longitud[] lista;

    //Constructor
    public Ordenar(int n) {
        lista = new Longitud[n];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Longitud();
        }
    }

    //poner un objeto dentro del arreglo
    //index = posición 
    public void setRuta(Longitud e, int index) {
        lista[index] = e;
    }
    public Longitud getLongitud(int index) {
        return lista[index];
    }

    // Datos ordenados
    public void ordenarDescendente() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].distanciaRecorrida().pulgadasTotales() < lista[j].distanciaRecorrida().pulgadasTotales()) {
                    Longitud aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
        public void ordenar() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].distanciaRecorrida().pulgadasTotales() > lista[j].distanciaRecorrida().pulgadasTotales()) {
                    Longitud aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
   // Ordenar datos alfabéticamente 
    public void ordenarAlfabetico() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].getDestino().compareTo(lista[j].getDestino()) > 0) {
                    Longitud aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
}