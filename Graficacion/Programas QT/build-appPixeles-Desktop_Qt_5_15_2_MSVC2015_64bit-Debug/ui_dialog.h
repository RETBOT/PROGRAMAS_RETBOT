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
#include <QtWidgets/QDialog>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QSlider>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QWidget *layoutWidget;
    QHBoxLayout *horizontalLayout;
    QPushButton *buttIniciar;
    QPushButton *butDetener;
    QPushButton *butSalir;
    QWidget *layoutWidget1;
    QVBoxLayout *verticalLayout_4;
    QHBoxLayout *horizontalLayout_4;
    QLabel *label_4;
    QLabel *label_5;
    QHBoxLayout *horizontalLayout_3;
    QHBoxLayout *horizontalLayout_2;
    QVBoxLayout *verticalLayout;
    QLabel *label;
    QLabel *label_2;
    QLabel *label_3;
    QVBoxLayout *verticalLayout_2;
    QSlider *sliderRojo;
    QSlider *sliderVerde;
    QSlider *sliderAzul;
    QVBoxLayout *verticalLayout_3;
    QLabel *valorRojo;
    QLabel *valorVerde;
    QLabel *valorAzul;
    QWidget *widget;
    QHBoxLayout *horizontalLayout_5;
    QVBoxLayout *verticalLayout_6;
    QRadioButton *radioButPantalla;
    QRadioButton *radioButCuadrado;
    QVBoxLayout *verticalLayout_5;
    QRadioButton *radioButton_1;
    QRadioButton *radioButton_2;
    QVBoxLayout *verticalLayout_7;
    QRadioButton *radioButton_3;
    QRadioButton *radioButton_4;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(854, 593);
        layoutWidget = new QWidget(Dialog);
        layoutWidget->setObjectName(QString::fromUtf8("layoutWidget"));
        layoutWidget->setGeometry(QRect(10, 490, 491, 25));
        horizontalLayout = new QHBoxLayout(layoutWidget);
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        buttIniciar = new QPushButton(layoutWidget);
        buttIniciar->setObjectName(QString::fromUtf8("buttIniciar"));

        horizontalLayout->addWidget(buttIniciar);

        butDetener = new QPushButton(layoutWidget);
        butDetener->setObjectName(QString::fromUtf8("butDetener"));

        horizontalLayout->addWidget(butDetener);

        butSalir = new QPushButton(layoutWidget);
        butSalir->setObjectName(QString::fromUtf8("butSalir"));

        horizontalLayout->addWidget(butSalir);

        layoutWidget1 = new QWidget(Dialog);
        layoutWidget1->setObjectName(QString::fromUtf8("layoutWidget1"));
        layoutWidget1->setGeometry(QRect(520, 480, 321, 107));
        verticalLayout_4 = new QVBoxLayout(layoutWidget1);
        verticalLayout_4->setObjectName(QString::fromUtf8("verticalLayout_4"));
        verticalLayout_4->setContentsMargins(0, 0, 0, 0);
        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4->setObjectName(QString::fromUtf8("horizontalLayout_4"));
        label_4 = new QLabel(layoutWidget1);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        horizontalLayout_4->addWidget(label_4);

        label_5 = new QLabel(layoutWidget1);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        horizontalLayout_4->addWidget(label_5);


        verticalLayout_4->addLayout(horizontalLayout_4);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setObjectName(QString::fromUtf8("horizontalLayout_3"));
        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2->setObjectName(QString::fromUtf8("horizontalLayout_2"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        label = new QLabel(layoutWidget1);
        label->setObjectName(QString::fromUtf8("label"));

        verticalLayout->addWidget(label);

        label_2 = new QLabel(layoutWidget1);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        verticalLayout->addWidget(label_2);

        label_3 = new QLabel(layoutWidget1);
        label_3->setObjectName(QString::fromUtf8("label_3"));

        verticalLayout->addWidget(label_3);


        horizontalLayout_2->addLayout(verticalLayout);

        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        sliderRojo = new QSlider(layoutWidget1);
        sliderRojo->setObjectName(QString::fromUtf8("sliderRojo"));
        sliderRojo->setMaximum(255);
        sliderRojo->setOrientation(Qt::Horizontal);

        verticalLayout_2->addWidget(sliderRojo);

        sliderVerde = new QSlider(layoutWidget1);
        sliderVerde->setObjectName(QString::fromUtf8("sliderVerde"));
        sliderVerde->setMaximum(255);
        sliderVerde->setOrientation(Qt::Horizontal);

        verticalLayout_2->addWidget(sliderVerde);

        sliderAzul = new QSlider(layoutWidget1);
        sliderAzul->setObjectName(QString::fromUtf8("sliderAzul"));
        sliderAzul->setMaximum(255);
        sliderAzul->setOrientation(Qt::Horizontal);

        verticalLayout_2->addWidget(sliderAzul);


        horizontalLayout_2->addLayout(verticalLayout_2);


        horizontalLayout_3->addLayout(horizontalLayout_2);

        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3->setObjectName(QString::fromUtf8("verticalLayout_3"));
        valorRojo = new QLabel(layoutWidget1);
        valorRojo->setObjectName(QString::fromUtf8("valorRojo"));

        verticalLayout_3->addWidget(valorRojo);

        valorVerde = new QLabel(layoutWidget1);
        valorVerde->setObjectName(QString::fromUtf8("valorVerde"));

        verticalLayout_3->addWidget(valorVerde);

        valorAzul = new QLabel(layoutWidget1);
        valorAzul->setObjectName(QString::fromUtf8("valorAzul"));

        verticalLayout_3->addWidget(valorAzul);


        horizontalLayout_3->addLayout(verticalLayout_3);


        verticalLayout_4->addLayout(horizontalLayout_3);

        widget = new QWidget(Dialog);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(20, 540, 471, 44));
        horizontalLayout_5 = new QHBoxLayout(widget);
        horizontalLayout_5->setObjectName(QString::fromUtf8("horizontalLayout_5"));
        horizontalLayout_5->setContentsMargins(0, 0, 0, 0);
        verticalLayout_6 = new QVBoxLayout();
        verticalLayout_6->setObjectName(QString::fromUtf8("verticalLayout_6"));
        radioButPantalla = new QRadioButton(widget);
        radioButPantalla->setObjectName(QString::fromUtf8("radioButPantalla"));

        verticalLayout_6->addWidget(radioButPantalla);

        radioButCuadrado = new QRadioButton(widget);
        radioButCuadrado->setObjectName(QString::fromUtf8("radioButCuadrado"));

        verticalLayout_6->addWidget(radioButCuadrado);


        horizontalLayout_5->addLayout(verticalLayout_6);

        verticalLayout_5 = new QVBoxLayout();
        verticalLayout_5->setObjectName(QString::fromUtf8("verticalLayout_5"));
        radioButton_1 = new QRadioButton(widget);
        radioButton_1->setObjectName(QString::fromUtf8("radioButton_1"));

        verticalLayout_5->addWidget(radioButton_1);

        radioButton_2 = new QRadioButton(widget);
        radioButton_2->setObjectName(QString::fromUtf8("radioButton_2"));

        verticalLayout_5->addWidget(radioButton_2);


        horizontalLayout_5->addLayout(verticalLayout_5);

        verticalLayout_7 = new QVBoxLayout();
        verticalLayout_7->setObjectName(QString::fromUtf8("verticalLayout_7"));
        radioButton_3 = new QRadioButton(widget);
        radioButton_3->setObjectName(QString::fromUtf8("radioButton_3"));

        verticalLayout_7->addWidget(radioButton_3);

        radioButton_4 = new QRadioButton(widget);
        radioButton_4->setObjectName(QString::fromUtf8("radioButton_4"));

        verticalLayout_7->addWidget(radioButton_4);


        horizontalLayout_5->addLayout(verticalLayout_7);


        retranslateUi(Dialog);

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        buttIniciar->setText(QCoreApplication::translate("Dialog", "Iniciar", nullptr));
        butDetener->setText(QCoreApplication::translate("Dialog", "Detener", nullptr));
        butSalir->setText(QCoreApplication::translate("Dialog", "Salir", nullptr));
        label_4->setText(QCoreApplication::translate("Dialog", "Colores                                                                                   ", nullptr));
        label_5->setText(QCoreApplication::translate("Dialog", "Valor", nullptr));
        label->setText(QCoreApplication::translate("Dialog", "Rojo", nullptr));
        label_2->setText(QCoreApplication::translate("Dialog", "Verde", nullptr));
        label_3->setText(QCoreApplication::translate("Dialog", "Azul", nullptr));
        valorRojo->setText(QString());
        valorVerde->setText(QString());
        valorAzul->setText(QString());
        radioButPantalla->setText(QCoreApplication::translate("Dialog", "Puntos por toda la pantalla", nullptr));
        radioButCuadrado->setText(QCoreApplication::translate("Dialog", "Cuadrado", nullptr));
        radioButton_1->setText(QCoreApplication::translate("Dialog", "Cuadrado secci\303\263n 1", nullptr));
        radioButton_2->setText(QCoreApplication::translate("Dialog", "Cuadrado secci\303\263n 2", nullptr));
        radioButton_3->setText(QCoreApplication::translate("Dialog", "Cuadrado secci\303\263n 3", nullptr));
        radioButton_4->setText(QCoreApplication::translate("Dialog", "Cuadrado secci\303\263n 4", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
