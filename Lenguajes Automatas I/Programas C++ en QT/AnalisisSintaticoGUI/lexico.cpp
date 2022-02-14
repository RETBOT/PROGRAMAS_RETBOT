#include "lexico.h"

lexico::lexico()
{

}

void lexico::vanalisislexico()
{
    char caracter; // caracteres de las cadenas
    //VARIABLES GLOBALES
    indice = inicioToken = k = 0;
    inicializaEstados(); // inicializan los estados
     while(indice < (int)strlen(cadena) || estadoDeAceptacion()){
         switch(estadoActual)
         {
         case 0: caracter = leerCar(indice); // lee el caracter
                 if(strchr(non,caracter))
                     estadoActual = 1;
                 else if(strchr(par,caracter))
                     estadoActual = 2;
                 else
                     fallo();
             break;

         case 1: caracter = leerCar(indice); // lee el caracter
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

         case 2: caracter = leerCar(indice); // lee el caracter
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

         case 3: retrocederCar;  // Decrementa la i en 1
             strcpy(asTokens[k++],"Num");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 4: caracter = leerCar(indice); // lee el caracter
             switch(caracter)
             {
                 case '+': estadoActual=5; break;
                 case '-': estadoActual=6; break;
                 case '*': estadoActual=7; break;
                 case '/': estadoActual=8; break;
                 default: fallo();
             }
             break;

         case 5: strcpy(asTokens[k++], "+");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 6: strcpy(asTokens[k++], "-");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 7: strcpy(asTokens[k++], "*");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 8: strcpy(asTokens[k++], "/");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;


         case 9: caracter = leerCar(indice); // lee el caracter
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

         case 10: caracter = leerCar(indice); // lee el caracter
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

         case 11 : caracter = leerCar(indice); // lee el caracter
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
         case 12: retrocederCar;  // Decrementa la i en 1
             strcpy(asTokens[k++],"Num");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 13: caracter = leerCar(indice); // lee el caracter
             if ((isalpha(caracter)|| caracter=='_'))
                 estadoActual=14;
             else
                 fallo();
             break;

         case 14: caracter = leerCar(indice); // lee el caracter
             if ((isalpha(caracter)|| caracter=='_') || isdigit(caracter))
                 estadoActual=14;
             else
                 estadoActual= 15;
             break;

         case 15: retrocederCar;  // Decrementa la i en 1
             if(esId())
                 strcpy(asTokens[k++], "Id");
             else
                 strcpy(asTokens[k++],sLexema);

             if(indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;


         case 16: caracter = leerCar(indice); // lee el caracter
             if(caracter==';')
                 estadoActual=17;
             else
                 fallo();
             break;

             /* Al encontrar el caracter ';' , que indica fin de linea,
              Se copia el caracter '$' al fin del arreglo astokens
              */
         case 17: strcpy(asTokens[k++], ";");
             strcpy(asTokens[k], "$");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 18: caracter = leerCar(indice); // lee el caracter
             if(caracter=='[')
                 estadoActual=19;
             else
                 fallo();
             break;

         case 19: strcpy(asTokens[k++], "[");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 20: caracter = leerCar(indice); // lee el caracter
             if(caracter==']')
                 estadoActual=21;
             else
                 fallo();
             break;

         case 21: strcpy(asTokens[k++], "]");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken = indice;
             inicializaEstados();
             break;

         case 22: caracter = leerCar(indice); // lee el caracter
             if(caracter == ',')
                 estadoActual=23;
             else
                 fallo();
             break;

         case 23: strcpy(asTokens[k++], ",");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 24: caracter = leerCar(indice); // lee el caracter
             if (('"' == caracter) && caracter)
                 estadoActual=25;
             else
                 fallo();
             break;

         case 25: caracter = leerCar(indice); // lee el caracter
             if (('"' != caracter) && caracter)
                 estadoActual=25;
             else
                 if(caracter)
                     estadoActual=26;
             break;

         case 26: strcpy(asTokens[k++],"Cte.Lit");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 27: caracter = leerCar(indice); // lee el caracter
             if(caracter == '(')
                 estadoActual=28;
             else
                 fallo();
             break;

         case 28: strcpy(asTokens[k++], "(");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken = indice;
             inicializaEstados();
             break;

         case 29:caracter = leerCar(indice); // lee el caracter
             if(caracter == ')')
                 estadoActual=30;
             else
                 fallo();
             break;

         case 30: strcpy(asTokens[k++], ")");
             if (indice>=(int)strlen(cadena))
                 return;
             inicioToken=indice;
             inicializaEstados();
             break;

         case 31: caracter = leerCar(indice); // lee el caracter
             if(caracter == '{')
                 estadoActual = 32;
             else
                 fallo();
             break;

         case 32: strcpy(asTokens[k++], "{");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken = indice;
             inicializaEstados();
             break;

         case 33: caracter = leerCar(indice); // lee el caracter
             if(caracter == '}')
                 estadoActual = 34;
             else
                 fallo();
             break;

         case 34: strcpy(asTokens[k++], "}");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken = indice;
             inicializaEstados();
             break;

         case 35: caracter = leerCar(indice); // lee el caracter
             if(caracter == '=')
                 estadoActual = 36;
             else
                 fallo();
             break;

         case 36: strcpy(asTokens[k++], "=");
             if (indice >= (int)strlen(cadena))
                 return;
             inicioToken = indice;
             inicializaEstados();
             break;

     case 37: caracter = leerCar(indice); // lee el caracter
         if (strchr(non,caracter))
             estadoActual = 38;
         else
             if(strchr(par,caracter))
                 estadoActual = 39;
             else
                 fallo();
         break;
     case 38: caracter = leerCar(indice); // lee el caracter
         if(strchr(non,caracter))
             estadoActual=38;
         else
             if(strchr(par,caracter))
                 estadoActual = 39;
             else
                 estadoActual=40;
         break;

     case 39: caracter = leerCar(indice); // lee el caracter
         if(strchr(non,caracter))
             estadoActual=38;
         else
             if (strchr(par,caracter))
                 estadoActual=39;
             else
                 estadoActual=40;
         break;
     case 40: retrocederCar;  // Decrementa la i en 1
         strcpy(asTokens[k++],"Real");
         if (indice >= (int)strlen(cadena))
             return;
         inicioToken=indice;
         inicializaEstados();
         break;
         }// fin switch
     }// fin while
}

void lexico::setCadena(char cadenaEntrada[255])
{
    strcpy(cadena,cadenaEntrada);
}

char *lexico::getTokens()
{
    return *asTokens;
}

void lexico::inicializaEstados()
{
    estadoInicial = estadoActual = 0;
}

void lexico::fallo()
{
    switch (estadoInicial)
    {

        case 0 : estadoInicial=4;
            indice=inicioToken;
            break;

        case 4 : estadoInicial=9;
            indice=inicioToken;
            break;

        case 9 : estadoInicial=13;
            indice=inicioToken;
            break;

        case 13 : estadoInicial=16;
            indice = inicioToken;
            break;

        case 16 : estadoInicial=18;
            indice = inicioToken;
            break;

        case 18 : estadoInicial=20;
            indice=inicioToken;
            break;

        case 20 : estadoInicial=22;
            indice = inicioToken;
            break;

        case 22 : estadoInicial=24;
            indice = inicioToken;
            break;

        case 24 : estadoInicial=27;
            indice = inicioToken;
            break;

        case 27 : estadoInicial=29;
            indice = inicioToken;
            break;

        case 29: estadoInicial = 31;
            indice = inicioToken;
            break;

        case 31: estadoInicial = 33;
            indice = inicioToken;
            break;

        case 33: estadoInicial = 35;
            indice = inicioToken;
            break;

        case 35: recuperaerror();
    }

    estadoActual=estadoInicial;
}

void lexico::recuperaerror()
{
    inicioToken = indice;
    inicializaEstados();
}

int lexico::esId()
{
    int m,found = false;
    for (m=0 ; m < NUMPALRES && !found ;)
        if (strcmp(PalRes[m], sLexema)==0)
            found = true;
        else
            m++;
    return (found ? 0 : 1);
}



