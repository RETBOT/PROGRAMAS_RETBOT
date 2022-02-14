#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    naruto = new QTimer();
    sasuke = new QTimer();
    connect(naruto,SIGNAL(timeout()),this,SLOT(MoverNaruto()));
    connect(sasuke,SIGNAL(timeout()),this,SLOT(MoverSasuke()));
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
  naruto->start(20);
  sasuke->start(20);
}

void MainWindow::on_pushButton_2_clicked()
{
  naruto->stop();
  sasuke->stop();
  ui->label->setStyleSheet("background-image: url(:/imgs/Naruto3.png)");
  ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke3.png)");
}

void MainWindow::on_pushButton_3_clicked()
{
    this->close();
}

void MainWindow::MoverNaruto()
{
   static int x = ui->label->geometry().x();
   static int y = ui->label->geometry().y();

   static bool bandx = false;
   static bool bandy = true;

   ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");

    if(ui->label->geometry().x() <
            (ui->widget->geometry().width() - ui->label->geometry().width()+50)&&bandx){
        ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        x+=10;

        if(ui->label->geometry().x() > (
            ui->widget->geometry().width() - ui->label->geometry().width())){
            bandx =false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Naruto.png)");
        }else if((ui->label->geometry().x() == ui->label2->geometry().x())||
                (ui->label->geometry().y() == ui->label2->geometry().y())){
            bandx =false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Rasengan.png)");
        }
    }

    if(ui->label->geometry().y() < (ui->widget->geometry().height() - ui->label->height())&&bandy){
        y+=10;
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        ui->label->setStyleSheet("background-image: url(:/imgs/Naruto.png)");

        if(ui->label->geometry().y() >=
          (ui->widget->geometry().height() - ui->label->height())){
            bandy = false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
        }else if((ui->label->geometry().x() == ui->label2->geometry().x())||
                (ui->label->geometry().y() == ui->label2->geometry().y())){
            bandy =false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Rasengan.png)");
        }
    }

    if(!bandx){
           ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
        x-=10;
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        if(x==0){
               ui->label->setStyleSheet("background-image: url(:/imgs/Naruto.png)");
            bandx = true;
            }else if((ui->label->geometry().x() == ui->label2->geometry().x()||
                ui->label->geometry().y() == ui->label2->geometry().y())){
            bandx =false;
               ui->label->setStyleSheet("background-image: url(:/imgs/Rasengan.png)");
            }
        }

    if(!bandy){
        y-=10;
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        if(y==0){
            bandy=true;
        }else if((ui->label->geometry().x() == ui->label2->geometry().x()) ||
                (ui->label->geometry().y() == ui->label2->geometry().y())){
            bandy =true;
          }
    }
}

void MainWindow::MoverSasuke()
{
    static int x = ui->label2->geometry().x();
    static int y = ui->label2->geometry().y();

    static bool bandx = true;
    static bool bandy = true;
     ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke.png)");

     if(ui->label2->geometry().x() <
             (ui->widget->geometry().width() - ui->label2->geometry().width()+50)&&bandx){
         ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke.png)");
         ui->label2->setGeometry(x,y,ui->label2->width(),ui->label2->height());
         x+=10;

         if(ui->label2->geometry().x() > (
            ui->widget->geometry().width() - ui->label2->geometry().width()+10)){
             bandx =false;
             ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke.png)");

         }else if((ui->label->geometry().x() == ui->label2->geometry().x())||
             (ui->label->geometry().y() == ui->label2->geometry().y())){
             bandx =false;
              ui->label->setStyleSheet("background-image: url(:/imgs/Chidori.png)");
         }
     }

     if(ui->label2->geometry().y() < (ui->widget->geometry().height() - ui->label2->height())&&bandy){
         y+=10;
         ui->label2->setGeometry(x,y,ui->label2->width(),ui->label2->height());
         ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke.png)");

         if(ui->label2->geometry().y() >=
                 (ui->widget->geometry().height() - ui->label2->height())){
             bandy = false;
             ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke2.png)");
         }else if((ui->label->geometry().x() == ui->label2->geometry().x())||
             (ui->label->geometry().y() == ui->label2->geometry().y())){
             bandy = false;
             ui->label->setStyleSheet("background-image: url(:/imgs/Chidori.png)");;
         }
     }

     if(!bandx){
         x-=10;
         ui->label2->setGeometry(x,y,ui->label2->width(),ui->label2->height());
         ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke2.png)");
         if(x==0){
             bandx = true;
             ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke.png)");
           }else if((ui->label2->geometry().y() == ui->label->geometry().y())||
                 (ui->label2->geometry().x() == ui->label->geometry().x())){
             bandx = true;
             ui->label->setStyleSheet("background-image: url(:/imgs/Chidori.png)");
         }
     }

     if(!bandy){
         y-=10;
         ui->label2->setGeometry(x,y,ui->label2->width(),ui->label2->height());

         if(y==0){
             bandy=true;
         }else if((ui->label2->geometry().y() == ui->label->geometry().y())||
                 (ui->label2->geometry().x() == ui->label->geometry().x())){
             bandy=true;
             ui->label->setStyleSheet("background-image: url(:/imgs/Chidori.png)");
         }
     }
}

