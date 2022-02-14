/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.15.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QProgressBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSlider>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralwidget;
    QWidget *layoutWidget;
    QHBoxLayout *horizontalLayout;
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QPushButton *pushButton_3;
    QWidget *widget;
    QLabel *label2;
    QLabel *label;
    QProgressBar *vidaSasuke;
    QProgressBar *vidaNaruto;
    QLabel *label_4;
    QLabel *label_5;
    QLabel *label_2;
    QLabel *label_3;
    QWidget *widget1;
    QHBoxLayout *horizontalLayout_2;
    QPushButton *pushButton_4;
    QPushButton *pushButton_5;
    QPushButton *pushButton_7;
    QPushButton *pushButton_6;
    QSlider *horizontalSlider;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QString::fromUtf8("MainWindow"));
        MainWindow->resize(1050, 701);
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        layoutWidget = new QWidget(centralwidget);
        layoutWidget->setObjectName(QString::fromUtf8("layoutWidget"));
        layoutWidget->setGeometry(QRect(10, 610, 731, 25));
        horizontalLayout = new QHBoxLayout(layoutWidget);
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        pushButton = new QPushButton(layoutWidget);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));

        horizontalLayout->addWidget(pushButton);

        pushButton_2 = new QPushButton(layoutWidget);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));

        horizontalLayout->addWidget(pushButton_2);

        pushButton_3 = new QPushButton(layoutWidget);
        pushButton_3->setObjectName(QString::fromUtf8("pushButton_3"));

        horizontalLayout->addWidget(pushButton_3);

        widget = new QWidget(centralwidget);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(0, 0, 1050, 600));
        widget->setStyleSheet(QString::fromUtf8("background-image: url(:/imgs/ValleDelFin.png);"));
        label2 = new QLabel(widget);
        label2->setObjectName(QString::fromUtf8("label2"));
        label2->setGeometry(QRect(20, 20, 50, 75));
        label2->setStyleSheet(QString::fromUtf8("background-image: url(:/imgs/Sasuke3.png);\n"
""));
        label = new QLabel(widget);
        label->setObjectName(QString::fromUtf8("label"));
        label->setGeometry(QRect(990, 20, 50, 75));
        label->setStyleSheet(QString::fromUtf8("background-image: url(:/imgs/Naruto3.png);\n"
""));
        vidaSasuke = new QProgressBar(widget);
        vidaSasuke->setObjectName(QString::fromUtf8("vidaSasuke"));
        vidaSasuke->setGeometry(QRect(100, 10, 261, 23));
        vidaSasuke->setMinimum(-1);
        vidaSasuke->setValue(100);
        vidaNaruto = new QProgressBar(widget);
        vidaNaruto->setObjectName(QString::fromUtf8("vidaNaruto"));
        vidaNaruto->setGeometry(QRect(707, 10, 241, 23));
        vidaNaruto->setMinimum(-1);
        vidaNaruto->setValue(100);
        label_4 = new QLabel(widget);
        label_4->setObjectName(QString::fromUtf8("label_4"));
        label_4->setGeometry(QRect(100, 40, 81, 16));
        QFont font;
        font.setFamily(QString::fromUtf8("MS Sans Serif"));
        label_4->setFont(font);
        label_4->setTextFormat(Qt::RichText);
        label_5 = new QLabel(widget);
        label_5->setObjectName(QString::fromUtf8("label_5"));
        label_5->setGeometry(QRect(870, 40, 81, 16));
        label_5->setFont(font);
        label_5->setTextFormat(Qt::RichText);
        label_2 = new QLabel(centralwidget);
        label_2->setObjectName(QString::fromUtf8("label_2"));
        label_2->setGeometry(QRect(20, 640, 121, 16));
        label_3 = new QLabel(centralwidget);
        label_3->setObjectName(QString::fromUtf8("label_3"));
        label_3->setGeometry(QRect(340, 640, 47, 13));
        widget1 = new QWidget(centralwidget);
        widget1->setObjectName(QString::fromUtf8("widget1"));
        widget1->setGeometry(QRect(11, 661, 721, 25));
        horizontalLayout_2 = new QHBoxLayout(widget1);
        horizontalLayout_2->setObjectName(QString::fromUtf8("horizontalLayout_2"));
        horizontalLayout_2->setContentsMargins(0, 0, 0, 0);
        pushButton_4 = new QPushButton(widget1);
        pushButton_4->setObjectName(QString::fromUtf8("pushButton_4"));

        horizontalLayout_2->addWidget(pushButton_4);

        pushButton_5 = new QPushButton(widget1);
        pushButton_5->setObjectName(QString::fromUtf8("pushButton_5"));

        horizontalLayout_2->addWidget(pushButton_5);

        pushButton_7 = new QPushButton(widget1);
        pushButton_7->setObjectName(QString::fromUtf8("pushButton_7"));

        horizontalLayout_2->addWidget(pushButton_7);

        pushButton_6 = new QPushButton(widget1);
        pushButton_6->setObjectName(QString::fromUtf8("pushButton_6"));

        horizontalLayout_2->addWidget(pushButton_6);

        horizontalSlider = new QSlider(widget1);
        horizontalSlider->setObjectName(QString::fromUtf8("horizontalSlider"));
        horizontalSlider->setMaximum(100);
        horizontalSlider->setValue(50);
        horizontalSlider->setOrientation(Qt::Horizontal);

        horizontalLayout_2->addWidget(horizontalSlider);

        MainWindow->setCentralWidget(centralwidget);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        pushButton->setText(QCoreApplication::translate("MainWindow", "Pelear", nullptr));
        pushButton_2->setText(QCoreApplication::translate("MainWindow", "Detener", nullptr));
        pushButton_3->setText(QCoreApplication::translate("MainWindow", "Salir", nullptr));
        label2->setText(QString());
        label->setText(QString());
        label_4->setText(QCoreApplication::translate("MainWindow", "Sasuke", nullptr));
        label_5->setText(QCoreApplication::translate("MainWindow", "Naruto", nullptr));
        label_2->setText(QCoreApplication::translate("MainWindow", "  Musica ", nullptr));
        label_3->setText(QCoreApplication::translate("MainWindow", "Volumen", nullptr));
        pushButton_4->setText(QCoreApplication::translate("MainWindow", "Abrir", nullptr));
        pushButton_5->setText(QCoreApplication::translate("MainWindow", "Play", nullptr));
        pushButton_7->setText(QCoreApplication::translate("MainWindow", "Pausa", nullptr));
        pushButton_6->setText(QCoreApplication::translate("MainWindow", "Stop", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
