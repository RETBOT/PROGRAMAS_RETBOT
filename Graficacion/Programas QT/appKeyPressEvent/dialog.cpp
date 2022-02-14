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

void Dialog::keyPressEvent(QKeyEvent *evento)
{
    if(evento->key() == Qt::Key_Up){
        ui->label->setText("Presionaste flecha arriba");
    }
    if(evento->key() == Qt::Key_Down){
        ui->label->setText("Presionaste flecha abajo");
    }
    if(evento->key() == Qt::Key_Left){
        ui->label->setText("Presionaste flecha izquierda");
    }
    if(evento->key() == Qt::Key_Right){
        ui->label->setText("Presionaste flecha derecha");
    }
    if(evento->key() == Qt::Key_S){
        ui->label->setText("Presionaste tecla S");
    }
    if(evento->key() == Qt::Key_F10){
        this->close();
    }
}

