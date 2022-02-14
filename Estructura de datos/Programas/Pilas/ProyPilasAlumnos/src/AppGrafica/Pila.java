/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;
import java.util.ArrayList;

/**
 * @author friosa
 *
 */
public class Pila {
    ArrayList<TipoElem> _elems;
    int _capacidad;
    
    public Pila() {
        _elems = new ArrayList<>();
        _capacidad = 30;
    }
    
    public Pila(int capacidad) {
        _elems = new ArrayList<>();
        _capacidad = capacidad <= 0 ? 0 : capacidad;
    }
    
    public boolean Full() {
        return _capacidad > 0 && _capacidad == _elems.size();
    }
    
    public boolean Empty() {
        return _elems.isEmpty();
    }
    
    public void Push(TipoElem elem) {
        if (!Full()) 
            _elems.add(elem);
    } 
    
    public TipoElem Pop() {
        if (! Empty()) {
            TipoElem tope = _elems.get(_elems.size()-1);
            _elems.remove(_elems.size()-1);
            return tope;
        } 
        else
            return new TipoElem();
    }
    
    public int Length() {
        return _elems.size();
    }
    
    public TipoElem Tope() {
        return ! Empty() ? _elems.get(_elems.size()-1) : new TipoElem();
    }
    
    public void Vaciar () { 
    _elems.clear();
   }
   
    
   public void AsigTercerAFondo(){
  if(_elems.size()>2){
   TipoElem tercerTope = _elems.get(_elems.size()-3);
  _elems.remove(_elems.size()-3);
  _elems.add(0,tercerTope);
   }
   }
    
   public void DosElemCambioDosFondoaTope(){
   if(_elems.size() > 3){
   TipoElem tope = _elems.get(_elems.size()-1);
   TipoElem tope2 = _elems.get(_elems.size()-2);
   _elems.remove(_elems.size()-1);
   _elems.remove(_elems.size()-2);
   
   _elems.add(0,tope2);
   _elems.add(1,tope);
   }
   }
   
   public void InterSegPenUlti(){
   if(_elems.size() > 3){
   TipoElem penUlt = _elems.get(_elems.size()-2);
   TipoElem seg = _elems.get(1);
   
   _elems.remove(_elems.size()-2);
   _elems.remove(1);
   
   _elems.add(_elems.size()-2,seg);
   _elems.add(1,penUlt);
   }
   }
  
   
   public void DosElementosCambioTopeFondo(){
   if((_elems.size() % 2)==0){
        if(_elems.size()>3){
          TipoElem tope = _elems.get(_elems.size()-1);
          TipoElem tope2 = _elems.get(_elems.size()-2);
          _elems.remove(_elems.size()-1);
          _elems.remove(_elems.size()-2);
          
          _elems.add(tope);
          _elems.add(tope2);  
        }
   }
   }
}
