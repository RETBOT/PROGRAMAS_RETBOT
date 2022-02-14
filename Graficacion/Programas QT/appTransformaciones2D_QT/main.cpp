#include <QApplication>
#include <QGraphicsScene>
#include <QGraphicsRectItem>
#include <QGraphicsView>

#include "rectanguloitem.h"

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
// crear la escena
    QGraphicsScene *escena = new QGraphicsScene();

    RectanguloItem *rectangulo = new RectanguloItem(400,400);
    rectangulo->setFlag(QGraphicsItem::ItemIsFocusable);

    rectangulo->setRect(0,0,50,50);
    rectangulo->setFocus();
    escena->addItem(rectangulo);
// crear la vista y usam la escena que se creo
    QGraphicsView *vista = new QGraphicsView(escena);
    vista->resize(400,400);

    vista->show();

    QString mess = "Mostrar los comandos = 0\n"
    "Activar traslacion = 1\n"
    "Activar escalacion = 2\n"
    "Activar escalacion punto fijo = 3\n"
    "Activar rotacion = 4\n"
    "Activar rotacion punto fijo = 5\n\n"
    "Traslacion   \tEscalacion \tEscalacion PF\n"
    "Arriba = ^   \t+X = X     \t+X = X\n"
    "Abajo = v    \t+Y = Y     \t+Y = Y\n"
    "Izquierda = <\t-X = C     \t-X = C\n"
    "Derecha = >  \t-Y = U     \t-Y = U\n"
    "Rotacion   \tRotacion PF\n"
    "-> = R 	\t-> = R\n"
    "<- = E     \t<- = E\n";

    QMessageBox::information(nullptr,"Comandos",mess);
    return a.exec();
}
