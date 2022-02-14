/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: admin
 *
 * Created on 10 de octubre de 2020, 09:35 AM
 */

#include <iostream>

using namespace std;

/*
 * 
 */
//int max(int, int);

int max(int num1, int num2) {
   // local variable declaration
   int result;
 
   if (num1 > num2)
      result = num1;
   else
      result = num2;
 
   return result; 
}

    bool esPrimo(int n){
    int div = 2; 
    while(div < n){
        if(n%div==0){
            return false;
        }
        div++;
       }
       return true;
    }

int main () {
//   // local variable declaration:
//   int a ;//= 100;
//   int b ;//= 200;
//   cout<<"Valor de a: " ; //endl; // cout es el equivalente System.out.print con endl es salto de linea es println
//   cin>>a; // en c++ no se requiere un objeto scanner(System.in)
//   cout<<"Valor de b: ";
//   cin>>b;
//   
//   int ret;
// 
//   // calling a function to get max value.
//   ret = max(a, b);
//   cout << "\n\tEl mayor de : "<<a<<" y "<< b <<" = "<< ret << endl;
 
    int numPrimos = 0;
    for(int i = 1000; i<=1500; i++){
      if(esPrimo(i))
          numPrimos++;
  }
    
    cout<<"Cant. de nums. primos entre 1000 - 1500 = "<<numPrimos<<endl; //71
//    int vmenor = 1000;
//    int vmayor = 1500;   

  int vecPrimos[numPrimos];
   for(int i = 0, vmenor = 1000, vmayor=1500; vmenor <= vmayor; vmenor++ )
   {
       if(esPrimo(vmenor))
       {
           vecPrimos[i++]= vmenor ;
          // i++;
       }
   }
   for(int i = 0; i < numPrimos; i++)
       cout<<"VecPrimos [ "<<i<<" ] = "<< vecPrimos[i]<<endl;
   
    return 0;
}
 
//// function returning the max between two numbers
//int max(int num1, int num2) {
//   // local variable declaration
//   int result;
// 
//   if (num1 > num2)
//      result = num1;
//   else
//      result = num2;
// 
//   return result; 
//}

