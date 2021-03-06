#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include "archivo.h"
#include <iostream>
#include <string>
using namespace std;

#include <string.h>
#include <stdlib.h>
#include <Windows.h>

#include <stdio.h>
#include <cstring>
#include <QInputDialog>

#define leerCar(i) cadena[i++]
#define retrocederCar i--   // EQUIVALE AL  * EN EL DIAG. DE TRANSICIONES
#define NUMPALRES 4
#define MAXTOKEN 100
#define MAX 50

QT_BEGIN_NAMESPACE
namespace Ui { class Dialog; }
QT_END_NAMESPACE

class Dialog : public QDialog
{
    Q_OBJECT
    int i=0, inicioToken=0, estadoInicial=0, estadoActual=0,k=0;
    char cadena[255]; // cadena de entrada
    //char *PalRes[]= {"char", "float","int","puts"}; //printf
    char PalRes[5][10]= {"char", "float","int","puts"}; //printf
    char non[6]="13579", par[6]="24680";
    char sLexema[127];
    char sLinea[127];
    char asTokens [MAXTOKEN][100];
    int cima = -1;
    char pilac[MAX][10];

    char token[22][8] = {"x", ";", ",", "*", "Id", "[", "]", "Num", "char", "int", "float",
        "puts", "(", ")", "Cte.Lit", "{", "}", "=","+","-","/", "Real"};
    char varsint[15][3]={"x", "D", "L", "L'", "I", "I'", "A", "A'", "K",
        "T", "F", "E", "P"};                                                   // e -> cadena vacia
    int tablaM[100][8]= {{1, 5, 1, 5, 999, -1, 999, 999}, //[ D->I';
                         {1, 5, 1, 5, 999, -1, 999, 999}, //; D->I';
                         {1, 1, 1, 5, 999, -1, 999, 999}, //id D->PL';
                        {1, 7, 1, 5, 3, -1, 999, 999}, //num D->I'L';
                        {1, 8, 1, 9, 2, -1, 999, 999}, //char D->TL;
                        {1, 9, 1, 9, 2, -1, 999, 999}, //int D->TL;
                        {1, 10, 1, 9, 2, -1, 999, 999}, //float D->TL;
           /* 5 */      {2, 3, 2, 4, 3, 999, 999, 999}, // * L->IL'
                        {2, 4, 2, 4, 3, 999, 999, 999}, //Id L->IL'
                        {3, 1, 3, 5, 999, 999, 999, 999}, //; L'->I'
                        {3, 1, 3, 999, 999, 999, 999, 999},//; L'->e
                        {3, 2, 3, -2, 4, 3, 999, 999}, //, L'->,IL'
          /* 10 */      {3, 3, 3, -3, 8, 3, 999, 999}, //* L'->*KL'
                        {3, 18, 3, 12, 3, 999, 999, 999}, //+ L'->PL'
                        {3, 19, 3, 12, 3, 999, 999, 999}, //- L'->PL'
                        {3, 20, 3, 12, 3, 999, 999, 999}, // / L'->PL'
                        {3, 14, 3, -14, 5, 999, 999, 999},// cte. Lit. L'->cte Lit. I'
                        {4, 3, 4, -3, -4, 5, 999, 999}, // * I->*Id I'
                        {4, 4, 4, -4, 5, 999, 999, 999},// Id I->Id I'
                        {5, 1, 5, 999, 999, 999, 999, 999},// ; I'->e
         /* 15 */       {5, 2, 5, 999, 999, 999, 999, 999},// , I'->e
                        {5, 5, 5, 6, 999, 999, 999, 999}, // [ I' -> A
                        //{5, 7, 5, -7, 999, 999, 999, 999}, //Num I' -> Num
                        //{5, 12, 5, 7, 8, 11, 999, 999}, //( I' -> Num
                        {5, 14, 5, -14, 999, 999, 999, 999}, //cte lit I'->cte lit
         /* -> */       {5, 17, 5, -17, 8, 999, 999, 999}, //= I'->=K
                        {6, 5, 6, -5, 8, 11, 999, 999}, //[ A->[ KE
         /* 20 */       {7, 1, 7, 999, 999, 999, 999, 999},//; A'->e
                        {7, 2, 7, 999, 999, 999, 999, 999},//, A'->e
                        {7, 5, 7, -5, 8, -6, 7, 999}, //[ A' -> [K]A'
                        {7, 12, 7, -12, 999, 999, 999, 999}, //( A' -> (
                        {8, 4, 8, -4, 999, 999, 999, 999}, //Id K -> Id
                        {8, 5, 8, -5, 8, 11, 999, 999}, //[ K -> [ KE
                        {8, 7, 8, -7, 999, 999, 999, 999}, //Num K -> Num
                        {8, 21, 8, -21, 999, 999, 999, 999}, //Real K -> Num
                        {8, 12, 8, -12, 8, 11, 999, 999}, //( K -> ( KE
                        {8, 15, 8, -15, 8, 10, 999, 999}, //{ K -> { KF
                        {9, 8, 9, -8, 999, 999, 999, 999}, //char T->Char
                        {9, 9, 9, -9, 999, 999, 999, 999}, //int T->int
                        {9, 10, 9, -10, 999, 999, 999, 999},//float T->float
                        /*segunda gramatica */
            /* 25 */    {10, 11, 10, -11, 11, -1, 999, 999},//puts F-> puts E;
                        {10, 16, 10, -16, 999, 999, 999, 999},//} F-> };
                        {11, 6, 11, -6, 1, 999, 999, 999},//]E -> ]D
                        {11, 12, 11, -12, 12, -13, 999, 999},//( E -> (P)
                        {11, 13, 11, -13, 999, 999, 999, 999},//)E -> )
                        {12, 14, 12, -14, 999, 999, 999, 999},//cte lit P->cte lit
                        {12, 18, 12, -18, 8, 999, 999, 999},//+ P -> + k
                        {12, 19, 12, -19, 8, 999, 999, 999},//- P -> - k
                        {12, 20, 12, -20, 8, 999, 999, 999},// / P ->/ k
                       };

public:
    Dialog(QWidget *parent = nullptr);
    ~Dialog();
    void vanalisislexico();  //   SCANNER = ANALIZADOR LEXICO
    void vanalisis_sintactico();

private slots:
    void on_pushButConvertir_clicked(); // convertir a lexico
    void on_pushButAbrir_clicked(); // arbir documento
    void on_pushButBorrar_clicked(); // borrar texto
    void on_pushButGuardar_clicked(); // guardar texto en documento
    void inicializaEstados();
    void fallo();
    bool estadoDeAceptacion();
    int esId();
    void recuperaerror();
    void insertapila(string elem);
    int estoken(char x[]);
    void eliminapila();
    int buscaTabla(char a[], char x[]);

private:
    Ui::Dialog *ui;
};
#endif // DIALOG_H
