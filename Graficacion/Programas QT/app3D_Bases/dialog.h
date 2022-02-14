#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QPainter>
#include <QtMath>
#include "mapeo.h"
#include <QKeyEvent>
#include <QMessageBox>

QT_BEGIN_NAMESPACE
namespace Ui { class Dialog; }
QT_END_NAMESPACE


#define radianes(g)((double)(g)*M_PI/180.0)

struct Puntos3D{
    int x,y,z;
    bool opcion; //se usa para indicar mover_3D o LineTo_3D
};

class Dialog : public QDialog
{
    Q_OBJECT

public:
    Dialog(QWidget *parent = nullptr);
    ~Dialog();


    void paintEvent(QPaintEvent *evento);
    void keyPressEvent(QKeyEvent *e);

    void asignaCubo();
    void proyeccionCubo();
    void dibujarCubo();
    void inicializaPuerto();
    void lineTo3D(int x, int y, int z, float alpha, float phi, int i);
    void moveTo3D(int x, int y, int z, float alpha, float phi, int i);

private slots:
    void on_dialAlfa_valueChanged(int value);
    void on_dialPhi_valueChanged(int value);
    void on_pushButtonArriba_clicked();
    void on_pushButtonAbajo_clicked();
    void on_pushButtonDerecha_clicked();
    void on_pushButtonIzquierda_clicked();
    void on_pushButtonZmas_clicked();
    void on_pushButtonZmenos_clicked();
    void on_checkBoxTeclado_clicked(bool checked);
    void on_pushButtonRotacionXmas_clicked();
    void on_pushButtonRotacionXmenos_clicked();
    void on_pushButtonRotacionYmas_clicked();
    void on_pushButtonRotacionYmenos_clicked();
    void on_pushButtonRotacionZmas_clicked();
    void on_pushButtonRotacionZmenos_clicked();
    void on_radioButtonCentroCubo_clicked();
    void on_radioButtonFrontal_clicked();
    void on_radioButtonFuera_clicked();
    void on_pushButtonComandos_clicked();

private:
    Ui::Dialog *ui;

    QPainter *canvas;
    QPoint points[16]; // x,y
    Puntos3D *cubo; // x,y,z,opcion

    Mapeo mapeo;
    int L,M;
    int ancho;
    float alpha;
    float phi;

    int tX, tY, tZ;

    // rotacion 3D
    int xC, yC, zC; // centro de las caras del cubo
    bool rX, rY, rZ;
    int anguloX, anguloY, anguloZ;
};
#endif // DIALOG_H
