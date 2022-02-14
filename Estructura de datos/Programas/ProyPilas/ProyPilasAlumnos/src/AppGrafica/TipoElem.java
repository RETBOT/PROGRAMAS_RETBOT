/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

/**
 *
 * @author friosa
 */
public class TipoElem {
    private String _noCon;
    private String _nombre;
    private int _calif;
    private char _sexo;
    
    public TipoElem(String noCon,String nombre,int calif,char sexo) {
        _noCon = noCon;
        _nombre = nombre;
        _calif = calif;
        _sexo = sexo;
    }
    public TipoElem() {
        // no hago nada
    }

    public String getNoCon() {
        return _noCon;
    }

    public String getNombre() {
        return _nombre;
    }

    public int getCalif() {
        return _calif;
    }
    public char getSexo(){
       return _sexo;
    }
}
