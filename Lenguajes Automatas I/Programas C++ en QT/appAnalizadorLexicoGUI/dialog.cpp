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


void Dialog::on_pushButConvertir_clicked() // convertir a lexico
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

    for(int i = 0; i<tam; i++){ // se empieza a leer el arreglo bidimencional renglon por renglon
        Lexico l; // se crea el objeto lexico
        l.setCadena(editor[i]); // se manda el renglon, para leerlo
        ui->plainTextEditorResultado->textCursor().insertText(l.scanner()); // se leee y se inserta en el resultado
        // se pone un separador
        ui->plainTextEditorResultado->textCursor().insertText("\n----------------------------------------------------------------------------------------------------------\n");
    }
}

void Dialog::on_pushButAbrir_clicked()
{
    on_pushButBorrar_clicked(); // se borra todo lo de los editores
    QString nomArch = QInputDialog::getText(this,"Archivo","Nombre del archivo:"); // se pide el nombre del archivo
    string nomArchivo, path;
    nomArchivo = nomArch.toStdString(); // se convierte a string
    nomArchivo += ".txt"; // se concatena el .txt

    path = "C:\\Users\\admin.ROBERTO\\Desk\\"; // lugar donde el archivo se guardara
    path += nomArchivo; // se concatena al final el nombre del archivo
    char narch[100]; // se crea un arreglo de char
    strncpy(narch, path.c_str(), sizeof(narch)); // se copia lo del path al arreglo de char

    Archivo archivo; // se crea un objeto archivo
    char cadenas[22][255]; // un arreglo de char para almacenar, lo del archivo
    int tam; // renglones del archivo
    archivo.abrir(narch,cadenas,tam); // se abre el archivo

    for(int i=0;i<tam;i++) // ciclo para insertar el archivo en el editor
        ui->plainTextEditor->textCursor().insertText(cadenas[i]);
}

void Dialog::on_pushButBorrar_clicked()
{ // borrar texto de los editores
   ui->plainTextEditor->clear();
   ui->plainTextEditorResultado->clear();
}


void Dialog::on_pushButGuardar_clicked()
{
    char cadenas[255]; // arreglo de char, para almacenar el texto del editor
    QString texto = ui->plainTextEditor->toPlainText(); // se copia lo del editor
    string res = texto.toStdString(); // se convierte a string

    strncpy(cadenas,res.c_str(),sizeof(cadenas)); // se almacena en el arreglo de char

    QString nomArch = QInputDialog::getText(this,"Archivo","Nombre del archivo:"); // se pide el nombre del archivo
    string nomArchivo, path;
    nomArchivo = nomArch.toStdString(); // se convierte a string
    nomArchivo += ".txt"; // se concatena el .txt

    path = "C:\\Users\\admin.ROBERTO\\Desk\\"; // lugar donde se guardara el archivo
    path += nomArchivo; // se le concatena al final el nombre del archivo
    char narch[100]; // arreglo de char para copiar el path
    strncpy(narch, path.c_str(), sizeof(narch)); // se copia el path en el arreglo narch


    Archivo archivo; // objeto archivo
    archivo.guardar(narch,cadenas);// se guarda el texto
}

