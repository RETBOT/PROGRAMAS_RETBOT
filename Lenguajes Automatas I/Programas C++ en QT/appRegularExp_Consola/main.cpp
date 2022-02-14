
#include <QRegularExpression>
#include <QRegularExpressionValidator>

#include <iostream>
using namespace std;

int main(){
    char opcMenu = 's';

    do{
    cout<<"\tMenu"<<endl;
    cout<<"1. Correo electronico"<<endl;
    cout<<"2. Nombre de Twitter"<<endl;
    cout<<"3. Color Hexadecimal"<<endl;
    cout<<"4. Contrasena"<<endl;
    cout<<"Opcion: ";
    int opc;
    cin>>opc;

    switch(opc){
     case 1: {
        QRegularExpression color("[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}", QRegularExpression::CaseInsensitiveOption);
         string correo;
         cout<<"Introduce un correo: ";
         cin>>correo;

        if(color.match(correo.c_str()).hasMatch())
            cout<<"Correo valido : "<<correo<<endl;
        else
            cout<<"Correo no valido : "<<correo<<endl;
    }break;
    case 2: {
        QRegularExpression nombreTwitter("@([A-Za-z0-9_]{1,15})", QRegularExpression::CaseInsensitiveOption);
         string nombre;
         cout<<"Introduce un nombre de Twitter: ";
         cin>>nombre;

        if(nombreTwitter.match(nombre.c_str()).hasMatch())
            cout<<"Nombre de Twitter valido : "<<nombre<<endl;
        else
            cout<<"Nombre de Twitter no valido  : "<<nombre<<endl;
    }break;

    case 3: {
        QRegularExpression color("#([a-fA-F]|[0-9]){3,6}", QRegularExpression::CaseInsensitiveOption);
         string colorHexa;
         cout<<"Introduce un color hexadecimal: ";
         cin>>colorHexa;

        if(color.match(colorHexa.c_str()).hasMatch())
            cout<<"Color valido : "<<colorHexa<<endl;
        else
            cout<<"Color no valido : "<<colorHexa<<endl;
    }break;
    case 4: {
        // La contraseña debe tener entre 8 y 20 caracteres, tiene que tener numeros, y letras, al menos una mayuscula y una minuscula
        QRegularExpression contra("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,20}$", QRegularExpression::CaseInsensitiveOption);
         string constrasena;
         cout<<"Introduce una contrasena: ";
         cin>>constrasena;

        if(contra.match(constrasena.c_str()).hasMatch())
            cout<<"Contrasena valido : "<<constrasena<<endl;
        else
            cout<<"Contrasena no valido : "<<constrasena<<endl;
    }break;
    default :
        cout<<"Valor no valido"<<endl;
    }
    cout<<"Desea continuar (s/n): ";
    cin>>opcMenu;
    cout<<endl;
    }while(opcMenu == 's');
  /*
    QString patron1 = "^[0-1]{1,8}$";
    QRegularExpression rex;
    rex.setPattern(patron1);

    if(rex.isValid())
        cout<<"Patron valido: "<<patron1.toStdString()<<endl;
    else
        cout<<"Patron no valido: "<<patron1.toStdString()<<endl;

    QString valor = "1033";
    QRegularExpressionMatch match1 = rex.match(valor);

    bool hasMatch1 = match1.hasMatch();
    if(hasMatch1)
        cout<<"Expresion valida : "<<valor.toStdString()<<endl;
    else
        cout<<"Expresion no valida : "<<valor.toStdString()<<endl;


    // utilizando puntero
    cout<<"Alernativa 2 con punteros"<<endl;
    QRegularExpression *match2 = new QRegularExpression(patron1);
    //bool hasMatch2 = match2->match(valor).hasMatch();
    if(match2->match(valor).hasMatch())
        cout<<"Expresion valida : "<<valor.toStdString()<<endl;
    else
        cout<<"Expresion no valida : "<<valor.toStdString()<<endl;

    // validar que una entrada cumpla con la reglña de los hexadecimales de dos bytes
    // ej FFF. 10000 ffGG
    //QString pattron3 = "^[0-9A-f]{2}$";
    QRegularExpression expHexa("^[0-9A-F]{4}$", QRegularExpression::CaseInsensitiveOption);

    QString valorHexa = "ff";
    if(expHexa.match(valorHexa).hasMatch())
        cout<<"Expresion valida : "<<valorHexa.toStdString()<<endl;
    else
        cout<<"Expresion no valida : "<<valorHexa.toStdString()<<endl;

    QRegularExpression re("^[\\w-]+(\\.?[\\w-]+)@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})?$");
    QString correo1 = "alu-19130519@correo.itlalaguna.edu";
    if(re.match(correo1).hasMatch())
        cout<<"Correo 1 valido : "<<correo1.toStdString()<<endl;
    else
        cout<<"Correo 1 no valido : "<<correo1.toStdString()<<endl;

    QString correo2 = "alu-19130519@correo.itlalaguna.edu.mx";
    if(re.match(correo2).hasMatch())
        cout<<"Correo 2 valido  : "<<correo2.toStdString()<<endl;
    else
        cout<<"Correo 2 no valido : "<<correo2.toStdString()<<endl;
*/
}
