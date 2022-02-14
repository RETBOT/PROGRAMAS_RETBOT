#ifndef TABLADESIMBOLOS_H
#define TABLADESIMBOLOS_H

#include <iostream>
#include <iomanip>
using namespace std;

// se define uin alias
typedef int SymValue;

// Lista enlazada
struct Symbol{
  char *nombre;
  SymValue valor;
  Symbol *next;
};

class TablaDeSimbolos{
private:
    Symbol **tabla;
    int size;
    int Hash(char *);

public:
    TablaDeSimbolos(int);
    Symbol *AddSym(char *, SymValue);
    Symbol *FindSym(char *);
    bool removeSym(char *);
    void imprimirTabla();

    bool setValue(char *cad, SymValue val);
    bool getValue(char *cad, SymValue *val);
};

#endif // TABLADESIMBOLOS_H
