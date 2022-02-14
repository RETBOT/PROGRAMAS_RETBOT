#ifndef CONVERTIDORNUMERICODIALOGO_H
#define CONVERTIDORNUMERICODIALOGO_H

//#include <QObject>
#include <QDialog>
 class QLineEdit;
class ConvertidorNumericoDialogo : public QDialog //QObject
{
    Q_OBJECT


public:
    //explicit ConvertidorNumericoDialogo(QObject *parent = nullptr);
    explicit ConvertidorNumericoDialogo();

private:
    QLineEdit *decEdit;
    QLineEdit *hexEdit;
    QLineEdit *binEdit;

};

#endif // CONVERTIDORNUMERICODIALOGO_H
