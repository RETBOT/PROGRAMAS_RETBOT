#include "dialog.h"
#include "ui_dialog.h"
#include <conio.h>

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;

}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::paintEvent(QPaintEvent *e)
{
    Q_UNUSED(e);
    if((dragon1||dragon2) == true)
        dragon();
    else if(dhenon)
         henon();
    else if(dmalthus1)
         malthus1();
    else if(dmalthus2)
         malthus2();
    else if(dmandel)
        mandel();
}


void Dialog::dragon() // representa el main en la app. DOS de turboC
{
    QPainter canvas(this);
    paso = 4096;
    signo = -1;
    if(dragon1){
    ejeX[1] = canvas.window().width()/4;
    ejeX[4097] = 3 * canvas.window().width()/4;
    ejeY[1] = ejeY[4097] = canvas.window().height()/2;
    }else if(dragon2){
          ejeX[1] = canvas.window().width()/4;
          ejeX[4097] = 3 * canvas.window().width()/4;
          ejeY[1] = ejeY[4097] = canvas.window().height()/4;
    }

    canvas.setFont(QFont("ROCKWELL",10));
    canvas.drawText(5,15,"Curva fractal del dragon");


    QString datos = "X1 = " +QString::number(ejeX[1]);
        datos +=  ",Y1 = " +QString::number(ejeY[1])
                + ",X2 = " +QString::number(ejeX[4097])
                + ",Y2 = "+ QString::number(ejeY[4097]);

     canvas.drawText(5,30,datos);
     canvas.setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
    //dibujar la primer
     canvas.drawLine(ejeX[1],ejeY[1],ejeX[4097],ejeY[4097]);

    for(int i=1;i<=13;i++){
        generarDragon(&canvas);
        paso/=2;
    }

}

void Dialog::generarDragon(QPainter *canvas)
{
    int j, dx, dy;
    j = paso/2;

    for(int i=1;i<=4096;i+=paso){
        dx = ejeX[paso+i] - ejeX[i];
        dy = ejeY[paso+i] - ejeY[i];
        if(dragon1){
        signo *=-1;
        }else if(dragon2){
            // sin signo
        }
        ejeX[i+j] = ejeX[i] + (dx+(dy * signo))/2;
        ejeY[i+j] = ejeY[i] + (dy-(dx * signo))/2;
        canvas->setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));

        canvas->drawLine(ejeX[i+j],ejeY[i+j],ejeX[i+paso],ejeY[i+paso]);
        canvas->drawLine(ejeX[i],ejeY[i],ejeX[i+j],ejeY[i+j]);
    }
}

void Dialog::henon()
{
    QPainter canvas(this);
    EscalaX = 1;
    EscalaY = 1;
    DespX = 0;
    DespY = 0;
    ExtranioConfinador(&canvas);
}

void Dialog::ExtranioConfinador(QPainter *canvas)
{
    maxX = canvas->window().width();
    maxY = canvas->window().height()/2;

    int a,i,Color,PosX,PosY;
    double Xant,Xnuevo,Yant,Ynuevo;

    Xant = Xnuevo = Yant = Ynuevo = 0;

    for(Color = 1; Color<=15; Color++){
        for(i=1; i<=0x02ff; i++){
            Xnuevo = Yant + 1 - (1.4 * Xant * Xant);
            Ynuevo = 0.3 * Xant;
            PosX = (Xnuevo * maxX / 3 * EscalaX) + maxX / 2 + DespX;
            PosY = (Ynuevo * maxY * EscalaY) + maxY / 2 + DespY;
            if((PosX >= 0) && (PosX <= maxX) &&
               (PosY >= 0) && (PosY <= maxY)){
                canvas->drawPoint(PosX,PosY);
                canvas->setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
            }
                Yant = Ynuevo;
                Xant = Xnuevo;
        }

         canvas->drawText(5,10,"Confinador de Henon");
         canvas->drawText(5,20,"EscalaX = "+QString::number(EscalaX));
         canvas->drawText(5,30,"EscalaY = "+QString::number(EscalaY));
         canvas->drawText(5,40,"DespX = "+QString::number(DespX));
         canvas->drawText(5,50,"DespY = "+QString::number(DespY));
    }


}

void Dialog::malthus1()
{
    QPainter canvas(this);
    ExtranioConfinadorMalthus1(&canvas);
}

void Dialog::ExtranioConfinadorMalthus1(QPainter *canvas)
{
    maxX = canvas->window().width();
    maxY = canvas->window().height();
    int i,j,Contador,X,Y;
    double PobAnt, PobNueva, Razon;
    PobNueva = PobAnt = 0.0;
    Razon = 2.3;

    for(j=1; j<151; j++){
        Razon += 0.01;
        PobAnt = 0.1;
        for(i=1;i<canvas->window().width();i++){
            PobNueva = Razon * (PobAnt * (1-PobAnt));
            X = PobAnt * maxX;
            Y = maxY - (PobNueva * maxY);
            canvas->setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
            canvas->drawPoint(X,Y);
            if(PobAnt == PobNueva)
                Contador++;
            else
                Contador = 0;
            if(Contador > 10)
                i = canvas->window().width();
            PobAnt = PobNueva;
        }
        canvas->drawText(10,10,"Flujo Maltusiano");
    }
}

void Dialog::malthus2()
{
    QPainter canvas(this);
     ExtranioConfinadorMalthus2(&canvas);
}

void Dialog::ExtranioConfinadorMalthus2(QPainter *canvas)
{
    int i,j,k,Contador;
    double PobAnt,PobNueva,X,Y,Razon;

    maxX = canvas->window().width();
    maxY = canvas->window().height();

    PobAnt = PobNueva = 0.0;
    Razon = 2.3;
    Y = 0;
    for(j=1; j<=15; j++){
        for(k=1; k<=10; k++){
            Contador = 0;
            Razon += 0.01;
            PobAnt = 0.01;
            for(i = 1; i<=1000; i++){
                PobNueva = Razon * (PobAnt * (1-PobAnt));
                X = PobNueva - PobAnt;
                canvas->setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
                canvas->drawPoint((X * maxX / 2) + maxX / 2,
                                   (maxY / 2) - (Y * maxY / 2));
                if(PobAnt == PobNueva)
                    Contador++;
                else
                    Contador = 0;
                if(Contador > 100)
                    i = 10000;
                PobAnt = PobNueva;
                Y = X;
            }
        }
    }
    canvas->drawText(10,10,"Flujo Maltusiano");
}

void Dialog::mandel()
{
    QPainter canvas(this);
    canvas.setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
    maxXMandel = canvas.window().width();
    maxYMandel = canvas.window().height()-100;
    Limite = 100;

    OrigX = -2.0;
    OrigY = -1.25;
    DimX = 0.5;
    DimY = 1.25;

    PasoX = (DimX - OrigX) / maxXMandel;
    PasoY = (DimY - OrigY) / maxYMandel;

    for(i=0; i<= maxXMandel; i++){
        for(j=0; j<= maxYMandel; j++){
            PosX = OrigX + i * PasoX;
            PosY = OrigY + j * PasoY;
            IterX = 0.0;
            IterY = 0.0;
            Terminar = Pasos = 0;
            while(!Terminar){
                TempX = (IterX * IterX) -
                        (IterY * IterY) + PosX;
                IterY = 2 * (IterX * IterY) + PosY;
                IterX = TempX;
                Pasos++;
                if(hypot(fabs(IterX),fabs(IterY))
                          >= 2.0)
                    Terminar++;
                if(Pasos >= Limite) Terminar++;
                if( kbhit() ){   
                    i = maxXMandel;
                    j = maxYMandel;
                    Terminar++;
                }
               }
                if(Pasos < Limite)
                    canvas.drawPoint(i,j);
                    canvas.setPen(QColor(qrand()%155+100,qrand()%155+100,qrand()%155+100));
            }
        }
}

void Dialog::on_pushButton_2_clicked()
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    if(ui->radioButtonDragon1->isChecked()){
        dragon1 = true ;
        dragon1 = ui->radioButtonDragon1->isChecked();
    }else if(ui->radioButtonDragon2->isChecked()){
            dragon2 = true;
            dragon2 = ui->radioButtonDragon2->isChecked();
    }else if(ui->radioButtonHenon->isChecked()){
            dhenon = true;
    }else if(ui->radioButtonMalhus1->isChecked()){
            dmalthus1 = true;
    }else if(ui->radioButtonMalhus2->isChecked()){
            dmalthus2 = true;
    }else if(ui->radioButtonMandel->isChecked()){
            dmandel = true;
    }
    repaint();
}

void Dialog::on_radioButtonDragon2_clicked() //arabesco
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dragon2 = true;
    dragon2 = ui->radioButtonDragon2->isChecked();
    repaint();
}

void Dialog::on_radioButtonDragon1_clicked() // dragon
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dragon1 = true ;
    dragon1 = ui->radioButtonDragon1->isChecked();
    repaint();
}

void Dialog::on_radioButtonHenon_clicked()
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dhenon = true;
    repaint();
}

void Dialog::on_radioButtonMalhus1_clicked()
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dmalthus1 = true;
    repaint();
}

void Dialog::on_radioButtonMalhus2_clicked()
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dmalthus2 = true;
    repaint();
}

void Dialog::on_radioButtonMandel_clicked()
{
    dragon1 = dragon2 = dhenon = dmalthus1 = dmalthus2 = dmandel = false;
    dmandel = true;
    repaint();
}
