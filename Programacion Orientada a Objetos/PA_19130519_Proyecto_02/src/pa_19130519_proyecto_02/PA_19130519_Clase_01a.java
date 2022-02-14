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
class Longitud {

    // Atributos
    private String destino;
    private Distancia dInicial;
    private Distancia dFinal;

    // Constructores 
    // Constructor 1
    public Longitud() {
        destino = "No-ID";
    }
    // Constructor 2
    public Longitud(String des, Distancia ini, Distancia fin) {
        destino = des;
        dInicial = ini;
        dFinal = fin;
    }

    // Metodos getter y setter 
    // Getter 
    public String getDestino() {
        return destino;
    }
    public Distancia getDinicial() {
        return dInicial;
    }
    public Distancia getDfinal() {
        return dFinal;
    }

    // Setter 
    public void setDistancia(String destino) {
        this.destino = destino;
    }
    public void setdInicial(Distancia dInicial) {
        this.dInicial = dInicial;
    }
    public void setDfinal(Distancia dFinal) {
        this.dFinal = dFinal;
    }

    // toString 
    public String toString() {
        return destino + " Destino inicial:" + dInicial + "  Destino final:" + dFinal + "";
    }

    // Metodo de calculo para la distancia recorrida 
    public Distancia distanciaRecorrida() {
        return dFinal.resta(dInicial);
    }
}
