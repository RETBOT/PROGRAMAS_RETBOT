
#include <iostream>
using namespace std;
#include <stdio.h>

struct Nodo
{
  int info;
  Nodo *sig;
};

int main( )
{
  int i;
  Nodo lista, *nodo;
  lista.sig = NULL; //Lista vacia
  nodo = &lista; //Apunta al inicio de la lista
  nodo->info = 124;
  for(i = 0; i <= 5; i++)
  {
   //Asignar memoria dinamica
    nodo->sig = new Nodo;
    nodo = nodo->sig;
    nodo->info = i;
    nodo->sig = NULL;
  }
  //DIRECCION FISICA DE lista , se obtiene con &lista

  printf("Dir de lista : %p , lista.sig = %p", &lista, lista.sig);

  //Mostar la lista Nota: & = direccion 
  //Le asigna a la & nodo la & de lista.sig 0 
  //posiciona el nodo al inicio lista
  nodo = lista.sig;
  while(nodo) // Mientras no sea NULL
  {
    //cout<<endl<<"CON cout "<<endl;
    //cout <<"Dir: "<<hex<<&nodo->sig <<dec<<" valor: "<<nodo->info<<endl;
    //cout<<"con printf "<<endl;
// %p PERMITE MOSTRAR LA DIRECCION DE LOS PUNTEROS
    printf("\nDir: %p  -> Valor: %d  -> SIG : %p ",nodo, nodo->info, nodo->sig);
    nodo = nodo->sig;
  }
  delete nodo;

  return 0;
}
