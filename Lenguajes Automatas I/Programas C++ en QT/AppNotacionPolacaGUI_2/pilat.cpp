#include "pilat.h"
/*
template<class T>
PilaT<T>::PilaT()
{
}
*/

template<class T>
PilaT<T>::PilaT(int n)
{
    tam = n;
    vec = new T[tam];
    tope = 0;
    vacia = true;
    llena = false;
}

template<class T>
void PilaT<T>::push(T valor)
{
    vacia = false;
    vec[tope++] = valor;
    if (tope == tam)
        llena = true;
}

template<class T>
T PilaT<T>::pop()
{
    /*if (--tope == 0)
          vacia = true;
    */
     llena = false;
     if (--tope == 0)
      {
       vacia = true;
        //  return vec[tope];
       }
       if (tope == -1)
           tope = 0;
  return vec[tope];
}

template<class T>
bool PilaT<T>::estaVacia()
{
    return vacia;
}

template<class T>
bool PilaT<T>::estaLlena()
{
    return llena;
}

template<class T>
int PilaT<T>::getLength()
{
    return tope - 1;
}

template<class T>
T PilaT<T>::getTope()
{
   return vec[tope - 1];
}


