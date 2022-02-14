/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: admin
 *
 * Created on 15 de octubre de 2020, 04:31 PM
 */

#include <iostream>

using namespace std;

/*
 * 
 */


int main() {
    //Inicializacon de un arreglo con valores por default 
    int vec[10] = {5,88,92,10,14,21,45,32,99,10};
    

    //determinar el menor y el mayor y el inverso del arreglo 
    int menor;
    int mayor=0;
    for(int i=0; i<10; i++){
       cout<<"vec["<<i<<"] = "<<vec[i]<<endl;
         //    cout<<"\tVec["<<i<<"] = "<<hex<<&vec[i]<<"\tValor = "<<vec[i]<<endl;
     
        if(vec[i] > mayor){
            mayor = vec[i];
        }
        if(vec[i] < menor)
            menor = vec[i];
        }       

     cout<<"Mayor = "<<mayor<<endl;
     cout<<"Menor = "<<menor<<endl;

     cout<<"\nInverso"<<endl;
     for(int i=9;i>0;i--){
         cout<<"vec["<<i<<"] = "<<vec[i]<<endl;
     }
     
     cout<<"\n\nRandom--------------"<<endl;
     int vec2[10];
     int menor2;
     int mayor2=0;
     
      for(int i=0;i<10;i++){
        vec2[i] = rand()%90+10;; 
        cout<<"Numeros random "<<i<<" = "<<vec2[i]<<endl;
    }
     
        for(int i=0;i<10;i++){
            if(vec[i] > mayor2)
            mayor2 = vec[i];
        
            if(vec[i] < menor2)
            menor2 = vec[i];
        }
     
     cout<<"Menor = "<<menor2<<endl;
     cout<<"Mayor = "<<mayor2<<endl;
     cout<<"\nInverso"<<endl;
     for(int i=9;i>0;i--){
         cout<<"vec 2["<<i<<"] = "<<vec2[i]<<endl;
     }
     
    return 0;
}



