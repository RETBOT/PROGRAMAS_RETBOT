#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QTimer>
#include <QPainter>
#include <qrandom.h>

QT_BEGIN_NAMESPACE
namespace Ui { class Dialog; }
QT_END_NAMESPACE

class Dialog : public QDialog
{
    Q_OBJECT

public:
    Dialog(QWidget *parent = nullptr);
    ~Dialog() override;

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_3_clicked();

private:
    Ui::Dialog *ui;

    QTimer *timer;

    void paintEvent(QPaintEvent * evt) override;

    void pixeles();

    void pixelesRojos();

    void pixelesVerdes();

    void pixelesAzules();

    void pixelesAmarillos();
};
#endif // DIALOG_H
