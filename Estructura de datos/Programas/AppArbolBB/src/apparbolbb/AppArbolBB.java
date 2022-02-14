
package apparbolbb;


public class AppArbolBB {

    public static void main(String[] args) {
        //REALIZAR PRUEBA DE ESCRITORIO Y PUBLICAR FOTO DE SU CUADERNO 
        //EN DISCORD
        int [] vec = {72,35,35,96,29,88,122};//,58,111,16,43,137,55};
        
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda(vec[0]);
        System.out.println("\t 1er. Valor = "+vec[0]);
        
        System.out.println("Datos Insertados en el ArbolBB");
        
        for(int i = 1; i < vec.length; i++) {
            System.out.println("Valor = "+vec[i]);
            arbol.insertarNodo(vec[i]);
        }
        
        System.out.println("RECORRIDO EN INORDEN : ");
        arbol.RecInorden();
        
        System.out.println("RECORRIDO EN PREORDEN : ");
        arbol.RecPreOrden();
        
        System.out.println("RECORRIDO EN POSTORDEN : ");
        arbol.RecPostOrden();
    }
}
