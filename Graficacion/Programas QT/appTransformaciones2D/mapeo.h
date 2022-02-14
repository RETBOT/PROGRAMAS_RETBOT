#ifndef MAPEO_H
#define MAPEO_H

class Mapeo
{
    // En el mundo real, se pueden utilizar las unidades de medida que se requieran
    float XWmin,YWmin,XWmax,YWmax; // define el area de la ventana (Mundo real)
    int XPVmin,YPVmin,XPVmax,YPVmax; // define el area de dibujo en el dispositivo

public:
   // Mapeo();

  // representa el area del mundo real
  void ventana(float wx1,float wy1,float wx2,float wy2);
  // represetna el area de despliegue
  void puerto(int pvx1, int pvy1, int pvx2, int pvy2);
  // X, Y Posicion del mundo real, XT, YT la posicion del dispositivo de despliegue
  void mapear(int X, int Y, int &XT, int&YT,int L, int M); //L y M representan el origen
};

#endif // MAPEO_H
