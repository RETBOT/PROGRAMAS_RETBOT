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


void Dialog::on_pushButConvertir_clicked()
{

}


void Dialog::on_pushButBorrar_clicked()
{
    ui->plainTextEditorResultado->clear(); // se limpia el texto de resultado
    char cadenas[255]; // se crea un arreglo para las cadenas
    char editor[25][255]; // uno para leer el editor
    QString texto = ui->plainTextEditor->toPlainText(); // se obtiene el texto del editor (esta se extrae en una sola cadena, se tiene que leer caracter por caracter para convertirlo en un arreglo bidimencional)
    string res = texto.toStdString(); // se convierte de QString a string
    strncpy(cadenas,res.c_str(),sizeof(cadenas)); // se copia al arreglo de cadenas, lo que se encuentra en el editor
    int tam = 0; // el tamaño del renglon
    for(int i = 0,j=0,k=0; i<res.length();i++){ // se crea un ciclo para leer caracter por caracter para hacerlo arreglo bidimencional
        char car = cadenas[i]; // se obtienen los caracteres
        if(car != '\n'){ // si no es un salto de linea se agrega al editor
            editor[j][k++] = cadenas[i];
        }else{ // si es un salto de linea, se escribe en la siguiente linea
            j++; // se salta a la siguiente posicion
            k=0; // inicio de la siguiente linea
        }
         tam = j; // el tamaño del arreglo
    }
    // si el ultimo caracter no es un salto de line no cuenta el tamaño total del arreglo
    if(cadenas[res.length()] != '\n' && cadenas[res.length()-1] != '\n' )
        tam++;

   lexico l; // se crea el objeto lexico
    for(int i = 0; i<tam; i++){ // se empieza a leer el arreglo bidimencional renglon por renglon
        l.setCadena(editor[i]); // se manda el renglon, para leerlo
        l.vanalisislexico();
    }
    ui->plainTextEditorResultado->textCursor().insertText(l.getTokens()); // se leee y se inserta en el resultado
    // se pone un separador
    ui->plainTextEditorResultado->textCursor().insertText("\n----------------------------------------------------------------------------------------------------------\n");
}

