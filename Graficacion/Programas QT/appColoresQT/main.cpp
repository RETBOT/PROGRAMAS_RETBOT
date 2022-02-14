#include <QApplication>
#include <QWidget>
#include <QPalette>

int color(int colores){


   return colores;
}

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);

    QWidget *widget = new QWidget();

    widget->setGeometry(100,100,300,300);

    QPalette paleta(widget->palette());

    //paleta.setColor(QPalette::Background, Qt::white);
    //paleta.setColor(QPalette::Background, QColor::fromRgb(100,100,0));
    // investigar el QRandomGenerator

    srand(time(NULL));
    //paleta.setColor(QPalette::Background, QColor::fromRgb(rand()%155+100,rand()%155+100,rand()%155+100));

    int color=16777215,verde = 65280, azul = 250, rojo = 16711680;

    //r = b&g; r=100,g=100,b=100,
    //g >>= 8;
    //b = g|r;

   // color &= rojo;
    color |= 255;

    paleta.setColor(QPalette::Window, QColor(color));

    //paleta.setColor(QPalette::Background, QColor(250)); // azul
    //paleta.setColor(QPalette::Background, QColor(65280)); // verde
    //paleta.setColor(QPalette::Background, QColor(16711680)); // rojo
    // Estan invertidos

    // implementar un metodo para aplicar los operadores a nivel de bit
    // el metodo regresara el resultado del color en una variable entera
    // asigne el operador a nivel de bit a usar

    widget->setAutoFillBackground(true);
    widget->setPalette(paleta);

    widget->show();

    return a.exec();
}
