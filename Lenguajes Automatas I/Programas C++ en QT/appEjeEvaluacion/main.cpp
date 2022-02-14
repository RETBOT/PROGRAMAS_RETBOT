#include <iostream>
#include <cstring>
//#include <string.h>

using namespace std;

bool esMinuscula(char c){
    //if(c>='a' && c<='z') //if(c>=97 && c<=122)
    //    return true;
    //return false;
    return (c>='a' && c<='z');
}

bool esMayuscula(char c){
    return (c>='A' && c<='Z');
}

void aMayusculas(char *cad){
    int dif = 'a' - 'A';
    //for(int i=0; cad[i] != '\0';i++) // forma explicita
    for(int i=0; cad[i]; i++) // forma implicita
        if(esMinuscula(cad[i]))
           // cad[i] -= 32;
            cad[i] -= dif;
}

void aMinusculas(char *cad){
    int dif = 'a' - 'A';
    for(int i=0; cad[i] != '\0';i++) // forma explicita
    //for(int i=0; cad[i]; i++) // forma implicita
        if(esMayuscula(cad[i]))
            cad[i] += dif;
}


// 1.- Realice las modificaciones necesarias al método Burbuja para que permita ordenar
// cadenas

//utilice las funciones para cadenas vistas en tutorials point
// utilice la app de la evaluacion
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

void BurbujaAsc(char vec[][25], int n)
{
    int comp = 0;
    int interc = 0;
    for (int i = 0; i < n-2; i++)
    {
        for (int j = n - 1; i < j; j--)
             {
              comp++;
              if(strcmp(vec[j-1],vec[j]) > 0) //if (vec[j - 1] > vec[j])
                  //strcmp(s1, s2);
                  //Devuelve 0 si s1 y s2 son iguales;
                  //menor que 0 si s1 < s2;
                  //mayor que 0 si s1 > s2.
              {
                  char aux[25];
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

// 2.- Agregue un método para buscar una cadena. El método deberá devolver si o no lo
//encontró y en caso de encontrarlo regresará la posición.

int Busqueda(char vec[][25], int n, char *dato){
    int i=0;
    int pos=-1;
    while(pos == -1 && i < n){
        if((strcmp(vec[i],dato))==0){
            //strcmp(s1, s2);
            //Devuelve 0 si s1 y s2 son iguales;
            pos = i;
        }else
            i++;
    }
    return pos;
}

int main()
{
    char nombres [10][25] = {"Roberto","Rafael","Carlos","Juan","Alberto",
                             "Alma","Rosa","Maria","Eliu","Esau"};

    char apellidos[10][25] = {"Esquivel","Medina","Ciseña","Ruiz","Rios",
                             "Alcala","Castañeda","Perez","Hidalgo","Flores"};

    cout<<"Nombres en el arreglo bidimensional "<<endl;
    for(int i=0; i<10; i++)
    {
        strcat(nombres[i]," ");
        strncat(nombres[i],apellidos[i],sizeof(nombres[i])); // concatena los apellidos a los nombres
        cout<<nombres[i]<<endl;
    }

    char opcion;
    do{
    int opc;
    cout<<"\n1.Convertir a minusculas\n2.Convertir a MAYUSCULAS\n3.Ordenar Descendente\n4.Ordenar Ascendente\n5.Buscar nombre\nOpcion:";
    cin>>opc;
    /*
    implemente los metodos necesarios para convertir las letras minusculas en los nombres
|   */
    switch(opc){
    case 1:{
    for(int i=0; i<10; i++)
        aMinusculas(nombres[i]);

    cout<<"Nombres en el arreglo bidimensional en minusculas"<<endl;
    for(int i=0; i<10; i++)
        cout<<nombres[i]<<endl;
    break;
    }
    case 2:{
    for(int i=0; i<10; i++)
        aMayusculas(nombres[i]);

    cout<<"Nombres en el arreglo bidimensional en MAYUSCULAS"<<endl;
    for(int i=0; i<10; i++)
        cout<<nombres[i]<<endl;
    break;
    }
    case 3:{
    cout<<"\nBurbuja Descendente";
    BurbujaDsc(nombres,10);
    for(int i=0; i<10; i++)
        cout<<nombres[i]<<endl;
    break;
    }
    case 4:{
    cout<<"\nBurbuja Ascendente";
    BurbujaAsc(nombres,10);
    for(int i=0; i<10; i++)
        cout<<nombres[i]<<endl;
    break;
    }
    case 5:{
    char dato[25];
    for(int i=0; i<10; i++)
        cout<<nombres[i]<<endl;

    cout<<"Busqueda de nombre"<<endl;
    cout<<"Ingresa el nombre a buscar:";
    cin>>dato;

    int resu = Busqueda(nombres,10,dato);
    if(resu != -1){
        cout<<"Nombre encontrado en la posicion "<<resu+1<<endl;
        for(int i=0; i<10; i++)
            cout<<i+1<<"."<<nombres[i]<<endl;
    }
    else
        cout<<"Nombre no encontrado"<<endl;
    break;
    }
    default:
        cout<<"Dato erroneo"<<endl;
    }

    cout<<"Desea continuar (s/n): ";
    cin>>opcion;
    cin.get(); // Para deshacer el enter que esta en el buffer
    //opcion = tolower(opcion);
    }while(strchr("Ss",opcion));

    return 0;
}



