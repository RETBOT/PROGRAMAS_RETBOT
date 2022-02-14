
#include <QRegularExpression>
#include <QRegularExpressionValidator>

#include <iostream>
using namespace std;

int main(){
    int opc;

    cout<<"Menu"<<endl;
    cout<<"1. Validar un correo electronico"<<endl;
    cout<<"2. Validar contrasenas"<<endl;
    cout<<"3. Color Hexadecimal"<<endl;
    cout<<"Opcion: ";
    cin>>opc;

    if(opc==1){
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
    }
    if(opc==2){
       QString patron1 = "^[0-1]{1,8}$";
        QRegularExpression rex;
        rex.setPattern(patron1);
         QString valor = "1033";
    // utilizando puntero
    cout<<"Alernativa 2 con punteros"<<endl;
    QRegularExpression *match2 = new QRegularExpression(patron1);
    //bool hasMatch2 = match2->match(valor).hasMatch();
    if(match2->match(valor).hasMatch())
        cout<<"Expresion valida : "<<valor.toStdString()<<endl;
    else
        cout<<"Expresion no valida : "<<valor.toStdString()<<endl;
    }
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
}
