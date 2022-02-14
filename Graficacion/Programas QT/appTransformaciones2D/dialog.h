#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QPainter>
#include <QKeyEvent>
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
    //void dibujarFigura();// ya no se utilizara
    void dibujarFiguraMapeada();

    void trasladar(int tX,int tY);
    void escalar(float sX,float sY);
    void escalaPuntoFijo(float sX,float sY,int PFx, int PFy);
    void rotacion(int angulo);
    void rotacionPuntoFijo(int angulo, float pfx, float pfy);


private slots:
    void on_pushButtonArriba_clicked();

    void on_pushButtonAbajo_clicked();

    void on_pushButtonDerecha_clicked();

    void on_pushButtonIzquierda_clicked();

    void on_pushButton_clicked();

    void on_pushButtonEscalar_clicked();

    void on_pushButtonEscalacionPF_clicked();

    void on_pushButton_2_clicked();

    void on_pushButtonRotacionPuntoFijo_clicked();

    void on_pushButtonComandos_clicked();

    void on_checkBoxTeclado_clicked(bool checked);

    // Animaciones
    void on_pushButtonAnimacion1_clicked();

    void on_pushButtonAnimacion2_clicked();

    void rotarAnimacion1();

    void rotarAnimacion2();

private:
    Ui::Dialog *ui;

    QPainter *canvas;

    float Fig[4][3];
    float FigAux[4][3];

    int ancho; // ancho del area de dibujo
    int centroX,centroY;

    bool dibujoOrientacionNormal; // y hacia abajo
    bool dibujoMapeado; //y hacia arriba

    //traslacion
    int tx,ty;

    QTimer *timer1, *timer2;

};
#endif // DIALOG_H
