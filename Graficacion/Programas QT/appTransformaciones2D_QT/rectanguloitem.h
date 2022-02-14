#ifndef RECTANGULOITEM_H
#define RECTANGULOITEM_H

#include <QObject>
#include <QGraphicsRectItem>
#include <QKeyEvent>
#include <QTimer>
#include <QTransform>
#include <QtMath>
#include <QMessageBox>

class RectanguloItem : public QObject, public QGraphicsRectItem
{
    Q_OBJECT
public:
    explicit RectanguloItem(int ancho = 100, int alto=100);
    void keyPressEvent(QKeyEvent *evento);
signals:
private:
    int ancho, alto;
    QTimer *timer;
    QTimer *timerV;
    QTimer *timerAle;

    QTransform *Traslacion;
    QTransform *Escalacion;
    QTransform *Rotacion;
    bool tras,escala,escalaPF,rota,rotaPF;

    double radianes,sina,cosa;

    double tX,tY;
    double sX,sY;
    double angulo;

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



public slots:
   // void mover();
    //void moverVertical();
    //void moverAleatorio();
};

#endif // RECTANGULOITEM_H
