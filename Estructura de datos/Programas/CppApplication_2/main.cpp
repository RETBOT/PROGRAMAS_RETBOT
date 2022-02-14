/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: admin
 *
 * Created on 13 de octubre de 2020, 04:15 PM
 */

#include <iostream>
#include <ctime>
#include <Math.h>

using namespace std;

/*
 * 
 */
int main() {
    

    int vec[5];
    //Inicializamos la semillad (seed) de los numeros aleatorios 
    srand((unsigned)time(NULL));
    
    for(int i=0;i<5;i++){
        vec[i] = rand()%90+10; //& proporciona la direccion de la memoria
        cout<< "Dir vec ["<<i<<"]" <<hex<<&vec[i]<<" = "<<dec<<vec[i]<<endl;
    }
    
    int *pVec = vec;//El nombre del arreglo apunta a la primer direccion en memoria
    
    for(int i=0;i<5;i++){
        cout<<"Dir pVec = "<<hex<<pVec<<i<<" = "<<dec<<*(pVec+i)<<endl;
    }
    
    cout<<"Raiz cuadrada"<<endl;
    for(int i=0; i<5;i++){
    *(pVec+i) = sqrt(*(pVec+i));
    cout<<*(pVec+i)<<endl;
    }
    return 0;
}

