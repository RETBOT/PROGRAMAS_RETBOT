#ifndef PARES_H
#define PARES_H
#include <iostream>
#include <string>

using namespace std;

class Pares
{
    const char Par[6]="02468";
    const char Non[6]="13579";

public:
    Pares();
    bool analizarNumero(char *cadena);
    bool esPar(string cadena);
};

#endif // PARES_H
