/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_10_11_aplicacionmatriz;

/**
 *
 * @author admin
 */
public class Matriz {
private double [][] datos;

public Matriz(){
datos = new double[1][1];
}

public Matriz(int ren, int col){
if(ren>0&&col>0)
    datos = new double[ren][col];
else
    datos = new double[1][1];
}

public Matriz(double [][] d){
    datos = new double[d.length][d[0].length];
    for (int r = 0; r < d.length; r++) 
        for(int c=0;c<d[0].length;c++)
        datos[r][c] = d[r][c];
}

public void setValor(double valor, int ren, int col){
   if(ren>=0&&ren<datos.length && col>=0&&col<datos[0].length)
    datos[ren][col] = valor;
}

public double getValor(int ren, int col){
   if(ren>=0&&ren<datos.length && col>=0&&col<datos[0].length)
    return datos[ren][col];
   else 
    return 0; 
}
//cuantos rebglones 
public int getRenglones(){
return datos.length;
}
//cuantas comlumnas 
public int getColumnas(){
return datos[0].length;
}

public void mostrar(){
    for (int r = 0; r < getRenglones(); r++) 
    {
        for (int c = 0; c < getColumnas(); c++) 
            System.out.print(datos[r][c]+"\t");
        System.out.println();
    }
     System.out.println();

}
public Matriz suma(Matriz m){
// En este metodo se inviluctan 3 objetos de la clase Matriz
    // 1. El que manda a llamar el metodo (this)
    // 2. El que llega como parametro (m)
    // 3. El que resulta de sumar this + m
    
    if (getRenglones()!=m.getRenglones() || getColumnas() != m.getColumnas())
        return new Matriz();
    
    //si se puede hacer la suma 
    Matriz s = new Matriz(getRenglones(),getColumnas());
    
    for (int r = 0; r < getRenglones() ; r++) {
        for (int c = 0; c < getColumnas() ; c++) {
            s.setValor(getValor(r,c) + m.getValor(r,c), r, c);
        }
    }
    return s;
    }
public Matriz resta(Matriz m){
// En este metodo se inviluctan 3 objetos de la clase Matriz
    // 1. El que manda a llamar el metodo (this)
    // 2. El que llega como parametro (m)
    // 3. El que resulta de resta this + m
    
//    if (getRenglones()!=m.getRenglones() || getColumnas() != m.getColumnas())
//        return new Matriz();
//    
    //si se puede hacer la resta 
//    Matriz res = new Matriz(getRenglones(),getColumnas());
////    
//    for (int r = 0; r < getRenglones() ; r++) {
//        for (int c = 0; c < getColumnas() ; c++) {
//            res.setValor(getValor(r,c) - m.getValor(r,c), r, c);
//        }
////    }
    
//    return res;
return suma(m.multiplicacion(-1));  
}


  public Matriz multiplicacion(Matriz m){
     //En este metodo se inviluctan 3 objetos de la clase Matriz
    // 1. El que manda a llamar el metodo (this)
    // 2. El que llega como parametro (m)
    // 3. El que resulta de multiplicar this + m (mult)
   
      if(getColumnas()!=m.getRenglones())   //no se pueden multiplicar 
          return new Matriz();
      
      // si se pueden multiplicar 
      Matriz mult = new Matriz(getRenglones(),m.getColumnas());
      
      double suma;
      
      for(int r=0; r< getRenglones();r++)
          for(int c=0; c<m.getColumnas(); c++)
          {
            suma = 0;
            for(int k=0; k<getColumnas();k++)
            suma += getValor(r,k) * m.getValor(k,c);
            
            mult.setValor(suma,r,c);
          }
          return mult;
  }



   public Matriz multiplicacion(double escalar){
   // En este metodo se involucran 2 objetos de la clase Matriz 
   // 1. El que manda a llamar al metodo (this)
   // 2. EL que resulta de multiplicar this * escalar (m)
   
     Matriz m = new Matriz(getRenglones(),getColumnas());
     
       for (int r = 0; r < getRenglones(); r++) {
           for (int c = 0; c <getColumnas() ; c++) {
             m.setValor(getValor(r,c) * escalar, r,c);
           }
       }
       return m;
   }
   
}
