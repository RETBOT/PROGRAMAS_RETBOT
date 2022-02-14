#include <iostream>
#include <string>
using namespace std;

#include <string.h>
#include <stdlib.h>
#include <Windows.h>

#include <stdio.h>
#include <cstring>


// MACROS DE C/C++
#define leerCar(i) cadena[i++]
#define retrocederCar i--   // EQUIVALE AL  * EN EL DIAG. DE TRANSICIONES

//PROTOTIPOS
void scanner(char cadena[255]);  //   SCANNER = ANALIZADOR LEXICO
void inicializaEstados();
void fallo();
void error(char *ex, char car);
bool esLetra(char c);
bool esDigito(char c);
bool esDelimitador(char c);
bool estadoDeAceptacion();
bool OpRL(char c);
bool OpAritmetico(char c);

//VARIABLES GLOBALES
int i, inicioToken, estadoInicial, estadoActual;

int main()
{
    /*

    do
    {
        cout<<"\nCADENA A ANALIZAR : ";  //   a       =0;
        getline(cin,cadenaS,'\n');

        cadenaS+=";"; // Falta

        strcpy(cadenaC,cadenaS.c_str());
        //cout<<"\nCADENA DE ENTRADA : "<<cadenaC<<endl;
        scanner(cadenaC);
        //cout<<"\nANALIZAR OTRA CADENA (s/n) : ";
        //cin>>opcion;
        //cin.get();// PARA ELIMINAR EL ENTER
        //cin.ignore();
        //fflush(stdin);

    }while(!strchr("@",cadenaC[0]));


     //------------------------------------------------------------------------------------------------------------
    char cadenaC[255][255];
    string cadenaS;
    //char opcion;
    cout<<" ; Para terminar"<<endl;
    int i = 0;
    do{
         cout<<"CADENA A ANALIZAR : ";
         getline(cin,cadenaS,'\n');
         cadenaS+=";"; // Falta
         strcpy(cadenaC[i++],cadenaS.c_str());
    }while(!strchr(";",cadenaC[i-1][0]));
    for(int j=0; j<i-1; j++){
        cout<<"\nCadena analizada : "<<cadenaC[j];
          scanner(cadenaC[j]);
          cout<<endl;
    }
     //------------------------------------------------------------------------------------------------------------
    */

    /*
    cout<<"Simulador de un editor (Para terminar -espacio y enter en la linea nueva- ) : "<<endl;
    string cadenaS = " a";
    char opcion;
    int i;
    char _cadenas[22][255];
    for(i=0; i<22;i++){
        cout<<i+1<<" : ";
        getline(cin,cadenaS,'\n');
        strcpy(_cadenas[i],cadenaS.c_str());
        if(strcmp(_cadenas[i]," ")==0) // si es Enter, C++ lo cambia por cadena vacia
            break;
    }
    int indice = 0;
    while(indice < i){
        scanner(_cadenas[indice++]);
        cout<<"\n------------------------"<<endl;
    }*/

    char otro = 'n';
    string nomArchivo, path;
    char cadenas[22][255];
    int i=0, indice =0;
    int fin[22];


    do{
    cout<<"------Menu------"<<endl;
    cout<<"1.Escribir codigo"<<endl;
    cout<<"2.Abrir codigo de un archivo"<<endl;
    cout<<"Opcion-->";
    int opcMenu;
    cin>>opcMenu;
    cin.ignore();

    switch(opcMenu){
    case 1:{
        cout<<"Simulador de un editor (Para terminar -espacio y enter en la linea nueva- ) : "<<endl;
        string cadenaS = " ";
        int i;
        char _cadenas[22][255];
        for(i=0; i<22;i++){
            cout<<i+1<<" : ";
            getline(cin,cadenaS,'\n');
            strcpy(_cadenas[i],cadenaS.c_str());
            if(strcmp(_cadenas[i]," ")==0) // si es Enter, C++ lo cambia por cadena vacia
                break;
        }
        int indice = 0;
        while(indice < i){
            scanner(_cadenas[indice++]);
            cout<<"\n------------------------"<<endl;
        }
    }break;
    case 2:{
        cout<<"Nombre del archivo (sin extension) : ";
        getline(cin,nomArchivo,'\n');
        nomArchivo += ".txt";
        path = "C:\\Users\\admin.ROBERTO\\Desk\\";
        path += nomArchivo;
        char narch[100];
        strncpy(narch, path.c_str(), sizeof(narch));

        FILE *parchivo;
        char *cadena = new char[25];

            if((parchivo = fopen(narch,"r"))== nullptr)//NULL
                printf("\n ERROR al abrir el archivo. \n");
            else
            {
            while(!feof(parchivo))
            {
                printf("\nLEYENDO ARCHIVO %s \n",narch);
                int j=1;
                while(fgets(cadena,25,parchivo))
                {
                    printf("%d : %s",j++,cadena);
                    fin[i] = strlen(cadena);
                    strcpy(cadenas[i++],cadena);
                    }
                }
            }
            fclose(parchivo);


            cout<<"\n\n------------------------"<<endl;
            while(indice < i){
                bool tiene = false;
                cout<<endl;
                for(int j=fin[indice]; j>=0; j--){
                    char car =cadenas[indice][j];
                    if(car == ';'){
                       tiene = true;
                       break;
                    }
                }

                if(tiene){
                    scanner(cadenas[indice++]);
                }else{
                   error((char *)"Falta",';');
                    indice++;
                }
                //
                cout<<"\n------------------------"<<endl;
            }
    }break;
        default:cout<<"Opcion invalida"<<endl;
    }


    cout<<"\nANALIZAR OTRA CADENA (s/n) : ";
    cin>>otro;
    cin.get();
    }while(strchr("Ss",otro));
    return 0;
}

void scanner(char cadena[255])
{
    char caracter;
    inicializaEstados();
    //VARIABLES GLOBALES
    i = inicioToken = 0;
    bool errorBand = false;
    while((i < (int)strlen(cadena) || estadoDeAceptacion()) && !errorBand)
    {
        switch(estadoActual)
        {
        case 0: caracter = leerCar(i); // lee el caracter
            if(esDelimitador(caracter)) // si es delimitador pasa al estado 1
                estadoActual = 1;
            else // si no entra al fallo y pasa al estado 3
                fallo();
            break; // fin estado 0

        case 1: caracter = leerCar(i); // lee el caracter
            if(esDelimitador(caracter)) // si es delimitador se queda en el estado 1
                estadoActual = 1;
            else // si no pasa al estado 2
                estadoActual = 2;
            break; // fin estado 1

        case 2: retrocederCar;  // Decrementa la i en 1
            cout<<"Delimitador"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i;// pone el valor de i en token
            break;    // fin estado 2

        case 3: caracter = leerCar(i); // lee el caracter de entrada
            if(esLetra(caracter) || caracter == '_') // si es letra o _ pasa al estado 4
                estadoActual = 4;
            else // si no entra al fallo y pasa al estado 6
                fallo();
            break; // fin estado 3

        case 4: caracter = leerCar(i); // lee el caracter de entrada
            if(esLetra(caracter) || esDigito(caracter)|| caracter =='_') // si es letra, digito o _ se queda en el estado 4
                estadoActual = 4;
            else // si no pasa al estado 5
                estadoActual = 5;
            break; // fin estado 4

        case 5: retrocederCar; // Decrementa la i en 1
            cout<<"Identificador"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i;  // pone el valor de i en token
            break; // fin estado 5

        // enteros y reales
        case 6: caracter = leerCar(i); // lee el caracter de entrada
            if(esDigito(caracter)) // si es un digito pasa al estado 7
                estadoActual = 7;
            else // si no entra al fallo y pasa al estado 11
                fallo();
            break; // fin estado 6

        case 7: caracter = leerCar(i); // lee el caracter de entrada
            if(esDigito(caracter)) // si es digito permanece en el estado 7
                estadoActual = 7;
            else if(caracter == '.')  // si no es digito, entonces si el caracter es un punto pasa al estado 9
                estadoActual = 9;
            else // si no es digito, ni punto. Entonces pasa al estado 8
                estadoActual = 8;
            break; // fin estado 7

        case 8: retrocederCar; // Decrementa la i en 1
            cout<<"Numero Entero"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 8

        case 9: caracter = leerCar(i); // lee el caracter de entrada
            if(esDigito(caracter)) // si es digito permanece en el estado actual
                estadoActual = 9;
            else //  si no, pasa al estado 10
                estadoActual = 10;
            break; // fin estado 9

        case 10: retrocederCar; // decrementa la i en 1
            cout<<"Numero Real"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 10

        case 11: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '!')  // si el caracter de entrada es una exclamación '!' 'NOT'
                estadoActual = 12; // pasa al estado 12
            else // si no entra al fallo y pasa al estado 16
                fallo();
            break; // fin estado 11

        case 12: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '=') // si el caracter de entrada es igual '=' pasa al estado 14
                estadoActual = 14;
            else // si no pasa al estado 13
                estadoActual = 13;
            break; // fin estado 12

        case 13: retrocederCar; // decrementa la i en 1
            cout<<"Op. Logico"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 13

        case 14: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpRL(caracter)) // si el caracter es otro, entonces pasa al estado 15
                estadoActual = 15;
            else { // si es igual a un operador es un error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 14

        case 15: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break;// fin del estado 15

        case 16: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '=') // si es igual '=' pasa al estado 17
                estadoActual = 17;
            else // si no entra al fallo y pasa al estado 21
                fallo();
            break; // fin estado 16

        case 17: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '=') // si el caracter es igual '=', pasa al estado 19
                estadoActual = 19;
            else // si no pasa al estado 18
                estadoActual = 18;
            break; // fin estado 17

        case 18: retrocederCar;  // decrementa la i en 1
            cout<<"Op. de asignacion"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 18

        case 19: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpRL(caracter)) // si el caracter de entrada es otro, pasa al estado 20
                estadoActual = 20;
            else{ // si es igual a un operador es un error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 19

        case 20: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 20

        case 21: caracter = leerCar(i); // lee el carcter de entrada
            if(caracter == '>') // si este caracter es MAYOR '>' pasa al estado 22
                estadoActual = 22;
            else // si no, entra al fallo y pasa al estado 26
                fallo();
            break; // fin estado 21

        case 22: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '=') // si este es igual '=',  pasa al estado 24
                estadoActual = 24;
            else // si no pasa al estado 23
                estadoActual = 23;
            break; // fin estado 22

        case 23: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i  en token
            break; // fin estado 23

        case 24: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpRL(caracter)) // si este caracter es otro, pasa al estado 25
                estadoActual = 25;
            else { // si es igual operador es un error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 24

        case 25: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el calor de i en 1
            break; // fin estado 25

        case 26: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '<') // si este es MENOR '<', pasa al estado 27
                estadoActual = 27;
            else // si no entra al fallo y pasa al estado 31
                fallo();
            break; // fin estado 26

        case 27: caracter = leerCar(i); // lee el caracter de entrrada
            if(caracter == '=') // si este es igual '=', pasa al estado 29
                estadoActual = 29;
            else // si no pasa al estado 28
                estadoActual = 28;
            break; // fin estado 27

        case 28: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 28

        case 29: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpRL(caracter)) // si este es otro, pasa al estado 30
                estadoActual = 30;
            else{ // si es igual '=' es un error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 29

        case 30: retrocederCar; // decrementa la i en 1
            cout<<"Op. Relacional"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i;// pone el valor de i en token
            break; //  fin caso 30

        case 31: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '+') // si el caracter es +, pasa al estado 32
                estadoActual = 32;
            else // si no entra al fallo y pasa al estado 34
                fallo();
            break; // fin estado 31

        case 32: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpAritmetico(caracter)) // si el caracter es otro, pasa al estado 33
                estadoActual = 33;
            else{ // si el caracter es +, es error
               error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 32

        case 33: retrocederCar; // decrementa la i en 1
            cout<<"Op. Aritmetico"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 33

        case 34: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '-') // si el caracter es -, pasa al estado 35
                estadoActual = 35;
            else // si no entra al fallo y pasa al estado 37
                fallo();
            break; // fin estado 34

        case 35: caracter = leerCar(i); //  lee el caracter de entrada
            if(!OpAritmetico(caracter)) // si el simbolo es -, pasa al estado 36
                estadoActual = 36;
            else{ // si el caracter es -, es error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 35

        case 36: retrocederCar; // decrementa la i en 1
            cout<<"Op. Aritmetico"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 36

        case 37: caracter = leerCar(i);
            if(caracter == '*') // si el caracter es *, pasa al estado 38
                estadoActual = 38;
            else // si no entra al fallo y pasa al estado 40
                fallo();
            break; // fin estado 37

        case 38: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpAritmetico(caracter)) // si el caracter es otro, pasa al estado 39
                estadoActual = 39;
            else{ // si el caracter es *, es error
                error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 38

        case 39: retrocederCar; // decrementa la i en 1
            cout<<"Op. Aritmetico"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 39

        case 40: caracter = leerCar(i); // lee el caracter de entrada
            if(caracter == '/') // si el caracter es /, pasa al estado 41
                estadoActual = 41;
            // fin de estados principales
            break; // fin estado 40

        case 41: caracter = leerCar(i); // lee el caracter de entrada
            if(!OpAritmetico(caracter))  // si el caracter es otro, pasa al estado 42
                estadoActual = 42;
            else { // si el caracter es igual a /, es error
               error((char *)"En",caracter);
                errorBand = true;
            }
            break; // fin estado 41

        case 42: retrocederCar; // decrementa la i en 1
            cout<<"Op. Aritmetico"<<endl; // imprime el estado de aceptacion
            inicializaEstados(); // reinicia los estados
            inicioToken = i; // pone el valor de i en token
            break; // fin estado 42
        }// fin switch
    }// fin wile
}// fin scanner

void inicializaEstados()
{
    estadoInicial = estadoActual = 0;
}
void fallo() // fallos de los estados
{
    switch (estadoInicial){ // estados de entrada
    case 0:{ estadoInicial = 3; // fallo en estado 0, pasa al estado 3
        i = inicioToken; // se pone el valor de i en token
    } break; // fin caso 0

    case 3: {estadoInicial = 6; // fallo en estado 3, pasa al estado 6
        i = inicioToken;// se pone el valor de i en token
    }break; // fin caso 3

    case 6:{ estadoInicial = 11; // fallo en estado 6, pasa al estado 11
        i = inicioToken; // se pone el valor de i en token
    } break; // fin caso 6

    case 11:{ estadoInicial = 16; // fallo en estado 11, pasa al estado 16
        i = inicioToken;  // se pone el valor de i en token
    }break;// fin caso 11

    case 16:{ estadoInicial = 21;// fallo en estado 16, pasa al estado 21
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 16

    case 21:{ estadoInicial = 26;// fallo en estado 21, pasa al estado 26
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 21

    case 26:{ estadoInicial = 31;// fallo en estado 26, pasa al estado 31
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 26

    case 31:{ estadoInicial = 34;// fallo en estado 31, pasa al estado 34
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 31

    case 34:{ estadoInicial = 37;// fallo en estado 34, pasa al estado 37
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 34

    case 37:{ estadoInicial = 40;// fallo en estado 37, pasa al estado 40
        i = inicioToken;// se pone el valor de i en token
    } break;// fin caso 37
    } // fin switch
    estadoActual = estadoInicial; // se pone el valor de estado inicial al actual
}// fin fallo

void error(char *ex,char car){
    SetConsoleTextAttribute(GetStdHandle (STD_OUTPUT_HANDLE),252); // color de fondo blanco y letra roja
    printf("--> Error de sintaxis: %s \"%c\" <--",ex,car);
    SetConsoleTextAttribute(GetStdHandle (STD_OUTPUT_HANDLE),07); // color de fondo negro y letra blanca
}

bool estadoDeAceptacion() // estados de aceptacion
{
    switch (estadoActual) // estados de aceptacion validos
    {
    case 2:
    case 5:
    case 8:
    case 10:
    case 13:
    case 15:
    case 18:
    case 20:
    case 23:
    case 25:
    case 28:
    case 30:
    case 33:
    case 36:
    case 39:
    case 42:
        return true; // si entra en un estado de aceptacion se retorna true
    default: return false; // si no entra, se retrona falso
    }// fin switch
}// fin estado de aceptacion

bool esLetra(char c) // letras
{
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ;
}
bool esDigito(char c) // digitos
{
    if( c >= '0' && c <= '9')
        return true;
    else
        return false;
}
bool esDelimitador(char c) //delimitadores
{
    return (c == ' ' || c == '\t' ||  c == '\n');
}

bool OpRL(char c){
    switch(c){
    case '=':
    case '!':
    case '>':
    case '<':
        return true;
    default: return false;
    }
}
bool OpAritmetico(char c){
    switch(c){
    case '+':
    case '-':
    case '*':
    case '/':
        return true;
    default: return false;
    }
}
