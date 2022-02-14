#include "dialog.h"
#include "ui_dialog.h"
#include <QMessageBox>
Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    asignarFigura();
    tx = ty = 0;
    timer1 = new QTimer();
    timer2 = new QTimer();
    connect(timer1, SIGNAL(timeout()), this, SLOT(rotarAnimacion1()));
    connect(timer2, SIGNAL(timeout()), this, SLOT(rotarAnimacion2()));

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
       //on_pushButtonDisminuir_clicked();
    }
    if(evento->key() == Qt::Key_E){
      //on_pushButtonAumentar_clicked();
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
      on_pushButton_2_clicked();
    }
    //reiniciar figura
    if(evento->key() == Qt::Key_V){
      on_pushButton_clicked();
    }
    //cerrar
    if(evento->key() == Qt::Key_F10){
        this->close();
    }
}

void Dialog::asignarFigura()
{
    Fig[0][0] = 10; Fig[0][1] = 10;Fig[0][2] = 1;
    Fig[1][0] = 30; Fig[1][1] = 10;Fig[1][2] = 1;
    Fig[2][0] = 10; Fig[2][1] = 30;Fig[2][2] = 1;
    // regresa al inicio de la figura
    Fig[3][0] = 10; Fig[3][1] = 10;Fig[3][2] = 1;

    for(int r=0;r<4;r++){
        for(int c=0;c<3;c++){
            FigAux[r][c] = Fig[r][c];

         }
    }
    ancho = this->size().width() - ui->widget->size().width();
    centroX = ancho/2;
    centroY = this->size().height()/2;
    tx = ty = 0;
}

void Dialog::dibujarFiguraMapeada()
{
    // dibujar los ejes cartesianos
     canvas->setPen(QColor(0,0,255));
     //Linea horizontal
     canvas->drawLine(0,size().height()/2,ancho,size().height()/2);
     //linea vertical
     canvas->drawLine(ancho/2,0,ancho/2,size().height());


     Mapeo dibujo;
     //ventana representa el mundo real
     dibujo.ventana(ancho/2,0,ancho,size().height()/2);
     //puerto de vision representa el area de despliegue en el dispositivo
     dibujo.puerto(ancho/2,0,ancho,size().height()/2);

     canvas->setPen(QColor(0,0,155));

     int L = centroX;
     int M = centroY; // YPVMIN + YPVMAX

     int x1,y1,x2,y2;
     //calcular los extremos de la linea
     //dibujo.mapear(Fig[0][0],Fig[0][1],x1,y1,L,M);
     //dibujo.mapear(Fig[2][0],Fig[2][1],x2,y2,L,M);
     //canvas->drawLine(x1,y1,x2,y2);
     for(int i=0;i<3;i++){
         dibujo.mapear(Fig[i][0],Fig[i][1],x1,y1,L,M);
         dibujo.mapear(Fig[i+1][0],Fig[i+1][1],x2,y2,L,M);
         canvas->drawLine(x1,y1,x2,y2);
     }
}

void Dialog::trasladar(int tX, int tY)
{
    Matrix fig, id,figres; //objetos estaticos
    fig.Inicializa(4,3);
    figres.Inicializa(4,3);
    id.Inicializa(3,3);

    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);

    //aplicar la traslacion
    figres.traslacion(fig,id,tX,tY);
    //guardamos los puntos transfomrados en la fig original
    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            Fig[i][j] = figres.GET(i,j);

    repaint();
}

void Dialog::escalar(float sX, float sY)
{
    Matrix fig,id,figres;
    fig.Inicializa(4,3);
    id.Inicializa(3,3);
    figres.Inicializa(4,3);
    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);

    figres.escalacion(fig,id,sX,sY);

    for(int i=0;i<figres.numRen();i++)
        for(int j=0;j<figres.numCol();j++)
            Fig[i][j] = figres.GET(i,j);

    repaint();
}

void Dialog::escalaPuntoFijo(float sX, float sY, int PFx, int PFy)
{
    Matrix fig,id,figres;
    fig.Inicializa(4,3);
    id.Inicializa(3,3);
    figres.Inicializa(4,3);
    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);

    figres.escalacionPuntoFijo(fig,id,sX,sY,PFx,PFy);

    for(int i=0;i<figres.numRen();i++)
        for(int j=0;j<figres.numCol();j++)
            Fig[i][j] = figres.GET(i,j);

    repaint();
}

void Dialog::rotacion(int angulo)
{
    Matrix fig,id,figres;
    fig.Inicializa(4,3);
    id.Inicializa(3,3);
    figres.Inicializa(4,3);

    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);
    figres.rotacion(fig,id,angulo);

    for(int i=0;i<figres.numRen();i++)
        for(int j=0;j<figres.numCol();j++)
            Fig[i][j] = figres.GET(i,j);

    repaint();

}

void Dialog::rotacionPuntoFijo(int angulo, float pfx, float pfy)
{
    Matrix fig,id,figres;
    fig.Inicializa(4,3);
    id.Inicializa(3,3);
    figres.Inicializa(4,3);

    for(int i=0;i<fig.numRen();i++)
        for(int j=0;j<fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);
    figres.rotacionPuntoFijo(fig,id,angulo,pfx,pfy);

    for(int i=0;i<figres.numRen();i++)
        for(int j=0;j<figres.numCol();j++)
            Fig[i][j] = figres.GET(i,j);

    repaint();
}

void Dialog::on_pushButtonArriba_clicked()
{
  trasladar(0,ty+ui->spinBoxTy->value());
}

void Dialog::on_pushButtonAbajo_clicked()
{
  trasladar(0,ty-ui->spinBoxTy->value());
}

void Dialog::on_pushButtonDerecha_clicked()
{
  trasladar(tx+ui->spinBoxTx->value(),0);
}

void Dialog::on_pushButtonIzquierda_clicked()
{
 trasladar(tx-ui->spinBoxTx->value(),0);

}

void Dialog::on_pushButton_clicked() //reiniciar
{// asignamos lo puntos guardado en figAux a la figura que esta manipulando
    for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
            Fig[i][j] = FigAux[i][j];
        }
    }
    tx = ty = 0;
    timer1->stop();
    timer2->stop();
    repaint();
}

void Dialog::on_pushButtonEscalar_clicked()
{
    double sX = ui->doubleSpinBoxSX->value();
    double sY = ui->doubleSpinBoxSY->value();
    escalar(sX,sY);
}

void Dialog::on_pushButtonEscalacionPF_clicked()
{
    double sX = ui->doubleSpinBoxSX->value();
    double sY = ui->doubleSpinBoxSY->value();
    int PFx = int(ui->doubleSpinBoxPFx->value());
    int PFy = int(ui->doubleSpinBoxPFy->value());
    escalaPuntoFijo(sX,sY,PFx,PFy);
}


void Dialog::on_pushButton_2_clicked()
{
    int grado = ui->spinBoxAngulo->value();
    rotacion(grado);
}

void Dialog::on_pushButtonRotacionPuntoFijo_clicked()
{
    double angulo = ui->spinBoxAngulo->value();
    double pfx = ui->doubleSpinBoxPFx_Rotacion->value();
    double pfy = ui->doubleSpinBoxPFy_Rotacion->value();
    rotacionPuntoFijo(angulo,pfx,pfy);

}

void Dialog::on_checkBoxTeclado_clicked(bool checked)
{
    if(checked){
        ui->widget->setEnabled(false);
    }else
        ui->widget->setEnabled(true);
}

void Dialog::on_pushButtonComandos_clicked()
{
    QString info = "Lista de comandos con teclado\n";
    info += "Traslación de figura\nAumento de TX = R\nAumento de TY = T\nDisminución de TX = F\n ";
    info += "Disminución de TY = G\nTrasladar figura\nArriba = W\n";
    info += "Abajo = S\nIzquierda = A\nDerecha = D7\nEstalación de figura\nAumento de SX = Y\n";
    info += "Aumento de SY = U\nDisminución de SX = H\nDisminución de SY = J\nEscalar = Z\n";
    info += "Estalación de figura con punto fijo\nAumento de PFx = I\nAumento de PFy = O\n";
    info += "Disminución de PFx = K\nDisminución de PFy = L\nEscalar punto fijo = X\n";
    info += "Rotar figura\nAumentar ángulo = P\nDisminuir ángulo = Ñ\nRotar = C\n";
    info +="Reiniciar figura = V\nCerrar = F10";
    QMessageBox::information(nullptr,"Comandos de teclado",info);
}

void Dialog::on_pushButtonAnimacion1_clicked()
{
    timer2->stop();
    timer1->start(50);
}

void Dialog::on_pushButtonAnimacion2_clicked()
{
    timer1->stop();
    timer2->start(50);
}

void Dialog::rotarAnimacion1()
{
    static int angulo = 0;
    static int cont = 0;

    if(cont<=8){
        angulo = 45;
        if(cont==8){
            angulo=0;
            cont=0;
        }
        double pfx = 20; //usar el valor de los spinBox
        double pfy = 30;
        rotacionPuntoFijo(angulo,pfx,pfy);
        cont++;
    }
}

void Dialog::rotarAnimacion2()
{
    // Rotacion con angulo +, en sentido contrario a las manecillas del reloj
    // Rotacion con angulo -, es en sentido de las manecillas del reloj
    static bool dir = true;
    static int angulo = 0;
    static int cont = 0;
    if(cont<=9 && dir == true){
        angulo = 45;
        double pfx = 10;
        double pfy = 10;
        rotacionPuntoFijo(angulo,pfx,pfy);
        cont++;
        if(cont==9){
            angulo = 0;
            cont = 0;
            dir = false;
        }
    }
    if(!dir){
        angulo=-45;
        double pfx=10;
        double pfy=10;
        rotacionPuntoFijo(angulo,pfx,pfy);
        cont++;
        if(cont==9){
            angulo=0;
            cont=0;
            dir=true;
        }
    }
}


// espacio del mundo real: 10000 unidades
//dibujo.ventana(0,0,10000,10000);
//dibujo.ventana(0,0,10,10);
// Tamaño de una hoja de maquina
//dibujo.ventana(0,0,21.5,28);
// colocacion del puerto en el contro de la forma donde se esta dibujando
// int L = 0;
// int M = this->size().height();

 //int L = 0;//= centroX; si xpvmin es el factor de traslacion
 //int L = centroX;
//int M = centroY;
