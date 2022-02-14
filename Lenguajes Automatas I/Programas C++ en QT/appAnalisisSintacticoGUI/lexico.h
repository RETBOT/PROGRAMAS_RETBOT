#ifndef LEXICO_H
#define LEXICO_H


class Lexico
{
//VARIABLES GLOBALES

public:
    Lexico();
    //PROTOTIPOS
    void scanner();  //   SCANNER = ANALIZADOR LEXICO
    void setCadena(char cadena[255]); // se pone la cadena
    char *getTokens();


protected:
    void inicializaEstados();
    void fallo();
    bool esLetra(char c);
    bool esDigito(char c);
    bool esDelimitador(char c);
    bool estadoDeAceptacion();
    bool OpRL(char c);
    bool OpAritmetico(char c);
    int esId();
    void recuperaerror();

};

#endif // LEXICO_H
