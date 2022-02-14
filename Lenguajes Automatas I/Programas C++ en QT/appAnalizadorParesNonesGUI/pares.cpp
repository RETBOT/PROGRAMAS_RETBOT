#include "pares.h"

Pares::Pares()
{
}

bool Pares::analizarNumero(char *cadena)
{
    char carEntrada;
    int edoActual = 0;
    int i = 0;
    bool band=false;
    while(i < (int)strlen(cadena) && !band){
        switch(edoActual){
        case 0:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
        }break;
        case 1:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
            else{ // otro caracter
                // fin de la cadena o expresion
                edoActual = 3;
                i--; // representa el * o retroceso
            }
        }break;
        case 2:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
        }break;
        case 3:{ // fin de la expresion
            band = true;
        }break;
        }// fin swich
    }// fin while
    return band;
}

bool Pares::esPar(string cadena)
{
    cadena += ";";
    char *cad = new char[cadena.length()];
    strcpy(cad,cadena.c_str());
    if(!analizarNumero(cad)){
        return false;
    }else
        return true;
}
