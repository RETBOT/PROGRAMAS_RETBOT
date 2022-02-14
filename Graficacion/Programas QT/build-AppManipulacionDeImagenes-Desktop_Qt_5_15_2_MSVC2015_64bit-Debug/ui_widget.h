/********************************************************************************
** Form generated from reading UI file 'widget.ui'
**
** Created by: Qt User Interface Compiler version 5.15.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_WIDGET_H
#define UI_WIDGET_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QDial>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Widget
{
public:
    QPushButton *pushButModificar;
    QWidget *widget;
    QVBoxLayout *verticalLayout_5;
    QLabel *label_6;
    QVBoxLayout *verticalLayout_3;
    QVBoxLayout *verticalLayout_7;
    QHBoxLayout *horizontalLayout_4;
    QDial *dialR;
    QDial *dialG;
    QDial *dialB;
    QHBoxLayout *horizontalLayout_6;
    QLabel *label_3;
    QLabel *label_4;
    QLabel *label_5;
    QVBoxLayout *verticalLayout_4;
    QHBoxLayout *horizontalLayout_5;
    QRadioButton *radioButFiltrar;
    QRadioButton *radioButNoFiltrar;
    QRadioButton *radioButSobrePoner;
    QWidget *widget1;
    QHBoxLayout *horizontalLayout;
    QLabel *label;
    QPushButton *pushButAbrirImagen;
    QWidget *widget2;
    QHBoxLayout *horizontalLayout_2;
    QLabel *imagen;
    QLabel *imagenModificada;
    QWidget *widget3;
    QVBoxLayout *verticalLayout_2;
    QLabel *label_2;
    QHBoxLayout *horizontalLayout_3;
    QVBoxLayout *Filtros;
    QRadioButton *radioButAnd;
    QRadioButton *radioButWalden;
    QRadioButton *radioButLux;
    QRadioButton *radioButAmaro;
    QRadioButton *radioButHudson;
    QVBoxLayout *verticalLayout;
    QRadioButton *radioButOr;
    QRadioButton *radioButRojos;
    QRadioButton *radioButRojointenso;
    QRadioButton *radioButVerdes;
    QRadioButton *radioButVerdeIntenso;
    QVBoxLayout *verticalLayout_6;
    QRadioButton *radioButXor;
    QRadioButton *radioButAzulintenso;
    QRadioButton *radioButRyV;
    QRadioButton *radioButGris;
    QRadioButton *radioButMiFiltro;

    void setupUi(QWidget *Widget)
    {
        if (Widget->objectName().isEmpty())
            Widget->setObjectName(QString::fromUtf8("Widget"));
        Widget->resize(800, 610);
        pushButModificar = new QPushButton(Widget);
        pushButModificar->setObjectName(QString::fromUtf8("pushButModificar"));
        pushButModificar->setGeometry(QRect(190, 580, 441, 23));
        widget = new QWidget(Widget);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(470, 440, 311, 131));
        verticalLayout_5 = new QVBoxLayout(widget);
        verticalLayout_5->setObjectName(QString::fromUtf8("verticalLayout_5"));
        verticalLayout_5->setContentsMargins(0, 0, 0, 0);
        label_6 = new QLabel(widget);
        label_6->setObjectName(QString::fromUtf8("label_6"));

        verticalLayout_5->addWidget(label_6);

        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3->setObjectName(QString::fromUtf8("verticalLayout_3"));
        verticalLayout_7 = new QVBoxLayout();
        verticalLayout_7->setObjectName(QString::fromUtf8("verticalLayout_7"));
        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4->setObjectName(QString::fromUtf8("horizontalLayout_4"));
        dialR = new QDial(widget);
        dialR->setObjectName(QString::fromUtf8("dialR"));
        dialR->setMaximum(200);
        dialR->setValue(20);

        horizontalLayout_4->addWidget(dialR);

        dialG = new QDial(widget);
        dialG->setObjectName(QString::fromUtf8("dialG"));
        dialG->setMaximum(200);
        dialG->setValue(20);

        horizontalLayout_4->addWidget(dialG);

        dialB = new QDial(widget);
        dialB->setObjectName(QString::fromUtf8("dialB"));
        dialB->setMaximum(200);
        dialB->setValue(20);

        horizontalLayout_4->addWidget(dialB);


        verticalLayout_7->addLayout(horizontalLayout_4);

        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6->setObjectName(QString::fromUtf8("horizontalLayout_6"));
        label_3 = new QLabel(widget);
        label_3->setObjectName(QString::fromUtf8("label_3"));

        horizontalLayout_6->addWidget(label_3);

        label_4 = new QLabel(widget);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        horizontalLayout_6->addWidget(label_4);

        label_5 = new QLabel(widget);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        horizontalLayout_6->addWidget(label_5);


        verticalLayout_7->addLayout(horizontalLayout_6);


        verticalLayout_3->addLayout(verticalLayout_7);


        verticalLayout_5->addLayout(verticalLayout_3);

        verticalLayout_4 = new QVBoxLayout();
        verticalLayout_4->setObjectName(QString::fromUtf8("verticalLayout_4"));
        horizontalLayout_5 = new QHBoxLayout();
        horizontalLayout_5->setObjectName(QString::fromUtf8("horizontalLayout_5"));
        radioButFiltrar = new QRadioButton(widget);
        radioButFiltrar->setObjectName(QString::fromUtf8("radioButFiltrar"));
        radioButFiltrar->setChecked(true);

        horizontalLayout_5->addWidget(radioButFiltrar);

        radioButNoFiltrar = new QRadioButton(widget);
        radioButNoFiltrar->setObjectName(QString::fromUtf8("radioButNoFiltrar"));

        horizontalLayout_5->addWidget(radioButNoFiltrar);

        radioButSobrePoner = new QRadioButton(widget);
        radioButSobrePoner->setObjectName(QString::fromUtf8("radioButSobrePoner"));

        horizontalLayout_5->addWidget(radioButSobrePoner);


        verticalLayout_4->addLayout(horizontalLayout_5);


        verticalLayout_5->addLayout(verticalLayout_4);

        widget1 = new QWidget(Widget);
        widget1->setObjectName(QString::fromUtf8("widget1"));
        widget1->setGeometry(QRect(10, 10, 291, 25));
        horizontalLayout = new QHBoxLayout(widget1);
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        label = new QLabel(widget1);
        label->setObjectName(QString::fromUtf8("label"));

        horizontalLayout->addWidget(label);

        pushButAbrirImagen = new QPushButton(widget1);
        pushButAbrirImagen->setObjectName(QString::fromUtf8("pushButAbrirImagen"));

        horizontalLayout->addWidget(pushButAbrirImagen);

        widget2 = new QWidget(Widget);
        widget2->setObjectName(QString::fromUtf8("widget2"));
        widget2->setGeometry(QRect(10, 40, 781, 391));
        horizontalLayout_2 = new QHBoxLayout(widget2);
        horizontalLayout_2->setObjectName(QString::fromUtf8("horizontalLayout_2"));
        horizontalLayout_2->setContentsMargins(0, 0, 0, 0);
        imagen = new QLabel(widget2);
        imagen->setObjectName(QString::fromUtf8("imagen"));
        imagen->setFrameShape(QFrame::Box);

        horizontalLayout_2->addWidget(imagen);

        imagenModificada = new QLabel(widget2);
        imagenModificada->setObjectName(QString::fromUtf8("imagenModificada"));
        imagenModificada->setFrameShape(QFrame::Box);

        horizontalLayout_2->addWidget(imagenModificada);

        widget3 = new QWidget(Widget);
        widget3->setObjectName(QString::fromUtf8("widget3"));
        widget3->setGeometry(QRect(10, 440, 451, 134));
        verticalLayout_2 = new QVBoxLayout(widget3);
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        label_2 = new QLabel(widget3);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        verticalLayout_2->addWidget(label_2);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setObjectName(QString::fromUtf8("horizontalLayout_3"));
        Filtros = new QVBoxLayout();
        Filtros->setObjectName(QString::fromUtf8("Filtros"));
        radioButAnd = new QRadioButton(widget3);
        radioButAnd->setObjectName(QString::fromUtf8("radioButAnd"));
        radioButAnd->setCheckable(true);
        radioButAnd->setChecked(false);

        Filtros->addWidget(radioButAnd);

        radioButWalden = new QRadioButton(widget3);
        radioButWalden->setObjectName(QString::fromUtf8("radioButWalden"));

        Filtros->addWidget(radioButWalden);

        radioButLux = new QRadioButton(widget3);
        radioButLux->setObjectName(QString::fromUtf8("radioButLux"));

        Filtros->addWidget(radioButLux);

        radioButAmaro = new QRadioButton(widget3);
        radioButAmaro->setObjectName(QString::fromUtf8("radioButAmaro"));

        Filtros->addWidget(radioButAmaro);

        radioButHudson = new QRadioButton(widget3);
        radioButHudson->setObjectName(QString::fromUtf8("radioButHudson"));

        Filtros->addWidget(radioButHudson);


        horizontalLayout_3->addLayout(Filtros);

        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        radioButOr = new QRadioButton(widget3);
        radioButOr->setObjectName(QString::fromUtf8("radioButOr"));

        verticalLayout->addWidget(radioButOr);

        radioButRojos = new QRadioButton(widget3);
        radioButRojos->setObjectName(QString::fromUtf8("radioButRojos"));

        verticalLayout->addWidget(radioButRojos);

        radioButRojointenso = new QRadioButton(widget3);
        radioButRojointenso->setObjectName(QString::fromUtf8("radioButRojointenso"));

        verticalLayout->addWidget(radioButRojointenso);

        radioButVerdes = new QRadioButton(widget3);
        radioButVerdes->setObjectName(QString::fromUtf8("radioButVerdes"));

        verticalLayout->addWidget(radioButVerdes);

        radioButVerdeIntenso = new QRadioButton(widget3);
        radioButVerdeIntenso->setObjectName(QString::fromUtf8("radioButVerdeIntenso"));

        verticalLayout->addWidget(radioButVerdeIntenso);


        horizontalLayout_3->addLayout(verticalLayout);

        verticalLayout_6 = new QVBoxLayout();
        verticalLayout_6->setObjectName(QString::fromUtf8("verticalLayout_6"));
        radioButXor = new QRadioButton(widget3);
        radioButXor->setObjectName(QString::fromUtf8("radioButXor"));

        verticalLayout_6->addWidget(radioButXor);

        radioButAzulintenso = new QRadioButton(widget3);
        radioButAzulintenso->setObjectName(QString::fromUtf8("radioButAzulintenso"));

        verticalLayout_6->addWidget(radioButAzulintenso);

        radioButRyV = new QRadioButton(widget3);
        radioButRyV->setObjectName(QString::fromUtf8("radioButRyV"));

        verticalLayout_6->addWidget(radioButRyV);

        radioButGris = new QRadioButton(widget3);
        radioButGris->setObjectName(QString::fromUtf8("radioButGris"));

        verticalLayout_6->addWidget(radioButGris);

        radioButMiFiltro = new QRadioButton(widget3);
        radioButMiFiltro->setObjectName(QString::fromUtf8("radioButMiFiltro"));

        verticalLayout_6->addWidget(radioButMiFiltro);


        horizontalLayout_3->addLayout(verticalLayout_6);


        verticalLayout_2->addLayout(horizontalLayout_3);


        retranslateUi(Widget);

        QMetaObject::connectSlotsByName(Widget);
    } // setupUi

    void retranslateUi(QWidget *Widget)
    {
        Widget->setWindowTitle(QCoreApplication::translate("Widget", "Widget", nullptr));
        pushButModificar->setText(QCoreApplication::translate("Widget", "Modificar", nullptr));
        label_6->setText(QCoreApplication::translate("Widget", " Mi filtro", nullptr));
        label_3->setText(QCoreApplication::translate("Widget", "            Rojos", nullptr));
        label_4->setText(QCoreApplication::translate("Widget", "           Verdes", nullptr));
        label_5->setText(QCoreApplication::translate("Widget", "            Azules", nullptr));
        radioButFiltrar->setText(QCoreApplication::translate("Widget", "Filtrar", nullptr));
        radioButNoFiltrar->setText(QCoreApplication::translate("Widget", "No filtrar", nullptr));
        radioButSobrePoner->setText(QCoreApplication::translate("Widget", "Sobreponer", nullptr));
        label->setText(QCoreApplication::translate("Widget", "Agregar imagen", nullptr));
        pushButAbrirImagen->setText(QCoreApplication::translate("Widget", "Abrir", nullptr));
        imagen->setText(QString());
        imagenModificada->setText(QString());
        label_2->setText(QCoreApplication::translate("Widget", "Efectos", nullptr));
        radioButAnd->setText(QCoreApplication::translate("Widget", "HDR", nullptr));
        radioButWalden->setText(QCoreApplication::translate("Widget", "Walden", nullptr));
        radioButLux->setText(QCoreApplication::translate("Widget", "Lux", nullptr));
        radioButAmaro->setText(QCoreApplication::translate("Widget", "Amaro", nullptr));
        radioButHudson->setText(QCoreApplication::translate("Widget", "Hudson", nullptr));
        radioButOr->setText(QCoreApplication::translate("Widget", "Blanco", nullptr));
        radioButRojos->setText(QCoreApplication::translate("Widget", "Rojo", nullptr));
        radioButRojointenso->setText(QCoreApplication::translate("Widget", "Rojo intenso", nullptr));
        radioButVerdes->setText(QCoreApplication::translate("Widget", "Verde", nullptr));
        radioButVerdeIntenso->setText(QCoreApplication::translate("Widget", "Verde intenso", nullptr));
        radioButXor->setText(QCoreApplication::translate("Widget", "Azul", nullptr));
        radioButAzulintenso->setText(QCoreApplication::translate("Widget", "Azul intenso", nullptr));
        radioButRyV->setText(QCoreApplication::translate("Widget", "Rojo con verde", nullptr));
        radioButGris->setText(QCoreApplication::translate("Widget", "Grises", nullptr));
        radioButMiFiltro->setText(QCoreApplication::translate("Widget", "Mi filtro", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Widget: public Ui_Widget {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_WIDGET_H
