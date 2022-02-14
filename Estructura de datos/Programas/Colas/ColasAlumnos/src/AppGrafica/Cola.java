/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class Cola {
    private ArrayList<TipoElem> _elems;
    private int _capacidad;
    
    public Cola() {
        _elems = new ArrayList<>();
        _capacidad = 0;  // cola sin limites
    }
    public Cola(int dimension) {
        _elems = new ArrayList<>();
        _capacidad = dimension > 0? dimension : 0;
    }
    public boolean Empty() {
        return _elems.isEmpty();
    }
    public boolean Full() {
        return _capacidad > 0 && _elems.size() == _capacidad;
    }
    public int Length() {
        return _elems.size();
    }
    public void Insert(TipoElem elem) {
        if (!Full()) 
            _elems.add(elem);
    }
    public TipoElem Remove() {
       return !Empty()? _elems.remove(0) : new TipoElem();
    }
    
    //eliminar al ultumo elemento de la clase cola
    public TipoElem ElimiUltimo(){ 
       if(_elems.size() == 1) {
       return _elems.remove(_elems.size());
       }
      return new TipoElem(); 
    }
    
    //eliminar a todos menos al segundo y al penultimo
    public void Examen(){
     if(_elems.size()>2)
        _elems.remove(0);
     if(_elems.size()>1)
        _elems.remove(_elems.size()-1);
     while(_elems.size() > 2) 
        _elems.remove(1);
     }
    public void ElimiPSPUU(){
    if(_elems.size()>4){
    while(_elems.size()>4)
        _elems.remove(2);
    }
    }
    
}
        
    
    
    
    

