#ifndef ARCHIVO_H
#define ARCHIVO_H
#include <stdio.h>
#include <cstring>
#include <string.h>
#include <string>

class archivo
{
public:
    archivo();
    void abrir(char *nomArch,char cadenas[22][255],int &tam); // metodo abriir archivo
    void guardar(char *nomArch, char cadenas[255]); // metodo guardar texto en archivo
};

#endif // ARCHIVO_H
