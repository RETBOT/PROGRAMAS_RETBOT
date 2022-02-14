#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QPainter>
#include <QKeyEvent>

#include <QGraphicsRectItem>
#include <QTimer>
#include <QTransform>
#include <QtMath>
#include <QMessageBox>
#include <QTimer>

#include "mapeo.h"
#include "matrix.h"

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
    void keyPressEvent(QKeyEvent *evento);
    void asignarFigura();
    void dibujarFiguraMapeada();


    void trasladar(int tX,int tY);
    void escalar(float sX,float sY);
    void escalaPuntoFijo(float sX,float sY,int PFx, int PFy);
    void rotacion(int angulo);
    void rotacionPuntoFijo(int angulo, float pfx, float pfy);


private slots:
    void on_pushButtonDisminuir_clicked();
    void on_pushButtonAumentar_clicked();
    void on_pushButtonArriba_clicked();
    void on_pushButtonIzquierda_clicked();
    void on_pushButtonDerecha_clicked();
    void on_pushButtonAbajo_clicked();
    void on_pushButtonEscalar_clicked();
    void on_pushButtonReiniciar_clicked();
    void on_pushButtonEscalacionPF_clicked();
    void on_pushButtonRotar_clicked();
    void on_pushButtonComandos_clicked();
    void on_checkBoxTeclado_2_clicked(bool checked);
    void on_pushButtonAnimar_clicked();
    void on_pushButtonRotacionPuntoFijo_clicked();
    void animar();

private:
    Ui::Dialog *ui;

    QPainter *canvas;

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
    //cohete
    int XPVMIN,XPVMAX,YPVMIN,YPVMAX;

    bool dibujoOrientacionNormal; // y hacia abajo
    bool dibujoMapeado; //y hacia arriba

    //traslacion
    int tx,ty;

    QTransform *Traslacion;
    QTransform *Escalacion;
    QTransform *Rotacion;

    bool tras,escala,rota;

    double radianes,sina,cosa;

     QTimer *timer;
};
#endif // DIALOG_H
