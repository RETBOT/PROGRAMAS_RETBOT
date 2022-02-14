#include "dialog.h"
#include "ui_dialog.h"
#include <QMessageBox>

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);

    x1 = y1 = x2 = y2 = 0;

    factor = th = rad = aumth = aumrad = 0.0;

    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
}

Dialog::~Dialog()
{
    delete ui;
}

void Dialog::mousePressEvent(QMouseEvent *event)
{
    if(ui->radioButtonLinea->isChecked()){
        ui->lineEditX1->setText(QString::number(event->pos().x()));
        ui->lineEditY1->setText(QString::number(event->pos().y()));
    }else if(ui->radioButtonCirculo->isChecked()){
        ui->spinBoxCentroX->setValue(event->pos().x());
        ui->spinBoxCentroY->setValue(event->pos().y());
    }else if(ui->radioButtonEspiral1->isChecked()){
        ui->spinBoxCentroXEspiral->setValue(event->pos().x());
        ui->spinBoxCentroYEspiral->setValue(event->pos().y());
    }else if(ui->radioButtonEspiral2->isChecked()){
        ui->spinBoxCentroXEspiral2->setValue(event->pos().x());
        ui->spinBoxCentroYEspiral2->setValue(event->pos().y());
    }
}

void Dialog::mouseReleaseEvent(QMouseEvent *event)
{
   if(ui->radioButtonLinea->isChecked()){
        ui->lineEditX2->setText(QString::number(event->pos().x()));
        ui->lineEditY2->setText(QString::number(event->pos().y()));
   }else if(ui->radioButtonCirculo->isChecked()){
       int val =ui->spinBoxCentroX->value();
             ui->spinBoxRadio->setValue(event->pos().x()-val);
   }else if(ui->radioButtonEspiral1->isChecked()){
            int val = ui->spinBoxCentroXEspiral->value();
            ui->spinBoxRadioEspiral->setValue(event->pos().x()-val);
   }else if(ui->radioButtonEspiral2->isChecked()){
       int val = ui->spinBoxCentroXEspiral2->value();
       ui->doubleSpinBoxThEspiral2->setValue(event->pos().x()-val);
       ui->doubleSpinBoxRadioEspiral2->setValue(event->pos().x()-val);
       ui->doubleSpinBoxAumThEspiral2->setValue(event->pos().x()-val);
       ui->doubleSpinBoxAumRadioEspiral2->setValue(event->pos().x()-val);
   }
}

void Dialog::mouseMoveEvent(QMouseEvent *event)
{
    if(ui->radioButtonLinea->isChecked()){
        ui->lineEditX2->setText(QString::number(event->pos().x()));
        ui->lineEditY2->setText(QString::number(event->pos().y()));
        on_pushButton_clicked();
     }else if(ui->radioButtonCirculo->isChecked()){
              int val =ui->spinBoxCentroX->value();
              ui->spinBoxRadio->setValue(event->pos().x()-val);
              on_pushButton_5_clicked();
    }else if(ui->radioButtonEspiral1->isChecked()){
             int val = ui->spinBoxCentroXEspiral->value();
             ui->spinBoxRadioEspiral->setValue(event->pos().x()-val);
             on_pushButton_7_clicked();
    }else if(ui->radioButtonEspiral2->isChecked()){
            int val = ui->spinBoxCentroXEspiral2->value();
            ui->doubleSpinBoxThEspiral2->setValue(event->pos().x()-val);
            ui->doubleSpinBoxRadioEspiral2->setValue(event->pos().x()-val);
            ui->doubleSpinBoxAumThEspiral2->setValue(event->pos().x()-val);
            ui->doubleSpinBoxAumRadioEspiral2->setValue(event->pos().x()-val);
            on_pushButton_9_clicked();
    }
}


void Dialog::paintEvent(QPaintEvent *evt)
{
    Q_UNUSED(evt);
    Canvas = new QPainter(this);
    Graficos * graficos = new Graficos();
    if(DDA){
      graficos->lineaDDA(x1,y1,x2,y2,Canvas);
      graficos->lineaDDA(x1,y1,x2,y2,Canvas,color);
     }else if(Bes){
     //graficos->lineaDDA(x1,y1,x2,y2,Canvas,color);
     //graficos->bresline(x1,y1,x2,y2,Canvas);
     graficos->bresline(x1,y1,x2,y2,Canvas,color);
    }else if(circuloPitagoras){
       graficos->circuloPitagoras(xc,yc,radio,Canvas);
    }else if(circuloPolar){
        graficos->circuloPolares(xc,yc,radio,Canvas,color);
    }else if(espiral1){
        graficos->espiral(Canvas,color);
    }else if(espiralXcYc){
        graficos->espiral(xc,yc,radio,factor,Canvas,color);
    }else if(espiral2){
        graficos->espiral2(Canvas,color);
    }else if(espital2ThRadio){
        graficos->espiral2(xc,yc,th,rad,aumth,aumrad,Canvas,color);
    }else if(dragon1a){
        dragon1();
    }else if(dragon2a){
        dragon2();
    }
    Canvas->end();
}


void Dialog::on_pushButton_clicked()
{
  DDA = true;
  Bes = false;
  if(DDA == true){
  x1 = ui->lineEditX1->text().toInt();
  y1 = ui->lineEditY1->text().toInt();
  x2 = ui->lineEditX2->text().toInt();
  y2 = ui->lineEditY2->text().toInt();
  linea = true;
  update();
  }
}

//cambiar el color
void Dialog::on_pushButton_2_clicked()
{
  QColor colorSeleccionado = QColorDialog::getColor(Qt::white,this,"Selecciona color");
  if(colorSeleccionado.isValid()){
      color = colorSeleccionado;
  }
}


void Dialog::on_pushButton_3_clicked()
{

    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    x1 = ui->lineEditX1->text().toInt();
    y1 = ui->lineEditY1->text().toInt();
    x2 = ui->lineEditX2->text().toInt();
    y2 = ui->lineEditY2->text().toInt();
    linea = true;
    update();

}

void Dialog::on_pushButton_4_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    circuloPitagoras = true;
    xc = ui->spinBoxCentroX->value();
    yc = ui->spinBoxCentroY->value();
    radio = ui->spinBoxRadio->value();
    repaint();
}

void Dialog::on_pushButton_5_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    circuloPolar = true;
    xc = ui->spinBoxCentroX->value();
    yc = ui->spinBoxCentroY->value();
    radio = ui->spinBoxRadio->value();
    repaint();
}

void Dialog::on_pushButton_6_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
     espiral1 = true;
     repaint();
}

void Dialog::on_pushButton_7_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    espiralXcYc = true;
    xc = ui->spinBoxCentroXEspiral->value();
    yc = ui->spinBoxCentroYEspiral->value();
    radio = ui->spinBoxRadioEspiral->value();
    factor = ui->doubleSpinBoxFactorEspiral->value();
    repaint();
}

void Dialog::on_pushButton_8_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    espiral2 = true;
    repaint();
}

void Dialog::on_pushButton_9_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    espital2ThRadio = true;
    xc = ui->spinBoxCentroXEspiral2->value();
    yc = ui->spinBoxCentroYEspiral2->value();
    th = ui->doubleSpinBoxThEspiral2->value();
    rad = ui->doubleSpinBoxRadioEspiral2->value();
    aumth = ui->doubleSpinBoxAumThEspiral2->value();
    aumrad = ui->doubleSpinBoxAumRadioEspiral2->value();
    repaint();
}

void Dialog::dragon1()
{
    QPainter canvas(this);
    paso = 4096;
    signo = -1;
    ejeX[1] = canvas.window().width()/8;
    ejeX[4097] = 3 * canvas.window().width()/8;
    ejeY[1] = ejeY[4097] = canvas.window().height()/2;

    //dibujar la primer
    canvas.drawLine(ejeX[1],ejeY[1],ejeX[4097],ejeY[4097]);

    for(int i=1;i<=13;i++){
        generarDragon(&canvas,dragon1a,dragon2a);
        paso/=2;
    }
}

void Dialog::dragon2()
{
    QPainter canvas(this);
    paso = 4096;
    signo = -1;
    ejeX[1] = canvas.window().width()/8;
    ejeX[4097] = 3 * canvas.window().width()/8;
    ejeY[1] = ejeY[4097] = canvas.window().height()/8;

    //dibujar la primer
    canvas.setPen(color);
    canvas.drawLine(ejeX[1],ejeY[1],ejeX[4097],ejeY[4097]);

    for(int i=1;i<=13;i++){
        generarDragon(&canvas,dragon1a,dragon2a);
        paso/=2;
    }
}

void Dialog::generarDragon(QPainter *canvas,bool drag,bool drag2)
{
    int j, dx, dy;
    j = paso/2;
    canvas->setPen(color);
    for(int i=1;i<=4096;i+=paso){
        dx = ejeX[paso+i] - ejeX[i];
        dy = ejeY[paso+i] - ejeY[i];
        if(drag){
        signo *=-1;
        }else if(drag2){
        // sin signo
        }
        ejeX[i+j] = ejeX[i] + (dx+(dy * signo))/2;
        ejeY[i+j] = ejeY[i] + (dy-(dx * signo))/2;

        canvas->drawLine(ejeX[i+j],ejeY[i+j],ejeX[i+paso],ejeY[i+paso]);
        canvas->drawLine(ejeX[i],ejeY[i],ejeX[i+j],ejeY[i+j]);
    }
}


void Dialog::on_pushButton_10_clicked()
{
    linea = DDA = Bes =circuloPitagoras =
    circuloPolar= espiral1 = espiralXcYc =
    espiral2 = espital2ThRadio = dragon1a = dragon2a = false;
    dragon1a = ui->radioButtonDragon1->isChecked();
    dragon2a = ui->radioButtonDragon2->isChecked();
    repaint();
}
