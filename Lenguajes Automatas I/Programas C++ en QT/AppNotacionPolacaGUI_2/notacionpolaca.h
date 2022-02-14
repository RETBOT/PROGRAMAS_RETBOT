#ifndef NOTACIONPOLACA_H
#define NOTACIONPOLACA_H
#include "pilat.h"
#include <string>
#include <string.h>
#include <math.h>
#include "dialog.h"

using namespace std;
#include <iostream>

// para establecer la precedencia de los operadores
enum Simbolo{OPERANDO, PIZQ, PDER, SUMRES, MULDIV, POW};

class NotacionPolaca
{
  int precedencia(char p);
  bool operador(char simbolo);
  char simbolo;
  int pos = 0;

public:
   NotacionPolaca();
   // EI = Exprecion infija
    char *ConvertirAPosFija(string EI);
    // string ConvertirAPosFija
    string ConvertirAPosFijaS(string EI);
    QString ConvertirAPosFijaS(QString EI);

    double resolverPosFija(string Epos);

    Simbolo TipoYPrecedencia(char s);
    int contOperadores(string EI);
    string eliminarEspacio(string EI);
    bool contParentesis(string EI);
    bool seResuelve(string Epos);

    //mio
    void conInfAPos(char *EI, char *EPos);
};

#endif // NOTACIONPOLACA_H
