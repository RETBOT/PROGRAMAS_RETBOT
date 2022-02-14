#include <iostream>

using namespace std;

void insercionAsc(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;


        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

void insercionDsc(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;


        while (j >= 0 && arr[j] < key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

 void BurbujaDsc(int vec[], int n)
       {
           for (int i = 0; i < n; i++)
           {
               for (int j = n; i < j; j--)
               {
                   if (vec[j - 1] < vec[j])
                   {
                       int aux = vec[j - 1];
                       vec[j - 1] = vec[j];
                       vec[j] = aux;
                   }
               }
           }
       }

 void BurbujaAsc(int vec[], int n)
       {
           for (int i = 0; i < n; i++)
           {
               for (int j = n; i < j; j--)
               {

                   if (vec[j - 1] > vec[j])
                   {
                       int aux = vec[j - 1];
                       vec[j - 1] = vec[j];
                       vec[j] = aux;
                   }
               }
           }
       }

 void quicksortAsc(int *vec, int izq, int der)
         {

             int i,j,pivote,aux;
             i = izq;
             j = der;
             pivote = vec[(izq+der)/2];

             do
             {
                 while (vec[i] < pivote && i < der)
                 {
                     i++;
                 }

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

 void quicksortDsc(int *vec, int izq, int der)
         {

             int i,j,pivote,aux;
             i = izq;
             j = der;
             pivote = vec[(izq+der)/2];

             do
             {
                 while (vec[i] > pivote && i < der)
                 {
                     i++;
                 }

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
                 }
             }while(i <=j);
              if(izq < j)
                 quicksortDsc(vec,izq,j);
             if(i < der)
                 quicksortDsc(vec,i,der);
         }

void printArray(int arr[], int n)
{
    int i;
    for (i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;
}


int main()
{
    int n = 10;
    int *vec = new int[n];
    srand(time_t(NULL));

    for(int i=0;i< n ;i++){
        vec[i] = rand()%900+100;
    }

    cout<<"Datos"<<endl;
    printArray(vec,n);

    cout<<"Metodo insercion Asc"<<endl;
    insercionAsc(vec,n);
    printArray(vec,n);

    cout<<"Metodo insercion Dsc"<<endl;
    insercionDsc(vec,n);
    printArray(vec,n);

    cout<<"Metodo Burbuja Asc"<<endl;
    BurbujaAsc(vec,n-1);
    printArray(vec,n);

    cout<<"Metodo Burbuja Dsc"<<endl;
    BurbujaDsc(vec,n);
    printArray(vec,n);

    cout<<"Metodo Quick Sort Asc"<<endl;
    quicksortAsc(vec,0,n-1);
    printArray(vec,n);

    cout<<"Metodo Quick Sort Dsc"<<endl;
    quicksortDsc(vec,0,n);
    printArray(vec,n);


    return 0;
}
