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
   double x = ui->lineEdit->text().toDouble();
   double y = ui->lineEdit_2->text().toDouble();
   double result = pow(x,y);
   ui->label_3->setText("Resultado : "+QString::number(result));
   ui->label_3->adjustSize();
}

void Dialog::on_pushButton_2_clicked()
{
    int x = ui->spinBox->value();
    double y = ui->doubleSpinBox->value();
    ui->label_4->setText("Resultado : "+QString::number(pow(x,y)));
    ui->label_4->adjustSize();
    ui->lcdNumber->display(QString::number(pow(ui->spinBox->value(),ui->doubleSpinBox->value())));
}

void Dialog::on_horizontalSlider_valueChanged(int value)
{
    ui->label_7->setText(QString::number(value));
    int valor = ui->horizontalSlider->value();
    ui->lcdNumber_2->display(value);
}

void Dialog::on_dial_valueChanged(int value)
{
    ui->lcdNumber_2->display(value);
}
