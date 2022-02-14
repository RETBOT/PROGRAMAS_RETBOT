#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);

    //EXPRESIONES REGULARES DE INICIO

    ui->comboBox->addItem("^[A-Z0-9a-z.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$");
    ui->label_3->setText("Correo electronico 1");
    ui->comboBox->addItem("^[\\w-]+(\\.[\\w-]+)@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
    //numero entero
    ui->comboBox->addItem("^\\d+$");
     //validarNumeroEnteroNegativo
    ui->comboBox->addItem("^-[0-9]+$");
    //validarNumControl
    ui->comboBox->addItem("[0-9]{8}$");
    //validarNumControl20y21
    ui->comboBox->addItem("^(2113|2013)[0-9]{4}$");
    //validarNombres
    ui->comboBox->addItem("^([A-Z][a-z]+)\\s?([A-Z][a-z]+)?$");
    //validarCadena
    ui->comboBox->addItem("([A-Z]|[a-z]|[0-9]){5,10}");
    //validarHexadecimal
    ui->comboBox->addItem("^([A-Fa-f0-9]){1,2}");
    //validarBinario
    ui->comboBox->addItem("[01]{8}");
    //validarClaves
    ui->comboBox->addItem("([A-Za-z]{2})([0-9]{3})");
    //validarCURP
    ui->comboBox->addItem("^([A-Z]{4})([0-9]{6})([HM])([A-Z]{2})([A-Z]{3})([0-9]{2})");
    //validarRFC
    ui->comboBox->addItem("^([A-Z]{4})([0-9]{6})(([A-Z]|[0-9]){3})");
    //Color Hexadecimal
    ui->comboBox->addItem("#([a-fA-F]|[0-9]){3,6}");
    // Dirección IPv4
    ui->comboBox->addItem("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    // Validar nombre de usuario de Twitter
    ui->comboBox->addItem("@([A-Za-z0-9_]{1,15})");
    // Validar numeros pares
    ui->comboBox->addItem("[0-9]*[02468]");
    // Validar numeros nones
    ui->comboBox->addItem("[0-9]*[02468]");
    // valirar palabras con 3 a o mas
    ui->comboBox->addItem("(ab*){3,}");
    // valirar  numero de 0 impares
    ui->comboBox->addItem("^(01|10|0)[^01]?([01]{2})*$");
    // validar identificadores
    ui->comboBox->addItem("^([A-Za-z]|_)([A-Za-z]|_|[0-9])*");

}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::on_pushButton_clicked()
{
    QString patron = ui->comboBox->itemText(ui->comboBox->currentIndex());

    QRegularExpression regexp(patron);

    QString entrada = ui->lineEdit->text();

    QRegularExpressionMatch match = regexp.match(entrada);

    if(match.hasMatch()){
        ui->label_2->setStyleSheet("QLabel{ color:green}");
        ui->label_2->setText("EXPRESION VALIDA");
    }
    else{
        ui->label_2->setStyleSheet("QLabel{ color:red}");
        ui->label_2->setText("EXPRESION INVALIDA");
    }
}


void Dialog::on_comboBox_activated(int index)
{
    int pos = index+1;
    if(pos == 1){
        ui->label_3->setText("Correo electronico 1");
    }else if(pos == 2){
        ui->label_3->setText("Correo electronico 2");
    }else if(pos == 3){
        ui->label_3->setText("Numeros enteros");
    }else if(pos == 4){
        ui->label_3->setText("Numeros enteros negativos");
    }else if(pos == 5){
        ui->label_3->setText("Numeros de control");
    }else if(pos == 6){
        ui->label_3->setText("Numeros de control alumnos ingresados el año 2020 y 2021");
    }else if(pos == 7){
        ui->label_3->setText("Validar Nombres");
    }else if(pos == 8){
        ui->label_3->setText("Validar cadenas de 5 a 10 caracteres");
    }else if(pos == 9){
        ui->label_3->setText("Validar numeros hexadecimales");
    }else if(pos == 10){
        ui->label_3->setText("Validar numeros binarios");
    }else if(pos == 11){
        ui->label_3->setText("Validar Claves empezando con dos letras, seguido de 3 numeros enteros");
    }else if(pos == 12){
        ui->label_3->setText("Validar CURP");
    }else if(pos == 13){
        ui->label_3->setText("Validar RFC");
    }else if(pos == 14){
        ui->label_3->setText("Color Hexadecimal");
    }else if(pos == 15){
        ui->label_3->setText("Dirección IPv4");
    }else if(pos == 16){
        ui->label_3->setText("Validar nombre de usuario de Twitter");
    }else if(pos == 17){
        ui->label_3->setText("Validar numeros pares");
    }else if(pos == 18){
        ui->label_3->setText("Validar numeros nones");
    }else if(pos == 19){
        ui->label_3->setText("valirar palabras con 3 \"a\" o mas");
    }else if(pos == 20){
        ui->label_3->setText("valirar numeros de 0 impares");
    }else if(pos == 21){
        ui->label_3->setText("validar identificadores");
    }else
        ui->label_3->setText(" ");




}


void Dialog::on_lineEdit_returnPressed()
{
    on_pushButton_clicked();
}


void Dialog::on_pushButton_2_clicked()
{
    ui->lineEdit->setText("");
}

