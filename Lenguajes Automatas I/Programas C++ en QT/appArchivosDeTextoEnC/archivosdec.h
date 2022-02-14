#ifndef ARCHIVOSDEC_H
#define ARCHIVOSDEC_H
#include <stdio.h>
#include <cstring>
#include <string.h>

class ArchivosDeC
{
public:
    ArchivosDeC();
    void abrir(char *nomArch, char cadenas[50][25],int &cant);
    void abrir(char *nomArch);
    void guardar(char *nomArch, char cadenas[50][25]);
    void agregar(char nomArch[], char cadena[50][25]);
};

#endif // ARCHIVOSDEC_H
