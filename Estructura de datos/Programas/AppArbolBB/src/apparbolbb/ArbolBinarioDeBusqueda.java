
package apparbolbb;


public class ArbolBinarioDeBusqueda {
    Nodo raiz;
    
    public ArbolBinarioDeBusqueda(int valor){
          raiz = new Nodo(valor);
        }
    
    // insertar hijos, izquierda = menores, derecha = mayores
    public void nuevoNodo(Nodo nodo, int valor){
       if(nodo != null){
           if(valor < nodo.dato){
              if(nodo.izquierdo == null){
                  nodo.izquierdo = new Nodo(valor);
              }else{
                  nuevoNodo(nodo.izquierdo, valor);
              }     
           }else if(valor > nodo.dato){
               if(nodo.derecho == null){
                   nodo.derecho = new Nodo(valor);
               }else{
                   nuevoNodo(nodo.derecho,valor);
               }
           }else{
               System.out.println(" ERROR, NO SE ACEPTAN DATOS DUPLICADOS");
           }
       }else{
           nodo = new Nodo(valor);
       }
    }
    
    public void insertarNodo(int valor){
        nuevoNodo(this.raiz,valor);
    }
    
    public void RecInorden(){
        inorden(raiz);
    }
    
    public void RecPreOrden(){
        preorden(raiz);
    }
    
    public void RecPostOrden(){
        postOrden(raiz);
    }
    
    public void inorden(Nodo nodo){
        if(nodo != null){
            inorden(nodo.izquierdo);
            System.out.println(nodo.dato+"  ");
            inorden(nodo.derecho);
        }
    }
    
    public void preorden(Nodo nodo){
        if(nodo != null){
            System.out.println(nodo.dato+"  ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }
    
    public void postOrden(Nodo nodo){
        if(nodo != null){
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.println(nodo.dato+"  ");
        }
    }
}
