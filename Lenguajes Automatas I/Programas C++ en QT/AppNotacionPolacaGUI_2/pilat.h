#ifndef PILAT_H
#define PILAT_H

//Template o plantilla o clase generica
template<class T> //T = Tipo de dato
class PilaT
{
    T *vec;
    int tam;
    int tope;
    bool vacia;
    bool llena;
public:
    PilaT(int n=10); // constructor con argumentos por default
    void push(T valor);
    T pop();
    bool estaVacia();
    bool estaLlena();
    int getLength();
    T getTope();
};

#endif // PILAT_H
