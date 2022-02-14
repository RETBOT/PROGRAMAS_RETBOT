#include <iostream>

using namespace std;

#include "tabladesimbolos.h"

int main()
{
    cout<<"Tabla de simbolos"<<endl;
    char *cad1 = new char[128];
    string cad1S = "val1";
    strcpy(cad1,cad1S.c_str());
    TablaDeSimbolos tablaS(10);
    tablaS.AddSym(cad1,5); // (val1, 5) => val1 = 5
    tablaS.AddSym((char *)"val2",0);
    tablaS.AddSym((char *)"val3",1);
    tablaS.AddSym((char *)"_a",10);
    tablaS.AddSym((char *)"a_",0);
    tablaS.AddSym((char *)"i",0);
    tablaS.AddSym((char *)"j",0);

    tablaS.imprimirTabla();


    cout<<endl;
    cout<<"valor de val2 = "<<tablaS.FindSym((char *)"val2")->valor<<endl;
    cout<<"valor de \"i" " = "<<tablaS.FindSym((char *)"i")->valor<<endl;
    cout<<endl;

    cout<<"Eliminar : _a"<<endl;
    tablaS.removeSym((char *)"_a");
    tablaS.imprimirTabla();
    cout<<endl;
    cout<<"Eliminar : val1"<<endl;
    tablaS.removeSym((char *)"val1");
    tablaS.imprimirTabla();
    return 0;
}
