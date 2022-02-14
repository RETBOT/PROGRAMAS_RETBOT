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
    NotacionPolaca *expresion = new NotacionPolaca();
    QString expresionInfija = ui->comboBox->itemText(ui->comboBox->currentIndex());
    //string resul = expresion->ConvertirAPosFijaS(expresionInfija.toStdString());
    QString resul = expresion->ConvertirAPosFijaS(expresionInfija);
    ui->lineEdit->setText(resul);
}


void Dialog::on_pushButtonSolucion_clicked()
{
    NotacionPolaca *expresion = new NotacionPolaca();
    QString expresionInfija = ui->lineEdit->text();
    if(expresion->seResuelve(expresionInfija.toStdString())){
        double resEpos = expresion->resolverPosFija(expresionInfija.toStdString());
        ui->label_2->setText(QString::number(resEpos));
    }
    else
        ui->label_2->setText("La expresion no se puede resolver");
}

