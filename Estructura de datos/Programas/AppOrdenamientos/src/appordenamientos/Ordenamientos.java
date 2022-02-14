/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientos;

import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class Ordenamientos {
    
    int comparaciones, intercambios;
     Numero comp, interc;
    
    public void burbujaDsc(int vec[]){
        
        comparaciones = 0;
        intercambios = 0;  
        
        for(int i = 0;i<vec.length-1;i++){
           for(int j=vec.length-1;j>i;j--){
           comparaciones++;
           
           if(vec[j-1]<vec[j]){
           int aux  = vec[j-1];
           vec[j-1] = vec[j];
           vec[j]   = aux;
           intercambios++;
           }
           }
       }
        System.out.printf("\nNumero de comparaciones = %d",comparaciones);
        System.out.printf("\nNumero de intercambios = %d\n",intercambios);
    }
    
    public void burbujaAsc(int vec[]){
        comparaciones = 0;
        intercambios = 0;
        for(int i = 0;i<vec.length-1;i++){
           for(int j=vec.length-1;j>i;j--){
           comparaciones++;
           
           if(vec[j-1]>vec[j]){
           int aux  = vec[j-1];
           vec[j-1] = vec[j];
           vec[j]   = aux;
           intercambios++;
           }
           }
       }
        System.out.printf("\nNumero de comparaciones = %d",comparaciones);
        System.out.printf("\nNumero de intercambios = %d\n",intercambios);
    }
    
    public void burbujaConSeñalDsc(int vec[]){
        comparaciones = 0;
        intercambios = 0;
        boolean band ;
        int i;
        for(i = 0, band=false; i<vec.length-1 && !band; i++){
 
           band = true;
           for(int j=vec.length-1;j>i;j--){
 
           comparaciones++;
           
           if(vec[j-1]<vec[j]){
           int aux  = vec[j-1];
           vec[j-1] = vec[j];
           vec[j]   = aux;
           intercambios++;
           band = false;
           }
           }
       }
        System.out.printf("\nNumero de comparaciones = %d",comparaciones);
        System.out.printf("\nNumero de intercambios = %d\n",intercambios);
    }
    
    public void burbujaConSeñalAsc(int vec[]){
        comparaciones = 0;
        intercambios = 0;
        int i=0;
        boolean band;
        
        for(i = 0,band=false; i<vec.length-1 && !band; i++){
            
            band = true;
           for(int j=vec.length-1;j>i;j--){
           comparaciones++;
           
           if(vec[j-1]>vec[j]){
           int aux  = vec[j-1];
           vec[j-1] = vec[j];
           vec[j]   = aux;
           intercambios++;
           band=false;
           }
           }
       }
        System.out.printf("\nNumero de comparaciones = %d ",comparaciones);
        System.out.printf("\nNumero de intercambios = %d \n",intercambios);
    }
    
    public void SacudidaAsc(int[] vec)
        {
            int comp, interc;
            comp = interc = 0;
            int a, b, c, d, aux;
            c = 1;
            b = vec.length - 1;
            d = vec.length - 1;
            do
            {
                for (a = d; a >= c; --a)
                {
                    comp++;
                    if (vec[a - 1] > vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        interc++;
                    }
                }
                c = b + 1;
                for (a = c; a < d + 1; ++a)
                {
                    comp++;
                    if (vec[a - 1] > vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        interc++;
                    }
                }
                d = b - 1;
            } while (c <= d);

            System.out.printf("\nNoumero de Comparaciones : %d", comp);
            System.out.printf("\nNoumero de intercambios  : %d\n", interc);

        }
    
     public void SacudidaDsc(int[] vec)
        {
            int comp, interc;
            comp = interc = 0;
            int a, b, c, d, aux;
            c = 1;
            b = vec.length - 1;
            d = vec.length - 1;
            do
            {
                for (a = d; a >= c; --a)
                {
                    comp++;
                    if (vec[a - 1] < vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        interc++;
                    }
                }
                c = b + 1;
                for (a = c; a < d + 1; ++a)
                {
                    comp++;
                    if (vec[a - 1] < vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        interc++;
                    }
                }
                d = b - 1;
            } while (c <= d);

            System.out.printf("\nNo. de Comparaciones : %d", comp);
            System.out.printf("\nNo. de intercambios  : %d\n", interc);
        }

     public void quickSort(int []vec, int izq, int der,Numero compp, Numero intercp)
        {
            comp= new Numero();
            interc = new Numero();
            quicksortAsc(vec,izq,der);
//            quicksortDsc(vec,izq,der);
            
            //System.out.printf("\nNo. de Comparaciones : %d",comp.num);
            //System.out.printf("\nNo. de intercambios  : %d", interc.num);

            compp.num = comp.num;
            intercp.num = interc.num;
            System.out.printf("\nNo. de Comparaciones : %d",compp.num);
            System.out.printf("\nNo. de intercambios  : %d", intercp.num);

        }



                //No. de Comparaciones : 2626
                //No. de intercambios  : 1194
        public void quicksortAsc(int []vec, int izq, int der)
        { 

            int i,j,pivote,aux;
            i = izq;
            j = der;
            pivote = vec[(izq+der)/2];
            //int[] v = { 16,70,4,18,46,25,11,34,58};
            do
            {
            //SE BUSCA UBICAR A LOS DATOS MENORES A LA IZQ
                comp.num++;
                while (vec[i] < pivote && i < der)
                {
                    i++;
                }
           //SE BUSCA UBICAR A LOS DATOS MAYORES A LA DER
                comp.num++;
                while (vec[j] > pivote && j > izq)
                {
                    j--;
                }
                if(i <= j)
                {
                   aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                    i++;
                    j--;
                    interc.num++;
                }
            }while(i <=j);
             if(izq < j)
                quicksortAsc(vec,izq,j);
            if(i < der)
                quicksortAsc(vec,i,der);
        }
        
        public void quicksortDsc(int []vec, int izq, int der)
        { 

            int i,j,pivote,aux;
            i = izq;
            j = der;
            pivote = vec[(izq+der)/2];
            //int[] v = { 16,70,4,18,46,25,11,34,58};
            do
            {
            //SE BUSCA UBICAR A LOS DATOS MAYORES A LA IZQ
                comp.num++;
                while (vec[i] > pivote && i < der)
                {
                    i++;
                }
           //SE BUSCA UBICAR A LOS DATOS MENORES A LA DER
                comp.num++;
                while (vec[j] < pivote && j > izq)
                {
                    j--;
                }
                if(i <= j)
                {
                   aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                    i++;
                    j--;
                    interc.num++;
                }
            }while(i <=j);
             if(izq < j)
                quicksortDsc(vec,izq,j);
            if(i < der)
                quicksortDsc(vec,i,der);

        }
        
        public void shellAsc(int vec [],int n){
        int i,aux;
        boolean band;
        
        int inc = n+1;
        
        while(inc>1){
            inc /= 2;
            band = true;
                while(band){
                band = false;
                i=0;
                    while((i+inc)<=n){
                        if(vec[i] > vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        }
                        i++;
                    }
            }
        }
        }
        
        public void shellDsc(int vec [],int n){
        int i,aux;
        boolean band;
        
        int inc = n+1;
        
        while(inc>1){
            inc /= 2;
            band = true;
                while(band){
                band = false;
                i=0;
                    while((i+inc)<=n){
                        if(vec[i] < vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        }
                        i++;
                    }
            }
        }
        }
        
        public void OrdenamientoP1Asc(int vec [], int n){
        int i=0,menor,k,j;
        int comp=0,interc=0;
        while(i<=n-1){
         
         menor = vec[i];
         k=i;
         
            j=i+1;
            while(j<=n){
                comp++;
            if(vec[j] < menor){
            menor=vec[j];
            k=j;
            interc++;
            vec[k]=vec[i];
            vec[i]=menor;
          
            }
            
             j++;
            }
        i++;
        }
        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P1 Asc : %d",comp);
        System.out.printf("\nNumero de intercambios Ordenamiento examen P1 Asc : %d\n", interc);
        }
        
        public void OrdenamientoP1Dsc(int vec [], int n){
        int i=0,menor,k,j;
        int comp=0,interc=0;
        while(i<=n-1){
         
         menor = vec[i];
         k=i;
         
            j=i+1;
            while(j<=n){
                comp++;
            if(vec[j] > menor){
            menor=vec[j];
            k=j;
            interc++;
            vec[k]=vec[i];
            vec[i]=menor;
            }
            
             j++;
            }
        i++;
        }
        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P1 Asc : %d",comp);
        System.out.printf("\nNumero de intercambios Ordenamiento examen P1 Asc : %d\n", interc);
        }

        
        
        
        public void OrdenamientoP2OP1Asc(int []vec, int ini, int fin){
        int i, dato;
        if(ini < fin){
        OrdenamientoP2OP1Asc(vec, ini+1,fin);
        i = ini;
        dato = vec[i];
        while(dato > vec[i+1] && i < fin){
        vec[i] = vec[i+1];
        i++;
        if(! (i < fin))
        break;
       }
       vec[i] = dato;
        }
       }
        
        public void OrdenamientoP2OP1Dsc(int []vec, int ini, int fin){
        int i, dato;
        if(ini < fin){
        OrdenamientoP2OP1Dsc(vec, ini+1,fin);
        i = ini;
        dato = vec[i];
        while(dato < vec[i+1] && i < fin){
        vec[i] = vec[i+1];
        i++;
        if(! (i < fin))
        break;
       }
       vec[i] = dato;
        }
       }
}
