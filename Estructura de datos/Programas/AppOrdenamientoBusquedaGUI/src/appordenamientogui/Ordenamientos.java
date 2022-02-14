/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientogui;

import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class Ordenamientos {
    
    int comparaciones, intercambios;
     Numero comp, interc;
    
    public void burbujaDsc(int vec[],JLabel comp,JLabel inter){
        
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
        comp.setText(comparaciones+"");
        inter.setText(intercambios+"");
        System.out.printf("\nNumero de comparaciones burbuja descendente = %d",comparaciones);
        System.out.printf("\nNumero de intercambios burbuja descendente = %d\n",intercambios);
    }
    
    public void burbujaAsc(int vec[],JLabel comp,JLabel inter){
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
        comp.setText(comparaciones+"");
        inter.setText(intercambios+"");
        System.out.printf("\nNumero de comparaciones burbuja ascendente = %d",comparaciones);
        System.out.printf("\nNumero de intercambios burbuja ascendente = %d\n",intercambios);
    }
    
    public void burbujaConSeñalDsc(int vec[],JLabel comp,JLabel inter){
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
        comp.setText(comparaciones+"");
        inter.setText(intercambios+"");
        System.out.printf("\nNumero de comparaciones burbuja con señal descendente = %d",comparaciones);
        System.out.printf("\nNumero de intercambios burbuja con señal descendente  = %d\n",intercambios);
    }
    
    public void burbujaConSeñalAsc(int vec[],JLabel comp,JLabel inter){
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
        comp.setText(comparaciones+"");
        inter.setText(intercambios+"");
        System.out.printf("\nNumero de comparaciones burbuja con señal asendente = %d ",comparaciones);
        System.out.printf("\nNumero de intercambios burbuja con señal ascendente = %d \n",intercambios);
    }
    
    public void SacudidaAsc(int[] vec,JLabel compa,JLabel inter)
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

            compa.setText(comp+"");
            inter.setText(interc+"");
            System.out.printf("\nNo. de Comparaciones sacudida ascendente : %d", comp);
            System.out.printf("\nNo. de intercambios sacudida ascendente  : %d\n", interc);

        }
    
     public void SacudidaDsc(int[] vec,JLabel compa,JLabel inter)
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
 
            compa.setText(comp+"");
            inter.setText(interc+"");
            System.out.printf("\nNo. de Comparaciones sacudida descendente : %d", comp);
            System.out.printf("\nNo. de intercambios sacudida descendente : %d\n", interc);
        }

     public void QuickSortAsc(int []vec, int izq, int der,Numero compp, Numero intercp,JLabel compa,JLabel inter)
        {
            comp= new Numero();
            interc = new Numero();
            quicksortAsc(vec,izq,der);

            compp.num = comp.num;
            intercp.num = interc.num;
            
            compa.setText(compp.num+"");
            inter.setText(intercp.num+"");
            System.out.printf("\nNumero de Comparaciones QuickSortAsc : %d",compp.num);
            System.out.printf("\nNumero de intercambios QuickSortAsc : %d\n", intercp.num);

        }

     public void QuickSortDsc(int []vec, int izq, int der,Numero compp, Numero intercp,JLabel compa,JLabel inter)
        {
            comp= new Numero();
            interc = new Numero();
            quicksortDsc(vec,izq,der);
           
            compp.num = comp.num;
            intercp.num = interc.num;
            
            compa.setText(compp.num+"");
            inter.setText(intercp.num+"");
            
            System.out.printf("\nNumero de Comparaciones QuickSortDsc : %d",compp.num);
            System.out.printf("\nNumero de intercambios QuickSortDsc : %d\n", intercp.num);

        }

        public void quicksortAsc(int []vec, int izq, int der){ 
            int i,j,pivote,aux;
            i = izq;
            j = der;
            pivote = vec[(izq+der)/2];
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
        
        public void quicksortDsc(int []vec, int izq, int der){ 
            int i,j,pivote,aux;
            i = izq;
            j = der;
            pivote = vec[(izq+der)/2];
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
        
        public void shellAsc(int vec [],int n,JLabel compa,JLabel inter){
        int i=0,aux;
        boolean band;
        int comp, interc;
            comp = interc = 0;
        int inc = n+1;
        
        while(inc>1){
            inc /= 2;
            band = true;
                while(band){
                band = false;
                i=0;
                    while((i+inc)<=n){
                        comp++;
                        if(vec[i] > vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        interc++;
                        }
                        i++;
                    }
            }
        }
            compa.setText(comp+"");
            inter.setText(interc+"");
            System.out.printf("\nNumero de Comparaciones shellAsc : %d",comp);
            System.out.printf("\nNumero de intercambios shellAsc : %d\n", interc);
        }
        
        public void shellDsc(int vec [],int n, JLabel compa,JLabel inter){
        int i=0,aux;
        int comp, interc;
            comp = interc = 0;
        boolean band;
        int inc = n+1;
        
        while(inc>1){
            inc /= 2;
            band = true;
                while(band){
                band = false;
                i=0;
                    while((i+inc)<=n){
                        comp++;
                        if(vec[i] < vec[i+inc]){
                        aux = vec[i];
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        interc++;
                        }
                        i++;
                    }
            }
        }
        compa.setText(comp+"");
        inter.setText(interc+"");
        
        System.out.printf("\nNumero de Comparaciones shellDsc : %d",comp);
        System.out.printf("\nNumero de intercambios shellDsc : %d\n", interc);
        }
        
        public void OrdenamientoP1Asc(int vec [], int n, JLabel compa,JLabel inter){
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
        compa.setText(comp+"");
        inter.setText(interc+"");
        
//        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P1 Asc : %d",comp);
//        System.out.printf("\nNumero de intercambios Ordenamiento examen P1 Asc : %d\n", interc);
        }
        
        public void OrdenamientoP1Dsc(int vec [], int n, JLabel compa,JLabel inter){
        int i=0,mayor,k,j;
        int comp=0,interc=0;
        while(i<=n-1){
         
         mayor = vec[i];
         k=i; 
            j=i+1;
            while(j<=n){
                comp++;
                   if(vec[j] > mayor){
                      mayor=vec[j];
                      k=j;
                      interc++;
                      vec[k]=vec[i];
                      vec[i]=mayor;
                    }
             j++;
            }
        i++;
        }
         compa.setText(comp+"");
        inter.setText(interc+"");
        
        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P1 Dsc : %d",comp);
        System.out.printf("\nNumero de intercambios Ordenamiento examen P1 Dsc : %d\n", interc);
        }
        
        public void OrdenamientoP2OP1Asc(int []vec, int ini,int fin,Numero comp,Numero interc,JLabel compa,JLabel inter){
        comp.num = 0;
        interc.num = 0;
        int i=0, dato;
        if(ini < fin){
        OrdenamientoP2OP1Asc(vec, ini+1,fin,comp,interc,compa,inter);
        i = ini;
        dato = vec[i];
        
        while(dato > vec[i+1] && i < fin){
            comp.num++;
            interc.num++;
            vec[i] = vec[i+1];
            i++;
            if(! (i < fin))
              break;
           }
           vec[i] = dato;
        }
        
        compa.setText(comp.num+"");
        inter.setText(interc.num+"");
        
        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P2 Asc %d : %d",(i+1),comp.num);
        System.out.printf("\nNumero de intercambios Ordenamiento examen P2 Asc %d : %d\n",(i+1), interc.num);
       }
         
        public void OrdenamientoP2OP1Dsc(int []vec, int ini, int fin,Numero compp, Numero intercc,JLabel compa,JLabel interc){
        compp.num = 0;
        intercc.num = 0;
        int i=0, dato;
        if(ini < fin){
        OrdenamientoP2OP1Dsc(vec,ini+1,fin,compp,intercc,compa,interc);
        i = ini;
        dato = vec[i];
        
        while(dato < vec[i+1] && i < fin){
            compp.num++;
            intercc.num++;
            vec[i] = vec[i+1];
            i++;
            if(! (i < fin))
              break;
        }
       vec[i] = dato;
        }
        
        compa.setText(compp.num+"");
        interc.setText(intercc.num+"");
        
        System.out.printf("\nNumero de Comparaciones Ordenamiento examen P2 Dsc  %d : %d",(i+1),compp.num);
        System.out.printf("\nNumero de intercambios Ordenamiento examen P2 Dsc %d : %d\n",(i+1),intercc.num);
       }
}
        

