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
    QPlainTextEdit *plainTextEditor;
    QPushButton *pushButGuardar;
    QPlainTextEdit *plainTextEditorResultado;
    QLabel *labelLexico;
    QPushButton *pushButAbrir;
    QPushButton *pushButConvertir;
    QLabel *labelEditor;
    QPushButton *pushButBorrar;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(901, 479);
        Dialog->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 136, 255);"));
        plainTextEditor = new QPlainTextEdit(Dialog);
        plainTextEditor->setObjectName(QString::fromUtf8("plainTextEditor"));
        plainTextEditor->setGeometry(QRect(10, 40, 421, 341));
        plainTextEditor->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));
        pushButGuardar = new QPushButton(Dialog);
        pushButGuardar->setObjectName(QString::fromUtf8("pushButGuardar"));
        pushButGuardar->setGeometry(QRect(240, 440, 181, 21));
        pushButGuardar->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        plainTextEditorResultado = new QPlainTextEdit(Dialog);
        plainTextEditorResultado->setObjectName(QString::fromUtf8("plainTextEditorResultado"));
        plainTextEditorResultado->setEnabled(false);
        plainTextEditorResultado->setGeometry(QRect(440, 40, 451, 341));
        QFont font;
        font.setPointSize(8);
        plainTextEditorResultado->setFont(font);
        plainTextEditorResultado->setStyleSheet(QString::fromUtf8("background-color: rgb(255, 255, 255);"));
        labelLexico = new QLabel(Dialog);
        labelLexico->setObjectName(QString::fromUtf8("labelLexico"));
        labelLexico->setGeometry(QRect(540, 10, 271, 16));
        labelLexico->setLayoutDirection(Qt::RightToLeft);
        labelLexico->setStyleSheet(QString::fromUtf8("color: rgb(0, 0, 0);"));
        labelLexico->setFrameShape(QFrame::Panel);
        labelLexico->setAlignment(Qt::AlignCenter);
        pushButAbrir = new QPushButton(Dialog);
        pushButAbrir->setObjectName(QString::fromUtf8("pushButAbrir"));
        pushButAbrir->setGeometry(QRect(40, 440, 161, 21));
        pushButAbrir->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        pushButConvertir = new QPushButton(Dialog);
        pushButConvertir->setObjectName(QString::fromUtf8("pushButConvertir"));
        pushButConvertir->setGeometry(QRect(60, 390, 321, 21));
        pushButConvertir->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));
        labelEditor = new QLabel(Dialog);
        labelEditor->setObjectName(QString::fromUtf8("labelEditor"));
        labelEditor->setGeometry(QRect(60, 10, 281, 16));
        labelEditor->setLayoutDirection(Qt::RightToLeft);
        labelEditor->setStyleSheet(QString::fromUtf8("color: rgb(0, 0, 0);"));
        labelEditor->setFrameShape(QFrame::Panel);
        labelEditor->setAlignment(Qt::AlignCenter);
        pushButBorrar = new QPushButton(Dialog);
        pushButBorrar->setObjectName(QString::fromUtf8("pushButBorrar"));
        pushButBorrar->setGeometry(QRect(620, 420, 121, 21));
        pushButBorrar->setStyleSheet(QString::fromUtf8("background-color: rgb(0, 255, 0);\n"
"color: rgb(0, 0, 0);"));

        retranslateUi(Dialog);

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        plainTextEditor->setPlainText(QString());
        pushButGuardar->setText(QCoreApplication::translate("Dialog", "GUARDAR TEXTO EN ARCHIVO", nullptr));
        plainTextEditorResultado->setPlainText(QString());
        labelLexico->setText(QCoreApplication::translate("Dialog", "LEXICO", nullptr));
        pushButAbrir->setText(QCoreApplication::translate("Dialog", "ABRIR ARCHIVO", nullptr));
        pushButConvertir->setText(QCoreApplication::translate("Dialog", "A LEXICO-->", nullptr));
        labelEditor->setText(QCoreApplication::translate("Dialog", "EDITOR", nullptr));
        pushButBorrar->setText(QCoreApplication::translate("Dialog", "BORRAR TEXTO", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
