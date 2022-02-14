#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent) : QDialog(parent), ui(new Ui::Dialog)
{
    ui->setupUi(this);
    timerH = new QTimer();
    timerV = new QTimer();
    timerA = new QTimer();
    timerR = new QTimer();
    connect(timerH, SIGNAL(timeout()), this, SLOT(moverEtiquetaHorizontal()));
    connect(timerV, SIGNAL(timeout()), this, SLOT(moverEtiquetaVertical()));
    connect(timerA, SIGNAL(timeout()), this, SLOT(moverEtiquetaAleatorio()));
    connect(timerR, SIGNAL(timeout()), this, SLOT(moverEtiquetaRecorrido()));
}

Dialog::~Dialog()
{
    delete ui;
}

//horizontal
void Dialog::on_pushButton_clicked()
{
  timerH->start(100);
  timerV->stop();
  timerA->stop();
  timerR->stop();
}

// detener timer
void Dialog::on_pushButton_2_clicked()
{
  timerH->stop();
  timerV->stop();
  timerA->stop();
  timerR->stop();
}

//vertical
void Dialog::on_pushButton_4_clicked()
{
    timerV->start(100);
    timerH->stop();
    timerA->stop();
    timerR->stop();
}

//aleatorio
void Dialog::on_pushButton_5_clicked()
{
    timerA->start(100);
    timerH->stop();
    timerV->stop();
    timerR->stop();
}

//recorrido
void Dialog::on_pushButton_6_clicked()
{
    timerR->start(100);
    timerH->stop();
    timerA->stop();
    timerV->stop();
}

void Dialog::moverEtiquetaHorizontal()
{
  // mover en forma horizontal
  static int x = 0; // estas variables que tienene el modificardor static
                    // mantienen el valor en sucesivas llamadas
                    // al metodo, pero solo se inicializan al principio y despues
                    // mantienen el valor.
  static bool band = true;

  int y = ui->label->geometry().y();

  // se mueve a la derecha
  if((ui->label->geometry().x() < (this->width() - (ui->label->width()+5))) && band){
     //x+=10;
     ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
     x+=10;

     if(ui->label->geometry().x() > this->width() - (ui->label->width()+6))
         band = false;
  }

  // se mueve a la izquierda(regresar etiqueta); <----
  if(!band){
      ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
      x-=10;
       if(x==0){
           band = true;
       }
   }
  }

void Dialog::moverEtiquetaVertical()
{
  // mover en forma vertical
  int x = ui->label->geometry().x();
  static int y = 0;
  static bool band = true;

  // se mueve para abajo
  if(ui->label->geometry().y() < (this->height() - (ui->label->height())) && band){

     y+=10;
     ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());

     if(ui->label->geometry().y() > this->height() -
       (ui->label->height()+ui->pushButton->geometry().y()))
         band = false;
  }

  // se mueve a la izquierda(regresar etiqueta); <----
  if(!band){
      ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
      y-=10;
       if(y==0){
           band = true;
       }
   }
  }

void Dialog::moverEtiquetaAleatorio()
{
   moverEtiquetaHorizontal();
   moverEtiquetaVertical();
}

void Dialog::moverEtiquetaRecorrido(){
  static int x = 0;
  int y = ui->label->geometry().y();

  static bool derecha = true;
  static bool abajo = false;
  static bool izquierda = false;
  static bool arriba = false;

  if((ui->label->geometry().x() < (this->width() - (ui->label->width()+10))) && (derecha)){
     x+=10;
     ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());

     if(ui->label->geometry().x() > this->width() - (ui->label->width()+11)){
         derecha = false;
         abajo = true;
     }
  }

  if(abajo){
      y+=10;
      ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());

       if(ui->label->geometry().y() >
               (this->height() - (ui->label->height()+ui->label->height()+20))){
                abajo = false;
                izquierda = true;
          }
  }
   if(izquierda){
      ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
      x-=10;
       if(x==0){
            izquierda = false;
            arriba = true;
       }
  }

    if(arriba){
       y-=10;
       ui->label->setGeometry(x,y,ui->label->width(),ui->label->height());
       if(y==0){
          derecha = true;
          arriba = false;
            }
    }
}
