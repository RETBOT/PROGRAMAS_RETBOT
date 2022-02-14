
// EVALUACION: REALIZAR UNA PRUEBA DE ESCRITORIO LA APP.
// MUESTRE SU FUNCIONAMIENTO
// INDIQUE QUE TAREA RESUELVE
// DOCUMENTE LOS METODOS

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
    // tarea para el domingo 28: agregara esta app los metodos de ordenamiento burbuja y quick
    // implementar las alternativas ascendente y descendente

    //	int arr[] = { 12, 11, 13, 5, 6 };
    //asignar 500 datos aleatorios a arr
    // mostrar la candtidad de intercambios y movimientos
    // comparar este resultado con la burbuja y el quick

    int arr[500]; //arreglo estatico
    // final (java) = const (c++)
    int n = 500;
    //cout<<"Cuantos datos: ";
    //cin>>n;
    int *vec = new int[n]; // define un arreglo dinamico

    srand(time_t(NULL)); // investigar el parametro de time //s de Seed
                        // Establece la semilla que std::rand() usará para generar números pseudo-aleatorios.

    for(int i=0;i< n ;i++){
        vec[i] = rand()%900+100;  // que valor devuelve rand()
                                  // Devuelve un valor entero entre 0 y RAND_MAX (ambos incluidos)
                                  // distribuyendo los valores de manera homogénea, esto significa que
                                  // cualquier número dentro de dicho rango tiene las mismas probabilidades
                                  // de ser escogido (1 probabilidad entre RAND_MAX).
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
    BurbujaAsc(vec,n);
    printArray(vec,n);

    cout<<"Metodo Burbuja Dsc"<<endl;
    BurbujaDsc(vec,n);
    printArray(vec,n);

    cout<<"Metodo Quick Sort Asc"<<endl;
    quicksortAsc(vec,0,n);
    printArray(vec,n);

    cout<<"Metodo Quick Sort Dsc"<<endl;
    quicksortDsc(vec,0,n);
    printArray(vec,n);

    return 0;

    /* En java, cuando hacemos ventanas, la clase que decide cómo se reparten los botones
     * (Y demás controles) dentro de la ventana se llama Layout.
     * Esta clase es la que decide en qué posición van los botones y demás componentes,
     * si van alineados, en forma de matriz, cuáles se hacen grandes al agrandar la ventana,
     * etc. Otra cosa importante que decide el Layout es qué tamaño es el ideal para la
     * ventana en función de los componentes que lleva dentro.
     * Con un layout adecuado, el método pack() de la ventana hará que coja el tamaño
     * necesario para que se vea todo lo que tiene dentro.
     * ventana.pack();
     * Las ventanas vienen con un Layout por defecto.
     * En java hay varios layouts disponbiles y podemos cambiar el de defecto por el que
     * queramos.
    */
}






