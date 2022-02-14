#ifndef ORDENAMIENTOS_H
#define ORDENAMIENTOS_H


class Ordenamientos
{
public:
    Ordenamientos();
    void burbuja(int *vec, int tam);
    void insercion(int arr[], int n);
    void QuickSortAsc(int *vec, int izq, int der);
    void quicksortAsc(int *vec, int izq, int der);
    void merge(int array[], int const left, int const mid, int const right);
    void mergeSort(int array[], int const begin, int const end);

};

#endif // ORDENAMIENTOS_H
