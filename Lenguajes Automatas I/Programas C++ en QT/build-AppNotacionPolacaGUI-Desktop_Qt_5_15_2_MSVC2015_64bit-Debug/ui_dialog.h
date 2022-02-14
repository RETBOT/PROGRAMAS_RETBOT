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
    QLabel *label;
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QLineEdit *lineEdit;
    QLabel *label_2;
    QComboBox *comboBox;
    QPushButton *pushButton_3;
    QLineEdit *lineEdit_2;
    QLabel *label_3;
    QPushButton *pushButton_4;
    QLineEdit *lineEdit_3;
    QPushButton *pushButton_5;
    QLabel *label_4;
    QLabel *label_5;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(563, 332);
        label = new QLabel(Dialog);
        label->setObjectName(QString::fromUtf8("label"));
        label->setGeometry(QRect(30, 20, 141, 16));
        pushButton = new QPushButton(Dialog);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));
        pushButton->setGeometry(QRect(210, 30, 75, 23));
        pushButton_2 = new QPushButton(Dialog);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));
        pushButton_2->setGeometry(QRect(210, 60, 75, 23));
        lineEdit = new QLineEdit(Dialog);
        lineEdit->setObjectName(QString::fromUtf8("lineEdit"));
        lineEdit->setGeometry(QRect(300, 30, 221, 20));
        label_2 = new QLabel(Dialog);
        label_2->setObjectName(QString::fromUtf8("label_2"));
        label_2->setGeometry(QRect(300, 60, 221, 21));
        label_2->setFrameShape(QFrame::Box);
        label_2->setFrameShadow(QFrame::Sunken);
        comboBox = new QComboBox(Dialog);
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->setObjectName(QString::fromUtf8("comboBox"));
        comboBox->setGeometry(QRect(10, 40, 161, 22));
        comboBox->setEditable(true);
        pushButton_3 = new QPushButton(Dialog);
        pushButton_3->setObjectName(QString::fromUtf8("pushButton_3"));
        pushButton_3->setGeometry(QRect(460, 290, 75, 23));
        lineEdit_2 = new QLineEdit(Dialog);
        lineEdit_2->setObjectName(QString::fromUtf8("lineEdit_2"));
        lineEdit_2->setGeometry(QRect(20, 150, 161, 20));
        label_3 = new QLabel(Dialog);
        label_3->setObjectName(QString::fromUtf8("label_3"));
        label_3->setGeometry(QRect(330, 150, 211, 21));
        label_3->setFrameShape(QFrame::Box);
        label_3->setFrameShadow(QFrame::Sunken);
        pushButton_4 = new QPushButton(Dialog);
        pushButton_4->setObjectName(QString::fromUtf8("pushButton_4"));
        pushButton_4->setGeometry(QRect(190, 150, 121, 23));
        lineEdit_3 = new QLineEdit(Dialog);
        lineEdit_3->setObjectName(QString::fromUtf8("lineEdit_3"));
        lineEdit_3->setGeometry(QRect(20, 200, 161, 20));
        pushButton_5 = new QPushButton(Dialog);
        pushButton_5->setObjectName(QString::fromUtf8("pushButton_5"));
        pushButton_5->setGeometry(QRect(190, 200, 121, 23));
        label_4 = new QLabel(Dialog);
        label_4->setObjectName(QString::fromUtf8("label_4"));
        label_4->setGeometry(QRect(330, 200, 211, 21));
        label_4->setFrameShape(QFrame::Box);
        label_4->setFrameShadow(QFrame::Sunken);
        label_5 = new QLabel(Dialog);
        label_5->setObjectName(QString::fromUtf8("label_5"));
        label_5->setGeometry(QRect(330, 230, 211, 21));
        label_5->setFrameShape(QFrame::Box);
        label_5->setFrameShadow(QFrame::Sunken);

        retranslateUi(Dialog);
        QObject::connect(pushButton_3, SIGNAL(clicked()), Dialog, SLOT(close()));

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Notaci\303\263n Polaca", nullptr));
        label->setText(QCoreApplication::translate("Dialog", "Notaci\303\263n infija", nullptr));
        pushButton->setText(QCoreApplication::translate("Dialog", "Convertir", nullptr));
        pushButton_2->setText(QCoreApplication::translate("Dialog", "Solucion", nullptr));
        lineEdit->setPlaceholderText(QCoreApplication::translate("Dialog", "Notacion Polaca (PostFija)", nullptr));
        label_2->setText(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:10pt; font-weight:600; color:#ff0000;\">?</span></p></body></html>", nullptr));
        comboBox->setItemText(0, QCoreApplication::translate("Dialog", "(a+b)*3", nullptr));
        comboBox->setItemText(1, QCoreApplication::translate("Dialog", "a^b*((C-D)+e)/(f*g)+H", nullptr));
        comboBox->setItemText(2, QCoreApplication::translate("Dialog", "3^2*((4-6)+3)/(5*2)+7", nullptr));

        comboBox->setPlaceholderText(QCoreApplication::translate("Dialog", "Notacion Infija", nullptr));
        pushButton_3->setText(QCoreApplication::translate("Dialog", "Cerrar", nullptr));
        lineEdit_2->setPlaceholderText(QCoreApplication::translate("Dialog", "Ejemplo QString", nullptr));
        label_3->setText(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:10pt; font-weight:600; color:#ff0000;\">?</span></p></body></html>", nullptr));
        pushButton_4->setText(QCoreApplication::translate("Dialog", "De String a Qstring", nullptr));
        lineEdit_3->setPlaceholderText(QCoreApplication::translate("Dialog", "Texto", nullptr));
        pushButton_5->setText(QCoreApplication::translate("Dialog", "Digitos", nullptr));
        label_4->setText(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:10pt; font-weight:600; color:#ff0000;\">?</span></p></body></html>", nullptr));
        label_5->setText(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:10pt; font-weight:600; color:#ff0000;\">?</span></p></body></html>", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
