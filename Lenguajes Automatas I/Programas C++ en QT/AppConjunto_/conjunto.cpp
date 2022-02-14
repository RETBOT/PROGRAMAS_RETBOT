#include "conjunto.h"

Conjunto::Conjunto()
{

}
// presentar una propuesta // considerar que hay 3 posibles resultados
// 0. Excede el tamaño
// 1. Si se puede agregar
// 2. Duplicado

Mensaje Conjunto::agregarElementos(int valor)
{
    /*for(int i=0;i<nelem;i++)
        if(elementos[i] == valor)
           return yaExiste;
     */
    if(pertenece(valor))
        return yaExiste;

     if(nelem<MAX){
        elementos[nelem++] = valor;
        return ok;
     }else
         return overflow;
}

Mensaje Conjunto::operator + (int valor)
{
    if(pertenece(valor))
        return yaExiste;

     if(nelem<MAX){
        elementos[nelem++] = valor;
        return ok;
     }else
         return overflow;
}

bool Conjunto::pertenece(const int valor)
{
    for(int i=0;i<nelem;i++)
        if(elementos[i] == valor)
            return true;

    return false;
}

void Conjunto::borrarElemento(int valor,bool &resu)
{
    for(int i=0;i<nelem;i++){
        if(elementos[i] == valor){
            for(;i<nelem;i++)
                    elementos[i] = elementos[i+1];
            nelem--;
            resu = true;
        }else
             resu = false;
    }

}

bool Conjunto::operator - (int valor)
{
    for(int i=0;i<nelem;i++)
        if(elementos[i] == valor){
            for(;i<nelem;i++)
                    elementos[i] = elementos[i+1];
            nelem--;
            return true;
        }

       return false;

}

void Conjunto::mostrarElementos(string set)
{
    cout<<"Conjunto "<<set<<" = ";
    cout<<"{";
    int i;
    for(i=0;i<nelem-1;i++)
        cout<<elementos[i]<<" , ";

    if(nelem>0)
        cout<<elementos[i];

    cout<<"}"<<endl;
}

void Conjunto::copiar(Conjunto *set)
{
    set->nelem = this->nelem;
    for(int i=0; i<this->nelem; i++)
        set->elementos[i] = this->elementos[i];
}

bool Conjunto::esIgual(Conjunto *set) const
{
    if(this->nelem != set->nelem)
        return false;

    for(int i=0;i<nelem;i++)
        if(!set->pertenece(elementos[i]))
            return false;
    return true;
}

bool Conjunto::operator == (Conjunto *set) const
{
    if(this->nelem != set->nelem)
        return false;

    for(int i=0;i<nelem;i++)
        if(!set->pertenece(elementos[i]))
            return false;
    return true;
}

void Conjunto::Interseccion(const Conjunto *set1, Conjunto *set2)
{
    set2->nelem=0;
    for(int i=0;i<this->nelem;i++)
        for(int j=0; j<set1->nelem; j++){
            if(this->elementos[i] == set1->elementos[j]){
                set2->elementos[set2->nelem++] = this->elementos[i];
                break; // ??? se requiere, si
           }
        }
}

// mensaje = set1.union(&set1

Mensaje Conjunto::Union(Conjunto &set1, Conjunto &set2)
{
    this->copiar(&set2);
    for(int i=0;i<set1.nelem;i++)
        if(set2.agregarElementos(set1.elementos[i]) == overflow)
            return overflow;
        return ok;
}



