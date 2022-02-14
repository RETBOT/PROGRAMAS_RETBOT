#include <iostream>
#include <string>
#include "archivosdec.h"
using namespace std;

//copiar el metodo de burbuja que ordena cadenas
void BurbujaDsc(char vec[][25], int n)
{
    int comp = 0;
    int interc = 0;
    for (int i = 0; i < n-2; i++)
    {
        for (int j = n - 1; i < j; j--)
             {
              comp++;
              if(strcmp(vec[j-1],vec[j])<0) //if (vec[j - 1] < vec[j])
                  // strcmp(s1, s2);
                  // Devuelve 0 si s1 y s2 son iguales;
                  // menor que 0 si s1 < s2;
                  // mayor que 0 si s1 > s2.
               {
                  char *aux = new char[25]; // aux de tamaño 25
                  strcpy(aux,vec[j-1]); //aux = vec[j - 1];
                  strcpy(vec[j - 1],vec[j]); //vec[j - 1] = vec[j];
                  strcpy(vec[j],aux);//vec[j] = aux;
                  interc++;
                  }
                }
            }
      printf("\nNo. de Comparaciones : %d ",comp);
      printf("\nNo. de intercambios  : %d \n", interc);
}


int main()
{
    // copiar el arreglo de nombres que se uso en el examen
    char nombres [10][25] = {"Roberto","Rafael","Carlos","Juan","Alberto",
                             "Alma","Rosa","Maria","Eliu","Esau"};
    char apellidos[10][25] = {"Esquivel","Medina","Cisena","Ruiz","Rios",
                             "Alcala","Castaneda","Perez","Hidalgo","Flores"};

    for(int i=0;strcmp(nombres[i],"\0") != 0;i++){// nombres[i]
        cout<<nombres[i]<<endl;
    }

    string nomArchivo, path;

    cout<<"Nombre del archivo (sin extencion) : ";
    getline(cin,nomArchivo,'\n');
    nomArchivo += ".txt";

    path = "C:\\Users\\admin\\Desk\\";
    path += nomArchivo;

    ArchivosDeC archivo; // objeto estatico
    //ArchivosDeC *archivo1 = new ArchivosDeC(); // objeto dinamico

    // como se capturo con string hay que cambiarlo a char[]

    char narch[100];
    strncpy(narch, path.c_str(), sizeof(narch));
    archivo.guardar(narch,nombres);

    //cout<<"Datos en el archivo : nombres.txt"<<endl;
    //archivo.abrir(narch);

    char nomsEnArchivo[50][25]; // para dejar en este arreglo los datos del archivo
    int cantNombres;
    archivo.abrir(narch,nomsEnArchivo,cantNombres);
    cout<<"\nNombres en el arreglo bidimensional "<<endl;
    for(int ren = 0; strcmp(nomsEnArchivo[ren],"\0")!=0; ren++)
        cout<<"Nombre ["<<ren<<"] : "<<nomsEnArchivo[ren];

    // probar el metodo agregar
    string path2 = "C:\\Users\\admin\\Desk\\";
    path2 +="nombres.txt";

    char narch2[100];
    strncpy(narch2, path.c_str(), sizeof(narch));

    archivo.agregar(narch2,apellidos);

    archivo.abrir(narch2,nomsEnArchivo,cantNombres);
    cout<<"\nNombres agregados en el arreglo bidimensional "<<endl;
    for(int ren = 0; strcmp(nomsEnArchivo[ren],"\0")!=0; ren++)
        cout<<"Nombre ["<<ren<<"] : "<<nomsEnArchivo[ren];

    // ordenar los nombres del archivo
     BurbujaDsc(nomsEnArchivo,cantNombres);

    // mostrar los nombres ordenados
     cout<<"Nombres ordenados"<<endl;
     for(int ren = 0; strcmp(nomsEnArchivo[ren],"\0")!=0; ren++)
         cout<<"Nombre ["<<ren<<"] : "<<nomsEnArchivo[ren];


    return 0;
}
