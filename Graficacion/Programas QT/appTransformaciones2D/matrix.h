#ifndef MATRIX_H
#define MATRIX_H


class Matrix
{
    int col, ren;
    float **Mat;

    public:

       Matrix(int nr=4,int nc=4, float valor=0);//constructor con arg. por defecto

       Matrix(float nr,float nc, float **m);

       Matrix(Matrix &);
       ~Matrix();
       void SET(int R, int C, float val){Mat[R][C]=val;}
       float GET(int R, int C){return Mat[R][C];}
       int numCol(){return col;}
       int numRen(){return ren;}
       void Inicializa(int, int);
       Matrix &operator *=(Matrix &mat2);

       Matrix &operator*(const Matrix &m1);

       Matrix operator*(float);//Multiplicar por un escalar

       Matrix &operator=(Matrix &m);

       Matrix & asignar(Matrix);

       Matrix & Identidad();

       //Transformaciones 2D
       // FigT             Fig   IDent.  Tx  Ty
       Matrix &traslacion(Matrix, Matrix,int,int);
       Matrix &escalacion(Matrix, Matrix,float,float);
       Matrix &escalacionPuntoFijo(Matrix f, Matrix id, float sx,float sy,int PFx, int PFy);
       Matrix &rotacion(Matrix f, Matrix id, int angulo);
       Matrix &rotacionPuntoFijo(Matrix, Matrix, float, float, float);
};

#endif // MATRIX_H
