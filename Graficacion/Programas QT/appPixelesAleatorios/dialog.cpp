#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    timer = new QTimer();
    // repaint y update invocan al metodo paintEvent automaticamente

    //connect(timer,SIGNAL(timeout()),this,SLOT(repaint()));
    connect(timer,SIGNAL(timeout()),this,SLOT(update()));
}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::paintEvent(QPaintEvent *evt)
{
    Q_UNUSED(evt)
    pixelesRojos();
    pixelesVerdes();
    pixelesAzules();
    pixelesAmarillos();
}

void Dialog::pixeles()
{
    QPainter canvas(this);
    for(int i=0;i<10000;i++){
        QPen pen1(QColor(0,0,qrand()%155+100));//qrand()%155+100,qrand()%155+100,qrand()%155+100));
        pen1.setWidth(1);
        canvas.setPen(pen1);
        canvas.drawPoint(qrand()%(this->width()/2),qrand()%(height()/2)-50);
    }
}

void Dialog::pixelesRojos()
{
    QPainter canvas(this);
    for(int i=0;i<10000;i++){
        QPen pen1(QColor(qrand()%155+100,0,0));
        pen1.setWidth(3);
        canvas.setPen(pen1);
        canvas.drawPoint(qrand()%(this->width()/2),qrand()%(height()/2)-40);
    }
}

void Dialog::pixelesVerdes()
{
    QPainter canvas(this);
    for(int i=0;i<10000;i++){
        QPen pen1(QColor(0,qrand()%155+100,0));
        pen1.setWidth(3);
        canvas.setPen(pen1);
        canvas.drawPoint(qrand()%(this->width()/2)+((this->width()/2)+10)
                         ,qrand()%(height()/2)-40);
    }
}

void Dialog::pixelesAzules()
{
    QPainter canvas(this);
    for(int i=0;i<10000;i++){
        QPen pen1(QColor(0,0,qrand()%155+100));
        pen1.setWidth(3);
        canvas.setPen(pen1);
        canvas.drawPoint(qrand()%(this->width()/2),qrand()%((height()/2))+(height()/2)-30);
    }
}

void Dialog::pixelesAmarillos()
{
    QPainter canvas(this);
    for(int i=0;i<10000;i++){
        QPen pen1(QColor(qrand()%155+100,qrand()%155+100,0));
        pen1.setWidth(3);
        canvas.setPen(pen1);
        canvas.drawPoint(qrand()%(this->width()/2)+((this->width()/2)+10),
                         qrand()%((height()/2))+((height()/2))-30);
    }
}

void Dialog::on_pushButton_clicked()
{
    timer->start(30);
}

void Dialog::on_pushButton_2_clicked()
{
    timer->stop();
}

void Dialog::on_pushButton_3_clicked()
{
    close();
}


