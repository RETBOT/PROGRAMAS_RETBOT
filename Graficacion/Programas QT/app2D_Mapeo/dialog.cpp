#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    dibujoOrientacionNormal = dibujoMapeado = false;
    XPVMIN=130,YPVMIN=100,XPVMAX=400,YPVMAX=400;
    rx1=150,ry1=100,rAncho=200,rAlto=300;
}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::paintEvent(QPaintEvent *e)
{
    Q_UNUSED(e)
    canvas = new QPainter(this);

    if(dibujoOrientacionNormal)
        dibujarFigura();
    else if(dibujoMapeado)
        dibujarFiguraMapeada();

    canvas->end();
}

void Dialog::asignarFigura()
{
    // modificar las coordenadas para visualizar la figura en cada uno de los cuatro cuadrantes
/*    fig[0][0] = 10; fig[0][1] = 10;fig[0][2] = 1;
    fig[1][0] = 30; fig[1][1] = 10;fig[1][2] = 1;
    fig[2][0] = 10; fig[2][1] = 30;fig[2][2] = 1;
    // regresa al inicio de la figura
    fig[3][0] = 10; fig[3][1] = 10;fig[3][2] = 1;

    fig[0][0] = 0; fig[0][1] = 0;fig[0][2] = 1;
    fig[1][0] = 10000; fig[1][1] = 0;fig[1][2] = 1;
    fig[2][0] = 0; fig[2][1] = 10000;fig[2][2] = 1;
    // regresa al inicio de la figura
    fig[3][0] = 0; fig[3][1] = 0;fig[3][2] = 1;

    //realizar para una de 10*10
    fig[0][0] = 0; fig[0][1] = 0;fig[0][2] = 1;
    fig[1][0] = 7.3; fig[1][1] = 3.2;fig[1][2] = 1;
    fig[2][0] = 5.5; fig[2][1] = 5.5;fig[2][2] = 1;
    // regresa al inicio de la figura
    fig[3][0] = 0; fig[3][1] = 0;fig[3][2] = 1;

    //realizar para un espacio de hoja de maquina
    fig[0][0] = 22; fig[0][1] = 20;fig[0][2] = 1;  // pico inferior izquierdo
    fig[1][0] = 0; fig[1][1] = 20;fig[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
    fig[2][0] = 22; fig[2][1] = 0;fig[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
    fig[3][0] = 22/2; fig[3][1] = 28;fig[3][2] = 1;
    // regresa al inicio de la figura
    fig[4][0] = 0;fig[4][1] = 0;fig[4][2] = 1;
*/
    //ala izquierda
     alaIzq[0][0] = 20; alaIzq[0][1] = 30;alaIzq[0][2] = 1;  // pico inferior izquierdo
     alaIzq[1][0] = 60; alaIzq[1][1] = 30;alaIzq[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
     alaIzq[2][0] = 60; alaIzq[2][1] = 70;alaIzq[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
     // regresa al inicio de la figura
     alaIzq[3][0] = 20; alaIzq[3][1] = 30;alaIzq[3][2] = 1;

     //ala Derecha
      alaDer[0][0] = 120; alaDer[0][1] = 30;alaDer[0][2] = 1;  // pico inferior izquierdo
      alaDer[1][0] = 160; alaDer[1][1] = 30;alaDer[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
      alaDer[2][0] = 120; alaDer[2][1] = 70;alaDer[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
      // regresa al inicio de la figura
      alaDer[3][0] = 120; alaDer[3][1] = 30;alaDer[3][2] = 1;

      // motor inferior
       recInfe[0][0] = 70; recInfe[0][1] = 10;recInfe[0][2] = 1;  // pico inferior izquierdo
       recInfe[1][0] = 110; recInfe[1][1] = 10;recInfe[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
       recInfe[2][0] = 110; recInfe[2][1] = 30;recInfe[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
       recInfe[3][0] = 70; recInfe[3][1] = 30;recInfe[3][2] = 1;
       // regresa al inicio de la figura
       recInfe[4][0] = 70; recInfe[4][1] = 10;recInfe[4][2] = 1;


       // Motor
        motor[0][0] = 60; motor[0][1] = 30;motor[0][2] = 1;  // pico inferior izquierdo
        motor[1][0] = 120;motor[1][1] = 30;motor[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
        motor[2][0] = 120;motor[2][1] = 50;motor[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
        motor[3][0] = 60; motor[3][1] = 50;motor[3][2] = 1;
        // regresa al inicio de la figura
        motor[4][0] = 60; motor[4][1] = 30;motor[4][2] = 1;

        //modificar
        // cabina
         cabina[0][0] = 60;cabina[0][1] = 50;cabina[0][2] = 1;  // pico inferior izquierdo
         cabina[1][0] = 120;cabina[1][1] = 50;cabina[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
         cabina[2][0] = 120;cabina[2][1] = 130;cabina[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
         cabina[3][0] = 60; cabina[3][1] = 130;cabina[3][2] = 1;
         // regresa al inicio de la figura
         cabina[4][0] = 60;cabina[4][1] = 50;cabina[4][2] = 1;

         // ventana
          ventana[0][0] = 80;ventana[0][1] =110;ventana[0][2] = 1;  // pico inferior izquierdo
          ventana[1][0] = 100;ventana[1][1] = 110;ventana[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
          ventana[2][0] = 100;ventana[2][1] = 120;ventana[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
          ventana[3][0] = 80; ventana[3][1] = 120;ventana[3][2] = 1;
          // regresa al inicio de la figura
         ventana[4][0] = 80;ventana[4][1] = 110;ventana[4][2] = 1;

         //superior
          superior[0][0] = 50;superior[0][1] = 130;superior[0][2] = 1;  // pico inferior izquierdo
          superior[1][0] = 130;superior[1][1] = 130;superior[1][2] = 1; //posicion horizontal del pico de arriba y posion vertical del pico
          superior[2][0] = 90;superior[2][1] = 180;superior[2][2] = 1; // posicion horizontal del pico inferior derecho y posicion vertical del pico inferior derecho
          // regresa al inicio de la figura
          superior[3][0] = 50; superior[3][1] = 130;superior[3][2] = 1;


    for(int r=0;r<4;r++){
        for(int c=0;c<3;c++){
            alaIzqAux[r][c] = alaIzq[r][c];
            alaDerAux[r][c] = alaDer[r][c];
            superiorAux[r][c] = superior[r][c];
         } 
    }
    for(int r=0;r<5;r++){
        for(int c=0;c<3;c++){
            recInfeAux[r][c] = recInfe[r][c];
            motorAux[r][c] = motor[r][c];
            cabinaAux[r][c] = cabina[r][c];
            ventanaAux[r][c] = ventana[r][c];
         }
    }
    ancho = this->size().width() - ui->widget->size().width();
    centroX = ancho/2;
    centroY = this->size().height()/2;
}

void Dialog::dibujarFigura()
{
    // dibujar los ejes cartesianos
    canvas->setPen(QColor(255,0,0));
    //Linea horizontal
    canvas->drawLine(0,size().height()/2,ancho,size().height()/2);
    //linea vertical
    canvas->drawLine(ancho/2,0,ancho/2,size().height());

    canvas->setPen(QColor(0,0,155));
    for(int i=0;i<3;i++){
        //esquina superior izq
    //    canvas->drawLine(fig[i][0],fig[i][1],fig[i+1][0],fig[i+1][1]);
          canvas->drawLine(centroX+alaIzq[i][0],centroY+alaIzq[i][1],centroX+alaIzq[i+1][0],centroY+alaIzq[i+1][1]);
          canvas->drawLine(centroX+alaDer[i][0],centroY+alaDer[i][1],centroX+alaDer[i+1][0],centroY+alaDer[i+1][1]);
          canvas->drawLine(centroX+superior[i][0],centroY+superior[i][1],centroX+superior[i+1][0],centroY+superior[i+1][1]);
        }
    for(int i=0;i<4;i++){
        canvas->drawLine(centroX+recInfe[i][0],centroY+recInfe[i][1],centroX+recInfe[i+1][0],centroY+recInfe[i+1][1]);
        canvas->drawLine(centroX+motor[i][0],centroY+motor[i][1],centroX+motor[i+1][0],centroY+motor[i+1][1]);
        canvas->drawLine(centroX+cabina[i][0],centroY+cabina[i][1],centroX+cabina[i+1][0],centroY+cabina[i+1][1]);
        canvas->drawLine(centroX+ventana[i][0],centroY+ventana[i][1],centroX+ventana[i+1][0],centroY+ventana[i+1][1]);
    }
}

void Dialog::dibujarFiguraMapeada()
{
   /* // dibujar los ejes cartesianos
    canvas->setPen(QColor(0,0,255));
    //Linea horizontal
    canvas->drawLine(0,size().height()/2,ancho,size().height()/2);
    //linea vertical
    canvas->drawLine(ancho/2,0,ancho/2,size().height());
*/

    Mapeo dibujo;
    //ventana representa el mundo real
    //dibujo.ventana(0,0,ancho,size().height());
    //dibujo.ventana(ancho/2,0,ancho,size().height()/2);
    //puerto de vision representa el area de despliegue en el dispositivo
    //dibujo.puerto(0,0,ancho,size().height());
    //dibujo.puerto(ancho/2,0,ancho,size().height()/2);
    //dibujo.puerto(0,0,ancho/2,size().height()/2);

    // espacio del mundo real: 10000 unidades
    //dibujo.ventana(0,0,10000,10000);
    //dibujo.ventana(0,0,10,10);
    // Tamaño de una hoja de maquina
    //dibujo.ventana(0,0,21.5,28);
    // colocacion del puerto en el contro de la forma donde se esta dibujando

    dibujo.ventana(0,0,200,190);
    //dibujo.puerto(150,100,350,400);
    // estrella
    dibujo.puerto(XPVMIN,YPVMIN,XPVMAX,YPVMAX);
    // el valor de M = YPVMIN + YPVMAX
    // en el puerto se requieren los vertices
    // dibujar el rectangulo que mostrara el puerto de vision
    //rectangulo
    canvas->drawRect(rx1,ry1,rAncho,rAlto);
    // en el rect          ancho alto


    canvas->setPen(QColor(0,0,155));

    int L = 0;
    int M = 500; // YPVMIN + YPVMAX

    int x1,y1,x2,y2;
    for(int i=0;i<3;i++){
        dibujo.mapear(alaIzq[i][0],alaIzq[i][1],x1,y1,L,M);
        dibujo.mapear(alaIzq[i+1][0],alaIzq[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);

        dibujo.mapear(alaDer[i][0],alaDer[i][1],x1,y1,L,M);
        dibujo.mapear(alaDer[i+1][0],alaDer[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);

        dibujo.mapear(superior[i][0],superior[i][1],x1,y1,L,M);
        dibujo.mapear(superior[i+1][0],superior[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);
    }
    for(int i=0;i<4;i++){
        dibujo.mapear(recInfe[i][0],recInfe[i][1],x1,y1,L,M);
        dibujo.mapear(recInfe[i+1][0],recInfe[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);

        dibujo.mapear(motor[i][0],motor[i][1],x1,y1,L,M);
        dibujo.mapear(motor[i+1][0],motor[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);

        dibujo.mapear(cabina[i][0],cabina[i][1],x1,y1,L,M);
        dibujo.mapear(cabina[i+1][0],cabina[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);

        dibujo.mapear(ventana[i][0],ventana[i][1],x1,y1,L,M);
        dibujo.mapear(ventana[i+1][0],ventana[i+1][1],x2,y2,L,M);
        canvas->drawLine(x1,y1,x2,y2);
    }
}


void Dialog::on_pushButton_clicked()
{
  asignarFigura();
  dibujoOrientacionNormal = true;
  dibujoMapeado = false;
  repaint();
}

void Dialog::on_pushButton_2_clicked()
{
  asignarFigura();
  dibujoOrientacionNormal = false;
  dibujoMapeado = true;
  repaint();
}

void Dialog::on_pushButton_3_clicked()// crecer
{
    if(XPVMAX<490){
    XPVMAX += 10;
    YPVMAX += 10;
    XPVMIN -= 10;
    YPVMIN -= 10;
    rx1-=10;
    ry1-=10;
    rAncho+=20;
    rAlto+=20;
    on_pushButton_2_clicked();
    }
}

void Dialog::on_pushButton_4_clicked() // disminuir
{
    if(XPVMAX>300){
    XPVMAX -= 10;
    YPVMAX -= 10;
    XPVMIN += 10;
    YPVMIN += 10;
    if(XPVMAX>400){
    rx1+=10;
    ry1+=10;
    rAncho-=20;
    rAlto-=20;
    }
    on_pushButton_2_clicked();
    }
}

void Dialog::on_horizontalSlider_valueChanged(int value)
{
    if(value<350){
        on_pushButton_4_clicked();
    }
    if(value>350){
        on_pushButton_3_clicked();
    }
}
