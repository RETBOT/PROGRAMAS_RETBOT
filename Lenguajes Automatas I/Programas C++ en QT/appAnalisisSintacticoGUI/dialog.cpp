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

void Dialog::vanalisislexico()
{
    char caracter; // caracteres de las cadenas
    inicializaEstados(); // inicializan los estados
    //VARIABLES GLOBALES
    i = inicioToken = k =0;
    bool band = false;
    while((i < (int)strlen(cadena) || estadoDeAceptacion())&& !band)
    {
        switch(estadoActual)
        {
        case 0: caracter = leerCar(i); // lee el caracter
            if (strchr(non,caracter))
                 estadoActual = 1;
            else
                if(strchr(par,caracter))
                    estadoActual = 2;
                else
                    if(caracter == '.')
                        estadoActual = 37;
                else
                    fallo();
            break;

        case 1:  caracter = leerCar(i); // lee el caracter
            if(strchr(non,caracter))
                estadoActual=1;
            else
                if(strchr(par,caracter))
                    estadoActual = 2;
            else if(caracter== '.')
                    estadoActual = 37;
                else
                    fallo();
            break;

        case 2:  caracter = leerCar(i); // lee el caracter
            if(strchr(non,caracter))
                estadoActual=1;
            else
                if (strchr(par,caracter))
                    estadoActual=2;
                else if(caracter== '.')
                        estadoActual = 37;
                else
                    estadoActual=3;
            break;

        case 3: retrocederCar;
            strcpy(asTokens[k++],"Num");
            inicioToken=i;
            inicializaEstados();
            break;

        case 4:  caracter = leerCar(i); // lee el caracter
            switch(caracter)
            {
                case '+': estadoActual=5; break;
                case '-': estadoActual=6; break;
                case '*': estadoActual=7; break;
                case '/': estadoActual=8; break;
                default: fallo();
            }
            break;

        case 5: strcpy(asTokens[k++],"+");
            inicioToken=i;
            inicializaEstados();
            break;

        case 6: strcpy(asTokens[k++],"-");
            inicioToken=i;
            inicializaEstados();
            break;

        case 7: strcpy(asTokens[k++],"*");
            inicioToken=i;
            inicializaEstados();
            break;

        case 8: strcpy(asTokens[k++],"/");
            inicioToken=i;
            inicializaEstados();
            break;


        case 9:  caracter = leerCar(i); // lee el caracter
            if (strchr(par,caracter))
                estadoActual=10;
            else
                if(strchr(non,caracter))
                    estadoActual=11;
                else if(caracter== '.')
                        estadoActual = 37;
                else
                    fallo();
            break;

        case 10:  caracter = leerCar(i); // lee el caracter
            if (strchr(par,caracter))
                estadoActual=10;
            else
                if(strchr(non,caracter))
                    estadoActual=11;
                else if(caracter== '.')
                        estadoActual = 37;
                else
                    fallo();
            break;

        case 11 :  caracter = leerCar(i); // lee el caracter
            if (strchr(non,caracter))
                estadoActual=11;
            else
                if(strchr(par,caracter))
                    estadoActual=10;
                else if(caracter== '.')
                        estadoActual = 37;
                else
                    estadoActual=12;
            break;

            // NON - PAR
        case 12: retrocederCar;
            strcpy(asTokens[k++],"Num");
            inicioToken=i;
            inicializaEstados();
            break;

        case 13:  caracter = leerCar(i); // lee el caracter
            if ((isalpha(caracter)|| caracter=='_'))
                estadoActual=14;
            else
                fallo();
            break;

        case 14:  caracter = leerCar(i); // lee el caracter
            if ((isalpha(caracter)|| caracter=='_') || isdigit(caracter))
                estadoActual=14;
            else
                estadoActual= 15;
            break;

        case 15: retrocederCar;
            if(esId())
                strcpy(asTokens[k++],"Id");
            else
                strcpy(asTokens[k++],sLexema);

            inicioToken=i;
            inicializaEstados();
            break;


        case 16:  caracter = leerCar(i); // lee el caracter
            if(caracter==';')
                estadoActual=17;
            else
                fallo();
            break;

            /* Al encontrar el caracter ';' , que indica fin de linea,
             Se copia el caracter '$' al fin del arreglo astokens
             */
        case 17: strcpy(asTokens[k++],";");
            strcpy(asTokens[k++],"$");
            band = true;
            inicioToken=i;
            inicializaEstados();
            break;

        case 18:  caracter = leerCar(i); // lee el caracter
            if(caracter=='[')
                estadoActual=19;
            else
                fallo();
            break;

        case 19: strcpy(asTokens[k++],"[");
            inicioToken=i;
            inicializaEstados();
            break;

        case 20:  caracter = leerCar(i); // lee el caracter
            if(caracter==']')
                estadoActual=21;
            else
                fallo();
            break;

        case 21: strcpy(asTokens[k++],"]");
            inicioToken = i;
            inicializaEstados();
            break;

        case 22: caracter = leerCar(i); // lee el caracter
            if(caracter == ',')
                estadoActual=23;
            else
                fallo();
            break;

        case 23: strcpy(asTokens[k++],",");
            inicioToken=i;
            inicializaEstados();
            break;

        case 24: caracter = leerCar(i); // lee el caracter
            if (('"' == caracter) && caracter)
                estadoActual=25;
            else
                fallo();
            break;

        case 25:  caracter = leerCar(i); // lee el caracter
            if (('"' != caracter) && caracter)
                estadoActual=25;
            else
                if(caracter)
                    estadoActual=26;
            break;

        case 26: strcpy(asTokens[k++],"Cte.Lit");
            inicioToken=i;
            inicializaEstados();
            break;

        case 27:  caracter = leerCar(i); // lee el caracter
            if(caracter == '(')
                estadoActual=28;
            else
                fallo();
            break;

        case 28: strcpy(asTokens[k++],"(");
            inicioToken = i;
            inicializaEstados();
            break;

        case 29: caracter = leerCar(i); // lee el caracter
            if(caracter == ')')
                estadoActual=30;
            else
                fallo();
            break;

        case 30: strcpy(asTokens[k++], ")");
            inicioToken=i;
            inicializaEstados();
            break;

        case 31: caracter = leerCar(i); // lee el caracter
            if(caracter == '{')
                estadoActual = 32;
            else
                fallo();
            break;

        case 32: strcpy(asTokens[k++], "{");
            inicioToken = i;
            inicializaEstados();
            break;

        case 33: caracter = leerCar(i); // lee el caracter
            if(caracter == '}')
                estadoActual = 34;
            else
                fallo();
            break;

        case 34: strcpy(asTokens[k++], "}");
            inicioToken = i;
            inicializaEstados();
            break;

        case 35: caracter = leerCar(i); // lee el caracter
            if(caracter == '=')
                estadoActual = 36;
            else
                fallo();
            break;

        case 36: strcpy(asTokens[k++], "=");
            inicioToken = i;
            inicializaEstados();
            break;

    case 37:  caracter = leerCar(i); // lee el caracter
        if (strchr(non,caracter))
            estadoActual = 38;
        else
            if(strchr(par,caracter))
                estadoActual = 39;
            else
                fallo();
        break;
    case 38:  caracter = leerCar(i); // lee el caracter
        if(strchr(non,caracter))
            estadoActual=38;
        else
            if(strchr(par,caracter))
                estadoActual = 39;
            else
                estadoActual=40;
        break;

    case 39:  caracter = leerCar(i); // lee el caracter
        if(strchr(non,caracter))
            estadoActual=38;
        else
            if (strchr(par,caracter))
                estadoActual=39;
            else
                estadoActual=40;
        break;
    case 40: retrocederCar;
        strcpy(asTokens[k++],"Real");
        inicioToken=i;
        inicializaEstados();
        break;
        }// fin switch
    }// fin wile
}

void Dialog::vanalisis_sintactico()
{
    int ip=0, i, j;
    int renglon, iast;
    char x[10], a[10];

    insertapila("$");

    if(strcmp(asTokens[ip], "puts") == 0)
        insertapila("F");
    else
        insertapila("D");

    ui->plainTextEditorResultado->textCursor().insertText("\n\nSalida del Analizador Sintactico (asTokens): \n");
    ui->plainTextEditorResultado->textCursor().insertText("Arreglo de Tokens: \n");

    for(i=0; strcmp(asTokens[i], "$") != 0; i++){
        ui->plainTextEditorResultado->textCursor().insertText(asTokens[i]);
        ui->plainTextEditorResultado->textCursor().insertText(" ");
    }

    ui->plainTextEditorResultado->textCursor().insertText("\n\n Producciones: \n");

    do
    {
        strcpy(x, pilac[cima]);
        strcpy(a, asTokens[ip]);

        if(estoken(x) || (strcmp(x, "$") == 0))
        {
            if(strcmp(x, a) == 0)
            {
                eliminapila();
                ip++;
            }
            else
            {
                if(strcmp(asTokens[ip], "puts") == 0)
                    insertapila("F");
                else //Sino
                    insertapila("D");

                strcpy(x, pilac[cima]);

            }
        }
        else
        {
            renglon = buscaTabla(a, x);

            if(renglon != 999)
            {
                eliminapila();
                iast = 0;
                ui->plainTextEditorResultado->textCursor().insertText(varsint[tablaM[renglon][0]]);
                ui->plainTextEditorResultado->textCursor().insertText(" -> ");
//                printf("%-3s -> ",varsint[tablaM[renglon][0]]);

                for(j= 3; iast!=999; j++)
                {
                    iast = tablaM[renglon][j];  //999
                    if(iast < 0)
                    {
                        iast *= -1;
                        ui->plainTextEditorResultado->textCursor().insertText(token[iast]);
                        ui->plainTextEditorResultado->textCursor().insertText(" ");
                        //printf("%s ",token[iast]);

                    }
                    else
                    {
                        if(iast != 999)
                            ui->plainTextEditorResultado->textCursor().insertText(varsint[iast]);
                            //printf("%s", varsint[iast]);
                    }
                }

                ui->plainTextEditorResultado->textCursor().insertText("\n");

                for(i=j-2; i>2; i--)
                {
                    iast = tablaM[renglon][i];
                    if(iast < 0)
                    {
                        iast *= -1;
                        insertapila(token[iast]);
                    }
                    else
                        insertapila(varsint[iast]);
                }
            }
            else
            {
                ui->plainTextEditorResultado->textCursor().insertText("\n\n Error de Sintaxis");
                return;
            }
        }
     }while(strcmp(x, "$") != 0);
    ui->plainTextEditorResultado->textCursor().insertText("\n");
}

void Dialog::on_pushButConvertir_clicked()
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
        strcpy(cadena,editor[i]);
        vanalisislexico();

        ui->plainTextEditorResultado->textCursor().insertText("Anlisis lexico\n");
        for(int i=0;i<k-1;i++){
            //ui->plainTextEditorResultado->textCursor().insertText(asTokens[i]); // se leee y se inserta en el resultado
            //ui->plainTextEditorResultado->textCursor().insertText(" ");
            ui->plainTextEditorResultado->appendPlainText(asTokens[i]);
            ui->plainTextEditorResultado->appendPlainText(" ");
        }
        // se pone un separador
        vanalisis_sintactico();
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

void Dialog::inicializaEstados()
{
     estadoInicial = estadoActual = 0;
}

void Dialog::fallo()
{
    switch (estadoInicial)
    {
        case 0 : estadoInicial=4;
            i=inicioToken;

            break;

        case 4 : estadoInicial=9;
            i=inicioToken;

            break;

        case 9 : estadoInicial=13;
            i=inicioToken;

            break;

        case 13 : estadoInicial=16;
            i = inicioToken;

            break;

        case 16 : estadoInicial=18;
            i = inicioToken;

            break;

        case 18 : estadoInicial=20;
            i=inicioToken;

            break;

        case 20 : estadoInicial=22;
            i = inicioToken;

            break;

        case 22 : estadoInicial=24;
            i = inicioToken;

            break;

        case 24 : estadoInicial=27;
            i = inicioToken;

            break;

        case 27 : estadoInicial=29;
            i = inicioToken;

            break;

        case 29: estadoInicial = 31;
            i = inicioToken;

            break;

        case 31: estadoInicial = 33;
            i = inicioToken;

            break;

        case 33: estadoInicial = 35;
            i = inicioToken;

            break;

        case 35: recuperaerror();
    }

    estadoActual=estadoInicial;
}

bool Dialog::estadoDeAceptacion()
{
    switch (estadoActual) // estados de aceptacion validos
    {
    case 8: case 5: case 7: case 6: case 3:
    case 12: case 15: case 17: case 19: case 21:
    case 23 : case 26: case 28: case 30: case 32:
    case 34: case 36: case 40:
        return true;
        default : return false;
    }// fin switch
}

int Dialog::esId()
{
    int n,m,found = false;
    for (m=inicioToken, n=0; m<i ; m++, n++)
        sLexema[n] = cadena[m];
    sLexema[n] = '\0';
    for (m=0 ; m < NUMPALRES && !found ;)
        if (strcmp(PalRes[m], sLexema)==0)
            found = true;
        else
            m++;
    return (found ? 0 : 1);
}

void Dialog::recuperaerror()
{
    inicioToken = i;
    inicializaEstados();
}

void Dialog::insertapila(string elem)
{
    if(cima == -1){
        cima = 0;
        strcpy(pilac[cima],elem.c_str());
    }
    else{
        if(cima == MAX - 1)
            puts("Pila LLena");
        else{
            cima++;
            strcpy(pilac[cima],elem.c_str());
        }
    }
}

int Dialog::estoken(char x[])
{

    int i;

    for(i=0; i<23; i++)
    {
        if(strcmp(x, token[i]) == 0)
            return 1;
    }

    return 0;
}

void Dialog::eliminapila()
{
    if(cima == -1)
        puts("Pila Vacia");
    else{
        strcpy(pilac[cima],"");
        cima--;
    }
}

int Dialog::buscaTabla(char a[], char x[])
{
        int indx=0, inda=0, i;

        for(i=0; i<23; i++)
            if(strcmp(a, token[i]) == 0)
                inda = i;//9 int

        for(i=0; i<15; i++)
            if(strcmp(x, varsint[i]) == 0)
                indx=i; //1 D

        for(i=0; i<44; i++)
        {
            if(indx == tablaM[i][0])
                if(inda == tablaM[i][1])
                    return i;
        }

        return 999;
}

