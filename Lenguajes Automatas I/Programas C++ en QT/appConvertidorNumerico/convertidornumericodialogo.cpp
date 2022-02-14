#include "convertidornumericodialogo.h"
#include <QVBoxLayout>
#include <QHBoxLayout>
#include <QGridLayout>
#include <QLabel>
#include <QLineEdit>
#include <QPushButton>
#include <QIntValidator>
#include <QRegularExpression>
#include <QRegularExpressionValidator>
#include "convertidornumerico.h"
/*
ConvertidorNumericoDialogo::ConvertidorNumericoDialogo(QObject *parent) : QObject(parent)
{

}
*/

ConvertidorNumericoDialogo::ConvertidorNumericoDialogo()
{
    QVBoxLayout *mainLayout = new QVBoxLayout(this);
    QGridLayout *editLayout = new QGridLayout;
    QHBoxLayout *buttonLaoyut = new QHBoxLayout;

    QLabel *decLabel = new QLabel("Decimal");
    QLabel *hexLabel = new QLabel("Hexadecimal");
    QLabel *binLabel = new QLabel("Binario");

    decEdit = new QLineEdit;
    hexEdit = new QLineEdit;
    binEdit = new QLineEdit;

    editLayout->addWidget(decLabel,0,0);
    editLayout->addWidget(decEdit,0,1);
    editLayout->addWidget(hexLabel,1,0);
    editLayout->addWidget(hexEdit,1,1);
    editLayout->addWidget(binLabel,2,0);
    editLayout->addWidget(binEdit,2,1);

    QPushButton *botonSalir = new QPushButton("Salir");
    buttonLaoyut->addStretch();
    buttonLaoyut->addWidget(botonSalir);

    mainLayout->addLayout(editLayout);
    mainLayout->addStretch();
    mainLayout->addLayout(buttonLaoyut);

    botonSalir->setDefault(true);

    connect(botonSalir,SIGNAL(released()),this, SLOT(accept()));

    //aceptar valores de 4 bytes, realizar las modificaciones

        //Valores de un byte: 0 -255
    QIntValidator *decVal = new QIntValidator(0,255,decEdit);
    decEdit->setValidator(decVal);
    // Expresion Regular para validar numeros hexa de 2 digitos
    QRegularExpressionValidator *hexVal = new QRegularExpressionValidator(QRegularExpression("[0-9A-Fa-f]{1,8}"),hexEdit);
    hexEdit->setValidator(hexVal);

    QRegularExpressionValidator *binVal = new QRegularExpressionValidator(QRegularExpression("[0-1]{1,32}"), binEdit);
    binEdit->setValidator(binVal);

    ConvertidorNumerico *convertidor = new ConvertidorNumerico();
    connect(decEdit, SIGNAL(textChanged(QString)), convertidor, SLOT(setDec(QString)));
    connect(convertidor,SIGNAL(hexChanged(QString)), hexEdit, SLOT(setText(QString)));
    connect(convertidor, SIGNAL(binChanged(QString)), binEdit, SLOT(setText(QString)));

    // agregar las conecciones necesarias para que el valor capturado en hexa se escriba en Dec, Bin
    connect(hexEdit,SIGNAL(textChanged(QString)), convertidor, SLOT(setHex(QString)));

    // agregar las conecciones necesarias para que el valor capturado en bin se escriba en Dec, Hexa
    connect(binEdit, SIGNAL(textChanged(QString)), convertidor, SLOT(setBin(QString)));

    connect(convertidor,SIGNAL(decChanged(QString)), decEdit,SLOT(setText(QString)));



}
