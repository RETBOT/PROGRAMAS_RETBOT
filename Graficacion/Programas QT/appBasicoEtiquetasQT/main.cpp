//como puedo rediseñar el orden de los tabs

//#include <QCoreApplication>
#include <QApplication>
#include <QLabel>
#include <QVBoxLayout>

int main(int argc, char *argv[])
{
    //QCoreApplication a(argc, argv);
    QApplication a(argc, argv);

//    QLabel ETIQUETA("TEC LAGUNA");
//    ETIQUETA.show();
//    QLabel *etiqueta = new QLabel("Tec laguna");

//    QWidget ventana;                    // se envia la referencia &
//    QVBoxLayout *layaoutPrincipal = new QVBoxLayout(&ventana);

     QWidget *ventana= new QWidget();                    // se envia la referencia &
//     QVBoxLayout *layaoutPrincipal = new QVBoxLayout(ventana);
     QHBoxLayout *layaoutPrincipal = new QHBoxLayout(ventana);

     QLabel *etiqueta = new QLabel("<h1><i><FONT SIZE=8>ETIQUETA 1, PRACTICANDO CON </FONT></i>""<font color = #ff0000>QT 5</font></h1>");

     //etiqueta->setFrameStyle(QFrame::Panel | QFrame::Raised);
     etiqueta->setFrameStyle(QFrame::Panel | QFrame::Box);

     QLabel *etiqueta2 = new QLabel("<h1><FONT SIZE=4>ETIQUETA 2, Nombre: </FONT>""<i><font color = #ff00ff><b>Roberto </b></font></i></h1>");
     etiqueta2->setAlignment(Qt::AlignBottom | Qt::AlignRight);

     QLabel *label3 = new QLabel("Etiqueta 3");
     QLabel *label4 = new QLabel("Etiqueta 4");

     layaoutPrincipal->addWidget(etiqueta);
     layaoutPrincipal->addWidget(etiqueta2);
     layaoutPrincipal->addWidget(label3);
     layaoutPrincipal->addWidget(label4);

     //etiqueta -> show();
     //ventana.resize(400,400);
     //ventana.show();

     ventana->resize(400,400);
     ventana->show();

    return a.exec();
}
