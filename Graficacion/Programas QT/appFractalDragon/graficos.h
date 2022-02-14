#ifndef GRAFICOS_H
#define GRAFICOS_H
#include <QColor>
#include <QPainter>

class Graficos
{
public:
    Graficos();

    // En lugar de usar el floor o ceil
    int round(float n){
        return int(n+0.5);
    }

    void lineaDDA(int x1,int y1, int x2, int y2,QPainter *canvas);
    void lineaDDA(int x1,int y1, int x2, int y2,QPainter *canvas,QColor color);
    void bresline(int x1,int y1, int x2, int y2,QPainter *canvas);
    void bresline(int x1,int y1, int x2, int y2,QPainter *canvas,QColor color);
    void circuloPitagoras(int xc, int yc, int radio,QPainter *canvas);
    void circuloPolares(int xc, int yc, int radio, QPainter *canvas);
    void espiral(QPainter *canvas, QColor color);
    void espiral(int xc, int yc, int radio, double factor,QPainter *canvas, QColor color);
    void espiral2(QPainter *canvas, QColor color);
    void espiral2(int xc, int yc,double th,float radio,double aumTh,double aumRad,QPainter *canvas, QColor color);

};

#endif // GRAFICOS_H
