#ifndef LEXICO_H
#define LEXICO_H
#include <iostream>
#include <string>
using namespace std;

#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <cstring>

#define leerCar(i) cadena[i++]
#define retrocederCar i--   // EQUIVALE AL  * EN EL DIAG. DE TRANSICIONES

class Lexico
{
//VARIABLES GLOBALES
    int i, inicioToken, estadoInicial, estadoActual;
    char cadena[255]; // cadena de entrada

public:
    Lexico();
    //PROTOTIPOS
    char *scanner();  //   SCANNER = ANALIZADOR LEXICO
    void setCadena(char cadena[255]); // se pone la cadena

protected:
    void inicializaEstados();
    void fallo();
    bool esLetra(char c);
    bool esDigito(char c);
    bool esDelimitador(char c);
    bool estadoDeAceptacion();
    bool OpRL(char c);
    bool OpAritmetico(char c);

};

#endif // LEXICO_H
