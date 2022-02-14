#include "rectanguloitem.h"

RectanguloItem::RectanguloItem(int ancho, int alto)//QObject *parent) : QObject(parent)
{
    this->ancho = ancho;
    this->alto = alto;

    tX = tY = 0;
    sX = sY = 1;
    angulo = 0.0;

    radianes = sina = cosa = 0.0;

    Traslacion = new QTransform();
    Escalacion = new QTransform();
    Rotacion = new QTransform();
    tras = escala = escala = rota = rotaPF =false;
/*
    timer = new QTimer();
    timerV = new QTimer();
    timerAle = new QTimer();
    connect(timer, SIGNAL(timeou//t()),this,SLOT(mover()));
    connect(timerV, SIGNAL(timeout()),this,SLOT(moverVertical()));
    connect(timerAle, SIGNAL(timeout()),this,SLOT(moverAleatorio()));
    */
}

void RectanguloItem::keyPressEvent(QKeyEvent *evento)
{
    if(evento->key() == Qt::Key_0){ //mostrar comandos
        QMessageBox::information(nullptr,"Comandos",mess);
    }
    if(evento->key() == Qt::Key_1){ //traslacion
       tras = true;
       escalaPF = rotaPF = escala = rota = false;
    }
    if(evento->key() == Qt::Key_2){ // escalacion
       escala = true;
       escalaPF = rotaPF = tras = rota = false;
    }
    if(evento->key() == Qt::Key_3){ // escalacionPF
       escalaPF = true;
       rotaPF = tras = rota = escala = false;
    }
    if(evento->key() == Qt::Key_4){//rotacion
       rota = true;
       escalaPF = rotaPF = escala = tras =false;
    }
    if(evento->key() == Qt::Key_5){//rotacion punto fijo
       rotaPF = true;
       escalaPF = rota = escala = tras =false;
    }

    if(tras){ //traslacion
    if(evento->key() == Qt::Key_Left){
        tX -=10;
    }
    if(evento->key() == Qt::Key_Right){
        tX +=10;
    }
    if(evento->key() == Qt::Key_Up){
        tY -=10;
    }
    if(evento->key() == Qt::Key_Down){
        tY +=10;
    }

    Traslacion->setMatrix(1,0,0,
                          0,1,0,
                          tX,tY,1);
    this->setTransform(*Traslacion);
    }
    if(escala){// escalacion
    if(evento->key() == Qt::Key_X){// esc + x
        if(sX<200)
          sX += 0.1;
    }
    if(evento->key() == Qt::Key_Y){ // esc + y
       if(sY<200)
          sY += 0.1;
    }
    if(evento->key() == Qt::Key_C){ // esc - x
       if(sX>1)
          sX -= 0.1;
    }
    if(evento->key() == Qt::Key_U){ //esc - y
       if(sY>1)
          sY -= 0.1;
    }

    Escalacion->setMatrix(sX,0,0,
                          0,sY,0,
                          0,0,1);

    this->setTransform(*Escalacion);
   }   
    if(escalaPF){// escalacion PF
    if(evento->key() == Qt::Key_X){// esc + x
        if(sX<200)
          sX += 0.1;
    }
    if(evento->key() == Qt::Key_Y){ // esc + y
       if(sY<200)
          sY += 0.1;
    }
    if(evento->key() == Qt::Key_C){ // esc - x
       if(sX>1)
          sX -= 0.1;
    }
    if(evento->key() == Qt::Key_U){ //esc - y
       if(sY>1)
          sY -= 0.1;
    }
    tX = this->rect().width()/2;
    tY = this->rect().height()/2;
    float escPFx = tX*(1-sX);
    float escPFy = tY*(1-sY);

    Escalacion->setMatrix(sX,0,0,
                          0,sY,0,
                          escPFx,escPFy,1);

    this->setTransform(*Escalacion);
   }
    //evaluacion de la unidad 2
    //validar la escalacion para que no se invierta la salida
    //publican el video

    if(rota){//Rotacion
    if(evento->key() == Qt::Key_R){ // rotar +, sentido antihoriario
        angulo +=5.0;
    }
    if(evento->key() == Qt::Key_E){ // Rotar -
        angulo -=5.0;
    }

    // convertir de grados a radianes

    radianes = angulo * M_PI / 180;
    sina = sin(radianes);
    cosa = cos(radianes);

    Rotacion->setMatrix(cosa, sina,0,
                        -sina,cosa,0,
                        0,     0,   1);

    this->setTransform(*Rotacion);
    }
    // aplicar los conceptos vistos para la rotacion del punto pivote
    // y obtener la matriz de rotacion solicitada utilizando los
    // 0bjeto rotacion creado
    if(rotaPF){
    //TX = TY = 25,25

        if(evento->key() == Qt::Key_R){ // rotar +, sentido antihoriario
            angulo +=5.0;
        }
        if(evento->key() == Qt::Key_E){ // Rotar -
            angulo -=5.0;
        }

        radianes = angulo * M_PI / 180;
        sina = sin(radianes);
        cosa = cos(radianes);
        tX = this->rect().width()/2;
        tY = this->rect().height()/2;

        float r20 = tX * (1- cos(radianes)) + tY * sin(radianes);
        float r21 = tY * (1-cos(radianes)) - tX * sin(radianes);

        Rotacion->setMatrix(cosa, sina,0,
                      -sina,cosa,0,
                       r20,  r21,   1);

        this->setTransform(*Rotacion);
    }
}
/*
void RectanguloItem::keyPressEvent(QKeyEvent *evento)
{
    if(evento->key() == Qt::Key_Left)
        setPos(this->x() -10,y());
    if(evento->key() == Qt::Key_Right)
        setPos(this->x() +10,y());
    if(evento->key() == Qt::Key_Up)
        setPos(this->x() ,y()-10);
    if(evento->key() == Qt::Key_Down)
        setPos(this->x(),y()+10);
    if(evento->key() == Qt::Key_Space){
        timer->start(50);
        mover();
    }
    if(evento->key() == Qt::Key_V){
        timerV->start(50);
        moverVertical();
    }
    if(evento->key() == Qt::Key_A){
        timerAle->start(50);
        moverAleatorio();
    }

    if(evento->key() == Qt::Key_S){
        timer->stop();
        timerV->stop();
        timerAle->stop();
    }
}

void RectanguloItem::mover()
{
    static bool band = true;

    if(this->x() < (ancho-50) && band){
        setPos(x()+10,y());
        if(this->x() > ancho-51)
            band = false;
    }

    if(!band){
       setPos(x()-10,y());
         if(this->x()==0){
             band = true;
         }
    }
}

void RectanguloItem::moverVertical()
{
    static bool band = true;

    if(this->y() < (alto-50) && band){
        setPos(x(),y()+10);
        if(this->y() > alto-51)
            band = false;
    }

    if(!band){
       setPos(x(),y()-10);
         if(this->y()==0){
             band = true;
         }
    }
}

void RectanguloItem::moverAleatorio()
{
    mover();
    moverVertical();
*/

