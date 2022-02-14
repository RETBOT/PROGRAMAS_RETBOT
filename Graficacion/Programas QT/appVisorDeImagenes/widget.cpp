#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    //windows
    //QPixmap imagen("Naruto.png");
   // QPixmap imagen("C:\\Users\\admin\\Desktop\\Ejercicios Qt\\appVisorDeImagenes\\Naruto.png");
   // ui->label->setPixmap(imagen);
}

Widget::~Widget()
{
    delete ui;
}


void Widget::on_pushButton_clicked()
{
    QFileDialog dialogo(this);
    dialogo.setNameFilter("Imagenes(*.png *.bmp *.jpg *.jpeg)");
    dialogo.setViewMode(QFileDialog::Detail);
    QString nomarch = QFileDialog::getOpenFileName(this, "Abrir Imagen","C:\\Users\\admin\\Desktop\\Ejercicios Qt\\appVisorDeImagenes",
                                                  "Archivos de Imagenes(*.png *.bmp *.jpg *.jpeg)");
    if(!nomarch.isEmpty()){
        QImage imagen(nomarch);
        ui->label->setPixmap(QPixmap::fromImage(imagen));
        ui->label->setScaledContents(true);
    }

}
