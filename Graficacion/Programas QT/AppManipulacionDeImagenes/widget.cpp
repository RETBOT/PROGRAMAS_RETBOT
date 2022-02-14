#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
}

Widget::~Widget()
{
    delete ui;
}

QImage Widget::modificarImagenRGB(const QImage &in)
{
    //Asignamos el tamaño de la imagen de entrada (in) y su formato
    QImage out(in.size(),in.format());
    //Recorremos el arreglo bidimensional de la imagen (sus pixeles que lo componen)
    for(int linea =0; linea < in.height(); linea++){
        const QRgb *inPixel = reinterpret_cast<const QRgb*>(in.scanLine(linea));
        QRgb *outPixel = reinterpret_cast<QRgb*>(out.scanLine(linea));
        // Recorremos la imagen por columna
        for(int pos = 0; pos < in.width();pos++){
            int red = qRed(inPixel[pos]);
            int green = qGreen(inPixel[pos]);
            int blue = qBlue(inPixel[pos]);
            int alpha = qAlpha(inPixel[pos]);


          if(ui->radioButAnd->isChecked()){
             outPixel[pos] = qRgba(red & 0x0000cc, green & 0x0000cc,blue & 0x0000cc,alpha); // and
          }
          if(ui->radioButOr->isChecked()){
             outPixel[pos] = qRgba(red | 0x0000cc, green | 0x0000cc,blue | 0x0000cc,alpha); // or
           }
          if(ui->radioButXor->isChecked()){
             outPixel[pos] = qRgba(red ^ 0x0000cc, green ^ 0x0000cc,blue ^ 0x0000cc,alpha); // Xor
           }
          if(ui->radioButRojos->isChecked()){
             outPixel[pos] = qRgba(red & 0x0000cc,(green & 0x00cc00)<<1,blue & 0xcc0000,alpha);
          }
          if(ui->radioButVerdes->isChecked()){
             outPixel[pos] = qRgba(0,green<<3,0,alpha);
          }
          if(ui->radioButRojointenso->isChecked()){
             outPixel[pos] = qRgba(green<<1,0,0,alpha);
          }
          if(ui->radioButAzulintenso->isChecked()){
             outPixel[pos] = qRgba(0,0,green<<1,alpha);
          }
          if(ui->radioButRyV->isChecked()){
             outPixel[pos] = qRgba(red ^ 0x0000cc, green ^ 0x00cc00,blue ^ 0xcc0000,alpha);
          }
          if(ui->radioButVerdeIntenso->isChecked()){
            outPixel[pos] = qRgba(blue,red,green,alpha);
          }
          if(ui->radioButHudson->isChecked()){
            outPixel[pos] = qRgba(green,blue,red,alpha);
          }
          if(ui->radioButGris->isChecked()){
            outPixel[pos] = qRgba(blue,blue,blue,alpha);
          }
          if(ui->radioButWalden->isChecked()){
            outPixel[pos] = qRgba(red & 0x0000cc, green ^ 0x0000cc,blue | 0x0000cc,alpha);
          }
          if(ui->radioButLux->isChecked()){
            outPixel[pos] = qRgba(green<<1,red>>1,blue<<2,alpha);
          }
          if(ui->radioButAmaro->isChecked()){
            outPixel[pos] = qRgba(green<<2,red | 0x0000cc,blue ^ 0xcc0000,alpha);
          }
          if(ui->radioButMiFiltro->isChecked()){
             if(ui->radioButFiltrar->isChecked()){
                outPixel[pos] = qRgba(red & ui->dialR->value(),
                                green & ui->dialG->value(),
                                blue & ui->dialB->value(),alpha);
             }else if(ui->radioButNoFiltrar->isChecked()){
                      outPixel[pos] = qRgba(red | ui->dialR->value(),
                                    green | ui->dialG->value(),
                                    blue | ui->dialB->value(),alpha);
             } else if(ui->radioButSobrePoner->isChecked()){
                 outPixel[pos] = qRgba(red ^ ui->dialR->value(),
                                    green ^ ui->dialG->value(),
                                    blue ^ ui->dialB->value(),alpha);
             }
          }
        }
    }
    return out;
}


void Widget::on_pushButAbrirImagen_clicked()
{
    QFileDialog dialogo(this);
    dialogo.setNameFilter("Imagenes(*.png *.bmp *.jpg *.jpeg)");
    dialogo.setViewMode(QFileDialog::Detail);
    QString nomarch = QFileDialog::getOpenFileName(this, "Abrir Imagen","C:\\Users\\admin\\Desktop\\Ejercicios Qt\\AppManipulacionDeImagenes",
                                                  "Archivos de Imagenes(*.png *.bmp *.jpg *.jpeg)");
    if(!nomarch.isEmpty()){
        QImage imagen(nomarch);
        ui->imagen->setPixmap(QPixmap::fromImage(imagen));
        ui->imagen->setScaledContents(true);
        nomArch = nomarch;
    }
}

void Widget::on_pushButModificar_clicked()
{
    QImage imagen(nomArch);
    imagen = modificarImagenRGB(imagen);
    ui->imagenModificada->setPixmap(QPixmap::fromImage(imagen));
    ui->imagenModificada->setScaledContents(true);
}


