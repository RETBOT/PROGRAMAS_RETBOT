#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    // timer naruto
    naruto = new QTimer();
    // timer sasuke
    sasuke = new QTimer();
    // conecion del timer con el movimiento de naruto
    connect(naruto,SIGNAL(timeout()),this,SLOT(MoverNaruto()));
    // conecion del timer con el movimiento de sasuke
    connect(sasuke,SIGNAL(timeout()),this,SLOT(MoverSasuke()));
    // reproductor de audio
    mMediaPlayer= new QMediaPlayer(this);

}
MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
  // iniciar los timers
  naruto->start(20);
  sasuke->start(20);
}

void MainWindow::on_pushButton_2_clicked()
{
  // parar los timers
  naruto->stop();
  sasuke->stop();
  // cambiamos la imagen de naruto y sasuke por la que sale al inicio
  ui->label->setStyleSheet("background-image: url(:/imgs/Naruto3.png)");
  ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke3.png)");
}

void MainWindow::on_pushButton_3_clicked()
{
    this->close(); // se cierra la ventana
}

void MainWindow::MoverNaruto()
{
   static int vidaNaruto = 100;
   if(vidaNaruto > -1){
   // X y Y de la posicion de naruto
   static int x = ui->label->geometry().x();
   static int y = ui->label->geometry().y();

   // banderas para el movimiento por la ventana
   static bool bandx = false;
   static bool bandy = true;

   // imagen movimiento de naruto <--
   ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
   // movimiento de x -->
    if(ui->label->geometry().x() <
            (ui->widget->geometry().width() - ui->label->geometry().width()+50)&&bandx){

        ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        x+=10;

        if(ui->label->geometry().x() > (  // si llega al tope de la ventana se hace el regreso
            ui->widget->geometry().width() - ui->label->geometry().width())){
            bandx =false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Naruto.png)");

        }// en caso colisionan entre las imagenes, se hace el regreso
        else if((ui->label->geometry().x() == ui->label2->geometry().x())||
                (ui->label->geometry().y() == ui->label2->geometry().y())){
            bandx =false;
            ui->label->setStyleSheet("background-image: url(:/imgs/Rasengan.png)");
                vidaNaruto--;
         }
        }

    // movimientod de y positivo -->
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
             vidaNaruto--;
        }
    }

    // movimiento de x <-- regreso
    if(!bandx){
           ui->label->setStyleSheet("background-image: url(:/imgs/Naruto2.png)");
        x-=10;
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        if(x==0){ // en caso de llegar al final se refresa
               ui->label->setStyleSheet("background-image: url(:/imgs/Naruto.png)");
            bandx = true;
            }// si las imagenes colisionan se hace el regreso
             else if((ui->label->geometry().x() == ui->label2->geometry().x()||
                ui->label->geometry().y() == ui->label2->geometry().y())){
            bandx =false;
               ui->label->setStyleSheet("background-image: url(:/imgs/Rasengan.png)");
               vidaNaruto--;
            }
        }

    // y de regreso
    if(!bandy){
        y-=10;
        ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
        if(y==0){ // en caso de llegar al limite de la imagen se regresa
            bandy=true;
        }// si las imagenes colisionan se hace el regreso
        else if((ui->label->geometry().x() == ui->label2->geometry().x()) ||
                (ui->label->geometry().y() == ui->label2->geometry().y())){
            bandy =true;
                vidaNaruto--;
          }
    }
    ui->vidaNaruto->setValue(vidaNaruto);
   }else {
       naruto->stop();
       ui->label->setStyleSheet("background-image: url(:/imgs/Naruto4.png)");

       sasuke->stop();
       ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke3.png)");
   }
}

void MainWindow::MoverSasuke()
{
    static int vidaSasuke = 100;
    if(vidaSasuke > -1 ){
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
              vidaSasuke--;
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
             ui->label->setStyleSheet("background-image: url(:/imgs/Chidori.png)");
             vidaSasuke--;
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
             vidaSasuke--;
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
             vidaSasuke--;
         }
     }
     ui->vidaSasuke->setValue(vidaSasuke);
    }else{
        sasuke->stop();
        ui->label2->setStyleSheet("background-image: url(:/imgs/Sasuke4.png)");

        naruto->stop();
        ui->label->setStyleSheet("background-image: url(:/imgs/Naruto3.png)");
    }
}

void MainWindow::on_pushButton_4_clicked()
{
  QString filename = QFileDialog::getOpenFileName(this,"Abrir"); // abrimos la ubicacion del audio
  if(filename.isEmpty()){ // en caso de que este vacio se retorna
      return;
  }
  mMediaPlayer->setMedia(QUrl::fromLocalFile(filename));
  mMediaPlayer->setVolume(ui->horizontalSlider->value()); // volumen del audio

}

void MainWindow::on_pushButton_5_clicked()
{
    mMediaPlayer->play();
}

void MainWindow::on_pushButton_6_clicked()
{
   mMediaPlayer->stop();
}

void MainWindow::on_pushButton_7_clicked()
{
    mMediaPlayer->pause();
}

void MainWindow::on_horizontalSlider_valueChanged(int value)
{
   mMediaPlayer->setVolume(value);
}
