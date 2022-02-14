#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    ui->comboBox->addItem("3*(5-2)^2");
    ui->comboBox->addItem(" ");
}

Dialog::~Dialog()
{
    delete ui;
}


void Dialog::on_pushButtonConvertir_clicked()
{
    QString expresionInfija = ui->comboBox->itemText(ui->comboBox->currentIndex());
    string resul = expresion->ConvertirAPosFijaS(expresionInfija.toStdString());
    ui->lineEdit->setText(resul.c_str());
}


void Dialog::on_pushButtonSolucion_clicked()
{
    QString expresionInfija = ui->lineEdit->text();
    if(expresion->seResuelve(expresionInfija.toStdString())){
        double resEpos = expresion->resolverPosFija(expresionInfija.toStdString());
        ui->label_2->setText(QString::number(resEpos));
    }
    else
        ui->label_2->setText("La expresion no se puede resolver");
}


void Dialog::on_pushButtonDSAQS_clicked()
{
    //QString cadenaQs = ui->lineEdit_2->text();
     string cadena = ui->lineEdit_2->text().toStdString();
     ui->label_3->setText(QString::fromStdString(cadena));
}


void Dialog::on_pushButtonDigitos_clicked()
{
    string cadena = ui->lineEdit_3->text().toStdString();
    QString cadQstring = QString::fromStdString(cadena);
    QString numeros = "";

    for(int i=0; i< cadQstring.length(); i++)
        if(cadQstring.at(i).isDigit())
            numeros.append(cadQstring.at(i));

    ui->label_4->setText(numeros);

    string digitos = numeros.toStdString();
    int num = atoi(digitos.c_str());
    ui->label_5->setText(QString::number(num));
}

