#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QTimer>
#include <QtGui>

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
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_4_clicked();

    void on_pushButton_5_clicked();

    void on_pushButton_6_clicked();

    void moverEtiquetaHorizontal();

    void moverEtiquetaVertical();

    void moverEtiquetaAleatorio();

    void moverEtiquetaRecorrido();


private:
    Ui::Dialog *ui;

    QTimer *timerH;
    QTimer *timerV;
    QTimer *timerA;
    QTimer *timerR;
};
#endif // DIALOG_H
