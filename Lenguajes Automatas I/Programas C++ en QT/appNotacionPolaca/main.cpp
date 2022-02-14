#include <iostream>
#include "notacionpolaca.h"

using namespace std;

int main()
{
    NotacionPolaca *expresion = new NotacionPolaca();

    char opc = 'S';

    do{
        string expInfija;

        cout<<"\nExprecion Infija: ";
        cin>>expInfija;

        string expInfijaSinE = expresion->eliminarEspacio(expInfija);

        bool band = expresion->contParentesis(expInfijaSinE);

        if(band){
            //cout<<"Exprecion Infija: "<<expInfijaSinE<<endl;
            //char *resul = new char[expInfijaSinE.length()]; // usando arreglos de char
            string resul;
            //resul = expresion->ConvertirAPosFija(expInfijaSinE); // usando arreglos de char
            resul = expresion->ConvertirAPosFijaS(expInfijaSinE);

            cout<<"\nExpresion PostFija = "<<resul<<endl;

            if(expresion->seResuelve(resul)){
                double resEpos = expresion->resolverPosFija(resul);
                cout<<"\nResultado expresion PostFija = "<<resEpos<<endl;
            }
            else
                cout<<"La expresion no se puede resolver"<<endl;
            delete expresion;

            // delete []resul; // usando arreglos de char
        }
        else
            cout<<"Error falta un parentesis"<<endl;

        cout<<"Desea continuar (s/n): ";
        cin>>opc;
    }while(strchr("Ss",opc));
    return 0;
}
