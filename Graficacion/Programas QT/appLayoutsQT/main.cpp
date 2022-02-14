//#include <QCoreApplication>
#include <QAppLication>
#include <QLabel>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    QLabel etiqueta("Hola tec laguna");
    etiqueta.show();

    return a.exec();
}
