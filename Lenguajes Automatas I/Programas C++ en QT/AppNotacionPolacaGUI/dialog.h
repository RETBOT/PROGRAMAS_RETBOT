#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include "notacionpolaca.h"

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
    void on_pushButtonConvertir_clicked();

    void on_pushButtonSolucion_clicked();

    void on_pushButtonDSAQS_clicked();

    void on_pushButtonDigitos_clicked();

private:
    Ui::Dialog *ui;
    NotacionPolaca *expresion = new NotacionPolaca();
};
#endif // DIALOG_H
