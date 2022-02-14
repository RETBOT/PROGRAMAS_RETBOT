#include "notacionpolaca.h"
#include "pilat.cpp" // se tiene que agregar para tipo template, por crear una clase plantilla

NotacionPolaca::NotacionPolaca()
{

}

char *NotacionPolaca::ConvertirAPosFija(string EI)
{
    char *Epos = new char[EI.length()];

    int cantidad = contOperadores(EI);

    PilaT<int> *stack = new PilaT<int>(cantidad);
    // Tarea prar mañama
    // la pila debe ser al menos de la cantidad de operadores en la expresion
    // por lo tanto crear un metodo donde se analize la exp. infija y se
    // determine la cantiadad de operadores a utilizar en el tamaño de la pila

    // ejemplo (7+8)-6*5^2 ( + - * ^ = 5


    // se requieren dos variables para el recorrido, una para el analisis y otra para la insercion en EPOS

    int i,pos = 0;
    for(i=0;i < (int)EI.length();i++){
        char car = EI[i];
        Simbolo actual = TipoYPrecedencia(car);
        switch (actual) {
        case OPERANDO: Epos[pos++] =car; break;
        case SUMRES: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case MULDIV: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case POW: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case PIZQ: stack->push(car); break;
        case PDER:{
            char x = (char)stack->pop();
            while(TipoYPrecedencia(x) != PIZQ){
                Epos[pos++] = x;
                x = (char)stack->pop();
            }
        }break;
        } // fin switch
    }// fin del for

    while(!stack->estaVacia()){
        if(pos<(int)EI.length())
            Epos[pos++] = (char)stack->pop();
        else
            break;
    }

    Epos[pos] = '\0'; // Las cadenas de c/c++ terminan en null = \0
    return Epos;

}

string NotacionPolaca::ConvertirAPosFijaS(string EI)
{
    char *Epos = new char[EI.length()];

    int cantidad = contOperadores(EI);

    PilaT<int> *stack = new PilaT<int>(cantidad);

    int i,pos = 0;
    for(i=0;i < (int)EI.length();i++){
        char car = EI[i];
        Simbolo actual = TipoYPrecedencia(car);
        switch (actual) {
        case OPERANDO: Epos[pos++] =car; break;
        case SUMRES: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case MULDIV: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case POW: {
            while(!stack->estaVacia() &&
                  TipoYPrecedencia((char)stack->getTope()) >= actual)
                Epos[pos++] = (char)stack->pop();
            stack->push(car);
        }break;
        case PIZQ: stack->push(car); break;
        case PDER:{
            char x = (char)stack->pop();
            while(TipoYPrecedencia(x) != PIZQ){
                Epos[pos++] = x;
                x = (char)stack->pop();
            }
        }break;
        } // fin switch
    }// fin del for

    while(!stack->estaVacia()){
        if(pos<(int)EI.length())
            Epos[pos++] = (char)stack->pop();
        else
            break;
    }

    Epos[pos] = '\0'; // Las cadenas de c/c++ terminan en null = \0
    return Epos;
}


double NotacionPolaca::resolverPosFija(string Epos)
{
     PilaT<double> *stack = new PilaT<double>(Epos.length());
     double resu;
     for(int i=0;i<(int)Epos.length();i++){
         char simbolo = Epos[i];
             switch (simbolo) {
             case '^':{
                 double b = stack->pop();
                 double a = stack->pop();
                 double ele = pow(a,b);
                 stack->push(ele);
             }break;
             case '/':{
                 double b = stack->pop();
                 double a = stack->pop();
                 double div = a/b;
                 stack->push(div);
             }break;
             case '*':{
                 double b = stack->pop();
                 double a = stack->pop();
                 double mul = a*b;
                 stack->push(mul);
             }break;
             case '+':{
                 double b = stack->pop();
                 double a = stack->pop();
                 double sum = a+b;
                 stack->push(sum);
             }break;
             case '-':{
                 double b = stack->pop();
                 double a = stack->pop();
                 double res = a-b;
                 stack->push(res);
             }break;
             default:{
                 double num = simbolo - 48;
                 stack->push(num);
             }
             } // fin switch
     }// fin for
     resu = stack->pop();
     return resu;
}

void NotacionPolaca::conInfAPos(char *EI, char *EPos)
{
    PilaT<int> *pila = new PilaT<int>(sizeof(*EI)/sizeof(EI[0]));
    for(int i=0;EI[i] != '\0';i++){
        simbolo = EI[i];
        if(simbolo == '('){
            pila->push(simbolo);
        }else if(simbolo == ')'){
            while(pila->getTope() != '('){
                EPos[pos++] = pila->pop();
            }
            pila->pop();
        }
        else if(!operador(simbolo)){
            EPos[pos++] = simbolo;
        }
        else{
            while(pila->getLength() > -1 && (precedencia(simbolo)<=precedencia(pila->getTope()))){
                EPos[pos++] = pila->pop();
            }
            pila->push(simbolo);
        }
    }
    while(pila->getLength() >-1){
        EPos[pos++] = pila->pop();
    }
    for(int i=0; i<pos; i++)
        cout<<EPos[i];
    cout<<endl;
}

int NotacionPolaca::precedencia(char p)
{
    switch(p){
    case '^': return 3; break;
    case '/':
    case '*': return 2; break;
    case '+':
    case '-': return 1; break;
    }
    return 0;
}

bool NotacionPolaca::operador(char simbolo)
{
    switch(simbolo){
    case '^':
    case '/':
    case '*':
    case '+':
    case '-': return true; break;
    }
    return false;
}

Simbolo NotacionPolaca::TipoYPrecedencia(char s)
{
    Simbolo simbolo;
    switch (s) {
    case '+':
    case '-': simbolo = SUMRES; break;
    case '/':
    case '*': simbolo = MULDIV; break;
    case '^': simbolo = POW; break;
    case ')': simbolo = PDER; break;
    case '(': simbolo = PIZQ; break;
    default: simbolo = OPERANDO; break;
    }
    return simbolo;
}

int NotacionPolaca::contOperadores(string EI) // ejemplo (7+8)-6*5^2 = ( + - * ^ = 5
{
    int operadores = 0;
    for(int i=0;i<(int)EI.length(); i++){ // recorrido del string
        char simbolo = EI[i]; // se recorre cada simbolo de la cadena
        switch (simbolo) { // si es un operador
        case '+': operadores++;break; // se suma 1 a la cantidad
        case '-': operadores++;break;
        case '/': operadores++;break;
        case '*': operadores++;break;
        case '^': operadores++;break;
        case '(': operadores++;break;
        } // fin switch
    } // fin for
    return operadores;  // se retorna la cantidad de operadores encontrados en la cadena
}

string NotacionPolaca::eliminarEspacio(string EI) // ejemplo ( 2 + 2 )  = (2+2)
{
    int pos=0; // posición en la cadena
    for(int i=0;i<(int)EI.length();i++){ // recorrido del string EI
        char simbolo = EI[i]; // se recorre cada simbolo de la cadena en busqueda del espacio
        if(simbolo != ' ') // en caso de no ser un espacio
            EI[pos++]=simbolo; // se guarda en el string y se aumenta la posicion
    } // fin for
    while(pos<(int)EI.length()){ // si la posicion es mayor al tamaño de la cadena termina
        EI.pop_back(); // se saca el ultimo elemento, eliminar los espacios
    }
    return EI; // se retorna la cadena sin espacios
}

bool NotacionPolaca::contParentesis(string EI)
{
    int parDer = 0, parIzq = 0;
    for(int i=0;i<(int)EI.length();i++){ // recorrido del string
        char simbolo = EI[i]; // se recorre cada simbolo de la cadena
        if(simbolo == ')') // se busca el parentesis Derecho
            parDer++; // se cuentan todos los parentesis derechos en la cadena
        if(simbolo == '(') // se busca el parentesis Izquierdos
            parIzq++; // se cuentan todos los parentesis izquierdos en la cadena
    }
    if(parDer==parIzq) // Si los contadores son iguales, no falta ninguno
        return true; // y se retorna verdadero
    else //si son distintos,
        return false; // se retorna falso
}

bool NotacionPolaca::seResuelve(string Epos)
{
    for(int i=0;i<(int)Epos.length();i++){ // recorrido del string
        char simbolo = Epos[i]; // se recorre cada simbolo de la cadena
        if((simbolo >= 'a' && simbolo <='z')||(simbolo >= 'A' && simbolo <='Z')) //si se encuentra una letra
            return false; // no se puede resolver
    }
   return true; // en caso de solo tener numeros, se retorna verdadero
}

