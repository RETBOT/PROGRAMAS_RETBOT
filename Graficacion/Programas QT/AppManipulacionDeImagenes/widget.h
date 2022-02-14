#ifndef WIDGET_H
#define WIDGET_H

#include <QWidget>
#include <QFileDialog>
#include <QLabel>
#include <QDialog>
#include <QImage>
#include <QtGlobal>

QT_BEGIN_NAMESPACE
namespace Ui { class Widget; }
QT_END_NAMESPACE


class Widget : public QWidget
{
    Q_OBJECT

public:
    Widget(QWidget *parent = nullptr);
    ~Widget() override;
     QImage modificarImagenRGB(const QImage &in);

     QString nomArch = "";
     void setNomArch(const QString &value);
     QString getNomArch() const;

private slots:
    void on_pushButAbrirImagen_clicked();
    void on_pushButModificar_clicked();


private:
    Ui::Widget *ui;

};
#endif // WIDGET_H
