#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    asignarFigura();
}

Dialog::~Dialog()
{
    delete ui;
}


void Dialog::paintEvent(QPaintEvent *event)
{
    Q_UNUSED(event)

    canvas = new QPainter(this);

    dibujarFiguraMapeada();

    canvas->end();
}
void Dialog::asignarFigura()
{
    Fig[0][0] = 140; Fig[0][1] = 20; Fig[0][2] = 1;
    Fig[1][0] = 160; Fig[1][1] = 40; Fig[1][2] = 1;
    Fig[2][0] = 160; Fig[2][1] = 80; Fig[2][2] = 1;
    Fig[3][0] = 140; Fig[3][1] = 100; Fig[3][2] = 1;

    Fig[4][0] = 90; Fig[4][1] = 100; Fig[4][2] = 1;
    Fig[5][0] = 80; Fig[5][1] = 90; Fig[5][2] = 1;
    Fig[6][0] = 80; Fig[6][1] = 80; Fig[6][2] = 1;
    Fig[7][0] = 60; Fig[7][1] = 80; Fig[7][2] = 1;

    Fig[8][0] = 60; Fig[8][1] = 110; Fig[8][2] = 1;
    Fig[9][0] = 150; Fig[9][1] = 120; Fig[9][2] = 1;
    Fig[10][0] = 160; Fig[10][1] = 130; Fig[10][2] = 1;
    Fig[11][0] = 140; Fig[11][1] = 150; Fig[11][2] = 1;

    Fig[12][0] = 50; Fig[12][1] = 150; Fig[12][2] = 1;
    Fig[13][0] = 40; Fig[13][1] = 130; Fig[13][2] = 1;
    Fig[14][0] = 40; Fig[14][1] = 40; Fig[14][2] = 1;
    Fig[15][0] = 50; Fig[15][1] = 20; Fig[15][2] = 1;
    Fig[16][0] = 140; Fig[16][1] = 20; Fig[16][2] = 1;
    //regresa al inicio de la figura
   Fig[17][0] = 140;  Fig[17][1] = 20;  Fig[17][2] = 1;


   Fig2[0][0] = 100; Fig2[0][1] = 40; Fig2[0][2] = 1;
   Fig2[1][0] = 120; Fig2[1][1] = 40; Fig2[1][2] = 1;
   Fig2[2][0] = 130; Fig2[2][1] = 50; Fig2[2][2] = 1;
   Fig2[3][0] = 130; Fig2[3][1] = 60; Fig2[3][2] = 1;

   Fig2[4][0] = 120; Fig2[4][1] = 70; Fig2[4][2] = 1;
   Fig2[5][0] = 100; Fig2[5][1] = 70; Fig2[5][2] = 1;
   Fig2[6][0] = 90; Fig2[6][1] = 60; Fig2[6][2] = 1;
   Fig2[7][0] = 90; Fig2[7][1] = 50; Fig2[7][2] = 1;
    //regresa al inicio de la figura
   Fig2[8][0] = 100; Fig2[8][1] = 40; Fig2[8][2] = 1;


    //Respaldar la figura original para resetearla cuando sea necesario
    for(int r = 0; r < 17; r++)
        for(int c = 0; c < 3; c++)
            FigAux[r][c] = Fig[r][c];

    //ancho = this->size().width() - ui->widget->size().width();
    ancho = this->size().width() - ui->widget->size().width();
    centroX = ancho / 2;
    centroY = this->size().height() / 2;

    tx = ty = 0;


}

void Dialog::dibujarFiguraMapeada()
{
    Mapeo dibujo;

    canvas->drawLine(0, size().height()/2, ancho, size().height()/2);
    canvas->drawLine(ancho/2,0,ancho/2,size().height());

    //Colocacion del puerto en el centro de la forma donde se esta dibujando
    dibujo.ventana(ancho / 2, 0, ancho, size().height()/2);
    dibujo.puerto(ancho/2, 0, ancho, size().height()/2);



    //En el rectangulo el ancho y el alto

    canvas->setPen(QColor(0,0,255));

    int L = centroX;
    int M = centroY; //YPVMIN + YPVMAX

    int x1, y1, x2, y2;

    //Calcular los extremos de la linea
    //dibujo.mapear(Fig[0][0], Fig[0][1], x1, y1, L, M);
    //dibujo.mapear(Fig[2][0], Fig[2][1], x2, y2, L, M);

    //canvas->drawLine(x1, y1, x2, y2);

    for(int i = 0; i < 17; i++)
    {
        dibujo.mapear(Fig[i][0], Fig[i][1], x1, y1, L, M);
        dibujo.mapear(Fig[i+1][0], Fig[i+1][1], x2, y2, L, M);

        canvas->drawLine(x1, y1, x2, y2);
    }
}

void Dialog::trasladar(int tX, int tY)
{
    Matrix fig, id, figres; //OBJETOS ESTATICOS

    fig.Inicializa(4,3);
    figres.Inicializa(4,3);
    id.Inicializa(3,3);

    for(int i = 0; i < fig.numRen(); i++)
    {
        for(int j = 0; j < fig.numCol(); j++)
        {
            fig.SET(i,j,Fig[i][j]);
        }
    }

    //Aplicar traslacion
    figres.traslacion(fig, id, tX, tY);

    //Guardamos los puntos transformados en la fig original
    for(int i = 0; i < fig.numRen(); i++)
    {
        for(int j = 0; j < fig.numCol(); j++)
        {
            Fig[i][j] = figres.GET(i,j);
        }
    }

    repaint();
}

void Dialog::escalar(float sX, float sY)
{
    Matrix fig,id,fres;
    fig.Inicializa(4,3);
    id.Inicializa(3,3);
    fres.Inicializa(4,3);
    for(int i=0;i<fig.numRen();i++)
        for(int j = 0; j < fig.numCol();j++)
            fig.SET(i,j,Fig[i][j]);

    fres.escalacion(fig,id,sX,sY);

    for(int i = 0; i < fres.numRen(); i++)
        for(int j = 0; j < fres.numCol();j++)
            Fig[i][j]= fres.GET(i,j);

    repaint();
}

void Dialog::on_btnIzq_clicked()
{
    trasladar(tx - ui->spinBox->value(), 0);
}

void Dialog::on_btnArriba_clicked()
{
    trasladar(0, ty + ui->spinBox_2->value());
}

void Dialog::on_btnDer_clicked()
{
    trasladar(tx + ui->spinBox->value(), 0);
}

void Dialog::on_btnAbajo_clicked()
{
    trasladar(0, ty - ui->spinBox_2->value());
}

//boton reiniciar
void Dialog::on_pushButton_clicked()
{//asigna los puntos guardados en la fig aux a la fig que se esta manipulando
    for(int i = 0; i<4; i++){
        for(int j=0;j<3;j++)
            Fig[i][j] = FigAux[i][j];

    }
    tx = ty = 0;
    update();
}

void Dialog::on_pushButton_2_clicked()
{
    double sX = ui->spinBoxSx->value();
    double sY = ui->spinBoxSy->value();

    escalar(sX,sY);
}

void Dialog::on_pushButton_3_clicked()
{
    {
        if(XPVMAX>220){
        XPVMAX -= 10;
        YPVMAX -= 10;
        XPVMIN += 10;
        YPVMIN += 10;
        rx1+=10;
        ry1+=10;
        rAncho-=20;
        rAlto-=20;
        on_pushButton_2_clicked();
        }
    }
}


void Dialog::on_pushButton_4_clicked()
{

}
