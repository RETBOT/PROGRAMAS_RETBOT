//#include <iostream>
//using namespace std;
#include "string.h"
#include "conjunto.h"


void menu(int &op)//REGRESA LA OPCION POR REFERENCIA
{
    do
    {
        cout<<" Conjuntos ";
        cout<<"\n 1. Agregar "; //   +
        cout<<"\n 2. Borrar ";  //   -
        cout<<"\n 3. Mostrar ";
        cout<<"\n 4. Copiar ";
        cout<<"\n 5. Iguales ";// if(set1 == set2)
        //if(set1.esIgual(set2) ...
        //USAR SOBRECARGA DE OPERADORES EN C++
        cout<<"\n 6. Union ";
        cout<<"\n 7. Interseccion ";
        cout<<"\n 8. Salir \n";
        cout<<" Opcion: ";
       cin>>op;
    }while(op < 1 || op > 8);
}


int main()
{

    Conjunto set1,set2,set3;
    int opc;
    set1.vacio();
    set2.vacio();
    set3.vacio();
    char resp = 's';
    while(resp == 's'){
        menu(opc);
        switch (opc) {
           case 1:{ // agregar
                Mensaje mensaje;
                int conj, val, cont = 0, cant;
                cout<<"Cantidad de elemento a agregar : ";
                cin>>cant;
                cout<<"Conjunto (1,2) ? : ";
                cin>>conj;
                while(cont<cant){
                    if(conj == 1){
                        cout<<"Valor "<<cont+1<<" : ";
                        cin>>val;
                        cout<<"Valor para el conjunto 1 :"<<val<<endl;
                        mensaje = set1 + val; //mensaje = set1.agregarElementos(val);
                        if(!mensaje)
                            cout<<"Espacio insuficiente "<<endl;
                        else if(mensaje == yaExiste)
                             cout<<"Dato ya existe"<<val<<endl;
                         else
                             cout<<"Dato agregado"<<endl;
                    }
                    if(conj == 2){
                        cout<<"Valor : ";
                        cin>>val;
                        cout<<"Valor para el conjunto 2 :"<<val<<endl;
                        mensaje = set2 + val; //mensaje = set2.agregarElementos(val);
                        if(!mensaje)
                            cout<<"Espacio insuficiente "<<endl;
                        else if(mensaje == yaExiste)
                             cout<<"Dato ya existe"<<val<<endl;
                         else
                                 cout<<"Dato agregado"<<endl;
                    }
                      cont++;
                }//fin while
                break;
            }
           case 2:{ // borrar
            int conj;
            cout<<"Conjunto (1,2) ? : ";
            cin>>conj;
            if(conj == 1){
                int val;
                bool resu;
                cout<<"Valor : ";
                cin>>val;
                cout<<"Valor para borrar en el conjunto 1: "<<val<<endl;
                resu = set1 - val; //set1.borrarElemento(val,resu);
                if(resu)
                    cout<<"Dato borrado "<<endl;
                 else
                     cout<<"Valor no encontrado "<<endl;
            }
            if(conj == 2){
                int val;
                bool resu;
                cout<<"Valor : ";
                cin>>val;
                cout<<"Valor para borrar en el conjunto 2: "<<val<<endl;
                resu = set2 - val; //set2.borrarElemento(val,resu); //
                if(resu)
                    cout<<"Dato borrado "<<endl;
                 else
                     cout<<"Valor no encontrado "<<endl;
            }
            break;
        }
           case 3:{// mostrar
                int conj;
                cout<<"Conjunto (1,2) ? : ";
                cin>>conj;
                if(conj == 1)
                    set1.mostrarElementos("1");
                else if(conj == 2)
                    set2.mostrarElementos("2");
                else
                    cout<<"Dato incorrecto"<<endl;
            break;
        }
           case 4:{// copiar
            int conj;
            cout<<"Copiar \n1.Conjunto 1 al 2\n2.Conjunto 2 al 1\nOpcion : ";
            cin>>conj;
            if(conj == 1)
                set1.copiar(&set2);
            else if(conj == 2)
                set2.copiar(&set1);
            else
                cout<<"Dato incorrecto"<<endl;
            break;
        }
           case 5:{ // iguales
           if(set1 == &set2)
                cout<<"Conjuntos iguales"<<endl;
            else
                cout<<"Conjuntos diferentes"<<endl;
            break;
        }
           case 6:{// union
                Mensaje mensaje;
                mensaje = set1.Union(set2,set3);
                if(!mensaje)
                   cout<<"Espacio insuficiente "<<endl;
                else {
                cout<<"Union del Conjunto 1 y 2"<<endl;
                set3.mostrarElementos("3");
               }
            break;
        }
           case 7:{// Interseccion;
            set1.Interseccion(&set2,&set3);
            cout<<"Union del Intrerseccion 1 y 2"<<endl;
            set3.mostrarElementos("3");
            break;
        }
           case 8:{// salir
                exit(1);
            }
        default:
            cout<<"Dato incorrecto"<<endl;
        }// fin del switch
        cout<<"Continuar (s/n) : ";
        cin>>resp;
        }//fin del while externo
    return 0;
    }

