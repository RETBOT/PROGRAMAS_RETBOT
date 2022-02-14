#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QPainter>

#include "mapeo.h"

QT_BEGIN_NAMESPACE
namespace Ui { class Dialog; }
QT_END_NAMESPACE

class Dialog : public QDialog
{
    Q_OBJECT

public:
    Dialog(QWidget *parent = nullptr);
    ~Dialog();

    void paintEvent(QPaintEvent *e);
    void asignarFigura();
    void dibujarFigura();
    void dibujarFiguraMapeada();

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_3_clicked();

    void on_pushButton_4_clicked();

    void on_horizontalSlider_valueChanged(int value);

private:
    Ui::Dialog *ui;

    QPainter *canvas;

    //float fig[5][3];
    //float figAux[5][3];

    float alaIzq[4][3];
    float alaDer[4][3];
    float recInfe[5][3];
    float motor[5][3];
    float cabina[5][3];
    float ventana[5][3];
    float superior[4][3];

    float alaIzqAux[4][3];
    float alaDerAux[4][3];
    float recInfeAux[5][3];
    float motorAux[5][3];
    float cabinaAux[5][3];
    float ventanaAux[5][3];
    float superiorAux[4][3];

    int ancho; // ancho del area de dibujo
    int centroX,centroY;
    // estrella //cohete
    int XPVMIN,XPVMAX,YPVMIN,YPVMAX;
    // rectangulo
    int rx1,ry1,rAncho,rAlto;

    bool dibujoOrientacionNormal; // y hacia abajo
    bool dibujoMapeado; //y hacia arriba

};
#endif // DIALOG_H
