#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QColorDialog>
#include <QMouseEvent>

#include "graficos.h"

QT_BEGIN_NAMESPACE
namespace Ui { class Dialog; }
QT_END_NAMESPACE

class Dialog : public QDialog
{
    Q_OBJECT

public:
    Dialog(QWidget *parent = nullptr);
    ~Dialog();

private slots:
    void on_pushButton_clicked(); // dibujar linea

    void on_pushButton_2_clicked(); // seleccionar color

    void on_pushButton_3_clicked();

    void on_pushButton_4_clicked();

    void on_pushButton_5_clicked();

    void on_pushButton_6_clicked();

    void on_pushButton_7_clicked();

    void on_pushButton_8_clicked();

    void on_pushButton_9_clicked();

    void on_pushButton_10_clicked();

private:
    Ui::Dialog *ui;

    void paintEvent(QPaintEvent *evt)override;
    QPainter *Canvas;

    QColor color;

    int x1,y1,x2,y2;
    int xc, yc, radio;
    float rad;
    double factor,th,aumth,aumrad;

    bool linea,DDA,Bes,circuloPitagoras,
    circuloPolar,espiral1,espiralXcYc,espiral2,espital2ThRadio,dragon1a,dragon2a;

    void dragon1();
    void dragon2();
    void generarDragon(QPainter *canvas,bool drag,bool drag2);
    int ejeX[4098], ejeY[4098], paso, signo;

protected:
    void mousePressEvent(QMouseEvent *event) override;
    void mouseReleaseEvent(QMouseEvent *event) override;
    void mouseMoveEvent(QMouseEvent *event)override;

    //void mouseDoubleClickEvent(QMouseEvent *event)override;



};
#endif // DIALOG_H
