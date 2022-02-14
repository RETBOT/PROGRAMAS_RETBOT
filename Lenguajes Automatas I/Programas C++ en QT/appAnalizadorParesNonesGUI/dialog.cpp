#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
}

Dialog::~Dialog()
{
    delete ui;
}


void Dialog::on_pushButton_clicked()
{
    QString cadena = ui->lineEdit->text();
    Pares *par = new Pares();
    bool espar = par->esPar(cadena.toStdString());
    if(espar){
        ui->label_2->setStyleSheet("QLabel{color: green;}");
        ui->label_2->setText("Numero Par");
    }
    else{
        ui->label_2->setStyleSheet("QLabel{color: red;}");
        ui->label_2->setText("Numero Non");
    }
}

void Dialog::on_lineEdit_returnPressed()
{
    on_pushButton_clicked();
}

