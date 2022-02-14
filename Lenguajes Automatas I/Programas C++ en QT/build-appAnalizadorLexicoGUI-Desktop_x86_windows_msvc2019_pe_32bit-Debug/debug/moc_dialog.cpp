/****************************************************************************
** Meta object code from reading C++ file 'dialog.h'
**
** Created by: The Qt Meta Object Compiler version 67 (Qt 5.15.2)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include <memory>
#include "../../appAnalisisSintacticoGUI/dialog.h"
#include <QtCore/qbytearray.h>
#include <QtCore/qmetatype.h>
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'dialog.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 67
#error "This file was generated using the moc from 5.15.2. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
QT_WARNING_PUSH
QT_WARNING_DISABLE_DEPRECATED
struct qt_meta_stringdata_Dialog_t {
    QByteArrayData data[20];
    char stringdata0[239];
};
#define QT_MOC_LITERAL(idx, ofs, len) \
    Q_STATIC_BYTE_ARRAY_DATA_HEADER_INITIALIZER_WITH_OFFSET(len, \
    qptrdiff(offsetof(qt_meta_stringdata_Dialog_t, stringdata0) + ofs \
        - idx * sizeof(QByteArrayData)) \
    )
static const qt_meta_stringdata_Dialog_t qt_meta_stringdata_Dialog = {
    {
QT_MOC_LITERAL(0, 0, 6), // "Dialog"
QT_MOC_LITERAL(1, 7, 27), // "on_pushButConvertir_clicked"
QT_MOC_LITERAL(2, 35, 0), // ""
QT_MOC_LITERAL(3, 36, 23), // "on_pushButAbrir_clicked"
QT_MOC_LITERAL(4, 60, 24), // "on_pushButBorrar_clicked"
QT_MOC_LITERAL(5, 85, 25), // "on_pushButGuardar_clicked"
QT_MOC_LITERAL(6, 111, 17), // "inicializaEstados"
QT_MOC_LITERAL(7, 129, 5), // "fallo"
QT_MOC_LITERAL(8, 135, 18), // "estadoDeAceptacion"
QT_MOC_LITERAL(9, 154, 4), // "esId"
QT_MOC_LITERAL(10, 159, 13), // "recuperaerror"
QT_MOC_LITERAL(11, 173, 11), // "insertapila"
QT_MOC_LITERAL(12, 185, 6), // "string"
QT_MOC_LITERAL(13, 192, 4), // "elem"
QT_MOC_LITERAL(14, 197, 7), // "estoken"
QT_MOC_LITERAL(15, 205, 6), // "char[]"
QT_MOC_LITERAL(16, 212, 1), // "x"
QT_MOC_LITERAL(17, 214, 11), // "eliminapila"
QT_MOC_LITERAL(18, 226, 10), // "buscaTabla"
QT_MOC_LITERAL(19, 237, 1) // "a"

    },
    "Dialog\0on_pushButConvertir_clicked\0\0"
    "on_pushButAbrir_clicked\0"
    "on_pushButBorrar_clicked\0"
    "on_pushButGuardar_clicked\0inicializaEstados\0"
    "fallo\0estadoDeAceptacion\0esId\0"
    "recuperaerror\0insertapila\0string\0elem\0"
    "estoken\0char[]\0x\0eliminapila\0buscaTabla\0"
    "a"
};
#undef QT_MOC_LITERAL

static const uint qt_meta_data_Dialog[] = {

 // content:
       8,       // revision
       0,       // classname
       0,    0, // classinfo
      13,   14, // methods
       0,    0, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       0,       // signalCount

 // slots: name, argc, parameters, tag, flags
       1,    0,   79,    2, 0x08 /* Private */,
       3,    0,   80,    2, 0x08 /* Private */,
       4,    0,   81,    2, 0x08 /* Private */,
       5,    0,   82,    2, 0x08 /* Private */,
       6,    0,   83,    2, 0x08 /* Private */,
       7,    0,   84,    2, 0x08 /* Private */,
       8,    0,   85,    2, 0x08 /* Private */,
       9,    0,   86,    2, 0x08 /* Private */,
      10,    0,   87,    2, 0x08 /* Private */,
      11,    1,   88,    2, 0x08 /* Private */,
      14,    1,   91,    2, 0x08 /* Private */,
      17,    0,   94,    2, 0x08 /* Private */,
      18,    2,   95,    2, 0x08 /* Private */,

 // slots: parameters
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Bool,
    QMetaType::Int,
    QMetaType::Void,
    QMetaType::Void, 0x80000000 | 12,   13,
    QMetaType::Int, 0x80000000 | 15,   16,
    QMetaType::Void,
    QMetaType::Int, 0x80000000 | 15, 0x80000000 | 15,   19,   16,

       0        // eod
};

void Dialog::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        auto *_t = static_cast<Dialog *>(_o);
        Q_UNUSED(_t)
        switch (_id) {
        case 0: _t->on_pushButConvertir_clicked(); break;
        case 1: _t->on_pushButAbrir_clicked(); break;
        case 2: _t->on_pushButBorrar_clicked(); break;
        case 3: _t->on_pushButGuardar_clicked(); break;
        case 4: _t->inicializaEstados(); break;
        case 5: _t->fallo(); break;
        case 6: { bool _r = _t->estadoDeAceptacion();
            if (_a[0]) *reinterpret_cast< bool*>(_a[0]) = std::move(_r); }  break;
        case 7: { int _r = _t->esId();
            if (_a[0]) *reinterpret_cast< int*>(_a[0]) = std::move(_r); }  break;
        case 8: _t->recuperaerror(); break;
        case 9: _t->insertapila((*reinterpret_cast< string(*)>(_a[1]))); break;
        case 10: { int _r = _t->estoken((*reinterpret_cast< char(*)[]>(_a[1])));
            if (_a[0]) *reinterpret_cast< int*>(_a[0]) = std::move(_r); }  break;
        case 11: _t->eliminapila(); break;
        case 12: { int _r = _t->buscaTabla((*reinterpret_cast< char(*)[]>(_a[1])),(*reinterpret_cast< char(*)[]>(_a[2])));
            if (_a[0]) *reinterpret_cast< int*>(_a[0]) = std::move(_r); }  break;
        default: ;
        }
    }
}

QT_INIT_METAOBJECT const QMetaObject Dialog::staticMetaObject = { {
    QMetaObject::SuperData::link<QDialog::staticMetaObject>(),
    qt_meta_stringdata_Dialog.data,
    qt_meta_data_Dialog,
    qt_static_metacall,
    nullptr,
    nullptr
} };


const QMetaObject *Dialog::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->dynamicMetaObject() : &staticMetaObject;
}

void *Dialog::qt_metacast(const char *_clname)
{
    if (!_clname) return nullptr;
    if (!strcmp(_clname, qt_meta_stringdata_Dialog.stringdata0))
        return static_cast<void*>(this);
    return QDialog::qt_metacast(_clname);
}

int Dialog::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QDialog::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 13)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 13;
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        if (_id < 13)
            *reinterpret_cast<int*>(_a[0]) = -1;
        _id -= 13;
    }
    return _id;
}
QT_WARNING_POP
QT_END_MOC_NAMESPACE
