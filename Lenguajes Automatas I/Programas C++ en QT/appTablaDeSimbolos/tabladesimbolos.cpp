#include "tabladesimbolos.h"

TablaDeSimbolos::TablaDeSimbolos(int sz)
{
    if(sz<=0){
        size = 0;
        tabla = NULL;
    }else if((tabla = new Symbol*[size = sz]) != NULL)
        for(int i=0;i<size;i++)
            tabla[i] = NULL;
    else
        size = NULL;
}

//int
SymValue TablaDeSimbolos::Hash(char *cadena)
{
    int slot = 0;        
   // while(*cadena)
     //   slot += *cadena++;

    int i=0;
    while(cadena[i]) // != '\0')
        slot+=cadena[i++];

    return slot % size; // que regresa el metodo
}
/*
 * Al crear una nueva entrada para simbolo (Metodo AddSym)
 * Se requiere que se pueda crear espacio para asignarse a este
 * Se utiliza hash para decidir el espacio donde se debe colocar el simbolo
 * y luego inserta la entrada al frente de la lista enlazada detonada por ese espacio.
 * a un simbolo. Esto determina si la solicitud tuvo exito.
*/


Symbol *TablaDeSimbolos::AddSym(char *cadena, SymValue valor)
{                               // val1                 5
                                // val2                 0
                                // val3                 10
                            // tarea prueba de escritorio con los datos anteriories
    Symbol *sym;
    int slot = Hash(cadena); // indice para el arreglo de punteros
    // que realiza la siguiente instruccion

     if((sym = new Symbol) != NULL && (sym->nombre = new char[strlen(cadena)+1])!=NULL){
         //cout<<sym<<endl;
        // implementar el codigo necesario para insertar un symbolo en la tabla de simbolos
        strcpy(sym->nombre,cadena);
        sym->valor = valor;
        sym->next = tabla[slot];
        tabla[slot] = sym;
        return sym;
    }else{
        delete sym;
        sym = NULL; // = 0
    }
     return sym;
}

Symbol *TablaDeSimbolos::FindSym(char *cadena)
{
    int slot = Hash(cadena);
    Symbol *sym = tabla[slot];
    for( ; sym != NULL ; sym = sym->next){
        if(strcmp(sym->nombre,cadena)==0){
            return sym;
            break;
      }
    }
    return NULL;
}

bool TablaDeSimbolos::removeSym(char *cadena)
{
    int slot = Hash(cadena);
    Symbol *sym = tabla[slot];
    string aux = sym->nombre;

    if(sym && strcmp(sym->nombre,cadena)==0){
        tabla[slot] = sym->next;
        delete sym;
        return true;
    }

    for(sym = tabla[slot]; sym->next; sym = sym->next){
        if(strcmp(sym->next->nombre,cadena)==0){
            Symbol *temp = sym->next;
            sym->next = sym->next->next;
            delete temp;
            return true;
        }
    }
     return false;
}

void TablaDeSimbolos::imprimirTabla()
{
    for(int i=0;i<size;i++){
        for(Symbol *sym = tabla[i]; sym ; sym= sym->next)
            cout<<sym<<setw(20)<<sym->nombre<<setw(10)<<sym->valor<<setw(15)
               <<"Next: "<<hex<<sym->next<<dec<<endl;
    }
}

bool TablaDeSimbolos::setValue(char *cad, SymValue val)
{
    Symbol *simbolo = FindSym(cad);
    if(simbolo == NULL)
        return AddSym(cad,val)!= NULL;
    else
        simbolo->valor = val;
    return true;
}

bool TablaDeSimbolos::getValue(char *cad, SymValue *val)
{
    Symbol *simbolo = FindSym(cad);
    if(simbolo != NULL)
        *val = simbolo->valor;
    return simbolo != NULL;
}
