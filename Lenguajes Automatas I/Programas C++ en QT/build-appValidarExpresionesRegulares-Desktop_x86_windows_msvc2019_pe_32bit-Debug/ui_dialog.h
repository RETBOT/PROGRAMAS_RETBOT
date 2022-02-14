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
    QLineEdit *lineEdit;
    QPushButton *pushButton;
    QLabel *label;
    QLabel *label_2;
    QLabel *label_3;
    QPushButton *pushButton_2;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QString::fromUtf8("Dialog"));
        Dialog->resize(567, 354);
        comboBox = new QComboBox(Dialog);
        comboBox->setObjectName(QString::fromUtf8("comboBox"));
        comboBox->setGeometry(QRect(40, 120, 451, 22));
        comboBox->setEditable(true);
        lineEdit = new QLineEdit(Dialog);
        lineEdit->setObjectName(QString::fromUtf8("lineEdit"));
        lineEdit->setGeometry(QRect(40, 40, 451, 20));
        lineEdit->setAlignment(Qt::AlignCenter);
        pushButton = new QPushButton(Dialog);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));
        pushButton->setGeometry(QRect(200, 240, 75, 23));
        label = new QLabel(Dialog);
        label->setObjectName(QString::fromUtf8("label"));
        label->setGeometry(QRect(200, 90, 141, 16));
        label_2 = new QLabel(Dialog);
        label_2->setObjectName(QString::fromUtf8("label_2"));
        label_2->setGeometry(QRect(80, 280, 381, 61));
        QFont font;
        font.setFamily(QString::fromUtf8("Rockwell"));
        font.setPointSize(26);
        label_2->setFont(font);
        label_2->setAlignment(Qt::AlignCenter);
        label_3 = new QLabel(Dialog);
        label_3->setObjectName(QString::fromUtf8("label_3"));
        label_3->setGeometry(QRect(40, 150, 451, 41));
        label_3->setStyleSheet(QString::fromUtf8(""));
        label_3->setFrameShape(QFrame::Box);
        label_3->setAlignment(Qt::AlignCenter);
        pushButton_2 = new QPushButton(Dialog);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));
        pushButton_2->setGeometry(QRect(280, 240, 75, 23));

        retranslateUi(Dialog);

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QCoreApplication::translate("Dialog", "Dialog", nullptr));
        lineEdit->setText(QString());
        lineEdit->setPlaceholderText(QCoreApplication::translate("Dialog", "TEXTO A ANALIZAR", nullptr));
        pushButton->setText(QCoreApplication::translate("Dialog", "Analizar", nullptr));
        label->setText(QCoreApplication::translate("Dialog", "EXPRESION REGULAR", nullptr));
        label_2->setText(QCoreApplication::translate("Dialog", "RESULTADO", nullptr));
#if QT_CONFIG(whatsthis)
        label_3->setWhatsThis(QCoreApplication::translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:9pt;\"><br/></span><span style=\" font-size:16pt;\">?</span></p></body></html>", nullptr));
#endif // QT_CONFIG(whatsthis)
        label_3->setText(QString());
        pushButton_2->setText(QCoreApplication::translate("Dialog", "Borrar", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
