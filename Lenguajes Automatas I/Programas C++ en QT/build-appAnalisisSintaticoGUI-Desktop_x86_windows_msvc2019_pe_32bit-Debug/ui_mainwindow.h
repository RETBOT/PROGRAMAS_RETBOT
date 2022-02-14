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
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenu>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPlainTextEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QAction *actionAbrir_documento;
    QAction *actionGuardar_texto_en_documento;
    QAction *actionCerrar;
    QWidget *centralwidget;
    QPlainTextEdit *plainTextEditor;
    QLabel *labelLexico;
    QPlainTextEdit *plainTextEditorResultado;
    QLabel *labelEditor;
    QPushButton *pushButConvertir;
    QPushButton *pushButBorrar;
    QMenuBar *menubar;
    QMenu *menuMenu;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QString::fromUtf8("MainWindow"));
        MainWindow->resize(918, 461);
        MainWindow->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 0, 127);"));
        actionAbrir_documento = new QAction(MainWindow);
        actionAbrir_documento->setObjectName(QString::fromUtf8("actionAbrir_documento"));
        actionGuardar_texto_en_documento = new QAction(MainWindow);
        actionGuardar_texto_en_documento->setObjectName(QString::fromUtf8("actionGuardar_texto_en_documento"));
        actionCerrar = new QAction(MainWindow);
        actionCerrar->setObjectName(QString::fromUtf8("actionCerrar"));
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        plainTextEditor = new QPlainTextEdit(centralwidget);
        plainTextEditor->setObjectName(QString::fromUtf8("plainTextEditor"));
        plainTextEditor->setGeometry(QRect(10, 40, 421, 341));
        plainTextEditor->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));
        labelLexico = new QLabel(centralwidget);
        labelLexico->setObjectName(QString::fromUtf8("labelLexico"));
        labelLexico->setGeometry(QRect(550, 10, 271, 16));
        labelLexico->setLayoutDirection(Qt::RightToLeft);
        labelLexico->setStyleSheet(QString::fromUtf8("color: rgb(255, 255, 255);"));
        labelLexico->setFrameShape(QFrame::Panel);
        labelLexico->setAlignment(Qt::AlignCenter);
        plainTextEditorResultado = new QPlainTextEdit(centralwidget);
        plainTextEditorResultado->setObjectName(QString::fromUtf8("plainTextEditorResultado"));
        plainTextEditorResultado->setEnabled(false);
        plainTextEditorResultado->setGeometry(QRect(440, 40, 451, 341));
        QFont font;
        font.setPointSize(8);
        plainTextEditorResultado->setFont(font);
        plainTextEditorResultado->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));
        labelEditor = new QLabel(centralwidget);
        labelEditor->setObjectName(QString::fromUtf8("labelEditor"));
        labelEditor->setGeometry(QRect(70, 10, 281, 16));
        labelEditor->setLayoutDirection(Qt::RightToLeft);
        labelEditor->setStyleSheet(QString::fromUtf8("color: rgb(255, 255, 255);"));
        labelEditor->setFrameShape(QFrame::Panel);
        labelEditor->setAlignment(Qt::AlignCenter);
        pushButConvertir = new QPushButton(centralwidget);
        pushButConvertir->setObjectName(QString::fromUtf8("pushButConvertir"));
        pushButConvertir->setGeometry(QRect(60, 390, 321, 21));
        pushButConvertir->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255,255);\n"
"color: rgb(0, 0, 0);"));
        pushButBorrar = new QPushButton(centralwidget);
        pushButBorrar->setObjectName(QString::fromUtf8("pushButBorrar"));
        pushButBorrar->setGeometry(QRect(580, 390, 121, 21));
        pushButBorrar->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255,255);\n"
"color: rgb(0, 0, 0);"));
        MainWindow->setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 918, 20));
        menuMenu = new QMenu(menubar);
        menuMenu->setObjectName(QString::fromUtf8("menuMenu"));
        MainWindow->setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        MainWindow->setStatusBar(statusbar);

        menubar->addAction(menuMenu->menuAction());
        menuMenu->addAction(actionAbrir_documento);
        menuMenu->addAction(actionGuardar_texto_en_documento);
        menuMenu->addAction(actionCerrar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        actionAbrir_documento->setText(QCoreApplication::translate("MainWindow", "Abrir documento", nullptr));
        actionGuardar_texto_en_documento->setText(QCoreApplication::translate("MainWindow", "Guardar texto en documento", nullptr));
        actionCerrar->setText(QCoreApplication::translate("MainWindow", "Cerrar", nullptr));
        plainTextEditor->setPlainText(QString());
        labelLexico->setText(QCoreApplication::translate("MainWindow", "LEXICO", nullptr));
        plainTextEditorResultado->setPlainText(QString());
        labelEditor->setText(QCoreApplication::translate("MainWindow", "EDITOR", nullptr));
        pushButConvertir->setText(QCoreApplication::translate("MainWindow", "A LEXICO-->", nullptr));
        pushButBorrar->setText(QCoreApplication::translate("MainWindow", "BORRAR TEXTO", nullptr));
        menuMenu->setTitle(QCoreApplication::translate("MainWindow", "Menu", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
