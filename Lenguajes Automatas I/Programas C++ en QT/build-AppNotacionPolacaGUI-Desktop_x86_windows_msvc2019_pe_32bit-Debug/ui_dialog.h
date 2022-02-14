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
#include <QtWidgets/QComboBox>
#include <QtWidgets/QDialog>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QComboBox *comboBox;
    QPushButton *pushButtonCerrar;
    QLabel *label;
    QLabel *label_2;
    QPushButton *pushButtonConvertir;
    QLineEdit *lineEdit;
    QPushButton *pushButtonSolucion;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(577, 199);
        comboBox = new QComboBox(Dialog);
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->setObjectName(QString::fromUtf8("comboBox"));
        comboBox->setGeometry(QRect(30, 60, 161, 22));
        comboBox->setEditable(true);
        pushButtonCerrar = new QPushButton(Dialog);
        pushButtonCerrar->setObjectName(QString::fromUtf8("pushButtonCerrar"));
        pushButtonCerrar->setGeometry(QRect(470, 150, 75, 23));
        label = new QLabel(Dialog);
        label->setObjectName(QString::fromUtf8("label"));
        label->setGeometry(QRect(50, 40, 141, 16));
        label_2 = new QLabel(Dialog);
        label_2->setObjectName(QString::fromUtf8("label_2"));
        label_2->setGeometry(QRect(320, 80, 221, 21));
        label_2->setFrameShape(QFrame::Box);
        label_2->setFrameShadow(QFrame::Sunken);
        pushButtonConvertir = new QPushButton(Dialog);
        pushButtonConvertir->setObjectName(QString::fromUtf8("pushButtonConvertir"));
        pushButtonConvertir->setGeometry(QRect(230, 50, 75, 23));
        lineEdit = new QLineEdit(Dialog);
        lineEdit->setObjectName(QString::fromUtf8("lineEdit"));
        lineEdit->setGeometry(QRect(320, 50, 221, 20));
        pushButtonSolucion = new QPushButton(Dialog);
        pushButtonSolucion->setObjectName(QString::fromUtf8("pushButtonSolucion"));
        pushButtonSolucion->setGeometry(QRect(230, 80, 75, 23));

        retranslateUi(Dialog);
        QObject::connect(pushButtonCerrar, SIGNAL(clicked()), Dialog, SLOT(close()));

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        comboBox->setItemText(0, QCoreApplication::translate("Dialog", "(a+b)*3", nullptr));
        comboBox->setItemText(1, QCoreApplication::translate("Dialog", "a^b*((C-D)+e)/(f*g)+H", nullptr));
        comboBox->setItemText(2, QCoreApplication::translate("Dialog", "3^2*((4-6)+3)/(5*2)+7", nullptr));

        comboBox->setPlaceholderText(QCoreApplication::translate("Dialog", "Notacion Infija", nullptr));
        pushButtonCerrar->setText(QCoreApplication::translate("Dialog", "Cerrar", nullptr));
        label->setText(QCoreApplication::translate("Dialog", "Notaci\303\263n infija", nullptr));
        label_2->setText(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:10pt; font-weight:600; color:#ff0000;\">?</span></p></body></html>", nullptr));
        pushButtonConvertir->setText(QCoreApplication::translate("Dialog", "Convertir", nullptr));
        lineEdit->setPlaceholderText(QCoreApplication::translate("Dialog", "Notacion Polaca (PostFija)", nullptr));
        pushButtonSolucion->setText(QCoreApplication::translate("Dialog", "Solucion", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
