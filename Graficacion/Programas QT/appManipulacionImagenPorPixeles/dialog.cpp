#include "dialog.h"
#include "ui_dialog.h"

Dialog::Dialog(QWidget *parent)
    : QDialog(parent)
    , ui(new Ui::Dialog)
{
    ui->setupUi(this);
}

Dialog::~Dialog()
{
    delete ui;
}

QImage Dialog::modificarImagenRGB(const QImage &in)
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

            //outPixel[pos] = qRgba(red,green,blue,alpha);
            //outPixel[pos] = qRgba(blue,red,green,alpha);
            //outPixel[pos] = qRgba(green,blue,red,alpha);
           //outPixel[pos] = qRgba(red,0,0,alpha);
           //outPixel[pos] = qRgba(0,green,0,alpha);
           // outPixel[pos] = qRgba(blue,blue,blue,alpha);

            // aplicando corrimiento de bits
            //outPixel[pos] = qRgba(0,green<<3,0,alpha);
            //outPixel[pos] = qRgba(green<<1,0,0,alpha);

            // aplicando operadores a nivel de bit
            //outPixel[pos] = qRgba(red & 0x0000cc,green & 0x00cc00,blue & 0xcc0000,alpha);
            // outPixel[pos] = qRgba(red | 0x0000cc,green | 0x00cc00,blue | 0xcc0000,alpha);
            // outPixel[pos] = qRgba(0,green | 0x00cc00,blue | 0xcc0000,alpha); 
            // outPixel[pos] = qRgba(red & 0x0000cc,(green & 0x00cc00)<<1,blue & 0xcc0000,alpha);
            // outPixel[pos] = qRgba(red ^ 0x0000cc, green ^ 0x00cc00,blue ^ 0xcc0000,alpha);
            outPixel[pos] = qRgba(red ^ 0x0000cc, green ^ 0x0000cc,blue ^ 0x0000cc,alpha);
        }
    }
    return out;
}


void Dialog::on_pushButton_clicked()
{
    QImage imagen(":/imgs/pez.jpg");
    imagen = modificarImagenRGB(imagen);
    ui->label_2->setPixmap(QPixmap::fromImage(imagen));
    ui->label_2->setScaledContents(true);

    imagen = modificarImagenRGB(imagen);
    ui->label_3->setPixmap(QPixmap::fromImage(imagen));
    ui->label_3->setScaledContents(true);

    imagen = modificarImagenRGB(imagen);
    ui->label_4->setPixmap(QPixmap::fromImage(imagen));
    ui->label_4->setScaledContents(true);

}
