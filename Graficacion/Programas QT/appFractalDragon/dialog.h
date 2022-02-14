#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>

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
    void on_pushButton_2_clicked();

    void on_radioButtonDragon2_clicked();

    void on_radioButtonDragon1_clicked();

    void on_radioButtonHenon_clicked();

    void on_radioButtonMalhus1_clicked();

    void on_radioButtonMalhus2_clicked();

    void on_radioButtonMandel_clicked();

private:
    Ui::Dialog *ui;

    void paintEvent(QPaintEvent *e) override;
    void dragon();
    void generarDragon(QPainter *canvas);
    int ejeX[4098], ejeY[4098], paso, signo;
    bool dragon1, dragon2;

    //henon
    int maxX,maxY;
    double EscalaX,EscalaY,DespX,DespY;
    void henon();
    void ExtranioConfinador(QPainter *canvas);
    bool dhenon;

    //Malthus1
    void malthus1();
    void ExtranioConfinadorMalthus1(QPainter *canvas);
    bool dmalthus1;

    //Malthus2
    void malthus2();
    void ExtranioConfinadorMalthus2(QPainter *canvas);
    bool dmalthus2;

    //Mandel
    int maxXMandel,maxYMandel,Limite,i,j,Pasos, Terminar;
    double PasoX,PasoY,PosX,PosY,OrigX,OrigY,DimX,DimY,IterX,IterY,TempX;
    void mandel();
    bool dmandel;


};
#endif // DIALOG_H
