#include "archivo.h"

Archivo::Archivo()
{

}

void Archivo::abrir(char *nomArch,char cadenas[22][255],int &tam) // se manda el nombre del archivo, se guarda lo que esta dentro y el tamaño del archivo
{
    FILE *parchivo; // se crea un puntero archivo
    char *cadena = new char[25]; // un puntero cadena, para escribir lo que esta en la cadena
   int i = 0; // inicio del ciclo
    if((parchivo = fopen(nomArch,"r"))== nullptr)// se abre el archivo, con solo lectrua
        printf("\n ERROR al abrir el archivo. \n"); // si no se puede abrir se manda un error;
    else // si se puede abiri
    {
    while(!feof(parchivo)) // comienza a leer el archivo hasta encontrar una cadena vacía
    {
        while(fgets(cadena,25,parchivo)) // se lee la cadena
        {
            //printf("%s",cadena);
            strcpy(cadenas[i++],cadena); // y se guarda en el arreglo, para despues escribirlo
            }
        }
    }
    tam = i; // se guarda la cantidad de renglones del archivo
    fclose(parchivo); // se cierra el archivo para evitar daños en el mismo
}

void Archivo::guardar(char *nomArch, char cadenas[255]) // se recibe el nombre del archivo y la cadena a guardar
{
    FILE *parchivo; // se crea un puntero archivo
    if((parchivo = fopen(nomArch,"w"))){  // se abre el archivo con escritura
        fputs(cadenas,parchivo); // se inserta la cadena en el archivo
    }else { // si ocurre un error se notifica
        puts("\n ERROR AL ABRIR EL ARCHIVO o EL ARCHIVO NO SE ENCOTRO ");
    }
    fclose(parchivo); // se cierra el archivo para evitar dañarlo
}

