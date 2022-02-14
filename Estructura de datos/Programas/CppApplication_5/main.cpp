/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: admin
 *
 * Created on 12 de diciembre de 2020, 06:39 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;


/*
 * 
 */

class nodo_lista
{
int dato;
nodo_lista *sig;
public:
nodo_lista(int d);
void inserta_s(nodo_lista *nodo);
void muestra();
};

nodo_lista::nodo_lista(int d)
{
dato = d;
sig = NULL;
}

void nodo_lista::inserta_s(nodo_lista *nodo)
{
if(sig == NULL) //0
{
sig = nodo;
nodo->sig = NULL;//0
}
/*else {
nodo->sig = sig;
sig = nodo;
}*/
}

void nodo_lista::muestra()
{
nodo_lista *p1;
p1 = this;
while(p1 != 0)
{
cout<<p1->dato<<" ";
p1 = p1->sig;
}
cout<<'\n';
}

int main(int argc, char **argv)
{
nodo_lista *p = new nodo_lista(5);
nodo_lista *n= p;
for(int i = 0; i < 5;i++)
{
nodo_lista *o = new nodo_lista(i*i);
n->inserta_s(o);
n = o;
}
p->muestra();
n->muestra();
return 0;
}