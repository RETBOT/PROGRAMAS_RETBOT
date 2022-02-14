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
#include <QtWidgets/QLabel>
#include <QtWidgets/QPlainTextEdit>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QLabel *labelEditor;
    QPlainTextEdit *plainTextEditor;
    QLabel *labelLexico;
    QPushButton *pushButConvertir;
    QPushButton *pushButAbrir;
    QPushButton *pushButGuardar;
    QPushButton *pushButBorrar;
    QPlainTextEdit *plainTextEditorResultado;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(914, 501);
        Dialog->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 136, 255);"));
        labelEditor = new QLabel(Dialog);
        labelEditor->setObjectName(QString::fromUtf8("labelEditor"));
        labelEditor->setGeometry(QRect(80, 30, 281, 16));
        labelEditor->setLayoutDirection(Qt::RightToLeft);
        labelEditor->setStyleSheet(QString::fromUtf8("color: rgb(0, 0, 0);"));
        labelEditor->setFrameShape(QFrame::Panel);
        labelEditor->setAlignment(Qt::AlignCenter);
        plainTextEditor = new QPlainTextEdit(Dialog);
        plainTextEditor->setObjectName(QString::fromUtf8("plainTextEditor"));
        plainTextEditor->setGeometry(QRect(20, 60, 421, 341));
        plainTextEditor->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));
        labelLexico = new QLabel(Dialog);
        labelLexico->setObjectName(QString::fromUtf8("labelLexico"));
        labelLexico->setGeometry(QRect(560, 30, 271, 16));
        labelLexico->setLayoutDirection(Qt::RightToLeft);
        labelLexico->setStyleSheet(QString::fromUtf8("color: rgb(0, 0, 0);"));
        labelLexico->setFrameShape(QFrame::Panel);
        labelLexico->setAlignment(Qt::AlignCenter);
        pushButConvertir = new QPushButton(Dialog);
        pushButConvertir->setObjectName(QString::fromUtf8("pushButConvertir"));
        pushButConvertir->setGeometry(QRect(70, 410, 321, 21));
        pushButConvertir->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        pushButAbrir = new QPushButton(Dialog);
        pushButAbrir->setObjectName(QString::fromUtf8("pushButAbrir"));
        pushButAbrir->setGeometry(QRect(60, 460, 121, 21));
        pushButAbrir->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        pushButGuardar = new QPushButton(Dialog);
        pushButGuardar->setObjectName(QString::fromUtf8("pushButGuardar"));
        pushButGuardar->setGeometry(QRect(260, 460, 181, 21));
        pushButGuardar->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        pushButBorrar = new QPushButton(Dialog);
        pushButBorrar->setObjectName(QString::fromUtf8("pushButBorrar"));
        pushButBorrar->setGeometry(QRect(640, 440, 121, 21));
        pushButBorrar->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        plainTextEditorResultado = new QPlainTextEdit(Dialog);
        plainTextEditorResultado->setObjectName(QString::fromUtf8("plainTextEditorResultado"));
        plainTextEditorResultado->setEnabled(true);
        plainTextEditorResultado->setGeometry(QRect(450, 60, 451, 341));
        QFont font;
        font.setPointSize(8);
        plainTextEditorResultado->setFont(font);
        plainTextEditorResultado->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));

        retranslateUi(Dialog);

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Analisis Sintactico", nullptr));
        labelEditor->setText(QCoreApplication::translate("Dialog", "EDITOR", nullptr));
        plainTextEditor->setPlainText(QString());
        labelLexico->setText(QCoreApplication::translate("Dialog", "SINTATICO", nullptr));
        pushButConvertir->setText(QCoreApplication::translate("Dialog", "A SINTACTICO-->", nullptr));
        pushButAbrir->setText(QCoreApplication::translate("Dialog", "ABRIR ARCHIVO", nullptr));
        pushButGuardar->setText(QCoreApplication::translate("Dialog", "GUARDAR TEXTO EN ARCHIVO", nullptr));
        pushButBorrar->setText(QCoreApplication::translate("Dialog", "BORRAR TEXTO", nullptr));
        plainTextEditorResultado->setPlainText(QString());
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
