#include "ordenamientos.h"

Ordenamientos::Ordenamientos()
{

}

void Ordenamientos::burbuja(int *vec, int tam)
{
    for(int i = 0;i<tam-1;i++){
               for(int j=tam-1;j>i;j--){
                if(vec[j-1]>vec[j]){
                    int aux  = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j]   = aux;
                  }
               }
    }
}

void Ordenamientos::insercion(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key )
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}


void Ordenamientos::QuickSortAsc(int *vec, int izq, int der)
{
    quicksortAsc(vec,izq,der);
}

void Ordenamientos::quicksortAsc(int *vec, int izq, int der)
{
    int i,j,pivote,aux;
    i = izq;
    j = der;
    pivote = vec[(izq+der)/2];
    do
    {
    //SE BUSCA UBICAR A LOS DATOS MENORES A LA IZQ
        while (vec[i] < pivote && i < der)
        {
            i++;
        }
   //SE BUSCA UBICAR A LOS DATOS MAYORES A LA DER
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
        }
    }while(i <=j);
     if(izq < j)
        quicksortAsc(vec,izq,j);
    if(i < der)
        quicksortAsc(vec,i,der);
}

// Fusiona dos subarreglos de array [].
// El primer subarreglo es arr [begin..mid]
// El segundo subarreglo es arr [mid + 1..end]
void Ordenamientos::merge(int array[], const int left, const int mid, const int right)
{
    auto const subArrayOne = mid - left + 1;
    auto const subArrayTwo = right - mid;

    // Crea matrices temporales
    auto *leftArray = new int[subArrayOne],
         *rightArray = new int[subArrayTwo];

    // Copiar datos a matrices temporales leftArray [] y rightArray []
    for (auto i = 0; i < subArrayOne; i++)
        leftArray[i] = array[left + i];
    for (auto j = 0; j < subArrayTwo; j++)
        rightArray[j] = array[mid + 1 + j];

    auto indexOfSubArrayOne = 0, // Índice inicial de la primera submatriz
        indexOfSubArrayTwo = 0; // Índice inicial de la segunda submatriz
    int indexOfMergedArray = left; // Índice inicial de matriz combinada

    // Fusionar las matrices temporales de nuevo en la matriz [izquierda .. derecha]
    while (indexOfSubArrayOne < subArrayOne && indexOfSubArrayTwo < subArrayTwo) {
        if (leftArray[indexOfSubArrayOne] <= rightArray[indexOfSubArrayTwo]) {
            array[indexOfMergedArray] = leftArray[indexOfSubArrayOne];
            indexOfSubArrayOne++;
        }
        else {
            array[indexOfMergedArray] = rightArray[indexOfSubArrayTwo];
            indexOfSubArrayTwo++;
        }
        indexOfMergedArray++;
    }
    // Copia los elementos restantes de
    // izquierda [], si hay alguna
    while (indexOfSubArrayOne < subArrayOne) {
        array[indexOfMergedArray] = leftArray[indexOfSubArrayOne];
        indexOfSubArrayOne++;
        indexOfMergedArray++;
    }
    // Copia los elementos restantes de
    // derecha [], si hay alguna
    while (indexOfSubArrayTwo < subArrayTwo) {
        array[indexOfMergedArray] = rightArray[indexOfSubArrayTwo];
        indexOfSubArrayTwo++;
        indexOfMergedArray++;
    }
}

// begin es para el índice izquierdo y end es
// índice derecho de la submatriz
// de arr a ordenar * /
void Ordenamientos::mergeSort(int array[], const int begin, const int end)
{
    if (begin >= end)
        return; // Vuelve recursivamente

    auto mid = begin + (end - begin) / 2;
    mergeSort(array, begin, mid);
    mergeSort(array, mid + 1, end);
    merge(array, begin, mid, end);
}




