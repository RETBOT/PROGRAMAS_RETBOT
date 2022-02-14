/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_examen_02;

/**
 *
 * @author admin
 */
class Pintura {

    // Atributos 
    private int tinas;
    private int litros;

    // Constructores
    public Pintura() {  // Constructor 1
        tinas = 0;
        litros = 0;
    }

    public Pintura(int tin, int lit) { // Constructor 2
        tinas = tin;
        litros = lit;
    }

    public Pintura(Pintura p) {  // Constructor de copia 
        tinas = p.tinas;
        litros = p.litros;
    }

    // get/set
    public int getTinas() {
        return tinas;
    }

    public int getLitros() {
        return litros;
    }

    public void setTinas(int tin) {
        tinas = tin;
    }

    public void setLitros(int lit) {
        litros = lit;
    }

    public String toString() {
        return tinas + " tinas " + litros + " litros";
    }

    //metodos de calculo 
    public int litrosTotales() { // Convertir a litros para calcular la pintura usada 
        return (tinas * 19) + litros;
    }

    public Pintura resta(Pintura p) { // Calcular pintura usada en cada casa
        int restaLitros = litrosTotales() - p.litrosTotales();
        int tinas = restaLitros / 19;
        int litros = restaLitros % 19;
        return new Pintura(tinas, litros);
    }

    public Pintura suma(Pintura p) { // Calcular pintura usada en todo el fraccionamiento 
        int sumaLitros = litrosTotales() + p.litrosTotales();
        int tinas = sumaLitros / 19;
        int litros = sumaLitros % 19;
        return new Pintura(tinas, litros);
    }

}
