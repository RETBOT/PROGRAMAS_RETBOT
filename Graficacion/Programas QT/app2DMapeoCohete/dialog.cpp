#include "dialog.h"
#include "ui_dialog.h"
#include <QMessageBox>

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    asignarFigura();
    on_pushButtonComandos_clicked();
    ui->setupUi(this);
    ancho = this->size().width() - ui->widget->size().width();
    centroX = ancho/2;
    centroY = this->size().height()/2;
    dibujoOrientacionNormal = dibujoMapeado = false;
    tx = ty = 0;
    XPVMIN=ancho/2,YPVMIN=0,XPVMAX=ancho,YPVMAX=size().height()/2;

    timer = new QTimer();
    connect(timer, SIGNAL(timeout()), this, SLOT(animar()));
}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::paintEvent(QPaintEvent *e)
{
    Q_UNUSED(e)
    canvas = new QPainter(this);
    dibujarFiguraMapeada();
    canvas->end();
}

void Dialog::keyPressEvent(QKeyEvent *evento)
{
   // disminuir y aumentar
    if(evento->key() == Qt::Key_Q){
       on_pushButtonDisminuir_clicked();
    }
    if(evento->key() == Qt::Key_E){
      on_pushButtonAumentar_clicked();
    }
    //mover figura
    //Aumentar spinBoxTx spinBoxTy
    if(evento->key() == Qt::Key_R){
        int val = ui->spinBoxTx->value()+1;
        ui->spinBoxTx->setValue(val);
    }
    if(evento->key() == Qt::Key_T){
        int val = ui->spinBoxTy->value()+1;
         ui->spinBoxTy->setValue(val);
    }
    //Disminuir spinBoxTx spinBoxTy
    if(evento->key() == Qt::Key_F){
        if(ui->spinBoxTx->value()>=0){
        int val = ui->spinBoxTx->value()-1;
        ui->spinBoxTx->setValue(val);
        }
    }
    if(evento->key() == Qt::Key_G){
        if(ui->spinBoxTy->value()>=0){
        int val = ui->spinBoxTy->value()-1;
         ui->spinBoxTy->setValue(val);
        }
    }
    //mover figura
    if(evento->key() == Qt::Key_W){
       on_pushButtonArriba_clicked();
    }
    if(evento->key() == Qt::Key_S){
        on_pushButtonAbajo_clicked();
    }
    if(evento->key() == Qt::Key_A){
        on_pushButtonIzquierda_clicked();
    }
    if(evento->key() == Qt::Key_D){
        on_pushButtonDerecha_clicked();
    }
   // Escalacion
    // aumento de doubleSpinBoxSX doubleSpinBoxSY
    if(evento->key() == Qt::Key_Y){
        int val = ui->doubleSpinBoxSX->value()+1;
        ui->doubleSpinBoxSX->setValue(val);
    }
    if(evento->key() == Qt::Key_U){
        int val = ui->doubleSpinBoxSY->value()+1;
         ui->doubleSpinBoxSY->setValue(val);
    }
    //Disminuir doubleSpinBoxSX doubleSpinBoxSy
    if(evento->key() == Qt::Key_H){
        if(ui->doubleSpinBoxSX->value()>=0){
        int val = ui->doubleSpinBoxSX->value()-1;
        ui->doubleSpinBoxSX->setValue(val);
        }
    }
    if(evento->key() == Qt::Key_J){
        if(ui->doubleSpinBoxSY->value()>=0){
        int val = ui->doubleSpinBoxSY->value()-1;
         ui->doubleSpinBoxSY->setValue(val);
        }
    }
   // escalar
    if(evento->key() == Qt::Key_Z){
      on_pushButtonEscalar_clicked();
    }

    // Escalacion Punto Fijo
     // aumento de doubleSpinBoxPFx doubleSpinBoxPFy
     if(evento->key() == Qt::Key_I){
         int val = ui->doubleSpinBoxPFx->value()+1;
         ui->doubleSpinBoxPFx->setValue(val);
     }
     if(evento->key() == Qt::Key_O){
         int val = ui->doubleSpinBoxPFy->value()+1;
          ui->doubleSpinBoxPFy->setValue(val);
     }
     //Disminuir doubleSpinBoxPFx doubleSpinBoxPFy
     if(evento->key() == Qt::Key_K){
         if(ui->doubleSpinBoxPFx->value()>=0){
         int val = ui->doubleSpinBoxPFx->value()-1;
         ui->doubleSpinBoxPFx->setValue(val);
         }
     }
     if(evento->key() == Qt::Key_L){
         if(ui->doubleSpinBoxPFy->value()>=0){
         int val = ui->doubleSpinBoxPFy->value()-1;
          ui->doubleSpinBoxPFy->setValue(val);
         }
     }
    // escalar punto fijo
     if(evento->key() == Qt::Key_X){
       on_pushButtonEscalacionPF_clicked();
     }

     //rotacion
     // Aumentar spinBoxAngulo
     if(evento->key() == Qt::Key_P){
         int val = ui->spinBoxAngulo->value()+1;
         ui->spinBoxAngulo->setValue(val);
     }
     // disminuir spinBoxAngulo
     if(evento->key() == Qt::Key_Ntilde){
         int val = ui->spinBoxAngulo->value()-1;
         ui->spinBoxAngulo->setValue(val);
     }
     //rotar figura
    if(evento->key() == Qt::Key_C){
      on_pushButtonRotar_clicked();
    }
    //reiniciar figura
    if(evento->key() == Qt::Key_V){
      on_pushButtonReiniciar_clicked();
    }
    //cerrar
    if(evento->key() == Qt::Key_F10){
        this->close();
    }
    //animacion
    if(evento->key() == Qt::Key_N){
        timer->start(10);
    }
    if(evento->key() == Qt::Key_M){
        timer->stop();
    }
}

void Dialog::asignarFigura()
{
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
}


void Dialog::dibujarFiguraMapeada()
{
    canvas->setPen(QColor(0,0,255));
    //Linea horizontal
    canvas->drawLine(0,size().height()/2,ancho,size().height()/2);
    //linea vertical
    canvas->drawLine(ancho/2,0,ancho/2,size().height());


    Mapeo dibujo;
    //dibujo.puerto();
    //ventana representa el mundo real
    dibujo.ventana(ancho/2,0,ancho,size().height()/2);
    //puerto de vision representa el area de despliegue en el dispositivo
    //=ancho/2,=0,=ancho,=size().height()/2;
    dibujo.puerto(XPVMIN,YPVMIN,XPVMAX,YPVMAX);

    //canvas->drawRect(rx1,ry1,rAncho,rAlto);
    canvas->setPen(QColor(0,0,155));

    int L = centroX;
    int M = centroY; // YPVMIN + YPVMAX

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

void Dialog::trasladar(int tX, int tY)
{
    Matrix id; //objetos estaticos
    Matrix aizq,ader,infe,mot,cab,vent,sup;
    Matrix aizq2,ader2,infe2,mot2,cab2,vent2,sup2;

    aizq.Inicializa(4,3);
    ader.Inicializa(4,3);
    infe.Inicializa(5,3);
    mot.Inicializa(5,3);
    cab.Inicializa(5,3);
    vent.Inicializa(5,3);
    sup.Inicializa(4,3);

    aizq2.Inicializa(4,3);
    ader2.Inicializa(4,3);
    infe2.Inicializa(5,3);
    mot2.Inicializa(5,3);
    cab2.Inicializa(5,3);
    vent2.Inicializa(5,3);
    sup2.Inicializa(4,3);

    id.Inicializa(3,3);

    //ala izquierda
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            aizq.SET(i,j,alaIzq[i][j]);

    //aplicar la traslacion
    aizq2.traslacion(aizq,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            alaIzq[i][j] = aizq2.GET(i,j);

    // ala derecha
    for(int i=0;i<ader.numRen();i++)
        for(int j=0;j<ader.numCol();j++)
            ader.SET(i,j,alaDer[i][j]);

    //aplicar la traslacion
    ader2.traslacion(ader,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<ader2.numRen();i++)
        for(int j=0;j<ader2.numCol();j++)
            alaDer[i][j] = ader2.GET(i,j);

    //rectangulo inferior
    for(int i=0;i<infe.numRen();i++)
        for(int j=0;j<infe.numCol();j++)
            infe.SET(i,j,recInfe[i][j]);

    //aplicar la traslacion
    infe2.traslacion(infe,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<infe2.numRen();i++)
        for(int j=0;j<infe2.numCol();j++)
            recInfe[i][j] = infe2.GET(i,j);

    //motor
    for(int i=0;i<mot.numRen();i++)
        for(int j=0;j<mot.numCol();j++)
            mot.SET(i,j,motor[i][j]);

    //aplicar la traslacion
    mot2.traslacion(mot,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<mot2.numRen();i++)
        for(int j=0;j<mot2.numCol();j++)
            motor[i][j] = mot2.GET(i,j);

    //cabina
    for(int i=0;i<cab.numRen();i++)
        for(int j=0;j<cab.numCol();j++)
            cab.SET(i,j,cabina[i][j]);

    //aplicar la traslacion
    cab2.traslacion(cab,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<cab2.numRen();i++)
        for(int j=0;j<cab2.numCol();j++)
            cabina[i][j] = cab2.GET(i,j);

    //Ventana
    for(int i=0;i<vent.numRen();i++)
        for(int j=0;j<vent.numCol();j++)
            vent.SET(i,j,ventana[i][j]);

    //aplicar la traslacion
    vent2.traslacion(vent,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<vent2.numRen();i++)
        for(int j=0;j<vent2.numCol();j++)
            ventana[i][j] = vent2.GET(i,j);

    //superior
    for(int i=0;i<sup.numRen();i++)
        for(int j=0;j<sup.numCol();j++)
            sup.SET(i,j,superior[i][j]);

    //aplicar la traslacion
    sup2.traslacion(sup,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<sup2.numRen();i++)
        for(int j=0;j<sup2.numCol();j++)
            superior[i][j] = sup2.GET(i,j);

    repaint();
}

void Dialog::escalar(float sX, float sY)
{
    Matrix id,id2; //objetos estaticos
    Matrix aizq,ader,infe,mot,cab,vent,sup;
    Matrix aizq2,ader2,infe2,mot2,cab2,vent2,sup2;

    aizq.Inicializa(4,3);
    ader.Inicializa(4,3);
    infe.Inicializa(5,3);
    mot.Inicializa(5,3);
    cab.Inicializa(5,3);
    vent.Inicializa(5,3);
    sup.Inicializa(4,3);

    aizq2.Inicializa(4,3);
    ader2.Inicializa(4,3);
    infe2.Inicializa(5,3);
    mot2.Inicializa(5,3);
    cab2.Inicializa(5,3);
    vent2.Inicializa(5,3);
    sup2.Inicializa(4,3);

    id.Inicializa(3,3);

    //ala izquierda
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            aizq.SET(i,j,alaIzq[i][j]);

    aizq2.escalacion(aizq,id,sX,sY);

    for(int i=0;i<aizq2.numRen();i++)
        for(int j=0;j<aizq2.numCol();j++)
            alaIzq[i][j] = aizq2.GET(i,j);

    //ala derecha
    for(int i=0;i<ader.numRen();i++)
        for(int j=0;j<ader.numCol();j++)
            ader.SET(i,j,alaDer[i][j]);

    ader2.escalacion(ader,id,sX,sY);

    for(int i=0;i<ader2.numRen();i++)
        for(int j=0;j<ader2.numCol();j++)
            alaDer[i][j] = ader2.GET(i,j);

    //rectangulo inferior
    for(int i=0;i<infe.numRen();i++)
        for(int j=0;j<infe.numCol();j++)
            infe.SET(i,j,recInfe[i][j]);

    infe2.escalacion(infe,id,sX,sY);

    for(int i=0;i<infe2.numRen();i++)
        for(int j=0;j<infe2.numCol();j++)
            recInfe[i][j] = infe2.GET(i,j);

    //Motor
    for(int i=0;i<mot.numRen();i++)
        for(int j=0;j<mot.numCol();j++)
            mot.SET(i,j,motor[i][j]);

    mot2.escalacion(mot,id,sX,sY);

    for(int i=0;i<mot2.numRen();i++)
        for(int j=0;j<mot2.numCol();j++)
            motor[i][j] = mot2.GET(i,j);

    //cabina
    for(int i=0;i<cab.numRen();i++)
        for(int j=0;j<cab.numCol();j++)
            cab.SET(i,j,cabina[i][j]);

    cab2.escalacion(cab,id,sX,sY);

    for(int i=0;i<cab2.numRen();i++)
        for(int j=0;j<cab2.numCol();j++)
            cabina[i][j] = cab2.GET(i,j);

    //Ventana
    for(int i=0;i<vent.numRen();i++)
        for(int j=0;j<vent.numCol();j++)
            vent.SET(i,j,ventana[i][j]);

    vent2.escalacion(vent,id,sX,sY);

    for(int i=0;i<vent2.numRen();i++)
        for(int j=0;j<vent2.numCol();j++)
            ventana[i][j] = vent2.GET(i,j);

    //superior
    for(int i=0;i<sup.numRen();i++)
        for(int j=0;j<sup.numCol();j++)
            sup.SET(i,j,superior[i][j]);

    sup2.escalacion(sup,id,sX,sY);

    for(int i=0;i<sup2.numRen();i++)
        for(int j=0;j<sup2.numCol();j++)
            superior[i][j] = sup2.GET(i,j);

    repaint();
}

void Dialog::escalaPuntoFijo(float sX, float sY, int PFx, int PFy)
{
    Matrix id,id2; //objetos estaticos
    Matrix aizq,ader,infe,mot,cab,vent,sup;
    Matrix aizq2,ader2,infe2,mot2,cab2,vent2,sup2;

    aizq.Inicializa(4,3);
    ader.Inicializa(4,3);
    infe.Inicializa(5,3);
    mot.Inicializa(5,3);
    cab.Inicializa(5,3);
    vent.Inicializa(5,3);
    sup.Inicializa(4,3);

    aizq2.Inicializa(4,3);
    ader2.Inicializa(4,3);
    infe2.Inicializa(5,3);
    mot2.Inicializa(5,3);
    cab2.Inicializa(5,3);
    vent2.Inicializa(5,3);
    sup2.Inicializa(4,3);

    id.Inicializa(3,3);

    //ala izquierda
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            aizq.SET(i,j,alaIzq[i][j]);

    aizq2.escalacionPuntoFijo(aizq,id,sX,sY,PFx,PFy);

    for(int i=0;i<aizq2.numRen();i++)
        for(int j=0;j<aizq2.numCol();j++)
            alaIzq[i][j] = aizq2.GET(i,j);

    //ala derecha
    for(int i=0;i<ader.numRen();i++)
        for(int j=0;j<ader.numCol();j++)
            ader.SET(i,j,alaDer[i][j]);

    ader2.escalacionPuntoFijo(ader,id,sX,sY,PFx,PFy);

    for(int i=0;i<ader2.numRen();i++)
        for(int j=0;j<ader2.numCol();j++)
            alaDer[i][j] = ader2.GET(i,j);

    //rectangulo inferior
    for(int i=0;i<infe.numRen();i++)
        for(int j=0;j<infe.numCol();j++)
            infe.SET(i,j,recInfe[i][j]);

    infe2.escalacionPuntoFijo(infe,id,sX,sY,PFx,PFy);

    for(int i=0;i<infe2.numRen();i++)
        for(int j=0;j<infe2.numCol();j++)
            recInfe[i][j] = infe2.GET(i,j);

    //Motor
    for(int i=0;i<mot.numRen();i++)
        for(int j=0;j<mot.numCol();j++)
            mot.SET(i,j,motor[i][j]);

    mot2.escalacionPuntoFijo(mot,id,sX,sY,PFx,PFy);

    for(int i=0;i<mot2.numRen();i++)
        for(int j=0;j<mot2.numCol();j++)
            motor[i][j] = mot2.GET(i,j);

    //cabina
    for(int i=0;i<cab.numRen();i++)
        for(int j=0;j<cab.numCol();j++)
            cab.SET(i,j,cabina[i][j]);

    cab2.escalacionPuntoFijo(cab,id,sX,sY,PFx,PFy);

    for(int i=0;i<cab2.numRen();i++)
        for(int j=0;j<cab2.numCol();j++)
            cabina[i][j] = cab2.GET(i,j);

    //Ventana
    for(int i=0;i<vent.numRen();i++)
        for(int j=0;j<vent.numCol();j++)
            vent.SET(i,j,ventana[i][j]);

    vent2.escalacionPuntoFijo(vent,id,sX,sY,PFx,PFy);

    for(int i=0;i<vent2.numRen();i++)
        for(int j=0;j<vent2.numCol();j++)
            ventana[i][j] = vent2.GET(i,j);

    //superior
    for(int i=0;i<sup.numRen();i++)
        for(int j=0;j<sup.numCol();j++)
            sup.SET(i,j,superior[i][j]);

    sup2.escalacionPuntoFijo(sup,id,sX,sY,PFx,PFy);

    for(int i=0;i<sup2.numRen();i++)
        for(int j=0;j<sup2.numCol();j++)
            superior[i][j] = sup2.GET(i,j);

    repaint();
}

void Dialog::rotacion(int angulo)
{
    Matrix id,id2; //objetos estaticos
    Matrix aizq,ader,infe,mot,cab,vent,sup;
    Matrix aizq2,ader2,infe2,mot2,cab2,vent2,sup2;

    aizq.Inicializa(4,3);
    ader.Inicializa(4,3);
    infe.Inicializa(5,3);
    mot.Inicializa(5,3);
    cab.Inicializa(5,3);
    vent.Inicializa(5,3);
    sup.Inicializa(4,3);

    aizq2.Inicializa(4,3);
    ader2.Inicializa(4,3);
    infe2.Inicializa(5,3);
    mot2.Inicializa(5,3);
    cab2.Inicializa(5,3);
    vent2.Inicializa(5,3);
    sup2.Inicializa(4,3);

    id.Inicializa(3,3);

    //ala izquierda
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            aizq.SET(i,j,alaIzq[i][j]);

    aizq2.rotacion(aizq,id,angulo);

    for(int i=0;i<aizq2.numRen();i++)
        for(int j=0;j<aizq2.numCol();j++)
            alaIzq[i][j] = aizq2.GET(i,j);

    //ala derecha
    for(int i=0;i<ader.numRen();i++)
        for(int j=0;j<ader.numCol();j++)
            ader.SET(i,j,alaDer[i][j]);

    ader2.rotacion(ader,id,angulo);

    for(int i=0;i<ader2.numRen();i++)
        for(int j=0;j<ader2.numCol();j++)
            alaDer[i][j] = ader2.GET(i,j);

    //rectangulo inferior
    for(int i=0;i<infe.numRen();i++)
        for(int j=0;j<infe.numCol();j++)
            infe.SET(i,j,recInfe[i][j]);

    infe2.rotacion(infe,id,angulo);

    for(int i=0;i<infe2.numRen();i++)
        for(int j=0;j<infe2.numCol();j++)
            recInfe[i][j] = infe2.GET(i,j);

    //Motor
    for(int i=0;i<mot.numRen();i++)
        for(int j=0;j<mot.numCol();j++)
            mot.SET(i,j,motor[i][j]);

    mot2.rotacion(mot,id,angulo);

    for(int i=0;i<mot2.numRen();i++)
        for(int j=0;j<mot2.numCol();j++)
            motor[i][j] = mot2.GET(i,j);

    //cabina
    for(int i=0;i<cab.numRen();i++)
        for(int j=0;j<cab.numCol();j++)
            cab.SET(i,j,cabina[i][j]);

    cab2.rotacion(cab,id,angulo);

    for(int i=0;i<cab2.numRen();i++)
        for(int j=0;j<cab2.numCol();j++)
            cabina[i][j] = cab2.GET(i,j);

    //Ventana
    for(int i=0;i<vent.numRen();i++)
        for(int j=0;j<vent.numCol();j++)
            vent.SET(i,j,ventana[i][j]);

    vent2.rotacion(vent,id,angulo);

    for(int i=0;i<vent2.numRen();i++)
        for(int j=0;j<vent2.numCol();j++)
            ventana[i][j] = vent2.GET(i,j);

    //superior
    for(int i=0;i<sup.numRen();i++)
        for(int j=0;j<sup.numCol();j++)
            sup.SET(i,j,superior[i][j]);

    sup2.rotacion(sup,id,angulo);

    for(int i=0;i<sup2.numRen();i++)
        for(int j=0;j<sup2.numCol();j++)
            superior[i][j] = sup2.GET(i,j);

    repaint();
}

void Dialog::rotacionPuntoFijo(int angulo, float pfx, float pfy)
{
    Matrix id,id2; //objetos estaticos
    Matrix aizq,ader,infe,mot,cab,vent,sup;
    Matrix aizq2,ader2,infe2,mot2,cab2,vent2,sup2;

    aizq.Inicializa(4,3);
    ader.Inicializa(4,3);
    infe.Inicializa(5,3);
    mot.Inicializa(5,3);
    cab.Inicializa(5,3);
    vent.Inicializa(5,3);
    sup.Inicializa(4,3);

    aizq2.Inicializa(4,3);
    ader2.Inicializa(4,3);
    infe2.Inicializa(5,3);
    mot2.Inicializa(5,3);
    cab2.Inicializa(5,3);
    vent2.Inicializa(5,3);
    sup2.Inicializa(4,3);

    id.Inicializa(3,3);

    //ala izquierda
    for(int i=0;i<aizq.numRen();i++)
        for(int j=0;j<aizq.numCol();j++)
            aizq.SET(i,j,alaIzq[i][j]);

    aizq2.rotacionPuntoFijo(aizq,id,angulo,pfx,pfy);

    for(int i=0;i<aizq2.numRen();i++)
        for(int j=0;j<aizq2.numCol();j++)
            alaIzq[i][j] = aizq2.GET(i,j);

    //ala derecha
    for(int i=0;i<ader.numRen();i++)
        for(int j=0;j<ader.numCol();j++)
            ader.SET(i,j,alaDer[i][j]);

    ader2.rotacionPuntoFijo(ader,id,angulo,pfx,pfy);

    for(int i=0;i<ader2.numRen();i++)
        for(int j=0;j<ader2.numCol();j++)
            alaDer[i][j] = ader2.GET(i,j);

    //rectangulo inferior
    for(int i=0;i<infe.numRen();i++)
        for(int j=0;j<infe.numCol();j++)
            infe.SET(i,j,recInfe[i][j]);

    infe2.rotacionPuntoFijo(infe,id,angulo,pfx,pfy);

    for(int i=0;i<infe2.numRen();i++)
        for(int j=0;j<infe2.numCol();j++)
            recInfe[i][j] = infe2.GET(i,j);

    //Motor
    for(int i=0;i<mot.numRen();i++)
        for(int j=0;j<mot.numCol();j++)
            mot.SET(i,j,motor[i][j]);

    mot2.rotacionPuntoFijo(mot,id,angulo,pfx,pfy);

    for(int i=0;i<mot2.numRen();i++)
        for(int j=0;j<mot2.numCol();j++)
            motor[i][j] = mot2.GET(i,j);

    //cabina
    for(int i=0;i<cab.numRen();i++)
        for(int j=0;j<cab.numCol();j++)
            cab.SET(i,j,cabina[i][j]);

    cab2.rotacionPuntoFijo(cab,id,angulo,pfx,pfy);

    for(int i=0;i<cab2.numRen();i++)
        for(int j=0;j<cab2.numCol();j++)
            cabina[i][j] = cab2.GET(i,j);

    //Ventana
    for(int i=0;i<vent.numRen();i++)
        for(int j=0;j<vent.numCol();j++)
            vent.SET(i,j,ventana[i][j]);

    vent2.rotacionPuntoFijo(vent,id,angulo,pfx,pfy);

    for(int i=0;i<vent2.numRen();i++)
        for(int j=0;j<vent2.numCol();j++)
            ventana[i][j] = vent2.GET(i,j);

    //superior
    for(int i=0;i<sup.numRen();i++)
        for(int j=0;j<sup.numCol();j++)
            sup.SET(i,j,superior[i][j]);

    sup2.rotacionPuntoFijo(sup,id,angulo,pfx,pfy);

    for(int i=0;i<sup2.numRen();i++)
        for(int j=0;j<sup2.numCol();j++)
            superior[i][j] = sup2.GET(i,j);

    repaint();
}

void Dialog::animar()
{
    static bool inicio = true;
    static int angulo = 0;
    static int contA = 0;
    static int contB = 0;
    static bool band = true;
    static int contC = 0;
    static bool band2 = false;
    static int contD = 0;
    static bool band3 = false;
    static bool band4 = false;

    if(inicio){
    XPVMIN = 150;
    YPVMIN = 150;
    XPVMAX = 300;
    YPVMAX = 300;
    inicio = false;
    }


    if(contA<=10&&band){
        contA++;
        trasladar(0,ty+5);
        if(contA>10){
            band = false;
            band4 = true;
        }
    }
    if(band4){
        angulo = 30;
        double pfx = 80; //usar el valor de los spinBox
        double pfy = 70;
         rotacionPuntoFijo(angulo,pfx,pfy);
         contB++;
         if(contB>16){
             band4=false;
             band2 = true;
             band = false;
         }
    }

    if(band2){
        contC++;
        trasladar(0,ty-5);
        if(contC>20){
            band2=false;
            band3=true;
            band4 = false;
        }
    }

    if(band3){
         contD++;
         XPVMAX += 10;
         YPVMAX += 10;
         XPVMIN += 5;
         YPVMIN += 5;
         update();
         if(contD>20){
             contB=0;
             contC=0;
             contA=0;
             band4=false;
             band3 = false;
             band2 = false;
             band = true;
             inicio = true;
         }
    }
}

void Dialog::on_pushButtonDisminuir_clicked()
{
    if(XPVMIN>250){
    XPVMAX -= 15;
    YPVMAX -= 10;
    XPVMIN -= 5;
    YPVMIN += 5;
    asignarFigura();
    repaint();
    }
}

void Dialog::on_pushButtonAumentar_clicked()
{
     XPVMAX += 15;
     YPVMAX += 10;
     XPVMIN += 5;
     YPVMIN -= 5;
     asignarFigura();
     repaint();
}

void Dialog::on_pushButtonArriba_clicked()
{
    trasladar(0,ty+ui->spinBoxTy->value());
}

void Dialog::on_pushButtonIzquierda_clicked()
{
    trasladar(tx-ui->spinBoxTx->value(),0);
}

void Dialog::on_pushButtonDerecha_clicked()
{
    trasladar(tx+ui->spinBoxTx->value(),0);
}

void Dialog::on_pushButtonAbajo_clicked()
{
    trasladar(0,ty-ui->spinBoxTy->value());
}

void Dialog::on_pushButtonEscalar_clicked()
{
    double sX = ui->doubleSpinBoxSX->value();
    double sY = ui->doubleSpinBoxSY->value();
    escalar(sX,sY);
}

void Dialog::on_pushButtonReiniciar_clicked()
{// asignamos lo puntos guardado en figAux a la figura que esta manipulando
    for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
            alaIzq[i][j] = alaIzqAux[i][j];
            alaDer[i][j] = alaDerAux[i][j];
            superior[i][j] = superiorAux[i][j];
        }
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<3;j++){
            recInfe[i][j] = recInfeAux[i][j];
            motor[i][j] = motorAux[i][j];
            cabina[i][j] = cabinaAux[i][j];
            ventana[i][j] = ventanaAux[i][j];
        }
    }
    tx = ty = 0;
    XPVMIN=ancho/2,YPVMIN=0,XPVMAX=ancho,YPVMAX=size().height()/2;
    timer->stop();
    repaint();
}


void Dialog::on_pushButtonEscalacionPF_clicked()
{
    double sX = ui->doubleSpinBoxSX->value();
    double sY = ui->doubleSpinBoxSY->value();
    int PFx = int(ui->doubleSpinBoxPFx->value());
    int PFy = int(ui->doubleSpinBoxPFy->value());
    escalaPuntoFijo(sX,sY,PFx,PFy);
}

void Dialog::on_pushButtonRotar_clicked()
{
    int grado = ui->spinBoxAngulo->value();
    rotacion(grado);
}

void Dialog::on_pushButtonComandos_clicked()
{
    QString info = "Lista de comandos con teclado\n";
    info += "Aumentar y disminuir\nfigura Aumentar = Q\tDisminuir = E\nTraslación de figura\n";
    info += "Aumento de TX=R\tAumento de TY=T\tDisminución de TX=F\tDisminución de TY=G\n";
    info += "Trasladar figura\nArriba=W\tAbajo=S\tIzquierda=A\tDerecha=D7\n";
    info += "Estalación de figura\nAumento de SX=Y\tAumento de SY=U\tDisminución de SX=H\n";
    info += "Disminución de SY=J\tEscalar=Z\nEstalación de figura con punto fijo\n";
    info += "Aumento de PFx=I\tAumento de PFy=O\tDisminución de PFx=K\n";
    info += "Disminución de PFy=L\tEscalar punto fijo=X\tRotar figura\nAumentar ángulo=P\t";
    info +="Disminuir ángulo=Ñ\tRotar=C\n";
    info +="Animacion\nIniciar=N\tParar=M\nReiniciar figura=V\nCerrar=F10";
    QMessageBox::information(nullptr,"Comandos de teclado",info);
}

void Dialog::on_checkBoxTeclado_2_clicked(bool checked)
{
    if(checked){
        ui->widget->setEnabled(false);
    }else
        ui->widget->setEnabled(true);
}

void Dialog::on_pushButtonAnimar_clicked()
{
   timer->start(20);
}

void Dialog::on_pushButtonRotacionPuntoFijo_clicked()
{
    double angulo = ui->spinBoxAngulo->value();
    double pfx = ui->doubleSpinBoxPFx_Rotacion->value();
    double pfy = ui->doubleSpinBoxPFy_Rotacion->value();
    rotacionPuntoFijo(angulo,pfx,pfy);
}
