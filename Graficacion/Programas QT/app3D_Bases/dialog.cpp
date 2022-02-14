#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    alpha = 63.4;  // 45;
    ui->dialAlfa->setValue(alpha);
    phi = 30; // 45;
    ui->dialPhi->setValue(phi);

    tX = tY = tZ = 0;

    //centro del cubo ejemplo
     xC = 150;
     yC = 100;
     zC = 50;

    rX = rY = rZ = false;

    anguloX = anguloY = anguloZ = 0;

    asignaCubo();
}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::paintEvent(QPaintEvent *evento)
{
    Q_UNUSED(evento)
    inicializaPuerto();
    proyeccionCubo();
    canvas->end();

}

void Dialog::keyPressEvent(QKeyEvent *e)
{
    // ALFA
    if(e->key() == Qt::Key_Z){ // +
       ui->dialAlfa->setValue(ui->dialAlfa->value()+1);
    }
    if(e->key() == Qt::Key_X){ // -
       ui->dialAlfa->setValue(ui->dialAlfa->value()-1);
    }

    //PHI
    if(e->key() == Qt::Key_C){ // +
       ui->dialPhi->setValue(ui->dialPhi->value()+1);
    }
    if(e->key() == Qt::Key_V){ // -
       ui->dialPhi->setValue(ui->dialPhi->value()-1);
    }


    //TRASLACION
        if(e->key() == Qt::Key_A)
        {
          tX-=5;
        }
        if(e->key() == Qt::Key_D)
        {
          tX+=5;
        }
        if(e->key() == Qt::Key_W)
        {
           tY+=5;
        }
        if(e->key() == Qt::Key_S)
        {
            tY-=5;
        }
        if(e->key() == Qt::Key_E)
        {
           tZ+=5;
        }
        if(e->key() == Qt::Key_Q)
        {
            tZ-=5;
        }

        //ROTACION
        if(e->key() == Qt::Key_1)
        {
            anguloX+=10; rX=true;  rY=false;  rZ=false;
        }
        if(e->key() == Qt::Key_2)
        {
            anguloX-=10; rX=true;  rY=false;  rZ=false;
        }
        if(e->key() == Qt::Key_3)
        {
            anguloY+=10; rX=false;  rY=true;  rZ=false;
        }
        if(e->key() == Qt::Key_4)
        {
            anguloY-=10; rX=false;  rY=true;  rZ=false;
        }
        if(e->key() == Qt::Key_5)
        {
            anguloZ+=10; rX=false;  rY=false;  rZ=true;
        }
        if(e->key() == Qt::Key_6)
        {
            anguloZ-=10; rX=false;  rY=false;  rZ=true;
        }
        if(e->key() == Qt::Key_4)
        {
            anguloY-=10; rX=false;  rY=true;  rZ=false;
        }

        //Seleccion de rotacion
        if(e->key() == Qt::Key_R)
        {
            //centro del cubo ejemplo
             xC = 150;
             yC = 100;
             zC = 50;
             ui->radioButtonCentroCubo->setChecked(true);
        }
        if(e->key() == Qt::Key_T)
        {
            //eje frontal
            xC = 100;
            yC = 50;
            zC = 0;
            ui->radioButtonFrontal->setChecked(true);
        }
        if(e->key() == Qt::Key_Y)
        {
            // eje fuera del cubo
            xC = 150*2;
            yC = 100*2;
            zC = 50*3;
            ui->radioButtonFuera->setChecked(true);
        }
        repaint();
}

void Dialog::asignaCubo()
{
    Puntos3D cuboBase[] = {{100, 50, 0, 0},
                           {200, 50, 0, 1},
                           {200, 150, 0, 1},
                           {100, 150, 0, 1},
                           {100, 50, 0, 1},
                           {100, 50, 100, 1},
                           {200, 50, 100, 1},
                           {200, 150, 100, 1},
                           {200, 150, 0, 1},
                           {200, 50, 0, 0},
                           {200, 50, 100, 1},
                           {100, 50, 100, 0},
                           {100, 150, 100, 1},
                           {100, 150, 0, 1},
                           {100, 150, 100, 0},
                           {200, 150, 100, 1}};

    cubo = new Puntos3D[16];
    for(int i=0;i<16;i++)
        cubo[i] = cuboBase[i];

    inicializaPuerto();
    ancho = this->size().width() - ui->widget->size().width();
}

void Dialog::proyeccionCubo()
{
    canvas = new QPainter(this);
    canvas->setPen(QPen(Qt::blue,3)); //para los ejes

    //eje x
    canvas->drawLine(0,this->size().height()-1,ancho,size().height()-1);

    //eje y
    canvas->drawLine(1,0,1,size().height());

    //eje z
    int zx1 = 0;
    int zy1 = 0;

    double zx2 = ancho*cos(radianes(phi)); //(qDegreesToRadians(phi)); //
    double zy2 = ancho*sin(radianes(phi)); //qDegreesToRadians(phi));

    int x1,y1,x2,y2;

    mapeo.mapear(zx1,zy1, x1,y1,L,M);
    mapeo.mapear(zx2,zy2, x2,y2,L,M);

    //dibujar el eje z
    canvas->drawLine(x1,y1,x2,y2);

    //Rotacion
    int x,y,z;
    for(int i=0; i<16; i++){
        x=cubo[i].x;
        y=cubo[i].y;
        z=cubo[i].z;

        if (rX){
            x=cubo[i].x;
            //qround o redondear
            y=floor((yC+(cubo[i].y-yC)*cos(radianes(anguloX))+(cubo[i].z-zC)*sin(radianes(anguloX)))+0.5);
            z=floor((zC+(-(cubo[i].y-yC)*sin(radianes(anguloX)))+(cubo[i].z-zC)*cos(radianes(anguloX)))+0.5);
        }
        if(rY){
            x = floor((cubo[i].x-xC)*cos(radianes(anguloY))-(cubo[i].z-zC)*sin(radianes(anguloY))+xC);
            y = cubo[i].y;
            z = floor((cubo[i].z-zC)*cos(radianes(anguloY))+(cubo[i].x-xC)*sin(radianes(anguloY))+zC);
        }
        if(rZ){
            x = floor((cubo[i].x-xC)*cos(radianes(anguloZ))-(cubo[i].y-yC)*sin(radianes(anguloZ))+xC);
            y = floor((cubo[i].x-xC)*sin(radianes(anguloZ))+(cubo[i].y-yC)*cos(radianes(anguloZ))+yC);
            z = cubo[i].z;
        }
        if(cubo[i].opcion)
           lineTo3D(x + tX ,y + tY ,z + tZ ,radianes(alpha),radianes(phi),i);
        else
           moveTo3D(x + tX,y + tY ,z + tZ ,radianes(alpha),radianes(phi),i);
    }
    canvas->setPen(QPen(QColor(255,100,0),2));
    dibujarCubo();
}

void Dialog::dibujarCubo()
{
    for(int i=0;i<15;i++){
        canvas->drawLine(points[i].x(),points[i].y(),points[i+1].x(),points[i+1].y());
    }
}

void Dialog::inicializaPuerto()
{
    mapeo.ventana(0,0,size().width()-ancho,size().height());
    mapeo.puerto(0,0,size().width()-ancho,size().height());
    L=0;
    M = size().height();
}

void Dialog::lineTo3D(int x, int y, int z, float alpha, float phi, int i)
{
    int xp, yp;
    int longitud; // segmento L de la proyeccion
    float tanalpha;
    if((tanalpha = tan(alpha)) != 0)
        longitud = (int)(z/tanalpha);
    else
        longitud = 0;

    xp = x + longitud * cos(phi);
    yp = y + longitud * sin(phi);

    // Mapear los valores proyectados
    int x1,y1;
    mapeo.mapear(xp,yp,x1,y1,L,M);

    //se asigna uno a uno los verices del cubo
    points[i].setX(x1);
    points[i].setY(y1);
}

void Dialog::moveTo3D(int x, int y, int z, float alpha, float phi, int i)
{
    int xp, yp;
    int longitud; // segmento L de la proyeccion
    float tanalpha;
    if((tanalpha = tan(alpha)) != 0)
        longitud = (int)(z/tanalpha);
    else
        longitud = 0;

    xp = x + longitud * cos(phi);
    yp = y + longitud * sin(phi);

    // Mapear los valores proyectados
    int x1,y1;
    mapeo.mapear(xp,yp,x1,y1,L,M);

    //se asigna uno a uno los verices del cubo
    points[i].setX(x1);
    points[i].setY(y1);
}



void Dialog::on_dialAlfa_valueChanged(int value)
{
    alpha = value;
    inicializaPuerto();
    repaint();
}

void Dialog::on_dialPhi_valueChanged(int value)
{
    phi = value;
    inicializaPuerto();
    repaint();
}

void Dialog::on_pushButtonArriba_clicked()
{
    tY+=5;
     repaint();
}

void Dialog::on_pushButtonAbajo_clicked()
{
    tY-=5;
    repaint();
}

void Dialog::on_pushButtonDerecha_clicked()
{
    tX+=5;
    repaint();
}

void Dialog::on_pushButtonIzquierda_clicked()
{
    tX-=5;
    repaint();
}

void Dialog::on_pushButtonZmas_clicked()
{
    tZ+=5;
    repaint();
}

void Dialog::on_pushButtonZmenos_clicked()
{
    tZ-=5;
    repaint();
}

void Dialog::on_checkBoxTeclado_clicked(bool checked)
{
    if(checked)
            ui->widget->setEnabled(false);
        else
            ui->widget->setEnabled(true);
}

void Dialog::on_pushButtonRotacionXmas_clicked()
{
    anguloX+=10; rX=true;  rY=false;  rZ=false;
    repaint();
}

void Dialog::on_pushButtonRotacionXmenos_clicked()
{
    anguloX-=10; rX=true;  rY=false;  rZ=false;
    repaint();
}

void Dialog::on_pushButtonRotacionYmas_clicked()
{
    anguloY+=10; rX=false;  rY=true;  rZ=false;
    repaint();
}

void Dialog::on_pushButtonRotacionYmenos_clicked()
{
    anguloY-=10; rX=false;  rY=true;  rZ=false;
    repaint();
}

void Dialog::on_pushButtonRotacionZmas_clicked()
{
    anguloZ+=10; rX=false;  rY=false;  rZ=true;
    repaint();
}

void Dialog::on_pushButtonRotacionZmenos_clicked()
{
    anguloZ-=10; rX=false;  rY=false;  rZ=true;
    repaint();
}

void Dialog::on_radioButtonCentroCubo_clicked()
{
    //centro del cubo ejemplo
     xC = 150;
     yC = 100;
     zC = 50;
}

void Dialog::on_radioButtonFrontal_clicked()
{
    //eje frontal
    xC = 100;
    yC = 50;
    zC = 0;
}

void Dialog::on_radioButtonFuera_clicked()
{
    // eje fuera del cubo
    xC = 150*2;
    yC = 100*2;
    zC = 50*3;
}

void Dialog::on_pushButtonComandos_clicked()
{
    QString info = "ALFA\n"
            "+ = Z  - = X\n"
            "\nPHI\n"
            "+ = C  - = V\n"
            "\nTRASLACION\n"
            "X+ = A      X- = D\n"
            "Y+ = W      Y+ = S\n"
            "Z+ = E      Z- = Q\n"
            "\nROTACION\n"
            "Angulo X+ = 1\tAngulo X- = 2\n"
            "Angulo Y+ = 3\tAngulo Y- = 4\n"
            "Angulo Z+ = 5\tAngulo Z- = 5\n"
            "Centro del cubo = R\n"
            "Eje frontal del cubo = T\n"
            "Fuera del cubo =  Y\n";
    QMessageBox::information(nullptr,"Comandos de teclado",info);
}
