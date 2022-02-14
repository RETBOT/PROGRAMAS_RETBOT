#include "archivosdec.h"

ArchivosDeC::ArchivosDeC()
{

}
//leer
void ArchivosDeC::abrir(char *nomArch, char cadenas[][25], int &cant)
{
    FILE *parchivo;
    char *cadena = new char[25];
    int i=0;
    if((parchivo = fopen(nomArch,"r")) == nullptr) // null
        printf("\n ERROR al abrir el archivo. \n");
    else{
        while(!feof(parchivo)){
            printf("\nLeyendo desde el metodo abrir \n");
            while(fgets(cadena,25,parchivo)){
                printf("%s",cadena);
                strncpy(cadenas[i],cadena,sizeof(cadena));
                i++;
                }
            }
        }
    cant = i;
    fclose(parchivo);
}

void ArchivosDeC::abrir(char *nomArch)
{
    FILE *parchivo;
    char *cadena = new char[25];

    if((parchivo = fopen(nomArch,"r"))== nullptr)//NULL
        printf("\n ERROR al abrir el archivo. \n");
    else
    {
    while(!feof(parchivo))
    {
        printf("\nLEYENDO DESDE EL ARCHIVO \n");
        while(fgets(cadena,25,parchivo))
        {
            printf("%s",cadena);
            }
        }
    }
    fclose(parchivo);
}

void ArchivosDeC::guardar(char *nomArch, char cadenas[][25])
{
    FILE *parchivo;
    int i = 0;
    if((parchivo = fopen(nomArch,"w")))  // ESTA IMPLICITO LA COMP. CON NULL
    {
    printf("\nDentro del METODO GUARDAR \n");
    while(strcmp(cadenas[i],"\0") != 0)
    {
    //strcat(cadenas[i],"\n");
        fputs(cadenas[i],parchivo);
        fputs("\n",parchivo);

        puts(cadenas[i]);
        //printf("%s\n",cadenas[i]);
        i++;
        }
    }
    else
    {
    puts("\n ERROR AL ABRIR EL ARCHIVO o EL ARCHIVO NO SE ENCOTRO ");
    }
fclose(parchivo);
}

void ArchivosDeC::agregar(char nomArch[], char cadenas[][25])
{
    FILE *parchivo;
    int i=0;        // esta implicito la t : at+, a+t
    if((parchivo = fopen(nomArch,"a"))){ // != nullptr // esta implicito la comparacion con el null
        printf("\nDentro del metodo agregar\n");
        while(strcmp(cadenas[i],"\0") != 0){
            fputs("\n",parchivo);
            fputs(cadenas[i],parchivo);
            puts(cadenas[i]);
            //printf("%s",cadenas[i]);
            i++;
        }
    }else{
        puts("\nError al abrir el archivo o el archivo no se encontro");
    }
    fclose(parchivo);
}
