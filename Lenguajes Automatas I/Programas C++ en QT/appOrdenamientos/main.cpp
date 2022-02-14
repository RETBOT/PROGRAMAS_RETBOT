#include <iostream>
#include "ordenamientos.h"

using namespace std;


void imprimirArreglo(int *vec, int n){
    for(int i=0; i<n; i++)
        cout<<vec[i]<<" ";

    cout<<endl;
}

int main()
{
    //int vec[] = {6,5,3,1,8};//,7,2,4};
    //int n = sizeof(vec) / sizeof (vec[0]);

    const int tam = 100;
    int *vec = new int[tam];
    srand(unsigned(time_t(NULL)));
    Ordenamientos * ordenamiento = new Ordenamientos();

    for(int i=0; i<tam;i++)
        vec[i] = rand()%900+100;

    cout<<"Datos en el arreglo : "<<endl;
    imprimirArreglo(vec,tam);

    int opc = 0;
    cout<<"Modo de ordenamiento \n1.Burbuja\n2.Insercion\n3.Merge Sort\nOpcion: ";
    cin>>opc;

    switch (opc) {
    case 1:
    {
      cout<<"Ordenamiento por burbuja"<<endl;
      ordenamiento->burbuja(vec,tam);
      imprimirArreglo(vec,tam);
      cout<<endl;
      break;
    }
    case 2:
    {
       cout<<"Ordenamiento por insercion"<<endl;
       ordenamiento->insercion(vec,tam);
       imprimirArreglo(vec,tam);
       cout<<endl;
       break;
    }
    case 3:
    {
        cout<<"Ordenamiento por mergeSort"<<endl;
        ordenamiento->mergeSort(vec,0,tam -1);
        imprimirArreglo(vec,tam);
        cout<<endl;
        break;
    }
    default:
        cout<<"Dato invalido"<<endl;
    }

    return 0;
}
