#ifndef LEXICO_H
#define LEXICO_H
#include <iostream>
#include <string>
using namespace std;

#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <cstring>

#define leerCar(indice) cadena[indice++]
#define retrocederCar indice--   // EQUIVALE AL  * EN EL DIAG. DE TRANSICIONES
#define MAXTOKEN 100
#define NUMPALRES 4

class lexico
{
    int indice, inicioToken, estadoInicial, estadoActual,k;
    char cadena[255]; // cadena de entrada
    char non[6]="13579", par[6]="24680";
    char asTokens [MAXTOKEN][100];
    char PalRes[5][10]= {"char", "float","int","puts"}; //printf

    char sLexema[127];
    char sLinea[127];
public:
    lexico();
    //PROTOTIPOS
    void vanalisislexico();  //   SCANNER = ANALIZADOR LEXICO
    void setCadena(char cadena[255]); // se pone la cadena
    char *getTokens();
protected:
    void inicializaEstados();
    void fallo();
    void recuperaerror();
    bool estadoDeAceptacion();
    int esId();
};

#endif // LEXICO_H
