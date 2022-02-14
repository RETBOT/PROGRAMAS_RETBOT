#ifndef CONJUNTO_H
#define CONJUNTO_H

#include <iostream>
using namespace std;

#include <string.h>

const int MAX = 20; // ENUM HACK
    // por default inicia en 0
//Tipo de dato enum (enumerados)
enum Mensaje{overflow, ok, yaExiste};

class Conjunto
{// private
    int elementos[MAX]; //int *elementos;
    int nelem=0;

public:
    Conjunto();
    ~Conjunto(){cout<<"\nEntrada el destructor";}
    //Vaciar
    void vacio(){nelem=0;}// Metodo incline

    // agregar
    Mensaje agregarElementos(int val);
    Mensaje operator + (int val);

    bool pertenece(const int val);

    // borrar
    void borrarElemento(int val, bool &resu);
    bool operator - (int val);

    void mostrarElementos(string set);

    void copiar(Conjunto *c);

    // Igual
    bool esIgual(Conjunto *c)const;
    bool operator == (Conjunto *c) const;

    void Interseccion(const Conjunto *set1, Conjunto *set2);

    Mensaje Union(Conjunto &set1, Conjunto&set2);



};

#endif // CONJUNTO_H
