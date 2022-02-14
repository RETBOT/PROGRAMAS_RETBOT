/********************************************************************************
** Form generated from reading UI file 'dialog.ui'
**
** Created by: Qt User Interface Compiler version 5.15.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_DIALOG_H
#define UI_DIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QCheckBox>
#include <QtWidgets/QDialog>
#include <QtWidgets/QDoubleSpinBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QWidget *widget;
    QPushButton *pushButtonArriba;
    QPushButton *pushButtonDerecha;
    QPushButton *pushButtonAbajo;
    QPushButton *pushButtonIzquierda;
    QPushButton *pushButtonReiniciar;
    QWidget *layoutWidget;
    QVBoxLayout *verticalLayout_10;
    QVBoxLayout *verticalLayout_3;
    QHBoxLayout *horizontalLayout_2;
    QLabel *Disminuir;
    QLabel *Aumentar;
    QHBoxLayout *horizontalLayout;
    QPushButton *pushButtonDisminuir;
    QPushButton *pushButtonAumentar;
    QVBoxLayout *verticalLayout_2;
    QLabel *Traslacion;
    QVBoxLayout *verticalLayout_4;
    QHBoxLayout *horizontalLayout_4;
    QLabel *TY;
    QSpinBox *spinBoxTy;
    QHBoxLayout *horizontalLayout_3;
    QLabel *TX;
    QSpinBox *spinBoxTx;
    QPushButton *pushButtonAnimar;
    QWidget *widget1;
    QVBoxLayout *verticalLayout_12;
    QVBoxLayout *verticalLayout;
    QVBoxLayout *verticalLayout_5;
    QLabel *Ecalacion;
    QVBoxLayout *verticalLayout_6;
    QHBoxLayout *horizontalLayout_5;
    QLabel *label_4;
    QDoubleSpinBox *doubleSpinBoxSX;
    QHBoxLayout *horizontalLayout_6;
    QLabel *label_5;
    QDoubleSpinBox *doubleSpinBoxSY;
    QPushButton *pushButtonEscalar;
    QVBoxLayout *verticalLayout_9;
    QVBoxLayout *verticalLayout_7;
    QHBoxLayout *horizontalLayout_7;
    QLabel *label_7;
    QDoubleSpinBox *doubleSpinBoxPFx;
    QHBoxLayout *horizontalLayout_8;
    QLabel *label_8;
    QDoubleSpinBox *doubleSpinBoxPFy;
    QPushButton *pushButtonEscalacionPF;
    QWidget *widget2;
    QVBoxLayout *verticalLayout_13;
    QVBoxLayout *verticalLayout_8;
    QLabel *labelRotacion;
    QHBoxLayout *horizontalLayout_9;
    QSpinBox *spinBoxAngulo;
    QPushButton *pushButtonRotar;
    QVBoxLayout *verticalLayout_11;
    QHBoxLayout *horizontalLayout_10;
    QLabel *label_10;
    QDoubleSpinBox *doubleSpinBoxPFx_Rotacion;
    QHBoxLayout *horizontalLayout_12;
    QLabel *label_11;
    QDoubleSpinBox *doubleSpinBoxPFy_Rotacion;
    QPushButton *pushButtonRotacionPuntoFijo;
    QWidget *layoutWidget_3;
    QHBoxLayout *horizontalLayout_11;
    QCheckBox *checkBoxTeclado_2;
    QPushButton *pushButtonComandos;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(900, 650);
        widget = new QWidget(Dialog);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(700, 0, 200, 650));
        widget->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 255);"));
        pushButtonArriba = new QPushButton(widget);
        pushButtonArriba->setObjectName(QString::fromUtf8("pushButtonArriba"));
        pushButtonArriba->setGeometry(QRect(70, 160, 75, 23));
        pushButtonDerecha = new QPushButton(widget);
        pushButtonDerecha->setObjectName(QString::fromUtf8("pushButtonDerecha"));
        pushButtonDerecha->setGeometry(QRect(120, 190, 75, 23));
        pushButtonAbajo = new QPushButton(widget);
        pushButtonAbajo->setObjectName(QString::fromUtf8("pushButtonAbajo"));
        pushButtonAbajo->setGeometry(QRect(70, 220, 75, 23));
        pushButtonIzquierda = new QPushButton(widget);
        pushButtonIzquierda->setObjectName(QString::fromUtf8("pushButtonIzquierda"));
        pushButtonIzquierda->setGeometry(QRect(20, 190, 75, 23));
        pushButtonReiniciar = new QPushButton(widget);
        pushButtonReiniciar->setObjectName(QString::fromUtf8("pushButtonReiniciar"));
        pushButtonReiniciar->setGeometry(QRect(110, 600, 75, 23));
        layoutWidget = new QWidget(widget);
        layoutWidget->setObjectName(QString::fromUtf8("layoutWidget"));
        layoutWidget->setGeometry(QRect(20, 10, 171, 141));
        verticalLayout_10 = new QVBoxLayout(layoutWidget);
        verticalLayout_10->setObjectName(QString::fromUtf8("verticalLayout_10"));
        verticalLayout_10->setContentsMargins(0, 0, 0, 0);
        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3->setObjectName(QString::fromUtf8("verticalLayout_3"));
        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2->setObjectName(QString::fromUtf8("horizontalLayout_2"));
        Disminuir = new QLabel(layoutWidget);
        Disminuir->setObjectName(QString::fromUtf8("Disminuir"));

        horizontalLayout_2->addWidget(Disminuir);

        Aumentar = new QLabel(layoutWidget);
        Aumentar->setObjectName(QString::fromUtf8("Aumentar"));

        horizontalLayout_2->addWidget(Aumentar);


        verticalLayout_3->addLayout(horizontalLayout_2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        pushButtonDisminuir = new QPushButton(layoutWidget);
        pushButtonDisminuir->setObjectName(QString::fromUtf8("pushButtonDisminuir"));

        horizontalLayout->addWidget(pushButtonDisminuir);

        pushButtonAumentar = new QPushButton(layoutWidget);
        pushButtonAumentar->setObjectName(QString::fromUtf8("pushButtonAumentar"));

        horizontalLayout->addWidget(pushButtonAumentar);


        verticalLayout_3->addLayout(horizontalLayout);


        verticalLayout_10->addLayout(verticalLayout_3);

        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        Traslacion = new QLabel(layoutWidget);
        Traslacion->setObjectName(QString::fromUtf8("Traslacion"));

        verticalLayout_2->addWidget(Traslacion);

        verticalLayout_4 = new QVBoxLayout();
        verticalLayout_4->setObjectName(QString::fromUtf8("verticalLayout_4"));
        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4->setObjectName(QString::fromUtf8("horizontalLayout_4"));
        TY = new QLabel(layoutWidget);
        TY->setObjectName(QString::fromUtf8("TY"));

        horizontalLayout_4->addWidget(TY);

        spinBoxTy = new QSpinBox(layoutWidget);
        spinBoxTy->setObjectName(QString::fromUtf8("spinBoxTy"));

        horizontalLayout_4->addWidget(spinBoxTy);


        verticalLayout_4->addLayout(horizontalLayout_4);


        verticalLayout_2->addLayout(verticalLayout_4);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setObjectName(QString::fromUtf8("horizontalLayout_3"));
        TX = new QLabel(layoutWidget);
        TX->setObjectName(QString::fromUtf8("TX"));

        horizontalLayout_3->addWidget(TX);

        spinBoxTx = new QSpinBox(layoutWidget);
        spinBoxTx->setObjectName(QString::fromUtf8("spinBoxTx"));

        horizontalLayout_3->addWidget(spinBoxTx);


        verticalLayout_2->addLayout(horizontalLayout_3);


        verticalLayout_10->addLayout(verticalLayout_2);

        pushButtonAnimar = new QPushButton(widget);
        pushButtonAnimar->setObjectName(QString::fromUtf8("pushButtonAnimar"));
        pushButtonAnimar->setGeometry(QRect(20, 600, 75, 23));
        widget1 = new QWidget(widget);
        widget1->setObjectName(QString::fromUtf8("widget1"));
        widget1->setGeometry(QRect(20, 250, 171, 191));
        verticalLayout_12 = new QVBoxLayout(widget1);
        verticalLayout_12->setObjectName(QString::fromUtf8("verticalLayout_12"));
        verticalLayout_12->setContentsMargins(0, 0, 0, 0);
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        verticalLayout_5 = new QVBoxLayout();
        verticalLayout_5->setObjectName(QString::fromUtf8("verticalLayout_5"));
        Ecalacion = new QLabel(widget1);
        Ecalacion->setObjectName(QString::fromUtf8("Ecalacion"));

        verticalLayout_5->addWidget(Ecalacion);

        verticalLayout_6 = new QVBoxLayout();
        verticalLayout_6->setObjectName(QString::fromUtf8("verticalLayout_6"));
        horizontalLayout_5 = new QHBoxLayout();
        horizontalLayout_5->setObjectName(QString::fromUtf8("horizontalLayout_5"));
        label_4 = new QLabel(widget1);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        horizontalLayout_5->addWidget(label_4);

        doubleSpinBoxSX = new QDoubleSpinBox(widget1);
        doubleSpinBoxSX->setObjectName(QString::fromUtf8("doubleSpinBoxSX"));
        doubleSpinBoxSX->setMinimum(1.000000000000000);
        doubleSpinBoxSX->setMaximum(20.000000000000000);

        horizontalLayout_5->addWidget(doubleSpinBoxSX);


        verticalLayout_6->addLayout(horizontalLayout_5);

        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6->setObjectName(QString::fromUtf8("horizontalLayout_6"));
        label_5 = new QLabel(widget1);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        horizontalLayout_6->addWidget(label_5);

        doubleSpinBoxSY = new QDoubleSpinBox(widget1);
        doubleSpinBoxSY->setObjectName(QString::fromUtf8("doubleSpinBoxSY"));
        doubleSpinBoxSY->setMinimum(1.000000000000000);
        doubleSpinBoxSY->setMaximum(20.000000000000000);

        horizontalLayout_6->addWidget(doubleSpinBoxSY);


        verticalLayout_6->addLayout(horizontalLayout_6);


        verticalLayout_5->addLayout(verticalLayout_6);


        verticalLayout->addLayout(verticalLayout_5);

        pushButtonEscalar = new QPushButton(widget1);
        pushButtonEscalar->setObjectName(QString::fromUtf8("pushButtonEscalar"));

        verticalLayout->addWidget(pushButtonEscalar);


        verticalLayout_12->addLayout(verticalLayout);

        verticalLayout_9 = new QVBoxLayout();
        verticalLayout_9->setObjectName(QString::fromUtf8("verticalLayout_9"));
        verticalLayout_7 = new QVBoxLayout();
        verticalLayout_7->setObjectName(QString::fromUtf8("verticalLayout_7"));
        horizontalLayout_7 = new QHBoxLayout();
        horizontalLayout_7->setObjectName(QString::fromUtf8("horizontalLayout_7"));
        label_7 = new QLabel(widget1);
        label_7->setObjectName(QString::fromUtf8("label_7"));

        horizontalLayout_7->addWidget(label_7);

        doubleSpinBoxPFx = new QDoubleSpinBox(widget1);
        doubleSpinBoxPFx->setObjectName(QString::fromUtf8("doubleSpinBoxPFx"));
        doubleSpinBoxPFx->setMinimum(1.000000000000000);
        doubleSpinBoxPFx->setMaximum(20.000000000000000);

        horizontalLayout_7->addWidget(doubleSpinBoxPFx);


        verticalLayout_7->addLayout(horizontalLayout_7);

        horizontalLayout_8 = new QHBoxLayout();
        horizontalLayout_8->setObjectName(QString::fromUtf8("horizontalLayout_8"));
        label_8 = new QLabel(widget1);
        label_8->setObjectName(QString::fromUtf8("label_8"));

        horizontalLayout_8->addWidget(label_8);

        doubleSpinBoxPFy = new QDoubleSpinBox(widget1);
        doubleSpinBoxPFy->setObjectName(QString::fromUtf8("doubleSpinBoxPFy"));
        doubleSpinBoxPFy->setMinimum(1.000000000000000);
        doubleSpinBoxPFy->setMaximum(20.000000000000000);

        horizontalLayout_8->addWidget(doubleSpinBoxPFy);


        verticalLayout_7->addLayout(horizontalLayout_8);


        verticalLayout_9->addLayout(verticalLayout_7);

        pushButtonEscalacionPF = new QPushButton(widget1);
        pushButtonEscalacionPF->setObjectName(QString::fromUtf8("pushButtonEscalacionPF"));

        verticalLayout_9->addWidget(pushButtonEscalacionPF);


        verticalLayout_12->addLayout(verticalLayout_9);

        widget2 = new QWidget(widget);
        widget2->setObjectName(QString::fromUtf8("widget2"));
        widget2->setGeometry(QRect(20, 450, 171, 131));
        verticalLayout_13 = new QVBoxLayout(widget2);
        verticalLayout_13->setObjectName(QString::fromUtf8("verticalLayout_13"));
        verticalLayout_13->setContentsMargins(0, 0, 0, 0);
        verticalLayout_8 = new QVBoxLayout();
        verticalLayout_8->setObjectName(QString::fromUtf8("verticalLayout_8"));
        labelRotacion = new QLabel(widget2);
        labelRotacion->setObjectName(QString::fromUtf8("labelRotacion"));

        verticalLayout_8->addWidget(labelRotacion);

        horizontalLayout_9 = new QHBoxLayout();
        horizontalLayout_9->setObjectName(QString::fromUtf8("horizontalLayout_9"));
        spinBoxAngulo = new QSpinBox(widget2);
        spinBoxAngulo->setObjectName(QString::fromUtf8("spinBoxAngulo"));
        spinBoxAngulo->setMinimum(-360);
        spinBoxAngulo->setMaximum(360);

        horizontalLayout_9->addWidget(spinBoxAngulo);

        pushButtonRotar = new QPushButton(widget2);
        pushButtonRotar->setObjectName(QString::fromUtf8("pushButtonRotar"));

        horizontalLayout_9->addWidget(pushButtonRotar);


        verticalLayout_8->addLayout(horizontalLayout_9);


        verticalLayout_13->addLayout(verticalLayout_8);

        verticalLayout_11 = new QVBoxLayout();
        verticalLayout_11->setObjectName(QString::fromUtf8("verticalLayout_11"));
        horizontalLayout_10 = new QHBoxLayout();
        horizontalLayout_10->setObjectName(QString::fromUtf8("horizontalLayout_10"));
        label_10 = new QLabel(widget2);
        label_10->setObjectName(QString::fromUtf8("label_10"));

        horizontalLayout_10->addWidget(label_10);

        doubleSpinBoxPFx_Rotacion = new QDoubleSpinBox(widget2);
        doubleSpinBoxPFx_Rotacion->setObjectName(QString::fromUtf8("doubleSpinBoxPFx_Rotacion"));
        doubleSpinBoxPFx_Rotacion->setMinimum(-200.000000000000000);
        doubleSpinBoxPFx_Rotacion->setMaximum(200.000000000000000);

        horizontalLayout_10->addWidget(doubleSpinBoxPFx_Rotacion);


        verticalLayout_11->addLayout(horizontalLayout_10);

        horizontalLayout_12 = new QHBoxLayout();
        horizontalLayout_12->setObjectName(QString::fromUtf8("horizontalLayout_12"));
        label_11 = new QLabel(widget2);
        label_11->setObjectName(QString::fromUtf8("label_11"));

        horizontalLayout_12->addWidget(label_11);

        doubleSpinBoxPFy_Rotacion = new QDoubleSpinBox(widget2);
        doubleSpinBoxPFy_Rotacion->setObjectName(QString::fromUtf8("doubleSpinBoxPFy_Rotacion"));
        doubleSpinBoxPFy_Rotacion->setMinimum(-200.000000000000000);
        doubleSpinBoxPFy_Rotacion->setMaximum(200.000000000000000);

        horizontalLayout_12->addWidget(doubleSpinBoxPFy_Rotacion);


        verticalLayout_11->addLayout(horizontalLayout_12);

        pushButtonRotacionPuntoFijo = new QPushButton(widget2);
        pushButtonRotacionPuntoFijo->setObjectName(QString::fromUtf8("pushButtonRotacionPuntoFijo"));

        verticalLayout_11->addWidget(pushButtonRotacionPuntoFijo);


        verticalLayout_13->addLayout(verticalLayout_11);

        layoutWidget_3 = new QWidget(Dialog);
        layoutWidget_3->setObjectName(QString::fromUtf8("layoutWidget_3"));
        layoutWidget_3->setGeometry(QRect(530, 10, 164, 25));
        horizontalLayout_11 = new QHBoxLayout(layoutWidget_3);
        horizontalLayout_11->setObjectName(QString::fromUtf8("horizontalLayout_11"));
        horizontalLayout_11->setContentsMargins(0, 0, 0, 0);
        checkBoxTeclado_2 = new QCheckBox(layoutWidget_3);
        checkBoxTeclado_2->setObjectName(QString::fromUtf8("checkBoxTeclado_2"));

        horizontalLayout_11->addWidget(checkBoxTeclado_2);

        pushButtonComandos = new QPushButton(layoutWidget_3);
        pushButtonComandos->setObjectName(QString::fromUtf8("pushButtonComandos"));

        horizontalLayout_11->addWidget(pushButtonComandos);


        retranslateUi(Dialog);

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        pushButtonArriba->setText(QCoreApplication::translate("Dialog", "^", nullptr));
        pushButtonDerecha->setText(QCoreApplication::translate("Dialog", ">", nullptr));
        pushButtonAbajo->setText(QCoreApplication::translate("Dialog", "v", nullptr));
        pushButtonIzquierda->setText(QCoreApplication::translate("Dialog", "<", nullptr));
        pushButtonReiniciar->setText(QCoreApplication::translate("Dialog", "Reiniciar", nullptr));
        Disminuir->setText(QCoreApplication::translate("Dialog", "        Disminuir ", nullptr));
        Aumentar->setText(QCoreApplication::translate("Dialog", "       Aumentar", nullptr));
        pushButtonDisminuir->setText(QCoreApplication::translate("Dialog", "<---", nullptr));
        pushButtonAumentar->setText(QCoreApplication::translate("Dialog", "---->", nullptr));
        Traslacion->setText(QCoreApplication::translate("Dialog", "Traslaci\303\263n", nullptr));
        TY->setText(QCoreApplication::translate("Dialog", "TY", nullptr));
        TX->setText(QCoreApplication::translate("Dialog", "TX", nullptr));
        pushButtonAnimar->setText(QCoreApplication::translate("Dialog", "Animar", nullptr));
        Ecalacion->setText(QCoreApplication::translate("Dialog", "Escalacion", nullptr));
        label_4->setText(QCoreApplication::translate("Dialog", "SX", nullptr));
        label_5->setText(QCoreApplication::translate("Dialog", "SY", nullptr));
        pushButtonEscalar->setText(QCoreApplication::translate("Dialog", "Escalar", nullptr));
        label_7->setText(QCoreApplication::translate("Dialog", "PFx", nullptr));
        label_8->setText(QCoreApplication::translate("Dialog", "PFy", nullptr));
        pushButtonEscalacionPF->setText(QCoreApplication::translate("Dialog", "Escalacion punto fijo", nullptr));
        labelRotacion->setText(QCoreApplication::translate("Dialog", "Rotacion", nullptr));
        pushButtonRotar->setText(QCoreApplication::translate("Dialog", "Rotar", nullptr));
        label_10->setText(QCoreApplication::translate("Dialog", "PFx", nullptr));
        label_11->setText(QCoreApplication::translate("Dialog", "PFy", nullptr));
        pushButtonRotacionPuntoFijo->setText(QCoreApplication::translate("Dialog", "Rotar punto fijo", nullptr));
        checkBoxTeclado_2->setText(QCoreApplication::translate("Dialog", "Teclado", nullptr));
        pushButtonComandos->setText(QCoreApplication::translate("Dialog", "Lista de comandos", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
