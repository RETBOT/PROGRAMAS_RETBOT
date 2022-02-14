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
#include <QtWidgets/QDial>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLCDNumber>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QWidget *widget;
    QWidget *layoutWidget;
    QHBoxLayout *horizontalLayout_5;
    QVBoxLayout *verticalLayout_2;
    QLabel *label;
    QHBoxLayout *horizontalLayout;
    QDial *dialAlfa;
    QLCDNumber *lcdNumberAlfa;
    QVBoxLayout *verticalLayout;
    QLabel *label_2;
    QHBoxLayout *horizontalLayout_3;
    QDial *dialPhi;
    QLCDNumber *lcdNumberPhi;
    QWidget *layoutWidget1;
    QVBoxLayout *verticalLayout_4;
    QLabel *labelTraslacion;
    QHBoxLayout *horizontalLayout_2;
    QPushButton *pushButtonZmas;
    QPushButton *pushButtonArriba;
    QPushButton *pushButtonZmenos;
    QHBoxLayout *horizontalLayout_4;
    QPushButton *pushButtonIzquierda;
    QPushButton *pushButtonAbajo;
    QPushButton *pushButtonDerecha;
    QWidget *widget1;
    QVBoxLayout *verticalLayout_5;
    QRadioButton *radioButtonCentroCubo;
    QRadioButton *radioButtonFrontal;
    QRadioButton *radioButtonFuera;
    QWidget *widget2;
    QVBoxLayout *verticalLayout_6;
    QLabel *labelRotacion;
    QVBoxLayout *verticalLayout_3;
    QHBoxLayout *horizontalLayout_6;
    QLabel *labelRotacionX;
    QPushButton *pushButtonRotacionXmas;
    QPushButton *pushButtonRotacionXmenos;
    QHBoxLayout *horizontalLayout_7;
    QLabel *labelRotacionY;
    QPushButton *pushButtonRotacionYmas;
    QPushButton *pushButtonRotacionYmenos;
    QHBoxLayout *horizontalLayout_8;
    QLabel *labelRotacionZ;
    QPushButton *pushButtonRotacionZmas;
    QPushButton *pushButtonRotacionZmenos;
    QWidget *widget3;
    QHBoxLayout *horizontalLayout_9;
    QCheckBox *checkBoxTeclado;
    QPushButton *pushButtonComandos;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(700, 550);
        Dialog->setAutoFillBackground(false);
        widget = new QWidget(Dialog);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(500, 0, 200, 500));
        widget->setStyleSheet(QString::fromUtf8("background-color: rgb(35, 15, 255);"));
        layoutWidget = new QWidget(widget);
        layoutWidget->setObjectName(QString::fromUtf8("layoutWidget"));
        layoutWidget->setGeometry(QRect(30, 20, 154, 131));
        horizontalLayout_5 = new QHBoxLayout(layoutWidget);
        horizontalLayout_5->setObjectName(QString::fromUtf8("horizontalLayout_5"));
        horizontalLayout_5->setContentsMargins(0, 0, 0, 0);
        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        label = new QLabel(layoutWidget);
        label->setObjectName(QString::fromUtf8("label"));
        label->setAlignment(Qt::AlignCenter);

        verticalLayout_2->addWidget(label);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        dialAlfa = new QDial(layoutWidget);
        dialAlfa->setObjectName(QString::fromUtf8("dialAlfa"));
        dialAlfa->setMaximum(180);

        horizontalLayout->addWidget(dialAlfa);


        verticalLayout_2->addLayout(horizontalLayout);

        lcdNumberAlfa = new QLCDNumber(layoutWidget);
        lcdNumberAlfa->setObjectName(QString::fromUtf8("lcdNumberAlfa"));

        verticalLayout_2->addWidget(lcdNumberAlfa);


        horizontalLayout_5->addLayout(verticalLayout_2);

        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        label_2 = new QLabel(layoutWidget);
        label_2->setObjectName(QString::fromUtf8("label_2"));
        label_2->setAlignment(Qt::AlignCenter);

        verticalLayout->addWidget(label_2);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setObjectName(QString::fromUtf8("horizontalLayout_3"));
        dialPhi = new QDial(layoutWidget);
        dialPhi->setObjectName(QString::fromUtf8("dialPhi"));
        dialPhi->setMaximum(90);

        horizontalLayout_3->addWidget(dialPhi);


        verticalLayout->addLayout(horizontalLayout_3);

        lcdNumberPhi = new QLCDNumber(layoutWidget);
        lcdNumberPhi->setObjectName(QString::fromUtf8("lcdNumberPhi"));

        verticalLayout->addWidget(lcdNumberPhi);


        horizontalLayout_5->addLayout(verticalLayout);

        layoutWidget1 = new QWidget(widget);
        layoutWidget1->setObjectName(QString::fromUtf8("layoutWidget1"));
        layoutWidget1->setGeometry(QRect(20, 170, 171, 77));
        verticalLayout_4 = new QVBoxLayout(layoutWidget1);
        verticalLayout_4->setObjectName(QString::fromUtf8("verticalLayout_4"));
        verticalLayout_4->setContentsMargins(0, 0, 0, 0);
        labelTraslacion = new QLabel(layoutWidget1);
        labelTraslacion->setObjectName(QString::fromUtf8("labelTraslacion"));

        verticalLayout_4->addWidget(labelTraslacion);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2->setObjectName(QString::fromUtf8("horizontalLayout_2"));
        pushButtonZmas = new QPushButton(layoutWidget1);
        pushButtonZmas->setObjectName(QString::fromUtf8("pushButtonZmas"));

        horizontalLayout_2->addWidget(pushButtonZmas);

        pushButtonArriba = new QPushButton(layoutWidget1);
        pushButtonArriba->setObjectName(QString::fromUtf8("pushButtonArriba"));

        horizontalLayout_2->addWidget(pushButtonArriba);

        pushButtonZmenos = new QPushButton(layoutWidget1);
        pushButtonZmenos->setObjectName(QString::fromUtf8("pushButtonZmenos"));

        horizontalLayout_2->addWidget(pushButtonZmenos);


        verticalLayout_4->addLayout(horizontalLayout_2);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4->setObjectName(QString::fromUtf8("horizontalLayout_4"));
        pushButtonIzquierda = new QPushButton(layoutWidget1);
        pushButtonIzquierda->setObjectName(QString::fromUtf8("pushButtonIzquierda"));

        horizontalLayout_4->addWidget(pushButtonIzquierda);

        pushButtonAbajo = new QPushButton(layoutWidget1);
        pushButtonAbajo->setObjectName(QString::fromUtf8("pushButtonAbajo"));

        horizontalLayout_4->addWidget(pushButtonAbajo);

        pushButtonDerecha = new QPushButton(layoutWidget1);
        pushButtonDerecha->setObjectName(QString::fromUtf8("pushButtonDerecha"));

        horizontalLayout_4->addWidget(pushButtonDerecha);


        verticalLayout_4->addLayout(horizontalLayout_4);

        widget1 = new QWidget(widget);
        widget1->setObjectName(QString::fromUtf8("widget1"));
        widget1->setGeometry(QRect(20, 400, 161, 61));
        verticalLayout_5 = new QVBoxLayout(widget1);
        verticalLayout_5->setObjectName(QString::fromUtf8("verticalLayout_5"));
        verticalLayout_5->setContentsMargins(0, 0, 0, 0);
        radioButtonCentroCubo = new QRadioButton(widget1);
        radioButtonCentroCubo->setObjectName(QString::fromUtf8("radioButtonCentroCubo"));

        verticalLayout_5->addWidget(radioButtonCentroCubo);

        radioButtonFrontal = new QRadioButton(widget1);
        radioButtonFrontal->setObjectName(QString::fromUtf8("radioButtonFrontal"));

        verticalLayout_5->addWidget(radioButtonFrontal);

        radioButtonFuera = new QRadioButton(widget1);
        radioButtonFuera->setObjectName(QString::fromUtf8("radioButtonFuera"));

        verticalLayout_5->addWidget(radioButtonFuera);

        widget2 = new QWidget(widget);
        widget2->setObjectName(QString::fromUtf8("widget2"));
        widget2->setGeometry(QRect(20, 270, 174, 110));
        verticalLayout_6 = new QVBoxLayout(widget2);
        verticalLayout_6->setObjectName(QString::fromUtf8("verticalLayout_6"));
        verticalLayout_6->setContentsMargins(0, 0, 0, 0);
        labelRotacion = new QLabel(widget2);
        labelRotacion->setObjectName(QString::fromUtf8("labelRotacion"));

        verticalLayout_6->addWidget(labelRotacion);

        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3->setObjectName(QString::fromUtf8("verticalLayout_3"));
        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6->setObjectName(QString::fromUtf8("horizontalLayout_6"));
        labelRotacionX = new QLabel(widget2);
        labelRotacionX->setObjectName(QString::fromUtf8("labelRotacionX"));

        horizontalLayout_6->addWidget(labelRotacionX);

        pushButtonRotacionXmas = new QPushButton(widget2);
        pushButtonRotacionXmas->setObjectName(QString::fromUtf8("pushButtonRotacionXmas"));

        horizontalLayout_6->addWidget(pushButtonRotacionXmas);

        pushButtonRotacionXmenos = new QPushButton(widget2);
        pushButtonRotacionXmenos->setObjectName(QString::fromUtf8("pushButtonRotacionXmenos"));

        horizontalLayout_6->addWidget(pushButtonRotacionXmenos);


        verticalLayout_3->addLayout(horizontalLayout_6);

        horizontalLayout_7 = new QHBoxLayout();
        horizontalLayout_7->setObjectName(QString::fromUtf8("horizontalLayout_7"));
        labelRotacionY = new QLabel(widget2);
        labelRotacionY->setObjectName(QString::fromUtf8("labelRotacionY"));

        horizontalLayout_7->addWidget(labelRotacionY);

        pushButtonRotacionYmas = new QPushButton(widget2);
        pushButtonRotacionYmas->setObjectName(QString::fromUtf8("pushButtonRotacionYmas"));

        horizontalLayout_7->addWidget(pushButtonRotacionYmas);

        pushButtonRotacionYmenos = new QPushButton(widget2);
        pushButtonRotacionYmenos->setObjectName(QString::fromUtf8("pushButtonRotacionYmenos"));

        horizontalLayout_7->addWidget(pushButtonRotacionYmenos);


        verticalLayout_3->addLayout(horizontalLayout_7);

        horizontalLayout_8 = new QHBoxLayout();
        horizontalLayout_8->setObjectName(QString::fromUtf8("horizontalLayout_8"));
        labelRotacionZ = new QLabel(widget2);
        labelRotacionZ->setObjectName(QString::fromUtf8("labelRotacionZ"));

        horizontalLayout_8->addWidget(labelRotacionZ);

        pushButtonRotacionZmas = new QPushButton(widget2);
        pushButtonRotacionZmas->setObjectName(QString::fromUtf8("pushButtonRotacionZmas"));

        horizontalLayout_8->addWidget(pushButtonRotacionZmas);

        pushButtonRotacionZmenos = new QPushButton(widget2);
        pushButtonRotacionZmenos->setObjectName(QString::fromUtf8("pushButtonRotacionZmenos"));

        horizontalLayout_8->addWidget(pushButtonRotacionZmenos);


        verticalLayout_3->addLayout(horizontalLayout_8);


        verticalLayout_6->addLayout(verticalLayout_3);

        widget3 = new QWidget(Dialog);
        widget3->setObjectName(QString::fromUtf8("widget3"));
        widget3->setGeometry(QRect(510, 520, 161, 25));
        horizontalLayout_9 = new QHBoxLayout(widget3);
        horizontalLayout_9->setObjectName(QString::fromUtf8("horizontalLayout_9"));
        horizontalLayout_9->setContentsMargins(0, 0, 0, 0);
        checkBoxTeclado = new QCheckBox(widget3);
        checkBoxTeclado->setObjectName(QString::fromUtf8("checkBoxTeclado"));

        horizontalLayout_9->addWidget(checkBoxTeclado);

        pushButtonComandos = new QPushButton(widget3);
        pushButtonComandos->setObjectName(QString::fromUtf8("pushButtonComandos"));

        horizontalLayout_9->addWidget(pushButtonComandos);


        retranslateUi(Dialog);
        QObject::connect(dialAlfa, SIGNAL(valueChanged(int)), lcdNumberAlfa, SLOT(display(int)));
        QObject::connect(dialPhi, SIGNAL(valueChanged(int)), lcdNumberPhi, SLOT(display(int)));

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        label->setText(QCoreApplication::translate("Dialog", "ALFA", nullptr));
        label_2->setText(QCoreApplication::translate("Dialog", "PHI", nullptr));
        labelTraslacion->setText(QCoreApplication::translate("Dialog", "TRASLACION", nullptr));
        pushButtonZmas->setText(QCoreApplication::translate("Dialog", "Z+", nullptr));
        pushButtonArriba->setText(QCoreApplication::translate("Dialog", "^", nullptr));
        pushButtonZmenos->setText(QCoreApplication::translate("Dialog", "Z-", nullptr));
        pushButtonIzquierda->setText(QCoreApplication::translate("Dialog", "<", nullptr));
        pushButtonAbajo->setText(QCoreApplication::translate("Dialog", "v", nullptr));
        pushButtonDerecha->setText(QCoreApplication::translate("Dialog", ">", nullptr));
        radioButtonCentroCubo->setText(QCoreApplication::translate("Dialog", "Centro del cubo", nullptr));
        radioButtonFrontal->setText(QCoreApplication::translate("Dialog", "Eje frontal del cubo", nullptr));
        radioButtonFuera->setText(QCoreApplication::translate("Dialog", "Fuera del cubo", nullptr));
        labelRotacion->setText(QCoreApplication::translate("Dialog", " ROTACION", nullptr));
        labelRotacionX->setText(QCoreApplication::translate("Dialog", "X", nullptr));
        pushButtonRotacionXmas->setText(QCoreApplication::translate("Dialog", "+", nullptr));
        pushButtonRotacionXmenos->setText(QCoreApplication::translate("Dialog", "-", nullptr));
        labelRotacionY->setText(QCoreApplication::translate("Dialog", "Y", nullptr));
        pushButtonRotacionYmas->setText(QCoreApplication::translate("Dialog", "+", nullptr));
        pushButtonRotacionYmenos->setText(QCoreApplication::translate("Dialog", "-", nullptr));
        labelRotacionZ->setText(QCoreApplication::translate("Dialog", "Z", nullptr));
        pushButtonRotacionZmas->setText(QCoreApplication::translate("Dialog", "+", nullptr));
        pushButtonRotacionZmenos->setText(QCoreApplication::translate("Dialog", "-", nullptr));
        checkBoxTeclado->setText(QCoreApplication::translate("Dialog", "Teclado", nullptr));
        pushButtonComandos->setText(QCoreApplication::translate("Dialog", "Comandos", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
