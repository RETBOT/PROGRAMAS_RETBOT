#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include "archivo.h"
#include <iostream>
#include <string>
using namespace std;

#include <string.h>
#include <stdlib.h>
#include <Windows.h>

#include <stdio.h>
#include <cstring>
#include <QInputDialog>
#include "lexico.h"

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
    void on_pushButConvertir_clicked(); // convertir a lexico
    void on_pushButAbrir_clicked(); // arbir documento
    void on_pushButBorrar_clicked(); // borrar texto
    void on_pushButGuardar_clicked(); // guardar texto en documento

private:
    Ui::Dialog *ui;
};
#endif // DIALOG_H
